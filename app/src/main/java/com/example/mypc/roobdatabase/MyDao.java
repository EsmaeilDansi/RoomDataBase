package com.example.mypc.roobdatabase;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface MyDao
{
   @Insert
   public void adduser(Information information);

   @Query("select * from information")
   List <Information>getinformation();

}


