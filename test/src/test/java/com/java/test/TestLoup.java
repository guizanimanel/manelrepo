package com.java.test;

import junit.framework.TestCase;

public class TestLoup extends TestCase {

	public void testInitialPosition() {

		final Loup loup = new Loup();
		assertEquals(loup.getOrientation(), Orientation.NORD);

	}

	public void testTourner() {
		final Loup loup = new Loup();
		loup.tourner();
		assertEquals(loup.getOrientation(), Orientation.EST);
	}

}
