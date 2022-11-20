package com.dhimas.belajar.v2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KalkulatorTest {
  
	    @Test
	    void testpenjumlahan(){
	        int a = 15, b = 30;
	        int expected = a + b;
	        int actual = Kalkulator.penjumlahan(a, b);

	        Assert.assertEquals(expected, actual);
	    }
	    @Test
	    void testpengurangan(){
	        int a = 30, b = 15;
	        int expected = a - b;
	        int actual = Kalkulator.pengurangan(a, b);

	        Assert.assertEquals(expected, actual);
	    }
	    @Test
	    void testpembagian(){
	        int a = 60, b = 4;
	        int expected = a / b;
	        int actual = Kalkulator.pembagian(a, b);

	        Assert.assertEquals(expected, actual);
	    }
	    @Test
	    void testmodulus(){
	        int a = 1000, b = 25;
	        int expected = a % b;
	        int actual = Kalkulator.modulus(a, b);

	        Assert.assertEquals(expected, actual);
	    }

}
