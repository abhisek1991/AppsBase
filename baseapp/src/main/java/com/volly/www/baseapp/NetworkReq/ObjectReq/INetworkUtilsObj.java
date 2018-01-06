package com.volly.www.baseapp.NetworkReq.ObjectReq;

import com.volly.www.baseapp.NetworkReq.ArrayReq.NetworkRequestListener;

import java.util.Map;

/**
 * Created by Abhisek
 */
public interface INetworkUtilsObj {

    /**
     * Creates JsonRequest
     *
     * @param method
     * @param endpoint
     * @param urlParams
     * @param requestListener
     */
    void executeJsonRequest(int method, StringBuilder endpoint, Map<String, String> urlParams, NetworkRequestListenerObj requestListenerobj);
}
