/*
* generated by Xtext
*/
package fr.imta.tp2.calendarDSL.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class CalendarDSLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("fr/imta/tp2/calendarDSL/parser/antlr/internal/InternalCalendarDSL.tokens");
	}
}
