package com.example.bibliotecavirtual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

public class MainActivity<progress, btn> extends AppCompatActivity {

    private ProgressBar progress;
    private ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progress = (ProgressBar)findViewById(R.id.pb);
        btn = (ImageButton)findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new Task().execute();
    }
    });

        progress.setVisibility(View.INVISIBLE);
}

class Task extends AsyncTask<String, Void, String> {

    @Override
    protected void onPreExecute() {

        progress.setVisibility(View.VISIBLE);

    }


    @Override
    protected String doInBackground(String... strings) {

        for (int i = 1; i < 10; i++)
        {
            try {
                Thread.sleep(1000);
            }catch (Exception e)
            {
                e.printStackTrace();

            }
        }

        return null;
    }


    @Override
    protected void onPostExecute(String s) {

        Intent i = new Intent(getBaseContext(), github_act.class);
        startActivity(i);

    }
}



}