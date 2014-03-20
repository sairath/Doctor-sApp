package com.raxa_gsoc2014.doctorsapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Brain extends Activity{
	Button enter;

	/* (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.brain);
		enter= (Button) findViewById (R.id.brain_enter);
		enter.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Thread link = new Thread(){
					public void run(){
						try{
							
						}finally{
							Intent openSplitHead = new Intent("com.raxa_gsoc2014.doctorsapp.SPLITHEAD") ;
							startActivity(openSplitHead);
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
