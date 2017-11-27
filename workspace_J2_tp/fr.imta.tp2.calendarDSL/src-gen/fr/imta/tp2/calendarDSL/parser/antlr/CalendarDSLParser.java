/*
* generated by Xtext
*/
package fr.imta.tp2.calendarDSL.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.imta.tp2.calendarDSL.services.CalendarDSLGrammarAccess;

public class CalendarDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CalendarDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.imta.tp2.calendarDSL.parser.antlr.internal.InternalCalendarDSLParser createParser(XtextTokenStream stream) {
		return new fr.imta.tp2.calendarDSL.parser.antlr.internal.InternalCalendarDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Calendar";
	}
	
	public CalendarDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CalendarDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
