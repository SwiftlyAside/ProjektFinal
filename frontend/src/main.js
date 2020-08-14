import Vue from 'vue';
import './plugins/axios';
import Axios from 'axios';
import App from './App1.vue';
import vuetify from './plugins/vuetify';
import router from './router';

Vue.config.productionTip = false;
Vue.prototype.$http = Axios;

new Vue({
  vuetify,
  router,
  render: (h) => h(App),
}).$mount('#app');
