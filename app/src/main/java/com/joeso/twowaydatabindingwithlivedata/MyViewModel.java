package com.joeso.twowaydatabindingwithlivedata;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    MyRepository myRepository=MyRepository.getInstance();
    public MutableLiveData<String> userName;

    public MyViewModel(){
        userName=new MutableLiveData<>();
        userName.setValue("");
    }

    public MutableLiveData<String> getUserName() {
        return myRepository.getUserName();
    }

//    public void setUserName(MutableLiveData<String> userName) {
//        myRepository.setUserName(userName);
//
//    }
}
