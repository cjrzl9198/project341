package com.example.inputdata;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class inputDataActivity_trainer extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputdata);

        ArrayAdapter<CharSequence> adapter_Client = ArrayAdapter.createFromResource(this,
                R.array.ary_Client, android.R.layout.simple_spinner_item);
        adapter_Client.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner_Client = (Spinner) findViewById(R.id.spinner_Client);
        spinner_Client.setAdapter(adapter_Client);

        ArrayAdapter<CharSequence> adapter_Rep = ArrayAdapter.createFromResource(this,
                R.array.ary_Reps, android.R.layout.simple_spinner_item);
        adapter_Rep.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner_Rep = (Spinner) findViewById(R.id.spinner_Reps);
        spinner_Rep.setAdapter(adapter_Rep);

        ArrayAdapter<CharSequence> adapter_Exercise = ArrayAdapter.createFromResource(this,
                R.array.ary_Exercise, android.R.layout.simple_spinner_item);
        adapter_Exercise.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner_Exercise = (Spinner) findViewById(R.id.spinner_Exercise);
        spinner_Exercise.setAdapter(adapter_Exercise);

        Button button = findViewById(R.id.button_Submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(inputDataActivity_trainer.this, inputDataActivity_client.class);
                startActivity(intent);
            }
        });
    }

}

