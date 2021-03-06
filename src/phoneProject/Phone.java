package phoneProject;

public abstract class Phone {
	public String versionNumber;
	public int batteryPercentage;
	private String carrier;
	public String ringTone;

	public Phone(String versionNumber, String carrier) {
		this.versionNumber = versionNumber;
		this.batteryPercentage = 100;
		this.carrier = carrier;
		this.ringTone = "ring ring ring";
	}

	public String getVersionNumber() {
		return versionNumber;
	}

	public void setVersionNumber(String versionNumber) {
		this.versionNumber = versionNumber;
	}

	public int getBatteryPercentage() {
		return batteryPercentage;
	}

	public void setBatteryPercentage(int batteryPercentage) {
		this.batteryPercentage = batteryPercentage;
	}

	public String getCarrier() {
		return carrier;
	}

	public void setCarrier(String carrier) {
		this.carrier = carrier;
	}

	public String getRingTone() {
		return ringTone;
	}

	public void setRingTone(String ringTone) {
		this.ringTone = ringTone;
	}

	public String unlock() {
		String output = "";
		output += "****************************************" + "\n";
		output += "****************************************" + "\n";
		output += "*****unlocking Phone via pass code******" + "\n";
		output += "****************************************" + "\n";
		output += "________________________________________" + "\n";
		output += "Phone  " + versionNumber + " BATTERY " + "% " + batteryPercentage + " " + this.getCarrier() + "\n";
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

	public String ring() {
		String output = "";
		output += "Ring tone " + ringTone + "\n";
		output += "Ring tone " + ringTone + "\n";
		output += "Ring tone " + ringTone + "\n";
		output += "Ring tone " + ringTone + "\n";
		output += "Ring tone " + ringTone + "\n";
		return output;
	}

	public void displayInfo() {
		System.out.println(ring() + unlock());
	}
}