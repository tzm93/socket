package com.device.Impl;

import com.device.IDevice;

public class XBOX implements IDevice{

	@Override
	public void plugin() {
		System.out.println("XBOX is plugged in");
	}

}
