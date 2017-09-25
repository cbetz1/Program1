package com.example.chad.program1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Call onSendMessage() when the button is clicked
    public void onGenerateBio(View view) {
        EditText firstNameView = (EditText)findViewById(R.id.first_name);
        EditText lastNameView = (EditText)findViewById(R.id.last_name);
        EditText schoolView = (EditText)findViewById(R.id.school);
        EditText yearGradView = (EditText)findViewById(R.id.year_grad);
        EditText degreeView = (EditText)findViewById(R.id.degree);
        EditText majorView = (EditText)findViewById(R.id.major);
        EditText favActivitiesView = (EditText)findViewById(R.id.fav_activities);
        String messageText = "Hello my name is " + firstNameView.getText().toString() + " " +
                lastNameView.getText().toString() + ". I attend(ed) " + schoolView.getText().toString()
                + " and graduate(d) in " + yearGradView.getText().toString() + " with a " +
                degreeView.getText().toString().toUpperCase() + " degree in " + majorView.getText().toString()
                + ". I enjoy " + favActivitiesView.getText().toString().toLowerCase() + ".";
        Intent intent = new Intent(this, CreateBioActivity.class);
        intent.putExtra("message", messageText);
        startActivity(intent);
    }
}
