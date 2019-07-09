package overun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import overun.service.FeignService;

/**
 * @ClassName: FeignController
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/6 16:34
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */

@Controller
public class FeignController {

    @Autowired
    private FeignService feignService;


    @RequestMapping(value = "/fegin" , method = RequestMethod.GET)
    @ResponseBody
    public String feignMrthodGet() {
        return feignService.getClientRealiz();
    }

}
