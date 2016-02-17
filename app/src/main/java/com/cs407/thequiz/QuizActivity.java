package com.cs407.thequiz;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;

public class QuizActivity extends FragmentActivity implements Q1Fragment.OnFragmentInteractionListener, Q2_Fragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        Q1Fragment q1 = new Q1Fragment();
        q1.setArguments(getIntent().getExtras());

        Q2_Fragment q2 = new Q2_Fragment();
        q2.setArguments(getIntent().getExtras());

        //TA implementation
        getFragmentManager()
                .beginTransaction()
                .replace(R.id.quiz_fragment_container, q2)
                .addToBackStack(null)
                .commit();
        //TA end





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.


        return true;
    }

    public void onFragmentInteraction(Uri uri){}

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        return super.onOptionsItemSelected(item);
    }
}





