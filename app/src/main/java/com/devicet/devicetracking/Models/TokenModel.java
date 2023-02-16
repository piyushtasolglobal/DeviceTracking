package com.devicet.devicetracking.Models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class TokenModel {

@SerializedName("api_status")
@Expose
private Integer apiStatus;
@SerializedName("api_message")
@Expose
private String apiMessage;
@SerializedName("data")
@Expose
private Data data;

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

public Data getData() {
return data;
}

public void setData(Data data) {
this.data = data;
}

}