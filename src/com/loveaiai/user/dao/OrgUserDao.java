package com.loveaiai.user.dao;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.loveaiai.db.DBHelper;
import com.loveaiai.user.OrgUser;

public class OrgUserDao {
	private DBHelper dbHelper;
	public OrgUserDao( Context context){
		dbHelper = new DBHelper(context);
		
	}
	public List<OrgUser> allUser(){
		OrgUser  orgUser = null;
		List<OrgUser> result = new ArrayList<OrgUser>();
		String sql = "select u.username,u.password,u.isdelete from org_user u";
		SQLiteDatabase db=dbHelper.getReadableDatabase();
		Cursor cs = db.rawQuery(sql, null);
		while(cs.moveToNext()){
			orgUser = new OrgUser();
			orgUser.setUsername(cs.getString(0));
			orgUser.setPassword(cs.getString(1));
			orgUser.setIsDelete(cs.getInt(2));
			result.add(orgUser);
		}
		return result;
	}
}
