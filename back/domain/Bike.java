package com.project04.domain;

public class Bike {
    private String bike_id;
    private String addr_seq;
    private String addr1;
    private String addr2;
    private String bike_addr1;
    private String bike_addr2;
    private String latitude;  // 위도 필드
    private String longitude; // 경도 필드

    // 기본 생성자
    public Bike() {
    }

    // 매개변수를 가진 생성자
    public Bike(String bike_id, String addr_seq, String addr1, String addr2, String bike_addr1, String bike_addr2, String latitude, String longitude) {
        this.bike_id = bike_id;
        this.addr_seq = addr_seq;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.bike_addr1 = bike_addr1;
        this.bike_addr2 = bike_addr2;
        this.latitude = latitude;
        this.longitude = longitude;
    }

	public String getBike_id() {
		return bike_id;
	}

	public void setBike_id(String bike_id) {
		this.bike_id = bike_id;
	}

	public String getAddr_seq() {
		return addr_seq;
	}

	public void setAddr_seq(String addr_seq) {
		this.addr_seq = addr_seq;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getBike_addr1() {
		return bike_addr1;
	}

	public void setBike_addr1(String bike_addr1) {
		this.bike_addr1 = bike_addr1;
	}

	public String getBike_addr2() {
		return bike_addr2;
	}

	public void setBike_addr2(String bike_addr2) {
		this.bike_addr2 = bike_addr2;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

    

}
