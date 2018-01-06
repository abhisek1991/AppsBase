package com.volly.www.baseapp.NetworkReq.ArrayReq;

import java.util.Map;

/**
 * Created by Abhisek
 */
public interface INetworkUtils {

    /**
     * Creates JsonRequest
     *
     * @param method
     * @param endpoint
     * @param urlParams
     * @param requestListener
     */
    void executeJsonRequest(int method, StringBuilder endpoint, Map<String, String> urlParams, NetworkRequestListener requestListener);
}
