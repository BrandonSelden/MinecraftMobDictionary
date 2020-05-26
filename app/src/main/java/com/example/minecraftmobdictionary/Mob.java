package com.example.minecraftmobdictionary;

import android.os.Parcelable;
import android.os.Parcel;

public class Mob implements Parcelable {
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
        this.health = health;
        this.easyDamage = easyDamage;
        this.normalDamage = normalDamage;
        this.hardDamage = hardDamage;
        this.name = name;
        this.hostility = isHostile;
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.health);
        dest.writeInt(this.easyDamage);
        dest.writeInt(this.normalDamage);
        dest.writeInt(this.hardDamage);
        dest.writeString(this.name);
        dest.writeInt(this.hostility);
    }

    protected Mob(Parcel in) {
        this.health = in.readInt();
        this.easyDamage = in.readInt();
        this.normalDamage = in.readInt();
        this.hardDamage = in.readInt();
        this.name = in.readString();
        this.hostility = in.readInt();
    }

    public static final Parcelable.Creator<Mob> CREATOR = new Parcelable.Creator<Mob>() {
        @Override
        public Mob createFromParcel(Parcel source) {
            return new Mob(source);
        }

        @Override
        public Mob[] newArray(int size) {
            return new Mob[size];
        }
    };
}