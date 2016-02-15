package com.cs407.thequiz;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.app.Fragment;

public class QuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);


        //TA implementation
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.quiz_fragment_container, QuizFragment.newInstance(null, null))
                .addToBackStack(null)
                .commit();
        //TA end


    }
}
