<template>
  <v-container>
    <v-card
      class="mx-auto my-12"
      min-width="800"
      width="60vw"
    >
      <v-card-title><h2>Profile</h2></v-card-title>
      <v-card-content>
		  <h3>프로필</h3>
		  <v-card-title>{{ items.id }}</v-card-title>
		  <v-card-subtitle>{{ items.name }}</v-card-subtitle>
		  <v-card-subtitle>{{ items.email }}</v-card-subtitle>
	  </v-card-content>
    </v-card>
  </v-container>
</template>

<script>
export default {
	name: 'Profile',
	data(){
		return{
			home: '/',
			items: [
				{
					id: 'admin',
					name: '김관리',
					email: 'admin@acorn.com'
				},
			]
		}
	}
}
</script>