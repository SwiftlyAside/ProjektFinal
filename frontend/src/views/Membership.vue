<template>
  <v-container style="width: 500px">
    <h2>{{ message }}</h2>
    <v-row>
      <v-col>
        <v-btn
          id="btnLoginAnonymous"
          @click="btnLoginAnonymous"
        >
          비회원으로 주문하기
        </v-btn>
      </v-col>
    </v-row>

    <ValidationObserver
      ref="observer"
      v-slot="{ /*validate, reset*/ }"
    >
      <form>
        <ValidationProvider
          v-slot="{errors}"
          name="id"
          rules="required"
        >
          <v-text-field
            v-model="id"
            :error-messages="errors"
            label="아이디"
            required
          />
        </ValidationProvider>
        <ValidationProvider
          v-slot="{errors}"
          name="pw"
          rules="required"
        >
          <v-text-field
            v-model="pw"
            :append-icon="show1 ? 'mdi-eye' : 'mdi-eye-off'"
            :rules="[rules.required, rules.min]"
            :type="show1 ? 'text' : 'password'"
            :error-messages="errors"
            label="비밀번호"
            hint="4자 이상 입력하세요"
            requried
            counter
            @click:append="show1 = !show1"
          />
        </ValidationProvider>
        <v-btn
          @click="submit"
        >
          로그인
        </v-btn>
        <v-btn @click="clear">
          clear
        </v-btn>
      </form>
    </VAlidationObserver>
    <!-- test field -->
    <v-text-field
      :value="result"
    />
    <v-btn
      @click="findMember"
    >
      아이디 찾기
    </v-btn>
    <v-btn>
      비밀번호 수정
    </v-btn>
    <v-btn>
      회원가입
    </v-btn>
    <!--<div class="col">
      <span>
        <a href="${home }local/findMember">아이디 찾기
          &lt;!&ndash; <button class='btn' id='btnFindMember'>아이디 찾기</button> &ndash;&gt;
        </a>
      </span>
      <span>
        <a href="${home }local/changePass">비밀번호 수정
          &lt;!&ndash; <button class='btn' id='btnChangePw'>비밀번호 수정</button> &ndash;&gt;
        </a>
      </span>
      <span>
        <a href="${home }local/makeMember">회원가입
          &lt;!&ndash; <button class='btn' id='btnMakeMember'>회원가입</button> &ndash;&gt;
        </a>
      </span>
    </div>-->
  </v-container>
</template>

<script>
import { required, max } from 'vee-validate/dist/rules';
import {
  extend, ValidationObserver, ValidationProvider, setInteractionMode,
} from 'vee-validate';

setInteractionMode('eager');

extend('required', {
  ...required,
  message: '{_field_} can not be empty',
});

extend('max', {
  ...max,
  message: '{_field_} may not be greater than {length} characters',
});

export default {

  name: 'Membership',
  components: {
    ValidationProvider,
    ValidationObserver,
  },
  data() {
    return {
      message: '안녕하세요 Acorn 전자상가 입니다!',
      id: '',
      pw: 'Acorn Final~',
      result: '',
      show1: false,
      rules: {
        required: (value) => !!value || 'Required.',
        min: (v) => v.length >= 4 || '4자 이상 입력하세요',
      },
    };
  },
  methods: {
    btnLoginAnonymous() {
      alert('저는 빡빡이입니다.');
    },

    submit() {
      this.$refs.observer.validate();
      this.$http.get(`/member/login?id=${this.id}&pw=${this.pw}`)
        .then((response) => {
          this.result = response.data;
          if (response.data === true) this.$router.push('/');
        })
        .catch((error) => {
          this.result = error;
        });
    },
    clear() {
      this.id = '';
      this.pw = '';
      this.$refs.observer.reset();
    },

    findMember() {
      this.$router.push('/member/findMember');
    },

  },
};
</script>

<style scoped>

</style>
