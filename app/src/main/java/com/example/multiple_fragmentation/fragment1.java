package com.example.multiple_fragmentation;
// src/main/java/com/example/yourapp/multiple_fragmentation.java

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class fragment1 extends Fragment {

    public fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.first_fragment, container, false);

        Button button = view.findViewById(R.id.button_to_second_fragment);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity) getActivity()).loadSecondFragment();
            }
        });

        return view;
    }
}
