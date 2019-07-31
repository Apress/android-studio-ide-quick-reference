package net.workingdev.ch10jetpacknavigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class One extends Fragment {


  public One() {
    // Required empty public constructor
  }


  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container,
                           Bundle savedInstanceState) {
    // Inflate the layout for this fragment

    final View view = inflater.inflate(R.layout.fragment_one, container, false);
    view.findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Navigation.findNavController(view).navigate(R.id.action_one_to_two2);
      }
    });
    return view;
  }
}
