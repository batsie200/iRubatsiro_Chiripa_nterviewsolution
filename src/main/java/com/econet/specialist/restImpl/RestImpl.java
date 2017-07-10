package com.econet.specialist.restImpl;

import com.econet.specialist.model.Config;
import org.slf4j.LoggerFactory;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.Collections;


/**
 * Created by rubatsiro on 7/9/17.
 */
@Service
public class RestImpl {

    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(RestImpl.class);

    /* GET */
    protected static void checkConfig(){
        logger.info("################# Getting configs ############################");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        HttpEntity<Config> entity = new HttpEntity<>(headers);
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Config> config = restTemplate.exchange("http://localhost:8181/testbench/config",HttpMethod.GET,entity,Config.class);
          System.out.println(config);
    }
    public static void main(String []args){
        checkConfig();
    }
}

