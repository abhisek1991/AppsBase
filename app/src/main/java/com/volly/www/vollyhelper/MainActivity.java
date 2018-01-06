package com.volly.www.vollyhelper;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.volly.www.baseapp.NetworkReq.ObjectReq.NetworkRequestListenerObj;
import com.volly.www.baseapp.NetworkReq.ObjectReq.NetworkUtilsImpl;
import org.json.JSONObject;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    public static final String TAG = MainActivity.class.getSimpleName();



        private ProgressDialog mDialog;
        private String mEndpoint;
        private Map<String, String> mUrlParams;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            initEndpointAndUrlParams();
            setData();

        }




        private void initEndpointAndUrlParams() {
            //mEndpoint = Endpoint.LOGIN;
              mEndpoint = Endpoint.SAMPLE_OBJECT;
              //mUrlParams = new HashMap<>();
            //mUrlParams.put("username", mEditTextUsername.getText().toString());
            //mUrlParams.put("password", mEditTextPassword.getText().toString());
        }

        private void setData() {
            mDialog=new ProgressDialog(this);
            new NetworkUtilsImpl().executeJsonRequest(Request.Method.GET,new StringBuilder(mEndpoint),null, new NetworkRequestListenerObj() {


                @Override
                public void onSuccess(JSONObject jsonResponse) {
                    if (mDialog.isShowing()) {
                        mDialog.dismiss();
                    }
                    Log.e(TAG,jsonResponse.toString());

                    Toast.makeText(MainActivity.this,jsonResponse.toString(),Toast.LENGTH_LONG).show();

                }

                @Override
                public void onError(VolleyError error) {
                    if (mDialog.isShowing()) {
                        mDialog.dismiss();
                    }

                    Toast.makeText(MainActivity.this,error.toString(),Toast.LENGTH_LONG).show();

                }
            });
        }


}

