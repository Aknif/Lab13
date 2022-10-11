package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Fizzbuzz;


class test {

	Fizzbuzz fb ;
	@BeforeEach
	void setUp() throws Exception {
		fb = new Fizzbuzz();
	}
	
	
	@Test
	@DisplayName("TC01 - input = 1, expected result = 1")
	void TC01() {
        String testfb = fb.anotherFizzBuzz(3);
        assertEquals("Fizz", testfb);   
    }
	
	@Test
    @DisplayName("TC02 - input = 1, expected result = Fizz")
    void TC02() {
        String testfb = fb.anotherFizzBuzz(1);
        assertEquals("1", testfb);   
    }
	
	@Test
    @DisplayName("TC03 - input = 5, expected result = Buzz")
    void TC03() {
        String testfb = fb.anotherFizzBuzz(5);
        assertEquals("Buzz", testfb);   
    }
	
	@Test
    @DisplayName("TC04 - input = 15, expected result = FizzBuzz")
    void TC04() {
        String testfb = fb.anotherFizzBuzz(15);
        assertEquals("FizzBuzz", testfb);   
    }
	
	@Test
    @DisplayName("TC05 - input = 101, expected result = Input number more than 100")
    void TC05() {
        String testfb = fb.anotherFizzBuzz(101);
        assertEquals("Input number more than 100", testfb);   
    }
	
	@Test
    @DisplayName("TC06 - input = 0, expected result = Input number less than 1")
    void TC06() {
        String testfb = fb.anotherFizzBuzz(0);
        assertEquals("Input number less than 1", testfb);   
    }
}
