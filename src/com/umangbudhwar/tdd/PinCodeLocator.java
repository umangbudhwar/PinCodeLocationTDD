package com.umangbudhwar.tdd;

public class PinCodeLocator {

	private LocatorService service;

	public PinCodeLocator(LocatorService location) {
		this.service = location;
	}

	public String getLocation(int pinCode) {
		return service.getLocation(pinCode);
	}

}
