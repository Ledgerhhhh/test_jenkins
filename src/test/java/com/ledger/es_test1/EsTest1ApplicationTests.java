package com.ledger.es_test1;

import com.ledger.es_test1.res.ReqHeaderEnum;
import com.ledger.es_test1.res.ReqHeaderMap;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;

@SpringBootTest
@Slf4j
class EsTest1ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void get() {
        HashMap<String, Object> map = new HashMap<>();

        map.put("limit", 1);
        ReqHeaderMap reqHeaderMap = new ReqHeaderMap();

        reqHeaderMap.put(ReqHeaderEnum.AUTHORIZATION, "4534");


        //Object data = ResUtils.get("http://apis.juhe.cn/fapigx/esports/query", map, reqHeaderMap);


        //log.info(data.toString());

    }

    @Test
    void post() {



    }








}
