package com.zyp.progressbardemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * Created by zyp on 2018/6/20.
 */

public class MainActivity extends AppCompatActivity {

    private ColorProgressBar bar;
    private EditText mEditText;
    private String mTrim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bar = (ColorProgressBar) findViewById(R.id.bar);
        mEditText = (EditText) findViewById(R.id.et);
        Button bt = (Button) findViewById(R.id.bt);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mTrim = mEditText.getText().toString().trim();
                if (!TextUtils.isEmpty(mTrim)) {
                    bar.setMaxProgress(100);
                    bar.setCurrentProgress(Float.parseFloat(mTrim));
                } else {
                    Toast.makeText(MainActivity.this,"请输入数字",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
