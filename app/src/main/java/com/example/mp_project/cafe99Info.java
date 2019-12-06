package com.example.mp_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class cafe99Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe99_info);

        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String snippet=intent.getStringExtra("snippet");

        TextView T1=(TextView)findViewById(R.id.title);
        TextView D1=(TextView)findViewById(R.id.detail);

        T1.setText(name);
        D1.setText(snippet);
    }
}
