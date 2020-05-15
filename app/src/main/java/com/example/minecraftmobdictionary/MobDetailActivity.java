package com.example.minecraftmobdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MobDetailActivity  extends AppCompatActivity {

    private String name;
    private int health;
    private int easyDamage;
    private int normalDamage;
    private int hardDamage;
    private int hostility;

    private TextView staticName;
    private TextView staticMobType;
    private TextView staticMobHealth;
    private TextView staticDamage;
    private TextView staticEasyDamage;
    private TextView staticNormalDamage;
    private TextView staticHardDamage;

    private Mob mob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob_detail);

        Intent lastIntent = getIntent();
        mob = lastIntent.getParcelableExtra(MobListActivity.MOB);
        if(mob == null){
            mob = new Mob(0, 0, 0, 0, "", 0);
        }
        else {
            name = mob.getName();
            health = mob.getHealth();
            easyDamage = mob.getEasyDamage();
            normalDamage = mob.getNormalDamage();
            hardDamage = mob.getHardDamage();
            hostility = mob.getHostility();
        }

        wireWidgets();
    }

    private void wireWidgets(){
        staticName = findViewById(R.id.textView_mobDetail_name);
        staticMobType = findViewById(R.id.textView_mobDetail_mobType);
        staticMobHealth = findViewById(R.id.textView_mobDetail_health);

    }

}
