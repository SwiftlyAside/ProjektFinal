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
    path: '/userCart',
    name: 'FindMember',
    component: () => import('../views/purchase/userCart'),
  },
  {
    path: '/myPage/reviewInfo',
    name: 'ReviewInfo',
    component: () => import('../views/myPage/ModifyMembership'),
  },
  {
    path: '/myPage/modifyInfo',
    name: 'ModifyInfo',
    component: () => import('../views/myPage/ModifyMembership'),
  },
  {
    path: '/myPage/orderInfo',
    name: 'OrderInfo',
    component: () => import('../views/myPage/ModifyMembership'),
  },
  {
    path: '/myPage/bookmarkInfo',
    name: 'BookmarkInfo',
    component: () => import('../views/myPage/ModifyMembership'),
  },
  {
    path: '/myPage/inquireInfo',
    name: 'InquireInfo',
    component: () => import('../views/myPage/ModifyMembership'),
  },
  {
    path: '/myPage/reviewInfo',
    name: 'ReviewInfo',
    component: () => import('../views/myPage/ModifyMembership'),
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
