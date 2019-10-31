package com.oyms.en;

public enum ReturnCode {
	REGISTER_SUCCESS(0000, "注册成功"), REGISTER_FAIL(0001, "用户已存在");

	private int code;
	private String msg;

	public int getCode() {
		return code;
	}

	public String getMsg() {
		return msg;
	}

	private ReturnCode(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}