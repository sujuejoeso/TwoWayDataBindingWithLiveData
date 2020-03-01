package com.joeso.twowaydatabindingwithlivedata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

public class MyRepository {
    MutableLiveData<User> userData;
    User user;

    public MyRepository(){
        user=new User();
        userData=new MutableLiveData<>();
        userData.setValue(user);
    }

    public MutableLiveData<User> getUserData() {
        return userData;
    }

    public void setUserData(MutableLiveData<User> userData) {
        this.userData = userData;
    }
}
