package com.example.mypc.roobdatabase;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
@Dao
public interface Dao2
{
    @Insert
    public void adduser(Myclass myclass);

    @Query("select * from  mytable")
    List<Myclass>getinfo();
}
