/*
 * generated by Xtext
 */
package fr.imta.tp.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;

public class AbstractCalcDSLValidator extends org.eclipse.xtext.validation.AbstractDeclarativeValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(fr.imta.tp.calcDSL.CalcDSLPackage.eINSTANCE);
		return result;
	}
}
