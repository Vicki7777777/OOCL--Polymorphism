package Printer;

public class Color extends Printer{
	@Override
	public String Function(String type) {
        System.out.println("For a color printer, different colors are used to paper.");
		return type;
	}
}
