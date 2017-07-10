package com.econet.specialist.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by rubatsiro on 7/9/17.
 */
@Entity
@Getter
@Setter
@Table(name = "Msg")
public class Msg {

    @Id
    private String id;
    private String source;
    private String payload;
    private String ref;
}
