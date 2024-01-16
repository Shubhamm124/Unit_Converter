package session9;

//This is TimeConverter class. It has 2 variables and 4 normal methods.

public class TimeConverter {
	int minValue;
	int secValue;

	// This method convert from hours to minutes. It has 1 parameter as hValue.
	public float hoursToMin(float hValue) {
		float value = hValue * 60.0f;
		return value;
	}

	// This method convert from minutes to hours. It has 1 parameter as minValue.
	public float minToHours(float minValue) {
		float value = minValue / 60.0f;
		return value;
	}

	// This method convert from hours to seconds. It has 1 parameter as hValue.
	public float hoursToSeconds(float hValue) {
		float value = hValue * 60.0f * 60.0f;
		return value;
	}

	// This method convert from seconds to hours. It has 1 parameter as secValue.
	public float secToHours(float secValue) {
		float value = secValue / (60.0f * 60.0f);
		return value;
	}

	public static void main(String[] args) {
		TimeConverter tconvert = new TimeConverter();// Object of class TimeConverter

		// To calculate the values from one time unit to other.
		float value1 = tconvert.hoursToMin(2.75f);
		float value2 = tconvert.minToHours(75);
		float value3 = tconvert.hoursToSeconds(3.5f);
		float value4 = tconvert.secToHours(10800);

		// To display the values after Conversion.
		System.out.println("The 2.75 Hours = " + value1 + " min");
		System.out.println("The 75 Minutes = " + value2 + " hours");
		System.out.println("The 3.5 Hours = " + value3 + " sec");
		System.out.println("The 10800 Seconds = " + value4 + " hours");
	}

}
