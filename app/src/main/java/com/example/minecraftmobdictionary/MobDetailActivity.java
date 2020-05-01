package com.example.minecraftmobdictionary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Rating;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MobDetailActivity  extends AppCompatActivity {

    private EditText name;
    private Text health;
    private EditText healthNum;

    private Mob mob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob_detail);

        Intent lastIntent = getIntent();
        mob = lastIntent.getParcelableExtra(MobListActivity.MOB);
        if(mob == null){
            mob = new Mob();
        }
        else {
            name.setText(mob.getName());
            healthNum.setText(mob.getHealth());

        }
    }



}
