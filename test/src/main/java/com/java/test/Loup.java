package com.java.test;

public class Loup {

	private Orientation orientation;

	public Loup() {
		super();
		this.orientation = Orientation.NORD;
	}

	public void tourner() {

		switch (orientation) {
		case NORD:
			orientation = Orientation.EST;
			break;
		case EST:
			orientation = Orientation.SUD;
			break;
		case SUD:
			orientation = Orientation.OUEST;
			break;
		case OUEST:
			orientation = Orientation.NORD;
			break;

		default:
			break;
		}

	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

}
