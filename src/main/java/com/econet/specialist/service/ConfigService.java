package com.econet.specialist.service;

import com.econet.specialist.model.Config;

/**
 * Created by rubatsiro on 7/9/17.
 */
public interface ConfigService {
    public String getSinkUrl();

    public String getConfigUrl();

    public Config getConfig();

    public void setConfig(Config c);
}
