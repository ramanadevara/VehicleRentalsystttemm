package com.example.abhin.vehiclerentalsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {
    private Button bike;
    private Button hatchback;
    private Button sedan;
    private Button suv;
    private Button premium;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        bike=(Button)findViewById(R.id.bbike);
        hatchback=(Button)findViewById(R.id.bhatchback);
        sedan=(Button)findViewById(R.id.bsedan);
        suv=(Button)findViewById(R.id.bsuv);
        premium=(Button)findViewById(R.id.bpremium);
        bike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bikeintent = new Intent(home.this, bikespecs.class);
                startActivity(bikeintent);
            }
        });
         bike.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent hatchbackintent = new Intent(home.this, bikespecs.class);
                 startActivity(hatchbackintent);
             }
         });
    }
}
