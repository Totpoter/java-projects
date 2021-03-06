package enums;

public class Library {
	public static double G = 6.673 * Math.pow(10, -11);
	public static double R = 8.314;
	public static double p_0 = 1000;
	public static double c = 299.792;
	public static double g_swe = 9.82;
/** 
 * Converts fahrenheit to celsius
 * @param fahrenheit Value to be converted to celsius
 * @return Returns the result
 */
double fahrenheitToCelsius(double fahrenheit) {
	return (fahrenheit - 32) / 1.8;
}
/**
 * 
 * @param kelvin Value to be converted to celsius
 * @return Returns the result
 */
double kelvinToCelsius(double kelvin) {
	return kelvin - 273.15;
}
    /**
     * Calculates fluid pressure on a certain depth
     * @param fluid The fluid
     * @param deep The depth
     * @return Pressure value
     */
public static double fluidPressure(FluidTable fluid, double deep) {
	return fluid.density * g_swe * deep;
}
/**	
 * Calculates water pressure on a certain depth
 * @param deep the depth
 * @return
 */
public static double pressureUnderWater(double deep) {
return fluidPressure(FluidTable.WATER, deep);	
}
/**	
 * 
 * @param mass
 * @param velocity
 * @return
 */
public static double kineticEnergy(double mass, double velocity) {
	
}
public static double potentialEnergy(double mass, double height) {
	
}
public static double fallSpeed(double height) {
	
}
public static double delta(double first, double last) {
	
}
public static double volumeToMass(FluidTable fluid, double volume) {
	
}
public static double volumeToMass(GasTable gas, double volume) {
	
}
public static double volumeToMass(SolidTable solid, double volume) {
	
}
public static double svtVelocity(double distance, double time) {
	
}
public static double svtDistance(double velocity, double time) {
	
}
public static double svtTime(double distance, double velocity) {
	
}
public static double work(double force, double distance) {
	
}
public static double power(double work, double time) {
	
}
public static double heat(SolidTable solid, double mass, double deltaT) {
	
}
public static double heat(FluidTable fluid, double volume, double deltaT) {
	
}
public static double heat(GasTable gas, double volume, double deltaT) {
	
}
public static double velocityToHeight(double velocity) {
	
}
}