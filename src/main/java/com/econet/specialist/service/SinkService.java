package com.econet.specialist.service;

import com.econet.specialist.model.Msg;

/**
 * Created by rubatsiro on 7/9/17.
 */
public interface SinkService {
    public void process(Msg msg);
}
