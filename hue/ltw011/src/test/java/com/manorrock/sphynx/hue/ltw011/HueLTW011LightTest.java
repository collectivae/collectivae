/*
 * Copyright (c) 2002-2021 Manorrock.com. All Rights Reserved.
 *
 * Redistribution and use in source and binary forms, with or without 
 * modification, are permitted provided that the following conditions are met:
 *
 *   1. Redistributions of source code must retain the above copyright notice, 
 *      this list of conditions and the following disclaimer.
 *   2. Redistributions in binary form must reproduce the above copyright
 *      notice, this list of conditions and the following disclaimer in the
 *      documentation and/or other materials provided with the distribution.
 *   3. Neither the name of the copyright holder nor the names of its 
 *      contributors may be used to endorse or promote products derived from
 *      this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package com.manorrock.sphynx.hue.ltw011;

import com.manorrock.sphynx.hue.bridge.DefaultHueBridge;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * The JUnit test for the HueLTW011Light class.
 *
 * @author Manfred Riem (mriem@manorrock.com)
 */
public class HueLTW011LightTest {
    
    /**
     * Test setBrightness method.
     */
    @Test
    public void testSetBrightness() {
        if (!System.getProperty("sphynx.hue.ltw011.id").equals("")) {
            DefaultHueBridge bridge = new DefaultHueBridge();
            bridge.setBaseUrl(System.getProperty("sphynx.hue.bridge.baseUrl"));
            bridge.setUsername(System.getProperty("sphynx.hue.bridge.username"));
            HueLTW011Light light = new HueLTW011Light();
            light.setId(Integer.valueOf(System.getProperty("sphynx.hue.ltw011.id")));
            light.setBridge(bridge);
            light.setOn(true);
            light.setBrightness(50);
            int brightness = light.getBrightness();
            light.setOn(false);
            assertEquals(50, brightness);
        }
    }
    
    /**
     * Test getId method.
     */
    @Test
    public void testGetId() {
        if (!System.getProperty("sphynx.hue.ltw011.id").equals("")) {
            HueLTW011Light light = new HueLTW011Light();
            light.setId(Integer.valueOf(System.getProperty("sphynx.hue.ltw011.id")));
            assertEquals((int) Integer.valueOf(System.getProperty("sphynx.hue.ltw011.id")), light.getId());
        }
    }
    
    /**
     * Test getBridge method.
     */
    @Test
    public void testGetBridge() {
        if (!System.getProperty("sphynx.hue.ltw011.id").equals("")) {
            DefaultHueBridge bridge = new DefaultHueBridge();
            HueLTW011Light light = new HueLTW011Light();
            light.setBridge(bridge);
            assertEquals(bridge, light.getBridge());
        }
    }
    
    /**
     * Test setOn method.
     */
    @Test
    public void testSetOn() {
        if (!System.getProperty("sphynx.hue.ltw011.id").equals("")) {
            DefaultHueBridge bridge = new DefaultHueBridge();
            bridge.setBaseUrl(System.getProperty("sphynx.hue.bridge.baseUrl"));
            bridge.setUsername(System.getProperty("sphynx.hue.bridge.username"));
            HueLTW011Light light = new HueLTW011Light();
            light.setBridge(bridge);
            light.setId(Integer.valueOf(System.getProperty("sphynx.hue.ltw011.id")));
            light.setOn(true);
        }
    }
    
    /**
     * Test setOn method.
     */
    @Test
    public void testSetOn2() {
        if (!System.getProperty("sphynx.hue.ltw011.id").equals("")) {
            DefaultHueBridge bridge = new DefaultHueBridge();
            bridge.setBaseUrl(System.getProperty("sphynx.hue.bridge.baseUrl"));
            bridge.setUsername(System.getProperty("sphynx.hue.bridge.username"));
            HueLTW011Light light = new HueLTW011Light();
            light.setBridge(bridge);
            light.setId(Integer.valueOf(System.getProperty("sphynx.hue.ltw011.id")));
            light.setOn(false);
        }
    }
}
