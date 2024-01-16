package session9;

//This is CurrencyConverter class. It has 3 variables and 6 normal methods.

public class CurrencyConverter {
	double dollarValue = 83.19;// Value of 1$ in rs
	double euroValue = 91.16;// Value of 1€ in rs
	double yenValue = 0.58;// Value of 1¥ in rs

	// This method convert Dollar to indian Rupees. It has 1 parameter as dvalue.
	public float dollarToInr(float dvalue) {
		float value = dvalue * 83.19f;
		return value;
	}

	// This method convert indian Rupees to Dollar. It has 1 parameter as inrValue.
	public float inrToDollar(float inrValue) {
		float value = inrValue / 83.19f;
		return value;
	}

	// This method convert Euro to indian Rupees. It has 1 parameter as evalue.
	public float euroToInr(float evalue) {
		float value = evalue * 91.16f;
		return value;
	}

	// This method convert indian Rupees to Euro. It has 1 parameter as inrValue.
	public float inrToEuro(float inrValue) {
		float value = inrValue / 91.16f;
		return value;
	}

	// This method convert Yen to indian Rupees. It has 1 parameter as yvalue.
	public float yenToInr(float yvalue) {
		float value = yvalue * (58.0f / 100.0f);
		return value;
	}

	// This method convert indian Rupees to Yen. It has 1 parameter as inrValue.
	public float inrToYen(float inrValue) {
		float value = inrValue / 0.58f;
		return value;
	}

	public static void main(String[] args) {
		CurrencyConverter cconvert = new CurrencyConverter();// Object of class CurrencyConverter

		// To Calculate the values from one currency to other.
		float value1 = cconvert.dollarToInr(72);
		float value2 = cconvert.inrToDollar(176);
		float value3 = cconvert.euroToInr(45);
		float value4 = cconvert.inrToEuro(789);
		float value5 = cconvert.yenToInr(5000);
		float value6 = cconvert.inrToYen(176);

		// To display the values after Conversion.
		System.out.println("The value of 72$ is : " + value1 + " rs");
		System.out.println("The value of 176 Rs is : " + value2 + " $");
		System.out.println("The value of 45€ is : " + value3 + " rs");
		System.out.println("The value of 789 Rs is : " + value4 + " €");
		System.out.println("The value of 5000¥ is : " + value5 + " rs");
		System.out.println("The value of 176 Rs is : " + value6 + " ¥");

	}

}
