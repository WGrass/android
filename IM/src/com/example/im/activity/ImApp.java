package com.example.im.activity;

import com.example.im.core.QQConnection;

import android.app.Application;

/*
 * ************************************************************************
 * 
 * @创建者 ZHY
 * 
 * @创建时间 2016-2-26 下午10:18:46
 * 
 * @描述 博客地址：http://blog.csdn.net/qq_20889581/article/details/50755449
 * 
 * @版权所有 文明的小流氓
 * 
 * ************************************************************************
 */
public class ImApp extends Application {
	private QQConnection myConn;// 长连接
	private long myAccount;// 用户的登录账号
	private String buddyListJson;// 好友列表的json串

	public QQConnection getMyConn() {
		return myConn;
	}

	public void setMyConn(QQConnection myConn) {
		this.myConn = myConn;
	}

	public long getMyAccount() {
		return myAccount;
	}

	public void setMyAccount(long myAccount) {
		this.myAccount = myAccount;
	}

	public String getBuddyListJson() {
		return buddyListJson;
	}

	public void setBuddyListJson(String buddyListJson) {
		this.buddyListJson = buddyListJson;
	}

}
