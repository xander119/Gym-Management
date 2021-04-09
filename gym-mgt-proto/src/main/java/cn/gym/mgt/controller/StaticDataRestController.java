package cn.gym.mgt.controller;

import cn.gym.mgt.comon.ResponseCustom;
import cn.gym.mgt.comon.ResponsePage;
import cn.gym.mgt.dto.StaticDataRequestBody;
import cn.gym.mgt.mbg.model.StaticData;
import cn.gym.mgt.service.StaticDataService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "StaticDataController", description = "常量信息")
@RestController
@RequestMapping("/staticData")
public class StaticDataRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StaticDataRestController.class);

    @Autowired
    StaticDataService staticDataService;

    @ApiOperation("获取所有常量列表")
    @PostMapping("/list")
    public ResponseCustom<ResponsePage<StaticData>> listStaticData(@RequestBody StaticDataRequestBody staticDataRequestBody, BindingResult result) {
        LOGGER.debug("staticData LIST start ");
        List<StaticData> staticDataList = staticDataService.getStaticDataList(staticDataRequestBody);
        LOGGER.debug("staticData LIST start " + staticDataList.size());
        return ResponseCustom.success(ResponsePage.restPage(staticDataList));
    }

    @ApiOperation("获取一个常量")
    @GetMapping("/show")
    public ResponseCustom<StaticData> staticData(@RequestParam(value = "id")
                                                 @ApiParam("ID") Long id) {

        LOGGER.debug("staticData Show start ");
        StaticData staticData = staticDataService.getStaticData(id);
        LOGGER.debug("staticData Show "+ staticData.getCode());
        if (staticData != null) {
            return ResponseCustom.success(staticData);
        } else {
            return ResponseCustom.failed("Unable to find by Id '" + id + "'");
        }
    }

    @ApiOperation("更新常量")
    @PostMapping("/update/{id}")
    public ResponseCustom<StaticData> updateStaticData(@PathVariable("id") @ApiParam("常量ID") Long id,
                                                       @RequestBody StaticData staticData, BindingResult result) {
        ResponseCustom<StaticData> responseCustom;
        int count = staticDataService.update(id, staticData);
        if (count == 1) {
            responseCustom = ResponseCustom.success(staticData);
            LOGGER.debug("updateStaticData success:{}", staticData);
        } else {
            responseCustom = ResponseCustom.failed("操作失败");
            LOGGER.debug("updateStaticData failed:{}", staticData);
        }
        return responseCustom;
    }

    @ApiOperation("创建常量")
    @PostMapping("/create")
    public ResponseCustom<StaticData> createStaticData(@RequestBody StaticData staticData) {
        ResponseCustom<StaticData> responseCustom;
        int count = staticDataService.create(staticData);
        if (count == 1) {
            responseCustom = ResponseCustom.success(staticData);
            LOGGER.debug("createStaticData success:{}", staticData);
        } else {
            responseCustom = ResponseCustom.failed("操作失败");
            LOGGER.debug("createStaticData failed:{}", staticData);
        }
        return responseCustom;
    }


}
