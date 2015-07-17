package org.kpkurian.gof_design_patterns.creational.abstract_factory;

public class MotifWidgetFactory implements WidgetFactory {

	public ScrollBar createScrollBar() {
		return new MotifScrollBar();
	}

	public Window createWindow() {
		return new MotifWindow();
	}

}
