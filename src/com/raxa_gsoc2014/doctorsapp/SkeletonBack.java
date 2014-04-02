package com.raxa_gsoc2014.doctorsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SkeletonBack extends Activity{
	Button backbone,scapula1,scapula2,hip1,hip2;

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bones_joints_back);
		backbone = (Button) findViewById(R.id.button_backbone);
		scapula1 = (Button) findViewById(R.id.button_scapula);
		scapula2 = (Button) findViewById(R.id.Button_scapula2);
		hip1 = (Button) findViewById(R.id.Button_hip);
		hip2 = (Button) findViewById(R.id.Button_hip2);
		
		backbone.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent backboneList = new Intent("com.raxa_gsoc2014.doctorsapp.BACKBONELIST") ;
							startActivity(backboneList);
						}
					}
				};
				link.start();
			}
		});
		
		scapula1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent scapulaList = new Intent("com.raxa_gsoc2014.doctorsapp.SCAPULALIST") ;
							startActivity(scapulaList);
						}
					}
				};
				link.start();
			}
		});
		
		scapula2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent scapulaList = new Intent("com.raxa_gsoc2014.doctorsapp.SCAPULALIST") ;
							startActivity(scapulaList);
						}
					}
				};
				link.start();
			}
		});
		
		hip1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent hipList = new Intent("com.raxa_gsoc2014.doctorsapp.HIPLIST") ;
							startActivity(hipList);
						}
					}
				};
				link.start();
			}
		});
		
		hip2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent hipList = new Intent("com.raxa_gsoc2014.doctorsapp.HIPLIST") ;
							startActivity(hipList);
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
