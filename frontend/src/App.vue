<template>
  <v-app>
    <v-app-bar
      app
      color="primary"
      dark
    >
      <v-btn @click="fetchData">데이터 수신</v-btn>
      <v-btn @click="setSessionStorage">세션 세팅</v-btn>

      <div class="d-flex align-center">
        <h1 v-if="man.length > 0">{{ man[5].categoryName }}</h1>
      </div>

      <v-spacer></v-spacer>

      <v-btn
        href="https://github.com/vuetifyjs/vuetify/releases/latest"
        target="_blank"
        text
      >
        <span class="mr-2">마이페이지</span>
        <v-icon>mdi-open-in-new</v-icon>
      </v-btn>
    </v-app-bar>

    <v-main>
      <product-info/>
    </v-main>
  </v-app>
</template>

<script>
import axios from 'axios';
import ProductInfo from './components/ProductInfo.vue';

export default {
  name: 'App',

  components: {
    ProductInfo,
  },

  data() {
    return {
      man: '',
    };
  },
  methods: {
    setSessionStorage() {
      sessionStorage.setItem('value', 'SSD');
    },
    fetchData() {
      axios.get('/product/getCategories')
        .then((response) => {
          this.man = response.data;
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
};
</script>
