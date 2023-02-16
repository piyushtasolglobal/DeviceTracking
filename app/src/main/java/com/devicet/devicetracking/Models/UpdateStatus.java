package com.devicet.devicetracking.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UpdateStatus {

@SerializedName("api_status")
@Expose
private Integer apiStatus;
@SerializedName("api_message")
@Expose
private String apiMessage;

public Integer getApiStatus() {
return apiStatus;
}

public void setApiStatus(Integer apiStatus) {
this.apiStatus = apiStatus;
}

public String getApiMessage() {
return apiMessage;
}

public void setApiMessage(String apiMessage) {
this.apiMessage = apiMessage;
}

}