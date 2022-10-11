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
	
}
