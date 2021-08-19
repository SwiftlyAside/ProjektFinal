<template>
  <v-container>
    <v-card>
      <v-card-title>
        <v-row>
          <v-col>
            <v-card>
              <v-card-title
                class="primary white--text justify-center"
              >
                결제완료
              </v-card-title>
              <v-card-text class="orderState text-center mt-2">
                <h1>{{ items.length }}건</h1>
              </v-card-text>
            </v-card>
          </v-col>
          <v-col>
            <v-card>
              <v-card-title
                class="primary white--text justify-center"
              >
                배송중
              </v-card-title>
              <v-card-text class="orderState text-center mt-2">
                <h1>0건</h1>
              </v-card-text>
            </v-card>
          </v-col>
          <v-col>
            <v-card>
              <v-card-title
                class="primary white--text justify-center"
              >
                배송완료
              </v-card-title>
              <v-card-text class="orderState text-center mt-2">
                <h1>0건</h1>
              </v-card-text>
            </v-card>
          </v-col>
          <v-col>
            <v-card>
              <v-card-title
                class="primary white--text justify-center"
              >
                거래완료
              </v-card-title>
              <v-card-text class="orderState text-center mt-2">
                <h1>0건</h1>
              </v-card-text>
            </v-card>
          </v-col>
        </v-row>
      </v-card-title>
      <v-row>
        <v-col>
          <v-divider />
        </v-col>
      </v-row>
      <v-list shaped>
        <v-list-item class="justify-center">
          <h2>구매목록</h2>
        </v-list-item>
        <v-list-item-group>
          <v-list-item
            v-for="(item, i) in items"
            :key="i"
          >
            <v-list-item-content>
              <v-row>
                <v-col cols="10">
                  <v-list-item-title v-text="item.productName" />
                  <v-list-item-subtitle v-text="item.price + '원'" />
                </v-col>
                <v-btn width="160">
                  거래완료/리뷰작성
                </v-btn>
              </v-row>
              <v-row>
                <v-col cols="10" />
                <v-btn width="160">
                  환불
                </v-btn>
              </v-row>
            </v-list-item-content>
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
  name: 'OrderInfo',
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
    fetchData() {
      this.items = this.$route.params.data;
    },
  },
};
</script>
