package com.ledger.es_test1.controller;


import com.ledger.es_test1.res.ContentTypeEnum;
import com.ledger.es_test1.res.HttpUtil;
import com.ledger.es_test1.res.Result;
import com.ledger.es_test1.util.FileUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;

@RestController
public class TestController {

    @Value("${profile}")
    private String profile;



    @GetMapping("/getImage")
    public void getImage(HttpServletResponse httpServletResponse) {

        HashMap<String, String> stringStringHashMap = new HashMap<>();


        HttpUtil.getAndSend("https://bing.icodeq.com", null, null, httpServletResponse, ContentTypeEnum.IMAGE_JPEG);
    }

    @GetMapping("/getVideo")
    public void getVideo(HttpServletResponse response) throws IOException {
        byte[] bytes = FileUtil.downloadFile("test.mp4", profile);
        response.setContentType(ContentTypeEnum.VIDEO_MP4.getContentType());
        PrintWriter writer = response.getWriter();
        writer.println(Arrays.toString(bytes));
        writer.flush();
        writer.close();

    }

    @GetMapping("/testJenkins")
    public Result<String> testJenkins(){
        return Result.success("testJenkins");
    }


}
