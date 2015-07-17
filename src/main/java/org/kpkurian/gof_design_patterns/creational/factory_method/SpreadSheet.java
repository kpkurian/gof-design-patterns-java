package org.kpkurian.gof_design_patterns.creational.factory_method;

public class SpreadSheet implements Application {

	public Document createDocument() {
		return new CalcSheet();
	}
}
