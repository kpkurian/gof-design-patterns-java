package org.kpkurian.gof_design_patterns.creational.abstract_factory;

import static org.junit.Assert.*;

import org.junit.Test;

public class GofAbstractFactoryTest {

	@Test
	public void test() {
		
		//abstract widget factory declares interface for each kind of widget
		WidgetFactory widgetFactory;
		
		//widgets
		Window window;
		ScrollBar scrollBar;
		
		widgetFactory = new NativeWidgetFactory();
		window = widgetFactory.createWindow();
		scrollBar = widgetFactory.createScrollBar();
		
		assertEquals(WidgetType.NATIVE, window.getWidgetType());
		assertEquals(WidgetType.NATIVE, scrollBar.getWidgetType());
		
		widgetFactory = new MotifWidgetFactory();
		window = widgetFactory.createWindow();
		scrollBar = widgetFactory.createScrollBar();
		
		assertEquals(WidgetType.MOTIF, window.getWidgetType());
		assertEquals(WidgetType.MOTIF, scrollBar.getWidgetType());
		
		
		
		
		
	}

}
