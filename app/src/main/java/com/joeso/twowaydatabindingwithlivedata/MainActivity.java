package com.joeso.twowaydatabindingwithlivedata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.joeso.twowaydatabindingwithlivedata.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBinding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        mBinding.setLifecycleOwner(this);
        mBinding.setMViewModel(ViewModelProviders.of(this).get(MyViewModel.class));

        mBinding.nameSet.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                mBinding.getMViewModel().setUserData(mBinding.nameSet.getText().toString());
                return true;
            }
        });

    }
}
