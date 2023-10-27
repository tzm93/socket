package com.client;

import com.device.IDevice;
import com.factory.DeviceFactory;

public class Client {
	
	public static void main(String[] args) {
		IDevice device = DeviceFactory.produce("TV");
		device.plugin();
	}

}
