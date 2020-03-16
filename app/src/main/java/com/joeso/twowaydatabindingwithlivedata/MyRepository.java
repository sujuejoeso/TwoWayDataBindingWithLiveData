package com.joeso.twowaydatabindingwithlivedata;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MyRepository {

    private static MyRepository INSTANCE;
    private MutableLiveData<String> userName;

    private MyRepository() {
        userName=new MutableLiveData<>();
        userName.setValue("");
    }

    public static MyRepository getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new MyRepository();
        }
        return INSTANCE;
    }

    public MutableLiveData<String> getUserName() {
        return userName;
    }

//    public void setUserName(MutableLiveData<String> userName) {
//        this.userName = userName;
//
//    }
}
