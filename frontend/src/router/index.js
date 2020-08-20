import Vue from 'vue';
import VueRouter from 'vue-router';
import goTo from 'vuetify/es5/services/goto';
import Home from '../views/Home.vue';

Vue.use(VueRouter);

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home,
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue'),
  },
  {
    path: '/login',
    name: 'Login',
    component: () => import('../views/Membership'),
  },
  {
    path: '/product',
    name: 'Product',
    component: () => import('../views/product/Product'),
  },
  {
    path: '/productInfo',
    name: 'ProductInfo',
    component: () => import('../views/product/ProductInfo'),
  },
  {
    path: '/product_details',
    name: 'ProductDetails',
    component: () => import('../views/product/ProductDetails'),
  },
  {
    path: '/member/findMember',
    name: 'FindMember',
    component: () => import('../views/membership/findMember'),
  },
  {
    path: '/userCart',
    name: 'UserCart',
    component: () => import('../views/purchase/userCart'),
  },
];

const router = new VueRouter({
  scrollBehavior: (to, from, savedPosition) => {
    let scrollTo = 0;

    if (to.hash) {
      scrollTo = to.hash;
    } else if (savedPosition) {
      scrollTo = savedPosition.y;
    }

    return goTo(scrollTo);
  },
  routes,
});

export default router;
