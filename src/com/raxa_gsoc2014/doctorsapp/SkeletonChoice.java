package com.raxa_gsoc2014.doctorsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SkeletonChoice extends Activity{
	Button skelChoice1,skelChoice2;

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.skeleton_choice);
		skelChoice1 = (Button) findViewById(R.id.button_skeleton_choice_1);
		skelChoice2 = (Button) findViewById(R.id.button_skeleton_choice_2);
		
		skelChoice1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent skelChoiceFront = new Intent("com.raxa_gsoc2014.doctorsapp.SKELETONFRONT") ;
							startActivity(skelChoiceFront);
						}
					}
				};
				link.start();
			}
		});
		
		skelChoice2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent skelChoiceBack = new Intent("com.raxa_gsoc2014.doctorsapp.SKELETONBACK") ;
							startActivity(skelChoiceBack);
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
		//finish();
	}
	
	

}
