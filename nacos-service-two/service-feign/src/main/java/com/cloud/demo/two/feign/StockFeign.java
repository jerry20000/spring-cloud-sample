package com.cloud.demo.two.feign;

import com.cloud.demo.two.feign.service.StockFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ：Jerry
 * @date ：Created in 2020/6/2 16:43
 */
@FeignClient(value = "nacos-service-two",fallback = StockFeignImpl.class)
public interface StockFeign  {

    @RequestMapping(value = "/api/stock/page", method = RequestMethod.GET, consumes = "application/json")
    String fingPage(@RequestParam("stockCode") String stockCode);
}
