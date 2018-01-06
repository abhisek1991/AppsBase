package com.volly.www.baseapp.NetworkReq.ObjectReq;

import com.android.volley.VolleyError;

import org.json.JSONObject;

/**
 * @author Abhisek
 */
public interface NetworkRequestListenerObj {
    /**
     * Success callback
     *
     * @param jsonResponse
     */
    void onSuccess(JSONObject jsonResponse);

    /**
     * Error callback
     *
     * @param error
     */
    void onError(VolleyError error);
}
