package com.joeso.twowaydatabindingwithlivedata;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    MutableLiveData<User> userData =new MutableLiveData<>();
    User user=new User();

    public MyViewModel(){
        userData.setValue(user);
    }

    public MutableLiveData<User> getUserData() {
        return userData;
    }

    public void setUserData(String name) {
        this.user.setName(name);
        userData.setValue(user);
    }


}
