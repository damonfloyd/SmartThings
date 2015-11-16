/**
 *  Copyright 2015 SmartThings
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *
 *  Momentary Button Tile - Normally on
 *
 *  Author: Damon Floyd
 *
 *  Date: 2015-09-08
 */
metadata {
	definition (name: "Momentary Double Pole Switch", namespace: "dfloyd", author: "Damon Floyd") {
		capability "Actuator"
		capability "Switch"
		capability "Momentary"
		capability "Sensor"
	}

	// simulator metadata
	simulator {
	}

	// UI tile definitions
	tiles {
		standardTile("switch", "device.switch", width: 2, height: 2, canChangeIcon: true) {
			state "on", label: 'On', action: "switch.on", backgroundColor: "#53a7c0", nextState: "nc"
			state "off", label: 'Off', action: "switch.off", backgroundColor: "#222222", nextState: "nc"
			state "nc", label: 'Push', action: "momentary.push", backgroundColor: "#ffffff"
		}
		main "switch"
		details "switch"
	}
}

def parse(String description) {
}


def push() {
/*
	sendEvent(name: "switch", value: "off", isStateChange: true, display: false)
	sendEvent(name: "switch", value: "on", isStateChange: true, display: false)
	sendEvent(name: "switch", value: "nc", isStateChange: true, display: false)
	sendEvent(name: "momentary", value: "pushed", isStateChange: true)
*/
}


def on() {
	sendEvent(name: "switch", value: "on", isStateChange: true, display: false)
	sendEvent(name: "switch", value: "nc", isStateChange: true, display: false)
/*	push()*/
}

def off() {
	sendEvent(name: "switch", value: "off", isStateChange: true, display: false)
	sendEvent(name: "switch", value: "nc", isStateChange: true, display: false)
/*	push()*/
}
