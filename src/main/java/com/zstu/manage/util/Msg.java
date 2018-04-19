package com.zstu.manage.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Msg {
	
	private int code;
	private String msg;
	private List<Map<String, Object>> extend = new ArrayList<>();
	
	public static Msg success(){
		Msg result = new Msg();
		result.setCode(100);
		result.setMsg("成功");
		return result;
	}
	
	public static Msg fail(){
		Msg result = new Msg();
		result.setCode(200);
		result.setMsg("失败");
		return result;
	}
	
	public Msg add(String key, Object value){
		Map<String,Object> map = new HashMap<>();
		map.put(key,value);
		this.getExtend().add(map);
		return this;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<Map<String, Object>> getExtend() {
		return extend;
	}
	public void setExtend(List<Map<String, Object>> extend) {
		this.extend = extend;
	}
	
	
	
}
