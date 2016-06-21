package com.nationwide.chapter8.davis;

public class Geometry {
	static double r;
	static double h;
	final static double pi = 3.14;
	private static double circumference;

	public Geometry(double radius, double height) {
		r = radius;
		h = height;
		circumference = (pi * (r * r));

	}

	public static double sphereVolume(double r) {
		double sphereVolumeAmt = (1.33 * circumference * r);
		System.out.printf("Sphere Volume Amt = %,.2f ", sphereVolumeAmt);
		return sphereVolumeAmt;

	}

	public static double sphereSurface(double r) {
		// https://www.google.com/?gws_rd=ssl#q=calculate+the+surface+of+a+sphere
		double sphereSurfaceArea = (4 * circumference);
		System.out.printf("\nSphereSurfaceArea = %,.2f ", sphereSurfaceArea);
		return sphereSurfaceArea;
	}

	public static double cylinderVolume(double r, double h) {
		double cylinderVolumeAmt = (circumference * h);
		System.out.printf("\nCylinder Volume Amt = %,.2f ", cylinderVolumeAmt);
		return cylinderVolumeAmt;
	}

	public static double cylinderSurface(double r, double h) {
		// cylinder = (2*(pi * r * h)) + (2 * circumference)
		double cylinderSurfaceArea = ((2 * (pi * r * h)) + (2 * circumference));
		System.out.printf("\nCylinder Surface Area = %,.2f ",
				cylinderSurfaceArea);
		return cylinderSurfaceArea;
	}

	public static double coneVolume(double r, double h) {
		// volume = ((pi * r * h) + (circumference))
		double coneVolumeAmt = ((pi * r * h) + (circumference));
		System.out.printf("\nCone Volume Amt = %, .2f ", coneVolumeAmt);
		return coneVolumeAmt;
	}

	public static double coneSurface(double r, double h) {
		// area = pi * r * h
		double coneSurfaceArea = pi * r * h;
		System.out.printf("\nCone Surface Area = %,.2f ", coneSurfaceArea);
		return coneSurfaceArea;
	}
};
