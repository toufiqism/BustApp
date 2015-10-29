package com.example.busticket;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BkashPayment extends Activity 
{
	TextView amount,setdetails;
	
 
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
	     super.onCreate(savedInstanceState);
	     setContentView(R.layout.bkashpayment);
	     amount=(TextView)findViewById(R.id.amount);
	     setdetails=(TextView)findViewById(R.id.setdetail);
	     Bundle bndl= getIntent().getExtras();
			
			String f=bndl.getString("d");
			String g=bndl.getString("e");
			amount.setText( "Your Total Cost:"+ f);
			setdetails.setText( "Your Total Cost:"+ g);
	}
}
