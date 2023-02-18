package com.zybooks.studyhelper.repo;

/**
 * @author Bhairavi Patel - 11/22/2022
 */

import androidx.room.*;
import com.zybooks.studyhelper.model.Subject;
import java.util.List;
import androidx.lifecycle.LiveData;

@Dao
public interface SubjectDao {
    @Query("SELECT * FROM subject WHERE :id")
    LiveData<Subject> getSubject(long id);

    @Query("SELECT * FROM Subject ORDER BY text COLLATE NOCASE")
    LiveData<List<Subject>> getSubjects();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long addSubject(Subject subject);

    @Update
    void updateSt(Subject subject);

    @Delete
    void deleteSubject(Subject subject);

} // end interface
