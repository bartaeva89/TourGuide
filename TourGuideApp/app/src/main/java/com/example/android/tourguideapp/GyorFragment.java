package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class GyorFragment extends Fragment {
    public GyorFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.bences_name), getString(R.string.bences_address), R.drawable.loyola));
        places.add(new Place(getString(R.string.eszeterhazy_name), getString(R.string.eszterhazy_address), R.drawable.eszterh_zy));
        places.add(new Place(getString(R.string.kovacs_name), getString(R.string.kovacs_address), R.drawable.kovacsmuzeum));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
