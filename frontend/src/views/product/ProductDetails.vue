<template>
  <v-card
    class="mx-auto my-12"
    min-width="800"
    width="60vw"
  >
    <v-card-title><h2>{{ productName }}</h2></v-card-title>
    <v-card-text>{{ price }}WON</v-card-text>
  </v-card>
</template>

<script>
function numberWithCommas(x) {
  return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ',');
}

export default {
  name: 'ProductDetails',
  data() {
    return {
      productName: '',
      categoryId: 0,
      productImage: null,
      price: 0,
    };
  },
  watch: {
    $route: 'receiveData',
  },
  mounted() {
    this.receiveData();
  },
  methods: {
    receiveData() {
      const received = this.$route.params.data;
      this.productName = received.productName;
      this.categoryId = received.categoryId;
      this.productImage = received.productImage;
      this.price = numberWithCommas(received.price);
    },
  },
};
</script>

<style scoped>

</style>
