<template>
  <v-container>
    <v-card
      class="mx-auto my-12"
      min-width="400"
      width="60vw"
    >
      <v-card-title class="justify-center">
        <h2>Profile</h2>
      </v-card-title>
      <v-card-text class="text-center">
        <h3>프로필</h3>
        <v-divider class="mt-2" />
        <v-card-subtitle>{{ items.name }}</v-card-subtitle>
        <v-card-subtitle>{{ items.email }}</v-card-subtitle>
      </v-card-text>
    </v-card>
  </v-container>
</template>

<script>
export default {
  name: 'Profile',
  data() {
    return {
      home: '/',
      items: {
        id: 'admin',
        name: '김관리',
        email: 'admin@acorn.com',
      },
    };
  },
};
</script>
