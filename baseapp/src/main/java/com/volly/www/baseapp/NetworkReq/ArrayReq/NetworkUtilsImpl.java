package com.volly.www.baseapp.NetworkReq.ArrayReq;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.volly.www.baseapp.Application.AppController;
import com.volly.www.baseapp.NetworkReq.CustomRetryPolicy;

import org.json.JSONArray;

import java.util.Map;

/**
 * @author Abhisek
 */
public class NetworkUtilsImpl implements INetworkUtils {

    private static final int REQUEST_TIMEOUT = 5 * 1000;
    private static final int MAX_RETRIES = 3;
    private static final int BACKOFF_MULTIPLIER = 1;

    @Override
    public void executeJsonRequest(int method, StringBuilder endpoint, Map<String, String> urlParams, final NetworkRequestListener requestListener) {
        if (urlParams != null) {
            int i = 0;
            for (Map.Entry<String, String> entry : urlParams.entrySet()) {
                if (i == 0) {
                    endpoint.append("?");
                } else {
                    endpoint.append("&");
                }
                endpoint.append(entry.getKey()).append("=").append(entry.getValue());
                i++;
            }
        }

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(method, endpoint.toString(), null,
                new Response.Listener<JSONArray>() {

                    @Override
                    public void onResponse(JSONArray response) {
                        requestListener.onSuccess(response);

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                requestListener.onError(error);

            }
        }
        );

        jsonArrayRequest.setRetryPolicy(new CustomRetryPolicy(REQUEST_TIMEOUT, MAX_RETRIES, BACKOFF_MULTIPLIER));

        // Adding request to request queue
        AppController.getInstance().addToRequestQueue(jsonArrayRequest);
    }
}
