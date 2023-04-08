package com.mfc.flir;

import android.content.Context;
import android.content.Intent;

import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * This class echoes a string called from JavaScript.
 */
public class DidgeGoThermalPlugin extends CordovaPlugin {

   public void initialize(CordovaInterface cordova, CordovaWebView webView) {
           super.initialize(cordova, webView);
       }


       @Override
       public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
           Context context = cordova.getActivity().getApplicationContext();
           if (action.equals("startThermalCamera")) {
               String message = args.getString(0);
               this.openNewActivity(context);
               return true;
           }
           else{
               if (action.equals("closeThermalCamera")) {
                   this.cordova.getActivity().finish();
                   return true;
               }
           }
           return false;
       }

       private void openNewActivity(Context context) {
               Intent intent = new Intent(context, ThermalCameraActivity.class);
               this.cordova.getActivity().startActivity(intent);
       }
}
