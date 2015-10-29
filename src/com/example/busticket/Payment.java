package com.example.busticket;

import com.example.storage.Storage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Payment extends Activity {
	Button btnbkash, btnhd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.payment);

		btnbkash = (Button) findViewById(R.id.bkash);
		btnhd = (Button) findViewById(R.id.coh);
		btnbkash.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),
						BkashPayment.class);
				String a = Storage.total;
				String b = Storage.seats;
				Log.d("Tag:", a);
				i.putExtra("e", a);
				i.putExtra("d", b);
				startActivity(i);

			}
		});
		btnhd.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),
						BkashPayment.class);
				startActivity(i);

			}
		});
	}
}
