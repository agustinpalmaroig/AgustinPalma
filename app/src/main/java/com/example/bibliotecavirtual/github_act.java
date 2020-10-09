package com.example.bibliotecavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class github_act extends AppCompatActivity {

    private Spinner spinner;
    private TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_github_act);

        spinner = (Spinner) findViewById(R.id.idspinner);

        String[] libros = {"Seleccione Libros", "Farenheith", "Revival", "El Alquimista", "El Poder", "Despertar"};
        ArrayAdapter<String> adapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, libros);
        spinner.setAdapter(adapt);

        txt = (TextView)findViewById(R.id.idtxtview);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                ejecuta(null);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }

    public void ejecuta(View v){

        if(spinner.getSelectedItem().toString().equals("Farenheith"))
        {
            txt.setText("El valor de "+ spinner.getSelectedItem().toString()+" es de : 7000 ");
        }

        if(spinner.getSelectedItem().toString().equals("Revival"))
        {
            txt.setText("El valor de "+ spinner.getSelectedItem().toString()+" es de : 22000 ");
        }

        if(spinner.getSelectedItem().toString().equals("El Alquimista"))
        {
            txt.setText("El valor de "+ spinner.getSelectedItem().toString()+" es de : 45000 ");
        }

        if(spinner.getSelectedItem().toString().equals("El Poder"))
        {
            txt.setText("El valor de "+spinner.getSelectedItem().toString()+" es de : 88000 ");
        }

        if(spinner.getSelectedItem().toString().equals("Despertar"))
        {
            txt.setText("El valor de "+spinner.getSelectedItem().toString()+" es de : 156000 ");
        }


    }

}