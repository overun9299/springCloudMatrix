package overun.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName: FeignService
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/6 16:30
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */

@FeignClient(value = "eureka-client")
public interface FeignService {

    @RequestMapping(value = "/port",method = RequestMethod.GET)
    String getClientRealiz();
}
