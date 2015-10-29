package com.example.busticket;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
 
public class Register extends Activity 
{
	Button btnSignIn,btnSignUp, bt;
	LoginDatabaseAdapter loginDataBaseAdapter;
 
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
	     super.onCreate(savedInstanceState);
	     setContentView(R.layout.register);
	     
 
	     // create a instance of SQLite Database
	     loginDataBaseAdapter=new LoginDatabaseAdapter(this);
	     loginDataBaseAdapter=loginDataBaseAdapter.open();
 
	     // Get The Refference Of Buttons
	     btnSignIn=(Button)findViewById(R.id.buttonSignin);
	     btnSignUp=(Button)findViewById(R.id.buttonSignup);
 
	    // Set OnClick Listener on SignUp button 
	    btnSignUp.setOnClickListener(new View.OnClickListener() {
		public void onClick(View v) {
			// TODO Auto-generated method stub
 
			/// Create Intent for SignUpActivity  abd Start The Activity
			Intent intentSignUP=new Intent(getApplicationContext(),SignUPActivity.class);
			startActivity(intentSignUP);
			}
		});
	}
	// Methos to handleClick Event of Sign In Button
	public void signIn(View V)
	   {
			final Dialog dialog = new Dialog(Register.this);
			dialog.setContentView(R.layout.signin);
		    dialog.setTitle("Login");
 
		    // get the Refferences of views
		    final  EditText editTextUserName=(EditText)dialog.findViewById(R.id.editTextUserNameToLogin);
		    final  EditText editTextPassword=(EditText)dialog.findViewById(R.id.editTextPasswordToLogin);
 
			Button btnSignIn=(Button)dialog.findViewById(R.id.buttonSignIn);
 
			// Set On ClickListener
			btnSignIn.setOnClickListener(new View.OnClickListener() {
 
				public void onClick(View v) {
					// get The User name and Password
					String userName=editTextUserName.getText().toString();
					String password=editTextPassword.getText().toString();
 
					// fetch the Password form database for respective user name
					String storedPassword=loginDataBaseAdapter.getSinlgeEntry(userName);
 
					// check if the Stored password matches with  Password entered by user
					if(password.equals(storedPassword))
					{
						//Toast.makeText(Register.this, "Congrats: Login Successfull", Toast.LENGTH_LONG).show();
						//dialog.dismiss();
						Intent in=new Intent(getApplicationContext(),Payment.class);
						startActivity(in);
					}
					else
					{
						Toast.makeText(Register.this, "User Name or Password does not match", Toast.LENGTH_LONG).show();
					}
				}
			});
 
			dialog.show();
	}
 
	@Override
	protected void onDestroy() {
		super.onDestroy();
	    // Close The Database
		loginDataBaseAdapter.close();
	}
}