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
import com.trust.instagramclient.Adapter.f3Adapter;
import com.trust.instagramclient.Model.f1Model;
import com.trust.instagramclient.R;

import java.util.ArrayList;
import java.util.List;


public class Fragment1 extends Fragment {
    private Context context;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        context = view.getContext();

        mRecyclerView = (RecyclerView) view.findViewById(R.id.f1_recycler_view);
        mRecyclerView.setHasFixedSize(false);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);


        // specify an adapter (see also next example)
        mAdapter = new f1Adapter(getUserInformation(), context);
        mRecyclerView.setAdapter(mAdapter);
        return view;
    }

    private List<f1Model> getUserInformation() {

        List<f1Model> userList = new ArrayList<>();
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f1Model("강세윤", R.drawable.ic_face_black_36dp));
        return userList;
    }





}
