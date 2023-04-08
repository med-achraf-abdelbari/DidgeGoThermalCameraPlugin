package com.mfc.flir;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import org.apache.cordova.CordovaPlugin;

public class ThermalCameraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("thermal_camera_activity", "layout", package_name));
    }

    protected void capture(){
    }

}