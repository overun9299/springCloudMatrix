package overun.service.impl;

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

    @Override
    public String balanceRibbon() {

        /** 调用服务提供者 */
        return restTemplate.getForObject("http://eureka-client/port",String.class);

    }
}
