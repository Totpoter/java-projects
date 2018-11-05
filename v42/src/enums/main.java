package enums;

public class main {
	double G = 6.673 * Math.pow(10, -11);
	double R = 8.314;
	double p_0 = 1000;
	double c = 299.792;
	double g_swe = 9.82;
public static void main(String[] args) {
	
}
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
double fluidPressure(FluidTable fluid, double deep) {
	return fluid.density * G * deep;
}
double pressureUnderWater(double deep) {
	
}
double kineticEnergy(double mass, double velocity) {
	
}
double potentialEnergy(double mass, double height) {
	
}
double fallSpeed(double height) {
	
}
double delta(double first, double last) {
	
}
double volumeToMass(FluidTable fluid, double volume) {
	
}
double volumeToMass(GasTable gas, double volume) {
	
}
double volumeToMass(SolidTable solid, double volume) {
	
}
double svtVelocity(double distance, double time) {
	
}
double svtDistance(double velocity, double time) {
	
}
double svtTime(double distance, double velocity) {
	
}
double work(double force, double distance) {
	
}
double power(double work, double time) {
	
}
double heat(SolidTable solid, double mass, double deltaT) {
	
}
double heat(FluidTable fluid, double volume, double deltaT) {
	
}
double heat(GasTable gas, double volume, double deltaT) {
	
}
double velocityToHeight(double velocity) {
	
}
}