package com.example.minecraftmobdictionary;

import android.os.Parcelable;
import android.os.Parcel;

public class Mob {

    private int health;
    private int damage;
    private String name;
    private boolean isHostile;


    //      Constructor

    public Mob(){

    }

    //      Getters and Setters

    public int getHealth(){
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage(){
        return damage;
    }

    public void setDamage(int damage){
        this.damage = damage;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean getHostility(){
        return isHostile;
    }

    public void setHostility(boolean hostile){
        this.isHostile = hostile;
    }
}
