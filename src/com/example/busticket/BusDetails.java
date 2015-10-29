package com.example.busticket;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

//import android.widget.TextView;

public class BusDetails extends Activity {

	
	 private Button bushead, busgead;
	
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.busdetails);
		
		bushead = (Button)findViewById(R.id.buslead);
		busgead = (Button)findViewById(R.id.busgead);
		bushead.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
            
 
			/// Create Intent for SignUpActivity  abd Start The Activity
			Intent in=new Intent(getApplicationContext(),BusSeat.class);
			startActivity(in);
			}
		});
		
		busgead.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
	            
	 
				/// Create Intent for SignUpActivity  abd Start The Activity
				Intent in=new Intent(getApplicationContext(),BusSeat.class);
				startActivity(in);
				}
			});
	}
}