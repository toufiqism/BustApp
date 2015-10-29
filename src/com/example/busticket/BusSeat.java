package com.example.busticket;

import com.example.storage.Constants;
import com.example.storage.Storage;
//http://stackoverflow.com/questions/16352404/store-retrieve-button-state-using-shared-preference
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import android.widget.TextView;

public class BusSeat extends Activity {

	Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11,
			btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20,
			btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, go;
	TextView selectseat, fair;
	int count = 1;
	SharedPreferences preferences;

	// String cost="";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.busseat);
		preferences = PreferenceManager
				.getDefaultSharedPreferences(BusSeat.this);
		load();
		selectseat = (TextView) findViewById(R.id.seatselect);
		fair = (TextView) findViewById(R.id.fair);
		go = (Button) findViewById(R.id.go);
		btn1 = (Button) findViewById(R.id.button1);
		btn2 = (Button) findViewById(R.id.button2);
		btn3 = (Button) findViewById(R.id.button3);
		btn4 = (Button) findViewById(R.id.button4);
		btn5 = (Button) findViewById(R.id.button5);
		btn6 = (Button) findViewById(R.id.button6);
		btn7 = (Button) findViewById(R.id.button7);
		btn8 = (Button) findViewById(R.id.button8);
		btn9 = (Button) findViewById(R.id.button9);
		btn10 = (Button) findViewById(R.id.button10);
		btn11 = (Button) findViewById(R.id.button11);
		btn12 = (Button) findViewById(R.id.button12);
		btn13 = (Button) findViewById(R.id.button13);
		btn14 = (Button) findViewById(R.id.button14);
		btn15 = (Button) findViewById(R.id.button15);
		btn16 = (Button) findViewById(R.id.button16);
		btn17 = (Button) findViewById(R.id.button17);
		btn18 = (Button) findViewById(R.id.button18);
		btn19 = (Button) findViewById(R.id.button19);
		btn20 = (Button) findViewById(R.id.button20);
		btn21 = (Button) findViewById(R.id.button21);
		btn22 = (Button) findViewById(R.id.button22);
		btn23 = (Button) findViewById(R.id.button23);
		btn24 = (Button) findViewById(R.id.button24);
		btn25 = (Button) findViewById(R.id.button25);
		btn26 = (Button) findViewById(R.id.button26);
		btn27 = (Button) findViewById(R.id.button27);
		btn28 = (Button) findViewById(R.id.button28);

		btn1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Integer t = count * 650;
				String tot = t.toString();
				selectseat.setText(selectseat.getText().toString() + " A1 ");
				fair.setText("Fair: " + tot);
				btn1.setBackgroundColor(Color.GREEN);
				btn1.setEnabled(false);
				count++;

				Editor edit = preferences.edit();
				edit.putString(Constants.ButtonDataA1, "A1"); // when clicking
																// News Button
				// edit.putString("which_list", "DATA"); // when clicking Data
				// Button
				edit.commit();

			}
		});
		btn2.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Integer t = count * 650;
				String tot = t.toString();
				selectseat.setText(selectseat.getText().toString() + " A2 ");
				fair.setText("Fair: " + tot);
				btn2.setBackgroundColor(Color.GREEN);
				btn2.setEnabled(false);
				count++;
				Editor edit = preferences.edit();
				edit.putString(Constants.ButtonDataA2, "A2"); // when clicking
																// News Button
				// edit.putString("which_list", "DATA"); // when clicking Data
				// Button
				edit.commit();
			}
		});
		btn3.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn4.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn5.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn6.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn7.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn8.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn9.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn10.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn11.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn12.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn13.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn14.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn15.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn16.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn17.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn18.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn19.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn20.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn21.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn22.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn23.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn24.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn25.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn26.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn27.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				startActivity(in);

			}
		});
		btn28.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				count++;

				Intent in = new Intent(getApplicationContext(), Register.class);

				startActivity(in);

			}
		});
		fair.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				// Integer t = count*650;
				// String tot=t.toString();
				// fair.setText("Fair: "+tot);
				// Bundle b=new Bundle();
				// b.putString("d", tot);
				// / Create Intent for SignUpActivity abd Start The Activity
				String a = fair.getText().toString();

				Intent in = new Intent(getApplicationContext(),
						BkashPayment.class);
				// String tot=t.toString();
				in.putExtra("d", a);
				startActivity(in);

			}
		});

		selectseat.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String se = selectseat.getText().toString();

				Intent in = new Intent(getApplicationContext(),
						BkashPayment.class);
				// String tot=t.toString();
				in.putExtra("e", se);
				startActivity(in);

			}
		});

		go.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				// TODO Auto-generated method stub

				// / Create Intent for SignUpActivity abd Start The Activity
				Intent in = new Intent(getApplicationContext(), Register.class);
				String a = fair.getText().toString();
				String b = selectseat.getText().toString();
				Storage.total = a;
				Storage.seats = b;
				// in.putExtras(b);
				startActivity(in);

			}
		});

	}

	private void load() {
		// TODO Auto-generated method stub
		if (Constants.ButtonDataA1.equals("A1")) {
			
			btn1.setBackgroundColor(Color.GREEN);
		} else if (Constants.ButtonDataA2.equals("A2"))
		{
			btn2.setBackgroundColor(Color.GREEN);
		}
		else {
			
		}
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

}
