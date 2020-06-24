package Printer;

public class BlackWhite  extends Printer{
	@Override
	public String Function(String type) {
        System.out.println("For a black and white printer, only the black color is used to paper.");
		return type;
	}
}
