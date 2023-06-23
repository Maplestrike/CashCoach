package com.example.cashcoachnew;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class PersonalFragment extends Fragment {

    TextView learnMoreLbl;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_personal, container, false);

        learnMoreLbl = rootView.findViewById(R.id.learnMoreLbl);

        learnMoreLbl.setOnClickListener(e -> {
            Intent intent = new Intent(getActivity(), ArticleActivity.class);

            startActivity(intent);
        });

        return rootView;
    }
}