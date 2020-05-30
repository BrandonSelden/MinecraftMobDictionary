package com.example.minecraftmobdictionary;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MobListActivity extends AppCompatActivity {

    public static final String MOB = "Mob";

    private ListView mobsListView;
    private String[] mobNameArray;
    private List<Mob> mobsList = new ArrayList<Mob>();
    private MobAdapter mobAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob_list);
        wireWidgets();
        setMobs();
        mobNameArray = new String[mobsList.size()];
        for(int i = 0; i < mobsList.size(); i++) {
            mobNameArray[i] = mobsList.get(i).getName();
        }
    }

    @Override
    protected void onStart(){
        super.onStart();

        mobAdapter = new MobAdapter(mobsList);
        mobsListView.setAdapter(mobAdapter);
        mobsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Mob clickedMob = mobsList.get(i);
                Intent mobIntent = new Intent(MobListActivity.this, MobDetailActivity.class);
                mobIntent.putExtra(MOB, clickedMob);
                startActivity(mobIntent);
            }
        });
    }

    public void wireWidgets(){
        mobsListView = findViewById(R.id.ListView_mobList_Mobs);
    }

    public void setMobs(){
        Mob bat = new Mob(6, 0, 0, 0, "Bat", 0);
        mobsList.add(bat);
        Mob cat = new Mob(10, 0, 0, 0, "Cat", 0);
        mobsList.add(cat);
        Mob chicken = new Mob(4, 0, 0, 0, "Chicken", 0);
        mobsList.add(chicken);
        Mob cod = new Mob(3, 0, 0, 0, "Cod", 0);
        mobsList.add(cod);
        Mob cow = new Mob(10, 0, 0, 0, "Cow", 0);
        mobsList.add(cow);
        Mob donkey = new Mob(30, 0, 0, 0, "Donkey", 0);
        mobsList.add(donkey);
        Mob fox = new Mob(10, 2, 2, 2, "Fox", 0);
        mobsList.add(fox);
        Mob horse = new Mob(22, 0, 0, 0, "Horse", 0);
        mobsList.add(horse);
        Mob mooshroom = new Mob(10, 0, 0, 0, "Mooshroom", 0);
        mobsList.add(mooshroom);
        Mob mule = new Mob(22,0, 0, 0, "Mule", 0);
        mobsList.add(mule);
        Mob ocelot = new Mob(10, 3, 3, 3, "Ocelot", 0);
        mobsList.add(ocelot);
        Mob parrot = new Mob(6, 0, 0, 0, "Parrot", 0);
        mobsList.add(parrot);
        Mob pig = new Mob (10, 0, 0, 0, "Pig", 0);
        mobsList.add(pig);
        Mob pufferfish = new Mob(3, 2, 3, 4, "Pufferfish", 0);
        mobsList.add(pufferfish);
        Mob rabbit = new Mob(3, 0, 0, 0, "Rabbit", 0);
        mobsList.add(rabbit);
        Mob salmon = new Mob(3, 0, 0, 0, "Salmon", 0);
        mobsList.add(salmon);
        Mob sheep = new Mob(8, 0, 0, 0, "Sheep", 0);
        mobsList.add(sheep);
        Mob skeletonHorse = new Mob(15, 0, 0, 0, "Skeleton Horse", 0);
        mobsList.add(skeletonHorse);
        Mob snowGolem = new Mob(4, 0, 0, 0, "Snow Golem", 0);
        mobsList.add(snowGolem);
        Mob squid = new Mob(10, 0, 0, 0, "Squid", 0);
        mobsList.add(squid);
        Mob tropicalFish = new Mob(3, 0, 0, 0, "Tropical Fish", 0);
        mobsList.add(tropicalFish);
        Mob turtle = new Mob(30, 0, 0, 0, "Turtle", 0);
        mobsList.add(turtle);
        Mob villager = new Mob(20, 0, 0, 0, "Villager", 0);
        mobsList.add(villager);
        Mob trader = new Mob(20, 0, 0, 0, "Wandering Trader", 0);
        mobsList.add(trader);
        Mob bee = new Mob(10, 2, 2, 3, "Bee", 1);
        mobsList.add(bee);
        Mob caveSpider = new Mob(12, 2, 2, 3, "Cave Spider", 1);
        mobsList.add(caveSpider);
        Mob dolphin = new Mob(10, 2, 3, 4, "Dolphin", 1);
        mobsList.add(dolphin);
        Mob enderman = new Mob(40, 4, 7, 10, "Enderman", 1);
        mobsList.add(enderman);
        Mob ironGolem = new Mob(100, 4, 7, 10, "Iron Golem", 1);
        mobsList.add(ironGolem);
        Mob llama = new Mob(17, 1, 1, 1, "Llama", 1);
        mobsList.add(llama);
        Mob panda = new Mob(20, 6, 6, 6, "Panda", 1);
        mobsList.add(panda);
        Mob polarBear = new Mob(30, 4, 6, 9, "Polar Bear", 1);
        mobsList.add(polarBear);
        Mob spider = new Mob(16, 2, 2, 3, "Spider", 1);
        mobsList.add(spider);
        Mob wolf = new Mob(8, 2, 2, 3, "Wolf", 1);
        mobsList.add(wolf);
        Mob zombiePigman = new Mob(20, 5, 8, 12, "Zombie Pigman", 1);
        mobsList.add(zombiePigman);
        Mob blaze = new Mob(20, 4, 6, 9, "Blaze", 2);
        mobsList.add(blaze);
        Mob chickenJockey = new Mob(20, 2, 3, 4, "Chicken Jockey", 2);
        mobsList.add(chickenJockey);
        Mob creeper = new Mob(20, 25, 49, 73, "Creeper", 2);
        mobsList.add(creeper);
        Mob drowned = new Mob(20, 5, 9, 12, "Drowned", 3);
        mobsList.add(drowned);
        Mob elderGuardian = new Mob(80, 5, 8, 12, "Elder Guardian", 2);
        mobsList.add(elderGuardian);
        Mob endermite = new Mob(8, 2, 2, 3, "Endermite", 2);
        mobsList.add(endermite);
        Mob evoker = new Mob(24, 4, 6, 9, "Evoker", 2);
        mobsList.add(evoker);
        Mob ghast = new Mob(30, 9, 17, 25, "Ghast", 2);
        mobsList.add(ghast);
        Mob guardian = new Mob(30, 4, 6, 9, "Guardian", 2);
        mobsList.add(guardian);
        Mob husk = new Mob(20, 2, 3, 4, "Husk", 2);
        mobsList.add(husk);
        Mob magmaCube = new Mob(16, 6, 6, 6, "Magma Cube", 2);
        mobsList.add(magmaCube);
        Mob phantom = new Mob(20, 2, 2, 3, "Phantom", 2);
        mobsList.add(phantom);
        Mob pillager = new Mob(24, 5, 5, 5, "Pillager", 2   );
        mobsList.add(pillager);
        Mob ravager = new Mob(100, 4, 4, 4, "Ravager", 2);
        mobsList.add(ravager);
        Mob shulker = new Mob(30, 4, 4, 4, "Shulker", 2);
        mobsList.add(shulker);
        Mob silverfish = new Mob(8, 1, 1, 1, "Silverfish", 2);
        mobsList.add(silverfish);
        Mob skeleton = new Mob(20, 3, 3, 3, "Skeleton", 2);
        mobsList.add(skeleton);
        Mob skeletonHorseman = new Mob(15, 3, 3, 3, "Skeleton Horseman", 2);
        mobsList.add(skeletonHorseman);
        Mob slime = new Mob(16, 3, 4, 6, "Slime", 2);
        mobsList.add(slime);
        Mob spiderJockey = new Mob(20, 2, 2, 3, "Spider Jockey", 2);
        mobsList.add(spiderJockey);
        Mob stray = new Mob(20, 2, 2, 3, "Stray", 2);
        mobsList.add(stray);
        Mob vex = new Mob(14, 5, 9, 13, "Vex", 2);
        mobsList.add(vex);
        Mob vindicator = new Mob(24, 7, 13, 19, "Vindicator", 2);
        mobsList.add(vindicator);
        Mob witch = new Mob(26, 6, 6, 6, "Witch", 2);
        mobsList.add(witch);
        Mob witherSkeleton = new Mob(20, 5, 8, 12, "Wither Skeleton", 2 );
        mobsList.add(witherSkeleton);
        Mob zombie = new Mob(20, 2, 3, 4, "Zombie", 2);
        mobsList.add(zombie);
        Mob zombieVillager = new Mob(20, 2, 3, 4, "Zombie Villager", 2  );
        mobsList.add(zombieVillager);
        Mob enderDragon = new Mob(200, 6, 10, 15, "Ender Dragon", 3);
        mobsList.add(enderDragon);
        Mob wither = new Mob(300, 5, 8, 12, "Wither", 3);
        mobsList.add(wither);
    }
    private class MobAdapter extends ArrayAdapter<Mob> {
        private List<Mob> mobList;

        public MobAdapter(List<Mob> mobList){
            super(MobListActivity.this, -1, mobList);
            this.mobList = mobList;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            LayoutInflater inflater = getLayoutInflater();
            if (convertView == null) {
                convertView = inflater.inflate(R.layout.moblist, parent, false);
            }
            TextView name = convertView.findViewById(R.id.textView_moblist_name);
            name.setText(mobList.get(position).getName());
            return convertView;
        }
    }
}