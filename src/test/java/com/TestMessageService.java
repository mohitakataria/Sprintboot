package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TestMessageService {

	String s1 = "TestString";
	MessageService ms = new MessageService();
	
	@Test
	public void testUpperCase() {
		Assertions.assertEquals(ms.uppercase(s1), "TESTSTRING");
	}
	
	@Test
	public void testLowerCase() {
		Assertions.assertEquals(ms.lowercase(s1), "teststring");
	}
	
	@Test
	public void testConcat() {
		String s2= "Hi";
		Assertions.assertEquals(ms.concat(s2,s1), "HiTestString");
	}
	
	@Test
	public void testSubstring() {
		Assertions.assertEquals(ms.substring(s1), "Te");
	}
	
	@Test
	public void testTrim() {
		Assertions.assertEquals(ms.trim(s1), "TestString");
	}
	
}

