package com.zwang.cloud.ribbonservice.controller;


import com.zwang.cloud.ribbonservice.common.StaticDataRequestBody;
import com.zwang.cloud.ribbonservice.common.ResponseCustom;
import com.zwang.cloud.ribbonservice.common.ResponsePage;
import com.zwang.cloud.ribbonservice.common.StaticData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

//@Api(tags = "StaticDataController", description = "常量信息")
@RestController
@RequestMapping("/staticData")
public class StaticDataRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StaticDataRestController.class);

    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.gym-management}")
    private String gymServiceUrl;

    @PostMapping("/list")
    public ResponseCustom<ResponsePage<StaticData>> listStaticData(@RequestBody StaticDataRequestBody staticDataRequestBody, BindingResult result) {
//        List<StaticData> staticDataList = staticDataService.getStaticDataList(staticDataRequestBody);
//        return ResponseCustom.success(ResponsePage.restPage(staticDataList));
        LOGGER.info("gymServiceUrl: " + gymServiceUrl);
        return restTemplate.postForObject(gymServiceUrl + "/staticData/list", staticDataRequestBody, ResponseCustom.class);
    }

    @GetMapping("/show")
    public ResponseCustom<StaticData> staticData(@RequestParam(value = "id")
                                                 Long id) {
        LOGGER.info("gymServiceUrl: " + gymServiceUrl);
        return restTemplate.getForObject(gymServiceUrl + "/staticData/show?id="+id, ResponseCustom.class);

    }

    @PostMapping("/update/{id}")
    public ResponseCustom<StaticData> updateStaticData(@PathVariable("id")  Long id,
                                                       @RequestBody StaticData staticData, BindingResult result) {
        return restTemplate.postForObject(gymServiceUrl + "/staticData/update", staticData, ResponseCustom.class);
    }

    @PostMapping("/create")
    public ResponseCustom<StaticData> createStaticData(@RequestBody StaticData staticData) {
        return restTemplate.postForObject(gymServiceUrl + "/staticData/create", staticData, ResponseCustom.class);
    }


}
