package main;

public class Fizzbuzz {
	
	public static void main(String[] args) {
		
	}	
	public String anotherFizzBuzz(int i) {
		String s = "";
			
			if(i%15 == 0) {
				s = Integer.toString(i);
				s = "FizzBuzz";
			}else if (i%5 ==0) {
				s = Integer.toString(i);
				s = "Buzz";
			}else if (i%3 == 0) {
				s = Integer.toString(i);
				s = "Fizz";
			}else {
				s = Integer.toString(i);
			}
			return s;	
		} 

}