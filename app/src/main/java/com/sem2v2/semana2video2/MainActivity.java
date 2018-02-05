package com.sem2v2.semana2video2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButton(View view) {
        Intent i = new Intent(this,SecondActivity.class);
        startActivityForResult(i,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1){
            if ( resultCode == RESULT_OK){
                //int result = data.getIntExtra("valor",0);
                Data returnData=(Data) data.getSerializableExtra("value");
                TextView tv = (TextView) findViewById(R.id.textResultado);
                tv.setText(returnData.value1 + "");
            }
        }
    }
}
