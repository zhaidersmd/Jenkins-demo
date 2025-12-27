package com.org;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AppTest {
	
	@Test
	void testAdd() {
		assertEquals(5, App.add(1, 4));
	}

}
