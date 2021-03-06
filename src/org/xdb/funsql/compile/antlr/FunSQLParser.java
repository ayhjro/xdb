// $ANTLR 3.5 /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g 2014-05-06 09:30:31
 
package org.xdb.funsql.compile.antlr; 

import org.xdb.funsql.compile.expression.*;
import org.xdb.funsql.compile.predicate.*;
import org.xdb.funsql.compile.tokens.*;
import org.xdb.funsql.statement.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings("all")
public class FunSQLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "AMPERSAND", "APOSTROPHE", 
		"AT", "B", "BACKSLASH", "C", "CHAR", "COLON", "COMMA", "CONTROL_CHAR", 
		"D", "DIGIT", "DIV", "DOLLAR", "DOT", "DOUBLE_PIPE", "E", "EQUAL1", "EQUAL2", 
		"F", "FUNCTION_AGGREGATION", "G", "GREATER_EQUAL1", "GREATER_EQUAL2", 
		"GREATER_THAN", "H", "HAT", "I", "IDENTIFIER", "IGNORE_CHAR", "J", "K", 
		"KEYWORD_AND", "KEYWORD_AS", "KEYWORD_AVG", "KEYWORD_BEGIN", "KEYWORD_BY", 
		"KEYWORD_CALL", "KEYWORD_CONNECTION", "KEYWORD_COUNT", "KEYWORD_CREATE", 
		"KEYWORD_DATA", "KEYWORD_DISTINCT", "KEYWORD_DROP", "KEYWORD_END", "KEYWORD_FROM", 
		"KEYWORD_FUNCTION", "KEYWORD_GROUP", "KEYWORD_HAVING", "KEYWORD_IN", "KEYWORD_INFILE", 
		"KEYWORD_INTO", "KEYWORD_LIKE", "KEYWORD_LOAD", "KEYWORD_MAX", "KEYWORD_MIN", 
		"KEYWORD_NOT", "KEYWORD_OR", "KEYWORD_OUT", "KEYWORD_PARTITION", "KEYWORD_PARTITIONED", 
		"KEYWORD_PASSWD", "KEYWORD_REFERENCES", "KEYWORD_REPLICATED", "KEYWORD_SCHEMA", 
		"KEYWORD_SELECT", "KEYWORD_STORE", "KEYWORD_SUM", "KEYWORD_TABLE", "KEYWORD_URL", 
		"KEYWORD_USER", "KEYWORD_VAR", "KEYWORD_WHERE", "L", "LBRACKET", "LESS_EQUAL1", 
		"LESS_EQUAL2", "LESS_THAN", "LITERAL_DECIMAL", "LITERAL_INTEGER", "LITERAL_STRING", 
		"LPAREN", "M", "MINUS", "MOD", "MULT", "N", "NOT_EQUAL1", "NOT_EQUAL2", 
		"O", "P", "PIPE", "PLUS", "Q", "QUESTION", "QUOTED_STRING", "QUOTE_DOUBLE", 
		"QUOTE_SINGLE", "QUOTE_TRIPLE", "R", "RBRACKET", "RPAREN", "S", "SEMI", 
		"SHIFT_LEFT", "SHIFT_RIGHT", "T", "TILDE", "TYPE_DATE", "TYPE_DECIMAL", 
		"TYPE_INTEGER", "TYPE_VARCHAR", "U", "UNDERSCORE", "V", "W", "WS", "X", 
		"Y", "Z"
	};
	public static final int EOF=-1;
	public static final int A=4;
	public static final int AMPERSAND=5;
	public static final int APOSTROPHE=6;
	public static final int AT=7;
	public static final int B=8;
	public static final int BACKSLASH=9;
	public static final int C=10;
	public static final int CHAR=11;
	public static final int COLON=12;
	public static final int COMMA=13;
	public static final int CONTROL_CHAR=14;
	public static final int D=15;
	public static final int DIGIT=16;
	public static final int DIV=17;
	public static final int DOLLAR=18;
	public static final int DOT=19;
	public static final int DOUBLE_PIPE=20;
	public static final int E=21;
	public static final int EQUAL1=22;
	public static final int EQUAL2=23;
	public static final int F=24;
	public static final int FUNCTION_AGGREGATION=25;
	public static final int G=26;
	public static final int GREATER_EQUAL1=27;
	public static final int GREATER_EQUAL2=28;
	public static final int GREATER_THAN=29;
	public static final int H=30;
	public static final int HAT=31;
	public static final int I=32;
	public static final int IDENTIFIER=33;
	public static final int IGNORE_CHAR=34;
	public static final int J=35;
	public static final int K=36;
	public static final int KEYWORD_AND=37;
	public static final int KEYWORD_AS=38;
	public static final int KEYWORD_AVG=39;
	public static final int KEYWORD_BEGIN=40;
	public static final int KEYWORD_BY=41;
	public static final int KEYWORD_CALL=42;
	public static final int KEYWORD_CONNECTION=43;
	public static final int KEYWORD_COUNT=44;
	public static final int KEYWORD_CREATE=45;
	public static final int KEYWORD_DATA=46;
	public static final int KEYWORD_DISTINCT=47;
	public static final int KEYWORD_DROP=48;
	public static final int KEYWORD_END=49;
	public static final int KEYWORD_FROM=50;
	public static final int KEYWORD_FUNCTION=51;
	public static final int KEYWORD_GROUP=52;
	public static final int KEYWORD_HAVING=53;
	public static final int KEYWORD_IN=54;
	public static final int KEYWORD_INFILE=55;
	public static final int KEYWORD_INTO=56;
	public static final int KEYWORD_LIKE=57;
	public static final int KEYWORD_LOAD=58;
	public static final int KEYWORD_MAX=59;
	public static final int KEYWORD_MIN=60;
	public static final int KEYWORD_NOT=61;
	public static final int KEYWORD_OR=62;
	public static final int KEYWORD_OUT=63;
	public static final int KEYWORD_PARTITION=64;
	public static final int KEYWORD_PARTITIONED=65;
	public static final int KEYWORD_PASSWD=66;
	public static final int KEYWORD_REFERENCES=67;
	public static final int KEYWORD_REPLICATED=68;
	public static final int KEYWORD_SCHEMA=69;
	public static final int KEYWORD_SELECT=70;
	public static final int KEYWORD_STORE=71;
	public static final int KEYWORD_SUM=72;
	public static final int KEYWORD_TABLE=73;
	public static final int KEYWORD_URL=74;
	public static final int KEYWORD_USER=75;
	public static final int KEYWORD_VAR=76;
	public static final int KEYWORD_WHERE=77;
	public static final int L=78;
	public static final int LBRACKET=79;
	public static final int LESS_EQUAL1=80;
	public static final int LESS_EQUAL2=81;
	public static final int LESS_THAN=82;
	public static final int LITERAL_DECIMAL=83;
	public static final int LITERAL_INTEGER=84;
	public static final int LITERAL_STRING=85;
	public static final int LPAREN=86;
	public static final int M=87;
	public static final int MINUS=88;
	public static final int MOD=89;
	public static final int MULT=90;
	public static final int N=91;
	public static final int NOT_EQUAL1=92;
	public static final int NOT_EQUAL2=93;
	public static final int O=94;
	public static final int P=95;
	public static final int PIPE=96;
	public static final int PLUS=97;
	public static final int Q=98;
	public static final int QUESTION=99;
	public static final int QUOTED_STRING=100;
	public static final int QUOTE_DOUBLE=101;
	public static final int QUOTE_SINGLE=102;
	public static final int QUOTE_TRIPLE=103;
	public static final int R=104;
	public static final int RBRACKET=105;
	public static final int RPAREN=106;
	public static final int S=107;
	public static final int SEMI=108;
	public static final int SHIFT_LEFT=109;
	public static final int SHIFT_RIGHT=110;
	public static final int T=111;
	public static final int TILDE=112;
	public static final int TYPE_DATE=113;
	public static final int TYPE_DECIMAL=114;
	public static final int TYPE_INTEGER=115;
	public static final int TYPE_VARCHAR=116;
	public static final int U=117;
	public static final int UNDERSCORE=118;
	public static final int V=119;
	public static final int W=120;
	public static final int WS=121;
	public static final int X=122;
	public static final int Y=123;
	public static final int Z=124;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public FunSQLParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public FunSQLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
		this.state.ruleMemo = new HashMap[128+1];


	}

	@Override public String[] getTokenNames() { return FunSQLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g"; }


	  @Override
	  protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException {
	    throw new MismatchedTokenException(ttype, input);
	  }

	  @Override
	  public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow) throws RecognitionException {
	    throw e;
	  }



	// $ANTLR start "statement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:95:1: statement returns [AbstractServerStmt stmt] : ( ( createSchemaStatement | dropSchemaStatement | createConnectionStatement | dropConnectionStatement | createTableStatement | dropTableStatement | createFunctionStatement | dropFunctionStatement | callFunctionStatement | selectStatement | loadDataInfileStatement ) ( SEMI )? ) ;
	public final AbstractServerStmt statement() throws RecognitionException {
		AbstractServerStmt stmt = null;

		int statement_StartIndex = input.index();

		ParserRuleReturnScope createSchemaStatement1 =null;
		ParserRuleReturnScope dropSchemaStatement2 =null;
		ParserRuleReturnScope createConnectionStatement3 =null;
		ParserRuleReturnScope dropConnectionStatement4 =null;
		ParserRuleReturnScope createTableStatement5 =null;
		ParserRuleReturnScope dropTableStatement6 =null;
		ParserRuleReturnScope createFunctionStatement7 =null;
		ParserRuleReturnScope dropFunctionStatement8 =null;
		ParserRuleReturnScope callFunctionStatement9 =null;
		ParserRuleReturnScope selectStatement10 =null;
		ParserRuleReturnScope loadDataInfileStatement11 =null;


		        	stmt = null;
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 1) ) { return stmt; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:99:9: ( ( ( createSchemaStatement | dropSchemaStatement | createConnectionStatement | dropConnectionStatement | createTableStatement | dropTableStatement | createFunctionStatement | dropFunctionStatement | callFunctionStatement | selectStatement | loadDataInfileStatement ) ( SEMI )? ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:100:9: ( ( createSchemaStatement | dropSchemaStatement | createConnectionStatement | dropConnectionStatement | createTableStatement | dropTableStatement | createFunctionStatement | dropFunctionStatement | callFunctionStatement | selectStatement | loadDataInfileStatement ) ( SEMI )? )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:100:9: ( ( createSchemaStatement | dropSchemaStatement | createConnectionStatement | dropConnectionStatement | createTableStatement | dropTableStatement | createFunctionStatement | dropFunctionStatement | callFunctionStatement | selectStatement | loadDataInfileStatement ) ( SEMI )? )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:101:10: ( createSchemaStatement | dropSchemaStatement | createConnectionStatement | dropConnectionStatement | createTableStatement | dropTableStatement | createFunctionStatement | dropFunctionStatement | callFunctionStatement | selectStatement | loadDataInfileStatement ) ( SEMI )?
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:101:10: ( createSchemaStatement | dropSchemaStatement | createConnectionStatement | dropConnectionStatement | createTableStatement | dropTableStatement | createFunctionStatement | dropFunctionStatement | callFunctionStatement | selectStatement | loadDataInfileStatement )
			int alt1=11;
			switch ( input.LA(1) ) {
			case KEYWORD_CREATE:
				{
				switch ( input.LA(2) ) {
				case KEYWORD_SCHEMA:
					{
					alt1=1;
					}
					break;
				case KEYWORD_CONNECTION:
					{
					alt1=3;
					}
					break;
				case KEYWORD_TABLE:
					{
					alt1=5;
					}
					break;
				case KEYWORD_FUNCTION:
					{
					alt1=7;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return stmt;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case KEYWORD_DROP:
				{
				switch ( input.LA(2) ) {
				case KEYWORD_SCHEMA:
					{
					alt1=2;
					}
					break;
				case KEYWORD_CONNECTION:
					{
					alt1=4;
					}
					break;
				case KEYWORD_TABLE:
					{
					alt1=6;
					}
					break;
				case KEYWORD_FUNCTION:
					{
					alt1=8;
					}
					break;
				default:
					if (state.backtracking>0) {state.failed=true; return stmt;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case KEYWORD_CALL:
				{
				alt1=9;
				}
				break;
			case KEYWORD_SELECT:
				{
				alt1=10;
				}
				break;
			case KEYWORD_LOAD:
				{
				alt1=11;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return stmt;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:102:17: createSchemaStatement
					{
					pushFollow(FOLLOW_createSchemaStatement_in_statement1106);
					createSchemaStatement1=createSchemaStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (createSchemaStatement1!=null?((FunSQLParser.createSchemaStatement_return)createSchemaStatement1).stmt:null);
					                	stmt.setStmtString((createSchemaStatement1!=null?input.toString(createSchemaStatement1.start,createSchemaStatement1.stop):null));
					                }
					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:108:17: dropSchemaStatement
					{
					pushFollow(FOLLOW_dropSchemaStatement_in_statement1161);
					dropSchemaStatement2=dropSchemaStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (dropSchemaStatement2!=null?((FunSQLParser.dropSchemaStatement_return)dropSchemaStatement2).stmt:null);
					                	stmt.setStmtString((dropSchemaStatement2!=null?input.toString(dropSchemaStatement2.start,dropSchemaStatement2.stop):null));
					                }
					}
					break;
				case 3 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:114:17: createConnectionStatement
					{
					pushFollow(FOLLOW_createConnectionStatement_in_statement1216);
					createConnectionStatement3=createConnectionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (createConnectionStatement3!=null?((FunSQLParser.createConnectionStatement_return)createConnectionStatement3).stmt:null);
					                	stmt.setStmtString((createConnectionStatement3!=null?input.toString(createConnectionStatement3.start,createConnectionStatement3.stop):null));
					                }
					}
					break;
				case 4 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:120:17: dropConnectionStatement
					{
					pushFollow(FOLLOW_dropConnectionStatement_in_statement1271);
					dropConnectionStatement4=dropConnectionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (dropConnectionStatement4!=null?((FunSQLParser.dropConnectionStatement_return)dropConnectionStatement4).stmt:null);
					                	stmt.setStmtString((dropConnectionStatement4!=null?input.toString(dropConnectionStatement4.start,dropConnectionStatement4.stop):null));
					                }
					}
					break;
				case 5 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:126:17: createTableStatement
					{
					pushFollow(FOLLOW_createTableStatement_in_statement1326);
					createTableStatement5=createTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (createTableStatement5!=null?((FunSQLParser.createTableStatement_return)createTableStatement5).stmt:null);
					                	stmt.setStmtString((createTableStatement5!=null?input.toString(createTableStatement5.start,createTableStatement5.stop):null));
					                }
					}
					break;
				case 6 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:132:17: dropTableStatement
					{
					pushFollow(FOLLOW_dropTableStatement_in_statement1381);
					dropTableStatement6=dropTableStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (dropTableStatement6!=null?((FunSQLParser.dropTableStatement_return)dropTableStatement6).stmt:null);
					                	stmt.setStmtString((dropTableStatement6!=null?input.toString(dropTableStatement6.start,dropTableStatement6.stop):null));
					                }
					}
					break;
				case 7 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:138:17: createFunctionStatement
					{
					pushFollow(FOLLOW_createFunctionStatement_in_statement1436);
					createFunctionStatement7=createFunctionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (createFunctionStatement7!=null?((FunSQLParser.createFunctionStatement_return)createFunctionStatement7).stmt:null);
					                	stmt.setStmtString((createFunctionStatement7!=null?input.toString(createFunctionStatement7.start,createFunctionStatement7.stop):null));
					                }
					}
					break;
				case 8 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:144:17: dropFunctionStatement
					{
					pushFollow(FOLLOW_dropFunctionStatement_in_statement1491);
					dropFunctionStatement8=dropFunctionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (dropFunctionStatement8!=null?((FunSQLParser.dropFunctionStatement_return)dropFunctionStatement8).stmt:null);
					                	stmt.setStmtString((dropFunctionStatement8!=null?input.toString(dropFunctionStatement8.start,dropFunctionStatement8.stop):null));
					                }
					}
					break;
				case 9 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:150:17: callFunctionStatement
					{
					pushFollow(FOLLOW_callFunctionStatement_in_statement1546);
					callFunctionStatement9=callFunctionStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (callFunctionStatement9!=null?((FunSQLParser.callFunctionStatement_return)callFunctionStatement9).stmt:null);
					                	stmt.setStmtString((callFunctionStatement9!=null?input.toString(callFunctionStatement9.start,callFunctionStatement9.stop):null));
					                }
					}
					break;
				case 10 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:156:17: selectStatement
					{
					pushFollow(FOLLOW_selectStatement_in_statement1601);
					selectStatement10=selectStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (selectStatement10!=null?((FunSQLParser.selectStatement_return)selectStatement10).stmt:null);
					                	stmt.setStmtString((selectStatement10!=null?input.toString(selectStatement10.start,selectStatement10.stop):null));
					                }
					}
					break;
				case 11 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:162:17: loadDataInfileStatement
					{
					pushFollow(FOLLOW_loadDataInfileStatement_in_statement1655);
					loadDataInfileStatement11=loadDataInfileStatement();
					state._fsp--;
					if (state.failed) return stmt;
					if ( state.backtracking==0 ) {
					                	stmt = (loadDataInfileStatement11!=null?((FunSQLParser.loadDataInfileStatement_return)loadDataInfileStatement11).stmt:null);
					                	stmt.setStmtString((loadDataInfileStatement11!=null?input.toString(loadDataInfileStatement11.start,loadDataInfileStatement11.stop):null));
					                }
					}
					break;

			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:168:17: ( SEMI )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==SEMI) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:168:17: SEMI
					{
					match(input,SEMI,FOLLOW_SEMI_in_statement1709); if (state.failed) return stmt;
					}
					break;

			}

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 1, statement_StartIndex); }

		}
		return stmt;
	}
	// $ANTLR end "statement"


	public static class createSchemaStatement_return extends ParserRuleReturnScope {
		public CreateSchemaStmt stmt;
	};


	// $ANTLR start "createSchemaStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:172:1: createSchemaStatement returns [CreateSchemaStmt stmt] : ( KEYWORD_CREATE KEYWORD_SCHEMA tokenSchema ) ;
	public final FunSQLParser.createSchemaStatement_return createSchemaStatement() throws RecognitionException {
		FunSQLParser.createSchemaStatement_return retval = new FunSQLParser.createSchemaStatement_return();
		retval.start = input.LT(1);
		int createSchemaStatement_StartIndex = input.index();

		TokenSchema tokenSchema12 =null;


		        	retval.stmt = new CreateSchemaStmt();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 2) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:176:9: ( ( KEYWORD_CREATE KEYWORD_SCHEMA tokenSchema ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:177:9: ( KEYWORD_CREATE KEYWORD_SCHEMA tokenSchema )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:177:9: ( KEYWORD_CREATE KEYWORD_SCHEMA tokenSchema )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:178:17: KEYWORD_CREATE KEYWORD_SCHEMA tokenSchema
			{
			match(input,KEYWORD_CREATE,FOLLOW_KEYWORD_CREATE_in_createSchemaStatement1787); if (state.failed) return retval;
			match(input,KEYWORD_SCHEMA,FOLLOW_KEYWORD_SCHEMA_in_createSchemaStatement1805); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenSchema_in_createSchemaStatement1823);
			tokenSchema12=tokenSchema();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setSchema(tokenSchema12);
			                }
			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 2, createSchemaStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "createSchemaStatement"


	public static class dropSchemaStatement_return extends ParserRuleReturnScope {
		public DropSchemaStmt stmt;
	};


	// $ANTLR start "dropSchemaStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:186:1: dropSchemaStatement returns [DropSchemaStmt stmt] : ( KEYWORD_DROP KEYWORD_SCHEMA tokenSchema ) ;
	public final FunSQLParser.dropSchemaStatement_return dropSchemaStatement() throws RecognitionException {
		FunSQLParser.dropSchemaStatement_return retval = new FunSQLParser.dropSchemaStatement_return();
		retval.start = input.LT(1);
		int dropSchemaStatement_StartIndex = input.index();

		TokenSchema tokenSchema13 =null;


		        	retval.stmt = new DropSchemaStmt();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 3) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:190:9: ( ( KEYWORD_DROP KEYWORD_SCHEMA tokenSchema ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:191:9: ( KEYWORD_DROP KEYWORD_SCHEMA tokenSchema )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:191:9: ( KEYWORD_DROP KEYWORD_SCHEMA tokenSchema )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:192:17: KEYWORD_DROP KEYWORD_SCHEMA tokenSchema
			{
			match(input,KEYWORD_DROP,FOLLOW_KEYWORD_DROP_in_dropSchemaStatement1902); if (state.failed) return retval;
			match(input,KEYWORD_SCHEMA,FOLLOW_KEYWORD_SCHEMA_in_dropSchemaStatement1920); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenSchema_in_dropSchemaStatement1938);
			tokenSchema13=tokenSchema();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setSchema(tokenSchema13);
			                }
			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 3, dropSchemaStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "dropSchemaStatement"


	public static class createConnectionStatement_return extends ParserRuleReturnScope {
		public CreateConnectionStmt stmt;
	};


	// $ANTLR start "createConnectionStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:200:1: createConnectionStatement returns [CreateConnectionStmt stmt] : ( KEYWORD_CREATE KEYWORD_CONNECTION tokenIdentifier KEYWORD_URL litURL= tokenStringLiteral KEYWORD_USER litUser= tokenStringLiteral KEYWORD_PASSWD litPasswd= tokenStringLiteral KEYWORD_STORE litStore= tokenStringLiteral ) ;
	public final FunSQLParser.createConnectionStatement_return createConnectionStatement() throws RecognitionException {
		FunSQLParser.createConnectionStatement_return retval = new FunSQLParser.createConnectionStatement_return();
		retval.start = input.LT(1);
		int createConnectionStatement_StartIndex = input.index();

		TokenStringLiteral litURL =null;
		TokenStringLiteral litUser =null;
		TokenStringLiteral litPasswd =null;
		TokenStringLiteral litStore =null;
		TokenIdentifier tokenIdentifier14 =null;


		        	retval.stmt = new CreateConnectionStmt();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 4) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:204:9: ( ( KEYWORD_CREATE KEYWORD_CONNECTION tokenIdentifier KEYWORD_URL litURL= tokenStringLiteral KEYWORD_USER litUser= tokenStringLiteral KEYWORD_PASSWD litPasswd= tokenStringLiteral KEYWORD_STORE litStore= tokenStringLiteral ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:205:9: ( KEYWORD_CREATE KEYWORD_CONNECTION tokenIdentifier KEYWORD_URL litURL= tokenStringLiteral KEYWORD_USER litUser= tokenStringLiteral KEYWORD_PASSWD litPasswd= tokenStringLiteral KEYWORD_STORE litStore= tokenStringLiteral )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:205:9: ( KEYWORD_CREATE KEYWORD_CONNECTION tokenIdentifier KEYWORD_URL litURL= tokenStringLiteral KEYWORD_USER litUser= tokenStringLiteral KEYWORD_PASSWD litPasswd= tokenStringLiteral KEYWORD_STORE litStore= tokenStringLiteral )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:206:17: KEYWORD_CREATE KEYWORD_CONNECTION tokenIdentifier KEYWORD_URL litURL= tokenStringLiteral KEYWORD_USER litUser= tokenStringLiteral KEYWORD_PASSWD litPasswd= tokenStringLiteral KEYWORD_STORE litStore= tokenStringLiteral
			{
			match(input,KEYWORD_CREATE,FOLLOW_KEYWORD_CREATE_in_createConnectionStatement2017); if (state.failed) return retval;
			match(input,KEYWORD_CONNECTION,FOLLOW_KEYWORD_CONNECTION_in_createConnectionStatement2035); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenIdentifier_in_createConnectionStatement2053);
			tokenIdentifier14=tokenIdentifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setConnection(tokenIdentifier14);
			                }
			match(input,KEYWORD_URL,FOLLOW_KEYWORD_URL_in_createConnectionStatement2073); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenStringLiteral_in_createConnectionStatement2093);
			litURL=tokenStringLiteral();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setURL(litURL);
			                }
			match(input,KEYWORD_USER,FOLLOW_KEYWORD_USER_in_createConnectionStatement2113); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenStringLiteral_in_createConnectionStatement2133);
			litUser=tokenStringLiteral();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setUser(litUser);
			                }
			match(input,KEYWORD_PASSWD,FOLLOW_KEYWORD_PASSWD_in_createConnectionStatement2153); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenStringLiteral_in_createConnectionStatement2173);
			litPasswd=tokenStringLiteral();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setPasswd(litPasswd);
			                }
			match(input,KEYWORD_STORE,FOLLOW_KEYWORD_STORE_in_createConnectionStatement2193); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenStringLiteral_in_createConnectionStatement2213);
			litStore=tokenStringLiteral();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setStore(litStore);
			                }
			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 4, createConnectionStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "createConnectionStatement"


	public static class dropConnectionStatement_return extends ParserRuleReturnScope {
		public DropConnectionStmt stmt;
	};


	// $ANTLR start "dropConnectionStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:230:1: dropConnectionStatement returns [DropConnectionStmt stmt] : ( KEYWORD_DROP KEYWORD_CONNECTION tokenIdentifier ) ;
	public final FunSQLParser.dropConnectionStatement_return dropConnectionStatement() throws RecognitionException {
		FunSQLParser.dropConnectionStatement_return retval = new FunSQLParser.dropConnectionStatement_return();
		retval.start = input.LT(1);
		int dropConnectionStatement_StartIndex = input.index();

		TokenIdentifier tokenIdentifier15 =null;


		        	retval.stmt = new DropConnectionStmt();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 5) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:234:9: ( ( KEYWORD_DROP KEYWORD_CONNECTION tokenIdentifier ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:235:9: ( KEYWORD_DROP KEYWORD_CONNECTION tokenIdentifier )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:235:9: ( KEYWORD_DROP KEYWORD_CONNECTION tokenIdentifier )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:236:17: KEYWORD_DROP KEYWORD_CONNECTION tokenIdentifier
			{
			match(input,KEYWORD_DROP,FOLLOW_KEYWORD_DROP_in_dropConnectionStatement2300); if (state.failed) return retval;
			match(input,KEYWORD_CONNECTION,FOLLOW_KEYWORD_CONNECTION_in_dropConnectionStatement2318); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenIdentifier_in_dropConnectionStatement2336);
			tokenIdentifier15=tokenIdentifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setConnection(tokenIdentifier15);
			                }
			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 5, dropConnectionStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "dropConnectionStatement"


	public static class createTableStatement_return extends ParserRuleReturnScope {
		public CreateTableStmt stmt;
	};


	// $ANTLR start "createTableStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:245:1: createTableStatement returns [CreateTableStmt stmt] : ( KEYWORD_CREATE KEYWORD_TABLE table1= tokenTable LPAREN att1= identifierText dataType1= tokenDataType ( COMMA att2= identifierText dataType2= tokenDataType )* RPAREN ( ( KEYWORD_IN KEYWORD_CONNECTION connection1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION connectionR1= tokenIdentifier ( COMMA connectionR2= tokenIdentifier )* ) )? ( KEYWORD_PARTITIONED KEYWORD_BY method= identifierText LPAREN patt1= tokenAttribute ( KEYWORD_REFERENCES ratt1= tokenAttribute )? ( COMMA patt2= tokenAttribute ( KEYWORD_REFERENCES ratt2= tokenAttribute )? )* RPAREN ( LPAREN p1= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) ( COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) )* RPAREN )? )? ) ;
	public final FunSQLParser.createTableStatement_return createTableStatement() throws RecognitionException {
		FunSQLParser.createTableStatement_return retval = new FunSQLParser.createTableStatement_return();
		retval.start = input.LT(1);
		int createTableStatement_StartIndex = input.index();

		TokenTable table1 =null;
		String att1 =null;
		TokenDataType dataType1 =null;
		String att2 =null;
		TokenDataType dataType2 =null;
		TokenIdentifier connection1 =null;
		TokenIdentifier connectionR1 =null;
		TokenIdentifier connectionR2 =null;
		String method =null;
		TokenAttribute patt1 =null;
		TokenAttribute ratt1 =null;
		TokenAttribute patt2 =null;
		TokenAttribute ratt2 =null;
		String p1 =null;
		TokenIdentifier c1 =null;
		TokenIdentifier c2 =null;
		TokenIdentifier c3 =null;
		String p2 =null;


		        	retval.stmt = new CreateTableStmt();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 6) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:249:9: ( ( KEYWORD_CREATE KEYWORD_TABLE table1= tokenTable LPAREN att1= identifierText dataType1= tokenDataType ( COMMA att2= identifierText dataType2= tokenDataType )* RPAREN ( ( KEYWORD_IN KEYWORD_CONNECTION connection1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION connectionR1= tokenIdentifier ( COMMA connectionR2= tokenIdentifier )* ) )? ( KEYWORD_PARTITIONED KEYWORD_BY method= identifierText LPAREN patt1= tokenAttribute ( KEYWORD_REFERENCES ratt1= tokenAttribute )? ( COMMA patt2= tokenAttribute ( KEYWORD_REFERENCES ratt2= tokenAttribute )? )* RPAREN ( LPAREN p1= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) ( COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) )* RPAREN )? )? ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:250:9: ( KEYWORD_CREATE KEYWORD_TABLE table1= tokenTable LPAREN att1= identifierText dataType1= tokenDataType ( COMMA att2= identifierText dataType2= tokenDataType )* RPAREN ( ( KEYWORD_IN KEYWORD_CONNECTION connection1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION connectionR1= tokenIdentifier ( COMMA connectionR2= tokenIdentifier )* ) )? ( KEYWORD_PARTITIONED KEYWORD_BY method= identifierText LPAREN patt1= tokenAttribute ( KEYWORD_REFERENCES ratt1= tokenAttribute )? ( COMMA patt2= tokenAttribute ( KEYWORD_REFERENCES ratt2= tokenAttribute )? )* RPAREN ( LPAREN p1= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) ( COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) )* RPAREN )? )? )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:250:9: ( KEYWORD_CREATE KEYWORD_TABLE table1= tokenTable LPAREN att1= identifierText dataType1= tokenDataType ( COMMA att2= identifierText dataType2= tokenDataType )* RPAREN ( ( KEYWORD_IN KEYWORD_CONNECTION connection1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION connectionR1= tokenIdentifier ( COMMA connectionR2= tokenIdentifier )* ) )? ( KEYWORD_PARTITIONED KEYWORD_BY method= identifierText LPAREN patt1= tokenAttribute ( KEYWORD_REFERENCES ratt1= tokenAttribute )? ( COMMA patt2= tokenAttribute ( KEYWORD_REFERENCES ratt2= tokenAttribute )? )* RPAREN ( LPAREN p1= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) ( COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) )* RPAREN )? )? )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:251:17: KEYWORD_CREATE KEYWORD_TABLE table1= tokenTable LPAREN att1= identifierText dataType1= tokenDataType ( COMMA att2= identifierText dataType2= tokenDataType )* RPAREN ( ( KEYWORD_IN KEYWORD_CONNECTION connection1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION connectionR1= tokenIdentifier ( COMMA connectionR2= tokenIdentifier )* ) )? ( KEYWORD_PARTITIONED KEYWORD_BY method= identifierText LPAREN patt1= tokenAttribute ( KEYWORD_REFERENCES ratt1= tokenAttribute )? ( COMMA patt2= tokenAttribute ( KEYWORD_REFERENCES ratt2= tokenAttribute )? )* RPAREN ( LPAREN p1= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) ( COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) )* RPAREN )? )?
			{
			match(input,KEYWORD_CREATE,FOLLOW_KEYWORD_CREATE_in_createTableStatement2416); if (state.failed) return retval;
			match(input,KEYWORD_TABLE,FOLLOW_KEYWORD_TABLE_in_createTableStatement2434); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenTable_in_createTableStatement2454);
			table1=tokenTable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setTable(table1);
			                }
			match(input,LPAREN,FOLLOW_LPAREN_in_createTableStatement2474); if (state.failed) return retval;
			pushFollow(FOLLOW_identifierText_in_createTableStatement2494);
			att1=identifierText();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.addAttribute(att1);
			                }
			pushFollow(FOLLOW_tokenDataType_in_createTableStatement2532);
			dataType1=tokenDataType();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.addType(dataType1);
			                }
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:265:17: ( COMMA att2= identifierText dataType2= tokenDataType )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:266:17: COMMA att2= identifierText dataType2= tokenDataType
					{
					match(input,COMMA,FOLLOW_COMMA_in_createTableStatement2586); if (state.failed) return retval;
					pushFollow(FOLLOW_identifierText_in_createTableStatement2606);
					att2=identifierText();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                	retval.stmt.addAttribute(att2);
					                }
					pushFollow(FOLLOW_tokenDataType_in_createTableStatement2644);
					dataType2=tokenDataType();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                	retval.stmt.addType(dataType2);
					                }
					}
					break;

				default :
					break loop3;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_createTableStatement2699); if (state.failed) return retval;
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:278:17: ( ( KEYWORD_IN KEYWORD_CONNECTION connection1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION connectionR1= tokenIdentifier ( COMMA connectionR2= tokenIdentifier )* ) )?
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==KEYWORD_IN) ) {
				alt5=1;
			}
			else if ( (LA5_0==KEYWORD_REPLICATED) ) {
				alt5=2;
			}
			switch (alt5) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:279:19: ( KEYWORD_IN KEYWORD_CONNECTION connection1= tokenIdentifier )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:279:19: ( KEYWORD_IN KEYWORD_CONNECTION connection1= tokenIdentifier )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:280:21: KEYWORD_IN KEYWORD_CONNECTION connection1= tokenIdentifier
					{
					match(input,KEYWORD_IN,FOLLOW_KEYWORD_IN_in_createTableStatement2776); if (state.failed) return retval;
					match(input,KEYWORD_CONNECTION,FOLLOW_KEYWORD_CONNECTION_in_createTableStatement2778); if (state.failed) return retval;
					pushFollow(FOLLOW_tokenIdentifier_in_createTableStatement2802);
					connection1=tokenIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                      retval.stmt.addConnection(connection1);
					                    }
					}

					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:286:19: ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION connectionR1= tokenIdentifier ( COMMA connectionR2= tokenIdentifier )* )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:286:19: ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION connectionR1= tokenIdentifier ( COMMA connectionR2= tokenIdentifier )* )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:287:21: KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION connectionR1= tokenIdentifier ( COMMA connectionR2= tokenIdentifier )*
					{
					match(input,KEYWORD_REPLICATED,FOLLOW_KEYWORD_REPLICATED_in_createTableStatement2887); if (state.failed) return retval;
					match(input,KEYWORD_IN,FOLLOW_KEYWORD_IN_in_createTableStatement2889); if (state.failed) return retval;
					match(input,KEYWORD_CONNECTION,FOLLOW_KEYWORD_CONNECTION_in_createTableStatement2891); if (state.failed) return retval;
					pushFollow(FOLLOW_tokenIdentifier_in_createTableStatement2916);
					connectionR1=tokenIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                      retval.stmt.addConnection(connectionR1);
					                    }
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:291:21: ( COMMA connectionR2= tokenIdentifier )*
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:292:23: COMMA connectionR2= tokenIdentifier
							{
							match(input,COMMA,FOLLOW_COMMA_in_createTableStatement2965); if (state.failed) return retval;
							pushFollow(FOLLOW_tokenIdentifier_in_createTableStatement2992);
							connectionR2=tokenIdentifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							                	retval.stmt.addConnection(connectionR2);
							                      }
							}
							break;

						default :
							break loop4;
						}
					}

					}

					}
					break;

			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:302:17: ( KEYWORD_PARTITIONED KEYWORD_BY method= identifierText LPAREN patt1= tokenAttribute ( KEYWORD_REFERENCES ratt1= tokenAttribute )? ( COMMA patt2= tokenAttribute ( KEYWORD_REFERENCES ratt2= tokenAttribute )? )* RPAREN ( LPAREN p1= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) ( COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) )* RPAREN )? )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==KEYWORD_PARTITIONED) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:303:17: KEYWORD_PARTITIONED KEYWORD_BY method= identifierText LPAREN patt1= tokenAttribute ( KEYWORD_REFERENCES ratt1= tokenAttribute )? ( COMMA patt2= tokenAttribute ( KEYWORD_REFERENCES ratt2= tokenAttribute )? )* RPAREN ( LPAREN p1= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) ( COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) )* RPAREN )?
					{
					match(input,KEYWORD_PARTITIONED,FOLLOW_KEYWORD_PARTITIONED_in_createTableStatement3143); if (state.failed) return retval;
					match(input,KEYWORD_BY,FOLLOW_KEYWORD_BY_in_createTableStatement3145); if (state.failed) return retval;
					pushFollow(FOLLOW_identifierText_in_createTableStatement3166);
					method=identifierText();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                	retval.stmt.setPartitionType(method);
					                }
					match(input,LPAREN,FOLLOW_LPAREN_in_createTableStatement3236); if (state.failed) return retval;
					pushFollow(FOLLOW_tokenAttribute_in_createTableStatement3256);
					patt1=tokenAttribute();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                  retval.stmt.addPartitionAttribute(patt1);
					                }
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:314:17: ( KEYWORD_REFERENCES ratt1= tokenAttribute )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==KEYWORD_REFERENCES) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:315:19: KEYWORD_REFERENCES ratt1= tokenAttribute
							{
							match(input,KEYWORD_REFERENCES,FOLLOW_KEYWORD_REFERENCES_in_createTableStatement3295); if (state.failed) return retval;
							pushFollow(FOLLOW_tokenAttribute_in_createTableStatement3299);
							ratt1=tokenAttribute();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							                    retval.stmt.addRefPartitionAttribute(ratt1);
							                  }
							}
							break;

					}

					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:319:17: ( COMMA patt2= tokenAttribute ( KEYWORD_REFERENCES ratt2= tokenAttribute )? )*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==COMMA) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:320:19: COMMA patt2= tokenAttribute ( KEYWORD_REFERENCES ratt2= tokenAttribute )?
							{
							match(input,COMMA,FOLLOW_COMMA_in_createTableStatement3357); if (state.failed) return retval;
							pushFollow(FOLLOW_tokenAttribute_in_createTableStatement3379);
							patt2=tokenAttribute();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							                    retval.stmt.addPartitionAttribute(patt2);
							                  }
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:324:19: ( KEYWORD_REFERENCES ratt2= tokenAttribute )?
							int alt7=2;
							int LA7_0 = input.LA(1);
							if ( (LA7_0==KEYWORD_REFERENCES) ) {
								alt7=1;
							}
							switch (alt7) {
								case 1 :
									// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:325:21: KEYWORD_REFERENCES ratt2= tokenAttribute
									{
									match(input,KEYWORD_REFERENCES,FOLLOW_KEYWORD_REFERENCES_in_createTableStatement3422); if (state.failed) return retval;
									pushFollow(FOLLOW_tokenAttribute_in_createTableStatement3426);
									ratt2=tokenAttribute();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									                      retval.stmt.addRefPartitionAttribute(ratt2);
									                    }
									}
									break;

							}

							}
							break;

						default :
							break loop8;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_createTableStatement3485); if (state.failed) return retval;
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:334:17: ( LPAREN p1= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) ( COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) )* RPAREN )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==LPAREN) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:335:19: LPAREN p1= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) ( COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) )* RPAREN
							{
							match(input,LPAREN,FOLLOW_LPAREN_in_createTableStatement3577); if (state.failed) return retval;
							pushFollow(FOLLOW_identifierText_in_createTableStatement3599);
							p1=identifierText();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							                    retval.stmt.addPartition(p1);
							                  }
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:339:19: ( ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) )
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==KEYWORD_IN) ) {
								alt10=1;
							}
							else if ( (LA10_0==KEYWORD_REPLICATED) ) {
								alt10=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 0, input);
								throw nvae;
							}

							switch (alt10) {
								case 1 :
									// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:341:21: ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier )
									{
									// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:341:21: ( KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier )
									// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:342:23: KEYWORD_IN KEYWORD_CONNECTION c1= tokenIdentifier
									{
									match(input,KEYWORD_IN,FOLLOW_KEYWORD_IN_in_createTableStatement3688); if (state.failed) return retval;
									match(input,KEYWORD_CONNECTION,FOLLOW_KEYWORD_CONNECTION_in_createTableStatement3690); if (state.failed) return retval;
									pushFollow(FOLLOW_tokenIdentifier_in_createTableStatement3716);
									c1=tokenIdentifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									                	retval.stmt.addPConnection(p1,c1);
									                      }
									}

									}
									break;
								case 2 :
									// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:348:21: ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* )
									{
									// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:348:21: ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* )
									// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:349:23: KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )*
									{
									match(input,KEYWORD_REPLICATED,FOLLOW_KEYWORD_REPLICATED_in_createTableStatement3808); if (state.failed) return retval;
									match(input,KEYWORD_IN,FOLLOW_KEYWORD_IN_in_createTableStatement3810); if (state.failed) return retval;
									match(input,KEYWORD_CONNECTION,FOLLOW_KEYWORD_CONNECTION_in_createTableStatement3812); if (state.failed) return retval;
									pushFollow(FOLLOW_tokenIdentifier_in_createTableStatement3838);
									c2=tokenIdentifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									                	retval.stmt.addPConnection(p1,c2);
									                      }
									// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:353:23: ( COMMA c3= tokenIdentifier )*
									loop9:
									while (true) {
										int alt9=2;
										alt9 = dfa9.predict(input);
										switch (alt9) {
										case 1 :
											// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:354:25: COMMA c3= tokenIdentifier
											{
											match(input,COMMA,FOLLOW_COMMA_in_createTableStatement3890); if (state.failed) return retval;
											pushFollow(FOLLOW_tokenIdentifier_in_createTableStatement3919);
											c3=tokenIdentifier();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											                	  retval.stmt.addPConnection(p1,c3);
											                        }
											}
											break;

										default :
											break loop9;
										}
									}

									}

									}
									break;

							}

							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:362:19: ( COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) ) )*
							loop13:
							while (true) {
								int alt13=2;
								int LA13_0 = input.LA(1);
								if ( (LA13_0==COMMA) ) {
									alt13=1;
								}

								switch (alt13) {
								case 1 :
									// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:363:21: COMMA p2= identifierText ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) )
									{
									match(input,COMMA,FOLLOW_COMMA_in_createTableStatement4051); if (state.failed) return retval;
									pushFollow(FOLLOW_identifierText_in_createTableStatement4075);
									p2=identifierText();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									                	retval.stmt.addPartition(p2);
									                    }
									// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:367:21: ( ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ) | ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* ) )
									int alt12=2;
									int LA12_0 = input.LA(1);
									if ( (LA12_0==KEYWORD_IN) ) {
										alt12=1;
									}
									else if ( (LA12_0==KEYWORD_REPLICATED) ) {
										alt12=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										NoViableAltException nvae =
											new NoViableAltException("", 12, 0, input);
										throw nvae;
									}

									switch (alt12) {
										case 1 :
											// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:369:23: ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier )
											{
											// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:369:23: ( KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier )
											// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:370:25: KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier
											{
											match(input,KEYWORD_IN,FOLLOW_KEYWORD_IN_in_createTableStatement4173); if (state.failed) return retval;
											match(input,KEYWORD_CONNECTION,FOLLOW_KEYWORD_CONNECTION_in_createTableStatement4175); if (state.failed) return retval;
											pushFollow(FOLLOW_tokenIdentifier_in_createTableStatement4203);
											c2=tokenIdentifier();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											                	  retval.stmt.addPConnection(p2,c2);
											                        }
											}

											}
											break;
										case 2 :
											// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:376:23: ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* )
											{
											// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:376:23: ( KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )* )
											// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:377:25: KEYWORD_REPLICATED KEYWORD_IN KEYWORD_CONNECTION c2= tokenIdentifier ( COMMA c3= tokenIdentifier )*
											{
											match(input,KEYWORD_REPLICATED,FOLLOW_KEYWORD_REPLICATED_in_createTableStatement4303); if (state.failed) return retval;
											match(input,KEYWORD_IN,FOLLOW_KEYWORD_IN_in_createTableStatement4305); if (state.failed) return retval;
											match(input,KEYWORD_CONNECTION,FOLLOW_KEYWORD_CONNECTION_in_createTableStatement4307); if (state.failed) return retval;
											pushFollow(FOLLOW_tokenIdentifier_in_createTableStatement4335);
											c2=tokenIdentifier();
											state._fsp--;
											if (state.failed) return retval;
											if ( state.backtracking==0 ) {
											                	  retval.stmt.addPConnection(p2,c2);
											                        }
											// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:381:25: ( COMMA c3= tokenIdentifier )*
											loop11:
											while (true) {
												int alt11=2;
												alt11 = dfa11.predict(input);
												switch (alt11) {
												case 1 :
													// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:382:27: COMMA c3= tokenIdentifier
													{
													match(input,COMMA,FOLLOW_COMMA_in_createTableStatement4391); if (state.failed) return retval;
													pushFollow(FOLLOW_tokenIdentifier_in_createTableStatement4423);
													c3=tokenIdentifier();
													state._fsp--;
													if (state.failed) return retval;
													if ( state.backtracking==0 ) {
													                	    retval.stmt.addPConnection(p2,c3);
													                          }
													}
													break;

												default :
													break loop11;
												}
											}

											}

											}
											break;

									}

									}
									break;

								default :
									break loop13;
								}
							}

							match(input,RPAREN,FOLLOW_RPAREN_in_createTableStatement4562); if (state.failed) return retval;
							}
							break;

					}

					}
					break;

			}

			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 6, createTableStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "createTableStatement"


	public static class dropTableStatement_return extends ParserRuleReturnScope {
		public DropTableStmt stmt;
	};


	// $ANTLR start "dropTableStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:400:1: dropTableStatement returns [DropTableStmt stmt] : ( KEYWORD_DROP KEYWORD_TABLE table1= tokenTable ) ;
	public final FunSQLParser.dropTableStatement_return dropTableStatement() throws RecognitionException {
		FunSQLParser.dropTableStatement_return retval = new FunSQLParser.dropTableStatement_return();
		retval.start = input.LT(1);
		int dropTableStatement_StartIndex = input.index();

		TokenTable table1 =null;


		        	retval.stmt = new DropTableStmt();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 7) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:404:9: ( ( KEYWORD_DROP KEYWORD_TABLE table1= tokenTable ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:405:9: ( KEYWORD_DROP KEYWORD_TABLE table1= tokenTable )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:405:9: ( KEYWORD_DROP KEYWORD_TABLE table1= tokenTable )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:406:17: KEYWORD_DROP KEYWORD_TABLE table1= tokenTable
			{
			match(input,KEYWORD_DROP,FOLLOW_KEYWORD_DROP_in_dropTableStatement4708); if (state.failed) return retval;
			match(input,KEYWORD_TABLE,FOLLOW_KEYWORD_TABLE_in_dropTableStatement4726); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenTable_in_dropTableStatement4746);
			table1=tokenTable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setTable(table1);
			                }
			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 7, dropTableStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "dropTableStatement"


	public static class createFunctionStatement_return extends ParserRuleReturnScope {
		public CreateFunctionStmt stmt;
	};


	// $ANTLR start "createFunctionStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:414:1: createFunctionStatement returns [CreateFunctionStmt stmt] : ( KEYWORD_CREATE KEYWORD_FUNCTION function1= tokenFunction LPAREN ( KEYWORD_IN var1= tokenVariable KEYWORD_TABLE COMMA )* ( KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE ) ( COMMA KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE )* RPAREN KEYWORD_BEGIN ( (ass1= tokenAssignment ) | (call1= tokenFunctionCall ) )* KEYWORD_END SEMI ) ;
	public final FunSQLParser.createFunctionStatement_return createFunctionStatement() throws RecognitionException {
		FunSQLParser.createFunctionStatement_return retval = new FunSQLParser.createFunctionStatement_return();
		retval.start = input.LT(1);
		int createFunctionStatement_StartIndex = input.index();

		TokenFunction function1 =null;
		TokenVariable var1 =null;
		TokenVariable var2 =null;
		TokenAssignment ass1 =null;
		TokenFunctionCall call1 =null;


		        	retval.stmt = new CreateFunctionStmt();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 8) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:418:9: ( ( KEYWORD_CREATE KEYWORD_FUNCTION function1= tokenFunction LPAREN ( KEYWORD_IN var1= tokenVariable KEYWORD_TABLE COMMA )* ( KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE ) ( COMMA KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE )* RPAREN KEYWORD_BEGIN ( (ass1= tokenAssignment ) | (call1= tokenFunctionCall ) )* KEYWORD_END SEMI ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:419:9: ( KEYWORD_CREATE KEYWORD_FUNCTION function1= tokenFunction LPAREN ( KEYWORD_IN var1= tokenVariable KEYWORD_TABLE COMMA )* ( KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE ) ( COMMA KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE )* RPAREN KEYWORD_BEGIN ( (ass1= tokenAssignment ) | (call1= tokenFunctionCall ) )* KEYWORD_END SEMI )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:419:9: ( KEYWORD_CREATE KEYWORD_FUNCTION function1= tokenFunction LPAREN ( KEYWORD_IN var1= tokenVariable KEYWORD_TABLE COMMA )* ( KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE ) ( COMMA KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE )* RPAREN KEYWORD_BEGIN ( (ass1= tokenAssignment ) | (call1= tokenFunctionCall ) )* KEYWORD_END SEMI )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:420:17: KEYWORD_CREATE KEYWORD_FUNCTION function1= tokenFunction LPAREN ( KEYWORD_IN var1= tokenVariable KEYWORD_TABLE COMMA )* ( KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE ) ( COMMA KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE )* RPAREN KEYWORD_BEGIN ( (ass1= tokenAssignment ) | (call1= tokenFunctionCall ) )* KEYWORD_END SEMI
			{
			match(input,KEYWORD_CREATE,FOLLOW_KEYWORD_CREATE_in_createFunctionStatement4812); if (state.failed) return retval;
			match(input,KEYWORD_FUNCTION,FOLLOW_KEYWORD_FUNCTION_in_createFunctionStatement4830); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenFunction_in_createFunctionStatement4850);
			function1=tokenFunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setFunction(function1);
			                }
			match(input,LPAREN,FOLLOW_LPAREN_in_createFunctionStatement4866); if (state.failed) return retval;
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:426:10: ( KEYWORD_IN var1= tokenVariable KEYWORD_TABLE COMMA )*
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( (LA16_0==KEYWORD_IN) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:427:17: KEYWORD_IN var1= tokenVariable KEYWORD_TABLE COMMA
					{
					match(input,KEYWORD_IN,FOLLOW_KEYWORD_IN_in_createFunctionStatement4895); if (state.failed) return retval;
					pushFollow(FOLLOW_tokenVariable_in_createFunctionStatement4915);
					var1=tokenVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					               		retval.stmt.addInParam(var1);
									}
					match(input,KEYWORD_TABLE,FOLLOW_KEYWORD_TABLE_in_createFunctionStatement4922); if (state.failed) return retval;
					match(input,COMMA,FOLLOW_COMMA_in_createFunctionStatement4928); if (state.failed) return retval;
					}
					break;

				default :
					break loop16;
				}
			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:434:3: ( KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:435:17: KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE
			{
			match(input,KEYWORD_OUT,FOLLOW_KEYWORD_OUT_in_createFunctionStatement4966); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenVariable_in_createFunctionStatement4986);
			var2=tokenVariable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			               		retval.stmt.addOutParam(var2);
							}
			match(input,KEYWORD_TABLE,FOLLOW_KEYWORD_TABLE_in_createFunctionStatement4993); if (state.failed) return retval;
			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:441:3: ( COMMA KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==COMMA) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:442:4: COMMA KEYWORD_OUT var2= tokenVariable KEYWORD_TABLE
					{
					match(input,COMMA,FOLLOW_COMMA_in_createFunctionStatement5006); if (state.failed) return retval;
					match(input,KEYWORD_OUT,FOLLOW_KEYWORD_OUT_in_createFunctionStatement5011); if (state.failed) return retval;
					pushFollow(FOLLOW_tokenVariable_in_createFunctionStatement5025);
					var2=tokenVariable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					           		retval.stmt.addOutParam(var2);
								}
					match(input,KEYWORD_TABLE,FOLLOW_KEYWORD_TABLE_in_createFunctionStatement5031); if (state.failed) return retval;
					}
					break;

				default :
					break loop17;
				}
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_createFunctionStatement5040); if (state.failed) return retval;
			match(input,KEYWORD_BEGIN,FOLLOW_KEYWORD_BEGIN_in_createFunctionStatement5044); if (state.failed) return retval;
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:451:3: ( (ass1= tokenAssignment ) | (call1= tokenFunctionCall ) )*
			loop18:
			while (true) {
				int alt18=3;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==COLON||LA18_0==KEYWORD_VAR) ) {
					alt18=1;
				}
				else if ( (LA18_0==KEYWORD_CALL) ) {
					alt18=2;
				}

				switch (alt18) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:452:3: (ass1= tokenAssignment )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:452:3: (ass1= tokenAssignment )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:453:3: ass1= tokenAssignment
					{
					pushFollow(FOLLOW_tokenAssignment_in_createFunctionStatement5058);
					ass1=tokenAssignment();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                	retval.stmt.addAssignment(ass1.getVar(), ass1.getSelStmt());
					                	retval.stmt.addAssignment(ass1);
					                }
					}

					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:459:17: (call1= tokenFunctionCall )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:459:17: (call1= tokenFunctionCall )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:460:17: call1= tokenFunctionCall
					{
					pushFollow(FOLLOW_tokenFunctionCall_in_createFunctionStatement5137);
					call1=tokenFunctionCall();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                	retval.stmt.addFunctionCall(call1);                	
					                }
					}

					}
					break;

				default :
					break loop18;
				}
			}

			match(input,KEYWORD_END,FOLLOW_KEYWORD_END_in_createFunctionStatement5179); if (state.failed) return retval;
			match(input,SEMI,FOLLOW_SEMI_in_createFunctionStatement5186); if (state.failed) return retval;
			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 8, createFunctionStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "createFunctionStatement"


	public static class dropFunctionStatement_return extends ParserRuleReturnScope {
		public DropFunctionStmt stmt;
	};


	// $ANTLR start "dropFunctionStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:470:1: dropFunctionStatement returns [DropFunctionStmt stmt] : ( KEYWORD_DROP KEYWORD_FUNCTION fun1= tokenFunction ) ;
	public final FunSQLParser.dropFunctionStatement_return dropFunctionStatement() throws RecognitionException {
		FunSQLParser.dropFunctionStatement_return retval = new FunSQLParser.dropFunctionStatement_return();
		retval.start = input.LT(1);
		int dropFunctionStatement_StartIndex = input.index();

		TokenFunction fun1 =null;


		        	retval.stmt = new DropFunctionStmt();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 9) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:474:9: ( ( KEYWORD_DROP KEYWORD_FUNCTION fun1= tokenFunction ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:475:9: ( KEYWORD_DROP KEYWORD_FUNCTION fun1= tokenFunction )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:475:9: ( KEYWORD_DROP KEYWORD_FUNCTION fun1= tokenFunction )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:476:17: KEYWORD_DROP KEYWORD_FUNCTION fun1= tokenFunction
			{
			match(input,KEYWORD_DROP,FOLLOW_KEYWORD_DROP_in_dropFunctionStatement5263); if (state.failed) return retval;
			match(input,KEYWORD_FUNCTION,FOLLOW_KEYWORD_FUNCTION_in_dropFunctionStatement5281); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenFunction_in_dropFunctionStatement5301);
			fun1=tokenFunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setFunction(fun1);
			                }
			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 9, dropFunctionStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "dropFunctionStatement"


	public static class callFunctionStatement_return extends ParserRuleReturnScope {
		public CallFunctionStmt stmt;
	};


	// $ANTLR start "callFunctionStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:484:1: callFunctionStatement returns [CallFunctionStmt stmt] : ( KEYWORD_CALL KEYWORD_FUNCTION fun1= tokenFunction ) ;
	public final FunSQLParser.callFunctionStatement_return callFunctionStatement() throws RecognitionException {
		FunSQLParser.callFunctionStatement_return retval = new FunSQLParser.callFunctionStatement_return();
		retval.start = input.LT(1);
		int callFunctionStatement_StartIndex = input.index();

		TokenFunction fun1 =null;


		        	retval.stmt = new CallFunctionStmt();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 10) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:488:9: ( ( KEYWORD_CALL KEYWORD_FUNCTION fun1= tokenFunction ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:489:9: ( KEYWORD_CALL KEYWORD_FUNCTION fun1= tokenFunction )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:489:9: ( KEYWORD_CALL KEYWORD_FUNCTION fun1= tokenFunction )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:490:17: KEYWORD_CALL KEYWORD_FUNCTION fun1= tokenFunction
			{
			match(input,KEYWORD_CALL,FOLLOW_KEYWORD_CALL_in_callFunctionStatement5367); if (state.failed) return retval;
			match(input,KEYWORD_FUNCTION,FOLLOW_KEYWORD_FUNCTION_in_callFunctionStatement5385); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenFunction_in_callFunctionStatement5405);
			fun1=tokenFunction();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setFunction(fun1);
			                }
			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 10, callFunctionStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "callFunctionStatement"


	public static class selectStatement_return extends ParserRuleReturnScope {
		public SelectStmt stmt;
	};


	// $ANTLR start "selectStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:498:1: selectStatement returns [SelectStmt stmt] : ( KEYWORD_SELECT selExpr1= abstractExpression ( KEYWORD_AS selAlias1= tokenIdentifier )? ( COMMA selExpr2= abstractExpression ( KEYWORD_AS selAlias2= tokenIdentifier )? )* KEYWORD_FROM table1= tokenTable ( KEYWORD_AS tableAlias1= tokenIdentifier )? ( COMMA table2= tokenTable ( KEYWORD_AS tableAlias2= tokenIdentifier )? )* ( KEYWORD_WHERE predicate1= abstractPredicate )? ( KEYWORD_GROUP KEYWORD_BY groupExpr1= abstractExpression ( COMMA groupExpr2= abstractExpression )* )? ( KEYWORD_HAVING havingPred= abstractPredicate )? ) ;
	public final FunSQLParser.selectStatement_return selectStatement() throws RecognitionException {
		FunSQLParser.selectStatement_return retval = new FunSQLParser.selectStatement_return();
		retval.start = input.LT(1);
		int selectStatement_StartIndex = input.index();

		AbstractExpression selExpr1 =null;
		TokenIdentifier selAlias1 =null;
		AbstractExpression selExpr2 =null;
		TokenIdentifier selAlias2 =null;
		TokenTable table1 =null;
		TokenIdentifier tableAlias1 =null;
		TokenTable table2 =null;
		TokenIdentifier tableAlias2 =null;
		AbstractPredicate predicate1 =null;
		AbstractExpression groupExpr1 =null;
		AbstractExpression groupExpr2 =null;
		AbstractPredicate havingPred =null;


		        	retval.stmt = new SelectStmt();
		        	int i=0;
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 11) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:503:9: ( ( KEYWORD_SELECT selExpr1= abstractExpression ( KEYWORD_AS selAlias1= tokenIdentifier )? ( COMMA selExpr2= abstractExpression ( KEYWORD_AS selAlias2= tokenIdentifier )? )* KEYWORD_FROM table1= tokenTable ( KEYWORD_AS tableAlias1= tokenIdentifier )? ( COMMA table2= tokenTable ( KEYWORD_AS tableAlias2= tokenIdentifier )? )* ( KEYWORD_WHERE predicate1= abstractPredicate )? ( KEYWORD_GROUP KEYWORD_BY groupExpr1= abstractExpression ( COMMA groupExpr2= abstractExpression )* )? ( KEYWORD_HAVING havingPred= abstractPredicate )? ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:504:9: ( KEYWORD_SELECT selExpr1= abstractExpression ( KEYWORD_AS selAlias1= tokenIdentifier )? ( COMMA selExpr2= abstractExpression ( KEYWORD_AS selAlias2= tokenIdentifier )? )* KEYWORD_FROM table1= tokenTable ( KEYWORD_AS tableAlias1= tokenIdentifier )? ( COMMA table2= tokenTable ( KEYWORD_AS tableAlias2= tokenIdentifier )? )* ( KEYWORD_WHERE predicate1= abstractPredicate )? ( KEYWORD_GROUP KEYWORD_BY groupExpr1= abstractExpression ( COMMA groupExpr2= abstractExpression )* )? ( KEYWORD_HAVING havingPred= abstractPredicate )? )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:504:9: ( KEYWORD_SELECT selExpr1= abstractExpression ( KEYWORD_AS selAlias1= tokenIdentifier )? ( COMMA selExpr2= abstractExpression ( KEYWORD_AS selAlias2= tokenIdentifier )? )* KEYWORD_FROM table1= tokenTable ( KEYWORD_AS tableAlias1= tokenIdentifier )? ( COMMA table2= tokenTable ( KEYWORD_AS tableAlias2= tokenIdentifier )? )* ( KEYWORD_WHERE predicate1= abstractPredicate )? ( KEYWORD_GROUP KEYWORD_BY groupExpr1= abstractExpression ( COMMA groupExpr2= abstractExpression )* )? ( KEYWORD_HAVING havingPred= abstractPredicate )? )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:506:17: KEYWORD_SELECT selExpr1= abstractExpression ( KEYWORD_AS selAlias1= tokenIdentifier )? ( COMMA selExpr2= abstractExpression ( KEYWORD_AS selAlias2= tokenIdentifier )? )* KEYWORD_FROM table1= tokenTable ( KEYWORD_AS tableAlias1= tokenIdentifier )? ( COMMA table2= tokenTable ( KEYWORD_AS tableAlias2= tokenIdentifier )? )* ( KEYWORD_WHERE predicate1= abstractPredicate )? ( KEYWORD_GROUP KEYWORD_BY groupExpr1= abstractExpression ( COMMA groupExpr2= abstractExpression )* )? ( KEYWORD_HAVING havingPred= abstractPredicate )?
			{
			match(input,KEYWORD_SELECT,FOLLOW_KEYWORD_SELECT_in_selectStatement5482); if (state.failed) return retval;
			pushFollow(FOLLOW_abstractExpression_in_selectStatement5502);
			selExpr1=abstractExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.addSelExpression(selExpr1);
			                	++i;
			                }
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:512:17: ( KEYWORD_AS selAlias1= tokenIdentifier )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==KEYWORD_AS) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:513:18: KEYWORD_AS selAlias1= tokenIdentifier
					{
					match(input,KEYWORD_AS,FOLLOW_KEYWORD_AS_in_selectStatement5557); if (state.failed) return retval;
					pushFollow(FOLLOW_tokenIdentifier_in_selectStatement5578);
					selAlias1=tokenIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                		retval.stmt.setSelAlias(i-1, selAlias1);
					                	}
					}
					break;

			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:519:17: ( COMMA selExpr2= abstractExpression ( KEYWORD_AS selAlias2= tokenIdentifier )? )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:520:17: COMMA selExpr2= abstractExpression ( KEYWORD_AS selAlias2= tokenIdentifier )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_selectStatement5652); if (state.failed) return retval;
					pushFollow(FOLLOW_abstractExpression_in_selectStatement5672);
					selExpr2=abstractExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                	retval.stmt.addSelExpression(selExpr2);
					                	++i;
					                }
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:526:17: ( KEYWORD_AS selAlias2= tokenIdentifier )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==KEYWORD_AS) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:527:18: KEYWORD_AS selAlias2= tokenIdentifier
							{
							match(input,KEYWORD_AS,FOLLOW_KEYWORD_AS_in_selectStatement5727); if (state.failed) return retval;
							pushFollow(FOLLOW_tokenIdentifier_in_selectStatement5748);
							selAlias2=tokenIdentifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							                		retval.stmt.setSelAlias(i-1, selAlias2);
							                	}
							}
							break;

					}

					}
					break;

				default :
					break loop21;
				}
			}

			match(input,KEYWORD_FROM,FOLLOW_KEYWORD_FROM_in_selectStatement5857); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenTable_in_selectStatement5877);
			table1=tokenTable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.addTable(table1);
			                	i=1;
			                }
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:542:17: ( KEYWORD_AS tableAlias1= tokenIdentifier )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==KEYWORD_AS) ) {
				alt22=1;
			}
			switch (alt22) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:543:18: KEYWORD_AS tableAlias1= tokenIdentifier
					{
					match(input,KEYWORD_AS,FOLLOW_KEYWORD_AS_in_selectStatement5933); if (state.failed) return retval;
					pushFollow(FOLLOW_tokenIdentifier_in_selectStatement5954);
					tableAlias1=tokenIdentifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                		retval.stmt.setTableAlias(i-1, tableAlias1);
					                	}
					}
					break;

			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:549:17: ( COMMA table2= tokenTable ( KEYWORD_AS tableAlias2= tokenIdentifier )? )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==COMMA) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:550:17: COMMA table2= tokenTable ( KEYWORD_AS tableAlias2= tokenIdentifier )?
					{
					match(input,COMMA,FOLLOW_COMMA_in_selectStatement6028); if (state.failed) return retval;
					pushFollow(FOLLOW_tokenTable_in_selectStatement6048);
					table2=tokenTable();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                	retval.stmt.addTable(table2);
					                	++i;
					                }
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:556:17: ( KEYWORD_AS tableAlias2= tokenIdentifier )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==KEYWORD_AS) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:557:18: KEYWORD_AS tableAlias2= tokenIdentifier
							{
							match(input,KEYWORD_AS,FOLLOW_KEYWORD_AS_in_selectStatement6103); if (state.failed) return retval;
							pushFollow(FOLLOW_tokenIdentifier_in_selectStatement6124);
							tableAlias2=tokenIdentifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							                		retval.stmt.setTableAlias(i-1, tableAlias2);
							                	}
							}
							break;

					}

					}
					break;

				default :
					break loop24;
				}
			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:565:17: ( KEYWORD_WHERE predicate1= abstractPredicate )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==KEYWORD_WHERE) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:566:17: KEYWORD_WHERE predicate1= abstractPredicate
					{
					match(input,KEYWORD_WHERE,FOLLOW_KEYWORD_WHERE_in_selectStatement6234); if (state.failed) return retval;
					pushFollow(FOLLOW_abstractPredicate_in_selectStatement6254);
					predicate1=abstractPredicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                	retval.stmt.setWherePredicate(predicate1);
					                }
					}
					break;

			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:574:17: ( KEYWORD_GROUP KEYWORD_BY groupExpr1= abstractExpression ( COMMA groupExpr2= abstractExpression )* )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==KEYWORD_GROUP) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:575:17: KEYWORD_GROUP KEYWORD_BY groupExpr1= abstractExpression ( COMMA groupExpr2= abstractExpression )*
					{
					match(input,KEYWORD_GROUP,FOLLOW_KEYWORD_GROUP_in_selectStatement6361); if (state.failed) return retval;
					match(input,KEYWORD_BY,FOLLOW_KEYWORD_BY_in_selectStatement6363); if (state.failed) return retval;
					pushFollow(FOLLOW_abstractExpression_in_selectStatement6383);
					groupExpr1=abstractExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                	retval.stmt.addGroupExpression(groupExpr1);
					                	++i;
					                }
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:581:17: ( COMMA groupExpr2= abstractExpression )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==COMMA) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:582:17: COMMA groupExpr2= abstractExpression
							{
							match(input,COMMA,FOLLOW_COMMA_in_selectStatement6437); if (state.failed) return retval;
							pushFollow(FOLLOW_abstractExpression_in_selectStatement6457);
							groupExpr2=abstractExpression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							                	retval.stmt.addGroupExpression(groupExpr2);
							                	++i;
							                }
							}
							break;

						default :
							break loop26;
						}
					}

					}
					break;

			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:592:17: ( KEYWORD_HAVING havingPred= abstractPredicate )?
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==KEYWORD_HAVING) ) {
				alt28=1;
			}
			switch (alt28) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:593:17: KEYWORD_HAVING havingPred= abstractPredicate
					{
					match(input,KEYWORD_HAVING,FOLLOW_KEYWORD_HAVING_in_selectStatement6583); if (state.failed) return retval;
					pushFollow(FOLLOW_abstractPredicate_in_selectStatement6603);
					havingPred=abstractPredicate();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					                	retval.stmt.setHavingPredicate(havingPred);
					                }
					}
					break;

			}

			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 11, selectStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "selectStatement"


	public static class loadDataInfileStatement_return extends ParserRuleReturnScope {
		public LoadDataInfileStmt stmt;
	};


	// $ANTLR start "loadDataInfileStatement"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:602:1: loadDataInfileStatement returns [LoadDataInfileStmt stmt] : ( KEYWORD_LOAD KEYWORD_DATA KEYWORD_INFILE filename1= identifierText KEYWORD_INTO KEYWORD_TABLE table1= tokenTable ( KEYWORD_PARTITION LPAREN partition1= identifierText ( COMMA partition2= identifierText )* RPAREN )? ) ;
	public final FunSQLParser.loadDataInfileStatement_return loadDataInfileStatement() throws RecognitionException {
		FunSQLParser.loadDataInfileStatement_return retval = new FunSQLParser.loadDataInfileStatement_return();
		retval.start = input.LT(1);
		int loadDataInfileStatement_StartIndex = input.index();

		String filename1 =null;
		TokenTable table1 =null;
		String partition1 =null;
		String partition2 =null;


		        	retval.stmt = new LoadDataInfileStmt();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 12) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:606:9: ( ( KEYWORD_LOAD KEYWORD_DATA KEYWORD_INFILE filename1= identifierText KEYWORD_INTO KEYWORD_TABLE table1= tokenTable ( KEYWORD_PARTITION LPAREN partition1= identifierText ( COMMA partition2= identifierText )* RPAREN )? ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:607:9: ( KEYWORD_LOAD KEYWORD_DATA KEYWORD_INFILE filename1= identifierText KEYWORD_INTO KEYWORD_TABLE table1= tokenTable ( KEYWORD_PARTITION LPAREN partition1= identifierText ( COMMA partition2= identifierText )* RPAREN )? )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:607:9: ( KEYWORD_LOAD KEYWORD_DATA KEYWORD_INFILE filename1= identifierText KEYWORD_INTO KEYWORD_TABLE table1= tokenTable ( KEYWORD_PARTITION LPAREN partition1= identifierText ( COMMA partition2= identifierText )* RPAREN )? )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:608:9: KEYWORD_LOAD KEYWORD_DATA KEYWORD_INFILE filename1= identifierText KEYWORD_INTO KEYWORD_TABLE table1= tokenTable ( KEYWORD_PARTITION LPAREN partition1= identifierText ( COMMA partition2= identifierText )* RPAREN )?
			{
			match(input,KEYWORD_LOAD,FOLLOW_KEYWORD_LOAD_in_loadDataInfileStatement6696); if (state.failed) return retval;
			match(input,KEYWORD_DATA,FOLLOW_KEYWORD_DATA_in_loadDataInfileStatement6706); if (state.failed) return retval;
			match(input,KEYWORD_INFILE,FOLLOW_KEYWORD_INFILE_in_loadDataInfileStatement6716); if (state.failed) return retval;
			pushFollow(FOLLOW_identifierText_in_loadDataInfileStatement6728);
			filename1=identifierText();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setTokenFilename(filename1);
			                }
			match(input,KEYWORD_INTO,FOLLOW_KEYWORD_INTO_in_loadDataInfileStatement6740); if (state.failed) return retval;
			match(input,KEYWORD_TABLE,FOLLOW_KEYWORD_TABLE_in_loadDataInfileStatement6750); if (state.failed) return retval;
			pushFollow(FOLLOW_tokenTable_in_loadDataInfileStatement6762);
			table1=tokenTable();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			                	retval.stmt.setTokenTable(table1);
			                }
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:619:9: ( KEYWORD_PARTITION LPAREN partition1= identifierText ( COMMA partition2= identifierText )* RPAREN )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==KEYWORD_PARTITION) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:620:10: KEYWORD_PARTITION LPAREN partition1= identifierText ( COMMA partition2= identifierText )* RPAREN
					{
					match(input,KEYWORD_PARTITION,FOLLOW_KEYWORD_PARTITION_in_loadDataInfileStatement6785); if (state.failed) return retval;
					match(input,LPAREN,FOLLOW_LPAREN_in_loadDataInfileStatement6796); if (state.failed) return retval;
					pushFollow(FOLLOW_identifierText_in_loadDataInfileStatement6809);
					partition1=identifierText();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					        			retval.stmt.setTokenPartition(partition1);
								}
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:625:10: ( COMMA partition2= identifierText )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0==COMMA) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:626:11: COMMA partition2= identifierText
							{
							match(input,COMMA,FOLLOW_COMMA_in_loadDataInfileStatement6834); if (state.failed) return retval;
							pushFollow(FOLLOW_identifierText_in_loadDataInfileStatement6848);
							partition2=identifierText();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) {
								        			retval.stmt.setTokenPartition(partition2);
											}
							}
							break;

						default :
							break loop29;
						}
					}

					match(input,RPAREN,FOLLOW_RPAREN_in_loadDataInfileStatement6873); if (state.failed) return retval;
					}
					break;

			}

			}

			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 12, loadDataInfileStatement_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "loadDataInfileStatement"



	// $ANTLR start "abstractPredicate"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:636:1: abstractPredicate returns [AbstractPredicate predicate] : predicate1= complexPredicateOr ;
	public final AbstractPredicate abstractPredicate() throws RecognitionException {
		AbstractPredicate predicate = null;

		int abstractPredicate_StartIndex = input.index();

		ComplexPredicate predicate1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 13) ) { return predicate; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:637:2: (predicate1= complexPredicateOr )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:638:3: predicate1= complexPredicateOr
			{
			pushFollow(FOLLOW_complexPredicateOr_in_abstractPredicate6914);
			predicate1=complexPredicateOr();
			state._fsp--;
			if (state.failed) return predicate;
			if ( state.backtracking==0 ) {
						predicate = predicate1;
					}
			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 13, abstractPredicate_StartIndex); }

		}
		return predicate;
	}
	// $ANTLR end "abstractPredicate"



	// $ANTLR start "complexPredicateOr"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:643:1: complexPredicateOr returns [ComplexPredicate predicateOr] : (predicate1= complexPredicateAnd ( KEYWORD_OR predicate2= complexPredicateAnd )* ) ;
	public final ComplexPredicate complexPredicateOr() throws RecognitionException {
		ComplexPredicate predicateOr = null;

		int complexPredicateOr_StartIndex = input.index();

		ComplexPredicate predicate1 =null;
		ComplexPredicate predicate2 =null;


		        	predicateOr = new ComplexPredicate(EnumPredicateType.OR_PREDICATE);
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 14) ) { return predicateOr; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:647:2: ( (predicate1= complexPredicateAnd ( KEYWORD_OR predicate2= complexPredicateAnd )* ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:648:2: (predicate1= complexPredicateAnd ( KEYWORD_OR predicate2= complexPredicateAnd )* )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:648:2: (predicate1= complexPredicateAnd ( KEYWORD_OR predicate2= complexPredicateAnd )* )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:649:3: predicate1= complexPredicateAnd ( KEYWORD_OR predicate2= complexPredicateAnd )*
			{
			pushFollow(FOLLOW_complexPredicateAnd_in_complexPredicateOr6952);
			predicate1=complexPredicateAnd();
			state._fsp--;
			if (state.failed) return predicateOr;
			if ( state.backtracking==0 ) {
						predicateOr.setPredicate1(predicate1);
					}
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:652:3: ( KEYWORD_OR predicate2= complexPredicateAnd )*
			loop31:
			while (true) {
				int alt31=2;
				int LA31_0 = input.LA(1);
				if ( (LA31_0==KEYWORD_OR) ) {
					alt31=1;
				}

				switch (alt31) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:653:4: KEYWORD_OR predicate2= complexPredicateAnd
					{
					match(input,KEYWORD_OR,FOLLOW_KEYWORD_OR_in_complexPredicateOr6963); if (state.failed) return predicateOr;
					if ( state.backtracking==0 ) {
									predicateOr.addOr();
								}
					pushFollow(FOLLOW_complexPredicateAnd_in_complexPredicateOr6971);
					predicate2=complexPredicateAnd();
					state._fsp--;
					if (state.failed) return predicateOr;
					if ( state.backtracking==0 ) {
									predicateOr.addPredicate2(predicate2);
								}
					}
					break;

				default :
					break loop31;
				}
			}

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 14, complexPredicateOr_StartIndex); }

		}
		return predicateOr;
	}
	// $ANTLR end "complexPredicateOr"



	// $ANTLR start "complexPredicateAnd"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:663:1: complexPredicateAnd returns [ComplexPredicate predicateAnd] : (predicate1= complexPredicateNot ( KEYWORD_AND predicate2= complexPredicateNot )* ) ;
	public final ComplexPredicate complexPredicateAnd() throws RecognitionException {
		ComplexPredicate predicateAnd = null;

		int complexPredicateAnd_StartIndex = input.index();

		ComplexPredicate predicate1 =null;
		ComplexPredicate predicate2 =null;


		        	predicateAnd = new ComplexPredicate(EnumPredicateType.AND_PREDICATE);
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 15) ) { return predicateAnd; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:667:2: ( (predicate1= complexPredicateNot ( KEYWORD_AND predicate2= complexPredicateNot )* ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:668:2: (predicate1= complexPredicateNot ( KEYWORD_AND predicate2= complexPredicateNot )* )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:668:2: (predicate1= complexPredicateNot ( KEYWORD_AND predicate2= complexPredicateNot )* )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:669:3: predicate1= complexPredicateNot ( KEYWORD_AND predicate2= complexPredicateNot )*
			{
			pushFollow(FOLLOW_complexPredicateNot_in_complexPredicateAnd7010);
			predicate1=complexPredicateNot();
			state._fsp--;
			if (state.failed) return predicateAnd;
			if ( state.backtracking==0 ) {
						predicateAnd.setPredicate1(predicate1);
					}
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:672:3: ( KEYWORD_AND predicate2= complexPredicateNot )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==KEYWORD_AND) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:673:4: KEYWORD_AND predicate2= complexPredicateNot
					{
					match(input,KEYWORD_AND,FOLLOW_KEYWORD_AND_in_complexPredicateAnd7021); if (state.failed) return predicateAnd;
					if ( state.backtracking==0 ) {
									predicateAnd.addAnd();
								}
					pushFollow(FOLLOW_complexPredicateNot_in_complexPredicateAnd7029);
					predicate2=complexPredicateNot();
					state._fsp--;
					if (state.failed) return predicateAnd;
					if ( state.backtracking==0 ) {
									predicateAnd.addPredicate2(predicate2);
								}
					}
					break;

				default :
					break loop32;
				}
			}

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 15, complexPredicateAnd_StartIndex); }

		}
		return predicateAnd;
	}
	// $ANTLR end "complexPredicateAnd"



	// $ANTLR start "complexPredicateNot"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:683:1: complexPredicateNot returns [ComplexPredicate predicateNot] : ( ( KEYWORD_NOT )? predicate1= complexPredicate ) ;
	public final ComplexPredicate complexPredicateNot() throws RecognitionException {
		ComplexPredicate predicateNot = null;

		int complexPredicateNot_StartIndex = input.index();

		AbstractPredicate predicate1 =null;


		        	predicateNot = new ComplexPredicate(EnumPredicateType.NOT_PREDICATE);
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 16) ) { return predicateNot; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:687:2: ( ( ( KEYWORD_NOT )? predicate1= complexPredicate ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:688:2: ( ( KEYWORD_NOT )? predicate1= complexPredicate )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:688:2: ( ( KEYWORD_NOT )? predicate1= complexPredicate )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:689:3: ( KEYWORD_NOT )? predicate1= complexPredicate
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:689:3: ( KEYWORD_NOT )?
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==KEYWORD_NOT) ) {
				alt33=1;
			}
			switch (alt33) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:690:3: KEYWORD_NOT
					{
					match(input,KEYWORD_NOT,FOLLOW_KEYWORD_NOT_in_complexPredicateNot7070); if (state.failed) return predicateNot;
					if ( state.backtracking==0 ) {
								predicateNot.negate();
							}
					}
					break;

			}

			pushFollow(FOLLOW_complexPredicate_in_complexPredicateNot7083);
			predicate1=complexPredicate();
			state._fsp--;
			if (state.failed) return predicateNot;
			if ( state.backtracking==0 ) {
						predicateNot.setPredicate1(predicate1);
					}
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 16, complexPredicateNot_StartIndex); }

		}
		return predicateNot;
	}
	// $ANTLR end "complexPredicateNot"



	// $ANTLR start "complexPredicate"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:700:1: complexPredicate returns [AbstractPredicate predicate] : (predicate1= parenPredicate |predicate2= simplePredicate ) ;
	public final AbstractPredicate complexPredicate() throws RecognitionException {
		AbstractPredicate predicate = null;

		int complexPredicate_StartIndex = input.index();

		AbstractPredicate predicate1 =null;
		SimplePredicate predicate2 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 17) ) { return predicate; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:701:2: ( (predicate1= parenPredicate |predicate2= simplePredicate ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:702:2: (predicate1= parenPredicate |predicate2= simplePredicate )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:702:2: (predicate1= parenPredicate |predicate2= simplePredicate )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==LPAREN) ) {
				int LA34_1 = input.LA(2);
				if ( (synpred45_FunSQL()) ) {
					alt34=1;
				}
				else if ( (true) ) {
					alt34=2;
				}

			}
			else if ( (LA34_0==FUNCTION_AGGREGATION||LA34_0==IDENTIFIER||(LA34_0 >= LITERAL_DECIMAL && LA34_0 <= LITERAL_STRING)||LA34_0==MINUS||LA34_0==PLUS||LA34_0==QUOTE_DOUBLE||LA34_0==TYPE_DATE) ) {
				alt34=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return predicate;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:703:3: predicate1= parenPredicate
					{
					pushFollow(FOLLOW_parenPredicate_in_complexPredicate7110);
					predicate1=parenPredicate();
					state._fsp--;
					if (state.failed) return predicate;
					if ( state.backtracking==0 ) {
								predicate = predicate1;
							}
					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:708:3: predicate2= simplePredicate
					{
					pushFollow(FOLLOW_simplePredicate_in_complexPredicate7125);
					predicate2=simplePredicate();
					state._fsp--;
					if (state.failed) return predicate;
					if ( state.backtracking==0 ) {
								predicate = predicate2;
							}
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 17, complexPredicate_StartIndex); }

		}
		return predicate;
	}
	// $ANTLR end "complexPredicate"



	// $ANTLR start "parenPredicate"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:715:1: parenPredicate returns [AbstractPredicate predicate] : LPAREN predicate1= abstractPredicate RPAREN ;
	public final AbstractPredicate parenPredicate() throws RecognitionException {
		AbstractPredicate predicate = null;

		int parenPredicate_StartIndex = input.index();

		AbstractPredicate predicate1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 18) ) { return predicate; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:716:2: ( LPAREN predicate1= abstractPredicate RPAREN )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:717:3: LPAREN predicate1= abstractPredicate RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_parenPredicate7150); if (state.failed) return predicate;
			pushFollow(FOLLOW_abstractPredicate_in_parenPredicate7157);
			predicate1=abstractPredicate();
			state._fsp--;
			if (state.failed) return predicate;
			if ( state.backtracking==0 ) {
						predicate = predicate1;
					}
			match(input,RPAREN,FOLLOW_RPAREN_in_parenPredicate7163); if (state.failed) return predicate;
			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 18, parenPredicate_StartIndex); }

		}
		return predicate;
	}
	// $ANTLR end "parenPredicate"



	// $ANTLR start "simplePredicate"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:724:1: simplePredicate returns [SimplePredicate predicate] : (expr1= abstractExpression comp= tokenCompOperator expr2= abstractExpression ) ;
	public final SimplePredicate simplePredicate() throws RecognitionException {
		SimplePredicate predicate = null;

		int simplePredicate_StartIndex = input.index();

		AbstractExpression expr1 =null;
		ParserRuleReturnScope comp =null;
		AbstractExpression expr2 =null;


		        	predicate = new SimplePredicate();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 19) ) { return predicate; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:728:9: ( (expr1= abstractExpression comp= tokenCompOperator expr2= abstractExpression ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:729:9: (expr1= abstractExpression comp= tokenCompOperator expr2= abstractExpression )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:729:9: (expr1= abstractExpression comp= tokenCompOperator expr2= abstractExpression )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:730:3: expr1= abstractExpression comp= tokenCompOperator expr2= abstractExpression
			{
			pushFollow(FOLLOW_abstractExpression_in_simplePredicate7205);
			expr1=abstractExpression();
			state._fsp--;
			if (state.failed) return predicate;
			if ( state.backtracking==0 ) {
			                	predicate.setExpr1(expr1);
			                }
			pushFollow(FOLLOW_tokenCompOperator_in_simplePredicate7260);
			comp=tokenCompOperator();
			state._fsp--;
			if (state.failed) return predicate;
			if ( state.backtracking==0 ) {
			                	predicate.setComp(EnumCompOperator.get((comp!=null?input.toString(comp.start,comp.stop):null)));
			                }
			pushFollow(FOLLOW_abstractExpression_in_simplePredicate7298);
			expr2=abstractExpression();
			state._fsp--;
			if (state.failed) return predicate;
			if ( state.backtracking==0 ) {
			                	predicate.setExpr2(expr2);
			                }
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 19, simplePredicate_StartIndex); }

		}
		return predicate;
	}
	// $ANTLR end "simplePredicate"



	// $ANTLR start "abstractExpression"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:747:1: abstractExpression returns [AbstractExpression expression] : expression1= complexExpressionAdd ;
	public final AbstractExpression abstractExpression() throws RecognitionException {
		AbstractExpression expression = null;

		int abstractExpression_StartIndex = input.index();

		ComplexExpression expression1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 20) ) { return expression; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:748:2: (expression1= complexExpressionAdd )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:749:2: expression1= complexExpressionAdd
			{
			pushFollow(FOLLOW_complexExpressionAdd_in_abstractExpression7352);
			expression1=complexExpressionAdd();
			state._fsp--;
			if (state.failed) return expression;
			if ( state.backtracking==0 ) {
					expression = expression1;
				}
			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 20, abstractExpression_StartIndex); }

		}
		return expression;
	}
	// $ANTLR end "abstractExpression"



	// $ANTLR start "complexExpressionAdd"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:754:1: complexExpressionAdd returns [ComplexExpression expression] : (expression1= complexExpressionMult (op1= tokenAddOperator expression2= complexExpressionMult )* ) ;
	public final ComplexExpression complexExpressionAdd() throws RecognitionException {
		ComplexExpression expression = null;

		int complexExpressionAdd_StartIndex = input.index();

		ComplexExpression expression1 =null;
		ParserRuleReturnScope op1 =null;
		ComplexExpression expression2 =null;


		        	expression = new ComplexExpression(EnumExprType.ADD_EXPRESSION);
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 21) ) { return expression; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:758:2: ( (expression1= complexExpressionMult (op1= tokenAddOperator expression2= complexExpressionMult )* ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:759:2: (expression1= complexExpressionMult (op1= tokenAddOperator expression2= complexExpressionMult )* )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:759:2: (expression1= complexExpressionMult (op1= tokenAddOperator expression2= complexExpressionMult )* )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:760:3: expression1= complexExpressionMult (op1= tokenAddOperator expression2= complexExpressionMult )*
			{
			pushFollow(FOLLOW_complexExpressionMult_in_complexExpressionAdd7382);
			expression1=complexExpressionMult();
			state._fsp--;
			if (state.failed) return expression;
			if ( state.backtracking==0 ) {
						expression.setExpr1(expression1);
					}
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:763:3: (op1= tokenAddOperator expression2= complexExpressionMult )*
			loop35:
			while (true) {
				int alt35=2;
				int LA35_0 = input.LA(1);
				if ( (LA35_0==MINUS||LA35_0==PLUS) ) {
					alt35=1;
				}

				switch (alt35) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:764:4: op1= tokenAddOperator expression2= complexExpressionMult
					{
					pushFollow(FOLLOW_tokenAddOperator_in_complexExpressionAdd7395);
					op1=tokenAddOperator();
					state._fsp--;
					if (state.failed) return expression;
					if ( state.backtracking==0 ) {
					                		expression.addOp(EnumExprOperator.get((op1!=null?input.toString(op1.start,op1.stop):null)));
					                	}
					pushFollow(FOLLOW_complexExpressionMult_in_complexExpressionAdd7403);
					expression2=complexExpressionMult();
					state._fsp--;
					if (state.failed) return expression;
					if ( state.backtracking==0 ) {
									expression.addExpr2(expression2);
								}
					}
					break;

				default :
					break loop35;
				}
			}

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 21, complexExpressionAdd_StartIndex); }

		}
		return expression;
	}
	// $ANTLR end "complexExpressionAdd"



	// $ANTLR start "complexExpressionMult"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:774:1: complexExpressionMult returns [ComplexExpression expression] : (expression1= complexExpressionSigned (op1= tokenMultOperator expression2= complexExpressionSigned )* ) ;
	public final ComplexExpression complexExpressionMult() throws RecognitionException {
		ComplexExpression expression = null;

		int complexExpressionMult_StartIndex = input.index();

		ComplexExpression expression1 =null;
		ParserRuleReturnScope op1 =null;
		ComplexExpression expression2 =null;


		        	expression = new ComplexExpression(EnumExprType.MULT_EXPRESSION);
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 22) ) { return expression; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:778:2: ( (expression1= complexExpressionSigned (op1= tokenMultOperator expression2= complexExpressionSigned )* ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:779:2: (expression1= complexExpressionSigned (op1= tokenMultOperator expression2= complexExpressionSigned )* )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:779:2: (expression1= complexExpressionSigned (op1= tokenMultOperator expression2= complexExpressionSigned )* )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:780:3: expression1= complexExpressionSigned (op1= tokenMultOperator expression2= complexExpressionSigned )*
			{
			pushFollow(FOLLOW_complexExpressionSigned_in_complexExpressionMult7443);
			expression1=complexExpressionSigned();
			state._fsp--;
			if (state.failed) return expression;
			if ( state.backtracking==0 ) {
						expression.setExpr1(expression1);
					}
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:783:3: (op1= tokenMultOperator expression2= complexExpressionSigned )*
			loop36:
			while (true) {
				int alt36=2;
				int LA36_0 = input.LA(1);
				if ( (LA36_0==DIV||LA36_0==MULT) ) {
					alt36=1;
				}

				switch (alt36) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:784:4: op1= tokenMultOperator expression2= complexExpressionSigned
					{
					pushFollow(FOLLOW_tokenMultOperator_in_complexExpressionMult7456);
					op1=tokenMultOperator();
					state._fsp--;
					if (state.failed) return expression;
					if ( state.backtracking==0 ) {
					                		expression.addOp(EnumExprOperator.get((op1!=null?input.toString(op1.start,op1.stop):null)));
					                	}
					pushFollow(FOLLOW_complexExpressionSigned_in_complexExpressionMult7464);
					expression2=complexExpressionSigned();
					state._fsp--;
					if (state.failed) return expression;
					if ( state.backtracking==0 ) {
									expression.addExpr2(expression2);
								}
					}
					break;

				default :
					break loop36;
				}
			}

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 22, complexExpressionMult_StartIndex); }

		}
		return expression;
	}
	// $ANTLR end "complexExpressionMult"



	// $ANTLR start "complexExpressionSigned"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:795:1: complexExpressionSigned returns [ComplexExpression expression] : ( ( MINUS | PLUS )? expression1= complexExpression ) ;
	public final ComplexExpression complexExpressionSigned() throws RecognitionException {
		ComplexExpression expression = null;

		int complexExpressionSigned_StartIndex = input.index();

		AbstractExpression expression1 =null;


		        	expression = new ComplexExpression(EnumExprType.SIGNED_EXPRESSION);
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 23) ) { return expression; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:799:2: ( ( ( MINUS | PLUS )? expression1= complexExpression ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:800:2: ( ( MINUS | PLUS )? expression1= complexExpression )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:800:2: ( ( MINUS | PLUS )? expression1= complexExpression )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:801:3: ( MINUS | PLUS )? expression1= complexExpression
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:801:3: ( MINUS | PLUS )?
			int alt37=3;
			int LA37_0 = input.LA(1);
			if ( (LA37_0==MINUS) ) {
				alt37=1;
			}
			else if ( (LA37_0==PLUS) ) {
				alt37=2;
			}
			switch (alt37) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:802:3: MINUS
					{
					match(input,MINUS,FOLLOW_MINUS_in_complexExpressionSigned7506); if (state.failed) return expression;
					if ( state.backtracking==0 ) {
								expression.negate();
							}
					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:806:3: PLUS
					{
					match(input,PLUS,FOLLOW_PLUS_in_complexExpressionSigned7515); if (state.failed) return expression;
					}
					break;

			}

			pushFollow(FOLLOW_complexExpression_in_complexExpressionSigned7527);
			expression1=complexExpression();
			state._fsp--;
			if (state.failed) return expression;
			if ( state.backtracking==0 ) {
						expression.setExpr1(expression1);
					}
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 23, complexExpressionSigned_StartIndex); }

		}
		return expression;
	}
	// $ANTLR end "complexExpressionSigned"



	// $ANTLR start "complexExpression"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:814:1: complexExpression returns [AbstractExpression expression] : (expression1= parenExpression |expression2= aggregationExpression |expression3= simpleExpression ) ;
	public final AbstractExpression complexExpression() throws RecognitionException {
		AbstractExpression expression = null;

		int complexExpression_StartIndex = input.index();

		AbstractExpression expression1 =null;
		AggregationExpression expression2 =null;
		SimpleExpression expression3 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 24) ) { return expression; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:815:2: ( (expression1= parenExpression |expression2= aggregationExpression |expression3= simpleExpression ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:816:2: (expression1= parenExpression |expression2= aggregationExpression |expression3= simpleExpression )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:816:2: (expression1= parenExpression |expression2= aggregationExpression |expression3= simpleExpression )
			int alt38=3;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt38=1;
				}
				break;
			case FUNCTION_AGGREGATION:
				{
				alt38=2;
				}
				break;
			case IDENTIFIER:
			case LITERAL_DECIMAL:
			case LITERAL_INTEGER:
			case LITERAL_STRING:
			case QUOTE_DOUBLE:
			case TYPE_DATE:
				{
				alt38=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return expression;}
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}
			switch (alt38) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:817:3: expression1= parenExpression
					{
					pushFollow(FOLLOW_parenExpression_in_complexExpression7562);
					expression1=parenExpression();
					state._fsp--;
					if (state.failed) return expression;
					if ( state.backtracking==0 ) {
								expression = expression1;
							}
					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:822:3: expression2= aggregationExpression
					{
					pushFollow(FOLLOW_aggregationExpression_in_complexExpression7577);
					expression2=aggregationExpression();
					state._fsp--;
					if (state.failed) return expression;
					if ( state.backtracking==0 ) {
								expression = expression2;
							}
					}
					break;
				case 3 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:827:3: expression3= simpleExpression
					{
					pushFollow(FOLLOW_simpleExpression_in_complexExpression7592);
					expression3=simpleExpression();
					state._fsp--;
					if (state.failed) return expression;
					if ( state.backtracking==0 ) {
								expression = expression3;
							}
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 24, complexExpression_StartIndex); }

		}
		return expression;
	}
	// $ANTLR end "complexExpression"



	// $ANTLR start "parenExpression"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:834:1: parenExpression returns [AbstractExpression expression] : LPAREN expression1= abstractExpression RPAREN ;
	public final AbstractExpression parenExpression() throws RecognitionException {
		AbstractExpression expression = null;

		int parenExpression_StartIndex = input.index();

		AbstractExpression expression1 =null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 25) ) { return expression; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:835:2: ( LPAREN expression1= abstractExpression RPAREN )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:836:3: LPAREN expression1= abstractExpression RPAREN
			{
			match(input,LPAREN,FOLLOW_LPAREN_in_parenExpression7617); if (state.failed) return expression;
			pushFollow(FOLLOW_abstractExpression_in_parenExpression7624);
			expression1=abstractExpression();
			state._fsp--;
			if (state.failed) return expression;
			if ( state.backtracking==0 ) {
						expression = expression1;
					}
			match(input,RPAREN,FOLLOW_RPAREN_in_parenExpression7630); if (state.failed) return expression;
			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 25, parenExpression_StartIndex); }

		}
		return expression;
	}
	// $ANTLR end "parenExpression"



	// $ANTLR start "aggregationExpression"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:844:1: aggregationExpression returns [AggregationExpression expression] : (agg1= FUNCTION_AGGREGATION LPAREN ( KEYWORD_DISTINCT )? expr1= abstractExpression RPAREN ) ;
	public final AggregationExpression aggregationExpression() throws RecognitionException {
		AggregationExpression expression = null;

		int aggregationExpression_StartIndex = input.index();

		Token agg1=null;
		AbstractExpression expr1 =null;


		        	expression = new AggregationExpression();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 26) ) { return expression; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:848:9: ( (agg1= FUNCTION_AGGREGATION LPAREN ( KEYWORD_DISTINCT )? expr1= abstractExpression RPAREN ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:849:9: (agg1= FUNCTION_AGGREGATION LPAREN ( KEYWORD_DISTINCT )? expr1= abstractExpression RPAREN )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:849:9: (agg1= FUNCTION_AGGREGATION LPAREN ( KEYWORD_DISTINCT )? expr1= abstractExpression RPAREN )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:850:3: agg1= FUNCTION_AGGREGATION LPAREN ( KEYWORD_DISTINCT )? expr1= abstractExpression RPAREN
			{
			agg1=(Token)match(input,FUNCTION_AGGREGATION,FOLLOW_FUNCTION_AGGREGATION_in_aggregationExpression7682); if (state.failed) return expression;
			if ( state.backtracking==0 ) {
						expression.setAggregation((agg1!=null?agg1.getText():null).toUpperCase());
					}
			match(input,LPAREN,FOLLOW_LPAREN_in_aggregationExpression7690); if (state.failed) return expression;
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:855:3: ( KEYWORD_DISTINCT )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==KEYWORD_DISTINCT) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:856:3: KEYWORD_DISTINCT
					{
					match(input,KEYWORD_DISTINCT,FOLLOW_KEYWORD_DISTINCT_in_aggregationExpression7699); if (state.failed) return expression;
					if ( state.backtracking==0 ) {
								expression.setDistinct();
							}
					}
					break;

			}

			pushFollow(FOLLOW_abstractExpression_in_aggregationExpression7711);
			expr1=abstractExpression();
			state._fsp--;
			if (state.failed) return expression;
			if ( state.backtracking==0 ) {
						expression.setExpression(expr1);
					}
			match(input,RPAREN,FOLLOW_RPAREN_in_aggregationExpression7717); if (state.failed) return expression;
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 26, aggregationExpression_StartIndex); }

		}
		return expression;
	}
	// $ANTLR end "aggregationExpression"



	// $ANTLR start "simpleExpression"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:867:1: simpleExpression returns [SimpleExpression expression] : ( (att1= tokenAttribute |lit1= tokenLiteral ) ) ;
	public final SimpleExpression simpleExpression() throws RecognitionException {
		SimpleExpression expression = null;

		int simpleExpression_StartIndex = input.index();

		TokenAttribute att1 =null;
		TokenLiteral lit1 =null;


		        	expression = new SimpleExpression();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 27) ) { return expression; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:871:9: ( ( (att1= tokenAttribute |lit1= tokenLiteral ) ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:872:9: ( (att1= tokenAttribute |lit1= tokenLiteral ) )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:872:9: ( (att1= tokenAttribute |lit1= tokenLiteral ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:873:3: (att1= tokenAttribute |lit1= tokenLiteral )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:873:3: (att1= tokenAttribute |lit1= tokenLiteral )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==IDENTIFIER||LA40_0==QUOTE_DOUBLE) ) {
				alt40=1;
			}
			else if ( ((LA40_0 >= LITERAL_DECIMAL && LA40_0 <= LITERAL_STRING)||LA40_0==TYPE_DATE) ) {
				alt40=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return expression;}
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:874:3: att1= tokenAttribute
					{
					pushFollow(FOLLOW_tokenAttribute_in_simpleExpression7792);
					att1=tokenAttribute();
					state._fsp--;
					if (state.failed) return expression;
					if ( state.backtracking==0 ) {
					                	expression.setOper(att1);
					                }
					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:879:17: lit1= tokenLiteral
					{
					pushFollow(FOLLOW_tokenLiteral_in_simpleExpression7848);
					lit1=tokenLiteral();
					state._fsp--;
					if (state.failed) return expression;
					if ( state.backtracking==0 ) {
					                	expression.setOper(lit1);
					                }
					}
					break;

			}

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 27, simpleExpression_StartIndex); }

		}
		return expression;
	}
	// $ANTLR end "simpleExpression"



	// $ANTLR start "tokenAttribute"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:887:1: tokenAttribute returns [TokenAttribute attribute] : ( (table1= tokenIdentifier DOT )? id1= tokenIdentifier ) ;
	public final TokenAttribute tokenAttribute() throws RecognitionException {
		TokenAttribute attribute = null;

		int tokenAttribute_StartIndex = input.index();

		TokenIdentifier table1 =null;
		TokenIdentifier id1 =null;


		        	attribute = new TokenAttribute();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 28) ) { return attribute; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:891:9: ( ( (table1= tokenIdentifier DOT )? id1= tokenIdentifier ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:892:9: ( (table1= tokenIdentifier DOT )? id1= tokenIdentifier )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:892:9: ( (table1= tokenIdentifier DOT )? id1= tokenIdentifier )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:893:17: (table1= tokenIdentifier DOT )? id1= tokenIdentifier
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:893:17: (table1= tokenIdentifier DOT )?
			int alt41=2;
			alt41 = dfa41.predict(input);
			switch (alt41) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:894:17: table1= tokenIdentifier DOT
					{
					pushFollow(FOLLOW_tokenIdentifier_in_tokenAttribute7976);
					table1=tokenIdentifier();
					state._fsp--;
					if (state.failed) return attribute;
					if ( state.backtracking==0 ) {
					                	TokenTable table = new TokenTable();
					                	table.setName(table1);
					                	attribute.setTable(table);
					                }
					match(input,DOT,FOLLOW_DOT_in_tokenAttribute7996); if (state.failed) return attribute;
					}
					break;

			}

			pushFollow(FOLLOW_tokenIdentifier_in_tokenAttribute8035);
			id1=tokenIdentifier();
			state._fsp--;
			if (state.failed) return attribute;
			if ( state.backtracking==0 ) {
			                	attribute.setName(id1);
			                }
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 28, tokenAttribute_StartIndex); }

		}
		return attribute;
	}
	// $ANTLR end "tokenAttribute"



	// $ANTLR start "tokenTable"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:907:1: tokenTable returns [TokenTable table] : ( ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier ) | ( ( COLON )? id1= tokenIdentifier ) );
	public final TokenTable tokenTable() throws RecognitionException {
		TokenTable table = null;

		int tokenTable_StartIndex = input.index();

		TokenIdentifier schema1 =null;
		TokenIdentifier id1 =null;


		        	table = new TokenTable();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 29) ) { return table; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:911:9: ( ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier ) | ( ( COLON )? id1= tokenIdentifier ) )
			int alt44=2;
			alt44 = dfa44.predict(input);
			switch (alt44) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:912:9: ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:912:9: ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:913:17: (schema1= tokenIdentifier DOT )? id1= tokenIdentifier
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:913:17: (schema1= tokenIdentifier DOT )?
					int alt42=2;
					alt42 = dfa42.predict(input);
					switch (alt42) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:914:17: schema1= tokenIdentifier DOT
							{
							pushFollow(FOLLOW_tokenIdentifier_in_tokenTable8158);
							schema1=tokenIdentifier();
							state._fsp--;
							if (state.failed) return table;
							if ( state.backtracking==0 ) {
							                        TokenSchema schema = new TokenSchema();
							                	table.setSchema(schema);
							                	table.setVariable(false);
							                }
							match(input,DOT,FOLLOW_DOT_in_tokenTable8178); if (state.failed) return table;
							}
							break;

					}

					pushFollow(FOLLOW_tokenIdentifier_in_tokenTable8235);
					id1=tokenIdentifier();
					state._fsp--;
					if (state.failed) return table;
					if ( state.backtracking==0 ) {
					                	table.setName(id1);
					                }
					}

					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:924:12: ( ( COLON )? id1= tokenIdentifier )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:924:12: ( ( COLON )? id1= tokenIdentifier )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:925:17: ( COLON )? id1= tokenIdentifier
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:925:17: ( COLON )?
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( (LA43_0==COLON) ) {
						alt43=1;
					}
					switch (alt43) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:926:17: COLON
							{
							match(input,COLON,FOLLOW_COLON_in_tokenTable8302); if (state.failed) return table;
							}
							break;

					}

					pushFollow(FOLLOW_tokenIdentifier_in_tokenTable8344);
					id1=tokenIdentifier();
					state._fsp--;
					if (state.failed) return table;
					if ( state.backtracking==0 ) {
					                	table.setName(id1);                	
					                	table.setVariable(true);
					                }
					}

					}
					break;

			}
		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 29, tokenTable_StartIndex); }

		}
		return table;
	}
	// $ANTLR end "tokenTable"



	// $ANTLR start "tokenSchema"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:935:1: tokenSchema returns [TokenSchema schema] : ( tokenIdentifier ) ;
	public final TokenSchema tokenSchema() throws RecognitionException {
		TokenSchema schema = null;

		int tokenSchema_StartIndex = input.index();

		TokenIdentifier tokenIdentifier16 =null;


		        	schema = new TokenSchema();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 30) ) { return schema; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:939:9: ( ( tokenIdentifier ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:940:9: ( tokenIdentifier )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:940:9: ( tokenIdentifier )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:941:17: tokenIdentifier
			{
			pushFollow(FOLLOW_tokenIdentifier_in_tokenSchema8425);
			tokenIdentifier16=tokenIdentifier();
			state._fsp--;
			if (state.failed) return schema;
			if ( state.backtracking==0 ) {
			                	schema.setName(tokenIdentifier16);
			                }
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 30, tokenSchema_StartIndex); }

		}
		return schema;
	}
	// $ANTLR end "tokenSchema"



	// $ANTLR start "tokenFunction"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:947:1: tokenFunction returns [TokenFunction function] : ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier ) ;
	public final TokenFunction tokenFunction() throws RecognitionException {
		TokenFunction function = null;

		int tokenFunction_StartIndex = input.index();

		TokenIdentifier schema1 =null;
		TokenIdentifier id1 =null;


		        	function = new TokenFunction();
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 31) ) { return function; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:951:9: ( ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:952:9: ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:952:9: ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:953:33: (schema1= tokenIdentifier DOT )? id1= tokenIdentifier
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:953:33: (schema1= tokenIdentifier DOT )?
			int alt45=2;
			alt45 = dfa45.predict(input);
			switch (alt45) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:954:17: schema1= tokenIdentifier DOT
					{
					pushFollow(FOLLOW_tokenIdentifier_in_tokenFunction8541);
					schema1=tokenIdentifier();
					state._fsp--;
					if (state.failed) return function;
					if ( state.backtracking==0 ) {
					                        TokenSchema schema = new TokenSchema();
					                	function.setSchema(schema);
					                }
					match(input,DOT,FOLLOW_DOT_in_tokenFunction8561); if (state.failed) return function;
					}
					break;

			}

			pushFollow(FOLLOW_tokenIdentifier_in_tokenFunction8600);
			id1=tokenIdentifier();
			state._fsp--;
			if (state.failed) return function;
			if ( state.backtracking==0 ) {
			                	function.setName(id1);
			                }
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 31, tokenFunction_StartIndex); }

		}
		return function;
	}
	// $ANTLR end "tokenFunction"



	// $ANTLR start "tokenVariable"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:966:1: tokenVariable returns [TokenVariable variable] : ( variableText ) ;
	public final TokenVariable tokenVariable() throws RecognitionException {
		TokenVariable variable = null;

		int tokenVariable_StartIndex = input.index();

		String variableText17 =null;


		        	variable = null;
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 32) ) { return variable; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:970:9: ( ( variableText ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:971:9: ( variableText )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:971:9: ( variableText )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:972:17: variableText
			{
			pushFollow(FOLLOW_variableText_in_tokenVariable8680);
			variableText17=variableText();
			state._fsp--;
			if (state.failed) return variable;
			if ( state.backtracking==0 ) {
			                variable = new TokenVariable(variableText17);	
			                }
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 32, tokenVariable_StartIndex); }

		}
		return variable;
	}
	// $ANTLR end "tokenVariable"



	// $ANTLR start "tokenAssignment"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:978:1: tokenAssignment returns [TokenAssignment ass] : ( ( COLON var1= tokenVariable EQUAL1 selstmt1= selectStatement ) | ( KEYWORD_VAR var2= tokenVariable EQUAL1 selstmt2= selectStatement ) | ( KEYWORD_VAR var3= tokenVariable EQUAL1 ) COLON var4= tokenVariable ) SEMI ;
	public final TokenAssignment tokenAssignment() throws RecognitionException {
		TokenAssignment ass = null;

		int tokenAssignment_StartIndex = input.index();

		TokenVariable var1 =null;
		ParserRuleReturnScope selstmt1 =null;
		TokenVariable var2 =null;
		ParserRuleReturnScope selstmt2 =null;
		TokenVariable var3 =null;
		TokenVariable var4 =null;


			 	ass =new TokenAssignment();
			 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 33) ) { return ass; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:982:3: ( ( ( COLON var1= tokenVariable EQUAL1 selstmt1= selectStatement ) | ( KEYWORD_VAR var2= tokenVariable EQUAL1 selstmt2= selectStatement ) | ( KEYWORD_VAR var3= tokenVariable EQUAL1 ) COLON var4= tokenVariable ) SEMI )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:983:3: ( ( COLON var1= tokenVariable EQUAL1 selstmt1= selectStatement ) | ( KEYWORD_VAR var2= tokenVariable EQUAL1 selstmt2= selectStatement ) | ( KEYWORD_VAR var3= tokenVariable EQUAL1 ) COLON var4= tokenVariable ) SEMI
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:983:3: ( ( COLON var1= tokenVariable EQUAL1 selstmt1= selectStatement ) | ( KEYWORD_VAR var2= tokenVariable EQUAL1 selstmt2= selectStatement ) | ( KEYWORD_VAR var3= tokenVariable EQUAL1 ) COLON var4= tokenVariable )
			int alt46=3;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==COLON) ) {
				alt46=1;
			}
			else if ( (LA46_0==KEYWORD_VAR) ) {
				int LA46_2 = input.LA(2);
				if ( (LA46_2==IDENTIFIER) ) {
					int LA46_3 = input.LA(3);
					if ( (LA46_3==EQUAL1) ) {
						int LA46_4 = input.LA(4);
						if ( (LA46_4==COLON) ) {
							alt46=3;
						}
						else if ( (LA46_4==KEYWORD_SELECT) ) {
							alt46=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return ass;}
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 46, 4, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						if (state.backtracking>0) {state.failed=true; return ass;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 46, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return ass;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return ass;}
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:984:4: ( COLON var1= tokenVariable EQUAL1 selstmt1= selectStatement )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:984:4: ( COLON var1= tokenVariable EQUAL1 selstmt1= selectStatement )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:985:4: COLON var1= tokenVariable EQUAL1 selstmt1= selectStatement
					{
					match(input,COLON,FOLLOW_COLON_in_tokenAssignment8747); if (state.failed) return ass;
					pushFollow(FOLLOW_tokenVariable_in_tokenAssignment8759);
					var1=tokenVariable();
					state._fsp--;
					if (state.failed) return ass;
					if ( state.backtracking==0 ) {
							 ass.setReference(true);
							 ass.setVar(var1);
							 }
					match(input,EQUAL1,FOLLOW_EQUAL1_in_tokenAssignment8765); if (state.failed) return ass;
					pushFollow(FOLLOW_selectStatement_in_tokenAssignment8772);
					selstmt1=selectStatement();
					state._fsp--;
					if (state.failed) return ass;
					if ( state.backtracking==0 ) {
							 ass.setSelStmt((selstmt1!=null?((FunSQLParser.selectStatement_return)selstmt1).stmt:null));
							 }
					}

					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:996:4: ( KEYWORD_VAR var2= tokenVariable EQUAL1 selstmt2= selectStatement )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:996:4: ( KEYWORD_VAR var2= tokenVariable EQUAL1 selstmt2= selectStatement )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:997:4: KEYWORD_VAR var2= tokenVariable EQUAL1 selstmt2= selectStatement
					{
					match(input,KEYWORD_VAR,FOLLOW_KEYWORD_VAR_in_tokenAssignment8793); if (state.failed) return ass;
					pushFollow(FOLLOW_tokenVariable_in_tokenAssignment8802);
					var2=tokenVariable();
					state._fsp--;
					if (state.failed) return ass;
					if ( state.backtracking==0 ) {		 
							 ass.setReference(false);
							 ass.setVar(var2);
							 }
					match(input,EQUAL1,FOLLOW_EQUAL1_in_tokenAssignment8808); if (state.failed) return ass;
					pushFollow(FOLLOW_selectStatement_in_tokenAssignment8815);
					selstmt2=selectStatement();
					state._fsp--;
					if (state.failed) return ass;
					if ( state.backtracking==0 ) {
							 ass.setSelStmt((selstmt2!=null?((FunSQLParser.selectStatement_return)selstmt2).stmt:null));
							 }
					}

					}
					break;
				case 3 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1008:4: ( KEYWORD_VAR var3= tokenVariable EQUAL1 ) COLON var4= tokenVariable
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1008:4: ( KEYWORD_VAR var3= tokenVariable EQUAL1 )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1009:4: KEYWORD_VAR var3= tokenVariable EQUAL1
					{
					match(input,KEYWORD_VAR,FOLLOW_KEYWORD_VAR_in_tokenAssignment8839); if (state.failed) return ass;
					pushFollow(FOLLOW_tokenVariable_in_tokenAssignment8848);
					var3=tokenVariable();
					state._fsp--;
					if (state.failed) return ass;
					if ( state.backtracking==0 ) {		 
							 ass.setReference(false);
							 ass.setVar(var3);
							 }
					match(input,EQUAL1,FOLLOW_EQUAL1_in_tokenAssignment8854); if (state.failed) return ass;
					}

					match(input,COLON,FOLLOW_COLON_in_tokenAssignment8865); if (state.failed) return ass;
					pushFollow(FOLLOW_tokenVariable_in_tokenAssignment8877);
					var4=tokenVariable();
					state._fsp--;
					if (state.failed) return ass;
					if ( state.backtracking==0 ) {
							 ass.setReference(true);
							 ass.setVar(var4);
							 }
					}
					break;

			}

			match(input,SEMI,FOLLOW_SEMI_in_tokenAssignment8888); if (state.failed) return ass;
			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 33, tokenAssignment_StartIndex); }

		}
		return ass;
	}
	// $ANTLR end "tokenAssignment"



	// $ANTLR start "tokenFunctionCall"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1025:1: tokenFunctionCall returns [TokenFunctionCall call] : ( KEYWORD_CALL KEYWORD_FUNCTION fun1= tokenFunction LPAREN ( COLON var1= tokenVariable )* ( KEYWORD_VAR var2= tokenVariable COMMA )* ( KEYWORD_VAR var3= tokenVariable ) RPAREN SEMI ) ;
	public final TokenFunctionCall tokenFunctionCall() throws RecognitionException {
		TokenFunctionCall call = null;

		int tokenFunctionCall_StartIndex = input.index();

		TokenFunction fun1 =null;
		TokenVariable var1 =null;
		TokenVariable var2 =null;
		TokenVariable var3 =null;


			 	call =new TokenFunctionCall();
			 
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 34) ) { return call; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1029:3: ( ( KEYWORD_CALL KEYWORD_FUNCTION fun1= tokenFunction LPAREN ( COLON var1= tokenVariable )* ( KEYWORD_VAR var2= tokenVariable COMMA )* ( KEYWORD_VAR var3= tokenVariable ) RPAREN SEMI ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1030:3: ( KEYWORD_CALL KEYWORD_FUNCTION fun1= tokenFunction LPAREN ( COLON var1= tokenVariable )* ( KEYWORD_VAR var2= tokenVariable COMMA )* ( KEYWORD_VAR var3= tokenVariable ) RPAREN SEMI )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1030:3: ( KEYWORD_CALL KEYWORD_FUNCTION fun1= tokenFunction LPAREN ( COLON var1= tokenVariable )* ( KEYWORD_VAR var2= tokenVariable COMMA )* ( KEYWORD_VAR var3= tokenVariable ) RPAREN SEMI )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1031:4: KEYWORD_CALL KEYWORD_FUNCTION fun1= tokenFunction LPAREN ( COLON var1= tokenVariable )* ( KEYWORD_VAR var2= tokenVariable COMMA )* ( KEYWORD_VAR var3= tokenVariable ) RPAREN SEMI
			{
			match(input,KEYWORD_CALL,FOLLOW_KEYWORD_CALL_in_tokenFunctionCall8920); if (state.failed) return call;
			match(input,KEYWORD_FUNCTION,FOLLOW_KEYWORD_FUNCTION_in_tokenFunctionCall8925); if (state.failed) return call;
			pushFollow(FOLLOW_tokenFunction_in_tokenFunctionCall8932);
			fun1=tokenFunction();
			state._fsp--;
			if (state.failed) return call;
			if ( state.backtracking==0 ) {
					 call.setFun(fun1);
					 }
			match(input,LPAREN,FOLLOW_LPAREN_in_tokenFunctionCall8938); if (state.failed) return call;
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1037:4: ( COLON var1= tokenVariable )*
			loop47:
			while (true) {
				int alt47=2;
				int LA47_0 = input.LA(1);
				if ( (LA47_0==COLON) ) {
					alt47=1;
				}

				switch (alt47) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1038:5: COLON var1= tokenVariable
					{
					match(input,COLON,FOLLOW_COLON_in_tokenFunctionCall8949); if (state.failed) return call;
					pushFollow(FOLLOW_tokenVariable_in_tokenFunctionCall8962);
					var1=tokenVariable();
					state._fsp--;
					if (state.failed) return call;
					if ( state.backtracking==0 ) {
								 call.addInVar(var1);
								 }
					}
					break;

				default :
					break loop47;
				}
			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1043:4: ( KEYWORD_VAR var2= tokenVariable COMMA )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==KEYWORD_VAR) ) {
					int LA48_1 = input.LA(2);
					if ( (LA48_1==IDENTIFIER) ) {
						int LA48_2 = input.LA(3);
						if ( (LA48_2==COMMA) ) {
							alt48=1;
						}

					}

				}

				switch (alt48) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1044:5: KEYWORD_VAR var2= tokenVariable COMMA
					{
					match(input,KEYWORD_VAR,FOLLOW_KEYWORD_VAR_in_tokenFunctionCall8983); if (state.failed) return call;
					pushFollow(FOLLOW_tokenVariable_in_tokenFunctionCall8993);
					var2=tokenVariable();
					state._fsp--;
					if (state.failed) return call;
					if ( state.backtracking==0 ) {		
								 call.addOutVar(var2);
								 }
					match(input,COMMA,FOLLOW_COMMA_in_tokenFunctionCall9000); if (state.failed) return call;
					}
					break;

				default :
					break loop48;
				}
			}

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1050:4: ( KEYWORD_VAR var3= tokenVariable )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1051:5: KEYWORD_VAR var3= tokenVariable
			{
			match(input,KEYWORD_VAR,FOLLOW_KEYWORD_VAR_in_tokenFunctionCall9022); if (state.failed) return call;
			pushFollow(FOLLOW_tokenVariable_in_tokenFunctionCall9032);
			var3=tokenVariable();
			state._fsp--;
			if (state.failed) return call;
			if ( state.backtracking==0 ) {		
						 call.addOutVar(var3);
						 }
			}

			match(input,RPAREN,FOLLOW_RPAREN_in_tokenFunctionCall9043); if (state.failed) return call;
			match(input,SEMI,FOLLOW_SEMI_in_tokenFunctionCall9048); if (state.failed) return call;
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 34, tokenFunctionCall_StartIndex); }

		}
		return call;
	}
	// $ANTLR end "tokenFunctionCall"



	// $ANTLR start "tokenIdentifier"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1061:1: tokenIdentifier returns [TokenIdentifier identifier] : ( identifierText ) ;
	public final TokenIdentifier tokenIdentifier() throws RecognitionException {
		TokenIdentifier identifier = null;

		int tokenIdentifier_StartIndex = input.index();

		String identifierText18 =null;


		        	identifier = null;
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 35) ) { return identifier; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1065:9: ( ( identifierText ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1066:9: ( identifierText )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1066:9: ( identifierText )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1067:17: identifierText
			{
			pushFollow(FOLLOW_identifierText_in_tokenIdentifier9116);
			identifierText18=identifierText();
			state._fsp--;
			if (state.failed) return identifier;
			if ( state.backtracking==0 ) {
			                	identifier = new TokenIdentifier(identifierText18);
			                }
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 35, tokenIdentifier_StartIndex); }

		}
		return identifier;
	}
	// $ANTLR end "tokenIdentifier"



	// $ANTLR start "tokenDataType"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1074:1: tokenDataType returns [TokenDataType dataType] : ( TYPE_VARCHAR | TYPE_INTEGER | TYPE_DECIMAL | TYPE_DATE ) ;
	public final TokenDataType tokenDataType() throws RecognitionException {
		TokenDataType dataType = null;

		int tokenDataType_StartIndex = input.index();

		Token TYPE_VARCHAR19=null;
		Token TYPE_INTEGER20=null;
		Token TYPE_DECIMAL21=null;
		Token TYPE_DATE22=null;


		        	dataType = null;
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 36) ) { return dataType; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1078:9: ( ( TYPE_VARCHAR | TYPE_INTEGER | TYPE_DECIMAL | TYPE_DATE ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1079:9: ( TYPE_VARCHAR | TYPE_INTEGER | TYPE_DECIMAL | TYPE_DATE )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1079:9: ( TYPE_VARCHAR | TYPE_INTEGER | TYPE_DECIMAL | TYPE_DATE )
			int alt49=4;
			switch ( input.LA(1) ) {
			case TYPE_VARCHAR:
				{
				alt49=1;
				}
				break;
			case TYPE_INTEGER:
				{
				alt49=2;
				}
				break;
			case TYPE_DECIMAL:
				{
				alt49=3;
				}
				break;
			case TYPE_DATE:
				{
				alt49=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return dataType;}
				NoViableAltException nvae =
					new NoViableAltException("", 49, 0, input);
				throw nvae;
			}
			switch (alt49) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1080:17: TYPE_VARCHAR
					{
					TYPE_VARCHAR19=(Token)match(input,TYPE_VARCHAR,FOLLOW_TYPE_VARCHAR_in_tokenDataType9197); if (state.failed) return dataType;
					if ( state.backtracking==0 ) {
					                	dataType = new TokenDataType((TYPE_VARCHAR19!=null?TYPE_VARCHAR19.getText():null));
					                }
					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1084:17: TYPE_INTEGER
					{
					TYPE_INTEGER20=(Token)match(input,TYPE_INTEGER,FOLLOW_TYPE_INTEGER_in_tokenDataType9235); if (state.failed) return dataType;
					if ( state.backtracking==0 ) {
					                	dataType = new TokenDataType((TYPE_INTEGER20!=null?TYPE_INTEGER20.getText():null));
					                }
					}
					break;
				case 3 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1088:17: TYPE_DECIMAL
					{
					TYPE_DECIMAL21=(Token)match(input,TYPE_DECIMAL,FOLLOW_TYPE_DECIMAL_in_tokenDataType9273); if (state.failed) return dataType;
					if ( state.backtracking==0 ) {
					                	dataType = new TokenDataType((TYPE_DECIMAL21!=null?TYPE_DECIMAL21.getText():null));
					                }
					}
					break;
				case 4 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1092:17: TYPE_DATE
					{
					TYPE_DATE22=(Token)match(input,TYPE_DATE,FOLLOW_TYPE_DATE_in_tokenDataType9311); if (state.failed) return dataType;
					if ( state.backtracking==0 ) {
					                	dataType = new TokenDataType((TYPE_DATE22!=null?TYPE_DATE22.getText():null));
					                }
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 36, tokenDataType_StartIndex); }

		}
		return dataType;
	}
	// $ANTLR end "tokenDataType"



	// $ANTLR start "tokenLiteral"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1098:1: tokenLiteral returns [TokenLiteral literal] : ( ( tokenIntegerLiteral | tokenStringLiteral | tokenDecimalLiteral | tokenDateLiteral ) ) ;
	public final TokenLiteral tokenLiteral() throws RecognitionException {
		TokenLiteral literal = null;

		int tokenLiteral_StartIndex = input.index();

		TokenIntegerLiteral tokenIntegerLiteral23 =null;
		TokenStringLiteral tokenStringLiteral24 =null;
		TokenDecimalLiteral tokenDecimalLiteral25 =null;
		TokenDateLiteral tokenDateLiteral26 =null;


		        	literal = null;
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 37) ) { return literal; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1102:9: ( ( ( tokenIntegerLiteral | tokenStringLiteral | tokenDecimalLiteral | tokenDateLiteral ) ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1103:9: ( ( tokenIntegerLiteral | tokenStringLiteral | tokenDecimalLiteral | tokenDateLiteral ) )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1103:9: ( ( tokenIntegerLiteral | tokenStringLiteral | tokenDecimalLiteral | tokenDateLiteral ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1104:10: ( tokenIntegerLiteral | tokenStringLiteral | tokenDecimalLiteral | tokenDateLiteral )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1104:10: ( tokenIntegerLiteral | tokenStringLiteral | tokenDecimalLiteral | tokenDateLiteral )
			int alt50=4;
			switch ( input.LA(1) ) {
			case LITERAL_INTEGER:
				{
				alt50=1;
				}
				break;
			case LITERAL_STRING:
				{
				alt50=2;
				}
				break;
			case LITERAL_DECIMAL:
				{
				alt50=3;
				}
				break;
			case TYPE_DATE:
				{
				alt50=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return literal;}
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}
			switch (alt50) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1105:17: tokenIntegerLiteral
					{
					pushFollow(FOLLOW_tokenIntegerLiteral_in_tokenLiteral9402);
					tokenIntegerLiteral23=tokenIntegerLiteral();
					state._fsp--;
					if (state.failed) return literal;
					if ( state.backtracking==0 ) {
					                	literal = tokenIntegerLiteral23;
					                }
					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1109:17: tokenStringLiteral
					{
					pushFollow(FOLLOW_tokenStringLiteral_in_tokenLiteral9440);
					tokenStringLiteral24=tokenStringLiteral();
					state._fsp--;
					if (state.failed) return literal;
					if ( state.backtracking==0 ) {
					                	literal = tokenStringLiteral24;
					                }
					}
					break;
				case 3 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1113:17: tokenDecimalLiteral
					{
					pushFollow(FOLLOW_tokenDecimalLiteral_in_tokenLiteral9478);
					tokenDecimalLiteral25=tokenDecimalLiteral();
					state._fsp--;
					if (state.failed) return literal;
					if ( state.backtracking==0 ) {
					                	literal = tokenDecimalLiteral25;
					                }
					}
					break;
				case 4 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1117:17: tokenDateLiteral
					{
					pushFollow(FOLLOW_tokenDateLiteral_in_tokenLiteral9516);
					tokenDateLiteral26=tokenDateLiteral();
					state._fsp--;
					if (state.failed) return literal;
					if ( state.backtracking==0 ) {
					                	literal = tokenDateLiteral26;
					                }
					}
					break;

			}

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 37, tokenLiteral_StartIndex); }

		}
		return literal;
	}
	// $ANTLR end "tokenLiteral"



	// $ANTLR start "tokenStringLiteral"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1124:1: tokenStringLiteral returns [TokenStringLiteral literal] : (lit1= LITERAL_STRING ) ;
	public final TokenStringLiteral tokenStringLiteral() throws RecognitionException {
		TokenStringLiteral literal = null;

		int tokenStringLiteral_StartIndex = input.index();

		Token lit1=null;


		        	literal = null;
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 38) ) { return literal; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1128:9: ( (lit1= LITERAL_STRING ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1129:9: (lit1= LITERAL_STRING )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1129:9: (lit1= LITERAL_STRING )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1130:17: lit1= LITERAL_STRING
			{
			lit1=(Token)match(input,LITERAL_STRING,FOLLOW_LITERAL_STRING_in_tokenStringLiteral9616); if (state.failed) return literal;
			if ( state.backtracking==0 ) {
			                	literal = new TokenStringLiteral((lit1!=null?lit1.getText():null).substring(1, (lit1!=null?lit1.getText():null).length()-1));
			                }
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 38, tokenStringLiteral_StartIndex); }

		}
		return literal;
	}
	// $ANTLR end "tokenStringLiteral"



	// $ANTLR start "tokenIntegerLiteral"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1136:1: tokenIntegerLiteral returns [TokenIntegerLiteral literal] : ( LITERAL_INTEGER ) ;
	public final TokenIntegerLiteral tokenIntegerLiteral() throws RecognitionException {
		TokenIntegerLiteral literal = null;

		int tokenIntegerLiteral_StartIndex = input.index();

		Token LITERAL_INTEGER27=null;


		        	literal = null;
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 39) ) { return literal; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1140:9: ( ( LITERAL_INTEGER ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1141:9: ( LITERAL_INTEGER )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1141:9: ( LITERAL_INTEGER )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1142:17: LITERAL_INTEGER
			{
			LITERAL_INTEGER27=(Token)match(input,LITERAL_INTEGER,FOLLOW_LITERAL_INTEGER_in_tokenIntegerLiteral9696); if (state.failed) return literal;
			if ( state.backtracking==0 ) {
			                	literal = new TokenIntegerLiteral((LITERAL_INTEGER27!=null?LITERAL_INTEGER27.getText():null));
			                }
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 39, tokenIntegerLiteral_StartIndex); }

		}
		return literal;
	}
	// $ANTLR end "tokenIntegerLiteral"



	// $ANTLR start "tokenDecimalLiteral"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1149:2: tokenDecimalLiteral returns [TokenDecimalLiteral literal] : ( LITERAL_DECIMAL ) ;
	public final TokenDecimalLiteral tokenDecimalLiteral() throws RecognitionException {
		TokenDecimalLiteral literal = null;

		int tokenDecimalLiteral_StartIndex = input.index();

		Token LITERAL_DECIMAL28=null;


		        	literal = null;
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 40) ) { return literal; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1153:9: ( ( LITERAL_DECIMAL ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1154:9: ( LITERAL_DECIMAL )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1154:9: ( LITERAL_DECIMAL )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1155:17: LITERAL_DECIMAL
			{
			LITERAL_DECIMAL28=(Token)match(input,LITERAL_DECIMAL,FOLLOW_LITERAL_DECIMAL_in_tokenDecimalLiteral9786); if (state.failed) return literal;
			if ( state.backtracking==0 ) {
			                	literal = new TokenDecimalLiteral((LITERAL_DECIMAL28!=null?LITERAL_DECIMAL28.getText():null));
			                }
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 40, tokenDecimalLiteral_StartIndex); }

		}
		return literal;
	}
	// $ANTLR end "tokenDecimalLiteral"



	// $ANTLR start "tokenDateLiteral"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1161:2: tokenDateLiteral returns [TokenDateLiteral literal] : ( TYPE_DATE LITERAL_STRING ) ;
	public final TokenDateLiteral tokenDateLiteral() throws RecognitionException {
		TokenDateLiteral literal = null;

		int tokenDateLiteral_StartIndex = input.index();

		Token LITERAL_STRING29=null;


		        	literal = null;
		        
		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 41) ) { return literal; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1165:9: ( ( TYPE_DATE LITERAL_STRING ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1166:9: ( TYPE_DATE LITERAL_STRING )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1166:9: ( TYPE_DATE LITERAL_STRING )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1168:17: TYPE_DATE LITERAL_STRING
			{
			match(input,TYPE_DATE,FOLLOW_TYPE_DATE_in_tokenDateLiteral9884); if (state.failed) return literal;
			LITERAL_STRING29=(Token)match(input,LITERAL_STRING,FOLLOW_LITERAL_STRING_in_tokenDateLiteral9902); if (state.failed) return literal;
			if ( state.backtracking==0 ) {
			                	literal = new TokenDateLiteral((LITERAL_STRING29!=null?LITERAL_STRING29.getText():null));
			                }
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 41, tokenDateLiteral_StartIndex); }

		}
		return literal;
	}
	// $ANTLR end "tokenDateLiteral"



	// $ANTLR start "variableText"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1175:2: variableText returns [String text] : (var1= IDENTIFIER ) ;
	public final String variableText() throws RecognitionException {
		String text = null;

		int variableText_StartIndex = input.index();

		Token var1=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 42) ) { return text; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1176:3: ( (var1= IDENTIFIER ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1177:3: (var1= IDENTIFIER )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1177:3: (var1= IDENTIFIER )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1179:4: var1= IDENTIFIER
			{
			var1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_variableText9961); if (state.failed) return text;
			if ( state.backtracking==0 ) {
			 		text = (var1!=null?var1.getText():null).toUpperCase();
			 		}
			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 42, variableText_StartIndex); }

		}
		return text;
	}
	// $ANTLR end "variableText"



	// $ANTLR start "identifierText"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1185:2: identifierText returns [String text] : ( (id1= IDENTIFIER ) | ( QUOTE_DOUBLE id2= IDENTIFIER QUOTE_DOUBLE ) | ( QUOTE_DOUBLE id2= IDENTIFIER ( DIV id3= IDENTIFIER )* DOT (id4= IDENTIFIER ) QUOTE_DOUBLE ) ) ;
	public final String identifierText() throws RecognitionException {
		String text = null;

		int identifierText_StartIndex = input.index();

		Token id1=null;
		Token id2=null;
		Token id3=null;
		Token id4=null;

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 43) ) { return text; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1186:3: ( ( (id1= IDENTIFIER ) | ( QUOTE_DOUBLE id2= IDENTIFIER QUOTE_DOUBLE ) | ( QUOTE_DOUBLE id2= IDENTIFIER ( DIV id3= IDENTIFIER )* DOT (id4= IDENTIFIER ) QUOTE_DOUBLE ) ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1187:3: ( (id1= IDENTIFIER ) | ( QUOTE_DOUBLE id2= IDENTIFIER QUOTE_DOUBLE ) | ( QUOTE_DOUBLE id2= IDENTIFIER ( DIV id3= IDENTIFIER )* DOT (id4= IDENTIFIER ) QUOTE_DOUBLE ) )
			{
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1187:3: ( (id1= IDENTIFIER ) | ( QUOTE_DOUBLE id2= IDENTIFIER QUOTE_DOUBLE ) | ( QUOTE_DOUBLE id2= IDENTIFIER ( DIV id3= IDENTIFIER )* DOT (id4= IDENTIFIER ) QUOTE_DOUBLE ) )
			int alt52=3;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==IDENTIFIER) ) {
				alt52=1;
			}
			else if ( (LA52_0==QUOTE_DOUBLE) ) {
				int LA52_2 = input.LA(2);
				if ( (LA52_2==IDENTIFIER) ) {
					int LA52_3 = input.LA(3);
					if ( (LA52_3==QUOTE_DOUBLE) ) {
						alt52=2;
					}
					else if ( (LA52_3==DIV||LA52_3==DOT) ) {
						alt52=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return text;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 52, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return text;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 52, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return text;}
				NoViableAltException nvae =
					new NoViableAltException("", 52, 0, input);
				throw nvae;
			}

			switch (alt52) {
				case 1 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1188:4: (id1= IDENTIFIER )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1188:4: (id1= IDENTIFIER )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1189:4: id1= IDENTIFIER
					{
					id1=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierText10013); if (state.failed) return text;
					if ( state.backtracking==0 ) {
					                	text = (id1!=null?id1.getText():null).toUpperCase();
					                }
					}

					}
					break;
				case 2 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1194:11: ( QUOTE_DOUBLE id2= IDENTIFIER QUOTE_DOUBLE )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1194:11: ( QUOTE_DOUBLE id2= IDENTIFIER QUOTE_DOUBLE )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1195:11: QUOTE_DOUBLE id2= IDENTIFIER QUOTE_DOUBLE
					{
					match(input,QUOTE_DOUBLE,FOLLOW_QUOTE_DOUBLE_in_identifierText10069); if (state.failed) return text;
					id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierText10085); if (state.failed) return text;
					if ( state.backtracking==0 ) {
					                	text = (id2!=null?id2.getText():null);
					                }
					match(input,QUOTE_DOUBLE,FOLLOW_QUOTE_DOUBLE_in_identifierText10105); if (state.failed) return text;
					}

					}
					break;
				case 3 :
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1202:11: ( QUOTE_DOUBLE id2= IDENTIFIER ( DIV id3= IDENTIFIER )* DOT (id4= IDENTIFIER ) QUOTE_DOUBLE )
					{
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1202:11: ( QUOTE_DOUBLE id2= IDENTIFIER ( DIV id3= IDENTIFIER )* DOT (id4= IDENTIFIER ) QUOTE_DOUBLE )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1203:12: QUOTE_DOUBLE id2= IDENTIFIER ( DIV id3= IDENTIFIER )* DOT (id4= IDENTIFIER ) QUOTE_DOUBLE
					{
					match(input,QUOTE_DOUBLE,FOLLOW_QUOTE_DOUBLE_in_identifierText10161); if (state.failed) return text;
					id2=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierText10178); if (state.failed) return text;
					if ( state.backtracking==0 ) {
									        text = (id2!=null?id2.getText():null);
								}
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1207:11: ( DIV id3= IDENTIFIER )*
					loop51:
					while (true) {
						int alt51=2;
						int LA51_0 = input.LA(1);
						if ( (LA51_0==DIV) ) {
							alt51=1;
						}

						switch (alt51) {
						case 1 :
							// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1208:13: DIV id3= IDENTIFIER
							{
							match(input,DIV,FOLLOW_DIV_in_identifierText10208); if (state.failed) return text;
							id3=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierText10226); if (state.failed) return text;
							if ( state.backtracking==0 ) {
												        text += "/";
												        text += (id3!=null?id3.getText():null);
											}
							}
							break;

						default :
							break loop51;
						}
					}

					match(input,DOT,FOLLOW_DOT_in_identifierText10239); if (state.failed) return text;
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1215:4: (id4= IDENTIFIER )
					// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1216:5: id4= IDENTIFIER
					{
					id4=(Token)match(input,IDENTIFIER,FOLLOW_IDENTIFIER_in_identifierText10254); if (state.failed) return text;
					if ( state.backtracking==0 ) {
								        	text += ".";
								        	text += (id4!=null?id4.getText():null);
								        }
					}

					match(input,QUOTE_DOUBLE,FOLLOW_QUOTE_DOUBLE_in_identifierText10287); if (state.failed) return text;
					}

					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 43, identifierText_StartIndex); }

		}
		return text;
	}
	// $ANTLR end "identifierText"


	public static class tokenAddOperator_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tokenAddOperator"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1226:1: tokenAddOperator : ( PLUS | MINUS ) ;
	public final FunSQLParser.tokenAddOperator_return tokenAddOperator() throws RecognitionException {
		FunSQLParser.tokenAddOperator_return retval = new FunSQLParser.tokenAddOperator_return();
		retval.start = input.LT(1);
		int tokenAddOperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 44) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1227:5: ( ( PLUS | MINUS ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:
			{
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 44, tokenAddOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tokenAddOperator"


	public static class tokenMultOperator_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tokenMultOperator"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1234:1: tokenMultOperator : ( MULT | DIV ) ;
	public final FunSQLParser.tokenMultOperator_return tokenMultOperator() throws RecognitionException {
		FunSQLParser.tokenMultOperator_return retval = new FunSQLParser.tokenMultOperator_return();
		retval.start = input.LT(1);
		int tokenMultOperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 45) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1235:5: ( ( MULT | DIV ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:
			{
			if ( input.LA(1)==DIV||input.LA(1)==MULT ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 45, tokenMultOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tokenMultOperator"


	public static class tokenCompOperator_return extends ParserRuleReturnScope {
	};


	// $ANTLR start "tokenCompOperator"
	// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1242:1: tokenCompOperator : ( EQUAL1 | NOT_EQUAL1 | NOT_EQUAL2 | LESS_THAN | LESS_EQUAL1 | LESS_EQUAL2 | GREATER_EQUAL1 | GREATER_EQUAL2 | GREATER_THAN | KEYWORD_LIKE ) ;
	public final FunSQLParser.tokenCompOperator_return tokenCompOperator() throws RecognitionException {
		FunSQLParser.tokenCompOperator_return retval = new FunSQLParser.tokenCompOperator_return();
		retval.start = input.LT(1);
		int tokenCompOperator_StartIndex = input.index();

		try {
			if ( state.backtracking>0 && alreadyParsedRule(input, 46) ) { return retval; }

			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:1243:5: ( ( EQUAL1 | NOT_EQUAL1 | NOT_EQUAL2 | LESS_THAN | LESS_EQUAL1 | LESS_EQUAL2 | GREATER_EQUAL1 | GREATER_EQUAL2 | GREATER_THAN | KEYWORD_LIKE ) )
			// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:
			{
			if ( input.LA(1)==EQUAL1||(input.LA(1) >= GREATER_EQUAL1 && input.LA(1) <= GREATER_THAN)||input.LA(1)==KEYWORD_LIKE||(input.LA(1) >= LESS_EQUAL1 && input.LA(1) <= LESS_THAN)||(input.LA(1) >= NOT_EQUAL1 && input.LA(1) <= NOT_EQUAL2) ) {
				input.consume();
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

		}

		    catch (RecognitionException e) {
		    	reportError(e);
		        throw e;
		    }

		finally {
			// do for sure before leaving
			if ( state.backtracking>0 ) { memoize(input, 46, tokenCompOperator_StartIndex); }

		}
		return retval;
	}
	// $ANTLR end "tokenCompOperator"

	// $ANTLR start synpred45_FunSQL
	public final void synpred45_FunSQL_fragment() throws RecognitionException {
		AbstractPredicate predicate1 =null;

		// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:703:3: (predicate1= parenPredicate )
		// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:703:3: predicate1= parenPredicate
		{
		pushFollow(FOLLOW_parenPredicate_in_synpred45_FunSQL7110);
		predicate1=parenPredicate();
		state._fsp--;
		if (state.failed) return;
		}

	}
	// $ANTLR end synpred45_FunSQL

	// $ANTLR start synpred56_FunSQL
	public final void synpred56_FunSQL_fragment() throws RecognitionException {
		TokenIdentifier schema1 =null;
		TokenIdentifier id1 =null;

		// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:912:9: ( ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier ) )
		// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:912:9: ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier )
		{
		// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:912:9: ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier )
		// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:913:17: (schema1= tokenIdentifier DOT )? id1= tokenIdentifier
		{
		// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:913:17: (schema1= tokenIdentifier DOT )?
		int alt75=2;
		alt75 = dfa75.predict(input);
		switch (alt75) {
			case 1 :
				// /Users/cbinnig/Workspace/XDB/src/org/xdb/funsql/compile/antlr/FunSQL.g:914:17: schema1= tokenIdentifier DOT
				{
				pushFollow(FOLLOW_tokenIdentifier_in_synpred56_FunSQL8158);
				schema1=tokenIdentifier();
				state._fsp--;
				if (state.failed) return;
				match(input,DOT,FOLLOW_DOT_in_synpred56_FunSQL8178); if (state.failed) return;
				}
				break;

		}

		pushFollow(FOLLOW_tokenIdentifier_in_synpred56_FunSQL8235);
		id1=tokenIdentifier();
		state._fsp--;
		if (state.failed) return;
		}

		}

	}
	// $ANTLR end synpred56_FunSQL

	// Delegated rules

	public final boolean synpred56_FunSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred56_FunSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred45_FunSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred45_FunSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA9 dfa9 = new DFA9(this);
	protected DFA11 dfa11 = new DFA11(this);
	protected DFA41 dfa41 = new DFA41(this);
	protected DFA44 dfa44 = new DFA44(this);
	protected DFA42 dfa42 = new DFA42(this);
	protected DFA45 dfa45 = new DFA45(this);
	protected DFA75 dfa75 = new DFA75(this);
	static final String DFA9_eotS =
		"\15\uffff";
	static final String DFA9_eofS =
		"\15\uffff";
	static final String DFA9_minS =
		"\1\15\1\41\1\uffff\1\15\1\41\1\uffff\1\21\1\15\2\41\1\21\1\145\1\15";
	static final String DFA9_maxS =
		"\1\152\1\145\1\uffff\1\152\1\41\1\uffff\1\145\1\152\2\41\1\23\1\145\1"+
		"\152";
	static final String DFA9_acceptS =
		"\2\uffff\1\2\2\uffff\1\1\7\uffff";
	static final String DFA9_specialS =
		"\15\uffff}>";
	static final String[] DFA9_transitionS = {
			"\1\1\134\uffff\1\2",
			"\1\3\103\uffff\1\4",
			"",
			"\1\5\50\uffff\1\2\15\uffff\1\2\45\uffff\1\5",
			"\1\6",
			"",
			"\1\10\1\uffff\1\11\121\uffff\1\7",
			"\1\5\50\uffff\1\2\15\uffff\1\2\45\uffff\1\5",
			"\1\12",
			"\1\13",
			"\1\10\1\uffff\1\11",
			"\1\14",
			"\1\5\50\uffff\1\2\15\uffff\1\2\45\uffff\1\5"
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 353:23: ( COMMA c3= tokenIdentifier )*";
		}
	}

	static final String DFA11_eotS =
		"\15\uffff";
	static final String DFA11_eofS =
		"\15\uffff";
	static final String DFA11_minS =
		"\1\15\1\uffff\1\41\1\15\1\41\1\uffff\1\21\1\15\2\41\1\21\1\145\1\15";
	static final String DFA11_maxS =
		"\1\152\1\uffff\1\145\1\152\1\41\1\uffff\1\145\1\152\2\41\1\23\1\145\1"+
		"\152";
	static final String DFA11_acceptS =
		"\1\uffff\1\2\3\uffff\1\1\7\uffff";
	static final String DFA11_specialS =
		"\15\uffff}>";
	static final String[] DFA11_transitionS = {
			"\1\2\134\uffff\1\1",
			"",
			"\1\3\103\uffff\1\4",
			"\1\5\50\uffff\1\1\15\uffff\1\1\45\uffff\1\5",
			"\1\6",
			"",
			"\1\10\1\uffff\1\11\121\uffff\1\7",
			"\1\5\50\uffff\1\1\15\uffff\1\1\45\uffff\1\5",
			"\1\12",
			"\1\13",
			"\1\10\1\uffff\1\11",
			"\1\14",
			"\1\5\50\uffff\1\1\15\uffff\1\1\45\uffff\1\5"
	};

	static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
	static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
	static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
	static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
	static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
	static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
	static final short[][] DFA11_transition;

	static {
		int numStates = DFA11_transitionS.length;
		DFA11_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
		}
	}

	protected class DFA11 extends DFA {

		public DFA11(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 11;
			this.eot = DFA11_eot;
			this.eof = DFA11_eof;
			this.min = DFA11_min;
			this.max = DFA11_max;
			this.accept = DFA11_accept;
			this.special = DFA11_special;
			this.transition = DFA11_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 381:25: ( COMMA c3= tokenIdentifier )*";
		}
	}

	static final String DFA41_eotS =
		"\14\uffff";
	static final String DFA41_eofS =
		"\1\uffff\1\4\4\uffff\1\4\4\uffff\1\4";
	static final String DFA41_minS =
		"\1\41\1\15\1\41\2\uffff\1\21\1\15\2\41\1\21\1\145\1\15";
	static final String DFA41_maxS =
		"\1\145\1\154\1\41\2\uffff\1\145\1\154\2\41\1\23\1\145\1\154";
	static final String DFA41_acceptS =
		"\3\uffff\1\1\1\2\7\uffff";
	static final String DFA41_specialS =
		"\14\uffff}>";
	static final String[] DFA41_transitionS = {
			"\1\1\103\uffff\1\2",
			"\1\4\3\uffff\1\4\1\uffff\1\3\2\uffff\1\4\4\uffff\3\4\7\uffff\2\4\13"+
			"\uffff\1\4\1\uffff\2\4\3\uffff\1\4\4\uffff\1\4\4\uffff\1\4\14\uffff\3"+
			"\4\5\uffff\1\4\1\uffff\1\4\1\uffff\2\4\3\uffff\1\4\10\uffff\1\4\1\uffff"+
			"\1\4",
			"\1\5",
			"",
			"",
			"\1\7\1\uffff\1\10\121\uffff\1\6",
			"\1\4\3\uffff\1\4\1\uffff\1\3\2\uffff\1\4\4\uffff\3\4\7\uffff\2\4\13"+
			"\uffff\1\4\1\uffff\2\4\3\uffff\1\4\4\uffff\1\4\4\uffff\1\4\14\uffff\3"+
			"\4\5\uffff\1\4\1\uffff\1\4\1\uffff\2\4\3\uffff\1\4\10\uffff\1\4\1\uffff"+
			"\1\4",
			"\1\11",
			"\1\12",
			"\1\7\1\uffff\1\10",
			"\1\13",
			"\1\4\3\uffff\1\4\1\uffff\1\3\2\uffff\1\4\4\uffff\3\4\7\uffff\2\4\13"+
			"\uffff\1\4\1\uffff\2\4\3\uffff\1\4\4\uffff\1\4\4\uffff\1\4\14\uffff\3"+
			"\4\5\uffff\1\4\1\uffff\1\4\1\uffff\2\4\3\uffff\1\4\10\uffff\1\4\1\uffff"+
			"\1\4"
	};

	static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
	static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
	static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
	static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
	static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
	static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
	static final short[][] DFA41_transition;

	static {
		int numStates = DFA41_transitionS.length;
		DFA41_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
		}
	}

	protected class DFA41 extends DFA {

		public DFA41(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 41;
			this.eot = DFA41_eot;
			this.eof = DFA41_eof;
			this.min = DFA41_min;
			this.max = DFA41_max;
			this.accept = DFA41_accept;
			this.special = DFA41_special;
			this.transition = DFA41_transition;
		}
		@Override
		public String getDescription() {
			return "893:17: (table1= tokenIdentifier DOT )?";
		}
	}

	static final String DFA44_eotS =
		"\14\uffff";
	static final String DFA44_eofS =
		"\14\uffff";
	static final String DFA44_minS =
		"\1\14\1\0\1\41\2\uffff\1\21\1\0\2\41\1\21\1\145\1\0";
	static final String DFA44_maxS =
		"\1\145\1\0\1\41\2\uffff\1\145\1\0\2\41\1\23\1\145\1\0";
	static final String DFA44_acceptS =
		"\3\uffff\1\2\1\1\7\uffff";
	static final String DFA44_specialS =
		"\1\uffff\1\2\4\uffff\1\0\4\uffff\1\1}>";
	static final String[] DFA44_transitionS = {
			"\1\3\24\uffff\1\1\103\uffff\1\2",
			"\1\uffff",
			"\1\5",
			"",
			"",
			"\1\7\1\uffff\1\10\121\uffff\1\6",
			"\1\uffff",
			"\1\11",
			"\1\12",
			"\1\7\1\uffff\1\10",
			"\1\13",
			"\1\uffff"
	};

	static final short[] DFA44_eot = DFA.unpackEncodedString(DFA44_eotS);
	static final short[] DFA44_eof = DFA.unpackEncodedString(DFA44_eofS);
	static final char[] DFA44_min = DFA.unpackEncodedStringToUnsignedChars(DFA44_minS);
	static final char[] DFA44_max = DFA.unpackEncodedStringToUnsignedChars(DFA44_maxS);
	static final short[] DFA44_accept = DFA.unpackEncodedString(DFA44_acceptS);
	static final short[] DFA44_special = DFA.unpackEncodedString(DFA44_specialS);
	static final short[][] DFA44_transition;

	static {
		int numStates = DFA44_transitionS.length;
		DFA44_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA44_transition[i] = DFA.unpackEncodedString(DFA44_transitionS[i]);
		}
	}

	protected class DFA44 extends DFA {

		public DFA44(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 44;
			this.eot = DFA44_eot;
			this.eof = DFA44_eof;
			this.min = DFA44_min;
			this.max = DFA44_max;
			this.accept = DFA44_accept;
			this.special = DFA44_special;
			this.transition = DFA44_transition;
		}
		@Override
		public String getDescription() {
			return "907:1: tokenTable returns [TokenTable table] : ( ( (schema1= tokenIdentifier DOT )? id1= tokenIdentifier ) | ( ( COLON )? id1= tokenIdentifier ) );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA44_6 = input.LA(1);
						 
						int index44_6 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_FunSQL()) ) {s = 4;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index44_6);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA44_11 = input.LA(1);
						 
						int index44_11 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_FunSQL()) ) {s = 4;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index44_11);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA44_1 = input.LA(1);
						 
						int index44_1 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred56_FunSQL()) ) {s = 4;}
						else if ( (true) ) {s = 3;}
						 
						input.seek(index44_1);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 44, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA42_eotS =
		"\14\uffff";
	static final String DFA42_eofS =
		"\1\uffff\1\4\4\uffff\1\4\4\uffff\1\4";
	static final String DFA42_minS =
		"\1\41\1\15\1\41\2\uffff\1\21\1\15\2\41\1\21\1\145\1\15";
	static final String DFA42_maxS =
		"\1\145\1\154\1\41\2\uffff\1\145\1\154\2\41\1\23\1\145\1\154";
	static final String DFA42_acceptS =
		"\3\uffff\1\1\1\2\7\uffff";
	static final String DFA42_specialS =
		"\14\uffff}>";
	static final String[] DFA42_transitionS = {
			"\1\1\103\uffff\1\2",
			"\1\4\5\uffff\1\3\22\uffff\1\4\15\uffff\2\4\12\uffff\1\4\14\uffff\1\4"+
			"\10\uffff\1\4\25\uffff\1\4",
			"\1\5",
			"",
			"",
			"\1\7\1\uffff\1\10\121\uffff\1\6",
			"\1\4\5\uffff\1\3\22\uffff\1\4\15\uffff\2\4\12\uffff\1\4\14\uffff\1\4"+
			"\10\uffff\1\4\25\uffff\1\4",
			"\1\11",
			"\1\12",
			"\1\7\1\uffff\1\10",
			"\1\13",
			"\1\4\5\uffff\1\3\22\uffff\1\4\15\uffff\2\4\12\uffff\1\4\14\uffff\1\4"+
			"\10\uffff\1\4\25\uffff\1\4"
	};

	static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
	static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
	static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
	static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
	static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
	static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
	static final short[][] DFA42_transition;

	static {
		int numStates = DFA42_transitionS.length;
		DFA42_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
		}
	}

	protected class DFA42 extends DFA {

		public DFA42(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 42;
			this.eot = DFA42_eot;
			this.eof = DFA42_eof;
			this.min = DFA42_min;
			this.max = DFA42_max;
			this.accept = DFA42_accept;
			this.special = DFA42_special;
			this.transition = DFA42_transition;
		}
		@Override
		public String getDescription() {
			return "913:17: (schema1= tokenIdentifier DOT )?";
		}
	}

	static final String DFA45_eotS =
		"\14\uffff";
	static final String DFA45_eofS =
		"\1\uffff\1\4\4\uffff\1\4\4\uffff\1\4";
	static final String DFA45_minS =
		"\1\41\1\23\1\41\2\uffff\1\21\1\23\2\41\1\21\1\145\1\23";
	static final String DFA45_maxS =
		"\1\145\1\154\1\41\2\uffff\1\145\1\154\2\41\1\23\1\145\1\154";
	static final String DFA45_acceptS =
		"\3\uffff\1\1\1\2\7\uffff";
	static final String DFA45_specialS =
		"\14\uffff}>";
	static final String[] DFA45_transitionS = {
			"\1\1\103\uffff\1\2",
			"\1\3\102\uffff\1\4\25\uffff\1\4",
			"\1\5",
			"",
			"",
			"\1\7\1\uffff\1\10\121\uffff\1\6",
			"\1\3\102\uffff\1\4\25\uffff\1\4",
			"\1\11",
			"\1\12",
			"\1\7\1\uffff\1\10",
			"\1\13",
			"\1\3\102\uffff\1\4\25\uffff\1\4"
	};

	static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
	static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
	static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
	static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
	static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
	static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
	static final short[][] DFA45_transition;

	static {
		int numStates = DFA45_transitionS.length;
		DFA45_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
		}
	}

	protected class DFA45 extends DFA {

		public DFA45(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 45;
			this.eot = DFA45_eot;
			this.eof = DFA45_eof;
			this.min = DFA45_min;
			this.max = DFA45_max;
			this.accept = DFA45_accept;
			this.special = DFA45_special;
			this.transition = DFA45_transition;
		}
		@Override
		public String getDescription() {
			return "953:33: (schema1= tokenIdentifier DOT )?";
		}
	}

	static final String DFA75_eotS =
		"\14\uffff";
	static final String DFA75_eofS =
		"\1\uffff\1\4\4\uffff\1\4\4\uffff\1\4";
	static final String DFA75_minS =
		"\1\41\1\23\1\41\2\uffff\1\21\1\23\2\41\1\21\1\145\1\23";
	static final String DFA75_maxS =
		"\1\145\1\23\1\41\2\uffff\1\145\1\23\2\41\1\23\1\145\1\23";
	static final String DFA75_acceptS =
		"\3\uffff\1\1\1\2\7\uffff";
	static final String DFA75_specialS =
		"\14\uffff}>";
	static final String[] DFA75_transitionS = {
			"\1\1\103\uffff\1\2",
			"\1\3",
			"\1\5",
			"",
			"",
			"\1\7\1\uffff\1\10\121\uffff\1\6",
			"\1\3",
			"\1\11",
			"\1\12",
			"\1\7\1\uffff\1\10",
			"\1\13",
			"\1\3"
	};

	static final short[] DFA75_eot = DFA.unpackEncodedString(DFA75_eotS);
	static final short[] DFA75_eof = DFA.unpackEncodedString(DFA75_eofS);
	static final char[] DFA75_min = DFA.unpackEncodedStringToUnsignedChars(DFA75_minS);
	static final char[] DFA75_max = DFA.unpackEncodedStringToUnsignedChars(DFA75_maxS);
	static final short[] DFA75_accept = DFA.unpackEncodedString(DFA75_acceptS);
	static final short[] DFA75_special = DFA.unpackEncodedString(DFA75_specialS);
	static final short[][] DFA75_transition;

	static {
		int numStates = DFA75_transitionS.length;
		DFA75_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA75_transition[i] = DFA.unpackEncodedString(DFA75_transitionS[i]);
		}
	}

	protected class DFA75 extends DFA {

		public DFA75(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 75;
			this.eot = DFA75_eot;
			this.eof = DFA75_eof;
			this.min = DFA75_min;
			this.max = DFA75_max;
			this.accept = DFA75_accept;
			this.special = DFA75_special;
			this.transition = DFA75_transition;
		}
		@Override
		public String getDescription() {
			return "913:17: (schema1= tokenIdentifier DOT )?";
		}
	}

	public static final BitSet FOLLOW_createSchemaStatement_in_statement1106 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_dropSchemaStatement_in_statement1161 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_createConnectionStatement_in_statement1216 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_dropConnectionStatement_in_statement1271 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_createTableStatement_in_statement1326 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_dropTableStatement_in_statement1381 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_createFunctionStatement_in_statement1436 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_dropFunctionStatement_in_statement1491 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_callFunctionStatement_in_statement1546 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_selectStatement_in_statement1601 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_loadDataInfileStatement_in_statement1655 = new BitSet(new long[]{0x0000000000000002L,0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement1709 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_CREATE_in_createSchemaStatement1787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_KEYWORD_SCHEMA_in_createSchemaStatement1805 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenSchema_in_createSchemaStatement1823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_DROP_in_dropSchemaStatement1902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_KEYWORD_SCHEMA_in_dropSchemaStatement1920 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenSchema_in_dropSchemaStatement1938 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_CREATE_in_createConnectionStatement2017 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_KEYWORD_CONNECTION_in_createConnectionStatement2035 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_createConnectionStatement2053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_KEYWORD_URL_in_createConnectionStatement2073 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_tokenStringLiteral_in_createConnectionStatement2093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_KEYWORD_USER_in_createConnectionStatement2113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_tokenStringLiteral_in_createConnectionStatement2133 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KEYWORD_PASSWD_in_createConnectionStatement2153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_tokenStringLiteral_in_createConnectionStatement2173 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_KEYWORD_STORE_in_createConnectionStatement2193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_tokenStringLiteral_in_createConnectionStatement2213 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_DROP_in_dropConnectionStatement2300 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_KEYWORD_CONNECTION_in_dropConnectionStatement2318 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_dropConnectionStatement2336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_CREATE_in_createTableStatement2416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_KEYWORD_TABLE_in_createTableStatement2434 = new BitSet(new long[]{0x0000000200001000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenTable_in_createTableStatement2454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LPAREN_in_createTableStatement2474 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_identifierText_in_createTableStatement2494 = new BitSet(new long[]{0x0000000000000000L,0x001E000000000000L});
	public static final BitSet FOLLOW_tokenDataType_in_createTableStatement2532 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_COMMA_in_createTableStatement2586 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_identifierText_in_createTableStatement2606 = new BitSet(new long[]{0x0000000000000000L,0x001E000000000000L});
	public static final BitSet FOLLOW_tokenDataType_in_createTableStatement2644 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_createTableStatement2699 = new BitSet(new long[]{0x0040000000000002L,0x0000000000000012L});
	public static final BitSet FOLLOW_KEYWORD_IN_in_createTableStatement2776 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_KEYWORD_CONNECTION_in_createTableStatement2778 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_createTableStatement2802 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_REPLICATED_in_createTableStatement2887 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_KEYWORD_IN_in_createTableStatement2889 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_KEYWORD_CONNECTION_in_createTableStatement2891 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_createTableStatement2916 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_createTableStatement2965 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_createTableStatement2992 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_PARTITIONED_in_createTableStatement3143 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_KEYWORD_BY_in_createTableStatement3145 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_identifierText_in_createTableStatement3166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LPAREN_in_createTableStatement3236 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenAttribute_in_createTableStatement3256 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000008L});
	public static final BitSet FOLLOW_KEYWORD_REFERENCES_in_createTableStatement3295 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenAttribute_in_createTableStatement3299 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_COMMA_in_createTableStatement3357 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenAttribute_in_createTableStatement3379 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000008L});
	public static final BitSet FOLLOW_KEYWORD_REFERENCES_in_createTableStatement3422 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenAttribute_in_createTableStatement3426 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_createTableStatement3485 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_LPAREN_in_createTableStatement3577 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_identifierText_in_createTableStatement3599 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KEYWORD_IN_in_createTableStatement3688 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_KEYWORD_CONNECTION_in_createTableStatement3690 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_createTableStatement3716 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_KEYWORD_REPLICATED_in_createTableStatement3808 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_KEYWORD_IN_in_createTableStatement3810 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_KEYWORD_CONNECTION_in_createTableStatement3812 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_createTableStatement3838 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_COMMA_in_createTableStatement3890 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_createTableStatement3919 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_COMMA_in_createTableStatement4051 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_identifierText_in_createTableStatement4075 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_KEYWORD_IN_in_createTableStatement4173 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_KEYWORD_CONNECTION_in_createTableStatement4175 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_createTableStatement4203 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_KEYWORD_REPLICATED_in_createTableStatement4303 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_KEYWORD_IN_in_createTableStatement4305 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_KEYWORD_CONNECTION_in_createTableStatement4307 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_createTableStatement4335 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_COMMA_in_createTableStatement4391 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_createTableStatement4423 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_createTableStatement4562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_DROP_in_dropTableStatement4708 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_KEYWORD_TABLE_in_dropTableStatement4726 = new BitSet(new long[]{0x0000000200001000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenTable_in_dropTableStatement4746 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_CREATE_in_createFunctionStatement4812 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_KEYWORD_FUNCTION_in_createFunctionStatement4830 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenFunction_in_createFunctionStatement4850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LPAREN_in_createFunctionStatement4866 = new BitSet(new long[]{0x8040000000000000L});
	public static final BitSet FOLLOW_KEYWORD_IN_in_createFunctionStatement4895 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tokenVariable_in_createFunctionStatement4915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_KEYWORD_TABLE_in_createFunctionStatement4922 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_createFunctionStatement4928 = new BitSet(new long[]{0x8040000000000000L});
	public static final BitSet FOLLOW_KEYWORD_OUT_in_createFunctionStatement4966 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tokenVariable_in_createFunctionStatement4986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_KEYWORD_TABLE_in_createFunctionStatement4993 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_COMMA_in_createFunctionStatement5006 = new BitSet(new long[]{0x8000000000000000L});
	public static final BitSet FOLLOW_KEYWORD_OUT_in_createFunctionStatement5011 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tokenVariable_in_createFunctionStatement5025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_KEYWORD_TABLE_in_createFunctionStatement5031 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_createFunctionStatement5040 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_KEYWORD_BEGIN_in_createFunctionStatement5044 = new BitSet(new long[]{0x0002040000001000L,0x0000000000001000L});
	public static final BitSet FOLLOW_tokenAssignment_in_createFunctionStatement5058 = new BitSet(new long[]{0x0002040000001000L,0x0000000000001000L});
	public static final BitSet FOLLOW_tokenFunctionCall_in_createFunctionStatement5137 = new BitSet(new long[]{0x0002040000001000L,0x0000000000001000L});
	public static final BitSet FOLLOW_KEYWORD_END_in_createFunctionStatement5179 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_createFunctionStatement5186 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_DROP_in_dropFunctionStatement5263 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_KEYWORD_FUNCTION_in_dropFunctionStatement5281 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenFunction_in_dropFunctionStatement5301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_CALL_in_callFunctionStatement5367 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_KEYWORD_FUNCTION_in_callFunctionStatement5385 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenFunction_in_callFunctionStatement5405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_SELECT_in_selectStatement5482 = new BitSet(new long[]{0x0000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_abstractExpression_in_selectStatement5502 = new BitSet(new long[]{0x0004004000002000L});
	public static final BitSet FOLLOW_KEYWORD_AS_in_selectStatement5557 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_selectStatement5578 = new BitSet(new long[]{0x0004000000002000L});
	public static final BitSet FOLLOW_COMMA_in_selectStatement5652 = new BitSet(new long[]{0x0000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_abstractExpression_in_selectStatement5672 = new BitSet(new long[]{0x0004004000002000L});
	public static final BitSet FOLLOW_KEYWORD_AS_in_selectStatement5727 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_selectStatement5748 = new BitSet(new long[]{0x0004000000002000L});
	public static final BitSet FOLLOW_KEYWORD_FROM_in_selectStatement5857 = new BitSet(new long[]{0x0000000200001000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenTable_in_selectStatement5877 = new BitSet(new long[]{0x0030004000002002L,0x0000000000002000L});
	public static final BitSet FOLLOW_KEYWORD_AS_in_selectStatement5933 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_selectStatement5954 = new BitSet(new long[]{0x0030000000002002L,0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_selectStatement6028 = new BitSet(new long[]{0x0000000200001000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenTable_in_selectStatement6048 = new BitSet(new long[]{0x0030004000002002L,0x0000000000002000L});
	public static final BitSet FOLLOW_KEYWORD_AS_in_selectStatement6103 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_selectStatement6124 = new BitSet(new long[]{0x0030000000002002L,0x0000000000002000L});
	public static final BitSet FOLLOW_KEYWORD_WHERE_in_selectStatement6234 = new BitSet(new long[]{0x2000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_abstractPredicate_in_selectStatement6254 = new BitSet(new long[]{0x0030000000000002L});
	public static final BitSet FOLLOW_KEYWORD_GROUP_in_selectStatement6361 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_KEYWORD_BY_in_selectStatement6363 = new BitSet(new long[]{0x0000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_abstractExpression_in_selectStatement6383 = new BitSet(new long[]{0x0020000000002002L});
	public static final BitSet FOLLOW_COMMA_in_selectStatement6437 = new BitSet(new long[]{0x0000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_abstractExpression_in_selectStatement6457 = new BitSet(new long[]{0x0020000000002002L});
	public static final BitSet FOLLOW_KEYWORD_HAVING_in_selectStatement6583 = new BitSet(new long[]{0x2000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_abstractPredicate_in_selectStatement6603 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_LOAD_in_loadDataInfileStatement6696 = new BitSet(new long[]{0x0000400000000000L});
	public static final BitSet FOLLOW_KEYWORD_DATA_in_loadDataInfileStatement6706 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_KEYWORD_INFILE_in_loadDataInfileStatement6716 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_identifierText_in_loadDataInfileStatement6728 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_KEYWORD_INTO_in_loadDataInfileStatement6740 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_KEYWORD_TABLE_in_loadDataInfileStatement6750 = new BitSet(new long[]{0x0000000200001000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenTable_in_loadDataInfileStatement6762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
	public static final BitSet FOLLOW_KEYWORD_PARTITION_in_loadDataInfileStatement6785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LPAREN_in_loadDataInfileStatement6796 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_identifierText_in_loadDataInfileStatement6809 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_COMMA_in_loadDataInfileStatement6834 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_identifierText_in_loadDataInfileStatement6848 = new BitSet(new long[]{0x0000000000002000L,0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_loadDataInfileStatement6873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexPredicateOr_in_abstractPredicate6914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexPredicateAnd_in_complexPredicateOr6952 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_OR_in_complexPredicateOr6963 = new BitSet(new long[]{0x2000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_complexPredicateAnd_in_complexPredicateOr6971 = new BitSet(new long[]{0x4000000000000002L});
	public static final BitSet FOLLOW_complexPredicateNot_in_complexPredicateAnd7010 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_KEYWORD_AND_in_complexPredicateAnd7021 = new BitSet(new long[]{0x2000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_complexPredicateNot_in_complexPredicateAnd7029 = new BitSet(new long[]{0x0000002000000002L});
	public static final BitSet FOLLOW_KEYWORD_NOT_in_complexPredicateNot7070 = new BitSet(new long[]{0x0000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_complexPredicate_in_complexPredicateNot7083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenPredicate_in_complexPredicate7110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simplePredicate_in_complexPredicate7125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parenPredicate7150 = new BitSet(new long[]{0x2000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_abstractPredicate_in_parenPredicate7157 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_parenPredicate7163 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_abstractExpression_in_simplePredicate7205 = new BitSet(new long[]{0x0200000038400000L,0x0000000030070000L});
	public static final BitSet FOLLOW_tokenCompOperator_in_simplePredicate7260 = new BitSet(new long[]{0x0000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_abstractExpression_in_simplePredicate7298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexExpressionAdd_in_abstractExpression7352 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexExpressionMult_in_complexExpressionAdd7382 = new BitSet(new long[]{0x0000000000000002L,0x0000000201000000L});
	public static final BitSet FOLLOW_tokenAddOperator_in_complexExpressionAdd7395 = new BitSet(new long[]{0x0000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_complexExpressionMult_in_complexExpressionAdd7403 = new BitSet(new long[]{0x0000000000000002L,0x0000000201000000L});
	public static final BitSet FOLLOW_complexExpressionSigned_in_complexExpressionMult7443 = new BitSet(new long[]{0x0000000000020002L,0x0000000004000000L});
	public static final BitSet FOLLOW_tokenMultOperator_in_complexExpressionMult7456 = new BitSet(new long[]{0x0000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_complexExpressionSigned_in_complexExpressionMult7464 = new BitSet(new long[]{0x0000000000020002L,0x0000000004000000L});
	public static final BitSet FOLLOW_MINUS_in_complexExpressionSigned7506 = new BitSet(new long[]{0x0000000202000000L,0x0002002000780000L});
	public static final BitSet FOLLOW_PLUS_in_complexExpressionSigned7515 = new BitSet(new long[]{0x0000000202000000L,0x0002002000780000L});
	public static final BitSet FOLLOW_complexExpression_in_complexExpressionSigned7527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenExpression_in_complexExpression7562 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggregationExpression_in_complexExpression7577 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleExpression_in_complexExpression7592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_parenExpression7617 = new BitSet(new long[]{0x0000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_abstractExpression_in_parenExpression7624 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_parenExpression7630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FUNCTION_AGGREGATION_in_aggregationExpression7682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LPAREN_in_aggregationExpression7690 = new BitSet(new long[]{0x0000800202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_KEYWORD_DISTINCT_in_aggregationExpression7699 = new BitSet(new long[]{0x0000000202000000L,0x0002002201780000L});
	public static final BitSet FOLLOW_abstractExpression_in_aggregationExpression7711 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_aggregationExpression7717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenAttribute_in_simpleExpression7792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenLiteral_in_simpleExpression7848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenIdentifier_in_tokenAttribute7976 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DOT_in_tokenAttribute7996 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_tokenAttribute8035 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenIdentifier_in_tokenTable8158 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DOT_in_tokenTable8178 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_tokenTable8235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_tokenTable8302 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_tokenTable8344 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenIdentifier_in_tokenSchema8425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenIdentifier_in_tokenFunction8541 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DOT_in_tokenFunction8561 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_tokenFunction8600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_variableText_in_tokenVariable8680 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COLON_in_tokenAssignment8747 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tokenVariable_in_tokenAssignment8759 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_EQUAL1_in_tokenAssignment8765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_selectStatement_in_tokenAssignment8772 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_KEYWORD_VAR_in_tokenAssignment8793 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tokenVariable_in_tokenAssignment8802 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_EQUAL1_in_tokenAssignment8808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_selectStatement_in_tokenAssignment8815 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_KEYWORD_VAR_in_tokenAssignment8839 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tokenVariable_in_tokenAssignment8848 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_EQUAL1_in_tokenAssignment8854 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COLON_in_tokenAssignment8865 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tokenVariable_in_tokenAssignment8877 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_tokenAssignment8888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KEYWORD_CALL_in_tokenFunctionCall8920 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_KEYWORD_FUNCTION_in_tokenFunctionCall8925 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenFunction_in_tokenFunctionCall8932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_LPAREN_in_tokenFunctionCall8938 = new BitSet(new long[]{0x0000000000001000L,0x0000000000001000L});
	public static final BitSet FOLLOW_COLON_in_tokenFunctionCall8949 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tokenVariable_in_tokenFunctionCall8962 = new BitSet(new long[]{0x0000000000001000L,0x0000000000001000L});
	public static final BitSet FOLLOW_KEYWORD_VAR_in_tokenFunctionCall8983 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tokenVariable_in_tokenFunctionCall8993 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_COMMA_in_tokenFunctionCall9000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_KEYWORD_VAR_in_tokenFunctionCall9022 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_tokenVariable_in_tokenFunctionCall9032 = new BitSet(new long[]{0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_RPAREN_in_tokenFunctionCall9043 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_SEMI_in_tokenFunctionCall9048 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifierText_in_tokenIdentifier9116 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_VARCHAR_in_tokenDataType9197 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_INTEGER_in_tokenDataType9235 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_DECIMAL_in_tokenDataType9273 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_DATE_in_tokenDataType9311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenIntegerLiteral_in_tokenLiteral9402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenStringLiteral_in_tokenLiteral9440 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenDecimalLiteral_in_tokenLiteral9478 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenDateLiteral_in_tokenLiteral9516 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_STRING_in_tokenStringLiteral9616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_INTEGER_in_tokenIntegerLiteral9696 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LITERAL_DECIMAL_in_tokenDecimalLiteral9786 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TYPE_DATE_in_tokenDateLiteral9884 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_LITERAL_STRING_in_tokenDateLiteral9902 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_variableText9961 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifierText10013 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTE_DOUBLE_in_identifierText10069 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifierText10085 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_QUOTE_DOUBLE_in_identifierText10105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_QUOTE_DOUBLE_in_identifierText10161 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifierText10178 = new BitSet(new long[]{0x00000000000A0000L});
	public static final BitSet FOLLOW_DIV_in_identifierText10208 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifierText10226 = new BitSet(new long[]{0x00000000000A0000L});
	public static final BitSet FOLLOW_DOT_in_identifierText10239 = new BitSet(new long[]{0x0000000200000000L});
	public static final BitSet FOLLOW_IDENTIFIER_in_identifierText10254 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_QUOTE_DOUBLE_in_identifierText10287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_parenPredicate_in_synpred45_FunSQL7110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tokenIdentifier_in_synpred56_FunSQL8158 = new BitSet(new long[]{0x0000000000080000L});
	public static final BitSet FOLLOW_DOT_in_synpred56_FunSQL8178 = new BitSet(new long[]{0x0000000200000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_tokenIdentifier_in_synpred56_FunSQL8235 = new BitSet(new long[]{0x0000000000000002L});
}
