package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DebrecenFragment extends Fragment {
    public DebrecenFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);
        final ArrayList<Place> places = new ArrayList<Place>();
        places.add(new Place(getString(R.string.nagytemplom_name), getString(R.string.nagytemplom_address), R.drawable.debrecennagytemplom));
        places.add(new Place(getString(R.string.botanikus_name), getString(R.string.bences_address), R.drawable.egyetemibotanikuskert));
        places.add(new Place(getString(R.string.modem_name), getString(R.string.modem_address), R.drawable.modem));
        places.add(new Place(getString(R.string.nagytemplom_name), getString(R.string.nagytemplom_address), R.drawable.refkol));
        places.add(new Place(getString(R.string.kerekerdo_name), getString(R.string.kerekerdo_address), R.drawable.elmenypark));
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }
}
