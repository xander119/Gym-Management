package com.zwang.cloud.staticdataservice.service;

import com.github.pagehelper.PageHelper;
import com.zwang.cloud.staticdataservice.comon.StaticData;
import com.zwang.cloud.staticdataservice.comon.StaticDataRequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StaticDataServiceImpl implements StaticDataService {

   /* @Autowired
    private StaticDataMapper staticDataMapper;
*/

    @Override
    public List<StaticData> getStaticDataList(StaticDataRequestBody staticDataRequestBody) {
        PageHelper.startPage(staticDataRequestBody.getPageNum(), staticDataRequestBody.getPageSize());
        /*StaticDataExample example = new StaticDataExample();
        if (StrUtil.isNotBlank(staticDataRequestBody.getTypeCode())) {
            example.createCriteria().andTypeCodeEqualTo(staticDataRequestBody.getTypeCode());
        }*/
        ArrayList<StaticData> staticData = new ArrayList<>();
        StaticData e = new StaticData();
        e.setActive(true);
        e.setCode("Code");
        e.setDescription("Description");
        e.setName("Name");
        e.setStaticDataId(9L);
        e.setTypeCode("TypeCode");

        staticData.add(e);
        return staticData;
    }

    @Override
    public StaticData getStaticData(Long id) {
        StaticData e = new StaticData();
        e.setActive(true);
        e.setCode("Code");
        e.setDescription("Description");
        e.setName("Name");
        e.setStaticDataId(9L);
        e.setTypeCode("TypeCode");

        return e;
    }

    @Override
    public Integer update(Long staticDataId, StaticData staticData) {

//        StaticData staticData1 = staticDataMapper.selectByPrimaryKey(staticDataId);
        staticData.setStaticDataId(staticDataId);
        StaticData e = new StaticData();
        e.setActive(true);
        e.setCode("UPDATED");
        e.setDescription("UPDATEDDescription");
        e.setName("UPDATEDName");
        e.setStaticDataId(9L);
        e.setTypeCode("TypeCode");
        return 1;
    }

    @Override
    public int create(StaticData staticData) {
        return 0;
    }
}
