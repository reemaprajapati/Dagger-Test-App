package com.example.otimus.testdaggerapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.otimus.testdaggerapp.api.HelloService;
import com.example.otimus.testdaggerapp.di.DaggerApplication;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    HelloService helloService;

    EditText et_userName;
    Button btn_ok;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_userName= (EditText) findViewById(R.id.et_userName);
        btn_ok=(Button)findViewById(R.id.btn_ok);
        DaggerApplication.component().inject(this);

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String greetingMessage=helloService.greet(et_userName.getText().toString());
                Toast.makeText(MainActivity.this, greetingMessage, Toast.LENGTH_SHORT).show();
            }
        });

    }
}
