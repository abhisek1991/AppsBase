package com.volly.www.baseapp.NetworkReq.ArrayReq;

import com.android.volley.VolleyError;

import org.json.JSONArray;

/**
 * @author Abhisek
 */
public interface NetworkRequestListener {
    /**
     * Success callback
     *
     * @param jsonArray
     */
    void onSuccess(JSONArray jsonArray);

    /**
     * Error callback
     *
     * @param error
     */
    void onError(VolleyError error);
}
