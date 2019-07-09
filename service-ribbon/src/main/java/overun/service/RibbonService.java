package overun.service;

/**
 * @ClassName: RibbonService
 * @Description:
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/6 11:25
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */
public interface RibbonService {


    /**
     * 负载均衡消费服务
     * @return
     */
    String balanceRibbon();

}
