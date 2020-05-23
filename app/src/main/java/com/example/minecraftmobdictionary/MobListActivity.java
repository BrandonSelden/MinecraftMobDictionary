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
    private List<Mob> mobsList = new List<Mob>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<Mob> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] a) {
            return null;
        }

        @Override
        public boolean add(Mob mob) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends Mob> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NonNull Collection<? extends Mob> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Mob get(int index) {
            return null;
        }

        @Override
        public Mob set(int index, Mob element) {
            return null;
        }

        @Override
        public void add(int index, Mob element) {

        }

        @Override
        public Mob remove(int index) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<Mob> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Mob> listIterator(int index) {
            return null;
        }

        @NonNull
        @Override
        public List<Mob> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    private MobAdapter mobAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mob_list);
        wireWidgets();
        setMobs();
        setListeners();
        for(int i = 0; i < mobsList.size(); i++) {
            mobNameArray[i] = mobsList.get(i).getName();
        }

    }

    @Override
    protected void onStart(){
        super.onStart();

        mobAdapter = new MobAdapter(mobsList);
        mobsListView.setAdapter(mobAdapter);
    }

    public void wireWidgets(){
        mobsListView = findViewById(R.id.ListView_mobList_Mobs);
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
        Mob fox = new Mob(10, 0, 0, 0, "Fox", 0);
        mobsList.add(fox);
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