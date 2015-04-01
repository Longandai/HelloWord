package com.loveaiai.helloword;

import java.util.Date;

import com.loveaiai.db.DBHelper;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity  implements  OnClickListener{
	Button b ;
	int i=0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		b = new Button(this);
		b.setText("我爱王艳丽");
		b.setOnClickListener(this);
		new DBHelper(MainActivity.this).getReadableDatabase();
		setContentView(b);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		changeTime();
	}
    private void  changeTime(){
    	i++;
    	b.setText("我爱王艳丽"+i);
    	System.out.println(i);
    }
}
