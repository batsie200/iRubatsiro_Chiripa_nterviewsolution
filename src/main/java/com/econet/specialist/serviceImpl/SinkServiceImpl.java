package com.econet.specialist.serviceImpl;

import com.econet.specialist.model.Msg;
import com.econet.specialist.model.Util.SysConstants;
import com.econet.specialist.service.MsgService;
import com.econet.specialist.service.SinkService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

/**
 * Created by rubatsiro on 7/9/17.
 */
@Service
public class SinkServiceImpl implements SinkService {

    private final org.slf4j.Logger logger = LoggerFactory.getLogger(SinkServiceImpl.class);

    @Autowired
    private SysConstants sysConstants;
    @Autowired
    MsgService msgService;

    private int count = 0;

    @Override
    @Async
    public void process(Msg msg) {
        try{
        msg.setId("" + count++);
        sendMsg(msg);}catch (URISyntaxException ex){
            logger.error(ex.getMessage());
        }
    }

    private void sendMsg(Msg msg) throws URISyntaxException{
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
//        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON));
        RequestEntity<Msg> requestEntity = new RequestEntity(msg,headers,HttpMethod.POST,new URI("http://localhost:8182/testsolution/rest/msg"));
         if(requestEntity.getBody() != null){
             logger.info("ID "+ requestEntity.getBody().getId()+" Payload "+ requestEntity.getBody().getPayload()+" REF "+ requestEntity.getBody().getRef()+" Source "+ requestEntity.getBody().getSource());
             msgService.save(requestEntity.getBody());
         }
         else {
             logger.error("########### Error in sendMsg method #################");
         }

    }

}
