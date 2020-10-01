package phoneProject;

public class PhoneTest {
	public static void main(String[] args) {
		IPhone ip1 = new IPhone("X", "Sprint");
		Galaxy G1 = new Galaxy("Note1", "AT&T");
		ip1.displayInfo();
		G1.displayInfo();

	}
}
