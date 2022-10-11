package main;

public class Fizzbuzz {
	
	public static void main(String[] args) {
		
	}	
	public String anotherFizzBuzz(int i) {
		String s = "";
			
			if(i>100){
                s="Input number more than 100";
            }
            else if (i%5 ==0 && i%3!=0) {
				
				s = "Buzz";
			}else if (i%3 == 0&& i%5!=0) {
				
				s = "Fizz";	
			}
			else if(i%3 == 0 && i%5 ==0) {
				
				s = "FizzBuzz";
			}
			else {
				s = Integer.toString(i);
			}
			return s;	
		} 

}