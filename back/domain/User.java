package com.project04.domain;

public class User {
    private String userid;
    private String userpw;
    private String name;
    private String gender;
    private String address;
    private String phone_number;
    private String regdate;

    // 기본 생성자 추가
    public User() {
        // 기본 생성자는 필드를 초기화하지 않습니다. Jackson이 이 생성자를 사용하여 인스턴스를 생성한 후,
        // JSON 데이터로부터 값을 설정할 수 있습니다.
    }
    
    public User(String userid, String userpw, String name, String gender, String address, String phone_number, String regdate) {
        this.userid = userid;
        this.userpw = userpw;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phone_number = phone_number;
        this.regdate = regdate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }
}
