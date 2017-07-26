package com.example.mac.appfragments;

import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

/**
 * Created by mac on 23/07/17.
 */

public class RestauFragment extends Fragment {

    public RestauFragment() {
    }

    // newInstance constructor for creating fragment with arguments
    public static RestauFragment newInstance(int page, String title) {
        RestauFragment fragmentFirst = new RestauFragment();

        return fragmentFirst;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.grid,container,false);

        ArrayList<Restau> restaus=new ArrayList<>();
        restaus.add(new Restau(R.drawable.soldenapoles,"Sol de Napoles"));
        restaus.add(new Restau(R.drawable.labrasserie,"La Brasserie"));

        RestauAdapter resadapter=new RestauAdapter(getActivity(),R.layout.layout_design,restaus);

        GridView grid=(GridView)view.findViewById(R.id.gridview);
        grid.setAdapter(resadapter);
        return view;
    }
}
