package mfc-flir-thermal-plugin;

import android.app.Activity;
import android.os.Bundle;

public class ThermalCameraActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String package_name = getApplication().getPackageName();
        setContentView(getApplication().getResources().getIdentifier("ThermalCameraActivity", "layout", package_name));
    }

}