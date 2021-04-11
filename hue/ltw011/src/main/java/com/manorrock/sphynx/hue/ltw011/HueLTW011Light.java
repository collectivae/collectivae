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

import com.manorrock.sphynx.hue.bridge.HueBridge;

/**
 * A Hue LTW011 light (White BR30).
 *
 * @author Manfred Riem (mriem@manorrock.com)
 * @see https://zigbee.blakadder.com/Philips_LTW011.html
 */
public class HueLTW011Light {

    /**
     * Stores the id of the light.
     */
    private int id;

    /**
     * Stores the Hue bridge we rely on.
     */
    private HueBridge bridge;

    /**
     * Set the brightness.
     *
     * @param brightness the brightness.
     */
    public void setBrightness(int brightness) {
        bridge.changeLightState(id, "bri", brightness);
    }

    /**
     * Get the Hue bridge.
     *
     * @return the Hue bridge.
     */
    public HueBridge getBridge() {
        return bridge;
    }

    /**
     * Get the brightness.
     *
     * @return the brightness.
     */
    public int getBrightness() {
        return Integer.valueOf(bridge.getLightState(id, "bri"));
    }

    /**
     * Get the id.
     *
     * @return the id.
     */
    public int getId() {
        return id;
    }

    /**
     * Turn the light off.
     */
    public void off() {
        bridge.changeLightState(id, "on", false);
    }

    /**
     * Turn the light on.
     */
    public void on() {
        bridge.changeLightState(id, "on", true);
    }

    /**
     * Set the Hue bridge.
     *
     * @param bridge the Hue bridge;
     */
    public void setBridge(HueBridge bridge) {
        this.bridge = bridge;
    }

    /**
     * Set the id.
     *
     * @param id the id.
     */
    public void setId(int id) {
        this.id = id;
    }
}
