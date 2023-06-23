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
import android.widget.EditText;

public class ProfileFragment extends Fragment {

    Button logoutBtn;

    EditText nameTxt, emailTxt;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_profile, container, false);

        logoutBtn = rootView.findViewById(R.id.logoutBtn);
        nameTxt = rootView.findViewById(R.id.nameTxt);
        emailTxt = rootView.findViewById(R.id.emailTxt);

        SharedPreferences prefs = getActivity().getSharedPreferences("MyPrefs", Context.MODE_PRIVATE);
        nameTxt.setText(prefs.getString("name", null));
        emailTxt.setText(prefs.getString("email", null));

        logoutBtn.setOnClickListener(e -> {
            Intent intent = new Intent(getActivity(), LoginActivity.class);

            startActivity(intent);
        });

        return rootView;
    }
}