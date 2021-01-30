// Generated from C:/Users/John Gabriel Legaspi/Documents/DLSU/4th Year/Term 1/CMPILER/CMPILER-MO1-Interpreter/src/antlr\TripleJ.g4 by ANTLR 4.9
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TripleJParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, Auto=22, Break=23, Case=24, Char=25, 
		Const=26, Continue=27, Default=28, Do=29, Double=30, Downto=31, Else=32, 
		Enum=33, Extern=34, Float=35, For=36, Goto=37, If=38, Inline=39, Int=40, 
		Long=41, Register=42, Restrict=43, Return=44, Short=45, Signed=46, Sizeof=47, 
		Static=48, Struct=49, Switch=50, Typedef=51, Union=52, Unsigned=53, Upto=54, 
		Void=55, Volatile=56, While=57, Alignas=58, Alignof=59, Atomic=60, Bool=61, 
		Complex=62, Generic=63, Imaginary=64, Noreturn=65, StaticAssert=66, ThreadLocal=67, 
		LeftParen=68, RightParen=69, LeftBracket=70, RightBracket=71, LeftBrace=72, 
		RightBrace=73, Less=74, LessEqual=75, Greater=76, GreaterEqual=77, LeftShift=78, 
		RightShift=79, Plus=80, PlusPlus=81, Minus=82, MinusMinus=83, Star=84, 
		Div=85, Mod=86, And=87, Or=88, AndAnd=89, OrOr=90, Caret=91, Not=92, Tilde=93, 
		Question=94, Colon=95, Semi=96, Comma=97, Assign=98, StarAssign=99, DivAssign=100, 
		ModAssign=101, PlusAssign=102, MinusAssign=103, LeftShiftAssign=104, RightShiftAssign=105, 
		AndAssign=106, XorAssign=107, OrAssign=108, Equal=109, NotEqual=110, Arrow=111, 
		Dot=112, Ellipsis=113, Identifier=114, Constant=115, DigitSequence=116, 
		StringLiteral=117, ComplexDefine=118, IncludeDirective=119, AsmBlock=120, 
		LineAfterPreprocessing=121, LineDirective=122, PragmaDirective=123, Whitespace=124, 
		Newline=125, BlockComment=126, LineComment=127;
	public static final int
		RULE_root = 0, RULE_primaryExpression = 1, RULE_genericSelection = 2, 
		RULE_genericAssocList = 3, RULE_genericAssociation = 4, RULE_postfixExpression = 5, 
		RULE_argumentExpressionList = 6, RULE_unaryExpression = 7, RULE_unaryOperator = 8, 
		RULE_castExpression = 9, RULE_multiplicativeExpression = 10, RULE_additiveExpression = 11, 
		RULE_shiftExpression = 12, RULE_relationalExpression = 13, RULE_equalityExpression = 14, 
		RULE_andExpression = 15, RULE_exclusiveOrExpression = 16, RULE_inclusiveOrExpression = 17, 
		RULE_logicalAndExpression = 18, RULE_logicalOrExpression = 19, RULE_conditionalExpression = 20, 
		RULE_assignmentExpression = 21, RULE_assignmentOperator = 22, RULE_expression = 23, 
		RULE_constantExpression = 24, RULE_declaration = 25, RULE_declarationSpecifiers = 26, 
		RULE_declarationSpecifiers2 = 27, RULE_declarationSpecifier = 28, RULE_initDeclaratorList = 29, 
		RULE_initDeclarator = 30, RULE_storageClassSpecifier = 31, RULE_typeSpecifier = 32, 
		RULE_structOrUnionSpecifier = 33, RULE_structOrUnion = 34, RULE_structDeclarationList = 35, 
		RULE_structDeclaration = 36, RULE_specifierQualifierList = 37, RULE_structDeclaratorList = 38, 
		RULE_structDeclarator = 39, RULE_enumSpecifier = 40, RULE_enumeratorList = 41, 
		RULE_enumerator = 42, RULE_enumerationConstant = 43, RULE_atomicTypeSpecifier = 44, 
		RULE_typeQualifier = 45, RULE_functionSpecifier = 46, RULE_alignmentSpecifier = 47, 
		RULE_declarator = 48, RULE_directDeclarator = 49, RULE_gccDeclaratorExtension = 50, 
		RULE_gccAttributeSpecifier = 51, RULE_gccAttributeList = 52, RULE_gccAttribute = 53, 
		RULE_nestedParenthesesBlock = 54, RULE_pointer = 55, RULE_typeQualifierList = 56, 
		RULE_parameterTypeList = 57, RULE_parameterList = 58, RULE_parameterDeclaration = 59, 
		RULE_identifierList = 60, RULE_typeName = 61, RULE_abstractDeclarator = 62, 
		RULE_directAbstractDeclarator = 63, RULE_typedefName = 64, RULE_initializer = 65, 
		RULE_initializerList = 66, RULE_designation = 67, RULE_designatorList = 68, 
		RULE_designator = 69, RULE_staticAssertDeclaration = 70, RULE_statement = 71, 
		RULE_printStatement = 72, RULE_labeledStatement = 73, RULE_compoundStatement = 74, 
		RULE_blockItemList = 75, RULE_blockItem = 76, RULE_expressionStatement = 77, 
		RULE_selectionStatement = 78, RULE_iterationStatement = 79, RULE_whileExpression = 80, 
		RULE_forCondition = 81, RULE_forDeclaration = 82, RULE_forExpression = 83, 
		RULE_jumpStatement = 84, RULE_compilationUnit = 85, RULE_translationUnit = 86, 
		RULE_externalDeclaration = 87, RULE_functionDefinition = 88, RULE_declarationList = 89;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "primaryExpression", "genericSelection", "genericAssocList", 
			"genericAssociation", "postfixExpression", "argumentExpressionList", 
			"unaryExpression", "unaryOperator", "castExpression", "multiplicativeExpression", 
			"additiveExpression", "shiftExpression", "relationalExpression", "equalityExpression", 
			"andExpression", "exclusiveOrExpression", "inclusiveOrExpression", "logicalAndExpression", 
			"logicalOrExpression", "conditionalExpression", "assignmentExpression", 
			"assignmentOperator", "expression", "constantExpression", "declaration", 
			"declarationSpecifiers", "declarationSpecifiers2", "declarationSpecifier", 
			"initDeclaratorList", "initDeclarator", "storageClassSpecifier", "typeSpecifier", 
			"structOrUnionSpecifier", "structOrUnion", "structDeclarationList", "structDeclaration", 
			"specifierQualifierList", "structDeclaratorList", "structDeclarator", 
			"enumSpecifier", "enumeratorList", "enumerator", "enumerationConstant", 
			"atomicTypeSpecifier", "typeQualifier", "functionSpecifier", "alignmentSpecifier", 
			"declarator", "directDeclarator", "gccDeclaratorExtension", "gccAttributeSpecifier", 
			"gccAttributeList", "gccAttribute", "nestedParenthesesBlock", "pointer", 
			"typeQualifierList", "parameterTypeList", "parameterList", "parameterDeclaration", 
			"identifierList", "typeName", "abstractDeclarator", "directAbstractDeclarator", 
			"typedefName", "initializer", "initializerList", "designation", "designatorList", 
			"designator", "staticAssertDeclaration", "statement", "printStatement", 
			"labeledStatement", "compoundStatement", "blockItemList", "blockItem", 
			"expressionStatement", "selectionStatement", "iterationStatement", "whileExpression", 
			"forCondition", "forDeclaration", "forExpression", "jumpStatement", "compilationUnit", 
			"translationUnit", "externalDeclaration", "functionDefinition", "declarationList"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'__extension__'", "'__builtin_va_arg'", "'__builtin_offsetof'", 
			"'**'", "',,'", "'__m128'", "'__m128d'", "'__m128i'", "'__typeof__'", 
			"'__inline__'", "'__stdcall'", "'__declspec'", "'__asm'", "'__attribute__'", 
			"'constt'", "'__asm__'", "'__volatile__'", "'print'", "'then'", "'to'", 
			"'func'", "'auto'", "'break'", "'case'", "'char'", "'const'", "'continue'", 
			"'default'", "'do'", "'double'", "'down to'", "'else'", "'enum'", "'extern'", 
			"'float'", "'for'", "'goto'", "'if'", "'inline'", "'int'", "'long'", 
			"'register'", "'restrict'", "'return'", "'short'", "'signed'", "'sizeof'", 
			"'static'", "'struct'", "'switch'", "'typedef'", "'union'", "'unsigned'", 
			"'up to'", "'void'", "'volatile'", "'while'", "'_Alignas'", "'_Alignof'", 
			"'_Atomic'", "'_Bool'", "'_Complex'", "'_Generic'", "'_Imaginary'", "'_Noreturn'", 
			"'_Static_assert'", "'_Thread_local'", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "'<'", "'<='", "'>'", "'>='", "'<<'", "'>>'", "'+'", "'++'", "'-'", 
			"'--'", "'*'", "'/'", "'%'", "'&'", "'|'", "'&&'", "'||'", "'^'", "'!'", 
			"'~'", "'?'", "':'", "';'", "','", "'='", "'*='", "'/='", "'%='", "'+='", 
			"'-='", "'<<='", "'>>='", "'&='", "'^='", "'|='", "'=='", "'!='", "'->'", 
			"'.'", "'...'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "Auto", "Break", 
			"Case", "Char", "Const", "Continue", "Default", "Do", "Double", "Downto", 
			"Else", "Enum", "Extern", "Float", "For", "Goto", "If", "Inline", "Int", 
			"Long", "Register", "Restrict", "Return", "Short", "Signed", "Sizeof", 
			"Static", "Struct", "Switch", "Typedef", "Union", "Unsigned", "Upto", 
			"Void", "Volatile", "While", "Alignas", "Alignof", "Atomic", "Bool", 
			"Complex", "Generic", "Imaginary", "Noreturn", "StaticAssert", "ThreadLocal", 
			"LeftParen", "RightParen", "LeftBracket", "RightBracket", "LeftBrace", 
			"RightBrace", "Less", "LessEqual", "Greater", "GreaterEqual", "LeftShift", 
			"RightShift", "Plus", "PlusPlus", "Minus", "MinusMinus", "Star", "Div", 
			"Mod", "And", "Or", "AndAnd", "OrOr", "Caret", "Not", "Tilde", "Question", 
			"Colon", "Semi", "Comma", "Assign", "StarAssign", "DivAssign", "ModAssign", 
			"PlusAssign", "MinusAssign", "LeftShiftAssign", "RightShiftAssign", "AndAssign", 
			"XorAssign", "OrAssign", "Equal", "NotEqual", "Arrow", "Dot", "Ellipsis", 
			"Identifier", "Constant", "DigitSequence", "StringLiteral", "ComplexDefine", 
			"IncludeDirective", "AsmBlock", "LineAfterPreprocessing", "LineDirective", 
			"PragmaDirective", "Whitespace", "Newline", "BlockComment", "LineComment"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TripleJ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TripleJParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public RootContext root() {
			return getRuleContext(RootContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		try {
			setState(192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(180);
				declarationList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(182);
				functionDefinition();
				setState(184);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(183);
					root();
					}
					break;
				}
				setState(187);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
				case 1:
					{
					setState(186);
					declarationList(0);
					}
					break;
				}
				setState(190);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(189);
					statement();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public TerminalNode Constant() { return getToken(TripleJParser.Constant, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(TripleJParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(TripleJParser.StringLiteral, i);
		}
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public GenericSelectionContext genericSelection() {
			return getRuleContext(GenericSelectionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_primaryExpression);
		int _la;
		try {
			int _alt;
			setState(227);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(Constant);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(197); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(196);
						match(StringLiteral);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(199); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				match(LeftParen);
				setState(202);
				expression(0);
				setState(203);
				match(RightParen);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(205);
				genericSelection();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(206);
					match(T__0);
					}
				}

				setState(209);
				match(LeftParen);
				setState(210);
				compoundStatement();
				setState(211);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(213);
				match(T__1);
				setState(214);
				match(LeftParen);
				setState(215);
				unaryExpression();
				setState(216);
				match(Comma);
				setState(217);
				typeName();
				setState(218);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(220);
				match(T__2);
				setState(221);
				match(LeftParen);
				setState(222);
				typeName();
				setState(223);
				match(Comma);
				setState(224);
				unaryExpression();
				setState(225);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericSelectionContext extends ParserRuleContext {
		public TerminalNode Generic() { return getToken(TripleJParser.Generic, 0); }
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public GenericSelectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericSelection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterGenericSelection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitGenericSelection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitGenericSelection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericSelectionContext genericSelection() throws RecognitionException {
		GenericSelectionContext _localctx = new GenericSelectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_genericSelection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			match(Generic);
			setState(230);
			match(LeftParen);
			setState(231);
			assignmentExpression();
			setState(232);
			match(Comma);
			setState(233);
			genericAssocList(0);
			setState(234);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericAssocListContext extends ParserRuleContext {
		public GenericAssociationContext genericAssociation() {
			return getRuleContext(GenericAssociationContext.class,0);
		}
		public GenericAssocListContext genericAssocList() {
			return getRuleContext(GenericAssocListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public GenericAssocListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssocList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterGenericAssocList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitGenericAssocList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitGenericAssocList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssocListContext genericAssocList() throws RecognitionException {
		return genericAssocList(0);
	}

	private GenericAssocListContext genericAssocList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		GenericAssocListContext _localctx = new GenericAssocListContext(_ctx, _parentState);
		GenericAssocListContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_genericAssocList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(237);
			genericAssociation();
			}
			_ctx.stop = _input.LT(-1);
			setState(244);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new GenericAssocListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_genericAssocList);
					setState(239);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(240);
					match(Comma);
					setState(241);
					genericAssociation();
					}
					} 
				}
				setState(246);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GenericAssociationContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TripleJParser.Colon, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(TripleJParser.Default, 0); }
		public GenericAssociationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericAssociation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterGenericAssociation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitGenericAssociation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitGenericAssociation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GenericAssociationContext genericAssociation() throws RecognitionException {
		GenericAssociationContext _localctx = new GenericAssociationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_genericAssociation);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__14:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				typeName();
				setState(248);
				match(Colon);
				setState(249);
				assignmentExpression();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(251);
				match(Default);
				setState(252);
				match(Colon);
				setState(253);
				assignmentExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(TripleJParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(TripleJParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public List<PostfixExpressionContext> postfixExpression() {
			return getRuleContexts(PostfixExpressionContext.class);
		}
		public PostfixExpressionContext postfixExpression(int i) {
			return getRuleContext(PostfixExpressionContext.class,i);
		}
		public TerminalNode LeftBracket() { return getToken(TripleJParser.LeftBracket, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(TripleJParser.RightBracket, 0); }
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Dot() { return getToken(TripleJParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public TerminalNode Arrow() { return getToken(TripleJParser.Arrow, 0); }
		public TerminalNode PlusPlus() { return getToken(TripleJParser.PlusPlus, 0); }
		public TerminalNode MinusMinus() { return getToken(TripleJParser.MinusMinus, 0); }
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterPostfixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitPostfixExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitPostfixExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(257);
				primaryExpression();
				}
				break;
			case 2:
				{
				setState(258);
				match(LeftParen);
				setState(259);
				typeName();
				setState(260);
				match(RightParen);
				setState(261);
				match(LeftBrace);
				setState(262);
				initializerList(0);
				setState(263);
				match(RightBrace);
				}
				break;
			case 3:
				{
				setState(265);
				match(LeftParen);
				setState(266);
				typeName();
				setState(267);
				match(RightParen);
				setState(268);
				match(LeftBrace);
				setState(269);
				initializerList(0);
				setState(270);
				match(Comma);
				setState(271);
				match(RightBrace);
				}
				break;
			case 4:
				{
				setState(273);
				match(T__0);
				setState(274);
				match(LeftParen);
				setState(275);
				typeName();
				setState(276);
				match(RightParen);
				setState(277);
				match(LeftBrace);
				setState(278);
				initializerList(0);
				setState(279);
				match(RightBrace);
				}
				break;
			case 5:
				{
				setState(281);
				match(T__0);
				setState(282);
				match(LeftParen);
				setState(283);
				typeName();
				setState(284);
				match(RightParen);
				setState(285);
				match(LeftBrace);
				setState(286);
				initializerList(0);
				setState(287);
				match(Comma);
				setState(288);
				match(RightBrace);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(328);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(326);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(292);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(293);
						match(LeftBracket);
						setState(294);
						expression(0);
						setState(295);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(297);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(298);
						match(LeftParen);
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (AndAnd - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
							{
							setState(299);
							argumentExpressionList(0);
							}
						}

						setState(302);
						match(RightParen);
						}
						break;
					case 3:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(303);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(304);
						match(LeftParen);
						setState(306);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (AndAnd - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
							{
							setState(305);
							argumentExpressionList(0);
							}
						}

						setState(308);
						match(RightParen);
						setState(310); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(309);
								postfixExpression(0);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(312); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						setState(314);
						if (!( false )) throw new FailedPredicateException(this, " false ",  "';' expected after function call");
						}
						break;
					case 4:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(316);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(317);
						match(Dot);
						setState(318);
						match(Identifier);
						}
						break;
					case 5:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(319);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(320);
						match(Arrow);
						setState(321);
						match(Identifier);
						}
						break;
					case 6:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(322);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(323);
						match(PlusPlus);
						}
						break;
					case 7:
						{
						_localctx = new PostfixExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(324);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(325);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(330);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentExpressionListContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public ArgumentExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentExpressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterArgumentExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitArgumentExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitArgumentExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentExpressionListContext argumentExpressionList() throws RecognitionException {
		return argumentExpressionList(0);
	}

	private ArgumentExpressionListContext argumentExpressionList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArgumentExpressionListContext _localctx = new ArgumentExpressionListContext(_ctx, _parentState);
		ArgumentExpressionListContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_argumentExpressionList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(332);
				assignmentExpression();
				}
				break;
			case 2:
				{
				setState(333);
				postfixExpression(0);
				setState(334);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "expression is not allowed to have two consecutive operators");
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ArgumentExpressionListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_argumentExpressionList);
					setState(338);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(339);
					match(Comma);
					setState(340);
					assignmentExpression();
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class UnaryExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(TripleJParser.PlusPlus, 0); }
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(TripleJParser.MinusMinus, 0); }
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public TerminalNode Sizeof() { return getToken(TripleJParser.Sizeof, 0); }
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public TerminalNode Alignof() { return getToken(TripleJParser.Alignof, 0); }
		public TerminalNode AndAnd() { return getToken(TripleJParser.AndAnd, 0); }
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public UnaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterUnaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitUnaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitUnaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpressionContext unaryExpression() throws RecognitionException {
		UnaryExpressionContext _localctx = new UnaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_unaryExpression);
		try {
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(346);
				postfixExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(347);
				match(PlusPlus);
				setState(348);
				unaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(MinusMinus);
				setState(350);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(351);
				unaryOperator();
				setState(352);
				castExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(354);
				match(Sizeof);
				setState(355);
				unaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				match(Sizeof);
				setState(357);
				match(LeftParen);
				setState(358);
				typeName();
				setState(359);
				match(RightParen);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(361);
				match(Alignof);
				setState(362);
				match(LeftParen);
				setState(363);
				typeName();
				setState(364);
				match(RightParen);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(366);
				match(AndAnd);
				setState(367);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode And() { return getToken(TripleJParser.And, 0); }
		public TerminalNode Star() { return getToken(TripleJParser.Star, 0); }
		public TerminalNode Plus() { return getToken(TripleJParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(TripleJParser.Minus, 0); }
		public TerminalNode Tilde() { return getToken(TripleJParser.Tilde, 0); }
		public TerminalNode Not() { return getToken(TripleJParser.Not, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitUnaryOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitUnaryOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (Plus - 80)) | (1L << (Minus - 80)) | (1L << (Star - 80)) | (1L << (And - 80)) | (1L << (Not - 80)) | (1L << (Tilde - 80)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CastExpressionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(TripleJParser.DigitSequence, 0); }
		public CastExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterCastExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitCastExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitCastExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastExpressionContext castExpression() throws RecognitionException {
		CastExpressionContext _localctx = new CastExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_castExpression);
		try {
			setState(385);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(LeftParen);
				setState(373);
				typeName();
				setState(374);
				match(RightParen);
				setState(375);
				castExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(T__0);
				setState(378);
				match(LeftParen);
				setState(379);
				typeName();
				setState(380);
				match(RightParen);
				setState(381);
				castExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(383);
				unaryExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(384);
				match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicativeExpressionContext extends ParserRuleContext {
		public CastExpressionContext castExpression() {
			return getRuleContext(CastExpressionContext.class,0);
		}
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public TerminalNode Star() { return getToken(TripleJParser.Star, 0); }
		public TerminalNode Div() { return getToken(TripleJParser.Div, 0); }
		public TerminalNode Mod() { return getToken(TripleJParser.Mod, 0); }
		public MultiplicativeExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicativeExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterMultiplicativeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitMultiplicativeExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitMultiplicativeExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiplicativeExpressionContext multiplicativeExpression() throws RecognitionException {
		return multiplicativeExpression(0);
	}

	private MultiplicativeExpressionContext multiplicativeExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MultiplicativeExpressionContext _localctx = new MultiplicativeExpressionContext(_ctx, _parentState);
		MultiplicativeExpressionContext _prevctx = _localctx;
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_multiplicativeExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(388);
			castExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(406);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(404);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(390);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(391);
						match(Star);
						setState(392);
						castExpression();
						}
						break;
					case 2:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(393);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(394);
						match(T__3);
						setState(395);
						castExpression();
						setState(396);
						if (!( false )) throw new FailedPredicateException(this, " false ",  "Double operators");
						}
						break;
					case 3:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(398);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(399);
						match(Div);
						setState(400);
						castExpression();
						}
						break;
					case 4:
						{
						_localctx = new MultiplicativeExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_multiplicativeExpression);
						setState(401);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(402);
						match(Mod);
						setState(403);
						castExpression();
						}
						break;
					}
					} 
				}
				setState(408);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AdditiveExpressionContext extends ParserRuleContext {
		public MultiplicativeExpressionContext multiplicativeExpression() {
			return getRuleContext(MultiplicativeExpressionContext.class,0);
		}
		public List<AdditiveExpressionContext> additiveExpression() {
			return getRuleContexts(AdditiveExpressionContext.class);
		}
		public AdditiveExpressionContext additiveExpression(int i) {
			return getRuleContext(AdditiveExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(TripleJParser.Plus, 0); }
		public TerminalNode PlusPlus() { return getToken(TripleJParser.PlusPlus, 0); }
		public TerminalNode Minus() { return getToken(TripleJParser.Minus, 0); }
		public AdditiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additiveExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterAdditiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitAdditiveExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitAdditiveExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AdditiveExpressionContext additiveExpression() throws RecognitionException {
		return additiveExpression(0);
	}

	private AdditiveExpressionContext additiveExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AdditiveExpressionContext _localctx = new AdditiveExpressionContext(_ctx, _parentState);
		AdditiveExpressionContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_additiveExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(410);
			multiplicativeExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(431);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(429);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
					case 1:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(412);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(413);
						match(Plus);
						setState(414);
						additiveExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(415);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(416);
						match(PlusPlus);
						setState(417);
						additiveExpression(3);
						setState(418);
						if (!( false )) throw new FailedPredicateException(this, " false ",  "Double operators");
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(420);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(421);
						match(Plus);
						setState(422);
						multiplicativeExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(423);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(424);
						match(Minus);
						setState(425);
						multiplicativeExpression(0);
						}
						break;
					case 5:
						{
						_localctx = new AdditiveExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_additiveExpression);
						setState(426);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(427);
						match(Plus);
						setState(428);
						if (!( false )) throw new FailedPredicateException(this, " false ",  "Lacking additive expression");
						}
						break;
					}
					} 
				}
				setState(433);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ShiftExpressionContext extends ParserRuleContext {
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public TerminalNode LeftShift() { return getToken(TripleJParser.LeftShift, 0); }
		public TerminalNode RightShift() { return getToken(TripleJParser.RightShift, 0); }
		public ShiftExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterShiftExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitShiftExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitShiftExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShiftExpressionContext shiftExpression() throws RecognitionException {
		return shiftExpression(0);
	}

	private ShiftExpressionContext shiftExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ShiftExpressionContext _localctx = new ShiftExpressionContext(_ctx, _parentState);
		ShiftExpressionContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_shiftExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(435);
			additiveExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(443);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(437);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(438);
						match(LeftShift);
						setState(439);
						additiveExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new ShiftExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_shiftExpression);
						setState(440);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(441);
						match(RightShift);
						setState(442);
						additiveExpression(0);
						}
						break;
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class RelationalExpressionContext extends ParserRuleContext {
		public ShiftExpressionContext shiftExpression() {
			return getRuleContext(ShiftExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public TerminalNode Less() { return getToken(TripleJParser.Less, 0); }
		public TerminalNode Greater() { return getToken(TripleJParser.Greater, 0); }
		public TerminalNode LessEqual() { return getToken(TripleJParser.LessEqual, 0); }
		public TerminalNode GreaterEqual() { return getToken(TripleJParser.GreaterEqual, 0); }
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		return relationalExpression(0);
	}

	private RelationalExpressionContext relationalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, _parentState);
		RelationalExpressionContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_relationalExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(449);
			shiftExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(465);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(463);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
					case 1:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(451);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(452);
						match(Less);
						setState(453);
						shiftExpression(0);
						}
						break;
					case 2:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(454);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(455);
						match(Greater);
						setState(456);
						shiftExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(457);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(458);
						match(LessEqual);
						setState(459);
						shiftExpression(0);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_relationalExpression);
						setState(460);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(461);
						match(GreaterEqual);
						setState(462);
						shiftExpression(0);
						}
						break;
					}
					} 
				}
				setState(467);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EqualityExpressionContext extends ParserRuleContext {
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public List<EqualityExpressionContext> equalityExpression() {
			return getRuleContexts(EqualityExpressionContext.class);
		}
		public EqualityExpressionContext equalityExpression(int i) {
			return getRuleContext(EqualityExpressionContext.class,i);
		}
		public TerminalNode Assign() { return getToken(TripleJParser.Assign, 0); }
		public TerminalNode Equal() { return getToken(TripleJParser.Equal, 0); }
		public TerminalNode NotEqual() { return getToken(TripleJParser.NotEqual, 0); }
		public EqualityExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalityExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterEqualityExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitEqualityExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitEqualityExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualityExpressionContext equalityExpression() throws RecognitionException {
		return equalityExpression(0);
	}

	private EqualityExpressionContext equalityExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EqualityExpressionContext _localctx = new EqualityExpressionContext(_ctx, _parentState);
		EqualityExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_equalityExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(469);
			relationalExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(484);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(482);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(471);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(472);
						match(Assign);
						setState(473);
						equalityExpression(2);
						setState(474);
						if (!( false )) throw new FailedPredicateException(this, " false ",  "Invalid expression. Should be '=='");
						}
						break;
					case 2:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(476);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(477);
						match(Equal);
						setState(478);
						relationalExpression(0);
						}
						break;
					case 3:
						{
						_localctx = new EqualityExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_equalityExpression);
						setState(479);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(480);
						match(NotEqual);
						setState(481);
						relationalExpression(0);
						}
						break;
					}
					} 
				}
				setState(486);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AndExpressionContext extends ParserRuleContext {
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public TerminalNode And() { return getToken(TripleJParser.And, 0); }
		public AndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndExpressionContext andExpression() throws RecognitionException {
		return andExpression(0);
	}

	private AndExpressionContext andExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		AndExpressionContext _localctx = new AndExpressionContext(_ctx, _parentState);
		AndExpressionContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_andExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(488);
			equalityExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(495);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_andExpression);
					setState(490);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(491);
					match(And);
					setState(492);
					equalityExpression(0);
					}
					} 
				}
				setState(497);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExclusiveOrExpressionContext extends ParserRuleContext {
		public AndExpressionContext andExpression() {
			return getRuleContext(AndExpressionContext.class,0);
		}
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Caret() { return getToken(TripleJParser.Caret, 0); }
		public ExclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterExclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitExclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitExclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExclusiveOrExpressionContext exclusiveOrExpression() throws RecognitionException {
		return exclusiveOrExpression(0);
	}

	private ExclusiveOrExpressionContext exclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExclusiveOrExpressionContext _localctx = new ExclusiveOrExpressionContext(_ctx, _parentState);
		ExclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_exclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(499);
			andExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(506);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_exclusiveOrExpression);
					setState(501);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(502);
					match(Caret);
					setState(503);
					andExpression(0);
					}
					} 
				}
				setState(508);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InclusiveOrExpressionContext extends ParserRuleContext {
		public ExclusiveOrExpressionContext exclusiveOrExpression() {
			return getRuleContext(ExclusiveOrExpressionContext.class,0);
		}
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public TerminalNode Or() { return getToken(TripleJParser.Or, 0); }
		public InclusiveOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inclusiveOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterInclusiveOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitInclusiveOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitInclusiveOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InclusiveOrExpressionContext inclusiveOrExpression() throws RecognitionException {
		return inclusiveOrExpression(0);
	}

	private InclusiveOrExpressionContext inclusiveOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InclusiveOrExpressionContext _localctx = new InclusiveOrExpressionContext(_ctx, _parentState);
		InclusiveOrExpressionContext _prevctx = _localctx;
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_inclusiveOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(510);
			exclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(517);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InclusiveOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_inclusiveOrExpression);
					setState(512);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(513);
					match(Or);
					setState(514);
					exclusiveOrExpression(0);
					}
					} 
				}
				setState(519);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalAndExpressionContext extends ParserRuleContext {
		public InclusiveOrExpressionContext inclusiveOrExpression() {
			return getRuleContext(InclusiveOrExpressionContext.class,0);
		}
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public TerminalNode AndAnd() { return getToken(TripleJParser.AndAnd, 0); }
		public LogicalAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterLogicalAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitLogicalAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitLogicalAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalAndExpressionContext logicalAndExpression() throws RecognitionException {
		return logicalAndExpression(0);
	}

	private LogicalAndExpressionContext logicalAndExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalAndExpressionContext _localctx = new LogicalAndExpressionContext(_ctx, _parentState);
		LogicalAndExpressionContext _prevctx = _localctx;
		int _startState = 36;
		enterRecursionRule(_localctx, 36, RULE_logicalAndExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(521);
			inclusiveOrExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(528);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalAndExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalAndExpression);
					setState(523);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(524);
					match(AndAnd);
					setState(525);
					inclusiveOrExpression(0);
					}
					} 
				}
				setState(530);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class LogicalOrExpressionContext extends ParserRuleContext {
		public LogicalAndExpressionContext logicalAndExpression() {
			return getRuleContext(LogicalAndExpressionContext.class,0);
		}
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode OrOr() { return getToken(TripleJParser.OrOr, 0); }
		public LogicalOrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOrExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterLogicalOrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitLogicalOrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitLogicalOrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalOrExpressionContext logicalOrExpression() throws RecognitionException {
		return logicalOrExpression(0);
	}

	private LogicalOrExpressionContext logicalOrExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalOrExpressionContext _localctx = new LogicalOrExpressionContext(_ctx, _parentState);
		LogicalOrExpressionContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_logicalOrExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(532);
			logicalAndExpression(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(539);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalOrExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalOrExpression);
					setState(534);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(535);
					match(OrOr);
					setState(536);
					logicalAndExpression(0);
					}
					} 
				}
				setState(541);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalExpressionContext extends ParserRuleContext {
		public LogicalOrExpressionContext logicalOrExpression() {
			return getRuleContext(LogicalOrExpressionContext.class,0);
		}
		public TerminalNode Question() { return getToken(TripleJParser.Question, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TripleJParser.Colon, 0); }
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConditionalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterConditionalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitConditionalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitConditionalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalExpressionContext conditionalExpression() throws RecognitionException {
		ConditionalExpressionContext _localctx = new ConditionalExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_conditionalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(542);
			logicalOrExpression(0);
			setState(548);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(543);
				match(Question);
				setState(544);
				expression(0);
				setState(545);
				match(Colon);
				setState(546);
				conditionalExpression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public List<UnaryExpressionContext> unaryExpression() {
			return getRuleContexts(UnaryExpressionContext.class);
		}
		public UnaryExpressionContext unaryExpression(int i) {
			return getRuleContext(UnaryExpressionContext.class,i);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode DigitSequence() { return getToken(TripleJParser.DigitSequence, 0); }
		public AssignmentExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterAssignmentExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitAssignmentExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitAssignmentExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentExpressionContext assignmentExpression() throws RecognitionException {
		AssignmentExpressionContext _localctx = new AssignmentExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_assignmentExpression);
		try {
			setState(570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(550);
				conditionalExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(551);
				unaryExpression();
				setState(552);
				assignmentOperator();
				setState(553);
				assignmentExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(555);
				unaryExpression();
				setState(556);
				assignmentOperator();
				setState(557);
				assignmentExpression();
				setState(558);
				unaryExpression();
				setState(559);
				if (!( false )) throw new FailedPredicateException(this, " false ", "Missing operator after variable");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(561);
				unaryExpression();
				setState(562);
				assignmentOperator();
				setState(563);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Missing value after assignment operator");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(565);
				unaryExpression();
				setState(566);
				assignmentOperator();
				setState(567);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Missing assignment, add operator and value.");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(569);
				match(DigitSequence);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode Assign() { return getToken(TripleJParser.Assign, 0); }
		public TerminalNode StarAssign() { return getToken(TripleJParser.StarAssign, 0); }
		public TerminalNode DivAssign() { return getToken(TripleJParser.DivAssign, 0); }
		public TerminalNode ModAssign() { return getToken(TripleJParser.ModAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(TripleJParser.PlusAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(TripleJParser.MinusAssign, 0); }
		public TerminalNode LeftShiftAssign() { return getToken(TripleJParser.LeftShiftAssign, 0); }
		public TerminalNode RightShiftAssign() { return getToken(TripleJParser.RightShiftAssign, 0); }
		public TerminalNode AndAssign() { return getToken(TripleJParser.AndAssign, 0); }
		public TerminalNode XorAssign() { return getToken(TripleJParser.XorAssign, 0); }
		public TerminalNode OrAssign() { return getToken(TripleJParser.OrAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(572);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (Assign - 98)) | (1L << (StarAssign - 98)) | (1L << (DivAssign - 98)) | (1L << (ModAssign - 98)) | (1L << (PlusAssign - 98)) | (1L << (MinusAssign - 98)) | (1L << (LeftShiftAssign - 98)) | (1L << (RightShiftAssign - 98)) | (1L << (AndAssign - 98)) | (1L << (XorAssign - 98)) | (1L << (OrAssign - 98)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(575);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(587);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(585);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(577);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(578);
						match(Comma);
						setState(579);
						assignmentExpression();
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(580);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(581);
						match(T__4);
						setState(582);
						assignmentExpression();
						setState(583);
						if (!( false )) throw new FailedPredicateException(this, " false ",  "Duplicate ','");
						}
						break;
					}
					} 
				}
				setState(589);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,37,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantExpressionContext extends ParserRuleContext {
		public ConditionalExpressionContext conditionalExpression() {
			return getRuleContext(ConditionalExpressionContext.class,0);
		}
		public ConstantExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterConstantExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitConstantExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitConstantExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantExpressionContext constantExpression() throws RecognitionException {
		ConstantExpressionContext _localctx = new ConstantExpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_constantExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			conditionalExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TripleJParser.Semi, 0); }
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_declaration);
		try {
			setState(600);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(592);
				declarationSpecifiers();
				setState(593);
				initDeclaratorList(0);
				setState(594);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				declarationSpecifiers();
				setState(597);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(599);
				staticAssertDeclaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiersContext extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDeclarationSpecifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDeclarationSpecifiers(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDeclarationSpecifiers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiersContext declarationSpecifiers() throws RecognitionException {
		DeclarationSpecifiersContext _localctx = new DeclarationSpecifiersContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_declarationSpecifiers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(603); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(602);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(605); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,39,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifiers2Context extends ParserRuleContext {
		public List<DeclarationSpecifierContext> declarationSpecifier() {
			return getRuleContexts(DeclarationSpecifierContext.class);
		}
		public DeclarationSpecifierContext declarationSpecifier(int i) {
			return getRuleContext(DeclarationSpecifierContext.class,i);
		}
		public DeclarationSpecifiers2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifiers2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDeclarationSpecifiers2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDeclarationSpecifiers2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDeclarationSpecifiers2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifiers2Context declarationSpecifiers2() throws RecognitionException {
		DeclarationSpecifiers2Context _localctx = new DeclarationSpecifiers2Context(_ctx, getState());
		enterRule(_localctx, 54, RULE_declarationSpecifiers2);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(608); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(607);
					declarationSpecifier();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(610); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationSpecifierContext extends ParserRuleContext {
		public StorageClassSpecifierContext storageClassSpecifier() {
			return getRuleContext(StorageClassSpecifierContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public FunctionSpecifierContext functionSpecifier() {
			return getRuleContext(FunctionSpecifierContext.class,0);
		}
		public AlignmentSpecifierContext alignmentSpecifier() {
			return getRuleContext(AlignmentSpecifierContext.class,0);
		}
		public DeclarationSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDeclarationSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDeclarationSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDeclarationSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationSpecifierContext declarationSpecifier() throws RecognitionException {
		DeclarationSpecifierContext _localctx = new DeclarationSpecifierContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_declarationSpecifier);
		try {
			setState(617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				storageClassSpecifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(613);
				typeSpecifier(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(614);
				typeQualifier();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(615);
				functionSpecifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(616);
				alignmentSpecifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitDeclaratorListContext extends ParserRuleContext {
		public InitDeclaratorContext initDeclarator() {
			return getRuleContext(InitDeclaratorContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public InitDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterInitDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitInitDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitInitDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorListContext initDeclaratorList() throws RecognitionException {
		return initDeclaratorList(0);
	}

	private InitDeclaratorListContext initDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitDeclaratorListContext _localctx = new InitDeclaratorListContext(_ctx, _parentState);
		InitDeclaratorListContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_initDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(620);
			initDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(627);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initDeclaratorList);
					setState(622);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(623);
					match(Comma);
					setState(624);
					initDeclarator();
					}
					} 
				}
				setState(629);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class InitDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TripleJParser.Assign, 0); }
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public InitDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterInitDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitInitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitInitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclaratorContext initDeclarator() throws RecognitionException {
		InitDeclaratorContext _localctx = new InitDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_initDeclarator);
		try {
			setState(635);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(630);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(631);
				declarator();
				setState(632);
				match(Assign);
				setState(633);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageClassSpecifierContext extends ParserRuleContext {
		public TerminalNode Typedef() { return getToken(TripleJParser.Typedef, 0); }
		public TerminalNode Extern() { return getToken(TripleJParser.Extern, 0); }
		public TerminalNode Static() { return getToken(TripleJParser.Static, 0); }
		public TerminalNode ThreadLocal() { return getToken(TripleJParser.ThreadLocal, 0); }
		public TerminalNode Auto() { return getToken(TripleJParser.Auto, 0); }
		public TerminalNode Register() { return getToken(TripleJParser.Register, 0); }
		public StorageClassSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageClassSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterStorageClassSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitStorageClassSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitStorageClassSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageClassSpecifierContext storageClassSpecifier() throws RecognitionException {
		StorageClassSpecifierContext _localctx = new StorageClassSpecifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_storageClassSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(637);
			_la = _input.LA(1);
			if ( !(((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & ((1L << (Auto - 22)) | (1L << (Extern - 22)) | (1L << (Register - 22)) | (1L << (Static - 22)) | (1L << (Typedef - 22)) | (1L << (ThreadLocal - 22)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Void() { return getToken(TripleJParser.Void, 0); }
		public TerminalNode Char() { return getToken(TripleJParser.Char, 0); }
		public TerminalNode Short() { return getToken(TripleJParser.Short, 0); }
		public TerminalNode Int() { return getToken(TripleJParser.Int, 0); }
		public TerminalNode Long() { return getToken(TripleJParser.Long, 0); }
		public TerminalNode Float() { return getToken(TripleJParser.Float, 0); }
		public TerminalNode Double() { return getToken(TripleJParser.Double, 0); }
		public TerminalNode Signed() { return getToken(TripleJParser.Signed, 0); }
		public TerminalNode Unsigned() { return getToken(TripleJParser.Unsigned, 0); }
		public TerminalNode Bool() { return getToken(TripleJParser.Bool, 0); }
		public TerminalNode Complex() { return getToken(TripleJParser.Complex, 0); }
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public AtomicTypeSpecifierContext atomicTypeSpecifier() {
			return getRuleContext(AtomicTypeSpecifierContext.class,0);
		}
		public StructOrUnionSpecifierContext structOrUnionSpecifier() {
			return getRuleContext(StructOrUnionSpecifierContext.class,0);
		}
		public EnumSpecifierContext enumSpecifier() {
			return getRuleContext(EnumSpecifierContext.class,0);
		}
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeSpecifierContext typeSpecifier() throws RecognitionException {
		return typeSpecifier(0);
	}

	private TypeSpecifierContext typeSpecifier(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeSpecifierContext _localctx = new TypeSpecifierContext(_ctx, _parentState);
		TypeSpecifierContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_typeSpecifier, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(654);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case Char:
			case Double:
			case Float:
			case Int:
			case Long:
			case Short:
			case Signed:
			case Unsigned:
			case Void:
			case Bool:
			case Complex:
				{
				setState(640);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << Char) | (1L << Double) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Unsigned) | (1L << Void) | (1L << Bool) | (1L << Complex))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__0:
				{
				setState(641);
				match(T__0);
				setState(642);
				match(LeftParen);
				setState(643);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(644);
				match(RightParen);
				}
				break;
			case Atomic:
				{
				setState(645);
				atomicTypeSpecifier();
				}
				break;
			case Struct:
			case Union:
				{
				setState(646);
				structOrUnionSpecifier();
				}
				break;
			case Enum:
				{
				setState(647);
				enumSpecifier();
				}
				break;
			case T__14:
			case Identifier:
				{
				setState(648);
				typedefName();
				}
				break;
			case T__8:
				{
				setState(649);
				match(T__8);
				setState(650);
				match(LeftParen);
				setState(651);
				constantExpression();
				setState(652);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(660);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeSpecifierContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeSpecifier);
					setState(656);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(657);
					pointer();
					}
					} 
				}
				setState(662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructOrUnionSpecifierContext extends ParserRuleContext {
		public StructOrUnionContext structOrUnion() {
			return getRuleContext(StructOrUnionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TripleJParser.LeftBrace, 0); }
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(TripleJParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public StructOrUnionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterStructOrUnionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitStructOrUnionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitStructOrUnionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionSpecifierContext structOrUnionSpecifier() throws RecognitionException {
		StructOrUnionSpecifierContext _localctx = new StructOrUnionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_structOrUnionSpecifier);
		int _la;
		try {
			setState(674);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				structOrUnion();
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(664);
					match(Identifier);
					}
				}

				setState(667);
				match(LeftBrace);
				setState(668);
				structDeclarationList(0);
				setState(669);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(671);
				structOrUnion();
				setState(672);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructOrUnionContext extends ParserRuleContext {
		public TerminalNode Struct() { return getToken(TripleJParser.Struct, 0); }
		public TerminalNode Union() { return getToken(TripleJParser.Union, 0); }
		public StructOrUnionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structOrUnion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterStructOrUnion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitStructOrUnion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitStructOrUnion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructOrUnionContext structOrUnion() throws RecognitionException {
		StructOrUnionContext _localctx = new StructOrUnionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_structOrUnion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(676);
			_la = _input.LA(1);
			if ( !(_la==Struct || _la==Union) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationListContext extends ParserRuleContext {
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public StructDeclarationListContext structDeclarationList() {
			return getRuleContext(StructDeclarationListContext.class,0);
		}
		public StructDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterStructDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitStructDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitStructDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationListContext structDeclarationList() throws RecognitionException {
		return structDeclarationList(0);
	}

	private StructDeclarationListContext structDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclarationListContext _localctx = new StructDeclarationListContext(_ctx, _parentState);
		StructDeclarationListContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_structDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(679);
			structDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(685);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclarationList);
					setState(681);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(682);
					structDeclaration();
					}
					} 
				}
				setState(687);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TripleJParser.Semi, 0); }
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public StaticAssertDeclarationContext staticAssertDeclaration() {
			return getRuleContext(StaticAssertDeclarationContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitStructDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitStructDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_structDeclaration);
		int _la;
		try {
			setState(695);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__14:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Float:
			case Int:
			case Long:
			case Restrict:
			case Short:
			case Signed:
			case Struct:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Atomic:
			case Bool:
			case Complex:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(688);
				specifierQualifierList();
				setState(690);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Star - 68)) | (1L << (Caret - 68)) | (1L << (Colon - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(689);
					structDeclaratorList(0);
					}
				}

				setState(692);
				match(Semi);
				}
				break;
			case StaticAssert:
				enterOuterAlt(_localctx, 2);
				{
				setState(694);
				staticAssertDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecifierQualifierListContext extends ParserRuleContext {
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public SpecifierQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specifierQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterSpecifierQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitSpecifierQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitSpecifierQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecifierQualifierListContext specifierQualifierList() throws RecognitionException {
		SpecifierQualifierListContext _localctx = new SpecifierQualifierListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_specifierQualifierList);
		try {
			setState(705);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(697);
				typeSpecifier(0);
				setState(699);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(698);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				typeQualifier();
				setState(703);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(702);
					specifierQualifierList();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclaratorListContext extends ParserRuleContext {
		public StructDeclaratorContext structDeclarator() {
			return getRuleContext(StructDeclaratorContext.class,0);
		}
		public StructDeclaratorListContext structDeclaratorList() {
			return getRuleContext(StructDeclaratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public StructDeclaratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterStructDeclaratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitStructDeclaratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitStructDeclaratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorListContext structDeclaratorList() throws RecognitionException {
		return structDeclaratorList(0);
	}

	private StructDeclaratorListContext structDeclaratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		StructDeclaratorListContext _localctx = new StructDeclaratorListContext(_ctx, _parentState);
		StructDeclaratorListContext _prevctx = _localctx;
		int _startState = 76;
		enterRecursionRule(_localctx, 76, RULE_structDeclaratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(708);
			structDeclarator();
			}
			_ctx.stop = _input.LT(-1);
			setState(715);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new StructDeclaratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_structDeclaratorList);
					setState(710);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(711);
					match(Comma);
					setState(712);
					structDeclarator();
					}
					} 
				}
				setState(717);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,54,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class StructDeclaratorContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode Colon() { return getToken(TripleJParser.Colon, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public StructDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterStructDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitStructDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitStructDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StructDeclaratorContext structDeclarator() throws RecognitionException {
		StructDeclaratorContext _localctx = new StructDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structDeclarator);
		int _la;
		try {
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Star - 68)) | (1L << (Caret - 68)) | (1L << (Identifier - 68)))) != 0)) {
					{
					setState(719);
					declarator();
					}
				}

				setState(722);
				match(Colon);
				setState(723);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumSpecifierContext extends ParserRuleContext {
		public TerminalNode Enum() { return getToken(TripleJParser.Enum, 0); }
		public TerminalNode LeftBrace() { return getToken(TripleJParser.LeftBrace, 0); }
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(TripleJParser.RightBrace, 0); }
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public EnumSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterEnumSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitEnumSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitEnumSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumSpecifierContext enumSpecifier() throws RecognitionException {
		EnumSpecifierContext _localctx = new EnumSpecifierContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_enumSpecifier);
		int _la;
		try {
			setState(745);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(726);
				match(Enum);
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(727);
					match(Identifier);
					}
				}

				setState(730);
				match(LeftBrace);
				setState(731);
				enumeratorList(0);
				setState(732);
				match(RightBrace);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(734);
				match(Enum);
				setState(736);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Identifier) {
					{
					setState(735);
					match(Identifier);
					}
				}

				setState(738);
				match(LeftBrace);
				setState(739);
				enumeratorList(0);
				setState(740);
				match(Comma);
				setState(741);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(743);
				match(Enum);
				setState(744);
				match(Identifier);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumeratorListContext extends ParserRuleContext {
		public EnumeratorContext enumerator() {
			return getRuleContext(EnumeratorContext.class,0);
		}
		public EnumeratorListContext enumeratorList() {
			return getRuleContext(EnumeratorListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public EnumeratorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumeratorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterEnumeratorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitEnumeratorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitEnumeratorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorListContext enumeratorList() throws RecognitionException {
		return enumeratorList(0);
	}

	private EnumeratorListContext enumeratorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		EnumeratorListContext _localctx = new EnumeratorListContext(_ctx, _parentState);
		EnumeratorListContext _prevctx = _localctx;
		int _startState = 82;
		enterRecursionRule(_localctx, 82, RULE_enumeratorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(748);
			enumerator();
			}
			_ctx.stop = _input.LT(-1);
			setState(755);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new EnumeratorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_enumeratorList);
					setState(750);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(751);
					match(Comma);
					setState(752);
					enumerator();
					}
					} 
				}
				setState(757);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,60,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class EnumeratorContext extends ParserRuleContext {
		public EnumerationConstantContext enumerationConstant() {
			return getRuleContext(EnumerationConstantContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TripleJParser.Assign, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public EnumeratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterEnumerator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitEnumerator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitEnumerator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumeratorContext enumerator() throws RecognitionException {
		EnumeratorContext _localctx = new EnumeratorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_enumerator);
		try {
			setState(763);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(758);
				enumerationConstant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(759);
				enumerationConstant();
				setState(760);
				match(Assign);
				setState(761);
				constantExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumerationConstantContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public EnumerationConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumerationConstant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterEnumerationConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitEnumerationConstant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitEnumerationConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EnumerationConstantContext enumerationConstant() throws RecognitionException {
		EnumerationConstantContext _localctx = new EnumerationConstantContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_enumerationConstant);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(765);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtomicTypeSpecifierContext extends ParserRuleContext {
		public TerminalNode Atomic() { return getToken(TripleJParser.Atomic, 0); }
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public AtomicTypeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atomicTypeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterAtomicTypeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitAtomicTypeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitAtomicTypeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomicTypeSpecifierContext atomicTypeSpecifier() throws RecognitionException {
		AtomicTypeSpecifierContext _localctx = new AtomicTypeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_atomicTypeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(767);
			match(Atomic);
			setState(768);
			match(LeftParen);
			setState(769);
			typeName();
			setState(770);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(TripleJParser.Const, 0); }
		public TerminalNode Restrict() { return getToken(TripleJParser.Restrict, 0); }
		public TerminalNode Volatile() { return getToken(TripleJParser.Volatile, 0); }
		public TerminalNode Atomic() { return getToken(TripleJParser.Atomic, 0); }
		public TypeQualifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterTypeQualifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitTypeQualifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitTypeQualifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierContext typeQualifier() throws RecognitionException {
		TypeQualifierContext _localctx = new TypeQualifierContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_typeQualifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSpecifierContext extends ParserRuleContext {
		public TerminalNode Inline() { return getToken(TripleJParser.Inline, 0); }
		public TerminalNode Noreturn() { return getToken(TripleJParser.Noreturn, 0); }
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public FunctionSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterFunctionSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitFunctionSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitFunctionSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSpecifierContext functionSpecifier() throws RecognitionException {
		FunctionSpecifierContext _localctx = new FunctionSpecifierContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_functionSpecifier);
		int _la;
		try {
			setState(780);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__10:
			case Inline:
			case Noreturn:
				enterOuterAlt(_localctx, 1);
				{
				setState(774);
				_la = _input.LA(1);
				if ( !(((((_la - 10)) & ~0x3f) == 0 && ((1L << (_la - 10)) & ((1L << (T__9 - 10)) | (1L << (T__10 - 10)) | (1L << (Inline - 10)) | (1L << (Noreturn - 10)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(775);
				gccAttributeSpecifier();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(776);
				match(T__11);
				setState(777);
				match(LeftParen);
				setState(778);
				match(Identifier);
				setState(779);
				match(RightParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlignmentSpecifierContext extends ParserRuleContext {
		public TerminalNode Alignas() { return getToken(TripleJParser.Alignas, 0); }
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public AlignmentSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alignmentSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterAlignmentSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitAlignmentSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitAlignmentSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlignmentSpecifierContext alignmentSpecifier() throws RecognitionException {
		AlignmentSpecifierContext _localctx = new AlignmentSpecifierContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_alignmentSpecifier);
		try {
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(782);
				match(Alignas);
				setState(783);
				match(LeftParen);
				setState(784);
				typeName();
				setState(785);
				match(RightParen);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				match(Alignas);
				setState(788);
				match(LeftParen);
				setState(789);
				constantExpression();
				setState(790);
				match(RightParen);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaratorContext extends ParserRuleContext {
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public DeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaratorContext declarator() throws RecognitionException {
		DeclaratorContext _localctx = new DeclaratorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_declarator);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Star || _la==Caret) {
				{
				setState(794);
				pointer();
				}
			}

			setState(797);
			directDeclarator(0);
			setState(801);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(798);
					gccDeclaratorExtension();
					}
					} 
				}
				setState(803);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,65,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectDeclaratorContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public TerminalNode Colon() { return getToken(TripleJParser.Colon, 0); }
		public TerminalNode DigitSequence() { return getToken(TripleJParser.DigitSequence, 0); }
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectDeclaratorContext directDeclarator() {
			return getRuleContext(DirectDeclaratorContext.class,0);
		}
		public TypeSpecifierContext typeSpecifier() {
			return getRuleContext(TypeSpecifierContext.class,0);
		}
		public TerminalNode LeftBracket() { return getToken(TripleJParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TripleJParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(TripleJParser.Static, 0); }
		public TerminalNode Star() { return getToken(TripleJParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public DirectDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDirectDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDirectDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDirectDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectDeclaratorContext directDeclarator() throws RecognitionException {
		return directDeclarator(0);
	}

	private DirectDeclaratorContext directDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectDeclaratorContext _localctx = new DirectDeclaratorContext(_ctx, _parentState);
		DirectDeclaratorContext _prevctx = _localctx;
		int _startState = 98;
		enterRecursionRule(_localctx, 98, RULE_directDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(821);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				setState(805);
				match(Identifier);
				}
				break;
			case 2:
				{
				setState(806);
				match(LeftParen);
				setState(807);
				declarator();
				setState(808);
				match(RightParen);
				}
				break;
			case 3:
				{
				setState(810);
				match(Identifier);
				setState(811);
				match(Colon);
				setState(812);
				match(DigitSequence);
				}
				break;
			case 4:
				{
				setState(813);
				match(LeftParen);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__14) | (1L << Char) | (1L << Double) | (1L << Enum) | (1L << Float) | (1L << Int) | (1L << Long) | (1L << Short) | (1L << Signed) | (1L << Struct) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || _la==Identifier) {
					{
					setState(814);
					typeSpecifier(0);
					}
				}

				setState(817);
				pointer();
				setState(818);
				directDeclarator(0);
				setState(819);
				match(RightParen);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(868);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(866);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
					case 1:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(823);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(824);
						match(LeftBracket);
						setState(826);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(825);
							typeQualifierList(0);
							}
						}

						setState(829);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (AndAnd - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
							{
							setState(828);
							assignmentExpression();
							}
						}

						setState(831);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(832);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(833);
						match(LeftBracket);
						setState(834);
						match(Static);
						setState(836);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(835);
							typeQualifierList(0);
							}
						}

						setState(838);
						assignmentExpression();
						setState(839);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(841);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(842);
						match(LeftBracket);
						setState(843);
						typeQualifierList(0);
						setState(844);
						match(Static);
						setState(845);
						assignmentExpression();
						setState(846);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(848);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(849);
						match(LeftBracket);
						setState(851);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(850);
							typeQualifierList(0);
							}
						}

						setState(853);
						match(Star);
						setState(854);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(855);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(856);
						match(LeftParen);
						setState(857);
						parameterTypeList();
						setState(858);
						match(RightParen);
						}
						break;
					case 6:
						{
						_localctx = new DirectDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directDeclarator);
						setState(860);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(861);
						match(LeftParen);
						setState(863);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==Identifier) {
							{
							setState(862);
							identifierList(0);
							}
						}

						setState(865);
						match(RightParen);
						}
						break;
					}
					} 
				}
				setState(870);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class GccDeclaratorExtensionContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(TripleJParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(TripleJParser.StringLiteral, i);
		}
		public GccAttributeSpecifierContext gccAttributeSpecifier() {
			return getRuleContext(GccAttributeSpecifierContext.class,0);
		}
		public GccDeclaratorExtensionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccDeclaratorExtension; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterGccDeclaratorExtension(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitGccDeclaratorExtension(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitGccDeclaratorExtension(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccDeclaratorExtensionContext gccDeclaratorExtension() throws RecognitionException {
		GccDeclaratorExtensionContext _localctx = new GccDeclaratorExtensionContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_gccDeclaratorExtension);
		int _la;
		try {
			setState(880);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(871);
				match(T__12);
				setState(872);
				match(LeftParen);
				setState(874); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(873);
					match(StringLiteral);
					}
					}
					setState(876); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==StringLiteral );
				setState(878);
				match(RightParen);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(879);
				gccAttributeSpecifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeSpecifierContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(TripleJParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(TripleJParser.LeftParen, i);
		}
		public GccAttributeListContext gccAttributeList() {
			return getRuleContext(GccAttributeListContext.class,0);
		}
		public List<TerminalNode> RightParen() { return getTokens(TripleJParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(TripleJParser.RightParen, i);
		}
		public GccAttributeSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterGccAttributeSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitGccAttributeSpecifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitGccAttributeSpecifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeSpecifierContext gccAttributeSpecifier() throws RecognitionException {
		GccAttributeSpecifierContext _localctx = new GccAttributeSpecifierContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_gccAttributeSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			match(T__13);
			setState(883);
			match(LeftParen);
			setState(884);
			match(LeftParen);
			setState(885);
			gccAttributeList();
			setState(886);
			match(RightParen);
			setState(887);
			match(RightParen);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeListContext extends ParserRuleContext {
		public List<GccAttributeContext> gccAttribute() {
			return getRuleContexts(GccAttributeContext.class);
		}
		public GccAttributeContext gccAttribute(int i) {
			return getRuleContext(GccAttributeContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(TripleJParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TripleJParser.Comma, i);
		}
		public GccAttributeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttributeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterGccAttributeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitGccAttributeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitGccAttributeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeListContext gccAttributeList() throws RecognitionException {
		GccAttributeListContext _localctx = new GccAttributeListContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_gccAttributeList);
		int _la;
		try {
			setState(898);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(889);
				gccAttribute();
				setState(894);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(890);
					match(Comma);
					setState(891);
					gccAttribute();
					}
					}
					setState(896);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GccAttributeContext extends ParserRuleContext {
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public List<TerminalNode> LeftParen() { return getTokens(TripleJParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(TripleJParser.LeftParen, i);
		}
		public List<TerminalNode> RightParen() { return getTokens(TripleJParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(TripleJParser.RightParen, i);
		}
		public ArgumentExpressionListContext argumentExpressionList() {
			return getRuleContext(ArgumentExpressionListContext.class,0);
		}
		public GccAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gccAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterGccAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitGccAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitGccAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GccAttributeContext gccAttribute() throws RecognitionException {
		GccAttributeContext _localctx = new GccAttributeContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_gccAttribute);
		int _la;
		try {
			setState(909);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case Auto:
			case Break:
			case Case:
			case Char:
			case Const:
			case Continue:
			case Default:
			case Do:
			case Double:
			case Downto:
			case Else:
			case Enum:
			case Extern:
			case Float:
			case For:
			case Goto:
			case If:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Return:
			case Short:
			case Signed:
			case Sizeof:
			case Static:
			case Struct:
			case Switch:
			case Typedef:
			case Union:
			case Unsigned:
			case Upto:
			case Void:
			case Volatile:
			case While:
			case Alignas:
			case Alignof:
			case Atomic:
			case Bool:
			case Complex:
			case Generic:
			case Imaginary:
			case Noreturn:
			case StaticAssert:
			case ThreadLocal:
			case LeftBracket:
			case RightBracket:
			case LeftBrace:
			case RightBrace:
			case Less:
			case LessEqual:
			case Greater:
			case GreaterEqual:
			case LeftShift:
			case RightShift:
			case Plus:
			case PlusPlus:
			case Minus:
			case MinusMinus:
			case Star:
			case Div:
			case Mod:
			case And:
			case Or:
			case AndAnd:
			case OrOr:
			case Caret:
			case Not:
			case Tilde:
			case Question:
			case Colon:
			case Semi:
			case Assign:
			case StarAssign:
			case DivAssign:
			case ModAssign:
			case PlusAssign:
			case MinusAssign:
			case LeftShiftAssign:
			case RightShiftAssign:
			case AndAssign:
			case XorAssign:
			case OrAssign:
			case Equal:
			case NotEqual:
			case Arrow:
			case Dot:
			case Ellipsis:
			case Identifier:
			case Constant:
			case DigitSequence:
			case StringLiteral:
			case ComplexDefine:
			case IncludeDirective:
			case AsmBlock:
			case LineAfterPreprocessing:
			case LineDirective:
			case PragmaDirective:
			case Whitespace:
			case Newline:
			case BlockComment:
			case LineComment:
				enterOuterAlt(_localctx, 1);
				{
				setState(900);
				_la = _input.LA(1);
				if ( _la <= 0 || (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (RightParen - 68)) | (1L << (Comma - 68)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(906);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LeftParen) {
					{
					setState(901);
					match(LeftParen);
					setState(903);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (AndAnd - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
						{
						setState(902);
						argumentExpressionList(0);
						}
					}

					setState(905);
					match(RightParen);
					}
				}

				}
				break;
			case RightParen:
			case Comma:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedParenthesesBlockContext extends ParserRuleContext {
		public List<TerminalNode> LeftParen() { return getTokens(TripleJParser.LeftParen); }
		public TerminalNode LeftParen(int i) {
			return getToken(TripleJParser.LeftParen, i);
		}
		public List<NestedParenthesesBlockContext> nestedParenthesesBlock() {
			return getRuleContexts(NestedParenthesesBlockContext.class);
		}
		public NestedParenthesesBlockContext nestedParenthesesBlock(int i) {
			return getRuleContext(NestedParenthesesBlockContext.class,i);
		}
		public List<TerminalNode> RightParen() { return getTokens(TripleJParser.RightParen); }
		public TerminalNode RightParen(int i) {
			return getToken(TripleJParser.RightParen, i);
		}
		public NestedParenthesesBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedParenthesesBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterNestedParenthesesBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitNestedParenthesesBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitNestedParenthesesBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedParenthesesBlockContext nestedParenthesesBlock() throws RecognitionException {
		NestedParenthesesBlockContext _localctx = new NestedParenthesesBlockContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_nestedParenthesesBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(918);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Downto) | (1L << Else) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Upto) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (Imaginary - 64)) | (1L << (Noreturn - 64)) | (1L << (StaticAssert - 64)) | (1L << (ThreadLocal - 64)) | (1L << (LeftParen - 64)) | (1L << (LeftBracket - 64)) | (1L << (RightBracket - 64)) | (1L << (LeftBrace - 64)) | (1L << (RightBrace - 64)) | (1L << (Less - 64)) | (1L << (LessEqual - 64)) | (1L << (Greater - 64)) | (1L << (GreaterEqual - 64)) | (1L << (LeftShift - 64)) | (1L << (RightShift - 64)) | (1L << (Plus - 64)) | (1L << (PlusPlus - 64)) | (1L << (Minus - 64)) | (1L << (MinusMinus - 64)) | (1L << (Star - 64)) | (1L << (Div - 64)) | (1L << (Mod - 64)) | (1L << (And - 64)) | (1L << (Or - 64)) | (1L << (AndAnd - 64)) | (1L << (OrOr - 64)) | (1L << (Caret - 64)) | (1L << (Not - 64)) | (1L << (Tilde - 64)) | (1L << (Question - 64)) | (1L << (Colon - 64)) | (1L << (Semi - 64)) | (1L << (Comma - 64)) | (1L << (Assign - 64)) | (1L << (StarAssign - 64)) | (1L << (DivAssign - 64)) | (1L << (ModAssign - 64)) | (1L << (PlusAssign - 64)) | (1L << (MinusAssign - 64)) | (1L << (LeftShiftAssign - 64)) | (1L << (RightShiftAssign - 64)) | (1L << (AndAssign - 64)) | (1L << (XorAssign - 64)) | (1L << (OrAssign - 64)) | (1L << (Equal - 64)) | (1L << (NotEqual - 64)) | (1L << (Arrow - 64)) | (1L << (Dot - 64)) | (1L << (Ellipsis - 64)) | (1L << (Identifier - 64)) | (1L << (Constant - 64)) | (1L << (DigitSequence - 64)) | (1L << (StringLiteral - 64)) | (1L << (ComplexDefine - 64)) | (1L << (IncludeDirective - 64)) | (1L << (AsmBlock - 64)) | (1L << (LineAfterPreprocessing - 64)) | (1L << (LineDirective - 64)) | (1L << (PragmaDirective - 64)) | (1L << (Whitespace - 64)) | (1L << (Newline - 64)) | (1L << (BlockComment - 64)) | (1L << (LineComment - 64)))) != 0)) {
				{
				setState(916);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
				case T__13:
				case T__14:
				case T__15:
				case T__16:
				case T__17:
				case T__18:
				case T__19:
				case T__20:
				case Auto:
				case Break:
				case Case:
				case Char:
				case Const:
				case Continue:
				case Default:
				case Do:
				case Double:
				case Downto:
				case Else:
				case Enum:
				case Extern:
				case Float:
				case For:
				case Goto:
				case If:
				case Inline:
				case Int:
				case Long:
				case Register:
				case Restrict:
				case Return:
				case Short:
				case Signed:
				case Sizeof:
				case Static:
				case Struct:
				case Switch:
				case Typedef:
				case Union:
				case Unsigned:
				case Upto:
				case Void:
				case Volatile:
				case While:
				case Alignas:
				case Alignof:
				case Atomic:
				case Bool:
				case Complex:
				case Generic:
				case Imaginary:
				case Noreturn:
				case StaticAssert:
				case ThreadLocal:
				case LeftBracket:
				case RightBracket:
				case LeftBrace:
				case RightBrace:
				case Less:
				case LessEqual:
				case Greater:
				case GreaterEqual:
				case LeftShift:
				case RightShift:
				case Plus:
				case PlusPlus:
				case Minus:
				case MinusMinus:
				case Star:
				case Div:
				case Mod:
				case And:
				case Or:
				case AndAnd:
				case OrOr:
				case Caret:
				case Not:
				case Tilde:
				case Question:
				case Colon:
				case Semi:
				case Comma:
				case Assign:
				case StarAssign:
				case DivAssign:
				case ModAssign:
				case PlusAssign:
				case MinusAssign:
				case LeftShiftAssign:
				case RightShiftAssign:
				case AndAssign:
				case XorAssign:
				case OrAssign:
				case Equal:
				case NotEqual:
				case Arrow:
				case Dot:
				case Ellipsis:
				case Identifier:
				case Constant:
				case DigitSequence:
				case StringLiteral:
				case ComplexDefine:
				case IncludeDirective:
				case AsmBlock:
				case LineAfterPreprocessing:
				case LineDirective:
				case PragmaDirective:
				case Whitespace:
				case Newline:
				case BlockComment:
				case LineComment:
					{
					setState(911);
					_la = _input.LA(1);
					if ( _la <= 0 || (_la==LeftParen || _la==RightParen) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				case LeftParen:
					{
					setState(912);
					match(LeftParen);
					setState(913);
					nestedParenthesesBlock();
					setState(914);
					match(RightParen);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(920);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PointerContext extends ParserRuleContext {
		public TerminalNode Star() { return getToken(TripleJParser.Star, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public TerminalNode Caret() { return getToken(TripleJParser.Caret, 0); }
		public PointerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pointer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterPointer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitPointer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitPointer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PointerContext pointer() throws RecognitionException {
		PointerContext _localctx = new PointerContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_pointer);
		int _la;
		try {
			setState(939);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				match(Star);
				setState(923);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(922);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(925);
				match(Star);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(926);
					typeQualifierList(0);
					}
				}

				setState(929);
				pointer();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(930);
				match(Caret);
				setState(932);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(931);
					typeQualifierList(0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(934);
				match(Caret);
				setState(936);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(935);
					typeQualifierList(0);
					}
				}

				setState(938);
				pointer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeQualifierListContext extends ParserRuleContext {
		public TypeQualifierContext typeQualifier() {
			return getRuleContext(TypeQualifierContext.class,0);
		}
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public TypeQualifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeQualifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterTypeQualifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitTypeQualifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitTypeQualifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeQualifierListContext typeQualifierList() throws RecognitionException {
		return typeQualifierList(0);
	}

	private TypeQualifierListContext typeQualifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeQualifierListContext _localctx = new TypeQualifierListContext(_ctx, _parentState);
		TypeQualifierListContext _prevctx = _localctx;
		int _startState = 112;
		enterRecursionRule(_localctx, 112, RULE_typeQualifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(942);
			typeQualifier();
			}
			_ctx.stop = _input.LT(-1);
			setState(948);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeQualifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_typeQualifierList);
					setState(944);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(945);
					typeQualifier();
					}
					} 
				}
				setState(950);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterTypeListContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public TerminalNode Ellipsis() { return getToken(TripleJParser.Ellipsis, 0); }
		public ParameterTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterParameterTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitParameterTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitParameterTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterTypeListContext parameterTypeList() throws RecognitionException {
		ParameterTypeListContext _localctx = new ParameterTypeListContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_parameterTypeList);
		try {
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				parameterList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				parameterList(0);
				setState(953);
				match(Comma);
				setState(954);
				match(Ellipsis);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public ParameterDeclarationContext parameterDeclaration() {
			return getRuleContext(ParameterDeclarationContext.class,0);
		}
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitParameterList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		return parameterList(0);
	}

	private ParameterListContext parameterList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ParameterListContext _localctx = new ParameterListContext(_ctx, _parentState);
		ParameterListContext _prevctx = _localctx;
		int _startState = 116;
		enterRecursionRule(_localctx, 116, RULE_parameterList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(959);
			parameterDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ParameterListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_parameterList);
					setState(961);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(962);
					match(Comma);
					setState(963);
					parameterDeclaration();
					}
					} 
				}
				setState(968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParameterDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public DeclarationSpecifiers2Context declarationSpecifiers2() {
			return getRuleContext(DeclarationSpecifiers2Context.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public ParameterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterParameterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitParameterDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitParameterDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterDeclarationContext parameterDeclaration() throws RecognitionException {
		ParameterDeclarationContext _localctx = new ParameterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parameterDeclaration);
		try {
			setState(976);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(969);
				declarationSpecifiers();
				setState(970);
				declarator();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(972);
				declarationSpecifiers2();
				setState(974);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(973);
					abstractDeclarator();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		return identifierList(0);
	}

	private IdentifierListContext identifierList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, _parentState);
		IdentifierListContext _prevctx = _localctx;
		int _startState = 120;
		enterRecursionRule(_localctx, 120, RULE_identifierList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(979);
			match(Identifier);
			}
			_ctx.stop = _input.LT(-1);
			setState(986);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new IdentifierListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_identifierList);
					setState(981);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(982);
					match(Comma);
					setState(983);
					match(Identifier);
					}
					} 
				}
				setState(988);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,94,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public SpecifierQualifierListContext specifierQualifierList() {
			return getRuleContext(SpecifierQualifierListContext.class,0);
		}
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitTypeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitTypeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			specifierQualifierList();
			setState(991);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (LeftBracket - 68)) | (1L << (Star - 68)) | (1L << (Caret - 68)))) != 0)) {
				{
				setState(990);
				abstractDeclarator();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AbstractDeclaratorContext extends ParserRuleContext {
		public PointerContext pointer() {
			return getRuleContext(PointerContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public AbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_abstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AbstractDeclaratorContext abstractDeclarator() throws RecognitionException {
		AbstractDeclaratorContext _localctx = new AbstractDeclaratorContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_abstractDeclarator);
		int _la;
		try {
			int _alt;
			setState(1004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(993);
				pointer();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(995);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Star || _la==Caret) {
					{
					setState(994);
					pointer();
					}
				}

				setState(997);
				directAbstractDeclarator(0);
				setState(1001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(998);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1003);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,97,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectAbstractDeclaratorContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public AbstractDeclaratorContext abstractDeclarator() {
			return getRuleContext(AbstractDeclaratorContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public List<GccDeclaratorExtensionContext> gccDeclaratorExtension() {
			return getRuleContexts(GccDeclaratorExtensionContext.class);
		}
		public GccDeclaratorExtensionContext gccDeclaratorExtension(int i) {
			return getRuleContext(GccDeclaratorExtensionContext.class,i);
		}
		public TerminalNode LeftBracket() { return getToken(TripleJParser.LeftBracket, 0); }
		public TerminalNode RightBracket() { return getToken(TripleJParser.RightBracket, 0); }
		public TypeQualifierListContext typeQualifierList() {
			return getRuleContext(TypeQualifierListContext.class,0);
		}
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode Static() { return getToken(TripleJParser.Static, 0); }
		public TerminalNode Star() { return getToken(TripleJParser.Star, 0); }
		public ParameterTypeListContext parameterTypeList() {
			return getRuleContext(ParameterTypeListContext.class,0);
		}
		public DirectAbstractDeclaratorContext directAbstractDeclarator() {
			return getRuleContext(DirectAbstractDeclaratorContext.class,0);
		}
		public DirectAbstractDeclaratorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directAbstractDeclarator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDirectAbstractDeclarator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDirectAbstractDeclarator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDirectAbstractDeclarator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectAbstractDeclaratorContext directAbstractDeclarator() throws RecognitionException {
		return directAbstractDeclarator(0);
	}

	private DirectAbstractDeclaratorContext directAbstractDeclarator(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DirectAbstractDeclaratorContext _localctx = new DirectAbstractDeclaratorContext(_ctx, _parentState);
		DirectAbstractDeclaratorContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_directAbstractDeclarator, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1007);
				match(LeftParen);
				setState(1008);
				abstractDeclarator();
				setState(1009);
				match(RightParen);
				setState(1013);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1010);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1015);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				}
				}
				break;
			case 2:
				{
				setState(1016);
				match(LeftBracket);
				setState(1018);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(1017);
					typeQualifierList(0);
					}
				}

				setState(1021);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (AndAnd - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(1020);
					assignmentExpression();
					}
				}

				setState(1023);
				match(RightBracket);
				}
				break;
			case 3:
				{
				setState(1024);
				match(LeftBracket);
				setState(1025);
				match(Static);
				setState(1027);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
					{
					setState(1026);
					typeQualifierList(0);
					}
				}

				setState(1029);
				assignmentExpression();
				setState(1030);
				match(RightBracket);
				}
				break;
			case 4:
				{
				setState(1032);
				match(LeftBracket);
				setState(1033);
				typeQualifierList(0);
				setState(1034);
				match(Static);
				setState(1035);
				assignmentExpression();
				setState(1036);
				match(RightBracket);
				}
				break;
			case 5:
				{
				setState(1038);
				match(LeftBracket);
				setState(1039);
				match(Star);
				setState(1040);
				match(RightBracket);
				}
				break;
			case 6:
				{
				setState(1041);
				match(LeftParen);
				setState(1043);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Noreturn - 65)) | (1L << (ThreadLocal - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1042);
					parameterTypeList();
					}
				}

				setState(1045);
				match(RightParen);
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1046);
						gccDeclaratorExtension();
						}
						} 
					}
					setState(1051);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1097);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1095);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
					case 1:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1054);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1055);
						match(LeftBracket);
						setState(1057);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1056);
							typeQualifierList(0);
							}
						}

						setState(1060);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (AndAnd - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
							{
							setState(1059);
							assignmentExpression();
							}
						}

						setState(1062);
						match(RightBracket);
						}
						break;
					case 2:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1063);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1064);
						match(LeftBracket);
						setState(1065);
						match(Static);
						setState(1067);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Const) | (1L << Restrict) | (1L << Volatile) | (1L << Atomic))) != 0)) {
							{
							setState(1066);
							typeQualifierList(0);
							}
						}

						setState(1069);
						assignmentExpression();
						setState(1070);
						match(RightBracket);
						}
						break;
					case 3:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1072);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1073);
						match(LeftBracket);
						setState(1074);
						typeQualifierList(0);
						setState(1075);
						match(Static);
						setState(1076);
						assignmentExpression();
						setState(1077);
						match(RightBracket);
						}
						break;
					case 4:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1079);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1080);
						match(LeftBracket);
						setState(1081);
						match(Star);
						setState(1082);
						match(RightBracket);
						}
						break;
					case 5:
						{
						_localctx = new DirectAbstractDeclaratorContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_directAbstractDeclarator);
						setState(1083);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1084);
						match(LeftParen);
						setState(1086);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Noreturn - 65)) | (1L << (ThreadLocal - 65)) | (1L << (Identifier - 65)))) != 0)) {
							{
							setState(1085);
							parameterTypeList();
							}
						}

						setState(1088);
						match(RightParen);
						setState(1092);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(1089);
								gccDeclaratorExtension();
								}
								} 
							}
							setState(1094);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
						}
						}
						break;
					}
					} 
				}
				setState(1099);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,112,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypedefNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public TypedefNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedefName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterTypedefName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitTypedefName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitTypedefName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedefNameContext typedefName() throws RecognitionException {
		TypedefNameContext _localctx = new TypedefNameContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_typedefName);
		try {
			setState(1103);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1100);
				match(Identifier);
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(1101);
				match(T__14);
				setState(1102);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Invalid data type" );
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TripleJParser.LeftBrace, 0); }
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode RightBrace() { return getToken(TripleJParser.RightBrace, 0); }
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_initializer);
		try {
			setState(1115);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1105);
				assignmentExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1106);
				match(LeftBrace);
				setState(1107);
				initializerList(0);
				setState(1108);
				match(RightBrace);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1110);
				match(LeftBrace);
				setState(1111);
				initializerList(0);
				setState(1112);
				match(Comma);
				setState(1113);
				match(RightBrace);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerListContext extends ParserRuleContext {
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public DesignationContext designation() {
			return getRuleContext(DesignationContext.class,0);
		}
		public InitializerListContext initializerList() {
			return getRuleContext(InitializerListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public InitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitInitializerList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitInitializerList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitializerListContext initializerList() throws RecognitionException {
		return initializerList(0);
	}

	private InitializerListContext initializerList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		InitializerListContext _localctx = new InitializerListContext(_ctx, _parentState);
		InitializerListContext _prevctx = _localctx;
		int _startState = 132;
		enterRecursionRule(_localctx, 132, RULE_initializerList, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LeftBracket || _la==Dot) {
				{
				setState(1118);
				designation();
				}
			}

			setState(1121);
			initializer();
			}
			_ctx.stop = _input.LT(-1);
			setState(1131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new InitializerListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_initializerList);
					setState(1123);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1124);
					match(Comma);
					setState(1126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LeftBracket || _la==Dot) {
						{
						setState(1125);
						designation();
						}
					}

					setState(1128);
					initializer();
					}
					} 
				}
				setState(1133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignationContext extends ParserRuleContext {
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public TerminalNode Assign() { return getToken(TripleJParser.Assign, 0); }
		public DesignationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDesignation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDesignation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDesignation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignationContext designation() throws RecognitionException {
		DesignationContext _localctx = new DesignationContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_designation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			designatorList(0);
			setState(1135);
			match(Assign);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesignatorListContext extends ParserRuleContext {
		public DesignatorContext designator() {
			return getRuleContext(DesignatorContext.class,0);
		}
		public DesignatorListContext designatorList() {
			return getRuleContext(DesignatorListContext.class,0);
		}
		public DesignatorListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designatorList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDesignatorList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDesignatorList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDesignatorList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorListContext designatorList() throws RecognitionException {
		return designatorList(0);
	}

	private DesignatorListContext designatorList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DesignatorListContext _localctx = new DesignatorListContext(_ctx, _parentState);
		DesignatorListContext _prevctx = _localctx;
		int _startState = 136;
		enterRecursionRule(_localctx, 136, RULE_designatorList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1138);
			designator();
			}
			_ctx.stop = _input.LT(-1);
			setState(1144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DesignatorListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_designatorList);
					setState(1140);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1141);
					designator();
					}
					} 
				}
				setState(1146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,118,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DesignatorContext extends ParserRuleContext {
		public TerminalNode LeftBracket() { return getToken(TripleJParser.LeftBracket, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode RightBracket() { return getToken(TripleJParser.RightBracket, 0); }
		public TerminalNode Dot() { return getToken(TripleJParser.Dot, 0); }
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public DesignatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_designator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDesignator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDesignator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDesignator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DesignatorContext designator() throws RecognitionException {
		DesignatorContext _localctx = new DesignatorContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_designator);
		try {
			setState(1153);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LeftBracket:
				enterOuterAlt(_localctx, 1);
				{
				setState(1147);
				match(LeftBracket);
				setState(1148);
				constantExpression();
				setState(1149);
				match(RightBracket);
				}
				break;
			case Dot:
				enterOuterAlt(_localctx, 2);
				{
				setState(1151);
				match(Dot);
				setState(1152);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StaticAssertDeclarationContext extends ParserRuleContext {
		public TerminalNode StaticAssert() { return getToken(TripleJParser.StaticAssert, 0); }
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(TripleJParser.Semi, 0); }
		public List<TerminalNode> StringLiteral() { return getTokens(TripleJParser.StringLiteral); }
		public TerminalNode StringLiteral(int i) {
			return getToken(TripleJParser.StringLiteral, i);
		}
		public StaticAssertDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_staticAssertDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterStaticAssertDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitStaticAssertDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitStaticAssertDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StaticAssertDeclarationContext staticAssertDeclaration() throws RecognitionException {
		StaticAssertDeclarationContext _localctx = new StaticAssertDeclarationContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_staticAssertDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(StaticAssert);
			setState(1156);
			match(LeftParen);
			setState(1157);
			constantExpression();
			setState(1158);
			match(Comma);
			setState(1160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1159);
				match(StringLiteral);
				}
				}
				setState(1162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==StringLiteral );
			setState(1164);
			match(RightParen);
			setState(1165);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public SelectionStatementContext selectionStatement() {
			return getRuleContext(SelectionStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public JumpStatementContext jumpStatement() {
			return getRuleContext(JumpStatementContext.class,0);
		}
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(TripleJParser.Semi, 0); }
		public TerminalNode Volatile() { return getToken(TripleJParser.Volatile, 0); }
		public List<LogicalOrExpressionContext> logicalOrExpression() {
			return getRuleContexts(LogicalOrExpressionContext.class);
		}
		public LogicalOrExpressionContext logicalOrExpression(int i) {
			return getRuleContext(LogicalOrExpressionContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(TripleJParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TripleJParser.Colon, i);
		}
		public List<TerminalNode> Comma() { return getTokens(TripleJParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(TripleJParser.Comma, i);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_statement);
		int _la;
		try {
			setState(1205);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1167);
				labeledStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1168);
				compoundStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1169);
				expressionStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1170);
				selectionStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1171);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1172);
				jumpStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1173);
				printStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1174);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1175);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==Volatile) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1176);
				match(LeftParen);
				setState(1185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (AndAnd - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(1177);
					logicalOrExpression(0);
					setState(1182);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Comma) {
						{
						{
						setState(1178);
						match(Comma);
						setState(1179);
						logicalOrExpression(0);
						}
						}
						setState(1184);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1200);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Colon) {
					{
					{
					setState(1187);
					match(Colon);
					setState(1196);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (AndAnd - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
						{
						setState(1188);
						logicalOrExpression(0);
						setState(1193);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==Comma) {
							{
							{
							setState(1189);
							match(Comma);
							setState(1190);
							logicalOrExpression(0);
							}
							}
							setState(1195);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					}
					setState(1202);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1203);
				match(RightParen);
				setState(1204);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public TerminalNode StringLiteral() { return getToken(TripleJParser.StringLiteral, 0); }
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(TripleJParser.Semi, 0); }
		public TerminalNode Plus() { return getToken(TripleJParser.Plus, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(TripleJParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(TripleJParser.Colon, i);
		}
		public List<UnaryOperatorContext> unaryOperator() {
			return getRuleContexts(UnaryOperatorContext.class);
		}
		public UnaryOperatorContext unaryOperator(int i) {
			return getRuleContext(UnaryOperatorContext.class,i);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_printStatement);
		int _la;
		try {
			int _alt;
			setState(1250);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1207);
				match(T__17);
				setState(1208);
				match(LeftParen);
				setState(1209);
				match(StringLiteral);
				setState(1210);
				match(RightParen);
				setState(1211);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1212);
				match(T__17);
				setState(1213);
				match(LeftParen);
				setState(1214);
				match(StringLiteral);
				setState(1215);
				match(Plus);
				setState(1216);
				additiveExpression(0);
				setState(1217);
				match(RightParen);
				setState(1218);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1220);
				match(T__17);
				setState(1221);
				match(LeftParen);
				setState(1222);
				primaryExpression();
				setState(1223);
				match(RightParen);
				setState(1224);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1226);
				match(T__17);
				setState(1227);
				match(LeftParen);
				setState(1242); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1229); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(1228);
							primaryExpression();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1231); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,127,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					setState(1234);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Colon) {
						{
						setState(1233);
						match(Colon);
						}
					}

					setState(1237);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
					case 1:
						{
						setState(1236);
						primaryExpression();
						}
						break;
					}
					setState(1240);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (Plus - 80)) | (1L << (Minus - 80)) | (1L << (Star - 80)) | (1L << (And - 80)) | (1L << (Not - 80)) | (1L << (Tilde - 80)))) != 0)) {
						{
						setState(1239);
						unaryOperator();
						}
					}

					}
					}
					setState(1244); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (StringLiteral - 68)))) != 0) );
				setState(1246);
				match(RightParen);
				setState(1247);
				match(Semi);
				setState(1248);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Missing double quotation marks" );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public TerminalNode Colon() { return getToken(TripleJParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode Case() { return getToken(TripleJParser.Case, 0); }
		public ConstantExpressionContext constantExpression() {
			return getRuleContext(ConstantExpressionContext.class,0);
		}
		public TerminalNode Default() { return getToken(TripleJParser.Default, 0); }
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitLabeledStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitLabeledStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_labeledStatement);
		try {
			setState(1263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1252);
				match(Identifier);
				setState(1253);
				match(Colon);
				setState(1254);
				statement();
				}
				break;
			case Case:
				enterOuterAlt(_localctx, 2);
				{
				setState(1255);
				match(Case);
				setState(1256);
				constantExpression();
				setState(1257);
				match(Colon);
				setState(1258);
				statement();
				}
				break;
			case Default:
				enterOuterAlt(_localctx, 3);
				{
				setState(1260);
				match(Default);
				setState(1261);
				match(Colon);
				setState(1262);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompoundStatementContext extends ParserRuleContext {
		public TerminalNode LeftBrace() { return getToken(TripleJParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TripleJParser.RightBrace, 0); }
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public CompoundStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compoundStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterCompoundStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitCompoundStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitCompoundStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompoundStatementContext compoundStatement() throws RecognitionException {
		CompoundStatementContext _localctx = new CompoundStatementContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_compoundStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1265);
			match(LeftBrace);
			setState(1267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << Auto) | (1L << Break) | (1L << Case) | (1L << Char) | (1L << Const) | (1L << Continue) | (1L << Default) | (1L << Do) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << For) | (1L << Goto) | (1L << If) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Return) | (1L << Short) | (1L << Signed) | (1L << Sizeof) | (1L << Static) | (1L << Struct) | (1L << Switch) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << While) | (1L << Alignas) | (1L << Alignof) | (1L << Atomic) | (1L << Bool) | (1L << Complex) | (1L << Generic))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Noreturn - 65)) | (1L << (StaticAssert - 65)) | (1L << (ThreadLocal - 65)) | (1L << (LeftParen - 65)) | (1L << (LeftBrace - 65)) | (1L << (Plus - 65)) | (1L << (PlusPlus - 65)) | (1L << (Minus - 65)) | (1L << (MinusMinus - 65)) | (1L << (Star - 65)) | (1L << (And - 65)) | (1L << (AndAnd - 65)) | (1L << (Not - 65)) | (1L << (Tilde - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)) | (1L << (Constant - 65)) | (1L << (DigitSequence - 65)) | (1L << (StringLiteral - 65)))) != 0)) {
				{
				setState(1266);
				blockItemList(0);
				}
			}

			setState(1269);
			match(RightBrace);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockItemListContext extends ParserRuleContext {
		public BlockItemContext blockItem() {
			return getRuleContext(BlockItemContext.class,0);
		}
		public BlockItemListContext blockItemList() {
			return getRuleContext(BlockItemListContext.class,0);
		}
		public BlockItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterBlockItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitBlockItemList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitBlockItemList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemListContext blockItemList() throws RecognitionException {
		return blockItemList(0);
	}

	private BlockItemListContext blockItemList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BlockItemListContext _localctx = new BlockItemListContext(_ctx, _parentState);
		BlockItemListContext _prevctx = _localctx;
		int _startState = 150;
		enterRecursionRule(_localctx, 150, RULE_blockItemList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1272);
			blockItem();
			}
			_ctx.stop = _input.LT(-1);
			setState(1278);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BlockItemListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_blockItemList);
					setState(1274);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1275);
					blockItem();
					}
					} 
				}
				setState(1280);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class BlockItemContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_blockItem);
		try {
			setState(1283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				declaration();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionStatementContext extends ParserRuleContext {
		public TerminalNode Semi() { return getToken(TripleJParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterExpressionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitExpressionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitExpressionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_expressionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (AndAnd - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
				{
				setState(1285);
				expression(0);
				}
			}

			setState(1288);
			match(Semi);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectionStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(TripleJParser.If, 0); }
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public EqualityExpressionContext equalityExpression() {
			return getRuleContext(EqualityExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public TerminalNode LeftBrace() { return getToken(TripleJParser.LeftBrace, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode RightBrace() { return getToken(TripleJParser.RightBrace, 0); }
		public TerminalNode Else() { return getToken(TripleJParser.Else, 0); }
		public TerminalNode Switch() { return getToken(TripleJParser.Switch, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterSelectionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitSelectionStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitSelectionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectionStatementContext selectionStatement() throws RecognitionException {
		SelectionStatementContext _localctx = new SelectionStatementContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_selectionStatement);
		try {
			setState(1313);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(1290);
				match(If);
				setState(1291);
				match(LeftParen);
				setState(1292);
				equalityExpression(0);
				setState(1293);
				match(RightParen);
				setState(1294);
				match(T__18);
				setState(1295);
				match(LeftBrace);
				setState(1296);
				statement();
				setState(1297);
				match(RightBrace);
				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1298);
					match(Else);
					setState(1299);
					statement();
					}
					break;
				}
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 2);
				{
				setState(1302);
				match(T__18);
				setState(1303);
				match(LeftBrace);
				setState(1304);
				statement();
				setState(1305);
				match(RightBrace);
				}
				break;
			case Switch:
				enterOuterAlt(_localctx, 3);
				{
				setState(1307);
				match(Switch);
				setState(1308);
				match(LeftParen);
				setState(1309);
				expression(0);
				setState(1310);
				match(RightParen);
				setState(1311);
				statement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(TripleJParser.While, 0); }
		public WhileExpressionContext whileExpression() {
			return getRuleContext(WhileExpressionContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public TerminalNode Do() { return getToken(TripleJParser.Do, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LeftParen() { return getToken(TripleJParser.LeftParen, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RightParen() { return getToken(TripleJParser.RightParen, 0); }
		public TerminalNode Semi() { return getToken(TripleJParser.Semi, 0); }
		public TerminalNode For() { return getToken(TripleJParser.For, 0); }
		public ForConditionContext forCondition() {
			return getRuleContext(ForConditionContext.class,0);
		}
		public TerminalNode LeftBrace() { return getToken(TripleJParser.LeftBrace, 0); }
		public TerminalNode RightBrace() { return getToken(TripleJParser.RightBrace, 0); }
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterIterationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitIterationStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitIterationStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_iterationStatement);
		try {
			setState(1334);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(1315);
				match(While);
				setState(1316);
				whileExpression();
				setState(1318);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,140,_ctx) ) {
				case 1:
					{
					setState(1317);
					compoundStatement();
					}
					break;
				}
				}
				break;
			case Do:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(Do);
				setState(1321);
				statement();
				setState(1322);
				match(While);
				setState(1323);
				match(LeftParen);
				setState(1324);
				expression(0);
				setState(1325);
				match(RightParen);
				setState(1326);
				match(Semi);
				}
				break;
			case For:
				enterOuterAlt(_localctx, 3);
				{
				setState(1328);
				match(For);
				setState(1329);
				forCondition();
				setState(1330);
				match(LeftBrace);
				setState(1331);
				statement();
				setState(1332);
				match(RightBrace);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileExpressionContext extends ParserRuleContext {
		public TypedefNameContext typedefName() {
			return getRuleContext(TypedefNameContext.class,0);
		}
		public TerminalNode Upto() { return getToken(TripleJParser.Upto, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public TerminalNode Downto() { return getToken(TripleJParser.Downto, 0); }
		public WhileExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterWhileExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitWhileExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitWhileExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileExpressionContext whileExpression() throws RecognitionException {
		WhileExpressionContext _localctx = new WhileExpressionContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_whileExpression);
		try {
			setState(1365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1336);
				typedefName();
				setState(1337);
				match(Upto);
				setState(1338);
				primaryExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1340);
				typedefName();
				setState(1341);
				match(Upto);
				setState(1342);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Missing expression");
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1344);
				typedefName();
				setState(1345);
				match(T__19);
				setState(1346);
				primaryExpression();
				setState(1347);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Should be down to or up down");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1349);
				typedefName();
				setState(1350);
				match(Upto);
				setState(1351);
				additiveExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1353);
				typedefName();
				setState(1354);
				match(Downto);
				setState(1355);
				primaryExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1357);
				typedefName();
				setState(1358);
				match(Downto);
				setState(1359);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Missing expression");
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1361);
				typedefName();
				setState(1362);
				match(Downto);
				setState(1363);
				additiveExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForConditionContext extends ParserRuleContext {
		public ForDeclarationContext forDeclaration() {
			return getRuleContext(ForDeclarationContext.class,0);
		}
		public TerminalNode Upto() { return getToken(TripleJParser.Upto, 0); }
		public AdditiveExpressionContext additiveExpression() {
			return getRuleContext(AdditiveExpressionContext.class,0);
		}
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode Downto() { return getToken(TripleJParser.Downto, 0); }
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterForCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitForCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitForCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForConditionContext forCondition() throws RecognitionException {
		ForConditionContext _localctx = new ForConditionContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_forCondition);
		try {
			setState(1420);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1367);
				forDeclaration();
				setState(1368);
				match(Upto);
				setState(1369);
				additiveExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1371);
				forDeclaration();
				setState(1372);
				match(Upto);
				setState(1373);
				primaryExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1375);
				forDeclaration();
				setState(1376);
				match(Upto);
				setState(1377);
				primaryExpression();
				setState(1378);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Should be down to or up down");
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1380);
				forDeclaration();
				setState(1381);
				match(Upto);
				setState(1382);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Missing expression");
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1384);
				forDeclaration();
				setState(1385);
				match(Downto);
				setState(1386);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Missing expression");
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1388);
				forDeclaration();
				setState(1389);
				match(Downto);
				setState(1390);
				primaryExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1392);
				forDeclaration();
				setState(1393);
				match(Downto);
				setState(1394);
				additiveExpression(0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1396);
				assignmentExpression();
				setState(1397);
				match(Upto);
				setState(1398);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Missing expression");
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1400);
				assignmentExpression();
				setState(1401);
				match(Downto);
				setState(1402);
				if (!( false )) throw new FailedPredicateException(this, " false ",  "Missing expression");
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1404);
				assignmentExpression();
				setState(1405);
				match(Upto);
				setState(1406);
				primaryExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1408);
				assignmentExpression();
				setState(1409);
				match(Upto);
				setState(1410);
				additiveExpression(0);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1412);
				assignmentExpression();
				setState(1413);
				match(Downto);
				setState(1414);
				primaryExpression();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1416);
				assignmentExpression();
				setState(1417);
				match(Downto);
				setState(1418);
				additiveExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForDeclarationContext extends ParserRuleContext {
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public InitDeclaratorListContext initDeclaratorList() {
			return getRuleContext(InitDeclaratorListContext.class,0);
		}
		public ForDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterForDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitForDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitForDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDeclarationContext forDeclaration() throws RecognitionException {
		ForDeclarationContext _localctx = new ForDeclarationContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_forDeclaration);
		try {
			setState(1426);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1422);
				declarationSpecifiers();
				setState(1423);
				initDeclaratorList(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1425);
				declarationSpecifiers();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForExpressionContext extends ParserRuleContext {
		public AssignmentExpressionContext assignmentExpression() {
			return getRuleContext(AssignmentExpressionContext.class,0);
		}
		public ForExpressionContext forExpression() {
			return getRuleContext(ForExpressionContext.class,0);
		}
		public TerminalNode Comma() { return getToken(TripleJParser.Comma, 0); }
		public ForExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterForExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitForExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitForExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForExpressionContext forExpression() throws RecognitionException {
		return forExpression(0);
	}

	private ForExpressionContext forExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ForExpressionContext _localctx = new ForExpressionContext(_ctx, _parentState);
		ForExpressionContext _prevctx = _localctx;
		int _startState = 166;
		enterRecursionRule(_localctx, 166, RULE_forExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1429);
			assignmentExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(1436);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ForExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_forExpression);
					setState(1431);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1432);
					match(Comma);
					setState(1433);
					assignmentExpression();
					}
					} 
				}
				setState(1438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,145,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JumpStatementContext extends ParserRuleContext {
		public TerminalNode Goto() { return getToken(TripleJParser.Goto, 0); }
		public TerminalNode Identifier() { return getToken(TripleJParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(TripleJParser.Semi, 0); }
		public TerminalNode Continue() { return getToken(TripleJParser.Continue, 0); }
		public TerminalNode Break() { return getToken(TripleJParser.Break, 0); }
		public TerminalNode Return() { return getToken(TripleJParser.Return, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaryExpressionContext unaryExpression() {
			return getRuleContext(UnaryExpressionContext.class,0);
		}
		public JumpStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jumpStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterJumpStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitJumpStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitJumpStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JumpStatementContext jumpStatement() throws RecognitionException {
		JumpStatementContext _localctx = new JumpStatementContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_jumpStatement);
		int _la;
		try {
			setState(1455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1439);
				match(Goto);
				setState(1440);
				match(Identifier);
				setState(1441);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				match(Continue);
				setState(1443);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1444);
				match(Break);
				setState(1445);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1446);
				match(Return);
				setState(1448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << Sizeof) | (1L << Alignof) | (1L << Generic))) != 0) || ((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & ((1L << (LeftParen - 68)) | (1L << (Plus - 68)) | (1L << (PlusPlus - 68)) | (1L << (Minus - 68)) | (1L << (MinusMinus - 68)) | (1L << (Star - 68)) | (1L << (And - 68)) | (1L << (AndAnd - 68)) | (1L << (Not - 68)) | (1L << (Tilde - 68)) | (1L << (Identifier - 68)) | (1L << (Constant - 68)) | (1L << (DigitSequence - 68)) | (1L << (StringLiteral - 68)))) != 0)) {
					{
					setState(1447);
					expression(0);
					}
				}

				setState(1450);
				match(Semi);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1451);
				match(Goto);
				setState(1452);
				unaryExpression();
				setState(1453);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TripleJParser.EOF, 0); }
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__20) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Noreturn - 65)) | (1L << (StaticAssert - 65)) | (1L << (ThreadLocal - 65)) | (1L << (LeftParen - 65)) | (1L << (Star - 65)) | (1L << (Caret - 65)) | (1L << (Semi - 65)) | (1L << (Identifier - 65)))) != 0)) {
				{
				setState(1457);
				translationUnit(0);
				}
			}

			setState(1460);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TranslationUnitContext extends ParserRuleContext {
		public ExternalDeclarationContext externalDeclaration() {
			return getRuleContext(ExternalDeclarationContext.class,0);
		}
		public TranslationUnitContext translationUnit() {
			return getRuleContext(TranslationUnitContext.class,0);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitTranslationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitTranslationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		return translationUnit(0);
	}

	private TranslationUnitContext translationUnit(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, _parentState);
		TranslationUnitContext _prevctx = _localctx;
		int _startState = 172;
		enterRecursionRule(_localctx, 172, RULE_translationUnit, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1463);
			externalDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1469);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TranslationUnitContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_translationUnit);
					setState(1465);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1466);
					externalDeclaration();
					}
					} 
				}
				setState(1471);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,149,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ExternalDeclarationContext extends ParserRuleContext {
		public FunctionDefinitionContext functionDefinition() {
			return getRuleContext(FunctionDefinitionContext.class,0);
		}
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode Semi() { return getToken(TripleJParser.Semi, 0); }
		public ExternalDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterExternalDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitExternalDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitExternalDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalDeclarationContext externalDeclaration() throws RecognitionException {
		ExternalDeclarationContext _localctx = new ExternalDeclarationContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_externalDeclaration);
		try {
			setState(1475);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1472);
				functionDefinition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1473);
				declaration();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1474);
				match(Semi);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefinitionContext extends ParserRuleContext {
		public DeclaratorContext declarator() {
			return getRuleContext(DeclaratorContext.class,0);
		}
		public CompoundStatementContext compoundStatement() {
			return getRuleContext(CompoundStatementContext.class,0);
		}
		public DeclarationSpecifiersContext declarationSpecifiers() {
			return getRuleContext(DeclarationSpecifiersContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public FunctionDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterFunctionDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitFunctionDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitFunctionDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefinitionContext functionDefinition() throws RecognitionException {
		FunctionDefinitionContext _localctx = new FunctionDefinitionContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_functionDefinition);
		int _la;
		try {
			setState(1496);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(1477);
				match(T__20);
				setState(1479);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,151,_ctx) ) {
				case 1:
					{
					setState(1478);
					declarationSpecifiers();
					}
					break;
				}
				setState(1481);
				declarator();
				setState(1483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Noreturn - 65)) | (1L << (StaticAssert - 65)) | (1L << (ThreadLocal - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1482);
					declarationList(0);
					}
				}

				setState(1485);
				compoundStatement();
				}
				break;
			case T__0:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__13:
			case T__14:
			case Auto:
			case Char:
			case Const:
			case Double:
			case Enum:
			case Extern:
			case Float:
			case Inline:
			case Int:
			case Long:
			case Register:
			case Restrict:
			case Short:
			case Signed:
			case Static:
			case Struct:
			case Typedef:
			case Union:
			case Unsigned:
			case Void:
			case Volatile:
			case Alignas:
			case Atomic:
			case Bool:
			case Complex:
			case Noreturn:
			case ThreadLocal:
			case LeftParen:
			case Star:
			case Caret:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(1488);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
				case 1:
					{
					setState(1487);
					declarationSpecifiers();
					}
					break;
				}
				setState(1490);
				declarator();
				setState(1492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << Auto) | (1L << Char) | (1L << Const) | (1L << Double) | (1L << Enum) | (1L << Extern) | (1L << Float) | (1L << Inline) | (1L << Int) | (1L << Long) | (1L << Register) | (1L << Restrict) | (1L << Short) | (1L << Signed) | (1L << Static) | (1L << Struct) | (1L << Typedef) | (1L << Union) | (1L << Unsigned) | (1L << Void) | (1L << Volatile) | (1L << Alignas) | (1L << Atomic) | (1L << Bool) | (1L << Complex))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (Noreturn - 65)) | (1L << (StaticAssert - 65)) | (1L << (ThreadLocal - 65)) | (1L << (Identifier - 65)))) != 0)) {
					{
					setState(1491);
					declarationList(0);
					}
				}

				setState(1494);
				compoundStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationListContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public DeclarationListContext declarationList() {
			return getRuleContext(DeclarationListContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public DeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).enterDeclarationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripleJListener ) ((TripleJListener)listener).exitDeclarationList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripleJVisitor ) return ((TripleJVisitor<? extends T>)visitor).visitDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationListContext declarationList() throws RecognitionException {
		return declarationList(0);
	}

	private DeclarationListContext declarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DeclarationListContext _localctx = new DeclarationListContext(_ctx, _parentState);
		DeclarationListContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_declarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1499);
			declaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(1508);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_declarationList);
					setState(1501);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(1502);
					declaration();
					setState(1504);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,156,_ctx) ) {
					case 1:
						{
						setState(1503);
						statement();
						}
						break;
					}
					}
					} 
				}
				setState(1510);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,157,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return genericAssocList_sempred((GenericAssocListContext)_localctx, predIndex);
		case 5:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 6:
			return argumentExpressionList_sempred((ArgumentExpressionListContext)_localctx, predIndex);
		case 10:
			return multiplicativeExpression_sempred((MultiplicativeExpressionContext)_localctx, predIndex);
		case 11:
			return additiveExpression_sempred((AdditiveExpressionContext)_localctx, predIndex);
		case 12:
			return shiftExpression_sempred((ShiftExpressionContext)_localctx, predIndex);
		case 13:
			return relationalExpression_sempred((RelationalExpressionContext)_localctx, predIndex);
		case 14:
			return equalityExpression_sempred((EqualityExpressionContext)_localctx, predIndex);
		case 15:
			return andExpression_sempred((AndExpressionContext)_localctx, predIndex);
		case 16:
			return exclusiveOrExpression_sempred((ExclusiveOrExpressionContext)_localctx, predIndex);
		case 17:
			return inclusiveOrExpression_sempred((InclusiveOrExpressionContext)_localctx, predIndex);
		case 18:
			return logicalAndExpression_sempred((LogicalAndExpressionContext)_localctx, predIndex);
		case 19:
			return logicalOrExpression_sempred((LogicalOrExpressionContext)_localctx, predIndex);
		case 21:
			return assignmentExpression_sempred((AssignmentExpressionContext)_localctx, predIndex);
		case 23:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 29:
			return initDeclaratorList_sempred((InitDeclaratorListContext)_localctx, predIndex);
		case 32:
			return typeSpecifier_sempred((TypeSpecifierContext)_localctx, predIndex);
		case 35:
			return structDeclarationList_sempred((StructDeclarationListContext)_localctx, predIndex);
		case 38:
			return structDeclaratorList_sempred((StructDeclaratorListContext)_localctx, predIndex);
		case 41:
			return enumeratorList_sempred((EnumeratorListContext)_localctx, predIndex);
		case 49:
			return directDeclarator_sempred((DirectDeclaratorContext)_localctx, predIndex);
		case 56:
			return typeQualifierList_sempred((TypeQualifierListContext)_localctx, predIndex);
		case 58:
			return parameterList_sempred((ParameterListContext)_localctx, predIndex);
		case 60:
			return identifierList_sempred((IdentifierListContext)_localctx, predIndex);
		case 63:
			return directAbstractDeclarator_sempred((DirectAbstractDeclaratorContext)_localctx, predIndex);
		case 64:
			return typedefName_sempred((TypedefNameContext)_localctx, predIndex);
		case 66:
			return initializerList_sempred((InitializerListContext)_localctx, predIndex);
		case 68:
			return designatorList_sempred((DesignatorListContext)_localctx, predIndex);
		case 72:
			return printStatement_sempred((PrintStatementContext)_localctx, predIndex);
		case 75:
			return blockItemList_sempred((BlockItemListContext)_localctx, predIndex);
		case 80:
			return whileExpression_sempred((WhileExpressionContext)_localctx, predIndex);
		case 81:
			return forCondition_sempred((ForConditionContext)_localctx, predIndex);
		case 83:
			return forExpression_sempred((ForExpressionContext)_localctx, predIndex);
		case 86:
			return translationUnit_sempred((TranslationUnitContext)_localctx, predIndex);
		case 89:
			return declarationList_sempred((DeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean genericAssocList_sempred(GenericAssocListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return  false ;
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean argumentExpressionList_sempred(ArgumentExpressionListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return  false ;
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean multiplicativeExpression_sempred(MultiplicativeExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 4);
		case 12:
			return precpred(_ctx, 3);
		case 13:
			return  false ;
		case 14:
			return precpred(_ctx, 2);
		case 15:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean additiveExpression_sempred(AdditiveExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return precpred(_ctx, 3);
		case 17:
			return precpred(_ctx, 2);
		case 18:
			return  false ;
		case 19:
			return precpred(_ctx, 5);
		case 20:
			return precpred(_ctx, 4);
		case 21:
			return precpred(_ctx, 1);
		case 22:
			return  false ;
		}
		return true;
	}
	private boolean shiftExpression_sempred(ShiftExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 2);
		case 24:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relationalExpression_sempred(RelationalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 25:
			return precpred(_ctx, 4);
		case 26:
			return precpred(_ctx, 3);
		case 27:
			return precpred(_ctx, 2);
		case 28:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean equalityExpression_sempred(EqualityExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 29:
			return precpred(_ctx, 1);
		case 30:
			return  false ;
		case 31:
			return precpred(_ctx, 3);
		case 32:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean andExpression_sempred(AndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 33:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean exclusiveOrExpression_sempred(ExclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 34:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean inclusiveOrExpression_sempred(InclusiveOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 35:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalAndExpression_sempred(LogicalAndExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 36:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean logicalOrExpression_sempred(LogicalOrExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 37:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean assignmentExpression_sempred(AssignmentExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 38:
			return  false ;
		case 39:
			return  false ;
		case 40:
			return  false ;
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 41:
			return precpred(_ctx, 2);
		case 42:
			return precpred(_ctx, 1);
		case 43:
			return  false ;
		}
		return true;
	}
	private boolean initDeclaratorList_sempred(InitDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 44:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typeSpecifier_sempred(TypeSpecifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 45:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclarationList_sempred(StructDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 46:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean structDeclaratorList_sempred(StructDeclaratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 47:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean enumeratorList_sempred(EnumeratorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 48:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directDeclarator_sempred(DirectDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 49:
			return precpred(_ctx, 8);
		case 50:
			return precpred(_ctx, 7);
		case 51:
			return precpred(_ctx, 6);
		case 52:
			return precpred(_ctx, 5);
		case 53:
			return precpred(_ctx, 4);
		case 54:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean typeQualifierList_sempred(TypeQualifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 55:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean parameterList_sempred(ParameterListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 56:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean identifierList_sempred(IdentifierListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 57:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean directAbstractDeclarator_sempred(DirectAbstractDeclaratorContext _localctx, int predIndex) {
		switch (predIndex) {
		case 58:
			return precpred(_ctx, 5);
		case 59:
			return precpred(_ctx, 4);
		case 60:
			return precpred(_ctx, 3);
		case 61:
			return precpred(_ctx, 2);
		case 62:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean typedefName_sempred(TypedefNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 63:
			return  false ;
		}
		return true;
	}
	private boolean initializerList_sempred(InitializerListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 64:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean designatorList_sempred(DesignatorListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 65:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean printStatement_sempred(PrintStatementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 66:
			return  false ;
		}
		return true;
	}
	private boolean blockItemList_sempred(BlockItemListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 67:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean whileExpression_sempred(WhileExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 68:
			return  false ;
		case 69:
			return  false ;
		case 70:
			return  false ;
		}
		return true;
	}
	private boolean forCondition_sempred(ForConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 71:
			return  false ;
		case 72:
			return  false ;
		case 73:
			return  false ;
		case 74:
			return  false ;
		case 75:
			return  false ;
		}
		return true;
	}
	private boolean forExpression_sempred(ForExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 76:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean translationUnit_sempred(TranslationUnitContext _localctx, int predIndex) {
		switch (predIndex) {
		case 77:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean declarationList_sempred(DeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 78:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0081\u05ea\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\2\3\2\5\2\u00bb\n"+
		"\2\3\2\5\2\u00be\n\2\3\2\5\2\u00c1\n\2\5\2\u00c3\n\2\3\3\3\3\3\3\6\3\u00c8"+
		"\n\3\r\3\16\3\u00c9\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00d2\n\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\u00e6"+
		"\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5\u00f5\n\5"+
		"\f\5\16\5\u00f8\13\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0101\n\6\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0125\n"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u012f\n\7\3\7\3\7\3\7\3\7\5\7\u0135"+
		"\n\7\3\7\3\7\6\7\u0139\n\7\r\7\16\7\u013a\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\7\7\u0149\n\7\f\7\16\7\u014c\13\7\3\b\3\b\3\b\3\b"+
		"\3\b\5\b\u0153\n\b\3\b\3\b\3\b\7\b\u0158\n\b\f\b\16\b\u015b\13\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\5\t\u0173\n\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0184\n\13\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0197\n\f\f\f\16\f\u019a"+
		"\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\7\r\u01b0\n\r\f\r\16\r\u01b3\13\r\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\7\16\u01be\n\16\f\16\16\16\u01c1\13\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u01d2\n\17\f\17\16\17\u01d5\13\17\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u01e5\n\20\f\20\16\20\u01e8"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u01f0\n\21\f\21\16\21\u01f3"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u01fb\n\22\f\22\16\22\u01fe"+
		"\13\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u0206\n\23\f\23\16\23\u0209"+
		"\13\23\3\24\3\24\3\24\3\24\3\24\3\24\7\24\u0211\n\24\f\24\16\24\u0214"+
		"\13\24\3\25\3\25\3\25\3\25\3\25\3\25\7\25\u021c\n\25\f\25\16\25\u021f"+
		"\13\25\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u0227\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\5\27\u023d\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\7\31\u024c\n\31\f\31\16\31\u024f\13\31\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u025b\n\33\3\34\6\34"+
		"\u025e\n\34\r\34\16\34\u025f\3\35\6\35\u0263\n\35\r\35\16\35\u0264\3\36"+
		"\3\36\3\36\3\36\3\36\5\36\u026c\n\36\3\37\3\37\3\37\3\37\3\37\3\37\7\37"+
		"\u0274\n\37\f\37\16\37\u0277\13\37\3 \3 \3 \3 \3 \5 \u027e\n \3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0291\n"+
		"\"\3\"\3\"\7\"\u0295\n\"\f\"\16\"\u0298\13\"\3#\3#\5#\u029c\n#\3#\3#\3"+
		"#\3#\3#\3#\3#\5#\u02a5\n#\3$\3$\3%\3%\3%\3%\3%\7%\u02ae\n%\f%\16%\u02b1"+
		"\13%\3&\3&\5&\u02b5\n&\3&\3&\3&\5&\u02ba\n&\3\'\3\'\5\'\u02be\n\'\3\'"+
		"\3\'\5\'\u02c2\n\'\5\'\u02c4\n\'\3(\3(\3(\3(\3(\3(\7(\u02cc\n(\f(\16("+
		"\u02cf\13(\3)\3)\5)\u02d3\n)\3)\3)\5)\u02d7\n)\3*\3*\5*\u02db\n*\3*\3"+
		"*\3*\3*\3*\3*\5*\u02e3\n*\3*\3*\3*\3*\3*\3*\3*\5*\u02ec\n*\3+\3+\3+\3"+
		"+\3+\3+\7+\u02f4\n+\f+\16+\u02f7\13+\3,\3,\3,\3,\3,\5,\u02fe\n,\3-\3-"+
		"\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u030f\n\60\3"+
		"\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u031b\n\61\3\62"+
		"\5\62\u031e\n\62\3\62\3\62\7\62\u0322\n\62\f\62\16\62\u0325\13\62\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0332\n\63\3\63"+
		"\3\63\3\63\3\63\5\63\u0338\n\63\3\63\3\63\3\63\5\63\u033d\n\63\3\63\5"+
		"\63\u0340\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u0347\n\63\3\63\3\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0356\n\63\3\63"+
		"\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63\u0362\n\63\3\63\7\63"+
		"\u0365\n\63\f\63\16\63\u0368\13\63\3\64\3\64\3\64\6\64\u036d\n\64\r\64"+
		"\16\64\u036e\3\64\3\64\5\64\u0373\n\64\3\65\3\65\3\65\3\65\3\65\3\65\3"+
		"\65\3\66\3\66\3\66\7\66\u037f\n\66\f\66\16\66\u0382\13\66\3\66\5\66\u0385"+
		"\n\66\3\67\3\67\3\67\5\67\u038a\n\67\3\67\5\67\u038d\n\67\3\67\5\67\u0390"+
		"\n\67\38\38\38\38\38\78\u0397\n8\f8\168\u039a\138\39\39\59\u039e\n9\3"+
		"9\39\59\u03a2\n9\39\39\39\59\u03a7\n9\39\39\59\u03ab\n9\39\59\u03ae\n"+
		"9\3:\3:\3:\3:\3:\7:\u03b5\n:\f:\16:\u03b8\13:\3;\3;\3;\3;\3;\5;\u03bf"+
		"\n;\3<\3<\3<\3<\3<\3<\7<\u03c7\n<\f<\16<\u03ca\13<\3=\3=\3=\3=\3=\5=\u03d1"+
		"\n=\5=\u03d3\n=\3>\3>\3>\3>\3>\3>\7>\u03db\n>\f>\16>\u03de\13>\3?\3?\5"+
		"?\u03e2\n?\3@\3@\5@\u03e6\n@\3@\3@\7@\u03ea\n@\f@\16@\u03ed\13@\5@\u03ef"+
		"\n@\3A\3A\3A\3A\3A\7A\u03f6\nA\fA\16A\u03f9\13A\3A\3A\5A\u03fd\nA\3A\5"+
		"A\u0400\nA\3A\3A\3A\3A\5A\u0406\nA\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\3A\3A\5A\u0416\nA\3A\3A\7A\u041a\nA\fA\16A\u041d\13A\5A\u041f\nA\3A"+
		"\3A\3A\5A\u0424\nA\3A\5A\u0427\nA\3A\3A\3A\3A\3A\5A\u042e\nA\3A\3A\3A"+
		"\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u0441\nA\3A\3A\7A\u0445"+
		"\nA\fA\16A\u0448\13A\7A\u044a\nA\fA\16A\u044d\13A\3B\3B\3B\5B\u0452\n"+
		"B\3C\3C\3C\3C\3C\3C\3C\3C\3C\3C\5C\u045e\nC\3D\3D\5D\u0462\nD\3D\3D\3"+
		"D\3D\3D\5D\u0469\nD\3D\7D\u046c\nD\fD\16D\u046f\13D\3E\3E\3E\3F\3F\3F"+
		"\3F\3F\7F\u0479\nF\fF\16F\u047c\13F\3G\3G\3G\3G\3G\3G\5G\u0484\nG\3H\3"+
		"H\3H\3H\3H\6H\u048b\nH\rH\16H\u048c\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3"+
		"I\3I\3I\3I\3I\7I\u049f\nI\fI\16I\u04a2\13I\5I\u04a4\nI\3I\3I\3I\3I\7I"+
		"\u04aa\nI\fI\16I\u04ad\13I\5I\u04af\nI\7I\u04b1\nI\fI\16I\u04b4\13I\3"+
		"I\3I\5I\u04b8\nI\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\3J\6J\u04d0\nJ\rJ\16J\u04d1\3J\5J\u04d5\nJ\3J\5J\u04d8\nJ\3"+
		"J\5J\u04db\nJ\6J\u04dd\nJ\rJ\16J\u04de\3J\3J\3J\3J\5J\u04e5\nJ\3K\3K\3"+
		"K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u04f2\nK\3L\3L\5L\u04f6\nL\3L\3L\3M\3M\3"+
		"M\3M\3M\7M\u04ff\nM\fM\16M\u0502\13M\3N\3N\5N\u0506\nN\3O\5O\u0509\nO"+
		"\3O\3O\3P\3P\3P\3P\3P\3P\3P\3P\3P\3P\5P\u0517\nP\3P\3P\3P\3P\3P\3P\3P"+
		"\3P\3P\3P\3P\5P\u0524\nP\3Q\3Q\3Q\5Q\u0529\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0539\nQ\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R"+
		"\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\3R\5R\u0558\nR\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S\3S"+
		"\3S\3S\3S\3S\5S\u058f\nS\3T\3T\3T\3T\5T\u0595\nT\3U\3U\3U\3U\3U\3U\7U"+
		"\u059d\nU\fU\16U\u05a0\13U\3V\3V\3V\3V\3V\3V\3V\3V\3V\5V\u05ab\nV\3V\3"+
		"V\3V\3V\3V\5V\u05b2\nV\3W\5W\u05b5\nW\3W\3W\3X\3X\3X\3X\3X\7X\u05be\n"+
		"X\fX\16X\u05c1\13X\3Y\3Y\3Y\5Y\u05c6\nY\3Z\3Z\5Z\u05ca\nZ\3Z\3Z\5Z\u05ce"+
		"\nZ\3Z\3Z\3Z\5Z\u05d3\nZ\3Z\3Z\5Z\u05d7\nZ\3Z\3Z\5Z\u05db\nZ\3[\3[\3["+
		"\3[\3[\3[\5[\u05e3\n[\7[\u05e5\n[\f[\16[\u05e8\13[\3[\2 \b\f\16\26\30"+
		"\32\34\36 \"$&(\60<BHNTdrvz\u0080\u0086\u008a\u0098\u00a8\u00ae\u00b4"+
		"\\\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD"+
		"FHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c"+
		"\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4"+
		"\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\2\16\7\2RRTTVVYY^_\3"+
		"\2dn\b\2\30\30$$,,\62\62\65\65EE\13\2\b\n\33\33  %%*+/\60\67\6799?@\3"+
		"\2\b\n\4\2\63\63\66\66\6\2\34\34--::>>\5\2\f\r))CC\4\2FGcc\3\2FG\4\2\17"+
		"\17\22\22\4\2\23\23::\2\u068a\2\u00c2\3\2\2\2\4\u00e5\3\2\2\2\6\u00e7"+
		"\3\2\2\2\b\u00ee\3\2\2\2\n\u0100\3\2\2\2\f\u0124\3\2\2\2\16\u0152\3\2"+
		"\2\2\20\u0172\3\2\2\2\22\u0174\3\2\2\2\24\u0183\3\2\2\2\26\u0185\3\2\2"+
		"\2\30\u019b\3\2\2\2\32\u01b4\3\2\2\2\34\u01c2\3\2\2\2\36\u01d6\3\2\2\2"+
		" \u01e9\3\2\2\2\"\u01f4\3\2\2\2$\u01ff\3\2\2\2&\u020a\3\2\2\2(\u0215\3"+
		"\2\2\2*\u0220\3\2\2\2,\u023c\3\2\2\2.\u023e\3\2\2\2\60\u0240\3\2\2\2\62"+
		"\u0250\3\2\2\2\64\u025a\3\2\2\2\66\u025d\3\2\2\28\u0262\3\2\2\2:\u026b"+
		"\3\2\2\2<\u026d\3\2\2\2>\u027d\3\2\2\2@\u027f\3\2\2\2B\u0290\3\2\2\2D"+
		"\u02a4\3\2\2\2F\u02a6\3\2\2\2H\u02a8\3\2\2\2J\u02b9\3\2\2\2L\u02c3\3\2"+
		"\2\2N\u02c5\3\2\2\2P\u02d6\3\2\2\2R\u02eb\3\2\2\2T\u02ed\3\2\2\2V\u02fd"+
		"\3\2\2\2X\u02ff\3\2\2\2Z\u0301\3\2\2\2\\\u0306\3\2\2\2^\u030e\3\2\2\2"+
		"`\u031a\3\2\2\2b\u031d\3\2\2\2d\u0337\3\2\2\2f\u0372\3\2\2\2h\u0374\3"+
		"\2\2\2j\u0384\3\2\2\2l\u038f\3\2\2\2n\u0398\3\2\2\2p\u03ad\3\2\2\2r\u03af"+
		"\3\2\2\2t\u03be\3\2\2\2v\u03c0\3\2\2\2x\u03d2\3\2\2\2z\u03d4\3\2\2\2|"+
		"\u03df\3\2\2\2~\u03ee\3\2\2\2\u0080\u041e\3\2\2\2\u0082\u0451\3\2\2\2"+
		"\u0084\u045d\3\2\2\2\u0086\u045f\3\2\2\2\u0088\u0470\3\2\2\2\u008a\u0473"+
		"\3\2\2\2\u008c\u0483\3\2\2\2\u008e\u0485\3\2\2\2\u0090\u04b7\3\2\2\2\u0092"+
		"\u04e4\3\2\2\2\u0094\u04f1\3\2\2\2\u0096\u04f3\3\2\2\2\u0098\u04f9\3\2"+
		"\2\2\u009a\u0505\3\2\2\2\u009c\u0508\3\2\2\2\u009e\u0523\3\2\2\2\u00a0"+
		"\u0538\3\2\2\2\u00a2\u0557\3\2\2\2\u00a4\u058e\3\2\2\2\u00a6\u0594\3\2"+
		"\2\2\u00a8\u0596\3\2\2\2\u00aa\u05b1\3\2\2\2\u00ac\u05b4\3\2\2\2\u00ae"+
		"\u05b8\3\2\2\2\u00b0\u05c5\3\2\2\2\u00b2\u05da\3\2\2\2\u00b4\u05dc\3\2"+
		"\2\2\u00b6\u00c3\5\u00b4[\2\u00b7\u00c3\5\u0090I\2\u00b8\u00ba\5\u00b2"+
		"Z\2\u00b9\u00bb\5\2\2\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00be\5\u00b4[\2\u00bd\u00bc\3\2\2\2\u00bd\u00be"+
		"\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00c1\5\u0090I\2\u00c0\u00bf\3\2\2"+
		"\2\u00c0\u00c1\3\2\2\2\u00c1\u00c3\3\2\2\2\u00c2\u00b6\3\2\2\2\u00c2\u00b7"+
		"\3\2\2\2\u00c2\u00b8\3\2\2\2\u00c3\3\3\2\2\2\u00c4\u00e6\7t\2\2\u00c5"+
		"\u00e6\7u\2\2\u00c6\u00c8\7w\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00c9\3\2\2"+
		"\2\u00c9\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00e6\3\2\2\2\u00cb\u00cc"+
		"\7F\2\2\u00cc\u00cd\5\60\31\2\u00cd\u00ce\7G\2\2\u00ce\u00e6\3\2\2\2\u00cf"+
		"\u00e6\5\6\4\2\u00d0\u00d2\7\3\2\2\u00d1\u00d0\3\2\2\2\u00d1\u00d2\3\2"+
		"\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7F\2\2\u00d4\u00d5\5\u0096L\2\u00d5"+
		"\u00d6\7G\2\2\u00d6\u00e6\3\2\2\2\u00d7\u00d8\7\4\2\2\u00d8\u00d9\7F\2"+
		"\2\u00d9\u00da\5\20\t\2\u00da\u00db\7c\2\2\u00db\u00dc\5|?\2\u00dc\u00dd"+
		"\7G\2\2\u00dd\u00e6\3\2\2\2\u00de\u00df\7\5\2\2\u00df\u00e0\7F\2\2\u00e0"+
		"\u00e1\5|?\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\5\20\t\2\u00e3\u00e4\7G\2"+
		"\2\u00e4\u00e6\3\2\2\2\u00e5\u00c4\3\2\2\2\u00e5\u00c5\3\2\2\2\u00e5\u00c7"+
		"\3\2\2\2\u00e5\u00cb\3\2\2\2\u00e5\u00cf\3\2\2\2\u00e5\u00d1\3\2\2\2\u00e5"+
		"\u00d7\3\2\2\2\u00e5\u00de\3\2\2\2\u00e6\5\3\2\2\2\u00e7\u00e8\7A\2\2"+
		"\u00e8\u00e9\7F\2\2\u00e9\u00ea\5,\27\2\u00ea\u00eb\7c\2\2\u00eb\u00ec"+
		"\5\b\5\2\u00ec\u00ed\7G\2\2\u00ed\7\3\2\2\2\u00ee\u00ef\b\5\1\2\u00ef"+
		"\u00f0\5\n\6\2\u00f0\u00f6\3\2\2\2\u00f1\u00f2\f\3\2\2\u00f2\u00f3\7c"+
		"\2\2\u00f3\u00f5\5\n\6\2\u00f4\u00f1\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6"+
		"\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\t\3\2\2\2\u00f8\u00f6\3\2\2\2"+
		"\u00f9\u00fa\5|?\2\u00fa\u00fb\7a\2\2\u00fb\u00fc\5,\27\2\u00fc\u0101"+
		"\3\2\2\2\u00fd\u00fe\7\36\2\2\u00fe\u00ff\7a\2\2\u00ff\u0101\5,\27\2\u0100"+
		"\u00f9\3\2\2\2\u0100\u00fd\3\2\2\2\u0101\13\3\2\2\2\u0102\u0103\b\7\1"+
		"\2\u0103\u0125\5\4\3\2\u0104\u0105\7F\2\2\u0105\u0106\5|?\2\u0106\u0107"+
		"\7G\2\2\u0107\u0108\7J\2\2\u0108\u0109\5\u0086D\2\u0109\u010a\7K\2\2\u010a"+
		"\u0125\3\2\2\2\u010b\u010c\7F\2\2\u010c\u010d\5|?\2\u010d\u010e\7G\2\2"+
		"\u010e\u010f\7J\2\2\u010f\u0110\5\u0086D\2\u0110\u0111\7c\2\2\u0111\u0112"+
		"\7K\2\2\u0112\u0125\3\2\2\2\u0113\u0114\7\3\2\2\u0114\u0115\7F\2\2\u0115"+
		"\u0116\5|?\2\u0116\u0117\7G\2\2\u0117\u0118\7J\2\2\u0118\u0119\5\u0086"+
		"D\2\u0119\u011a\7K\2\2\u011a\u0125\3\2\2\2\u011b\u011c\7\3\2\2\u011c\u011d"+
		"\7F\2\2\u011d\u011e\5|?\2\u011e\u011f\7G\2\2\u011f\u0120\7J\2\2\u0120"+
		"\u0121\5\u0086D\2\u0121\u0122\7c\2\2\u0122\u0123\7K\2\2\u0123\u0125\3"+
		"\2\2\2\u0124\u0102\3\2\2\2\u0124\u0104\3\2\2\2\u0124\u010b\3\2\2\2\u0124"+
		"\u0113\3\2\2\2\u0124\u011b\3\2\2\2\u0125\u014a\3\2\2\2\u0126\u0127\f\r"+
		"\2\2\u0127\u0128\7H\2\2\u0128\u0129\5\60\31\2\u0129\u012a\7I\2\2\u012a"+
		"\u0149\3\2\2\2\u012b\u012c\f\f\2\2\u012c\u012e\7F\2\2\u012d\u012f\5\16"+
		"\b\2\u012e\u012d\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0130\3\2\2\2\u0130"+
		"\u0149\7G\2\2\u0131\u0132\f\13\2\2\u0132\u0134\7F\2\2\u0133\u0135\5\16"+
		"\b\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\7G\2\2\u0137\u0139\5\f\7\2\u0138\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013b\u013c\3\2\2\2\u013c"+
		"\u013d\6\7\6\2\u013d\u0149\3\2\2\2\u013e\u013f\f\n\2\2\u013f\u0140\7r"+
		"\2\2\u0140\u0149\7t\2\2\u0141\u0142\f\t\2\2\u0142\u0143\7q\2\2\u0143\u0149"+
		"\7t\2\2\u0144\u0145\f\b\2\2\u0145\u0149\7S\2\2\u0146\u0147\f\7\2\2\u0147"+
		"\u0149\7U\2\2\u0148\u0126\3\2\2\2\u0148\u012b\3\2\2\2\u0148\u0131\3\2"+
		"\2\2\u0148\u013e\3\2\2\2\u0148\u0141\3\2\2\2\u0148\u0144\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\r\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\b\b\1\2\u014e\u0153"+
		"\5,\27\2\u014f\u0150\5\f\7\2\u0150\u0151\6\b\13\2\u0151\u0153\3\2\2\2"+
		"\u0152\u014d\3\2\2\2\u0152\u014f\3\2\2\2\u0153\u0159\3\2\2\2\u0154\u0155"+
		"\f\4\2\2\u0155\u0156\7c\2\2\u0156\u0158\5,\27\2\u0157\u0154\3\2\2\2\u0158"+
		"\u015b\3\2\2\2\u0159\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\17\3\2\2"+
		"\2\u015b\u0159\3\2\2\2\u015c\u0173\5\f\7\2\u015d\u015e\7S\2\2\u015e\u0173"+
		"\5\20\t\2\u015f\u0160\7U\2\2\u0160\u0173\5\20\t\2\u0161\u0162\5\22\n\2"+
		"\u0162\u0163\5\24\13\2\u0163\u0173\3\2\2\2\u0164\u0165\7\61\2\2\u0165"+
		"\u0173\5\20\t\2\u0166\u0167\7\61\2\2\u0167\u0168\7F\2\2\u0168\u0169\5"+
		"|?\2\u0169\u016a\7G\2\2\u016a\u0173\3\2\2\2\u016b\u016c\7=\2\2\u016c\u016d"+
		"\7F\2\2\u016d\u016e\5|?\2\u016e\u016f\7G\2\2\u016f\u0173\3\2\2\2\u0170"+
		"\u0171\7[\2\2\u0171\u0173\7t\2\2\u0172\u015c\3\2\2\2\u0172\u015d\3\2\2"+
		"\2\u0172\u015f\3\2\2\2\u0172\u0161\3\2\2\2\u0172\u0164\3\2\2\2\u0172\u0166"+
		"\3\2\2\2\u0172\u016b\3\2\2\2\u0172\u0170\3\2\2\2\u0173\21\3\2\2\2\u0174"+
		"\u0175\t\2\2\2\u0175\23\3\2\2\2\u0176\u0177\7F\2\2\u0177\u0178\5|?\2\u0178"+
		"\u0179\7G\2\2\u0179\u017a\5\24\13\2\u017a\u0184\3\2\2\2\u017b\u017c\7"+
		"\3\2\2\u017c\u017d\7F\2\2\u017d\u017e\5|?\2\u017e\u017f\7G\2\2\u017f\u0180"+
		"\5\24\13\2\u0180\u0184\3\2\2\2\u0181\u0184\5\20\t\2\u0182\u0184\7v\2\2"+
		"\u0183\u0176\3\2\2\2\u0183\u017b\3\2\2\2\u0183\u0181\3\2\2\2\u0183\u0182"+
		"\3\2\2\2\u0184\25\3\2\2\2\u0185\u0186\b\f\1\2\u0186\u0187\5\24\13\2\u0187"+
		"\u0198\3\2\2\2\u0188\u0189\f\6\2\2\u0189\u018a\7V\2\2\u018a\u0197\5\24"+
		"\13\2\u018b\u018c\f\5\2\2\u018c\u018d\7\6\2\2\u018d\u018e\5\24\13\2\u018e"+
		"\u018f\6\f\17\2\u018f\u0197\3\2\2\2\u0190\u0191\f\4\2\2\u0191\u0192\7"+
		"W\2\2\u0192\u0197\5\24\13\2\u0193\u0194\f\3\2\2\u0194\u0195\7X\2\2\u0195"+
		"\u0197\5\24\13\2\u0196\u0188\3\2\2\2\u0196\u018b\3\2\2\2\u0196\u0190\3"+
		"\2\2\2\u0196\u0193\3\2\2\2\u0197\u019a\3\2\2\2\u0198\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\27\3\2\2\2\u019a\u0198\3\2\2\2\u019b\u019c\b\r\1"+
		"\2\u019c\u019d\5\26\f\2\u019d\u01b1\3\2\2\2\u019e\u019f\f\5\2\2\u019f"+
		"\u01a0\7R\2\2\u01a0\u01b0\5\30\r\6\u01a1\u01a2\f\4\2\2\u01a2\u01a3\7S"+
		"\2\2\u01a3\u01a4\5\30\r\5\u01a4\u01a5\6\r\24\2\u01a5\u01b0\3\2\2\2\u01a6"+
		"\u01a7\f\7\2\2\u01a7\u01a8\7R\2\2\u01a8\u01b0\5\26\f\2\u01a9\u01aa\f\6"+
		"\2\2\u01aa\u01ab\7T\2\2\u01ab\u01b0\5\26\f\2\u01ac\u01ad\f\3\2\2\u01ad"+
		"\u01ae\7R\2\2\u01ae\u01b0\6\r\30\2\u01af\u019e\3\2\2\2\u01af\u01a1\3\2"+
		"\2\2\u01af\u01a6\3\2\2\2\u01af\u01a9\3\2\2\2\u01af\u01ac\3\2\2\2\u01b0"+
		"\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1\u01b2\3\2\2\2\u01b2\31\3\2\2"+
		"\2\u01b3\u01b1\3\2\2\2\u01b4\u01b5\b\16\1\2\u01b5\u01b6\5\30\r\2\u01b6"+
		"\u01bf\3\2\2\2\u01b7\u01b8\f\4\2\2\u01b8\u01b9\7P\2\2\u01b9\u01be\5\30"+
		"\r\2\u01ba\u01bb\f\3\2\2\u01bb\u01bc\7Q\2\2\u01bc\u01be\5\30\r\2\u01bd"+
		"\u01b7\3\2\2\2\u01bd\u01ba\3\2\2\2\u01be\u01c1\3\2\2\2\u01bf\u01bd\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\33\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c2\u01c3"+
		"\b\17\1\2\u01c3\u01c4\5\32\16\2\u01c4\u01d3\3\2\2\2\u01c5\u01c6\f\6\2"+
		"\2\u01c6\u01c7\7L\2\2\u01c7\u01d2\5\32\16\2\u01c8\u01c9\f\5\2\2\u01c9"+
		"\u01ca\7N\2\2\u01ca\u01d2\5\32\16\2\u01cb\u01cc\f\4\2\2\u01cc\u01cd\7"+
		"M\2\2\u01cd\u01d2\5\32\16\2\u01ce\u01cf\f\3\2\2\u01cf\u01d0\7O\2\2\u01d0"+
		"\u01d2\5\32\16\2\u01d1\u01c5\3\2\2\2\u01d1\u01c8\3\2\2\2\u01d1\u01cb\3"+
		"\2\2\2\u01d1\u01ce\3\2\2\2\u01d2\u01d5\3\2\2\2\u01d3\u01d1\3\2\2\2\u01d3"+
		"\u01d4\3\2\2\2\u01d4\35\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d6\u01d7\b\20\1"+
		"\2\u01d7\u01d8\5\34\17\2\u01d8\u01e6\3\2\2\2\u01d9\u01da\f\3\2\2\u01da"+
		"\u01db\7d\2\2\u01db\u01dc\5\36\20\4\u01dc\u01dd\6\20 \2\u01dd\u01e5\3"+
		"\2\2\2\u01de\u01df\f\5\2\2\u01df\u01e0\7o\2\2\u01e0\u01e5\5\34\17\2\u01e1"+
		"\u01e2\f\4\2\2\u01e2\u01e3\7p\2\2\u01e3\u01e5\5\34\17\2\u01e4\u01d9\3"+
		"\2\2\2\u01e4\u01de\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e5\u01e8\3\2\2\2\u01e6"+
		"\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\37\3\2\2\2\u01e8\u01e6\3\2\2"+
		"\2\u01e9\u01ea\b\21\1\2\u01ea\u01eb\5\36\20\2\u01eb\u01f1\3\2\2\2\u01ec"+
		"\u01ed\f\3\2\2\u01ed\u01ee\7Y\2\2\u01ee\u01f0\5\36\20\2\u01ef\u01ec\3"+
		"\2\2\2\u01f0\u01f3\3\2\2\2\u01f1\u01ef\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2"+
		"!\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4\u01f5\b\22\1\2\u01f5\u01f6\5 \21\2"+
		"\u01f6\u01fc\3\2\2\2\u01f7\u01f8\f\3\2\2\u01f8\u01f9\7]\2\2\u01f9\u01fb"+
		"\5 \21\2\u01fa\u01f7\3\2\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fc"+
		"\u01fd\3\2\2\2\u01fd#\3\2\2\2\u01fe\u01fc\3\2\2\2\u01ff\u0200\b\23\1\2"+
		"\u0200\u0201\5\"\22\2\u0201\u0207\3\2\2\2\u0202\u0203\f\3\2\2\u0203\u0204"+
		"\7Z\2\2\u0204\u0206\5\"\22\2\u0205\u0202\3\2\2\2\u0206\u0209\3\2\2\2\u0207"+
		"\u0205\3\2\2\2\u0207\u0208\3\2\2\2\u0208%\3\2\2\2\u0209\u0207\3\2\2\2"+
		"\u020a\u020b\b\24\1\2\u020b\u020c\5$\23\2\u020c\u0212\3\2\2\2\u020d\u020e"+
		"\f\3\2\2\u020e\u020f\7[\2\2\u020f\u0211\5$\23\2\u0210\u020d\3\2\2\2\u0211"+
		"\u0214\3\2\2\2\u0212\u0210\3\2\2\2\u0212\u0213\3\2\2\2\u0213\'\3\2\2\2"+
		"\u0214\u0212\3\2\2\2\u0215\u0216\b\25\1\2\u0216\u0217\5&\24\2\u0217\u021d"+
		"\3\2\2\2\u0218\u0219\f\3\2\2\u0219\u021a\7\\\2\2\u021a\u021c\5&\24\2\u021b"+
		"\u0218\3\2\2\2\u021c\u021f\3\2\2\2\u021d\u021b\3\2\2\2\u021d\u021e\3\2"+
		"\2\2\u021e)\3\2\2\2\u021f\u021d\3\2\2\2\u0220\u0226\5(\25\2\u0221\u0222"+
		"\7`\2\2\u0222\u0223\5\60\31\2\u0223\u0224\7a\2\2\u0224\u0225\5*\26\2\u0225"+
		"\u0227\3\2\2\2\u0226\u0221\3\2\2\2\u0226\u0227\3\2\2\2\u0227+\3\2\2\2"+
		"\u0228\u023d\5*\26\2\u0229\u022a\5\20\t\2\u022a\u022b\5.\30\2\u022b\u022c"+
		"\5,\27\2\u022c\u023d\3\2\2\2\u022d\u022e\5\20\t\2\u022e\u022f\5.\30\2"+
		"\u022f\u0230\5,\27\2\u0230\u0231\5\20\t\2\u0231\u0232\6\27(\2\u0232\u023d"+
		"\3\2\2\2\u0233\u0234\5\20\t\2\u0234\u0235\5.\30\2\u0235\u0236\6\27)\2"+
		"\u0236\u023d\3\2\2\2\u0237\u0238\5\20\t\2\u0238\u0239\5.\30\2\u0239\u023a"+
		"\6\27*\2\u023a\u023d\3\2\2\2\u023b\u023d\7v\2\2\u023c\u0228\3\2\2\2\u023c"+
		"\u0229\3\2\2\2\u023c\u022d\3\2\2\2\u023c\u0233\3\2\2\2\u023c\u0237\3\2"+
		"\2\2\u023c\u023b\3\2\2\2\u023d-\3\2\2\2\u023e\u023f\t\3\2\2\u023f/\3\2"+
		"\2\2\u0240\u0241\b\31\1\2\u0241\u0242\5,\27\2\u0242\u024d\3\2\2\2\u0243"+
		"\u0244\f\4\2\2\u0244\u0245\7c\2\2\u0245\u024c\5,\27\2\u0246\u0247\f\3"+
		"\2\2\u0247\u0248\7\7\2\2\u0248\u0249\5,\27\2\u0249\u024a\6\31-\2\u024a"+
		"\u024c\3\2\2\2\u024b\u0243\3\2\2\2\u024b\u0246\3\2\2\2\u024c\u024f\3\2"+
		"\2\2\u024d\u024b\3\2\2\2\u024d\u024e\3\2\2\2\u024e\61\3\2\2\2\u024f\u024d"+
		"\3\2\2\2\u0250\u0251\5*\26\2\u0251\63\3\2\2\2\u0252\u0253\5\66\34\2\u0253"+
		"\u0254\5<\37\2\u0254\u0255\7b\2\2\u0255\u025b\3\2\2\2\u0256\u0257\5\66"+
		"\34\2\u0257\u0258\7b\2\2\u0258\u025b\3\2\2\2\u0259\u025b\5\u008eH\2\u025a"+
		"\u0252\3\2\2\2\u025a\u0256\3\2\2\2\u025a\u0259\3\2\2\2\u025b\65\3\2\2"+
		"\2\u025c\u025e\5:\36\2\u025d\u025c\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u025d"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\67\3\2\2\2\u0261\u0263\5:\36\2\u0262"+
		"\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0262\3\2\2\2\u0264\u0265\3\2"+
		"\2\2\u02659\3\2\2\2\u0266\u026c\5@!\2\u0267\u026c\5B\"\2\u0268\u026c\5"+
		"\\/\2\u0269\u026c\5^\60\2\u026a\u026c\5`\61\2\u026b\u0266\3\2\2\2\u026b"+
		"\u0267\3\2\2\2\u026b\u0268\3\2\2\2\u026b\u0269\3\2\2\2\u026b\u026a\3\2"+
		"\2\2\u026c;\3\2\2\2\u026d\u026e\b\37\1\2\u026e\u026f\5> \2\u026f\u0275"+
		"\3\2\2\2\u0270\u0271\f\3\2\2\u0271\u0272\7c\2\2\u0272\u0274\5> \2\u0273"+
		"\u0270\3\2\2\2\u0274\u0277\3\2\2\2\u0275\u0273\3\2\2\2\u0275\u0276\3\2"+
		"\2\2\u0276=\3\2\2\2\u0277\u0275\3\2\2\2\u0278\u027e\5b\62\2\u0279\u027a"+
		"\5b\62\2\u027a\u027b\7d\2\2\u027b\u027c\5\u0084C\2\u027c\u027e\3\2\2\2"+
		"\u027d\u0278\3\2\2\2\u027d\u0279\3\2\2\2\u027e?\3\2\2\2\u027f\u0280\t"+
		"\4\2\2\u0280A\3\2\2\2\u0281\u0282\b\"\1\2\u0282\u0291\t\5\2\2\u0283\u0284"+
		"\7\3\2\2\u0284\u0285\7F\2\2\u0285\u0286\t\6\2\2\u0286\u0291\7G\2\2\u0287"+
		"\u0291\5Z.\2\u0288\u0291\5D#\2\u0289\u0291\5R*\2\u028a\u0291\5\u0082B"+
		"\2\u028b\u028c\7\13\2\2\u028c\u028d\7F\2\2\u028d\u028e\5\62\32\2\u028e"+
		"\u028f\7G\2\2\u028f\u0291\3\2\2\2\u0290\u0281\3\2\2\2\u0290\u0283\3\2"+
		"\2\2\u0290\u0287\3\2\2\2\u0290\u0288\3\2\2\2\u0290\u0289\3\2\2\2\u0290"+
		"\u028a\3\2\2\2\u0290\u028b\3\2\2\2\u0291\u0296\3\2\2\2\u0292\u0293\f\3"+
		"\2\2\u0293\u0295\5p9\2\u0294\u0292\3\2\2\2\u0295\u0298\3\2\2\2\u0296\u0294"+
		"\3\2\2\2\u0296\u0297\3\2\2\2\u0297C\3\2\2\2\u0298\u0296\3\2\2\2\u0299"+
		"\u029b\5F$\2\u029a\u029c\7t\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2"+
		"\2\u029c\u029d\3\2\2\2\u029d\u029e\7J\2\2\u029e\u029f\5H%\2\u029f\u02a0"+
		"\7K\2\2\u02a0\u02a5\3\2\2\2\u02a1\u02a2\5F$\2\u02a2\u02a3\7t\2\2\u02a3"+
		"\u02a5\3\2\2\2\u02a4\u0299\3\2\2\2\u02a4\u02a1\3\2\2\2\u02a5E\3\2\2\2"+
		"\u02a6\u02a7\t\7\2\2\u02a7G\3\2\2\2\u02a8\u02a9\b%\1\2\u02a9\u02aa\5J"+
		"&\2\u02aa\u02af\3\2\2\2\u02ab\u02ac\f\3\2\2\u02ac\u02ae\5J&\2\u02ad\u02ab"+
		"\3\2\2\2\u02ae\u02b1\3\2\2\2\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0"+
		"I\3\2\2\2\u02b1\u02af\3\2\2\2\u02b2\u02b4\5L\'\2\u02b3\u02b5\5N(\2\u02b4"+
		"\u02b3\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b6\3\2\2\2\u02b6\u02b7\7b"+
		"\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02ba\5\u008eH\2\u02b9\u02b2\3\2\2\2\u02b9"+
		"\u02b8\3\2\2\2\u02baK\3\2\2\2\u02bb\u02bd\5B\"\2\u02bc\u02be\5L\'\2\u02bd"+
		"\u02bc\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c4\3\2\2\2\u02bf\u02c1\5\\"+
		"/\2\u02c0\u02c2\5L\'\2\u02c1\u02c0\3\2\2\2\u02c1\u02c2\3\2\2\2\u02c2\u02c4"+
		"\3\2\2\2\u02c3\u02bb\3\2\2\2\u02c3\u02bf\3\2\2\2\u02c4M\3\2\2\2\u02c5"+
		"\u02c6\b(\1\2\u02c6\u02c7\5P)\2\u02c7\u02cd\3\2\2\2\u02c8\u02c9\f\3\2"+
		"\2\u02c9\u02ca\7c\2\2\u02ca\u02cc\5P)\2\u02cb\u02c8\3\2\2\2\u02cc\u02cf"+
		"\3\2\2\2\u02cd\u02cb\3\2\2\2\u02cd\u02ce\3\2\2\2\u02ceO\3\2\2\2\u02cf"+
		"\u02cd\3\2\2\2\u02d0\u02d7\5b\62\2\u02d1\u02d3\5b\62\2\u02d2\u02d1\3\2"+
		"\2\2\u02d2\u02d3\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d5\7a\2\2\u02d5"+
		"\u02d7\5\62\32\2\u02d6\u02d0\3\2\2\2\u02d6\u02d2\3\2\2\2\u02d7Q\3\2\2"+
		"\2\u02d8\u02da\7#\2\2\u02d9\u02db\7t\2\2\u02da\u02d9\3\2\2\2\u02da\u02db"+
		"\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7J\2\2\u02dd\u02de\5T+\2\u02de"+
		"\u02df\7K\2\2\u02df\u02ec\3\2\2\2\u02e0\u02e2\7#\2\2\u02e1\u02e3\7t\2"+
		"\2\u02e2\u02e1\3\2\2\2\u02e2\u02e3\3\2\2\2\u02e3\u02e4\3\2\2\2\u02e4\u02e5"+
		"\7J\2\2\u02e5\u02e6\5T+\2\u02e6\u02e7\7c\2\2\u02e7\u02e8\7K\2\2\u02e8"+
		"\u02ec\3\2\2\2\u02e9\u02ea\7#\2\2\u02ea\u02ec\7t\2\2\u02eb\u02d8\3\2\2"+
		"\2\u02eb\u02e0\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ecS\3\2\2\2\u02ed\u02ee"+
		"\b+\1\2\u02ee\u02ef\5V,\2\u02ef\u02f5\3\2\2\2\u02f0\u02f1\f\3\2\2\u02f1"+
		"\u02f2\7c\2\2\u02f2\u02f4\5V,\2\u02f3\u02f0\3\2\2\2\u02f4\u02f7\3\2\2"+
		"\2\u02f5\u02f3\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6U\3\2\2\2\u02f7\u02f5"+
		"\3\2\2\2\u02f8\u02fe\5X-\2\u02f9\u02fa\5X-\2\u02fa\u02fb\7d\2\2\u02fb"+
		"\u02fc\5\62\32\2\u02fc\u02fe\3\2\2\2\u02fd\u02f8\3\2\2\2\u02fd\u02f9\3"+
		"\2\2\2\u02feW\3\2\2\2\u02ff\u0300\7t\2\2\u0300Y\3\2\2\2\u0301\u0302\7"+
		">\2\2\u0302\u0303\7F\2\2\u0303\u0304\5|?\2\u0304\u0305\7G\2\2\u0305[\3"+
		"\2\2\2\u0306\u0307\t\b\2\2\u0307]\3\2\2\2\u0308\u030f\t\t\2\2\u0309\u030f"+
		"\5h\65\2\u030a\u030b\7\16\2\2\u030b\u030c\7F\2\2\u030c\u030d\7t\2\2\u030d"+
		"\u030f\7G\2\2\u030e\u0308\3\2\2\2\u030e\u0309\3\2\2\2\u030e\u030a\3\2"+
		"\2\2\u030f_\3\2\2\2\u0310\u0311\7<\2\2\u0311\u0312\7F\2\2\u0312\u0313"+
		"\5|?\2\u0313\u0314\7G\2\2\u0314\u031b\3\2\2\2\u0315\u0316\7<\2\2\u0316"+
		"\u0317\7F\2\2\u0317\u0318\5\62\32\2\u0318\u0319\7G\2\2\u0319\u031b\3\2"+
		"\2\2\u031a\u0310\3\2\2\2\u031a\u0315\3\2\2\2\u031ba\3\2\2\2\u031c\u031e"+
		"\5p9\2\u031d\u031c\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u031f\3\2\2\2\u031f"+
		"\u0323\5d\63\2\u0320\u0322\5f\64\2\u0321\u0320\3\2\2\2\u0322\u0325\3\2"+
		"\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324c\3\2\2\2\u0325\u0323"+
		"\3\2\2\2\u0326\u0327\b\63\1\2\u0327\u0338\7t\2\2\u0328\u0329\7F\2\2\u0329"+
		"\u032a\5b\62\2\u032a\u032b\7G\2\2\u032b\u0338\3\2\2\2\u032c\u032d\7t\2"+
		"\2\u032d\u032e\7a\2\2\u032e\u0338\7v\2\2\u032f\u0331\7F\2\2\u0330\u0332"+
		"\5B\"\2\u0331\u0330\3\2\2\2\u0331\u0332\3\2\2\2\u0332\u0333\3\2\2\2\u0333"+
		"\u0334\5p9\2\u0334\u0335\5d\63\2\u0335\u0336\7G\2\2\u0336\u0338\3\2\2"+
		"\2\u0337\u0326\3\2\2\2\u0337\u0328\3\2\2\2\u0337\u032c\3\2\2\2\u0337\u032f"+
		"\3\2\2\2\u0338\u0366\3\2\2\2\u0339\u033a\f\n\2\2\u033a\u033c\7H\2\2\u033b"+
		"\u033d\5r:\2\u033c\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2"+
		"\2\u033e\u0340\5,\27\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0341"+
		"\3\2\2\2\u0341\u0365\7I\2\2\u0342\u0343\f\t\2\2\u0343\u0344\7H\2\2\u0344"+
		"\u0346\7\62\2\2\u0345\u0347\5r:\2\u0346\u0345\3\2\2\2\u0346\u0347\3\2"+
		"\2\2\u0347\u0348\3\2\2\2\u0348\u0349\5,\27\2\u0349\u034a\7I\2\2\u034a"+
		"\u0365\3\2\2\2\u034b\u034c\f\b\2\2\u034c\u034d\7H\2\2\u034d\u034e\5r:"+
		"\2\u034e\u034f\7\62\2\2\u034f\u0350\5,\27\2\u0350\u0351\7I\2\2\u0351\u0365"+
		"\3\2\2\2\u0352\u0353\f\7\2\2\u0353\u0355\7H\2\2\u0354\u0356\5r:\2\u0355"+
		"\u0354\3\2\2\2\u0355\u0356\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\7V"+
		"\2\2\u0358\u0365\7I\2\2\u0359\u035a\f\6\2\2\u035a\u035b\7F\2\2\u035b\u035c"+
		"\5t;\2\u035c\u035d\7G\2\2\u035d\u0365\3\2\2\2\u035e\u035f\f\5\2\2\u035f"+
		"\u0361\7F\2\2\u0360\u0362\5z>\2\u0361\u0360\3\2\2\2\u0361\u0362\3\2\2"+
		"\2\u0362\u0363\3\2\2\2\u0363\u0365\7G\2\2\u0364\u0339\3\2\2\2\u0364\u0342"+
		"\3\2\2\2\u0364\u034b\3\2\2\2\u0364\u0352\3\2\2\2\u0364\u0359\3\2\2\2\u0364"+
		"\u035e\3\2\2\2\u0365\u0368\3\2\2\2\u0366\u0364\3\2\2\2\u0366\u0367\3\2"+
		"\2\2\u0367e\3\2\2\2\u0368\u0366\3\2\2\2\u0369\u036a\7\17\2\2\u036a\u036c"+
		"\7F\2\2\u036b\u036d\7w\2\2\u036c\u036b\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u036c\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u0370\3\2\2\2\u0370\u0373\7G"+
		"\2\2\u0371\u0373\5h\65\2\u0372\u0369\3\2\2\2\u0372\u0371\3\2\2\2\u0373"+
		"g\3\2\2\2\u0374\u0375\7\20\2\2\u0375\u0376\7F\2\2\u0376\u0377\7F\2\2\u0377"+
		"\u0378\5j\66\2\u0378\u0379\7G\2\2\u0379\u037a\7G\2\2\u037ai\3\2\2\2\u037b"+
		"\u0380\5l\67\2\u037c\u037d\7c\2\2\u037d\u037f\5l\67\2\u037e\u037c\3\2"+
		"\2\2\u037f\u0382\3\2\2\2\u0380\u037e\3\2\2\2\u0380\u0381\3\2\2\2\u0381"+
		"\u0385\3\2\2\2\u0382\u0380\3\2\2\2\u0383\u0385\3\2\2\2\u0384\u037b\3\2"+
		"\2\2\u0384\u0383\3\2\2\2\u0385k\3\2\2\2\u0386\u038c\n\n\2\2\u0387\u0389"+
		"\7F\2\2\u0388\u038a\5\16\b\2\u0389\u0388\3\2\2\2\u0389\u038a\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u038d\7G\2\2\u038c\u0387\3\2\2\2\u038c\u038d\3\2"+
		"\2\2\u038d\u0390\3\2\2\2\u038e\u0390\3\2\2\2\u038f\u0386\3\2\2\2\u038f"+
		"\u038e\3\2\2\2\u0390m\3\2\2\2\u0391\u0397\n\13\2\2\u0392\u0393\7F\2\2"+
		"\u0393\u0394\5n8\2\u0394\u0395\7G\2\2\u0395\u0397\3\2\2\2\u0396\u0391"+
		"\3\2\2\2\u0396\u0392\3\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398"+
		"\u0399\3\2\2\2\u0399o\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u039d\7V\2\2\u039c"+
		"\u039e\5r:\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03ae\3\2\2"+
		"\2\u039f\u03a1\7V\2\2\u03a0\u03a2\5r:\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2"+
		"\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03ae\5p9\2\u03a4\u03a6\7]\2\2\u03a5"+
		"\u03a7\5r:\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03ae\3\2\2"+
		"\2\u03a8\u03aa\7]\2\2\u03a9\u03ab\5r:\2\u03aa\u03a9\3\2\2\2\u03aa\u03ab"+
		"\3\2\2\2\u03ab\u03ac\3\2\2\2\u03ac\u03ae\5p9\2\u03ad\u039b\3\2\2\2\u03ad"+
		"\u039f\3\2\2\2\u03ad\u03a4\3\2\2\2\u03ad\u03a8\3\2\2\2\u03aeq\3\2\2\2"+
		"\u03af\u03b0\b:\1\2\u03b0\u03b1\5\\/\2\u03b1\u03b6\3\2\2\2\u03b2\u03b3"+
		"\f\3\2\2\u03b3\u03b5\5\\/\2\u03b4\u03b2\3\2\2\2\u03b5\u03b8\3\2\2\2\u03b6"+
		"\u03b4\3\2\2\2\u03b6\u03b7\3\2\2\2\u03b7s\3\2\2\2\u03b8\u03b6\3\2\2\2"+
		"\u03b9\u03bf\5v<\2\u03ba\u03bb\5v<\2\u03bb\u03bc\7c\2\2\u03bc\u03bd\7"+
		"s\2\2\u03bd\u03bf\3\2\2\2\u03be\u03b9\3\2\2\2\u03be\u03ba\3\2\2\2\u03bf"+
		"u\3\2\2\2\u03c0\u03c1\b<\1\2\u03c1\u03c2\5x=\2\u03c2\u03c8\3\2\2\2\u03c3"+
		"\u03c4\f\3\2\2\u03c4\u03c5\7c\2\2\u03c5\u03c7\5x=\2\u03c6\u03c3\3\2\2"+
		"\2\u03c7\u03ca\3\2\2\2\u03c8\u03c6\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9w"+
		"\3\2\2\2\u03ca\u03c8\3\2\2\2\u03cb\u03cc\5\66\34\2\u03cc\u03cd\5b\62\2"+
		"\u03cd\u03d3\3\2\2\2\u03ce\u03d0\58\35\2\u03cf\u03d1\5~@\2\u03d0\u03cf"+
		"\3\2\2\2\u03d0\u03d1\3\2\2\2\u03d1\u03d3\3\2\2\2\u03d2\u03cb\3\2\2\2\u03d2"+
		"\u03ce\3\2\2\2\u03d3y\3\2\2\2\u03d4\u03d5\b>\1\2\u03d5\u03d6\7t\2\2\u03d6"+
		"\u03dc\3\2\2\2\u03d7\u03d8\f\3\2\2\u03d8\u03d9\7c\2\2\u03d9\u03db\7t\2"+
		"\2\u03da\u03d7\3\2\2\2\u03db\u03de\3\2\2\2\u03dc\u03da\3\2\2\2\u03dc\u03dd"+
		"\3\2\2\2\u03dd{\3\2\2\2\u03de\u03dc\3\2\2\2\u03df\u03e1\5L\'\2\u03e0\u03e2"+
		"\5~@\2\u03e1\u03e0\3\2\2\2\u03e1\u03e2\3\2\2\2\u03e2}\3\2\2\2\u03e3\u03ef"+
		"\5p9\2\u03e4\u03e6\5p9\2\u03e5\u03e4\3\2\2\2\u03e5\u03e6\3\2\2\2\u03e6"+
		"\u03e7\3\2\2\2\u03e7\u03eb\5\u0080A\2\u03e8\u03ea\5f\64\2\u03e9\u03e8"+
		"\3\2\2\2\u03ea\u03ed\3\2\2\2\u03eb\u03e9\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec"+
		"\u03ef\3\2\2\2\u03ed\u03eb\3\2\2\2\u03ee\u03e3\3\2\2\2\u03ee\u03e5\3\2"+
		"\2\2\u03ef\177\3\2\2\2\u03f0\u03f1\bA\1\2\u03f1\u03f2\7F\2\2\u03f2\u03f3"+
		"\5~@\2\u03f3\u03f7\7G\2\2\u03f4\u03f6\5f\64\2\u03f5\u03f4\3\2\2\2\u03f6"+
		"\u03f9\3\2\2\2\u03f7\u03f5\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u041f\3\2"+
		"\2\2\u03f9\u03f7\3\2\2\2\u03fa\u03fc\7H\2\2\u03fb\u03fd\5r:\2\u03fc\u03fb"+
		"\3\2\2\2\u03fc\u03fd\3\2\2\2\u03fd\u03ff\3\2\2\2\u03fe\u0400\5,\27\2\u03ff"+
		"\u03fe\3\2\2\2\u03ff\u0400\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u041f\7I"+
		"\2\2\u0402\u0403\7H\2\2\u0403\u0405\7\62\2\2\u0404\u0406\5r:\2\u0405\u0404"+
		"\3\2\2\2\u0405\u0406\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u0408\5,\27\2\u0408"+
		"\u0409\7I\2\2\u0409\u041f\3\2\2\2\u040a\u040b\7H\2\2\u040b\u040c\5r:\2"+
		"\u040c\u040d\7\62\2\2\u040d\u040e\5,\27\2\u040e\u040f\7I\2\2\u040f\u041f"+
		"\3\2\2\2\u0410\u0411\7H\2\2\u0411\u0412\7V\2\2\u0412\u041f\7I\2\2\u0413"+
		"\u0415\7F\2\2\u0414\u0416\5t;\2\u0415\u0414\3\2\2\2\u0415\u0416\3\2\2"+
		"\2\u0416\u0417\3\2\2\2\u0417\u041b\7G\2\2\u0418\u041a\5f\64\2\u0419\u0418"+
		"\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2\2\2\u041b\u041c\3\2\2\2\u041c"+
		"\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041e\u03f0\3\2\2\2\u041e\u03fa\3\2"+
		"\2\2\u041e\u0402\3\2\2\2\u041e\u040a\3\2\2\2\u041e\u0410\3\2\2\2\u041e"+
		"\u0413\3\2\2\2\u041f\u044b\3\2\2\2\u0420\u0421\f\7\2\2\u0421\u0423\7H"+
		"\2\2\u0422\u0424\5r:\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2\2\u0424\u0426"+
		"\3\2\2\2\u0425\u0427\5,\27\2\u0426\u0425\3\2\2\2\u0426\u0427\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u044a\7I\2\2\u0429\u042a\f\6\2\2\u042a\u042b\7H\2"+
		"\2\u042b\u042d\7\62\2\2\u042c\u042e\5r:\2\u042d\u042c\3\2\2\2\u042d\u042e"+
		"\3\2\2\2\u042e\u042f\3\2\2\2\u042f\u0430\5,\27\2\u0430\u0431\7I\2\2\u0431"+
		"\u044a\3\2\2\2\u0432\u0433\f\5\2\2\u0433\u0434\7H\2\2\u0434\u0435\5r:"+
		"\2\u0435\u0436\7\62\2\2\u0436\u0437\5,\27\2\u0437\u0438\7I\2\2\u0438\u044a"+
		"\3\2\2\2\u0439\u043a\f\4\2\2\u043a\u043b\7H\2\2\u043b\u043c\7V\2\2\u043c"+
		"\u044a\7I\2\2\u043d\u043e\f\3\2\2\u043e\u0440\7F\2\2\u043f\u0441\5t;\2"+
		"\u0440\u043f\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\3\2\2\2\u0442\u0446"+
		"\7G\2\2\u0443\u0445\5f\64\2\u0444\u0443\3\2\2\2\u0445\u0448\3\2\2\2\u0446"+
		"\u0444\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u044a\3\2\2\2\u0448\u0446\3\2"+
		"\2\2\u0449\u0420\3\2\2\2\u0449\u0429\3\2\2\2\u0449\u0432\3\2\2\2\u0449"+
		"\u0439\3\2\2\2\u0449\u043d\3\2\2\2\u044a\u044d\3\2\2\2\u044b\u0449\3\2"+
		"\2\2\u044b\u044c\3\2\2\2\u044c\u0081\3\2\2\2\u044d\u044b\3\2\2\2\u044e"+
		"\u0452\7t\2\2\u044f\u0450\7\21\2\2\u0450\u0452\6BA\2\u0451\u044e\3\2\2"+
		"\2\u0451\u044f\3\2\2\2\u0452\u0083\3\2\2\2\u0453\u045e\5,\27\2\u0454\u0455"+
		"\7J\2\2\u0455\u0456\5\u0086D\2\u0456\u0457\7K\2\2\u0457\u045e\3\2\2\2"+
		"\u0458\u0459\7J\2\2\u0459\u045a\5\u0086D\2\u045a\u045b\7c\2\2\u045b\u045c"+
		"\7K\2\2\u045c\u045e\3\2\2\2\u045d\u0453\3\2\2\2\u045d\u0454\3\2\2\2\u045d"+
		"\u0458\3\2\2\2\u045e\u0085\3\2\2\2\u045f\u0461\bD\1\2\u0460\u0462\5\u0088"+
		"E\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462\u0463\3\2\2\2\u0463"+
		"\u0464\5\u0084C\2\u0464\u046d\3\2\2\2\u0465\u0466\f\3\2\2\u0466\u0468"+
		"\7c\2\2\u0467\u0469\5\u0088E\2\u0468\u0467\3\2\2\2\u0468\u0469\3\2\2\2"+
		"\u0469\u046a\3\2\2\2\u046a\u046c\5\u0084C\2\u046b\u0465\3\2\2\2\u046c"+
		"\u046f\3\2\2\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0087\3\2"+
		"\2\2\u046f\u046d\3\2\2\2\u0470\u0471\5\u008aF\2\u0471\u0472\7d\2\2\u0472"+
		"\u0089\3\2\2\2\u0473\u0474\bF\1\2\u0474\u0475\5\u008cG\2\u0475\u047a\3"+
		"\2\2\2\u0476\u0477\f\3\2\2\u0477\u0479\5\u008cG\2\u0478\u0476\3\2\2\2"+
		"\u0479\u047c\3\2\2\2\u047a\u0478\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u008b"+
		"\3\2\2\2\u047c\u047a\3\2\2\2\u047d\u047e\7H\2\2\u047e\u047f\5\62\32\2"+
		"\u047f\u0480\7I\2\2\u0480\u0484\3\2\2\2\u0481\u0482\7r\2\2\u0482\u0484"+
		"\7t\2\2\u0483\u047d\3\2\2\2\u0483\u0481\3\2\2\2\u0484\u008d\3\2\2\2\u0485"+
		"\u0486\7D\2\2\u0486\u0487\7F\2\2\u0487\u0488\5\62\32\2\u0488\u048a\7c"+
		"\2\2\u0489\u048b\7w\2\2\u048a\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c"+
		"\u048a\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e\u048f\7G"+
		"\2\2\u048f\u0490\7b\2\2\u0490\u008f\3\2\2\2\u0491\u04b8\5\u0094K\2\u0492"+
		"\u04b8\5\u0096L\2\u0493\u04b8\5\u009cO\2\u0494\u04b8\5\u009eP\2\u0495"+
		"\u04b8\5\u00a0Q\2\u0496\u04b8\5\u00aaV\2\u0497\u04b8\5\u0092J\2\u0498"+
		"\u0499\t\f\2\2\u0499\u049a\t\r\2\2\u049a\u04a3\7F\2\2\u049b\u04a0\5(\25"+
		"\2\u049c\u049d\7c\2\2\u049d\u049f\5(\25\2\u049e\u049c\3\2\2\2\u049f\u04a2"+
		"\3\2\2\2\u04a0\u049e\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a4\3\2\2\2\u04a2"+
		"\u04a0\3\2\2\2\u04a3\u049b\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4\u04b2\3\2"+
		"\2\2\u04a5\u04ae\7a\2\2\u04a6\u04ab\5(\25\2\u04a7\u04a8\7c\2\2\u04a8\u04aa"+
		"\5(\25\2\u04a9\u04a7\3\2\2\2\u04aa\u04ad\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab"+
		"\u04ac\3\2\2\2\u04ac\u04af\3\2\2\2\u04ad\u04ab\3\2\2\2\u04ae\u04a6\3\2"+
		"\2\2\u04ae\u04af\3\2\2\2\u04af\u04b1\3\2\2\2\u04b0\u04a5\3\2\2\2\u04b1"+
		"\u04b4\3\2\2\2\u04b2\u04b0\3\2\2\2\u04b2\u04b3\3\2\2\2\u04b3\u04b5\3\2"+
		"\2\2\u04b4\u04b2\3\2\2\2\u04b5\u04b6\7G\2\2\u04b6\u04b8\7b\2\2\u04b7\u0491"+
		"\3\2\2\2\u04b7\u0492\3\2\2\2\u04b7\u0493\3\2\2\2\u04b7\u0494\3\2\2\2\u04b7"+
		"\u0495\3\2\2\2\u04b7\u0496\3\2\2\2\u04b7\u0497\3\2\2\2\u04b7\u0498\3\2"+
		"\2\2\u04b8\u0091\3\2\2\2\u04b9\u04ba\7\24\2\2\u04ba\u04bb\7F\2\2\u04bb"+
		"\u04bc\7w\2\2\u04bc\u04bd\7G\2\2\u04bd\u04e5\7b\2\2\u04be\u04bf\7\24\2"+
		"\2\u04bf\u04c0\7F\2\2\u04c0\u04c1\7w\2\2\u04c1\u04c2\7R\2\2\u04c2\u04c3"+
		"\5\30\r\2\u04c3\u04c4\7G\2\2\u04c4\u04c5\7b\2\2\u04c5\u04e5\3\2\2\2\u04c6"+
		"\u04c7\7\24\2\2\u04c7\u04c8\7F\2\2\u04c8\u04c9\5\4\3\2\u04c9\u04ca\7G"+
		"\2\2\u04ca\u04cb\7b\2\2\u04cb\u04e5\3\2\2\2\u04cc\u04cd\7\24\2\2\u04cd"+
		"\u04dc\7F\2\2\u04ce\u04d0\5\4\3\2\u04cf\u04ce\3\2\2\2\u04d0\u04d1\3\2"+
		"\2\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d4\3\2\2\2\u04d3"+
		"\u04d5\7a\2\2\u04d4\u04d3\3\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d7\3\2"+
		"\2\2\u04d6\u04d8\5\4\3\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8"+
		"\u04da\3\2\2\2\u04d9\u04db\5\22\n\2\u04da\u04d9\3\2\2\2\u04da\u04db\3"+
		"\2\2\2\u04db\u04dd\3\2\2\2\u04dc\u04cf\3\2\2\2\u04dd\u04de\3\2\2\2\u04de"+
		"\u04dc\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\3\2\2\2\u04e0\u04e1\7G"+
		"\2\2\u04e1\u04e2\7b\2\2\u04e2\u04e3\6JD\2\u04e3\u04e5\3\2\2\2\u04e4\u04b9"+
		"\3\2\2\2\u04e4\u04be\3\2\2\2\u04e4\u04c6\3\2\2\2\u04e4\u04cc\3\2\2\2\u04e5"+
		"\u0093\3\2\2\2\u04e6\u04e7\7t\2\2\u04e7\u04e8\7a\2\2\u04e8\u04f2\5\u0090"+
		"I\2\u04e9\u04ea\7\32\2\2\u04ea\u04eb\5\62\32\2\u04eb\u04ec\7a\2\2\u04ec"+
		"\u04ed\5\u0090I\2\u04ed\u04f2\3\2\2\2\u04ee\u04ef\7\36\2\2\u04ef\u04f0"+
		"\7a\2\2\u04f0\u04f2\5\u0090I\2\u04f1\u04e6\3\2\2\2\u04f1\u04e9\3\2\2\2"+
		"\u04f1\u04ee\3\2\2\2\u04f2\u0095\3\2\2\2\u04f3\u04f5\7J\2\2\u04f4\u04f6"+
		"\5\u0098M\2\u04f5\u04f4\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04f7\3\2\2"+
		"\2\u04f7\u04f8\7K\2\2\u04f8\u0097\3\2\2\2\u04f9\u04fa\bM\1\2\u04fa\u04fb"+
		"\5\u009aN\2\u04fb\u0500\3\2\2\2\u04fc\u04fd\f\3\2\2\u04fd\u04ff\5\u009a"+
		"N\2\u04fe\u04fc\3\2\2\2\u04ff\u0502\3\2\2\2\u0500\u04fe\3\2\2\2\u0500"+
		"\u0501\3\2\2\2\u0501\u0099\3\2\2\2\u0502\u0500\3\2\2\2\u0503\u0506\5\u0090"+
		"I\2\u0504\u0506\5\64\33\2\u0505\u0503\3\2\2\2\u0505\u0504\3\2\2\2\u0506"+
		"\u009b\3\2\2\2\u0507\u0509\5\60\31\2\u0508\u0507\3\2\2\2\u0508\u0509\3"+
		"\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\7b\2\2\u050b\u009d\3\2\2\2\u050c"+
		"\u050d\7(\2\2\u050d\u050e\7F\2\2\u050e\u050f\5\36\20\2\u050f\u0510\7G"+
		"\2\2\u0510\u0511\7\25\2\2\u0511\u0512\7J\2\2\u0512\u0513\5\u0090I\2\u0513"+
		"\u0516\7K\2\2\u0514\u0515\7\"\2\2\u0515\u0517\5\u0090I\2\u0516\u0514\3"+
		"\2\2\2\u0516\u0517\3\2\2\2\u0517\u0524\3\2\2\2\u0518\u0519\7\25\2\2\u0519"+
		"\u051a\7J\2\2\u051a\u051b\5\u0090I\2\u051b\u051c\7K\2\2\u051c\u0524\3"+
		"\2\2\2\u051d\u051e\7\64\2\2\u051e\u051f\7F\2\2\u051f\u0520\5\60\31\2\u0520"+
		"\u0521\7G\2\2\u0521\u0522\5\u0090I\2\u0522\u0524\3\2\2\2\u0523\u050c\3"+
		"\2\2\2\u0523\u0518\3\2\2\2\u0523\u051d\3\2\2\2\u0524\u009f\3\2\2\2\u0525"+
		"\u0526\7;\2\2\u0526\u0528\5\u00a2R\2\u0527\u0529\5\u0096L\2\u0528\u0527"+
		"\3\2\2\2\u0528\u0529\3\2\2\2\u0529\u0539\3\2\2\2\u052a\u052b\7\37\2\2"+
		"\u052b\u052c\5\u0090I\2\u052c\u052d\7;\2\2\u052d\u052e\7F\2\2\u052e\u052f"+
		"\5\60\31\2\u052f\u0530\7G\2\2\u0530\u0531\7b\2\2\u0531\u0539\3\2\2\2\u0532"+
		"\u0533\7&\2\2\u0533\u0534\5\u00a4S\2\u0534\u0535\7J\2\2\u0535\u0536\5"+
		"\u0090I\2\u0536\u0537\7K\2\2\u0537\u0539\3\2\2\2\u0538\u0525\3\2\2\2\u0538"+
		"\u052a\3\2\2\2\u0538\u0532\3\2\2\2\u0539\u00a1\3\2\2\2\u053a\u053b\5\u0082"+
		"B\2\u053b\u053c\78\2\2\u053c\u053d\5\4\3\2\u053d\u0558\3\2\2\2\u053e\u053f"+
		"\5\u0082B\2\u053f\u0540\78\2\2\u0540\u0541\6RF\2\u0541\u0558\3\2\2\2\u0542"+
		"\u0543\5\u0082B\2\u0543\u0544\7\26\2\2\u0544\u0545\5\4\3\2\u0545\u0546"+
		"\6RG\2\u0546\u0558\3\2\2\2\u0547\u0548\5\u0082B\2\u0548\u0549\78\2\2\u0549"+
		"\u054a\5\30\r\2\u054a\u0558\3\2\2\2\u054b\u054c\5\u0082B\2\u054c\u054d"+
		"\7!\2\2\u054d\u054e\5\4\3\2\u054e\u0558\3\2\2\2\u054f\u0550\5\u0082B\2"+
		"\u0550\u0551\7!\2\2\u0551\u0552\6RH\2\u0552\u0558\3\2\2\2\u0553\u0554"+
		"\5\u0082B\2\u0554\u0555\7!\2\2\u0555\u0556\5\30\r\2\u0556\u0558\3\2\2"+
		"\2\u0557\u053a\3\2\2\2\u0557\u053e\3\2\2\2\u0557\u0542\3\2\2\2\u0557\u0547"+
		"\3\2\2\2\u0557\u054b\3\2\2\2\u0557\u054f\3\2\2\2\u0557\u0553\3\2\2\2\u0558"+
		"\u00a3\3\2\2\2\u0559\u055a\5\u00a6T\2\u055a\u055b\78\2\2\u055b\u055c\5"+
		"\30\r\2\u055c\u058f\3\2\2\2\u055d\u055e\5\u00a6T\2\u055e\u055f\78\2\2"+
		"\u055f\u0560\5\4\3\2\u0560\u058f\3\2\2\2\u0561\u0562\5\u00a6T\2\u0562"+
		"\u0563\78\2\2\u0563\u0564\5\4\3\2\u0564\u0565\6SI\2\u0565\u058f\3\2\2"+
		"\2\u0566\u0567\5\u00a6T\2\u0567\u0568\78\2\2\u0568\u0569\6SJ\2\u0569\u058f"+
		"\3\2\2\2\u056a\u056b\5\u00a6T\2\u056b\u056c\7!\2\2\u056c\u056d\6SK\2\u056d"+
		"\u058f\3\2\2\2\u056e\u056f\5\u00a6T\2\u056f\u0570\7!\2\2\u0570\u0571\5"+
		"\4\3\2\u0571\u058f\3\2\2\2\u0572\u0573\5\u00a6T\2\u0573\u0574\7!\2\2\u0574"+
		"\u0575\5\30\r\2\u0575\u058f\3\2\2\2\u0576\u0577\5,\27\2\u0577\u0578\7"+
		"8\2\2\u0578\u0579\6SL\2\u0579\u058f\3\2\2\2\u057a\u057b\5,\27\2\u057b"+
		"\u057c\7!\2\2\u057c\u057d\6SM\2\u057d\u058f\3\2\2\2\u057e\u057f\5,\27"+
		"\2\u057f\u0580\78\2\2\u0580\u0581\5\4\3\2\u0581\u058f\3\2\2\2\u0582\u0583"+
		"\5,\27\2\u0583\u0584\78\2\2\u0584\u0585\5\30\r\2\u0585\u058f\3\2\2\2\u0586"+
		"\u0587\5,\27\2\u0587\u0588\7!\2\2\u0588\u0589\5\4\3\2\u0589\u058f\3\2"+
		"\2\2\u058a\u058b\5,\27\2\u058b\u058c\7!\2\2\u058c\u058d\5\30\r\2\u058d"+
		"\u058f\3\2\2\2\u058e\u0559\3\2\2\2\u058e\u055d\3\2\2\2\u058e\u0561\3\2"+
		"\2\2\u058e\u0566\3\2\2\2\u058e\u056a\3\2\2\2\u058e\u056e\3\2\2\2\u058e"+
		"\u0572\3\2\2\2\u058e\u0576\3\2\2\2\u058e\u057a\3\2\2\2\u058e\u057e\3\2"+
		"\2\2\u058e\u0582\3\2\2\2\u058e\u0586\3\2\2\2\u058e\u058a\3\2\2\2\u058f"+
		"\u00a5\3\2\2\2\u0590\u0591\5\66\34\2\u0591\u0592\5<\37\2\u0592\u0595\3"+
		"\2\2\2\u0593\u0595\5\66\34\2\u0594\u0590\3\2\2\2\u0594\u0593\3\2\2\2\u0595"+
		"\u00a7\3\2\2\2\u0596\u0597\bU\1\2\u0597\u0598\5,\27\2\u0598\u059e\3\2"+
		"\2\2\u0599\u059a\f\3\2\2\u059a\u059b\7c\2\2\u059b\u059d\5,\27\2\u059c"+
		"\u0599\3\2\2\2\u059d\u05a0\3\2\2\2\u059e\u059c\3\2\2\2\u059e\u059f\3\2"+
		"\2\2\u059f\u00a9\3\2\2\2\u05a0\u059e\3\2\2\2\u05a1\u05a2\7\'\2\2\u05a2"+
		"\u05a3\7t\2\2\u05a3\u05b2\7b\2\2\u05a4\u05a5\7\35\2\2\u05a5\u05b2\7b\2"+
		"\2\u05a6\u05a7\7\31\2\2\u05a7\u05b2\7b\2\2\u05a8\u05aa\7.\2\2\u05a9\u05ab"+
		"\5\60\31\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2\2"+
		"\u05ac\u05b2\7b\2\2\u05ad\u05ae\7\'\2\2\u05ae\u05af\5\20\t\2\u05af\u05b0"+
		"\7b\2\2\u05b0\u05b2\3\2\2\2\u05b1\u05a1\3\2\2\2\u05b1\u05a4\3\2\2\2\u05b1"+
		"\u05a6\3\2\2\2\u05b1\u05a8\3\2\2\2\u05b1\u05ad\3\2\2\2\u05b2\u00ab\3\2"+
		"\2\2\u05b3\u05b5\5\u00aeX\2\u05b4\u05b3\3\2\2\2\u05b4\u05b5\3\2\2\2\u05b5"+
		"\u05b6\3\2\2\2\u05b6\u05b7\7\2\2\3\u05b7\u00ad\3\2\2\2\u05b8\u05b9\bX"+
		"\1\2\u05b9\u05ba\5\u00b0Y\2\u05ba\u05bf\3\2\2\2\u05bb\u05bc\f\3\2\2\u05bc"+
		"\u05be\5\u00b0Y\2\u05bd\u05bb\3\2\2\2\u05be\u05c1\3\2\2\2\u05bf\u05bd"+
		"\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0\u00af\3\2\2\2\u05c1\u05bf\3\2\2\2\u05c2"+
		"\u05c6\5\u00b2Z\2\u05c3\u05c6\5\64\33\2\u05c4\u05c6\7b\2\2\u05c5\u05c2"+
		"\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c5\u05c4\3\2\2\2\u05c6\u00b1\3\2\2\2\u05c7"+
		"\u05c9\7\27\2\2\u05c8\u05ca\5\66\34\2\u05c9\u05c8\3\2\2\2\u05c9\u05ca"+
		"\3\2\2\2\u05ca\u05cb\3\2\2\2\u05cb\u05cd\5b\62\2\u05cc\u05ce\5\u00b4["+
		"\2\u05cd\u05cc\3\2\2\2\u05cd\u05ce\3\2\2\2\u05ce\u05cf\3\2\2\2\u05cf\u05d0"+
		"\5\u0096L\2\u05d0\u05db\3\2\2\2\u05d1\u05d3\5\66\34\2\u05d2\u05d1\3\2"+
		"\2\2\u05d2\u05d3\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d6\5b\62\2\u05d5"+
		"\u05d7\5\u00b4[\2\u05d6\u05d5\3\2\2\2\u05d6\u05d7\3\2\2\2\u05d7\u05d8"+
		"\3\2\2\2\u05d8\u05d9\5\u0096L\2\u05d9\u05db\3\2\2\2\u05da\u05c7\3\2\2"+
		"\2\u05da\u05d2\3\2\2\2\u05db\u00b3\3\2\2\2\u05dc\u05dd\b[\1\2\u05dd\u05de"+
		"\5\64\33\2\u05de\u05e6\3\2\2\2\u05df\u05e0\f\3\2\2\u05e0\u05e2\5\64\33"+
		"\2\u05e1\u05e3\5\u0090I\2\u05e2\u05e1\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3"+
		"\u05e5\3\2\2\2\u05e4\u05df\3\2\2\2\u05e5\u05e8\3\2\2\2\u05e6\u05e4\3\2"+
		"\2\2\u05e6\u05e7\3\2\2\2\u05e7\u00b5\3\2\2\2\u05e8\u05e6\3\2\2\2\u00a0"+
		"\u00ba\u00bd\u00c0\u00c2\u00c9\u00d1\u00e5\u00f6\u0100\u0124\u012e\u0134"+
		"\u013a\u0148\u014a\u0152\u0159\u0172\u0183\u0196\u0198\u01af\u01b1\u01bd"+
		"\u01bf\u01d1\u01d3\u01e4\u01e6\u01f1\u01fc\u0207\u0212\u021d\u0226\u023c"+
		"\u024b\u024d\u025a\u025f\u0264\u026b\u0275\u027d\u0290\u0296\u029b\u02a4"+
		"\u02af\u02b4\u02b9\u02bd\u02c1\u02c3\u02cd\u02d2\u02d6\u02da\u02e2\u02eb"+
		"\u02f5\u02fd\u030e\u031a\u031d\u0323\u0331\u0337\u033c\u033f\u0346\u0355"+
		"\u0361\u0364\u0366\u036e\u0372\u0380\u0384\u0389\u038c\u038f\u0396\u0398"+
		"\u039d\u03a1\u03a6\u03aa\u03ad\u03b6\u03be\u03c8\u03d0\u03d2\u03dc\u03e1"+
		"\u03e5\u03eb\u03ee\u03f7\u03fc\u03ff\u0405\u0415\u041b\u041e\u0423\u0426"+
		"\u042d\u0440\u0446\u0449\u044b\u0451\u045d\u0461\u0468\u046d\u047a\u0483"+
		"\u048c\u04a0\u04a3\u04ab\u04ae\u04b2\u04b7\u04d1\u04d4\u04d7\u04da\u04de"+
		"\u04e4\u04f1\u04f5\u0500\u0505\u0508\u0516\u0523\u0528\u0538\u0557\u058e"+
		"\u0594\u059e\u05aa\u05b1\u05b4\u05bf\u05c5\u05c9\u05cd\u05d2\u05d6\u05da"+
		"\u05e2\u05e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}