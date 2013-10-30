package com.neu.nur;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class SplashScreen extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);
		Thread timer = new Thread(){
			public void run(){
				try {
					sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally{
					Intent startApp = new Intent("com.neu.nur.SMARTSURVEILLANCEACTIVITY");
					startActivity(startApp);
					finish();
				}
			}
		};
		timer.start();
	}

}
