package com.example.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BasicJUnitTest {
    @Test
	void junitTest1() {
		//DemoApplication obj = new DemoApplication();
        Assert.assertEquals(4, 3+2);
	}
}
