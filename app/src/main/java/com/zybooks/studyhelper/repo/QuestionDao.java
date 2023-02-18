package com.zybooks.studyhelper.repo;

/**
 * @author Bhairavi Patel - 11/22/2022
 */

import androidx.room.*;
import com.zybooks.studyhelper.model.Question;
import androidx.lifecycle.LiveData;
import java.util.List;

@Dao
public interface QuestionDao {
    @Query("SELECT * FROM Question WHERE id = :id")
    LiveData<Question> getQuestion(long id);

    @Query("SELECT * FROM Question WHERE subject_id = :subjectId ORDER BY id")
    LiveData<List<Question>> getQuestions(long subjectId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long addQuestion(Question question);

    @Update
    void updateQuestion(Question question);

    @Delete
    void deleteQuestion(Question question);


} // end interface
