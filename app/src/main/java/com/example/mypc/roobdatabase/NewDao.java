package com.example.mypc.roobdatabase;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface NewDao
{
    @Insert
    public void addcontact(Newclass newclass);

    @Query("select * from t1")
    List<Newclass>getinfo();
}
