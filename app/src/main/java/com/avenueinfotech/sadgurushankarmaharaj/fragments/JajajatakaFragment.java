package com.avenueinfotech.sadgurushankarmaharaj.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.avenueinfotech.sadgurushankarmaharaj.R;

/**
 * Created by suken on 23-11-2016.
 */

public class JajajatakaFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_jajajataka,container,false);
        return rootView;
    }
}
