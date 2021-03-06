package com.example.minecraftmobdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView welcome;
    private Button trivia;
    private Button viewMobs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wireWidgets();

        setListeners();
    }

    public void wireWidgets(){
        welcome = findViewById(R.id.textView_main_welcome);
        trivia = findViewById(R.id.button_main_startQuiz);
        viewMobs = findViewById(R.id.button_main_viewMobs);
    }

    public void setListeners(){
        viewMobs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mobList = new Intent(MainActivity.this, MobListActivity.class);
                startActivity(mobList);
            }
        });
    }

}
