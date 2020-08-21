<template>
  <v-container
    class="grey lighten-5 fill-height"
    justify-center
  >
    <v-card
      class="mx-auto my-12"
      width="800"
    >
      <v-card-title><h3>상품등록</h3></v-card-title>
      <v-card-text>
        <form>
          <ValidationObserver>
            <ValidationProvider
              v-slot="{ errors }"
              name="상품명"
              rules="required|max:50"
            >
              <v-text-field
                v-model="product.productName"
                :counter="50"
                :error-messages="errors"
                label="상품명"
                required
              />
            </ValidationProvider>
            <ValidationProvider
              v-slot="{ errors }"
              name="상품가격"
              rules="required|max:10"
            >
              <v-text-field
                v-model="product.price"
                type="number"
                :counter="10"
                :error-messages="errors"
                label="상품가격"
                placeholder="0"
                prefix="₩"
                required
              />
            </ValidationProvider>
            <v-divider />

            <v-card-subtitle><h3>분류 선택</h3></v-card-subtitle>

            <v-chip-group
              v-model="selection"
              active-class="orange--text text--accent-4"
              column
              mandatory
            >
              <v-skeleton-loader
                v-if="loading"
                type="chip"
              />
              <v-chip
                v-for="category in categories"
                v-else
                :key="category.categoryId"
                :value="category.categoryName"
                @click="setId(category.categoryId)"
              >
                {{ category.categoryName }}
              </v-chip>
            </v-chip-group>
            <v-file-input
              accept="image/*"
              show-size
              label="대표 이미지"
            />
            <v-file-input
              accept="image/*"
              show-size
              label="상세 이미지"
            />
            <v-divider />
            <v-card-subtitle><h3>상품 옵션</h3></v-card-subtitle>
            <v-card-actions>
              <v-text-field
                v-model="newOption.optionName"
                label="옵션 이름"
              /><v-text-field
                v-model="newOption.optionAddPrice"
                prefix="₩"
                label="옵션 추가가격"
              /><v-btn
                icon
                @click="addOption"
              >
                <v-icon>add</v-icon>
              </v-btn>
            </v-card-actions>
            <v-list>
              <v-list-item
                v-for="item in productOptions"
                :key="item.optionId"
              >
                <v-list-item-action>
                  <v-text-field
                    v-model="item.ea"
                    label="수량"
                  />
                </v-list-item-action>
                <v-list-item-title
                  v-text="item.optionName + ' (+ ₩'+ item.optionAddPrice +')'"
                />
                <v-list-item-action>
                  <v-btn
                    icon
                    :disabled="item.disabled"
                    @click="removeOption(item.optionId)"
                  >
                    <v-icon>
                      delete
                    </v-icon>
                  </v-btn>
                </v-list-item-action>
              </v-list-item>
            </v-list>
          </ValidationObserver>
          <v-card-actions>
            <v-btn
              type="submit"
              @click.prevent="addProduct"
            >
              상품등록
            </v-btn>
            <v-btn @click="clear">
              취소
            </v-btn>
            <v-snackbar
              v-model="snackbar"
              :timeout="timeout"
            >
              {{ text }}
            </v-snackbar>
          </v-card-actions>
        </form>
      </v-card-text>
    </v-card>
  </v-container>
</template>

<script>
import { required, max } from 'vee-validate/dist/rules';
import {
  extend, ValidationObserver, ValidationProvider,
} from 'vee-validate';
import axios from 'axios';

extend('required', {
  ...required,
  message: '{_field_}을 입력해주세요.',
});

extend('max', {
  ...max,
  message: '{_field_} 길이는 {length}자를 초과할 수 없습니다.',
});

export default {
  name: 'Product',
  components: {
    ValidationObserver,
    ValidationProvider,
  },
  data() {
    return {
      loading: true,
      product: {
        productName: '',
        categoryId: null,
        productImage: null,
        price: null,
      },
      newOption: {
        optionName: '',
        optionAddPrice: 0,
      },
      productOptions: [{
        optionId: 0,
        ea: 99,
        optionName: '기본 옵션',
        optionAddPrice: 0,
        disabled: true,
      }],
      selection: null,
      isExist: true,
      categories: [],
      snackbar: false,
      text: '',
      messages: {
        addOptionMessage: '옵션이 추가되었습니다.',
        addProductMessage: '상품등록이 완료되었습니다.',
      },
      timeout: 3000,
    };
  },
  mounted() {
    axios.get('/product/categories')
      .then((response) => {
        this.categories = response.data;
        this.loading = false;
      })
      .catch((error) => {
        console.log(error);
      });
  },
  methods: {
    setId(categoryId) {
      this.product.categoryId = categoryId;
    },
    addOption() {
      this.productOptions.push({
        optionId: this.productOptions[this.productOptions.length - 1].optionId + 1,
        ea: 99,
        optionName: this.newOption.optionName,
        optionAddPrice: this.newOption.optionAddPrice,
        disabled: false,
      });
      this.newOption.optionName = '';
      this.newOption.optionAddPrice = 0;
      this.text = this.messages.addOptionMessage;
      this.snackbar = true;
    },
    removeOption(index) {
      const idx = this.productOptions.findIndex((item) => item.optionId === index);
      if (idx > -1) this.productOptions.splice(idx, 1);
    },
    isExistProduct(productName) {
      axios.get(`/product/isExistProduct?productName=${productName}`)
        .then((response) => response.data)
        .catch(() => true);
      return true;
    },
    addProduct() {
      axios.post('/product/', {
        pid: null,
        categoryId: this.product.categoryId,
        productImage: null,
        productName: this.product.productName,
        ea: this.productOptions[0].ea,
        price: this.product.price,
        saleRate: 0,
      }).then((response) => {
        if (response.data === true) {
          this.text = this.messages.addProductMessage;
          this.snackbar = true;
        }
      });
      return false;
    },
    clear() {
      this.productName = '';
      this.price = '';
      this.selection = null;
      this.isExist = true;
      this.$refs.observer.reset();
    },
  },
};
</script>

<style scoped>

</style>
