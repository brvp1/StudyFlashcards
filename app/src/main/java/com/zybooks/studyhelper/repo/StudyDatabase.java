package com.zybooks.studyhelper.repo;

/**
 * @author Bhairavi Patel - 11/22/2022
 */

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.zybooks.studyhelper.model.Question;
import com.zybooks.studyhelper.model.Subject;

@Database(entities = {Question.class, Subject.class}, version = 1)
public abstract class StudyDatabase extends RoomDatabase {
    public abstract QuestionDao questionDao();
    public abstract SubjectDao subjectDao();
    
    
} // end class
