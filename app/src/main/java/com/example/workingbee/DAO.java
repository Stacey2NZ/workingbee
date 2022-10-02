package com.example.workingbee;

import androidx.room.Dao;
import androidx.room.Insert;

@Dao
public interface DAO {
    //Below are the methods needed to perform the required database actions.
    @Insert
    public void addUser(User user);

    public void removeUser(User user);

    public void addTask(Task task);

    public void removeTask(Task task);
}
