package org.kpkurian.gof_design_patterns.creational.abstract_factory;

public class MotifScrollBar implements ScrollBar {

	public WidgetType getWidgetType() {
		return WidgetType.MOTIF;
	}

}
