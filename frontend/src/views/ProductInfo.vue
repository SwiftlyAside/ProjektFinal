<template>
  <v-container>
    <a :href="home" />
    <v-list shaped>
      <v-subheader>Products</v-subheader>
      <v-list-item-group>
        <v-list-item
          v-for="(item, i) in items"
          :key="i"
        >
          <v-list-item-content>
            <v-list-item-title v-text="item.productName" />
            <v-list-item-subtitle v-text="item.price + '원'" />
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
    axios.get('/product/all')
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
