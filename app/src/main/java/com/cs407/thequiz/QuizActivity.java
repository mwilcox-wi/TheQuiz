package com.cs407.thequiz;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class QuizActivity extends FragmentActivity implements Q1Fragment.OnFragmentInteractionListener, Q2_Fragment.OnFragmentInteractionListener {

    //keeping track of # of correct answers
    int correct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        correct = 0;






        Q1Fragment q1 = new Q1Fragment();
        q1.setArguments(getIntent().getExtras());

        Q2_Fragment q2 = new Q2_Fragment();
        q2.setArguments(getIntent().getExtras());

        //TA implementation
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.quiz_fragment_container, q1)
                .addToBackStack(null)
                .commit();
        //TA end


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.


        return true;
    }

    public void onFragmentInteraction(Uri uri){

        Button q1_submit = (Button) findViewById(R.id.btn_q1_submit);
        final RadioButton toto = (RadioButton) findViewById(R.id.toto);
        q1_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Submit was clicked", Toast.LENGTH_LONG).show();

                if(toto.isChecked()){
                    correct++;
                    Toast.makeText(getApplicationContext(), "Toto is correct", Toast.LENGTH_LONG).show();
                }
            }
        });

        Button q2_submit = (Button) findViewById(R.id.btn_submit_q2);
        final EditText answer = (EditText) findViewById(R.id.answer);

        q1_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txt = answer.getText().toString();

                if(txt.equalsIgnoreCase("Mozambique") || txt.equalsIgnoreCase("Moz"))
                    correct++;

            }

        });




    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }
}





