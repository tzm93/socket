package com.device.Impl;

import com.device.IDevice;

public class TV implements IDevice {

	@Override
	public void plugin() {
		System.out.println("TV is plugged in");
	}

}
