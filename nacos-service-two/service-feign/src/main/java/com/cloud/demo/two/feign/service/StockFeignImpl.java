package com.cloud.demo.two.feign.service;

import com.cloud.demo.two.feign.StockFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author ：Jerry
 * @date ：Created in 2020/6/2 16:46
 */
@Slf4j
@Component
public class StockFeignImpl implements StockFeign {

    @Override
    public String fingPage(String stockCode) {
        log.info("降级");
        return "降级";
    }
}
