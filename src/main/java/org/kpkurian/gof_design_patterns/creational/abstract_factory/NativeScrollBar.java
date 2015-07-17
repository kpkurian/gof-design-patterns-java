package org.kpkurian.gof_design_patterns.creational.abstract_factory;

public class NativeScrollBar implements ScrollBar {

	public WidgetType getWidgetType() {
		return WidgetType.NATIVE;
	}

}
