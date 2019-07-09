package overun.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import overun.service.RibbonService;

/**
 * @ClassName: RibbonController
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/6 11:24
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */

@Controller
public class RibbonController {

    @Autowired
    private RibbonService ribbonService;


    @RequestMapping(value = "/ribbon")
    @ResponseBody
    public String balanceRibbon() {
        return ribbonService.balanceRibbon();
    }

}
