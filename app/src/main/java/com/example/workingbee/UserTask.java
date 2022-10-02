package com.example.workingbee;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity (tableName = "UserTask") // UserTask refers to the tablename and not the class below
public class UserTask {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private int id;

    @ColumnInfo(name = "userID")
    private int userID;

    @ColumnInfo(name = "taskID")
    private int taskID;

    @ColumnInfo(name = "dateRecorded")
    private String dateRecorded;

    @ColumnInfo(name = "Comments")
    private String comments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getDateRecorded() {
        return dateRecorded;
    }

    public void setDateRecorded(String dateRecorded) {
        this.dateRecorded = dateRecorded;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
