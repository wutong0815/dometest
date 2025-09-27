package org.example.demotest.designmodel.观察者模式.dome01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.xml.transform.Result;

public class LotteryServiceImpl implements LotteryService {

    private Logger logger = LoggerFactory.getLogger(LotteryServiceImpl.class);

    private MinibusTargetService minibusTargetService = new MinibusTargetService();
    @Override
    public String lottery(String uId) {

        String result = minibusTargetService.lottery(uId);
        logger.info("{}",result);
        logger.info("{}",uId);
        return new LotteryResult(result,uId).toString();
    }
}
