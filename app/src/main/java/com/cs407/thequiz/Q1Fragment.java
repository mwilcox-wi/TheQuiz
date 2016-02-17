package com.cs407.thequiz;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link Q1Fragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link Q1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Q1Fragment extends Fragment implements View.OnClickListener{
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_Q1 = "Question 1";
    private static final String ARG_Q2 = "Question 2";

    int correct;
    View view;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public Q1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Q1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Q1Fragment newInstance(String param1, String param2) {
        Q1Fragment fragment = new Q1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_Q1, param1);
        args.putString(ARG_Q2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_Q1);
            mParam2 = getArguments().getString(ARG_Q2);
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view =  inflater.inflate(R.layout.fragment_q1, container, false);
        Button q1_submit = (Button) view.findViewById(R.id.btn_q1_submit);
        final RadioButton toto = (RadioButton) view.findViewById(R.id.toto);
        q1_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Toast.makeText(getActivity().getApplicationContext(), "Submit was clicked", Toast.LENGTH_LONG).show();
                if(toto.isChecked()){
                    Toast.makeText(getActivity().getApplicationContext(), "Toto is correct", Toast.LENGTH_LONG).show();

                }
                else{
                    Toast.makeText(getActivity().getApplicationContext(), "You are wrong", Toast.LENGTH_LONG).show();
                }



            }
        });

    return view;
    }



    // TODO: Rename method, update argument and hook method into UI event
    public void onClick(View v) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
