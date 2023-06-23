package com.example.cashcoachnew;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class LearnFragment extends Fragment {

    ImageButton personalBtn, familyBtn, investBtn;

    PersonalFragment personalFragment = new PersonalFragment();

    FamilyFragment familyFragment = new FamilyFragment();

    InvestFragment investFragment = new InvestFragment();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_learn, container, false);

        personalBtn = rootView.findViewById(R.id.personalBtn);
        familyBtn = rootView.findViewById(R.id.familyBtn);
        investBtn = rootView.findViewById(R.id.investBtn);

        // Set initial navbar to home
        FragmentManager fragmentManager = getChildFragmentManager();

        fragmentManager.beginTransaction().replace(R.id.learnFrameLayout, personalFragment).commit();

        personalBtn.setOnClickListener(e -> {
            fragmentManager.beginTransaction().replace(R.id.learnFrameLayout, personalFragment).commit();
        });

        familyBtn.setOnClickListener(e -> {
            fragmentManager.beginTransaction().replace(R.id.learnFrameLayout, familyFragment).commit();
        });

        investBtn.setOnClickListener(e -> {
            fragmentManager.beginTransaction().replace(R.id.learnFrameLayout, investFragment).commit();
        });

        return rootView;
    }
}