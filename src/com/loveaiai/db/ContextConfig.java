package com.loveaiai.db;

public class ContextConfig {
	public final static String[] DBInit=new String[]{
		"CREATE table org_user (username varchar(20),password varchar(20),isdelete int)"
	};
	public  final static String APPDBNAME = "loveaiai.db";
	public final static int  APPDBVERSION = 1;
	
}
