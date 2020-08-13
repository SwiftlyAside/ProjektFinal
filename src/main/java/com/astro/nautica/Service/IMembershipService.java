package com.astro.nautica.Service;

public interface IMembershipService {
    // id 존재 확인
    int isExistId(String id);

    // 입력받은 id, pw 를 DB 와 비교하기
    boolean login(String id, String pw);
}
