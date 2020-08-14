package com.astro.nautica.VO;

import java.sql.Timestamp;

//제품 리뷰
public class ProductReviewVO {
	    // 리뷰 식별자 generated as identity
	    private int reviewid;

	    // 제품 식별자 on delete cascade
	    private String pid;

	    // 아이디 on delete cascade
	    private String userid;

	    // 평점 
	    private String grade;

	    // 내용 
	    private String content;

	    // 작성 날짜 
	    private Timestamp writedate;

	    public int getReviewid() {
	        return reviewid;
	    }

	    public void setReviewid(int reviewid) {
	        this.reviewid = reviewid;
	    }

	    public String getPid() {
	        return pid;
	    }

	    public void setPid(String pid) {
	        this.pid = pid;
	    }

	    public String getUserid() {
	        return userid;
	    }

	    public void setUserid(String userid) {
	        this.userid = userid;
	    }

	    public String getGrade() {
	        return grade;
	    }

	    public void setGrade(String grade) {
	        this.grade = grade;
	    }

	    public String getContent() {
	        return content;
	    }

	    public void setContent(String content) {
	        this.content = content;
	    }

	    public Timestamp getWritedate() {
	        return writedate;
	    }

	    public void setWritedate(Timestamp writedate) {
	        this.writedate = writedate;
	    }
}
