package main;

public class HelloWorld {

	public static void main(String[] args) {
		
		String coderName = "Jefferson Maquinana";
		String companyName = "Software Company";
		Helper helper = new Helper();
		
		System.out.println("Hello World!");
		System.out.println("Code name is " + coderName);
		System.out.println("I am working in " + companyName);
		System.out.print("Another for testing");
		System.out.println(helper.displayOtherInfo());

	}

}