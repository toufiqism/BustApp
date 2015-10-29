package com.example.busticket;

import java.util.Calendar;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

//import android.widget.TextView;

public class MainActivity extends Activity {

	Spinner spinner1, spinner2;
	Button btnSubmit, button, btn;;
	String from = "";
	String to = "";

	TextView tv1;
	TextView tvDisplayDate;
	private Button btnChangeDate;

	private Integer year;
	private Integer month;
	private Integer day;
	static final int DATE_DIALOG_ID = 999;

	// TextView t ;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		init();
		Action();
		btnAction();

	}

	private void btnAction() {
		// TODO Auto-generated method stub
		/*
		 * btnSubmit.setOnClickListener(new OnClickListener() {
		 * 
		 * @Override public void onClick(View v) { // TODO Auto-generated method
		 * stub Intent intent = new Intent(MainActivity.this, BusList.class);
		 * intent.putExtra("l",from + " TO " + to); startActivity(intent);
		 * 
		 * 
		 * } });
		 */
	}

	private void Action() {
		// TODO Auto-generated method stub
		spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				from = parent.getSelectedItem().toString();
				Log.d("dest", from);

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}

		});

		spinner2.setOnItemSelectedListener(new OnItemSelectedListener() {

			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				to = parent.getSelectedItem().toString();
				Log.d("dest", to);

			}

			@Override
			public void onNothingSelected(AdapterView<?> parent) {
				// TODO Auto-generated method stub

			}

		});

		final Calendar c = Calendar.getInstance();
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		day = c.get(Calendar.DAY_OF_MONTH);

		btnChangeDate = (Button) findViewById(R.id.btnChangeDate);

		btnChangeDate.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				showDialog(DATE_DIALOG_ID);
			}
		});

		btn = (Button) findViewById(R.id.btn);

		btn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub

				String a = spinner1.getSelectedItem().toString();
				String b = spinner2.getSelectedItem().toString();

				if (a.equals("----") && b.equals("----")) {
					Toast.makeText(getApplicationContext(), "Failed",
							Toast.LENGTH_LONG).show();
					return;
				} else if (a.equals("----")) {
					Toast.makeText(getApplicationContext(), "Failed",
							Toast.LENGTH_LONG).show();
					return;
				} else if (b.equals("----")) {
					Toast.makeText(getApplicationContext(), "Failed",
							Toast.LENGTH_LONG).show();
					return;
				} else {
					Intent in = new Intent(getApplicationContext(),
							BusList.class);
					// Log.d("a", );

					String ye = year.toString();
					String mo = month.toString();
					String da = day.toString();
					// in.putExtra("l", s);
					in.putExtra("l", from + " To " + to);
					in.putExtra("y", ye);
					in.putExtra("d", da);
					in.putExtra("m", mo);
					startActivity(in);
				}

			}
		});

	}

	@Override
	protected Dialog onCreateDialog(int id) {
		switch (id) {
		case DATE_DIALOG_ID:
			// set date picker as current date
			return new DatePickerDialog(this, datePickerListener, year, month,
					day);
		}
		return null;
	}

	private DatePickerDialog.OnDateSetListener datePickerListener = new DatePickerDialog.OnDateSetListener() {

		// when dialog box is closed, below method will be called.
		public void onDateSet(DatePicker view, int selectedYear,
				int selectedMonth, int selectedDay) {
			year = selectedYear;
			month = selectedMonth + 1;
			day = selectedDay;

			// tvDisplayDate=(TextView) findViewById(R.id.txtDatesInBusList);
			// set selected date into textview
			// tvDisplayDate.setText(new StringBuilder().append(month + 1)
			// .append("-").append(day).append("-").append(year)
			// .append(" "));

			// set selected date into datepicker also
			// dpResult.init(year, month, day, null);

		}
	};

	private void init() {
		// TODO Auto-generated method stub
		spinner1 = (Spinner) findViewById(R.id.spinner1);
		spinner2 = (Spinner) findViewById(R.id.spinner2);
		// btnSubmit = (Button)findViewById(R.id.btnSubmit);

	}
}