package com.sep.tmsdemo.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.sep.tmsdemo.R;

public class WelcomeActivity extends AppCompatActivity {

    private Button mSignInBtn;
    private Button mSignUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        //Remove the title of this page
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        //Remove the status bar of the activity
//        getWindow().setFlags(WindowManager.LayoutParams. FLAG_FULLSCREEN , WindowManager.LayoutParams. FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);
        mSignInBtn = (Button) findViewById(R.id.signInBtn);
        mSignInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this,SignInActivity.class);
                startActivity(intent);
            }
        });

        mSignUpBtn = (Button) findViewById(R.id.signUpBtn);
        mSignUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
