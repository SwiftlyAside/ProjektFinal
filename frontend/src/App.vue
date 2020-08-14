<template>
  <v-app id="keep">
    <v-app-bar
      app
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
        flat
        hide-details
        label="상품 검색"
        prepend-inner-icon="search"
        solo-inverted
      />

      <v-spacer />
      <v-btn text>
        마이페이지
      </v-btn>
      <v-btn text>
        장바구니
      </v-btn>
      <v-btn
        text
        to="/login"
      >
        로그인
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
            <v-col
              class="text-right"
              cols="6"
            >
              <v-btn
                to="/product"
                small
                text
              >
                상품등록
              </v-btn>
            </v-col>
            <v-col
              class="text-right"
              cols="6"
            >
              <v-btn
                to="/productInfo"
                small
                text
              >
                상품 리스트
              </v-btn>
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
export default {
  props: {
    source: String,
  },
  data: () => ({
    drawer: null,
    items: [
      { icon: 'lightbulb_outline', text: 'Notes' },
      { icon: 'touch_app', text: 'Reminders' },
      { divider: true },
      { heading: 'Labels' },
      { icon: 'add', text: 'Create new label' },
      { divider: true },
      { icon: 'archive', text: 'Archive' },
      { icon: 'delete', text: 'Trash' },
      { divider: true },
      { icon: 'settings', text: 'Settings' },
      { icon: 'chat_bubble', text: 'Trash' },
      { icon: 'help', text: 'Help' },
      { icon: 'phonelink', text: 'App downloads' },
      { icon: 'keyboard', text: 'Keyboard shortcuts' },
    ],
  }),
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
