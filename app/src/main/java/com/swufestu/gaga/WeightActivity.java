package com.swufestu.gaga;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class WeightActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");// HH:mm:ss
        Date date = new Date(System.currentTimeMillis());
        TextView time = (TextView)findViewById(R.id.time);
         final String str = simpleDateFormat.format(date);
        time.setText("今天是"+str);
        TextView textView = (TextView)findViewById(R.id.button_1);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText et1=(EditText)findViewById(R.id.edittext2);
                EditText et2=(EditText)findViewById(R.id.edittext1);
                Double height= Double.parseDouble(et1.getText().toString());
                Double weight= Double.parseDouble(et2.getText().toString());
                Intent intent = new Intent(WeightActivity.this,SecondActivity.class);
                intent.putExtra("data_height",height);
                intent.putExtra("data_weight",weight);
                startActivity(intent);
            }
        });
    }
}
