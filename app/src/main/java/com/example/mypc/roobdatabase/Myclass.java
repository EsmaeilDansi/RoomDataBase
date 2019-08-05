package com.example.mypc.roobdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "mytable")
public class Myclass
{
    @PrimaryKey(autoGenerate=true)
    private int id;

    @ColumnInfo(name = "usernmae")
    private String name;

    @ColumnInfo(name = "user_phone")
    private String phonenumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
