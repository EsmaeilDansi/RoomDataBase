package com.example.mypc.roobdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {Information.class,Newclass.class,Myclass.class},version = 6)
public abstract class MyDatabase extends RoomDatabase
{
    //public abstract MyDao myDao();
    public abstract NewDao newDao();
    public abstract Dao2 dao2();

}
