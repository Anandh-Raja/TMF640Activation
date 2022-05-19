package com.example.PersistanceAPI.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
	private String msg;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	//public Object getResponse() {
//		return response;
//	}
//	public void setResponse(Object response) {
//		this.response = response;
//	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public Exception getErr() {
		return err;
	}
	public void setErr(Exception err) {
		this.err = err;
	}
	//private Object response;
	private int result;
	private Exception err;

}
