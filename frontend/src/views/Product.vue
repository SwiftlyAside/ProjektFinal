<template>
  <v-container
    class="grey lighten-5 fill-height"
    justify-center
  >
    <v-card
      class="mx-auto my-12"
      width="400"
    >
      <v-card-title><h4>상품등록</h4></v-card-title>
      <v-card-text>
        <form>
          <ValidationObserver>
            <ValidationProvider
              v-slot="{ errors }"
              name="상품명"
              rules="required|max:50"
            >
              <v-text-field
                v-model="productName"
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
                v-model="productPrice"
                type="number"
                :counter="10"
                :error-messages="errors"
                label="상품가격"
                placeholder="0"
                prefix="₩"
                required
              />
            </ValidationProvider>
            <span class="subheading">분류 선택</span>

            <v-chip-group
              v-model="selection"
              active-class="orange--text text--accent-4"
              column
              mandatory
            >
              <v-chip
                v-for="category in categories"
                :key="category.categoryId"
                :value="category.categoryName"
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
            <v-text-field /><v-text-field />
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
  message: '{_field_} 길이는 50자를 초과할 수 없습니다.',
});

export default {
  name: 'Product',
  components: {
    ValidationObserver,
    ValidationProvider,
  },
  data() {
    return {
      productName: '',
      productPrice: '',
      productOptions: [{
        optionId: 0,
        optionName: '기본 옵션',
        optionAddPrice: 0,
      }],
      selection: null,
      isExist: true,
      categories: [],
      snackbar: false,
      text: '상품등록이 완료되었습니다.',
      timeout: 3000,
    };
  },
  mounted() {
    axios.get('/product/categories')
      .then((response) => {
        this.categories = response.data;
      })
      .catch((error) => {
        console.log(error);
      });
  },
  methods: {
    isExistProduct(productName) {
      axios.get(`/product/isExistProduct?productName=${productName}`)
        .then((response) => {
          console.log(response.data);
          return response.data;
        })
        .catch(() => true);
      return true;
    },
    addProduct() {
      console.log(this.productName);
      console.log(this.selection);
      console.log('들왔습니다.');
      this.snackbar = true;
      return false;
    },
    clear() {
      this.productName = '';
      this.productPrice = '';
      this.selection = null;
      this.isExist = true;
      this.$refs.observer.reset();
    },
  },
};
</script>

<style scoped>

</style>
