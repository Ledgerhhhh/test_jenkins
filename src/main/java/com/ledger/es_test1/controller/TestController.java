package com.ledger.es_test1.controller;


import com.ledger.es_test1.res.ContentTypeEnum;
import com.ledger.es_test1.res.HttpUtil;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

@RestController
public class TestController {

    @GetMapping("/getImage")
    public void getImage(HttpServletResponse httpServletResponse) {

        HashMap<String, String> stringStringHashMap = new HashMap<>();


        HttpUtil.getAndSend("https://bing.icodeq.com",null, null,httpServletResponse, ContentTypeEnum.IMAGE_JPEG);


    }


}
