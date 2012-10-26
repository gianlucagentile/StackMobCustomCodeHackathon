
package com.stackmob.example;

import com.stackmob.core.customcode.CustomCodeMethod;
import com.stackmob.core.rest.ProcessedAPIRequest;
import com.stackmob.core.rest.ResponseToProcess;
import com.stackmob.sdkapi.SDKServiceProvider;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LiveVote implements CustomCodeMethod {

  @Override
  public String getMethodName() {
    return "live_vote";
  }

  @Override
  public List<String> getParams() {
    return new ArrayList<String>();
  }

  @Override
  public ResponseToProcess execute(ProcessedAPIRequest request, SDKServiceProvider serviceProvider) {
    Map<String, Object> map = new HashMap<String, Object>();
    map.put("msg", "This is a service for live vote!");
    return new ResponseToProcess(HttpURLConnection.HTTP_OK, map);
  }

}
