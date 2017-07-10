package com.econet.specialist.model;

import lombok.Getter;
import lombok.Setter;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.Map;

/**
 * Created by rubatsiro on 7/9/17.
 */

@Getter
@Setter
@XmlRootElement
public class Config {
    private Map<String,Integer> config;
    private int sinkRate;
}
