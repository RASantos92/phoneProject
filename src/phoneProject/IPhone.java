package phoneProject;

public class IPhone extends Phone implements Ringable {
	public IPhone(String versionNumber, String carrier) {
		super(versionNumber, carrier);
		this.batteryPercentage = 100;
		this.ringTone = "ZZzzZzZzaisdjf";
	}

	@Override
	public String ring() {
		String output = "";
		output += "Ring tone " + ringTone + "\n";
		output += "Ring tone " + ringTone + "\n";
		output += "Ring tone " + ringTone + "\n";
		output += "Ring tone " + ringTone + "\n";
		output += "Ring tone " + ringTone + "\n";
		return output;
	}

	@Override
	public String unlock() {
		String output = "";
		output += "****************************************" + "\n";
		output += "****************************************" + "\n";
		output += "unlocking iphone via facial recognition" + "\n";
		output += "****************************************" + "\n";
		output += "________________________________________" + "\n";
		output += "IPhone" + versionNumber + " BATTERY " + "% " + batteryPercentage + " " + this.getCarrier() + "\n";
		output += "****************************************" + "\n";
		output += "****************************************" + "\n";
		output += "***SCREENSCREENSCREENSCREENSCREESCREE***" + "\n";
		output += "***SCREENSCREENSCREENSCREENSCREESCREE***" + "\n";
		output += "***SCREENSCREENSCREENSCREENSCREESCREE***" + "\n";
		output += "***SCREENSCREENSCREENSCREENSCREESCREE***" + "\n";
		output += "***SCREENSCREENSCREENSCREENSCREESCREE***" + "\n";
		output += "***SCREENSCREENSCREENSCREENSCREESCREE***" + "\n";
		output += "***SCREENSCREENSCREENSCREENSCREESCREE***" + "\n";
		output += "***SCREENSCREENSCREENSCREENSCREESCREE***" + "\n";
		output += "*____________________________________" + "\n";
		output += "****************************************" + "\n";
		output += "****************************************" + "\n";
		return output;
	}

	@Override
	public void displayInfo() {
		System.out.println(ring() + unlock());
	}
}
