package com.cloud.demo.one.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：Jerry
 * @date ：Created in 2020/6/2 15:20
 */
@Slf4j
@Api(tags = "订单相关接口")
@RestController
@RequestMapping(value = "/api/order")
@CrossOrigin(origins = "*")
public class OrderController {

    @ApiOperation(value = "分页列表")
    @ApiImplicitParams({@ApiImplicitParam(name = "orderCode", value = "名称", required = true)})
    @GetMapping("/page")
    public String fingPage(@RequestParam(value = "orderCode") String orderCode) {
        log.info("hello order");
        return orderCode;
    }
}
