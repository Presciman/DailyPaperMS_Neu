package com.mail;

/**
 * 李广文
 * 日报审核controller
 * 2017-2-23
 */
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MyAuthenticator extends Authenticator {
	private String username = "";
	private String password = "";

	public MyAuthenticator() {
	}

	public MyAuthenticator(String username, String password) {
		this.username = username;
		this.password = password;
	}

	protected PasswordAuthentication getPasswordAuthentication() {
		return new PasswordAuthentication(username, password);
	}

}