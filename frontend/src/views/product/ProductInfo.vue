<template>
  <v-container>
    <v-card
      class="mx-auto my-12"
      min-width="800"
      width="60vw"
    >
      <v-card-title><h2>Products</h2></v-card-title>
      <v-list shaped>
        <v-list-item-group>
          <v-list-item
            v-for="(item, i) in items"
            :key="i"
            @click="routeToDetails(item)"
          >
            <v-list-item-content>
              <v-list-item-title v-text="item.productName" />
              <v-list-item-subtitle v-text="item.price + '원'" />
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
