package com.usypchuk.andrewanthonyproject;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view1 = inflater.inflate(R.layout.fragment_main, container, false);

        Button butt1; //Create button
        butt1 = view1.findViewById(R.id.buttonx); //find the button in the display

        butt1.setOnClickListener(new Button.OnClickListener() {   //set a listener to wait for it to be pressed
            @Override
            public void onClick(View v) {                       //when it is pressed do this stuff (View v is the button)

                TextView text1 = getActivity().findViewById(R.id.text1);

                if(text1.getVisibility() == View.INVISIBLE)
                    text1.setVisibility(View.VISIBLE);
                else
                    text1.setVisibility(View.INVISIBLE);
            }
        });

        return view1;

    }
}
