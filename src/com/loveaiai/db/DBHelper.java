package com.loveaiai.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class DBHelper  extends SQLiteOpenHelper{

	public DBHelper(Context context, String name, CursorFactory factory,
			int version) {
		super(context, name, factory, version);
		// TODO Auto-generated constructor stub
	}
	public  DBHelper(Context context) {
		// TODO Auto-generated constructor stub
		this(context, ContextConfig.APPDBNAME, null, ContextConfig.APPDBVERSION);
	}
	/**
	 * ���ݿ��һ�α�������ʱ����ø÷���
	 */
	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		Log.i("ONE", "CRAETE database");
		System.out.println("YOOOOO");
		for(String sql:ContextConfig.DBInit){
			db.execSQL(sql);
		}
	}
/**
 * ���ݿ⽵����ʱ��ʹ��
 */
	@Override
	public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

}
