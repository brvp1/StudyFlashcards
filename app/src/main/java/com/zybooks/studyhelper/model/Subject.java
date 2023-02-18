package com.zybooks.studyhelper.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;

import org.jetbrains.annotations.NotNull;

/** @author Bhairavi Patel - 11/3/2022
 */
@Entity
public class Subject {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;
    @NotNull
    @ColumnInfo(name ="text")
    private String text;

    @ColumnInfo(name = "updated")
    private long updateTime;

    public Subject(@NonNull String text) {
        this.text = text;
        updateTime = System.currentTimeMillis();
    } // emd constructor

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(long updateTime) {
        this.updateTime = updateTime;
    }
} // end class
