package com.ahim.mynotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void saveTapped(View view) {
        Log.i("info","Save button tapped.");
        @SuppressLint("WrongViewCast") EditText editText = (EditText) findViewById(R.id.editText);

        Toast.makeText(this, editText.getText().toString(), Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
