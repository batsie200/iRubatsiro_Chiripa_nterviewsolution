package com.econet.specialist.restImpl;


import com.econet.specialist.model.Msg;
import com.econet.specialist.service.SinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

/**
 * Created by rubatsiro on 7/9/17.
 */
@RestController
public class MessageReceiverController {


    @Autowired
    private SinkService sinkService;

    @RequestMapping(value = "rest/msg",method = RequestMethod.POST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE})
    public Msg processMsg(@RequestBody Msg msg) {
        sinkService.process(msg);
        return msg;
    }


}
