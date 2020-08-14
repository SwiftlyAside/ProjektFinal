<template>
  <v-container
    class="grey lighten-5 fill-height"
    justify-center
  >
    <v-card
      class="mx-auto my-12"
      width="400"
    >
      <v-card-title>상품등록</v-card-title>
      <v-card-text>
        <ValidationObserver>
          <ValidationProvider
            v-slot="{ errors }"
            name="상품명"
            rules="required"
          >
            <v-text-field
              v-model="productName"
              :counter="10"
              :error-messages="errors"
              label="상품명"
              required
            />
          </ValidationProvider>
        </ValidationObserver>
      </v-card-text>
      <v-card-actions>
        <v-btn>상품등록</v-btn>
      </v-card-actions>
    </v-card>
  </v-container>
</template>

<script>
import { required } from 'vee-validate/dist/rules';
import {
  extend, ValidationObserver, ValidationProvider,
} from 'vee-validate';

extend('required', {
  ...required,
  message: '{_field_}을 입력해주세요.',
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
      isExist: true,
    };
  },
  methods: {
    isExistProduct(productName) {
      this.$http.get(`/product/isExistProduct?productName=${productName}`)
        .then((response) => {
          console.log(response.data);
          return response.data;
        })
        .catch(() => true);
      return true;
    },
  },
};
</script>

<style scoped>

</style>
