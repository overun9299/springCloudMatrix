package overun.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: clientController
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/5 17:00
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */


@Controller
public class ClientController {

    @Value("${server.port}")
    private String port;


    @RequestMapping(value = "/port" , method = RequestMethod.GET)
    @ResponseBody
    public String getPort() {
        return "改应用的端口号：" + port;
    }
}
