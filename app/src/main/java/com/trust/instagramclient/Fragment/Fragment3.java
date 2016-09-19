package com.trust.instagramclient.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.trust.instagramclient.Activity.chatActivity;
import com.trust.instagramclient.RecyclerItemClickListener;
import com.trust.instagramclient.Adapter.f3Adapter;
import com.trust.instagramclient.Model.f3Model;
import com.trust.instagramclient.R;

import java.util.ArrayList;
import java.util.List;

public class Fragment3 extends Fragment {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment3, container, false);
        context = view.getContext();

        mRecyclerView = (RecyclerView) view.findViewById(R.id.f3_recycler_view);
        mRecyclerView.setHasFixedSize(false);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);


        // specify an adapter (see also next example)
        mAdapter = new f3Adapter(getUserInformation(), context);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(context, mRecyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // do whatever
                        Intent i = new Intent(view.getContext(), chatActivity.class);
                        startActivity(i);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
        return view;
    }

    private List<f3Model> getUserInformation() {

        List<f3Model> userList = new ArrayList<>();
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        userList.add(new f3Model("강세윤", R.drawable.ic_face_black_36dp));
        return userList;
    }

}
