package cn.gym.mgt.service;

import cn.gym.mgt.dto.StaticDataRequestBody;
import cn.gym.mgt.mbg.model.StaticData;

import java.util.List;

public interface StaticDataService {

    public List<StaticData> getStaticDataList(StaticDataRequestBody staticDataRequestBody);

    public StaticData getStaticData(Long staticDataId);

    Integer update(Long staticDataId, StaticData staticData);

    int create(StaticData staticData);
}
