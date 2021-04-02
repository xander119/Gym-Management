package cn.gym.mgt.gymmgtproto.service.impl;

import cn.gym.mgt.gymmgtproto.dto.StaticDataRequestBody;
import cn.gym.mgt.gymmgtproto.mbg.mapper.StaticDataMapper;
import cn.gym.mgt.gymmgtproto.mbg.model.StaticData;
import cn.gym.mgt.gymmgtproto.mbg.model.StaticDataExample;
import cn.gym.mgt.gymmgtproto.service.StaticDataService;
import cn.hutool.core.util.StrUtil;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaticDataServiceImpl implements StaticDataService {

    @Autowired
    private StaticDataMapper staticDataMapper;


    @Override
    public List<StaticData> getStaticDataList(StaticDataRequestBody staticDataRequestBody) {
        PageHelper.startPage(staticDataRequestBody.getPageNum(), staticDataRequestBody.getPageSize());
        StaticDataExample example = new StaticDataExample();
        if (StrUtil.isNotBlank(staticDataRequestBody.getTypeCode())) {
            example.createCriteria().andTypeCodeEqualTo(staticDataRequestBody.getTypeCode());
        }
        return staticDataMapper.selectByExample(example);
    }

    @Override
    public StaticData getStaticData(Long id) {
        return staticDataMapper.selectByPrimaryKey(id);
    }

    @Override
    public Integer update(Long staticDataId, StaticData staticData) {

//        StaticData staticData1 = staticDataMapper.selectByPrimaryKey(staticDataId);
        staticData.setStaticDataId(staticDataId);
        return staticDataMapper.updateByPrimaryKey(staticData);
    }

    @Override
    public int create(StaticData staticData) {
        return staticDataMapper.insertSelective(staticData);
    }
}
