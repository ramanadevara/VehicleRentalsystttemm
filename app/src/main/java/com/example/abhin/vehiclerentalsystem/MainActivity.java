package com.example.abhin.vehiclerentalsystem;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Register;
    private Button Login;
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Register=(Button)findViewById(R.id.bregister);
        Login=(Button)findViewById(R.id.blogin);
        text=(TextView)findViewById(R.id.textView);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent regintent=new Intent(MainActivity.this,Register.class);
                startActivity(regintent);
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logintent=new Intent(MainActivity.this,login.class);
                startActivity(logintent);
            }
        });
    }
}
