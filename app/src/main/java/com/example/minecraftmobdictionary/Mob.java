package com.example.minecraftmobdictionary;

import android.os.Parcelable;
import android.os.Parcel;

public class Mob {
    private int health;
    private int easyDamage;
    private int normalDamage;
    private int hardDamage;
    private String name;
    private int hostility;
    //      0 = passive
    //      1 = neutral
    //      2 = hostile
    //      3 = boss

    //      Constructor
    public Mob(int health, int easyDamage, int normalDamage, int hardDamage, String name, int isHostile){
    }

    //      Getters and Setters
    public int getHealth(){
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getEasyDamage(){
        return easyDamage;
    }
    public void setEasyDamage(int damage){
        this.easyDamage = damage;
    }
    public int getNormalDamage(){
        return normalDamage;
    }
    public void setNormalDamage(int damage){
        this.normalDamage = damage;
    }
    public int getHardDamage(){
        return hardDamage;
    }
    public void setHardDamage(int damage){
        this.hardDamage = damage;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getHostility(){
        return hostility;
    }
    public void setHostility(int hostile){
        this.hostility = hostile;
    }
}