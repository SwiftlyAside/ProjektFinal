import Vue from 'vue';
import './plugins/axios';
import '@mdi/font/css/materialdesignicons.css' // Ensure you are using css-loader
import App from './App.vue';
import vuetify from './plugins/vuetify';

Vue.config.productionTip = false;

new Vue({
  vuetify,
  render: (h) => h(App),
}).$mount('#app');
