package com.example.busticket;

import java.util.Calendar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
//import android.widget.TextView;

public class DatePick extends Activity {

	private TextView tvDate;
	//private DatePicker dpResult;
	private Button btnChangeDate, next;
	
	private int year;
	private int month;
	private int day;

	static final int DATE_DIALOG_ID = 999;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.datepick);

		setCurrentDateOnView();
		addListenerOnButton();

	}

	// display current date
	public void setCurrentDateOnView() {

		 tvDate = (TextView) findViewById(R.id.tvDate);
		//dpResult = (DatePicker) findViewById(R.id.dpResult);

		final Calendar c = Calendar.getInstance();
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_MONTH);

		// set current date into textview
		//tvDisplayDate.setText(new StringBuilder()
			// Month is 0 based, just add 1
			//.append(month + 1).append("-").append(day).append("-")
			//.append(year).append(" "));

		// set current date into datepicker
		//dpResult.init(year, month, day, null);

	}

	public void addListenerOnButton() {

		btnChangeDate = (Button) findViewById(R.id.btnChangeDate);
		next = (Button)findViewById(R.id.btnext);
		
		btnChangeDate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				//Intent in=new Intent(getApplicationContext(),BusList.class);
				//startActivity(in);
		        

				showDialog(DATE_DIALOG_ID);

			}
			
		});
		
		next.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
				Intent in=new Intent(getApplicationContext(),BusList.class);
				startActivity(in);

			}
			
		});

	}

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DATE_DIALOG_ID:
		   // set date picker as current date
		   return new DatePickerDialog(this, datePickerListener, 
                         year, month,day);
		}
		return null;
	}
	
	private DatePickerDialog.OnDateSetListener datePickerListener 
                = new DatePickerDialog.OnDateSetListener() {

		// when dialog box is closed, below method will be called.
		public void onDateSet(DatePicker view, int selectedYear,
				int selectedMonth, int selectedDay) {
			year = selectedYear;
			month = selectedMonth;
			day = selectedDay;

			// set selected date into textview
			tvDate.setText(new StringBuilder().append(month + 1)
			   .append("-").append(day).append("-").append(year)
			   .append(" "));

			// set selected date into datepicker also
			//dpResult.init(year, month, day, null);

		}
	};

}
