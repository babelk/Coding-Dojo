package fizzbuzz;

public class FizzBuzz {
	
	public String fizzBuzz(int numero) {
    	
        if(numero % 15 == 0) {
        	return "FizzBuzz";
        }
        if(numero % 5 == 0) {
        	return "Buzz";
        }
        if(numero % 3 == 0) {
        	return "Fizz";
        }
        return " "+numero;
    }
}


