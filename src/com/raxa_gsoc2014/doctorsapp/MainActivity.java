package com.raxa_gsoc2014.doctorsapp;

import android.os.Bundle;
import android.app.Activity;
//import android.app.ListActivity;
import android.content.Intent;
import android.view.View;
//import android.widget.ArrayAdapter;
import android.widget.Button;
//import android.widget.ListView;

public class MainActivity extends Activity {
	
	//String classes[]={"Brain","NervousSystem","Joints&Bones","InternalOrgans"};
	
	Button brain, skeleton;
	
	/* (non-Javadoc)
	 * @see android.app.ListActivity#onListItemClick(android.widget.ListView, android.view.View, int, long)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
	//setListAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,classes));
		setContentView(R.layout.activity_main);
		brain= (Button) findViewById(R.id.choice_brain);
		skeleton = (Button) findViewById(R.id.button_bones_joints);
		brain.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread linkBrain = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent openBrain =new Intent("com.raxa_gsoc2014.doctorsapp.SPLITHEAD");
							startActivity(openBrain);
						}
					}
				};
				linkBrain.start();
			}
		});
		
		skeleton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent openBonesJoints =new Intent("com.raxa_gsoc2014.doctorsapp.SKELETONCHOICE");
							startActivity(openBonesJoints);
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
