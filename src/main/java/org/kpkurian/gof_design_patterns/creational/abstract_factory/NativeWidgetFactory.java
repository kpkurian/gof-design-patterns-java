package org.kpkurian.gof_design_patterns.creational.abstract_factory;

public class NativeWidgetFactory implements WidgetFactory {

	public ScrollBar createScrollBar() {
		return new NativeScrollBar();
	}

	public Window createWindow() {
		return new NativeWindow();
	}

}
