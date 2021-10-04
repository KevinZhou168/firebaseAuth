package com.example.firebase_learnauthexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText emailET, passwordET;
    TextView authStatusTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailET = findViewById(R.id.emailEditText);
        passwordET = findViewById(R.id.passwordEditText);
        authStatusTV = findViewById(R.id.authMessageTextView);

    }

   /*
   This method will get all user input and then based on the button chose, perform the
   desired action.

   https://stackoverflow.com/questions/13032333/droid-how-to-get-button-id-from-onclick-method-described-in-xml
    */

    public void handleAuthChange(View v) {
        String email = emailET.getText().toString();
        String password = passwordET.getText().toString();
        Log.i("Denna",  email + " " + password);

        switch (v.getId()) {
            case R.id.signInButton:
                signIn(email, password);
                //
                break;
            case R.id.signUpButton:
                //
                signUp(email, password);
                break;
            case R.id.signOutButton:
                //
                signOut(email,password);
                break;
        }
    }



    public void signUp(String email, String password) {
        authStatusTV.setText("Signed up");
    }
    public void signIn(String email, String password) {
        authStatusTV.setText("Signed in");
    }
    public void signOut(String email, String password) {
        authStatusTV.setText("Signed out");

    }
}
