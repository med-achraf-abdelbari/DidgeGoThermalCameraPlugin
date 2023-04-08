package com.mfc.flir;

import android.app.Activity;
import android.os.Bundle;

public class ThermalCameraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("thermal_camera_activity", "layout", package_name));
    }

}