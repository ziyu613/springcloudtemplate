package com.oceanwood.platform.dataservice.controller;

import com.oceanwood.platform.dataservice.service.KingTopMapService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 精图GIS服务控制器
 *
 * @author By TianF
 **/

@Api(description ="精图GIS服务控制器" ,tags ="精图GIS服务控制器" )
@RestController
@RequestMapping("/rest/kingTopService")
public class KingTopServerController {

    /**
     * 精图服务资源
     */
    @Autowired
    private KingTopMapService mapService;


}
