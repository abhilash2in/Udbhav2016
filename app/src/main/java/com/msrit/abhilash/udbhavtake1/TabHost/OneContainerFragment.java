package com.msrit.abhilash.udbhavtake1.TabHost;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.msrit.abhilash.udbhavtake1.Old.OneFragment;
import com.msrit.abhilash.udbhavtake1.R;

/**
 * Created by Abhilash on 12/01/2016.
 */
public class OneContainerFragment extends BaseContainerFragment {


    private boolean mIsViewInited;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.e("test", "tab 1 oncreateview");
        return inflater.inflate(R.layout.container_fragment, null);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("test", "tab 1 container on activity created");
        if (!mIsViewInited) {
            mIsViewInited = true;
            initView();
        }
    }

    private void initView() {
        Log.e("test", "tab 1 init view");
        replaceFragment(new OneFragment(), false);
    }


}