package com.econet.specialist.serviceImpl;

import com.econet.specialist.model.Config;
import com.econet.specialist.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

/**
 * Created by rubatsiro on 7/9/17.
 */
@Service
public class ConfigServiceImpl implements ConfigService{

    @Autowired
    private Environment environment;

    private Config config;
    @Override
    public Config getConfig() {
    return config;
}
    @Override
    public void setConfig(Config c) {
        config=c;
    }

    @Override
    public String getSinkUrl() {
        return environment.getProperty(getSinkUrl());
    }

    @Override
    public String getConfigUrl() {
        return environment.getProperty(getConfigUrl());
    }
}
