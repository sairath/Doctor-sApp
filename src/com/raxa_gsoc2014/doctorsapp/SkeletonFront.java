package com.raxa_gsoc2014.doctorsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SkeletonFront extends Activity{
	Button shoulder1,shoulder2,elbow1,elbow2,chest,femur1,femur2,knee1,knee2,fibula1,fibula2,ankle1,ankle2;

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bones_joints_new);
		shoulder1 = (Button) findViewById(R.id.Button_shoulder1);
		shoulder2 = (Button) findViewById(R.id.Button_shoulder2);
		elbow1 = (Button) findViewById(R.id.Button_elbow);
		elbow2 = (Button) findViewById(R.id.Button_elbow2);
		chest = (Button) findViewById(R.id.button_ribcage);
		femur1 = (Button) findViewById(R.id.button_femur);
		femur2 = (Button) findViewById(R.id.Button_femur2);
		knee1 = (Button) findViewById(R.id.Button_knee);
		knee2 = (Button) findViewById(R.id.button_knee2);
		fibula1 = (Button) findViewById(R.id.Button_leg);
		fibula2 = (Button) findViewById(R.id.Button_leg2);
		ankle1 = (Button) findViewById(R.id.Button_ankle);
		ankle2 = (Button) findViewById(R.id.Button_ankle2);
		
		shoulder1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent shoulderList = new Intent("com.raxa_gsoc2014.doctorsapp.SHOULDERLIST") ;
							startActivity(shoulderList);
						}
					}
				};
				link.start();
			}
		});
		
		shoulder2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent shoulderList = new Intent("com.raxa_gsoc2014.doctorsapp.SHOULDERLIST") ;
							startActivity(shoulderList);
						}
					}
				};
				link.start();
			}
		});
		
		elbow1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent elbowList = new Intent("com.raxa_gsoc2014.doctorsapp.ELBOWLIST") ;
							startActivity(elbowList);
						}
					}
				};
				link.start();
			}
		});
		
		elbow2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent elbowList = new Intent("com.raxa_gsoc2014.doctorsapp.ELBOWLIST") ;
							startActivity(elbowList);
						}
					}
				};
				link.start();
			}
		});
		
		chest.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent ribcageList = new Intent("com.raxa_gsoc2014.doctorsapp.RIBCAGELIST") ;
							startActivity(ribcageList);
						}
					}
				};
				link.start();
			}
		});
		
		femur1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent femurList = new Intent("com.raxa_gsoc2014.doctorsapp.FEMURLIST") ;
							startActivity(femurList);
						}
					}
				};
				link.start();
			}
		});
		
		femur2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent femurList = new Intent("com.raxa_gsoc2014.doctorsapp.FEMURLIST") ;
							startActivity(femurList);
						}
					}
				};
				link.start();
			}
		});
		
		knee1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent kneeList = new Intent("com.raxa_gsoc2014.doctorsapp.KNEELIST") ;
							startActivity(kneeList);
						}
					}
				};
				link.start();
			}
		});
		
		knee2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent kneeList = new Intent("com.raxa_gsoc2014.doctorsapp.KNEELIST") ;
							startActivity(kneeList);
						}
					}
				};
				link.start();
			}
		});
		
		fibula1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent lowerlegList = new Intent("com.raxa_gsoc2014.doctorsapp.FIBULALIST") ;
							startActivity(lowerlegList);
						}
					}
				};
				link.start();
			}
		});
		
		fibula2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent lowerlegList = new Intent("com.raxa_gsoc2014.doctorsapp.FIBULALIST") ;
							startActivity(lowerlegList);
						}
					}
				};
				link.start();
			}
		});
		
		ankle1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent ankleList = new Intent("com.raxa_gsoc2014.doctorsapp.ANKLELIST") ;
							startActivity(ankleList);
						}
					}
				};
				link.start();
			}
		});
		
		ankle2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent ankleList = new Intent("com.raxa_gsoc2014.doctorsapp.ANKLELIST") ;
							startActivity(ankleList);
						}
					}
				};
				link.start();
			}
		});
	}

	/* (non-Javadoc)
	 * @see android.app.Activity#onPause()
	 */
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}
	

}
