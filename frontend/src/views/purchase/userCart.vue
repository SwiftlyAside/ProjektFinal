<template>
  <v-container
    class="grey lighten-5 fill-height"
    justify-center
  >
    <v-card
      class="mx-auto my-12"
      width="800"
    >
      <v-card-title><h3>Shopping Carts</h3></v-card-title>
      <v-list shaped>
        <v-list-item-group>
          <v-list-item
            v-for="(cart, i) in settingCart()"
            :key="i"
          >
            <v-list-item-content>
              <v-list-item-title v-text="cart.name" />
              <v-list-item-subtitle v-text="cart.price + '원'" />
              <v-list-item-subtitle align="right">
                <v-btn text>
                  삭제
                </v-btn>
              </v-list-item-subtitle>
            </v-list-item-content>
          </v-list-item>
        </v-list-item-group>
      </v-list>
    </v-card>
  </v-container>
</template>

<script>
export default {
  name: 'ShoppingCart',
  methods: {
    settingCart() {
      const lst = [];

      let map = {};
      map.id = '001';
      map.name = '마티스';
      map.price = '299,000';
      lst.push(map);

      map = {};
      map.id = '002';
      map.name = '마티스2';
      map.price = '199,000';
      lst.push(map);

      localStorage.setItem('shoppingCart', JSON.stringify(lst));

      return JSON.parse(localStorage.getItem('shoppingCart'));
    },
  },
};
</script>
