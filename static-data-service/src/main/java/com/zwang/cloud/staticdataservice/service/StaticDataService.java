package com.zwang.cloud.staticdataservice.service;


import com.zwang.cloud.staticdataservice.comon.StaticData;
import com.zwang.cloud.staticdataservice.comon.StaticDataRequestBody;

import java.util.List;

public interface StaticDataService {

    public List<StaticData> getStaticDataList(StaticDataRequestBody staticDataRequestBody);

    public StaticData getStaticData(Long staticDataId);

    Integer update(Long staticDataId, StaticData staticData);

    int create(StaticData staticData);
}
