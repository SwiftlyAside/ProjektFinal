package com.astro.nautica.VO;

import java.sql.Timestamp;

public class InquireVO {
        // 문의 식별자 generated as identity
        private int inquireId;

        // 아이디
        private String userId;

        // 작성 날짜
        private Timestamp writeDate;

        // 제목
        private String title;

        // 내용
        private String content;

        // 답변 내용
        private String answer;

        public int getInquireId() {
            return inquireId;
        }

        public void setInquireId(int inquireId) {
            this.inquireId = inquireId;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public Timestamp getWriteDate() {
            return writeDate;
        }

        public void setWriteDate(Timestamp writeDate) {
            this.writeDate = writeDate;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getAnswer() {
            return answer;
        }

        public void setAnswer(String answer) {
            this.answer = answer;
        }
}
