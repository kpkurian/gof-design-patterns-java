package org.kpkurian.gof_design_patterns.creational.singleton;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingletonTest {
	
	

	@Test
	public void test() {
		GofSingleton 	singleton = GofSingleton.getInstance(),
						toCompareSingleton = GofSingleton.getInstance();
		assertEquals(toCompareSingleton, singleton);
		
	}
	
	@Test
	public void updateGreetings() {
		GofSingleton 	singleton = GofSingleton.getInstance(),
						toCompareSingleton = GofSingleton.getInstance();
		singleton.setGreetings("Namaste");
		assertEquals(toCompareSingleton, singleton);
		
	}

}
