package com.example.android.tourguideapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class BudapestFragment extends Fragment {

    public BudapestFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.var_name), getString(R.string.var_address), R.drawable.budaivar));
        places.add(new Place(getString(R.string.halaszbastya_name), getString(R.string.halaszbastya_address), R.drawable.halaszbastya));
        places.add(new Place(getString(R.string.orszaghaz_name), getString(R.string.orszaghaz_address), R.drawable.orszaghaz));
        places.add(new Place(getString(R.string.szechenyi_name), getString(R.string.szechenyi_address), R.drawable.szechenyigyogyfurdo));
        places.add(new Place(getString(R.string.hosok_name), getString(R.string.hosok_address), R.drawable.hosoktere));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
