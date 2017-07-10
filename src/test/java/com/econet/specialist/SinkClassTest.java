package com.econet.specialist;

import com.econet.specialist.model.Msg;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by rubatsiro on 7/10/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
public class SinkClassTest {

    Msg msg = new Msg();

    @Test
    public void testClassProperty(){
        assertThat(msg, hasProperty("source"));
        assertThat(msg, hasProperty("payload"));
        assertThat(msg, hasProperty("ref"));
    }
}
