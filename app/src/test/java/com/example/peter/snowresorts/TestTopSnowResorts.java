package com.example.peter.snowresorts;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Peter on 07/11/2017.
 */

public class TestTopSnowResorts {

    TopSnowResorts topSnowResorts;

    @Before
    public void before(){
        topSnowResorts = new TopSnowResorts();
    }

    @Test
    public void hasSnowResorts(){
        assertEquals(8, topSnowResorts.numResorts());
    }
}
