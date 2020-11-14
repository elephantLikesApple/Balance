package com.example.balance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class FourthFragment extends Fragment {
    // Store instance variables
    private String title;
    private int page;

    // newInstance constructor for creating fragment with arguments
    public static FourthFragment newInstance(int page, String title) {
        FourthFragment fragment = new FourthFragment();
        return fragment;
    }

    // Store instance variables based on arguments passed
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // final KonfettiView konfettiView = findViewById(R.id.konfettiView);
    }

    // Inflate the view for the fragment based on layout XML
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fourth, container, false);

//        TextView text1 = (TextView) view.findViewById(R.id.textView2);
//        TextView text2 = (TextView) view.findViewById(R.id.textView3);
//        text1.setTextColor(Color.BLACK);
//        text2.setTextColor(Color.BLACK);
        return view;
    }
}