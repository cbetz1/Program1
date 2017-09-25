package com.example.chad.program1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CreateBioActivity extends Activity {
    //public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_create_bio);

        Intent intent = getIntent();

        String messageText = intent.getStringExtra("message");

        TextView messageView = (TextView)findViewById(R.id.bio);

        messageView.setText(messageText);
    }
}
