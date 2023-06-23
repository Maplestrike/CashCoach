package com.example.cashcoachnew;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    Button moreDetailsBtn, viewBudgetPlanBtn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        moreDetailsBtn = rootView.findViewById(R.id.moreDetailsBtn);
        viewBudgetPlanBtn = rootView.findViewById(R.id.viewBudgetPlanBtn);

        moreDetailsBtn.setOnClickListener(e -> {
            Intent intent = new Intent(getActivity(), PasswordActivity.class);

            startActivity(intent);
        });

        viewBudgetPlanBtn.setOnClickListener(e -> {
            Intent intent = new Intent(getActivity(), BudgetPlanActivity.class);

            startActivity(intent);
        });

        return rootView;
    }
}