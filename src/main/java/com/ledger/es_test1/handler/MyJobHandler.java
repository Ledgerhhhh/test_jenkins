package com.ledger.es_test1.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;

public class MyJobHandler {

    @XxlJob("myJobHandlerTest")
    public ReturnT<String> myJobHandler(String param) {
        // 在这里编写你的任务逻辑
        System.out.println("myJobHandlerTest");
        // 返回任务执行结果
        return ReturnT.SUCCESS;
    }
}
