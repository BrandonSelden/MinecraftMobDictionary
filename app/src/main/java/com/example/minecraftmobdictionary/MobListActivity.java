package com.example.minecraftmobdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.List;

public class MobListActivity extends AppCompatActivity {

    private ListView mobsListView;
    private List<Mob> mobsList;

    public static final String MOB = "Mob";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob_list);
        wireWidgets();
        setListeners();
        setMobs();
    }
    @Override
    protected void onStart(){
        super.onStart();
    }

    public void wireWidgets(){
        mobsListView = findViewById(R.id.listView_main_mobList);
    }

    public void setListeners(){
        mobsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Mob clickedMob = mobsList.get(i);
                Intent mobIntent = new Intent(MobListActivity.this, MobDetailActivity.class);
                mobIntent.putExtra(MOB, mobsList.indexOf(clickedMob));
                startActivity(mobIntent);
            }
        });
    }

    public void setMobs(){
        Mob bat = new Mob(6, 0, 0, 0, "Bat", 0);
        Mob cat = new Mob(10, 0, 0, 0, "Cat", 0);
        Mob chicken = new Mob(4, 0, 0, 0, "Chicken", 0);
        Mob cod = new Mob(3, 0, 0, 0, "Cod", 0);
        Mob cow = new Mob(10, 0, 0, 0, "Cow", 0);
        Mob donkey = new Mob(30, 0, 0, 0, "Donkey", 0);
        Mob fox = new Mob(10, 0, 0, 0, "Fox", 0);
    }
}

