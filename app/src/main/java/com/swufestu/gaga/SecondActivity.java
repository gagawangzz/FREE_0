package com.swufestu.gaga;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        double height = intent.getDoubleExtra("data_height",0.00);
        double weight = intent.getDoubleExtra("data_weight",0.00);
        TextView tv =(TextView) findViewById(R.id.textView2);
        tv.setText("您的标准体重是"+(height-70)*0.6+"千克");
        if(weight<(height-70)*0.6-5){
            tv.setText("您的标准体重是"+(height-70)*0.6+"千克，您的身材有些偏瘦，请注意营养。");
        }
        else {
            if (weight > (height - 70) * 0.6 + 5) {
                tv.setText("您的标准体重是" + (height - 70) * 0.6 + "千克,您的身材有些偏胖，请注意锻炼身体。");
            } else {
                tv.setText("您的标准体重是" + (height - 70) * 0.6 + "千克,您的身材太完美了，请继续保持。");
            }
        }

    }
}
