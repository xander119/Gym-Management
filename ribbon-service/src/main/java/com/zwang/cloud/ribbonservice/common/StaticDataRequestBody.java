package com.zwang.cloud.ribbonservice.common;


import java.io.Serializable;

public class StaticDataRequestBody extends RequestPage implements Serializable {

    private String typeCode;

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }
}
