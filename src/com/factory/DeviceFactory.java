package com.factory;

import com.device.IDevice;
import com.device.Impl.PROJECTER;
import com.device.Impl.TV;
import com.device.Impl.XBOX;

public class DeviceFactory {

	public static IDevice produce(String device) {
		if ("TV".equals(device)) 
			return new TV();
			
		if ("XBOX".equals(device))
			return new XBOX();
			
		if ("PROJECTER".equals(device))
			return new PROJECTER();
		
		throw new IllegalArgumentException(device + " is not found");
	}
}
