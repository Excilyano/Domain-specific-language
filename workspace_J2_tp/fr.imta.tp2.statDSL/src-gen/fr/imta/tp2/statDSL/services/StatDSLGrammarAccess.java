/*
* generated by Xtext
*/
package fr.imta.tp2.statDSL.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class StatDSLGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class StatDSLElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "StatDSL");
		private final Assignment cProgramAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cProgramProgramParserRuleCall_0 = (RuleCall)cProgramAssignment.eContents().get(0);
		
		//StatDSL:
		//	program=Program;
		public ParserRule getRule() { return rule; }

		//program=Program
		public Assignment getProgramAssignment() { return cProgramAssignment; }

		//Program
		public RuleCall getProgramProgramParserRuleCall_0() { return cProgramProgramParserRuleCall_0; }
	}

	public class ProgramElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Program");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProgramKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cBeginKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final RuleCall cInstructionsParserRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Keyword cReturnKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final RuleCall cKeywordParserRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		private final Keyword cSemicolonKeyword_6 = (Keyword)cGroup.eContents().get(6);
		private final Keyword cEndKeyword_7 = (Keyword)cGroup.eContents().get(7);
		
		//Program:
		//	"program" name=ID "begin" Instructions "return" Keyword ";" "end";
		public ParserRule getRule() { return rule; }

		//"program" name=ID "begin" Instructions "return" Keyword ";" "end"
		public Group getGroup() { return cGroup; }

		//"program"
		public Keyword getProgramKeyword_0() { return cProgramKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//"begin"
		public Keyword getBeginKeyword_2() { return cBeginKeyword_2; }

		//Instructions
		public RuleCall getInstructionsParserRuleCall_3() { return cInstructionsParserRuleCall_3; }

		//"return"
		public Keyword getReturnKeyword_4() { return cReturnKeyword_4; }

		//Keyword
		public RuleCall getKeywordParserRuleCall_5() { return cKeywordParserRuleCall_5; }

		//";"
		public Keyword getSemicolonKeyword_6() { return cSemicolonKeyword_6; }

		//"end"
		public Keyword getEndKeyword_7() { return cEndKeyword_7; }
	}

	public class KeywordElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Keyword");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cMoyenneKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cVarianceKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		private final Keyword cEcartTypeKeyword_2 = (Keyword)cAlternatives.eContents().get(2);
		private final Keyword cModeKeyword_3 = (Keyword)cAlternatives.eContents().get(3);
		
		//Keyword:
		//	"moyenne" | "variance" | "ecart-type" | "mode";
		public ParserRule getRule() { return rule; }

		//"moyenne" | "variance" | "ecart-type" | "mode"
		public Alternatives getAlternatives() { return cAlternatives; }

		//"moyenne"
		public Keyword getMoyenneKeyword_0() { return cMoyenneKeyword_0; }

		//"variance"
		public Keyword getVarianceKeyword_1() { return cVarianceKeyword_1; }

		//"ecart-type"
		public Keyword getEcartTypeKeyword_2() { return cEcartTypeKeyword_2; }

		//"mode"
		public Keyword getModeKeyword_3() { return cModeKeyword_3; }
	}

	public class InstructionsElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Instructions");
		private final UnorderedGroup cUnorderedGroup = (UnorderedGroup)rule.eContents().get(1);
		private final RuleCall cModParserRuleCall_0 = (RuleCall)cUnorderedGroup.eContents().get(0);
		private final RuleCall cEffParserRuleCall_1 = (RuleCall)cUnorderedGroup.eContents().get(1);
		
		//Instructions:
		//	Mod & Eff;
		public ParserRule getRule() { return rule; }

		//Mod & Eff
		public UnorderedGroup getUnorderedGroup() { return cUnorderedGroup; }

		//Mod
		public RuleCall getModParserRuleCall_0() { return cModParserRuleCall_0; }

		//Eff
		public RuleCall getEffParserRuleCall_1() { return cEffParserRuleCall_1; }
	}

	public class EffElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Eff");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cEffKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Eff:
		//	"eff : " INT ("," INT)* ";";
		public ParserRule getRule() { return rule; }

		//"eff : " INT ("," INT)* ";"
		public Group getGroup() { return cGroup; }

		//"eff : "
		public Keyword getEffKeyword_0() { return cEffKeyword_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }

		//("," INT)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_2_1() { return cINTTerminalRuleCall_2_1; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}

	public class ModElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Mod");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cModKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Group cGroup_2 = (Group)cGroup.eContents().get(2);
		private final Keyword cCommaKeyword_2_0 = (Keyword)cGroup_2.eContents().get(0);
		private final RuleCall cINTTerminalRuleCall_2_1 = (RuleCall)cGroup_2.eContents().get(1);
		private final Keyword cSemicolonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		
		//Mod:
		//	"mod : " INT ("," INT)* ";";
		public ParserRule getRule() { return rule; }

		//"mod : " INT ("," INT)* ";"
		public Group getGroup() { return cGroup; }

		//"mod : "
		public Keyword getModKeyword_0() { return cModKeyword_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_1() { return cINTTerminalRuleCall_1; }

		//("," INT)*
		public Group getGroup_2() { return cGroup_2; }

		//","
		public Keyword getCommaKeyword_2_0() { return cCommaKeyword_2_0; }

		//INT
		public RuleCall getINTTerminalRuleCall_2_1() { return cINTTerminalRuleCall_2_1; }

		//";"
		public Keyword getSemicolonKeyword_3() { return cSemicolonKeyword_3; }
	}
	
	
	private StatDSLElements pStatDSL;
	private ProgramElements pProgram;
	private KeywordElements pKeyword;
	private InstructionsElements pInstructions;
	private EffElements pEff;
	private ModElements pMod;
	
	private final Grammar grammar;

	private TerminalsGrammarAccess gaTerminals;

	@Inject
	public StatDSLGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("fr.imta.tp2.statDSL.StatDSL".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//StatDSL:
	//	program=Program;
	public StatDSLElements getStatDSLAccess() {
		return (pStatDSL != null) ? pStatDSL : (pStatDSL = new StatDSLElements());
	}
	
	public ParserRule getStatDSLRule() {
		return getStatDSLAccess().getRule();
	}

	//Program:
	//	"program" name=ID "begin" Instructions "return" Keyword ";" "end";
	public ProgramElements getProgramAccess() {
		return (pProgram != null) ? pProgram : (pProgram = new ProgramElements());
	}
	
	public ParserRule getProgramRule() {
		return getProgramAccess().getRule();
	}

	//Keyword:
	//	"moyenne" | "variance" | "ecart-type" | "mode";
	public KeywordElements getKeywordAccess() {
		return (pKeyword != null) ? pKeyword : (pKeyword = new KeywordElements());
	}
	
	public ParserRule getKeywordRule() {
		return getKeywordAccess().getRule();
	}

	//Instructions:
	//	Mod & Eff;
	public InstructionsElements getInstructionsAccess() {
		return (pInstructions != null) ? pInstructions : (pInstructions = new InstructionsElements());
	}
	
	public ParserRule getInstructionsRule() {
		return getInstructionsAccess().getRule();
	}

	//Eff:
	//	"eff : " INT ("," INT)* ";";
	public EffElements getEffAccess() {
		return (pEff != null) ? pEff : (pEff = new EffElements());
	}
	
	public ParserRule getEffRule() {
		return getEffAccess().getRule();
	}

	//Mod:
	//	"mod : " INT ("," INT)* ";";
	public ModElements getModAccess() {
		return (pMod != null) ? pMod : (pMod = new ModElements());
	}
	
	public ParserRule getModRule() {
		return getModAccess().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"" | "\'" ("\\" ("b" | "t" |
	//	"n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'"))* "\'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}