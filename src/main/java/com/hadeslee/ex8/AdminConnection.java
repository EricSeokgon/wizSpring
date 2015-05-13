package com.hadeslee.ex8;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class AdminConnection implements EnvironmentAware, InitializingBean, DisposableBean {

	private Environment env;
	private String adminId;
	private String adminPw;
	private String sub_adminId;
	private String sub_adminPw;

	public String getSub_adminId() {
		return sub_adminId;
	}

	public void setSub_adminId(String sub_adminId) {
		this.sub_adminId = sub_adminId;
	}

	public String getSub_adminPw() {
		return sub_adminPw;
	}

	public void setSub_adminPw(String sub_adminPw) {
		this.sub_adminPw = sub_adminPw;
	}

	@Override
	public void setEnvironment(Environment env) {
		System.out.println("setEnvironment()");
		setEnv(env);
	}
	
	public void setEnv(Environment env) {
		this.env = env;
	}
	
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	
	public void setAdminPw(String adminPw) {
		this.adminPw = adminPw;
	}
	
	public String getAdminId() {
		return adminId;
	}
	
	public String getAdminPw() {
		return adminPw;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		setAdminId(env.getProperty("admin.id"));
		setAdminPw(env.getProperty("admin.pw"));
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy()");
	}

}
