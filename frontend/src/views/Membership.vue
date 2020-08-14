<template>
  <div class="container">
    <h2>{{ message }}</h2>
    <div class="row">
      <div class="col">
        <v-btn
          id="btnLoginAnonymous"
          @click="btnLoginAnonymous"
        >
          비회원으로 주문하기
        </v-btn>
      </div>
      <form
        action="${home}member/login"
        method="post"
      >
        <div class="col">
          <input
            name="id"
            placeholder="아이디 입력"
            type="text"
          >
        </div>
        <div class="col">
          <input
            name="pw"
            placeholder="패스워드입력"
            type="password"
          >
        </div>
        <div class="col">
          <button
            id="btnLogin"
            class="btn"
          >
            로그인
          </button>
        </div>
      </form>
    </div>
    <div class="col">
      <span>
        <a href="${home }local/findMember">아이디 찾기
        <!-- <button class='btn' id='btnFindMember'>아이디 찾기</button> -->
        </a>
      </span>
      <span>
        <a href="${home }local/changePass">비밀번호 수정
        <!-- <button class='btn' id='btnChangePw'>비밀번호 수정</button> -->
        </a>
      </span>
      <span>
        <a href="${home }local/makeMember">회원가입
        <!-- <button class='btn' id='btnMakeMember'>회원가입</button> -->
        </a>
      </span>
    </div>
  </div>
</template>

<script>
export default {
  name: 'Membership',
  data() {
    return {
      message: '안녕하세요 vue',
    };
  },
  methods: {
    btnLoginAnonymous() {
      alert('저는 비회원입니다.');
    },
  },
};
</script>

<style scoped>

</style>
