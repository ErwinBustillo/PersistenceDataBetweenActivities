package com.sem2v2.semana2video2;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void onClickGoBack(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextNumber);
        int value = Integer.valueOf(editText.getText().toString());
        Intent returnIntent = new Intent();
        //returnIntent.putExtra("valor",value);
        returnIntent.putExtra("valor",new Data(value,value));
        setResult(Activity.RESULT_OK,returnIntent);
        finish();
    }
}
