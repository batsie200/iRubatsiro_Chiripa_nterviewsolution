package com.econet.specialist.service;

import com.econet.specialist.model.Msg;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by rubatsiro on 7/10/17.
 */
public interface MsgService extends CrudRepository<Msg, Integer> {

}
