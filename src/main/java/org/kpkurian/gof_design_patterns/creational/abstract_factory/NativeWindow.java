package org.kpkurian.gof_design_patterns.creational.abstract_factory;

public class NativeWindow implements Window {

	public WidgetType getWidgetType() {
		return WidgetType.NATIVE;
	}

}
