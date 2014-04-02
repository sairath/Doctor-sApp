package com.raxa_gsoc2014.doctorsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//import android.widget.Button;
import android.widget.ImageButton;

public class SplitHead extends Activity{

	ImageButton brain1,brain2,brain3,brain4,brain5;
	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.split_head_update);
	/** brain1 = (Button) findViewById(R.id.brain1_enter);
		brain2 = (Button) findViewById(R.id.brain2_enter);
		brain3 = (Button) findViewById(R.id.brain3_enter);
		brain4 = (Button) findViewById(R.id.brain4_enter);
		brain5 = (Button) findViewById(R.id.brain5_enter); */
		
		brain1 = (ImageButton) findViewById(R.id.imageButton1);
		brain2 = (ImageButton) findViewById(R.id.imageButton2);
		brain3 = (ImageButton) findViewById(R.id.imageButton3);
		brain4 = (ImageButton) findViewById(R.id.imageButton4);
		brain5 = (ImageButton) findViewById(R.id.imageButton5);
		
		brain1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link1 = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent openBrainInfo1 = new Intent("com.raxa_gsoc2014.doctorsapp.BRAININFO1") ;
							startActivity(openBrainInfo1);
						}
					}
				};
				link1.start();
				
			}
		});
		
		brain2.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						Thread link2 = new Thread(){
							public void run(){
								try{
									
								}finally{
									Intent openBrainInfo2 = new Intent("com.raxa_gsoc2014.doctorsapp.BRAININFO2") ;
									startActivity(openBrainInfo2);
								}
							}
						};
						link2.start();
					}
				});
		
		brain3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link3 = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent openBrainInfo3 = new Intent("com.raxa_gsoc2014.doctorsapp.BRAININFO3") ;
							startActivity(openBrainInfo3);
						}
					}
				};
				link3.start();
				
			}
		});
		
		brain4.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link4 = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent openBrainInfo4 = new Intent("com.raxa_gsoc2014.doctorsapp.BRAININFO4") ;
							startActivity(openBrainInfo4);
						}
					}
				};
				link4.start();
				
			}
		});
		
		brain5.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link5 = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent openBrainInfo5 = new Intent("com.raxa_gsoc2014.doctorsapp.BRAININFO5") ;
							startActivity(openBrainInfo5);
						}
					}
				};
				link5.start();
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
		//finish();
	}
}
