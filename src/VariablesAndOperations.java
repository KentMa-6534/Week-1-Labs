
public class VariablesAndOperations {

	public static void main(String[] args) {
		// Available plane seats left on a flight
		int planeSeatsLeft=4;
		//Cost of groceries
		double costOfGroceries=10.56;
		//Person's middle initial
		char middleInitial='H';
		//Holds true or false depending on if it is hot outside
		boolean isHotOutside=true;
		//Holds customer's first name
		String firstName="Walter";
		//Holds a street address
		String streetAddress="308 Negra Arroyo Lane";
		//Prints all values to console
		System.out.println("There are "+planeSeatsLeft+" plane seats left");
		System.out.println("The total cost of these groceries will be: $"+costOfGroceries);
		System.out.println("My middle initial is "+middleInitial);
		System.out.println("Is it hot outside? "+isHotOutside);
		System.out.println("My first name is "+firstName);
		System.out.println("I live on "+streetAddress);
		
		//Customer booked 2 plane seats, removing from existing value
		planeSeatsLeft-=2;
		System.out.println(planeSeatsLeft);
		//Impulse candy bar purchase, adding to total
		costOfGroceries = costOfGroceries+2.15;
		System.out.println(costOfGroceries);
		//Birth certificate error, changed middle initial
		middleInitial='J';
		System.out.println(middleInitial);
		//Season has changed
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside);
		//New variable with customer's full name
		String fullName = firstName+" "+middleInitial+" "+"White";
		//Introduces customer and their address
		System.out.println("My name is "+fullName+" and I live at "+streetAddress);
	}

}
