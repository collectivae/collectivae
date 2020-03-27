/*
 * Copyright (c) 2002-2020 Manorrock.com. All Rights Reserved.
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
package com.collectivae.device.huebridge;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbPropertyOrder;

/**
 * The state of Hue light.
 *
 * @author Manfred Riem (mriem@manorrock.com)
 */
@JsonbPropertyOrder({"on", "brightness", "colorTemperature"})
public class HueBridgeLightState {

    /**
     * Stores the brightness.
     */
    @JsonbProperty("bri")
    private Integer brightness;
    
    /**
     * Stores the color temperature.
     */
    @JsonbProperty("ct")
    private Integer colorTemperature;
    
    /**
     * Stores the on state.
     */
    @JsonbProperty("on")
    private Boolean on;

    /**
     * Constructor.
     */
    public HueBridgeLightState() {
    }

    /**
     * Get the brightness.
     * 
     * @return the brightness.
     */
    public Integer getBrightness() {
        return brightness;
    }

    /**
     * Get the color temperature.
     * 
     * @return the color temperature.
     */
    public Integer getColorTemperature() {
        return colorTemperature;
    }

    /**
     * Is the light on?
     *
     * @return true if it is, false otherwise.
     */
    public Boolean isOn() {
        return on;
    }

    /**
     * Set the brightness.
     * 
     * @param brightness the brightness.
     */
    public void setBrightness(Integer brightness) {
        this.brightness = brightness;
    }

    /**
     * Set the color temperature.
     * 
     * @param colorTemperature the color temperature.
     */
    public void setColorTemperature(Integer colorTemperature) {
        this.colorTemperature = colorTemperature;
    }

    /**
     * Turn the light on.
     *
     * @param on the on state.
     */
    public void setOn(Boolean on) {
        this.on = on;
    }
}
