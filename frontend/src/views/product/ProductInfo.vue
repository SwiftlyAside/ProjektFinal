<template>
  <v-container>
    <v-card
      class="mx-auto my-12"
      min-width="800"
      width="60vw"
    >
      <v-card-title><h2>상품 관리</h2></v-card-title>
      <v-divider />
      <v-list shaped>
        <v-list-item-group>
          <v-list-item
            v-for="(item, i) in items"
            :key="i"
            @click="routeToDetails(item)"
          >
            <v-list-item-content>
              <v-row>
                <v-col cols="1">
                  <v-img
                    :src="'https://static.thenounproject.com/png/2794297-200.png'"
                    :lazy-src="'https://static.thenounproject.com/png/2794297-200.png'"
                    aspect-ratio="1"
                    max-height="100"
                    max-width="100"
                  />
                </v-col>
                <v-col cols="10">
                  <v-list-item-title v-text="item.productName" />
                  <v-list-item-subtitle v-text="numberWithCommas(item.price) + '원'" />
                </v-col>
              </v-row>
            </v-list-item-content>
            <v-list-item-action>
              <v-btn @click.prevent="">
                수정
              </v-btn>
              <v-btn @click.prevent="">
                삭제
              </v-btn>
            </v-list-item-action>
          </v-list-item>
        </v-list-item-group>
      </v-list>
    </v-card>
  </v-container>
</template>

<script>
import axios from 'axios';

const empty = (value) => {
  if (value === null) return true;
  if (typeof value === 'undefined') return true;
  if (typeof value === 'string' && value === '') return true;
  if (Array.isArray(value) && value.length < 1) return true;
  if (typeof value === 'object' && value.constructor.name === 'Object' && Object.keys(value).length < 1 && Object.getOwnPropertyNames(value) < 1) return true;
  if (typeof value === 'object' && value.constructor.name === 'String' && Object.keys(value).length < 1) return true;
  return false;
};

export default {
  name: 'ProductInfo',
  data() {
    return {
      home: '/',
      items: [
        {
          pid: '0',
          productName: 'blank',
          price: 500,
          saleRate: null,
        },
      ],
    };
  },
  watch: {
    $route: 'fetchData',
  },
  mounted() {
    if (empty(this.$route.params.data)) {
      axios.get('/product/all')
        .then((response) => {
          this.items = response.data;
        })
        .catch((error) => {
          console.log(error);
        });
    } else {
      this.fetchData();
    }
  },
  methods: {
    numberWithCommas(x) {
      return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',');
    },
    fetchData() {
      this.items = this.$route.params.data;
    },
    routeToDetails(item) {
      this.$router.push({ name: 'ProductDetails', params: { data: item } });
    },
  },
};
</script>

<style scoped>

</style>
