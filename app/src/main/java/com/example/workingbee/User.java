package com.example.workingbee;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "User") //User refers to the tablename not the class below
public class User {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "UserID")
    private int userID;

    @ColumnInfo(name = "FirstName")
    private String firstName;

    public int getId() {
        return userID;
    }

    public void setId(int id) {
        this.userID = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @ColumnInfo(name = "LastName")
    private String lastName;
}
