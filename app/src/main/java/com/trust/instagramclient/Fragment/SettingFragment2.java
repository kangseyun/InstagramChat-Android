package com.trust.instagramclient.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trust.instagramclient.Adapter.f1Adapter;
import com.trust.instagramclient.Model.f1Model;
import com.trust.instagramclient.R;

import java.util.ArrayList;
import java.util.List;


public class SettingFragment2 extends Fragment {
    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting2, container, false);
        context = view.getContext();

        return view;
    }

}
