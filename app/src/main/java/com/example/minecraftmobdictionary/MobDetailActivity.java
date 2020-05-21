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
    private TextView mobType;
    private TextView mobHealth;
    private TextView easyDamageText;
    private TextView normalDamageText;
    private TextView hardDamageText;

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

        setDefaults();
    }

    private void wireWidgets(){
        staticName = findViewById(R.id.textView_mobDetail_name);
        staticMobType = findViewById(R.id.textView_mobDetail_staticMobType);
        staticMobHealth = findViewById(R.id.textView_mobDetail_staticHealth);
        staticDamage = findViewById(R.id.textView_mobDetail_staticDamage);
        staticEasyDamage = findViewById(R.id.textView_mobDetail_staticEasyDamage);
        staticNormalDamage = findViewById(R.id.textView_mobDetail_staticNormalDamage);
        staticHardDamage = findViewById(R.id.textView_mobDetail_staticHardDamage);
        mobType = findViewById(R.id.textView_mobDetail_mobType);
        mobHealth = findViewById(R.id.textView_mobDetail_mobHealth);
        easyDamageText = findViewById(R.id.textView_mobDetail_easyDamage);
        normalDamageText = findViewById(R.id.textView_mobDetail_normalDamage);
        hardDamageText = findViewById(R.id.textView_mobDetail_hardDamage);
    }

    private void setDefaults(){
        staticName.setText(name);
        mobHealth.setText(health);
        easyDamageText.setText(easyDamage);
        normalDamageText.setText(normalDamage);
        hardDamageText.setText(hardDamage);
        if(hostility == 0) {
            mobType.setText("Passive");
        }
        else if (hostility == 1){
            mobType.setText("Neutral");
        }
        else if (hostility == 2){
             mobType.setText("Hostile");
        }
        else{
            mobType.setText("Boss");
        }

    }

}
