/*
* generated by Xtext
*/
package fr.imta.tp.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import fr.imta.tp.services.CalcDSLGrammarAccess;

public class CalcDSLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private CalcDSLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected fr.imta.tp.parser.antlr.internal.InternalCalcDSLParser createParser(XtextTokenStream stream) {
		return new fr.imta.tp.parser.antlr.internal.InternalCalcDSLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "CalcDSL";
	}
	
	public CalcDSLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(CalcDSLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
