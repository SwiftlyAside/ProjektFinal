<template>
  <v-app>
    <v-app-bar
      app
      color="primary"
      dark
    >
      <v-btn @click="fetchData"/>
      <v-btn @click="setSessionStorage">세션 세팅</v-btn>

      <div class="d-flex align-center">
        <v-img
          alt="Vuetify Logo"
          class="shrink mr-2"
          contain
          src="https://cdn.vuetifyjs.com/images/logos/vuetify-logo-dark.png"
          transition="scale-transition"
          width="40"
        />
        <h1 v-if="man.length > 0">{{ man[5].categoryName }}</h1>
        <v-img
          alt="Vuetify Name"
          class="shrink mt-1 hidden-sm-and-down"
          contain
          min-width="100"
          src="https://cdn.vuetifyjs.com/images/logos/vuetify-name-dark.png"
          width="100"
        />
      </div>

      <v-spacer></v-spacer>

      <v-btn
        href="https://github.com/vuetifyjs/vuetify/releases/latest"
        target="_blank"
        text
      >
        <span class="mr-2">Latest Release</span>
        <v-icon>mdi-open-in-new</v-icon>
      </v-btn>
    </v-app-bar>

    <v-main>
      <HelloWorld/>
    </v-main>
  </v-app>
</template>

<script>
import axios from 'axios';
import HelloWorld from './components/HelloWorld.vue';

export default {
  name: 'App',

  components: {
    HelloWorld,
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
