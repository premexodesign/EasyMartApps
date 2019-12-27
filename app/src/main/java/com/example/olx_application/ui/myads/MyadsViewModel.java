package com.example.olx_application.ui.myads;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyadsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyadsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is MyAds fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
