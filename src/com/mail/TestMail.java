package com.mail;

/**
 * 阎梓宁
 * 发送邮件
 * 2017-2-24
 */
public class TestMail {

	public static void main(String[] args) {
		MailInfo mailinfo = new MailInfo();
		// --设置邮件服务器开始
		mailinfo.setMailServerHost("smtp.gmail.com");
		mailinfo.setMailServerPort("465");
		mailinfo.setValidate(true);
		mailinfo.setUserName("zhaozhi3758");
		mailinfo.setPassword("XXXXXXXX");
		// --设置邮件服务器结束
		mailinfo.setFromAddress("1196523662@qq.com");// 邮件发送者的地址
		// 设置接受用户
		String[] ToAddress = { "1196523662@qq.com" };
		mailinfo.setToAddress(ToAddress);
		// 设置附件
		String[] attach = { "D:\\1.txt" };
		mailinfo.setAttachFileNames(attach);
		mailinfo.setSubject("-----邮件测试----");
		mailinfo.setContent("<a href='#'>hiao的和</a>");// 网页内容
		SendMail sm = new SendMail();
		if (sm.sendAttach(mailinfo))
			System.out.println("邮件发送成功");
		else
			System.out.println("邮件发送失败");

	}

}