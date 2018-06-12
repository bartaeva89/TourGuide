package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class VeszpremFragment extends Fragment {
    public VeszpremFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.kinttenberg_name), getString(R.string.kinttenberg_address), R.drawable.kittenbergvadaspark));
        places.add(new Place(getString(R.string.dino_name), getString(R.string.dino_address), R.drawable.dinopark));
        places.add(new Place(getString(R.string.gizella_name), getString(R.string.gizella_address), R.drawable.gizellakapolna));
        places.add(new Place(getString(R.string.var_name), getString(R.string.var_address), R.drawable.veszpremvar));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
