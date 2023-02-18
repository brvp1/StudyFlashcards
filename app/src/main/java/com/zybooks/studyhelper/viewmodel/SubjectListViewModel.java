package com.zybooks.studyhelper.viewmodel;

import android.app.Application;

import com.zybooks.studyhelper.model.Subject;
import com.zybooks.studyhelper.repo.StudyRepository;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.AndroidViewModel;
import java.util.List;

/**
 * @author Bhairavi Patel - 11/3/2022
 */

public class SubjectListViewModel extends AndroidViewModel {

    private final StudyRepository studyRepo;

    public SubjectListViewModel(Application application) {
        super(application); // add to the first line
        studyRepo = StudyRepository.getInstance(application.getApplicationContext());
    } // end constructor

    public LiveData<List<Subject>> getSubjects() {
        return studyRepo.getSubjects();
    } // end getSubjects

    public void addSubject(Subject subject) {
        studyRepo.addSubject(subject);
    } // end addSubject

    public void deleteSubject(Subject subject) {
        studyRepo.deleteSubject(subject);
    }
} // end class
