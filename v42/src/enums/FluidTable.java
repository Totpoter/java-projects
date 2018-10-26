package enums;

public enum FluidTable {

	WATER(0.998, 4.19, 0, 100, 2260),
	SULFURACID(1.84, 1.38, 10, 336, 511),
	TURPENTINE(0.84, 1.75, -10, 180, 293),
	ETHANOL(0.789, 2.43, -117, 78.2, 841),
	GLYCOLE(1.113, 2.40, -16, 198, 800)
	
	;

	double density;
	double heatCapacity;
	double meltPoint;
	double boilPoint;
	double steamEntalpy;
	
	FluidTable(double d, double hc, double sp, double bp, double se) {
		density = d * 1E3;
		heatCapacity = hc * 1E3;
		meltPoint = sp;
		boilPoint = bp;
		steamEntalpy = se * 1E3;
	}

}