package com.umangbudhwar.tdd;

public class PinCodeLocator {

	private static LocatorService service;
	
	public PinCodeLocator()
	{
		//this(service);
	}
	
	public PinCodeLocator(LocatorService location)
	{
		this.service = location;
	}
	
	public String getLocation(int pinCode) {
		return service.getLocation(pinCode);
	}

}
