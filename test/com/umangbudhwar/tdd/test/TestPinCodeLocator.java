package com.umangbudhwar.tdd.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.umangbudhwar.tdd.LocatorService;
import com.umangbudhwar.tdd.PinCodeLocator;

public class TestPinCodeLocator {

	@Test
	public void testIfPinCodeLocatorClassExists() {
		PinCodeLocator locator = new PinCodeLocator(null);
		assertNotNull(locator);
	}

	@Test
	public void testIfGetLocationMethodReturnsString() {
		LocatorService service = Mockito.mock(LocatorService.class);
		PinCodeLocator locator = new PinCodeLocator(service);
		String location = locator.getLocation(211006);
	}

	@Test
	public void testIf211006ReturnsAllahabad() {
		LocatorService service = Mockito.mock(LocatorService.class);

		Mockito.when(service.getLocation(211006)).thenReturn("Allahabad");

		PinCodeLocator locator2 = new PinCodeLocator(service);
		String area = locator2.getLocation(211006);
		assertEquals("Allahabad", area);
	}

}
