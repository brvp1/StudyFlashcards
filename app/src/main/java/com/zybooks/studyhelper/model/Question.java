package com.zybooks.studyhelper.model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;

import static androidx.room.ForeignKey.CASCADE;

/**
 * @author Bhairavi Patel - 11/3/2022
 */
@Entity(foreignKeys = @ForeignKey(entity = Subject.class, parentColumns = "id",
        childColumns = "subject_id", onDelete = CASCADE))
public class Question {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private long id;

    @ColumnInfo(name = "text")
    private String text;

    @ColumnInfo(name = "answer")
    private String answer;

    @ColumnInfo(name = "subject_id")
    private long subjectId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
    }
} // end class
