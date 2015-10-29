package com.example.busticket;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AbsoluteLayout;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
//import android.widget.TextView;

public class BusList extends Activity {

	//Button button;
	TextView txtDate, txtRoute;
	
	

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.buslist);
		txtDate=(TextView) findViewById(R.id.time);
		txtRoute=(TextView) findViewById(R.id.destination);
		
Bundle bndl= getIntent().getExtras();
		
		String a=bndl.getString("l");
		txtRoute.setText(a);
		
		String b= bndl.getString("d");
		String c=bndl.getString("y");
		String d= bndl.getString("m");
		
		txtDate.setText(b+"/"+d+"/"+c);
		LinearLayout mainLayout = (LinearLayout)findViewById(R.id.buslis2);
		View view = getLayoutInflater().inflate(R.layout.busdetails, mainLayout,false);
		 Button hnacbutton = (Button) view.findViewById(R.id.buslead);
		 Button hacbotton = (Button) view.findViewById(R.id.busgead);
		 Button hvlvbotton = (Button) view.findViewById(R.id.buspead);
		 mainLayout.addView(view);
		//mainLayout.addView(updateLevel);
		//tv1 = (TextView)findViewById(R.id.destination);
		
		/*LinearLayout manLayout = (LinearLayout)findViewById(R.id.time);
		View vdate = getLayoutInflater().inflate(R.layout.datepick, manLayout,false);
		TextView tdate = (TextView) vdate.findViewById(R.id.tvDate);
		manLayout.addView(tdate);*/
		
		
		
		
		
		//button = (Button)findViewById(R.id.btn);
		hnacbutton.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
            
 
			// Create Intent for SignUpActivity  abd Start The Activity
			Intent in=new Intent(getApplicationContext(),BusSeat.class);
			startActivity(in);
			
		}
		});
	
	
		hacbotton.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
            
 
			// Create Intent for SignUpActivity  abd Start The Activity
			Intent in=new Intent(getApplicationContext(),BusSeat.class);
			startActivity(in);
			
		}
		});
		
		hvlvbotton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
	            
	 
				// Create Intent for SignUpActivity  abd Start The Activity
				Intent in=new Intent(getApplicationContext(),BusSeat.class);
				startActivity(in);
			}
		});
	}
}

	 

