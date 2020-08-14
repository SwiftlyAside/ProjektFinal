<template>
  <v-container>
    <a v-bind:href="home"></a>
    <v-list shaped>
      <v-subheader>Products</v-subheader>
      <v-list-item-group>
        <v-list-item :key="i" v-for="(item, i) in items">
          <v-list-item-content>
            <v-list-item-title v-text="item.productName"></v-list-item-title>
            <v-list-item-subtitle v-text="item.price + '원'"></v-list-item-subtitle>
          </v-list-item-content>
        </v-list-item>
      </v-list-item-group>
    </v-list>
  </v-container>
</template>

<script>
import axios from 'axios';

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
  mounted() {
    axios.get('/product/selectTest')
      .then((response) => {
        this.items = response.data;
      })
      .catch((error) => {
        console.log(error);
      });
  },
};
</script>

<style scoped>

</style>
