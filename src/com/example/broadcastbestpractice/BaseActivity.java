package com.example.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

public class BaseActivity extends Activity 
{
	protected void onCreat(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		ActivityCollector.addActivity(this);
		
	}	
	
	protected void onDestroy()
	{
		super.onDestroy();
		ActivityCollector.removeActivity(this);
	}
}
