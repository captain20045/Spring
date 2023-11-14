package com.project04.domain;

public class UserRoute {
	private int route_seq;
	private String userid ;
    private String b_mark ;
    private String c_mark ;
    private Double b_latitude ;
    private Double b_longitude ;
    private Double c_latitude ;
    private Double c_longitude ;

    public UserRoute() {
        // 기본 생성자는 필드를 초기화하지 않습니다. Jackson이 이 생성자를 사용하여 인스턴스를 생성한 후,
        // JSON 데이터로부터 값을 설정할 수 있습니다.
    }

    public UserRoute(int route_seq, String userid, String b_mark, String c_mark, Double  b_latitude, Double  b_longitude, Double  c_latitude, Double  c_longitude) {
    	this.route_seq = route_seq;
    	this.userid = userid;
        this.b_mark = b_mark;
        this.c_mark = c_mark;
        this.b_latitude = b_latitude;
        this.b_longitude = b_longitude;
        this.c_latitude = c_latitude;
        this.c_longitude = c_longitude;
    }

	public int getRoute_seq() {
		return route_seq;
	}

	public void setRoute_seq(int route_seq) {
		this.route_seq = route_seq;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getB_mark() {
		return b_mark;
	}

	public void setB_mark(String b_mark) {
		this.b_mark = b_mark;
	}

	public String getC_mark() {
		return c_mark;
	}

	public void setC_mark(String c_mark) {
		this.c_mark = c_mark;
	}

	public Double getB_latitude() {
		return b_latitude;
	}

	public void setB_latitude(Double b_latitude) {
		this.b_latitude = b_latitude;
	}

	public Double getB_longitude() {
		return b_longitude;
	}

	public void setB_longitude(Double b_longitude) {
		this.b_longitude = b_longitude;
	}

	public Double getC_latitude() {
		return c_latitude;
	}

	public void setC_latitude(Double c_latitude) {
		this.c_latitude = c_latitude;
	}

	public Double getC_longitude() {
		return c_longitude;
	}

	public void setC_longitude(Double c_longitude) {
		this.c_longitude = c_longitude;
	}
}
