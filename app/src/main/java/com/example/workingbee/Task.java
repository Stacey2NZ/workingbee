package com.example.workingbee;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Task") // Task refers to the tablename not the class below
public class Task {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "TaskID")
    private int taskID;

    @ColumnInfo(name = "TaskName")
    private String TaskName;

    @ColumnInfo(name = "TaskDescr")
    private String taskDescr;

    public int getTaskID() {
        return taskID;
    }

    public void setTaskID(int taskID) {
        this.taskID = taskID;
    }

    public String getTaskName() {
        return TaskName;
    }

    public void setTaskName(String taskName) {
        TaskName = taskName;
    }

    public String getTaskDescr() {
        return taskDescr;
    }

    public void setTaskDescr(String taskDescr) {
        this.taskDescr = taskDescr;
    }
}
