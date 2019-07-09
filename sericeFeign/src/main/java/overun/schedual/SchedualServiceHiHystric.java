package overun.schedual;

import org.springframework.stereotype.Component;
import overun.service.FeignService;

/**
 * @ClassName: SchedualServiceHiHystric
 * @Description: 断路器的回调类(继承需要回调的接口)
 * @author: 薏米滴答-西安-ZhangPY
 * @version: V1.0
 * @date: 2019/7/9 14:59
 * @Copyright: 2019 www.yimidida.com Inc. All rights reserved.
 */

@Component
public class SchedualServiceHiHystric implements FeignService {


    @Override
    public String getClientRealiz() {
        return "服务异常-soap9299";
    }
}
