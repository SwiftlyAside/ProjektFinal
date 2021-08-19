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
              <v-list-item-subtitle>
                <v-row>
                  <v-col cols="5">
                    {{ cart.id }}
                  </v-col>
                  <v-col class="text-right">
                    {{ cart.price + '원' }}
                  </v-col>
                </v-row>
              </v-list-item-subtitle>
              <v-list-item-subtitle align="right">
                <v-btn>
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
      map.id = '900000000011000';
      map.name = '인텔 제온 스케일러블 골드 5218 (캐스케이드레이크) (정품)';
      map.price = '2,016,420';
      lst.push(map);

      map = {};
      map.id = '900000007136792';
      map.name = 'AMD EPYC 7702 (롬) (정품)';
      map.price = '12,867,140';
      lst.push(map);

      localStorage.setItem('shoppingCart', JSON.stringify(lst));

      return JSON.parse(localStorage.getItem('shoppingCart'));
    },
  },
};
</script>
