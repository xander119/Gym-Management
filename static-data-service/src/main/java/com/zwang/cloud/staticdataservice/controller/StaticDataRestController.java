package com.zwang.cloud.staticdataservice.controller;

import com.zwang.cloud.staticdataservice.comon.ResponseCustom;
import com.zwang.cloud.staticdataservice.comon.ResponsePage;
import com.zwang.cloud.staticdataservice.comon.StaticData;
import com.zwang.cloud.staticdataservice.comon.StaticDataRequestBody;
import com.zwang.cloud.staticdataservice.service.StaticDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staticData")
public class StaticDataRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StaticDataRestController.class);

    @Autowired
    StaticDataService staticDataService;

    @PostMapping("/list")
    public ResponseCustom<ResponsePage<StaticData>> listStaticData(@RequestBody StaticDataRequestBody staticDataRequestBody, BindingResult result) {
        LOGGER.debug("staticData LIST start ");
        List<StaticData> staticDataList = staticDataService.getStaticDataList(staticDataRequestBody);
        LOGGER.debug("staticData LIST start " + staticDataList.size());
        return ResponseCustom.success(ResponsePage.restPage(staticDataList));
    }

    @GetMapping("/show")
    public ResponseCustom<StaticData> staticData(@RequestParam(value = "id")
                                                  Long id) {

        LOGGER.debug("staticData Show start ");
        StaticData staticData = staticDataService.getStaticData(id);
        LOGGER.debug("staticData Show "+ staticData.getCode());
        if (staticData != null) {
            return ResponseCustom.success(staticData);
        } else {
            return ResponseCustom.failed("Unable to find by Id '" + id + "'");
        }
    }

    @PostMapping("/update/{id}")
    public ResponseCustom<StaticData> updateStaticData(@PathVariable("id") Long id,
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
