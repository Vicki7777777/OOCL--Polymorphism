package Printer;

public class Printer {
	public String type;
	public void Function() {
        System.out.println("This is printer.");
	}
	@Overload
	public String Function(String type) {
        System.out.println("For a printer, the most fundamental function is printing.");
		return type;
	}

}
