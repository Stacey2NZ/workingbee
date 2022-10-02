package com.example.workingbee;

import androidx.room.Dao;
import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities= {User.class, Task.class, UserTask.class }, version = 1)
public abstract class WorkingBeeDB extends RoomDatabase {
    public abstract Dao dao();
}
