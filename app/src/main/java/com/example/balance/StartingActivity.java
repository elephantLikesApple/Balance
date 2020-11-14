package com.example.balance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartingActivity extends Activity {
    SecretTextView secretTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starting);

//        secretTextView = (SecretTextView)findViewById(R.id.textView1);
//        secretTextView.setTextColor(Color.BLACK);
//        secretTextView.setDuration(3000); // set fade duration to 3 seconds
//        secretTextView.setIsVisible(true);

        //secretTextView.show(); // fade in
        //secretTextView.hide(); // fade out
        //secretTextView.toggle(); // fade in or out depending on current state



        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(getBaseContext(), TutorialActivity.class);
                startActivity(intent);
                finish();
            }
        }, 400);



    }
}
