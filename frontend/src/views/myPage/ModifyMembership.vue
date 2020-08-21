<template>
  <v-container
    class="grey lighten-5 fill-height"
    justify-center
  >
    <v-card
      class="mx-auto my-12"
      width="800"
    >
      <v-card-title><h3>회원정보 수정</h3></v-card-title>
      <v-card-text>
        <form>
          <ValidationObserver>
            <ValidationProvider
              v-slot="{ errors }"
              name="아이디"
              rules="required"
            >
              <v-text-field
                v-model="member.id"
                :error-messages="errors"
                label="아이디"
                required
                aria-readonly="true"
              />
            </ValidationProvider>
            <ValidationProvider
              v-slot="{ errors }"
              name="이름"
              rules="required|max:20"
            >
              <v-text-field
                v-model="member.userName"
                :counter="20"
                :error-messages="errors"
                label="이름"
                required
              />
            </ValidationProvider>
            <ValidationProvider
              v-slot="{errors}"
              name="비밀번호"
              rules="required"
            >
              <v-text-field
                v-model="member.pw"
                type="password"
                :error-messages="errors"
                label="비밀번호"
                requried
              />
            </ValidationProvider>
            <ValidationProvider
              v-slot="{errors}"
              name="비밀번호확인"
              rules="required"
            >
              <v-text-field
                v-model="member.pwok"
                type="password"
                :error-messages="errors"
                label="비밀번호확인"
                requried
              />
            </ValidationProvider>

            <v-divider />

            <v-list-item-action>
              <v-btn
                text
              />
            </v-list-item-action>
          </ValidationObserver>
          <v-card-actions>
            <v-btn
              type="submit"
            >
              회원수정
            </v-btn>
            <v-btn>
              취소
            </v-btn>
          </v-card-actions>
        </form>
      </v-card-text>
    </v-card>
  </v-container>
</template>

<script>
export default {
  name: 'ModifyMembership',
  data() {
    return {
      member: {
        id: 'admin',
        userName: '김관리',
        pw: 'admin',
        email: 'admin@acorn.com',
      },
    };
  },
};
</script>
