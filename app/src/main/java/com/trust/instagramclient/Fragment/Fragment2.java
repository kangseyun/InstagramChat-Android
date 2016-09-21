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
import com.trust.instagramclient.Adapter.f2Adapter;
import com.trust.instagramclient.Model.f1Model;
import com.trust.instagramclient.Model.f2Model;
import com.trust.instagramclient.R;

import java.util.ArrayList;
import java.util.List;


public class Fragment2 extends Fragment {

    private Context context;
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.f2_recycler_view);
        mRecyclerView.setHasFixedSize(false);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);


        // specify an adapter (see also next example)
        mAdapter = new f2Adapter(getUserInformation(), context);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }
    private List<f2Model> getUserInformation() {

        List<f2Model> userList = new ArrayList<>();
        userList.add(new f2Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f2Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f2Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f2Model("강세윤", R.drawable.ic_face_black_36dp));

        return userList;
    }

}
