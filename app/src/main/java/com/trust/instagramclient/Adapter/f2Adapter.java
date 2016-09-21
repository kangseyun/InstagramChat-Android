package com.trust.instagramclient.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.trust.instagramclient.Model.f2Model;
import com.trust.instagramclient.R;

import java.util.List;

/**
 * Created by vcs-server on 9/12/16.
 */
public class f2Adapter extends RecyclerView.Adapter<f2Adapter.UserViewHolder>{
    private List<f2Model> userList;
    private Context context;

    public f2Adapter(List<f2Model> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.f2_card, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        f2Model user = userList.get(position);
        //holder.text.setText(user.getTitle());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }


    public static class UserViewHolder extends RecyclerView.ViewHolder {
        private TextView text;

        public UserViewHolder(View itemView) {
            super(itemView);
            //text = (TextView) itemView.findViewById(R.id.f3_item_content);
        }
    }
}
