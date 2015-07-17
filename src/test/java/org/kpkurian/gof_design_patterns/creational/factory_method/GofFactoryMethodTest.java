package org.kpkurian.gof_design_patterns.creational.factory_method;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GofFactoryMethodTest {

	@Test
	public void test() {
		//Application declares the factory method (createDocument)
		Application wordProcessor, spreadSheet;
		
		//Defines the interface of objects the factory method creates
		Document page, calcSheet;
		
		wordProcessor = new WordProcessor();
		page = wordProcessor.createDocument();
		
		assertTrue(page instanceof Page);
		
		spreadSheet = new SpreadSheet();
		calcSheet = spreadSheet.createDocument();
		
		assertTrue(calcSheet instanceof CalcSheet);
		
		
	}
}
