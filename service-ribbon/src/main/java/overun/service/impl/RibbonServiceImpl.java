package overun.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import overun.service.RibbonService;

/**
 * @ClassName: RibbonServiceImpl
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/6 11:25
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */

@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    RestTemplate restTemplate;

    /**
     * @HystrixCommand熔断器 、 当服务的提供者异常不能正常调用，则调用fallbackMethod返回提示信息
     * @return
     */
    @HystrixCommand(fallbackMethod = "isError")
    @Override
    public String balanceRibbon() {

        /** 调用服务提供者 */
        return restTemplate.getForObject("http://eureka-client/port",String.class);

    }

    /**
     * 熔断器的回调
     * @return
     */
    public String isError() {
        return "调用错误-soap9299";
    }
}
