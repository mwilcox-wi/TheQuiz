package com.cs407.thequiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FinishActivity extends AppCompatActivity {

    int correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);

        correct = QuizActivity.correct;

        TextView results = (TextView) findViewById(R.id.txt_results);
        TextView comment = (TextView) findViewById(R.id.txt_comment);

        results.setText("You scored "+correct+"/2!");
        switch(correct){
            case 0:
                comment.setText("Are you ignorant?");
                break;
            case 1:
                comment.setText("So close!");
                break;
            case 2:
                comment.setText("Are you a prince?");
                break;

        }

        Button btn_retry = (Button) findViewById(R.id.btn_retry);;

        btn_retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                
            }
        });


    }
}
