package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Fizzbuzz;


class Test {

	Fizzbuzz fb ;
	@BeforeEach
	void setUp() throws Exception {
		fb = new Fizzbuzz();
	}
	
	
	@Test
	void testfb_3() {
        String testfb = fb.anotherFizzBuzz(1);
        assertEquals("Fizz", testfb);   
    }
	
}
