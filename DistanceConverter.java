package session9;

//This is DistanceConverter class. It has 2 variables and 4 normal methods.

public class DistanceConverter {

	long kmValue;
	long milesValue;

	// This method convert from meter to km. It has 1 parameter as meterValue.
	public float meterToKm(float meterValue) {
		float value = meterValue / 1000.0f;
		return value;
	}

	// This method convert from km to meter. It has 1 parameter as kmValue.
	public float kmToMeter(float kmValue) {
		float value = kmValue * 1000.0f;
		return value;
	}

	// This method convert from miles to km. It has 1 parameter as milesValue.
	public float milesToKm(float milesValue) {
		float value = milesValue * 1.60934f;
		return value;
	}

	// This method convert from km to miles. It has 1 parameter as kmValue.
	public float kmToMiles(float kmValue) {
		float value = kmValue / 1.60934f;
		return value;
	}

	public static void main(String[] args) {
		DistanceConverter myobj = new DistanceConverter();// Object of class DistanceConverter

		// To calculate the values from one distance unit to other.
		float op1 = myobj.meterToKm(1500);
		float op2 = myobj.kmToMeter(38.5f);
		float op3 = myobj.milesToKm(12);
		float op4 = myobj.kmToMiles(61);

		// To display the values of Distance conversion.
		System.out.println("The 1500 Meters = " + op1 + " km");
		System.out.println("The 38.5 Kilometers = " + op2 + " m");
		System.out.println("The 12 Miles = " + op3 + " km");
		System.out.println("The 61 Kilometers = " + op4 + " mi");
	}

}
