/**
 * Copyright (c) 2018. [ Zexin Zhong ]
 *
 */

package com.sep.UniTrips.model.ImportCalendar;

import com.google.gson.annotations.SerializedName;

public class LoginBeans {

    @SerializedName("success")
    private String mSuccess;
    @SerializedName("token")
    private String mToken;

    public void setmSuccess(String mSuccess) {
        this.mSuccess = mSuccess;
    }

    public void setmToken(String mToken) {
        this.mToken = mToken;
    }

    public String getmSuccess() {

        return mSuccess;
    }

    public String getmToken() {
        return mToken;
    }
}
