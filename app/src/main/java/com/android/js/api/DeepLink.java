package com.android.js.api;

import android.net.Uri;
import android.app.Activity;
import android.content.Intent;

public class DeepLink {
    private Activity activity;

    public DeepLink(Activity activity){
        this.activity = activity;
    }

    public String getLink(){
        Intent intent = this.activity.getIntent();
        String action = intent.getAction();
        Uri data = intent.getData();
        if(data != null)
            return data.toString();
        else return "-1";
    }
}
