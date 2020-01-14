/**
 *  Netatmo Outdoor Module
 *
 *  Copyright 2018 Glen
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
 */
metadata {
	definition (name: "Netatmo Outdoor Module", namespace: "cscheiene", author: "Glen") {
		capability "Carbon Dioxide Measurement"
		capability "Presence Sensor"
		capability "Relative Humidity Measurement"
		capability "Sound Pressure Level"
		capability "Sound Sensor"
		capability "Temperature Measurement"
	}


	simulator {
		// TODO: define status and reply messages here
	}

	tiles {
		// TODO: define your main and details tiles here
	}
}

// parse events into attributes
def parse(String description) {
	log.debug "Parsing '${description}'"
	// TODO: handle 'carbonDioxide' attribute
	// TODO: handle 'presence' attribute
	// TODO: handle 'humidity' attribute
	// TODO: handle 'soundPressureLevel' attribute
	// TODO: handle 'sound' attribute
	// TODO: handle 'temperature' attribute

}