package com.example.cleancoimbatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;

public class Setting extends AppCompatActivity {

    Switch sw1,sw2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        sw1 = (Switch) findViewById(R.id.switch1);
        sw2 = (Switch)findViewById(R.id.switch2);
        sw1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw1.isChecked())
                    Toast.makeText(Setting.this,"Notification Alert Turned ON",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Setting.this,"Notification Alert Turned OFF",Toast.LENGTH_SHORT).show();
            }
        });

        sw2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sw2.isChecked())
                    Toast.makeText(Setting.this,"Sound Alert Turned ON",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(Setting.this,"Sound Alert Turned OFF",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
