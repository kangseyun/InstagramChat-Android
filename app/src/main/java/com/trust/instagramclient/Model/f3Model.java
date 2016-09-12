package com.trust.instagramclient.Model;

import android.widget.ImageView;

/**
 * Created by vcs-server on 9/12/16.
 */
public class f3Model {
    private String title;
    private int profile;

    public f3Model(String title, int profile) {
        this.title = title;
        this.profile = profile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }
}
