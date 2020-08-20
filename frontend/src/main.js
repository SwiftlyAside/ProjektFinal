import Vue from 'vue';
import './plugins/axios';
import Axios from 'axios';
import App from './App.vue';
import vuetify from './plugins/vuetify';
import router from './router';

Vue.prototype.$http = Axios;
Vue.config.productionTip = false;

new Vue({
  vuetify,
  router,
  render: (h) => h(App),
}).$mount('#app');
