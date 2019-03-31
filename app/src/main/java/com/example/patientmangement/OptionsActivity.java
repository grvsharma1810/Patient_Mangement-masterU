package com.example.patientmangement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OptionsActivity extends AppCompatActivity {

    public void toPatientList(View view){

        Intent ii=new Intent(getApplicationContext(),PatientList.class);
        startActivity(ii);


    }

    public void toAddDetails(View view){

        Intent iii=new Intent(getApplicationContext(),AddPatientD.class);
        startActivity(iii);


    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
    }
}
