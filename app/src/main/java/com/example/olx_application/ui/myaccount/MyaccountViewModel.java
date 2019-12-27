package com.example.olx_application.ui.myaccount;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyaccountViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MyaccountViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is myaccount fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
