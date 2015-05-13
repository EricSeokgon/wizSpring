package com.hadeslee.ex8_1;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class AdminConnection implements InitializingBean, DisposableBean {

	private String adminId;
	private String adminPw;
	private String sub_adminId;
	private String sub_adminPw;
	
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	public void setSub_adminId(String sub_adminId) {
		this.sub_adminId = sub_adminId;
	}
	
	public void setSub_adminPw(String sub_adminPw) {
		this.sub_adminPw = sub_adminPw;
	}
	
	public String getAdminId() {
		return adminId;
	}
	
	public String getAdminPw() {
		return adminPw;
	}
	
	public String getSub_adminId() {
		return sub_adminId;
	}
	
	public String getSub_adminPw() {
		return sub_adminPw;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

}
