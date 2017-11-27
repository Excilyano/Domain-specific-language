/*
 * generated by Xtext
 */
package fr.imta.tp2.tutorial.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import fr.imta.tp2.tutorial.ui.internal.MyTutoActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MyTutoExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MyTutoActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MyTutoActivator.getInstance().getInjector(MyTutoActivator.FR_IMTA_TP2_TUTORIAL_MYTUTO);
	}
	
}