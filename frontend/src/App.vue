<template>
  <v-app id="keep">
    <v-app-bar
      app
      color="accent"
      clipped-left
    >
      <v-app-bar-nav-icon @click="drawer = !drawer" />
      <v-btn
        text
        to="/"
        class="title ml-3 mr-5"
      >
        Acorn&nbsp;전자상가
      </v-btn>
      <v-text-field
        v-model="searchKeyword"
        flat
        hide-details
        label="상품 검색"
        prepend-inner-icon="search"
        solo-inverted
        @keyup.enter="getProduct()"
      />

      <v-spacer />
      <v-btn text>
        마이페이지
      </v-btn>
      <v-btn
        text
        to="/userCart"
      >
        장바구니
      </v-btn>
      <v-btn
        text
        to="/login"
      >
        로그인
      </v-btn>
      <v-btn
        icon
        to="/admin"
      >
        <v-icon>settings</v-icon>
      </v-btn>
    </v-app-bar>

    <v-navigation-drawer
      v-model="drawer"
      app
      clipped
      color="grey lighten-4"
    >
      <v-list
        class="grey lighten-4"
        dense
      >
        <template v-for="(item, i) in items">
          <v-row
            v-if="item.heading"
            :key="i"
            align="center"
          >
            <v-col cols="6">
              <v-subheader v-if="item.heading">
                {{ item.heading }}
              </v-subheader>
            </v-col>
          </v-row>
          <v-divider
            v-else-if="item.divider"
            :key="i"
            class="my-4"
            dark
          />
          <v-list-item
            v-else
            :key="i"
            link
            :to="item.link"
          >
            <v-list-item-action>
              <v-icon>{{ item.icon }}</v-icon>
            </v-list-item-action>
            <v-list-item-content>
              <v-list-item-title class="grey--text">
                {{ item.text }}
              </v-list-item-title>
            </v-list-item-content>
          </v-list-item>
        </template>
      </v-list>
    </v-navigation-drawer>

    <v-main>
      <router-view />
    </v-main>
  </v-app>
</template>

<script>
import axios from 'axios';

export default {
  props: {
    source: String,
  },
  data: () => ({
    drawer: null,
    searchKeyword: '',
    items: [
      { heading: '상품 관리' },
      { icon: 'list', text: '상품목록', link: '/productInfo' },
      { icon: 'add', text: '상품등록', link: '/product' },
      { divider: true },
      { heading: '판매' },
      { icon: 'attach_money', text: '결제 정보 확인', link: '/purchases' },
      { icon: 'money_off', text: '환불 정보 확인', link: '/refunds' },
      { divider: true },
      { heading: '정산' },
      { icon: 'multiline_chart', text: '기간별 정산', link: '/financials' },
      { divider: true },
      { heading: '사이트 관리' },
      { icon: 'contact_support', text: '문의 내용 확인', link: '/contacts' },
      { icon: 'design_services', text: '상품 메뉴 관리', link: '/layout' },
    ],
    mypage_items: [
      { heading: '내 정보' },
      { icon: 'perm_identity', text: '[아이디]', link: '/myPage/modifyInfo' },
      { heading: '주문/조회' },
      { icon: 'local_shipping', text: '주문/배송조회', link: '/myPage/orderInfo' },
      { icon: 'receipt', text: '현금영수증/세금계산서', link: '' },
      { heading: '나의 활동 내역' },
      { icon: 'favorite', text: '찜목록', link: '/myPage/bookmarkInfo' },
      { icon: 'email', text: '문의내용', link: '/myPage/inquireInfo' },
      { icon: '', text: '제품리뷰', link: '/myPage/reviewInfo' },
    ],
  }),
  methods: {
    getProduct() {
      axios.get(`/product/by_name?productName=${this.searchKeyword}`).then((response) => {
        this.$router.push('/');
        this.$router.push({ name: 'ProductInfo', params: { data: response.data } });
      });
    },
  },
};
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Nanum+Gothic:wght@400;700;800&display=swap');

#keep .v-navigation-drawer__border {
  display: none
}

.application {
  font-family: "Roboto", 'Nanum Gothic', sans-serif;
}

</style>
