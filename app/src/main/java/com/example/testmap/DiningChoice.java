package com.example.testmap;

import java.io.Serializable;

public class DiningChoice implements Serializable {
    private String mId;
    private String mName;

    public DiningChoice(String id, String name){
        this.mId = id;
        this.mName = name;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
