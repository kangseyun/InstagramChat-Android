package com.trust.instagramclient.Model;

/**
 * Created by vcs-server on 9/12/16.
 */
public class f1Model {
    private String title;
    private int profile;

    public f1Model(String title, int profile) {
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
