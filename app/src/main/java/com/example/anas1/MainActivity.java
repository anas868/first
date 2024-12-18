package com.example.anas1;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =findViewById(R.id.textView);
    }
    public void change_text(View view){
        textView.setText("welcome Anas");
    }
    public void finishApp(View view){
        finish();
        System.exit(0);
    }
}