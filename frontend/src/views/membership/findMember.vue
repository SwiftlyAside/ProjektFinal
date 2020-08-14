<template>
  <v-container style="width: 600px">
    <ValidationObserver
      ref="observer"
    >
      <v-form>
        <ValidationProvider
          v-slot="{ errors }"
          name="email"
          rules="required|email"
        >
          <v-text-field
            v-model="email"
            :error-messages="errors"
            label="이메일을 입력하세요"
            required
          />
        </ValidationProvider>
        <v-btn
          @click="submit"
        >
          전송
        </v-btn>
      </v-form>
    </validationobserver>

    <!-- test field -->
    <v-text-field
      :value="result"
    />
  </v-container>
</template>

<script>
import { required, email } from 'vee-validate/dist/rules';
import {
  extend, ValidationProvider, ValidationObserver, setInteractionMode,
} from 'vee-validate';

setInteractionMode('eager');

extend('required', {
  ...required,
  message: '{_field_} can not be empty',
});

extend('email', {
  ...email,
  message: '{_field_} is not an email!!',
});

export default {
  name: 'FindMember',
  components: {
    ValidationObserver,
    ValidationProvider,
  },

  data() {
    return {
      email: '',
      result: '',
      message: '',
    };
  },

  methods: {
    submit() {
      this.$refs.observer.validate();
      this.$http.get(`/member/findId?email=${this.email}`)
        .then((response) => {
          this.result = response.data;
        }).catch((error) => {
          this.result = error;
        });
    },
  },
};
</script>

<style scoped>

</style>
