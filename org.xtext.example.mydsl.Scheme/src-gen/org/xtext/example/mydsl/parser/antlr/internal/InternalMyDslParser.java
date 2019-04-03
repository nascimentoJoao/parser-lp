package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_NUMBER", "RULE_BOOL", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_LETTER", "RULE_OPER", "RULE_DIGIT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "'define'", "')'", "'.'", "'<'", "'>'", "'='", "'>='", "'<='", "'cond'", "'else'", "'set!'", "'if'", "'\\\\s'", "'!'", "'$'", "'%'", "'&'", "'*'", "'/'", "':'", "'?'", "'~'", "'_'", "'^'", "'+'", "'-'"
    };
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int RULE_OPER=11;
    public static final int T__18=18;
    public static final int RULE_ID=4;
    public static final int RULE_DIGIT=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=9;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=8;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int RULE_ANY_OTHER=16;
    public static final int RULE_BOOL=6;
    public static final int RULE_NUMBER=5;
    public static final int RULE_LETTER=10;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMyDsl.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMyDsl.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:71:1: ruleProgram returns [EObject current=null] : ( (lv_program_0_0= ruleForm ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( (lv_program_0_0= ruleForm ) )* )
            // InternalMyDsl.g:78:2: ( (lv_program_0_0= ruleForm ) )*
            {
            // InternalMyDsl.g:78:2: ( (lv_program_0_0= ruleForm ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||(LA1_0>=RULE_BOOL && LA1_0<=RULE_LETTER)||LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: (lv_program_0_0= ruleForm )
            	    {
            	    // InternalMyDsl.g:79:3: (lv_program_0_0= ruleForm )
            	    // InternalMyDsl.g:80:4: lv_program_0_0= ruleForm
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getProgramFormParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_program_0_0=ruleForm();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"program",
            	    					lv_program_0_0,
            	    					"org.xtext.example.mydsl.MyDsl.Form");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleForm"
    // InternalMyDsl.g:100:1: entryRuleForm returns [EObject current=null] : iv_ruleForm= ruleForm EOF ;
    public final EObject entryRuleForm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleForm = null;


        try {
            // InternalMyDsl.g:100:45: (iv_ruleForm= ruleForm EOF )
            // InternalMyDsl.g:101:2: iv_ruleForm= ruleForm EOF
            {
             newCompositeNode(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleForm=ruleForm();

            state._fsp--;

             current =iv_ruleForm; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalMyDsl.g:107:1: ruleForm returns [EObject current=null] : ( ( (lv_definition_0_0= ruleDefinition ) ) | ( (lv_expression_1_0= ruleExpression ) ) ) ;
    public final EObject ruleForm() throws RecognitionException {
        EObject current = null;

        EObject lv_definition_0_0 = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:113:2: ( ( ( (lv_definition_0_0= ruleDefinition ) ) | ( (lv_expression_1_0= ruleExpression ) ) ) )
            // InternalMyDsl.g:114:2: ( ( (lv_definition_0_0= ruleDefinition ) ) | ( (lv_expression_1_0= ruleExpression ) ) )
            {
            // InternalMyDsl.g:114:2: ( ( (lv_definition_0_0= ruleDefinition ) ) | ( (lv_expression_1_0= ruleExpression ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==17) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID||(LA2_1>=RULE_BOOL && LA2_1<=RULE_OPER)||LA2_1==17||LA2_1==26||(LA2_1>=28 && LA2_1<=29)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==18) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA2_0==RULE_ID||(LA2_0>=RULE_BOOL && LA2_0<=RULE_LETTER)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:115:3: ( (lv_definition_0_0= ruleDefinition ) )
                    {
                    // InternalMyDsl.g:115:3: ( (lv_definition_0_0= ruleDefinition ) )
                    // InternalMyDsl.g:116:4: (lv_definition_0_0= ruleDefinition )
                    {
                    // InternalMyDsl.g:116:4: (lv_definition_0_0= ruleDefinition )
                    // InternalMyDsl.g:117:5: lv_definition_0_0= ruleDefinition
                    {

                    					newCompositeNode(grammarAccess.getFormAccess().getDefinitionDefinitionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_definition_0_0=ruleDefinition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormRule());
                    					}
                    					add(
                    						current,
                    						"definition",
                    						lv_definition_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Definition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:135:3: ( (lv_expression_1_0= ruleExpression ) )
                    {
                    // InternalMyDsl.g:135:3: ( (lv_expression_1_0= ruleExpression ) )
                    // InternalMyDsl.g:136:4: (lv_expression_1_0= ruleExpression )
                    {
                    // InternalMyDsl.g:136:4: (lv_expression_1_0= ruleExpression )
                    // InternalMyDsl.g:137:5: lv_expression_1_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getFormAccess().getExpressionExpressionParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_expression_1_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFormRule());
                    					}
                    					add(
                    						current,
                    						"expression",
                    						lv_expression_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleDefinition"
    // InternalMyDsl.g:158:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalMyDsl.g:158:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalMyDsl.g:159:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMyDsl.g:165:1: ruleDefinition returns [EObject current=null] : ( (lv_variableDefinition_0_0= ruleVariableDefinition ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        EObject lv_variableDefinition_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:171:2: ( ( (lv_variableDefinition_0_0= ruleVariableDefinition ) ) )
            // InternalMyDsl.g:172:2: ( (lv_variableDefinition_0_0= ruleVariableDefinition ) )
            {
            // InternalMyDsl.g:172:2: ( (lv_variableDefinition_0_0= ruleVariableDefinition ) )
            // InternalMyDsl.g:173:3: (lv_variableDefinition_0_0= ruleVariableDefinition )
            {
            // InternalMyDsl.g:173:3: (lv_variableDefinition_0_0= ruleVariableDefinition )
            // InternalMyDsl.g:174:4: lv_variableDefinition_0_0= ruleVariableDefinition
            {

            				newCompositeNode(grammarAccess.getDefinitionAccess().getVariableDefinitionVariableDefinitionParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_variableDefinition_0_0=ruleVariableDefinition();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getDefinitionRule());
            				}
            				set(
            					current,
            					"variableDefinition",
            					lv_variableDefinition_0_0,
            					"org.xtext.example.mydsl.MyDsl.VariableDefinition");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalMyDsl.g:194:1: entryRuleVariableDefinition returns [EObject current=null] : iv_ruleVariableDefinition= ruleVariableDefinition EOF ;
    public final EObject entryRuleVariableDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableDefinition = null;


        try {
            // InternalMyDsl.g:194:59: (iv_ruleVariableDefinition= ruleVariableDefinition EOF )
            // InternalMyDsl.g:195:2: iv_ruleVariableDefinition= ruleVariableDefinition EOF
            {
             newCompositeNode(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableDefinition=ruleVariableDefinition();

            state._fsp--;

             current =iv_ruleVariableDefinition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalMyDsl.g:201:1: ruleVariableDefinition returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= 'define' ( (lv_variable_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' ) | (otherlv_13= '(' otherlv_14= 'define' otherlv_15= '(' ( (lv_variable_16_0= RULE_ID ) ) ( (lv_variables_17_0= RULE_ID ) )* otherlv_18= '.' ( (lv_var_19_0= RULE_ID ) ) otherlv_20= ')' ( (lv_body_21_0= ruleBody ) ) otherlv_22= ')' ) ) ;
    public final EObject ruleVariableDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_variable_2_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_variable_8_0=null;
        Token lv_variables_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token lv_variable_16_0=null;
        Token lv_variables_17_0=null;
        Token otherlv_18=null;
        Token lv_var_19_0=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        EObject lv_expression_3_0 = null;

        EObject lv_body_11_0 = null;

        EObject lv_body_21_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:207:2: ( ( (otherlv_0= '(' otherlv_1= 'define' ( (lv_variable_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' ) | (otherlv_13= '(' otherlv_14= 'define' otherlv_15= '(' ( (lv_variable_16_0= RULE_ID ) ) ( (lv_variables_17_0= RULE_ID ) )* otherlv_18= '.' ( (lv_var_19_0= RULE_ID ) ) otherlv_20= ')' ( (lv_body_21_0= ruleBody ) ) otherlv_22= ')' ) ) )
            // InternalMyDsl.g:208:2: ( (otherlv_0= '(' otherlv_1= 'define' ( (lv_variable_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' ) | (otherlv_13= '(' otherlv_14= 'define' otherlv_15= '(' ( (lv_variable_16_0= RULE_ID ) ) ( (lv_variables_17_0= RULE_ID ) )* otherlv_18= '.' ( (lv_var_19_0= RULE_ID ) ) otherlv_20= ')' ( (lv_body_21_0= ruleBody ) ) otherlv_22= ')' ) )
            {
            // InternalMyDsl.g:208:2: ( (otherlv_0= '(' otherlv_1= 'define' ( (lv_variable_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' ) | (otherlv_13= '(' otherlv_14= 'define' otherlv_15= '(' ( (lv_variable_16_0= RULE_ID ) ) ( (lv_variables_17_0= RULE_ID ) )* otherlv_18= '.' ( (lv_var_19_0= RULE_ID ) ) otherlv_20= ')' ( (lv_body_21_0= ruleBody ) ) otherlv_22= ')' ) )
            int alt5=3;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:209:3: (otherlv_0= '(' otherlv_1= 'define' ( (lv_variable_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
                    {
                    // InternalMyDsl.g:209:3: (otherlv_0= '(' otherlv_1= 'define' ( (lv_variable_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
                    // InternalMyDsl.g:210:4: otherlv_0= '(' otherlv_1= 'define' ( (lv_variable_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,18,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getVariableDefinitionAccess().getDefineKeyword_0_1());
                    			
                    // InternalMyDsl.g:218:4: ( (lv_variable_2_0= RULE_ID ) )
                    // InternalMyDsl.g:219:5: (lv_variable_2_0= RULE_ID )
                    {
                    // InternalMyDsl.g:219:5: (lv_variable_2_0= RULE_ID )
                    // InternalMyDsl.g:220:6: lv_variable_2_0= RULE_ID
                    {
                    lv_variable_2_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(lv_variable_2_0, grammarAccess.getVariableDefinitionAccess().getVariableIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"variable",
                    							lv_variable_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyDsl.g:236:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalMyDsl.g:237:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalMyDsl.g:237:5: (lv_expression_3_0= ruleExpression )
                    // InternalMyDsl.g:238:6: lv_expression_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getVariableDefinitionAccess().getExpressionExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:261:3: (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' )
                    {
                    // InternalMyDsl.g:261:3: (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' )
                    // InternalMyDsl.g:262:4: otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')'
                    {
                    otherlv_5=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_6=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getVariableDefinitionAccess().getDefineKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_7, grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalMyDsl.g:274:4: ( (lv_variable_8_0= RULE_ID ) )
                    // InternalMyDsl.g:275:5: (lv_variable_8_0= RULE_ID )
                    {
                    // InternalMyDsl.g:275:5: (lv_variable_8_0= RULE_ID )
                    // InternalMyDsl.g:276:6: lv_variable_8_0= RULE_ID
                    {
                    lv_variable_8_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    						newLeafNode(lv_variable_8_0, grammarAccess.getVariableDefinitionAccess().getVariableIDTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"variable",
                    							lv_variable_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyDsl.g:292:4: ( (lv_variables_9_0= RULE_ID ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_ID) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:293:5: (lv_variables_9_0= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:293:5: (lv_variables_9_0= RULE_ID )
                    	    // InternalMyDsl.g:294:6: lv_variables_9_0= RULE_ID
                    	    {
                    	    lv_variables_9_0=(Token)match(input,RULE_ID,FOLLOW_9); 

                    	    						newLeafNode(lv_variables_9_0, grammarAccess.getVariableDefinitionAccess().getVariablesIDTerminalRuleCall_1_4_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getVariableDefinitionRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_9_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_10, grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_1_5());
                    			
                    // InternalMyDsl.g:314:4: ( (lv_body_11_0= ruleBody ) )
                    // InternalMyDsl.g:315:5: (lv_body_11_0= ruleBody )
                    {
                    // InternalMyDsl.g:315:5: (lv_body_11_0= ruleBody )
                    // InternalMyDsl.g:316:6: lv_body_11_0= ruleBody
                    {

                    						newCompositeNode(grammarAccess.getVariableDefinitionAccess().getBodyBodyParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_body_11_0=ruleBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_11_0,
                    							"org.xtext.example.mydsl.MyDsl.Body");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_1_7());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:339:3: (otherlv_13= '(' otherlv_14= 'define' otherlv_15= '(' ( (lv_variable_16_0= RULE_ID ) ) ( (lv_variables_17_0= RULE_ID ) )* otherlv_18= '.' ( (lv_var_19_0= RULE_ID ) ) otherlv_20= ')' ( (lv_body_21_0= ruleBody ) ) otherlv_22= ')' )
                    {
                    // InternalMyDsl.g:339:3: (otherlv_13= '(' otherlv_14= 'define' otherlv_15= '(' ( (lv_variable_16_0= RULE_ID ) ) ( (lv_variables_17_0= RULE_ID ) )* otherlv_18= '.' ( (lv_var_19_0= RULE_ID ) ) otherlv_20= ')' ( (lv_body_21_0= ruleBody ) ) otherlv_22= ')' )
                    // InternalMyDsl.g:340:4: otherlv_13= '(' otherlv_14= 'define' otherlv_15= '(' ( (lv_variable_16_0= RULE_ID ) ) ( (lv_variables_17_0= RULE_ID ) )* otherlv_18= '.' ( (lv_var_19_0= RULE_ID ) ) otherlv_20= ')' ( (lv_body_21_0= ruleBody ) ) otherlv_22= ')'
                    {
                    otherlv_13=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_13, grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_2_0());
                    			
                    otherlv_14=(Token)match(input,18,FOLLOW_8); 

                    				newLeafNode(otherlv_14, grammarAccess.getVariableDefinitionAccess().getDefineKeyword_2_1());
                    			
                    otherlv_15=(Token)match(input,17,FOLLOW_5); 

                    				newLeafNode(otherlv_15, grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_2_2());
                    			
                    // InternalMyDsl.g:352:4: ( (lv_variable_16_0= RULE_ID ) )
                    // InternalMyDsl.g:353:5: (lv_variable_16_0= RULE_ID )
                    {
                    // InternalMyDsl.g:353:5: (lv_variable_16_0= RULE_ID )
                    // InternalMyDsl.g:354:6: lv_variable_16_0= RULE_ID
                    {
                    lv_variable_16_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(lv_variable_16_0, grammarAccess.getVariableDefinitionAccess().getVariableIDTerminalRuleCall_2_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"variable",
                    							lv_variable_16_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyDsl.g:370:4: ( (lv_variables_17_0= RULE_ID ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==RULE_ID) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalMyDsl.g:371:5: (lv_variables_17_0= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:371:5: (lv_variables_17_0= RULE_ID )
                    	    // InternalMyDsl.g:372:6: lv_variables_17_0= RULE_ID
                    	    {
                    	    lv_variables_17_0=(Token)match(input,RULE_ID,FOLLOW_11); 

                    	    						newLeafNode(lv_variables_17_0, grammarAccess.getVariableDefinitionAccess().getVariablesIDTerminalRuleCall_2_4_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getVariableDefinitionRule());
                    	    						}
                    	    						addWithLastConsumed(
                    	    							current,
                    	    							"variables",
                    	    							lv_variables_17_0,
                    	    							"org.eclipse.xtext.common.Terminals.ID");
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_18=(Token)match(input,20,FOLLOW_5); 

                    				newLeafNode(otherlv_18, grammarAccess.getVariableDefinitionAccess().getFullStopKeyword_2_5());
                    			
                    // InternalMyDsl.g:392:4: ( (lv_var_19_0= RULE_ID ) )
                    // InternalMyDsl.g:393:5: (lv_var_19_0= RULE_ID )
                    {
                    // InternalMyDsl.g:393:5: (lv_var_19_0= RULE_ID )
                    // InternalMyDsl.g:394:6: lv_var_19_0= RULE_ID
                    {
                    lv_var_19_0=(Token)match(input,RULE_ID,FOLLOW_7); 

                    						newLeafNode(lv_var_19_0, grammarAccess.getVariableDefinitionAccess().getVarIDTerminalRuleCall_2_6_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getVariableDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"var",
                    							lv_var_19_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_20, grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_2_7());
                    			
                    // InternalMyDsl.g:414:4: ( (lv_body_21_0= ruleBody ) )
                    // InternalMyDsl.g:415:5: (lv_body_21_0= ruleBody )
                    {
                    // InternalMyDsl.g:415:5: (lv_body_21_0= ruleBody )
                    // InternalMyDsl.g:416:6: lv_body_21_0= ruleBody
                    {

                    						newCompositeNode(grammarAccess.getVariableDefinitionAccess().getBodyBodyParserRuleCall_2_8_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_body_21_0=ruleBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getVariableDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_21_0,
                    							"org.xtext.example.mydsl.MyDsl.Body");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_22, grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_2_9());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleBody"
    // InternalMyDsl.g:442:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalMyDsl.g:442:45: (iv_ruleBody= ruleBody EOF )
            // InternalMyDsl.g:443:2: iv_ruleBody= ruleBody EOF
            {
             newCompositeNode(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBody=ruleBody();

            state._fsp--;

             current =iv_ruleBody; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalMyDsl.g:449:1: ruleBody returns [EObject current=null] : ( ( (lv_definition_0_0= ruleDefinition ) )* ( (lv_expression_1_0= ruleExpression ) )+ ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_definition_0_0 = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:455:2: ( ( ( (lv_definition_0_0= ruleDefinition ) )* ( (lv_expression_1_0= ruleExpression ) )+ ) )
            // InternalMyDsl.g:456:2: ( ( (lv_definition_0_0= ruleDefinition ) )* ( (lv_expression_1_0= ruleExpression ) )+ )
            {
            // InternalMyDsl.g:456:2: ( ( (lv_definition_0_0= ruleDefinition ) )* ( (lv_expression_1_0= ruleExpression ) )+ )
            // InternalMyDsl.g:457:3: ( (lv_definition_0_0= ruleDefinition ) )* ( (lv_expression_1_0= ruleExpression ) )+
            {
            // InternalMyDsl.g:457:3: ( (lv_definition_0_0= ruleDefinition ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    int LA6_2 = input.LA(2);

                    if ( (LA6_2==18) ) {
                        alt6=1;
                    }


                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:458:4: (lv_definition_0_0= ruleDefinition )
            	    {
            	    // InternalMyDsl.g:458:4: (lv_definition_0_0= ruleDefinition )
            	    // InternalMyDsl.g:459:5: lv_definition_0_0= ruleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getBodyAccess().getDefinitionDefinitionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_10);
            	    lv_definition_0_0=ruleDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"definition",
            	    						lv_definition_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Definition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            // InternalMyDsl.g:476:3: ( (lv_expression_1_0= ruleExpression ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_ID||(LA7_0>=RULE_BOOL && LA7_0<=RULE_LETTER)||LA7_0==17) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:477:4: (lv_expression_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:477:4: (lv_expression_1_0= ruleExpression )
            	    // InternalMyDsl.g:478:5: lv_expression_1_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getBodyAccess().getExpressionExpressionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_expression_1_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBodyRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expression",
            	    						lv_expression_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:499:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:499:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:500:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:506:1: ruleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_oper_1_0= ruleOperation ) ) | ( (lv_cond_2_0= ruleConditional ) ) | ( (lv_set_3_0= ruleSet ) ) | ( (lv_app_4_0= ruleApplication ) ) | ( (lv_mult_5_0= ruleMultipleCondition ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_constant_0_0 = null;

        EObject lv_oper_1_0 = null;

        EObject lv_cond_2_0 = null;

        EObject lv_set_3_0 = null;

        EObject lv_app_4_0 = null;

        EObject lv_mult_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:512:2: ( ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_oper_1_0= ruleOperation ) ) | ( (lv_cond_2_0= ruleConditional ) ) | ( (lv_set_3_0= ruleSet ) ) | ( (lv_app_4_0= ruleApplication ) ) | ( (lv_mult_5_0= ruleMultipleCondition ) ) ) )
            // InternalMyDsl.g:513:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_oper_1_0= ruleOperation ) ) | ( (lv_cond_2_0= ruleConditional ) ) | ( (lv_set_3_0= ruleSet ) ) | ( (lv_app_4_0= ruleApplication ) ) | ( (lv_mult_5_0= ruleMultipleCondition ) ) )
            {
            // InternalMyDsl.g:513:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_oper_1_0= ruleOperation ) ) | ( (lv_cond_2_0= ruleConditional ) ) | ( (lv_set_3_0= ruleSet ) ) | ( (lv_app_4_0= ruleApplication ) ) | ( (lv_mult_5_0= ruleMultipleCondition ) ) )
            int alt8=6;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=RULE_BOOL && LA8_0<=RULE_LETTER)) ) {
                alt8=1;
            }
            else if ( (LA8_0==17) ) {
                switch ( input.LA(2) ) {
                case 28:
                    {
                    alt8=4;
                    }
                    break;
                case RULE_ID:
                case RULE_BOOL:
                case RULE_INT:
                case RULE_DOUBLE:
                case RULE_STRING:
                case RULE_LETTER:
                case 17:
                    {
                    alt8=5;
                    }
                    break;
                case 29:
                    {
                    alt8=3;
                    }
                    break;
                case 26:
                    {
                    alt8=6;
                    }
                    break;
                case RULE_OPER:
                    {
                    alt8=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:514:3: ( (lv_constant_0_0= ruleConstant ) )
                    {
                    // InternalMyDsl.g:514:3: ( (lv_constant_0_0= ruleConstant ) )
                    // InternalMyDsl.g:515:4: (lv_constant_0_0= ruleConstant )
                    {
                    // InternalMyDsl.g:515:4: (lv_constant_0_0= ruleConstant )
                    // InternalMyDsl.g:516:5: lv_constant_0_0= ruleConstant
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getConstantConstantParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_constant_0_0=ruleConstant();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"constant",
                    						lv_constant_0_0,
                    						"org.xtext.example.mydsl.MyDsl.Constant");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:534:3: ( (lv_oper_1_0= ruleOperation ) )
                    {
                    // InternalMyDsl.g:534:3: ( (lv_oper_1_0= ruleOperation ) )
                    // InternalMyDsl.g:535:4: (lv_oper_1_0= ruleOperation )
                    {
                    // InternalMyDsl.g:535:4: (lv_oper_1_0= ruleOperation )
                    // InternalMyDsl.g:536:5: lv_oper_1_0= ruleOperation
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getOperOperationParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_oper_1_0=ruleOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"oper",
                    						lv_oper_1_0,
                    						"org.xtext.example.mydsl.MyDsl.Operation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:554:3: ( (lv_cond_2_0= ruleConditional ) )
                    {
                    // InternalMyDsl.g:554:3: ( (lv_cond_2_0= ruleConditional ) )
                    // InternalMyDsl.g:555:4: (lv_cond_2_0= ruleConditional )
                    {
                    // InternalMyDsl.g:555:4: (lv_cond_2_0= ruleConditional )
                    // InternalMyDsl.g:556:5: lv_cond_2_0= ruleConditional
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getCondConditionalParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cond_2_0=ruleConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"cond",
                    						lv_cond_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Conditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:574:3: ( (lv_set_3_0= ruleSet ) )
                    {
                    // InternalMyDsl.g:574:3: ( (lv_set_3_0= ruleSet ) )
                    // InternalMyDsl.g:575:4: (lv_set_3_0= ruleSet )
                    {
                    // InternalMyDsl.g:575:4: (lv_set_3_0= ruleSet )
                    // InternalMyDsl.g:576:5: lv_set_3_0= ruleSet
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getSetSetParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_3_0=ruleSet();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Set");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:594:3: ( (lv_app_4_0= ruleApplication ) )
                    {
                    // InternalMyDsl.g:594:3: ( (lv_app_4_0= ruleApplication ) )
                    // InternalMyDsl.g:595:4: (lv_app_4_0= ruleApplication )
                    {
                    // InternalMyDsl.g:595:4: (lv_app_4_0= ruleApplication )
                    // InternalMyDsl.g:596:5: lv_app_4_0= ruleApplication
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getAppApplicationParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_app_4_0=ruleApplication();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"app",
                    						lv_app_4_0,
                    						"org.xtext.example.mydsl.MyDsl.Application");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:614:3: ( (lv_mult_5_0= ruleMultipleCondition ) )
                    {
                    // InternalMyDsl.g:614:3: ( (lv_mult_5_0= ruleMultipleCondition ) )
                    // InternalMyDsl.g:615:4: (lv_mult_5_0= ruleMultipleCondition )
                    {
                    // InternalMyDsl.g:615:4: (lv_mult_5_0= ruleMultipleCondition )
                    // InternalMyDsl.g:616:5: lv_mult_5_0= ruleMultipleCondition
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getMultMultipleConditionParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_mult_5_0=ruleMultipleCondition();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"mult",
                    						lv_mult_5_0,
                    						"org.xtext.example.mydsl.MyDsl.MultipleCondition");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalMyDsl.g:637:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMyDsl.g:637:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMyDsl.g:638:2: iv_ruleComparison= ruleComparison EOF
            {
             newCompositeNode(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;

             current =iv_ruleComparison; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMyDsl.g:644:1: ruleComparison returns [EObject current=null] : ( () ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= RULE_NUMBER ) ) ( (lv_num2_8_0= RULE_NUMBER ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_num1_7_0=null;
        Token lv_num2_8_0=null;
        Token otherlv_9=null;
        Token this_BOOL_10=null;


        	enterRule();

        try {
            // InternalMyDsl.g:650:2: ( ( () ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= RULE_NUMBER ) ) ( (lv_num2_8_0= RULE_NUMBER ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL ) ) )
            // InternalMyDsl.g:651:2: ( () ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= RULE_NUMBER ) ) ( (lv_num2_8_0= RULE_NUMBER ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL ) )
            {
            // InternalMyDsl.g:651:2: ( () ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= RULE_NUMBER ) ) ( (lv_num2_8_0= RULE_NUMBER ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL ) )
            // InternalMyDsl.g:652:3: () ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= RULE_NUMBER ) ) ( (lv_num2_8_0= RULE_NUMBER ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL )
            {
            // InternalMyDsl.g:652:3: ()
            // InternalMyDsl.g:653:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComparisonAccess().getComparisonAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:659:3: ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= RULE_NUMBER ) ) ( (lv_num2_8_0= RULE_NUMBER ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_BOOL) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:660:4: (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= RULE_NUMBER ) ) ( (lv_num2_8_0= RULE_NUMBER ) ) otherlv_9= ')' )
                    {
                    // InternalMyDsl.g:660:4: (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= RULE_NUMBER ) ) ( (lv_num2_8_0= RULE_NUMBER ) ) otherlv_9= ')' )
                    // InternalMyDsl.g:661:5: otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= RULE_NUMBER ) ) ( (lv_num2_8_0= RULE_NUMBER ) ) otherlv_9= ')'
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_12); 

                    					newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyDsl.g:665:5: (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' )
                    int alt9=5;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt9=1;
                        }
                        break;
                    case 22:
                        {
                        alt9=2;
                        }
                        break;
                    case 23:
                        {
                        alt9=3;
                        }
                        break;
                    case 24:
                        {
                        alt9=4;
                        }
                        break;
                    case 25:
                        {
                        alt9=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 0, input);

                        throw nvae;
                    }

                    switch (alt9) {
                        case 1 :
                            // InternalMyDsl.g:666:6: otherlv_2= '<'
                            {
                            otherlv_2=(Token)match(input,21,FOLLOW_13); 

                            						newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:671:6: otherlv_3= '>'
                            {
                            otherlv_3=(Token)match(input,22,FOLLOW_13); 

                            						newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_1());
                            					

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:676:6: otherlv_4= '='
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_13); 

                            						newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0_1_2());
                            					

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:681:6: otherlv_5= '>='
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_13); 

                            						newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_1_3());
                            					

                            }
                            break;
                        case 5 :
                            // InternalMyDsl.g:686:6: otherlv_6= '<='
                            {
                            otherlv_6=(Token)match(input,25,FOLLOW_13); 

                            						newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_4());
                            					

                            }
                            break;

                    }

                    // InternalMyDsl.g:691:5: ( (lv_num1_7_0= RULE_NUMBER ) )
                    // InternalMyDsl.g:692:6: (lv_num1_7_0= RULE_NUMBER )
                    {
                    // InternalMyDsl.g:692:6: (lv_num1_7_0= RULE_NUMBER )
                    // InternalMyDsl.g:693:7: lv_num1_7_0= RULE_NUMBER
                    {
                    lv_num1_7_0=(Token)match(input,RULE_NUMBER,FOLLOW_13); 

                    							newLeafNode(lv_num1_7_0, grammarAccess.getComparisonAccess().getNum1NUMBERTerminalRuleCall_1_0_2_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComparisonRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"num1",
                    								lv_num1_7_0,
                    								"org.xtext.example.mydsl.MyDsl.NUMBER");
                    						

                    }


                    }

                    // InternalMyDsl.g:709:5: ( (lv_num2_8_0= RULE_NUMBER ) )
                    // InternalMyDsl.g:710:6: (lv_num2_8_0= RULE_NUMBER )
                    {
                    // InternalMyDsl.g:710:6: (lv_num2_8_0= RULE_NUMBER )
                    // InternalMyDsl.g:711:7: lv_num2_8_0= RULE_NUMBER
                    {
                    lv_num2_8_0=(Token)match(input,RULE_NUMBER,FOLLOW_7); 

                    							newLeafNode(lv_num2_8_0, grammarAccess.getComparisonAccess().getNum2NUMBERTerminalRuleCall_1_0_3_0());
                    						

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getComparisonRule());
                    							}
                    							setWithLastConsumed(
                    								current,
                    								"num2",
                    								lv_num2_8_0,
                    								"org.xtext.example.mydsl.MyDsl.NUMBER");
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,19,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getComparisonAccess().getRightParenthesisKeyword_1_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:733:4: this_BOOL_10= RULE_BOOL
                    {
                    this_BOOL_10=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    				newLeafNode(this_BOOL_10, grammarAccess.getComparisonAccess().getBOOLTerminalRuleCall_1_1());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleMultipleCondition"
    // InternalMyDsl.g:742:1: entryRuleMultipleCondition returns [EObject current=null] : iv_ruleMultipleCondition= ruleMultipleCondition EOF ;
    public final EObject entryRuleMultipleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultipleCondition = null;


        try {
            // InternalMyDsl.g:742:58: (iv_ruleMultipleCondition= ruleMultipleCondition EOF )
            // InternalMyDsl.g:743:2: iv_ruleMultipleCondition= ruleMultipleCondition EOF
            {
             newCompositeNode(grammarAccess.getMultipleConditionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultipleCondition=ruleMultipleCondition();

            state._fsp--;

             current =iv_ruleMultipleCondition; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMultipleCondition"


    // $ANTLR start "ruleMultipleCondition"
    // InternalMyDsl.g:749:1: ruleMultipleCondition returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'cond' (otherlv_2= '(' ( (lv_comp_3_0= ruleComparison ) ) ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) (otherlv_6= '(' otherlv_7= 'else' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' )? ) ;
    public final EObject ruleMultipleCondition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_comp_3_0 = null;

        EObject lv_exp_4_0 = null;

        EObject lv_expression_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:755:2: ( (otherlv_0= '(' otherlv_1= 'cond' (otherlv_2= '(' ( (lv_comp_3_0= ruleComparison ) ) ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) (otherlv_6= '(' otherlv_7= 'else' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' )? ) )
            // InternalMyDsl.g:756:2: (otherlv_0= '(' otherlv_1= 'cond' (otherlv_2= '(' ( (lv_comp_3_0= ruleComparison ) ) ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) (otherlv_6= '(' otherlv_7= 'else' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' )? )
            {
            // InternalMyDsl.g:756:2: (otherlv_0= '(' otherlv_1= 'cond' (otherlv_2= '(' ( (lv_comp_3_0= ruleComparison ) ) ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) (otherlv_6= '(' otherlv_7= 'else' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' )? )
            // InternalMyDsl.g:757:3: otherlv_0= '(' otherlv_1= 'cond' (otherlv_2= '(' ( (lv_comp_3_0= ruleComparison ) ) ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' ) (otherlv_6= '(' otherlv_7= 'else' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' )?
            {
            otherlv_0=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMultipleConditionAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMultipleConditionAccess().getCondKeyword_1());
            		
            // InternalMyDsl.g:765:3: (otherlv_2= '(' ( (lv_comp_3_0= ruleComparison ) ) ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')' )
            // InternalMyDsl.g:766:4: otherlv_2= '(' ( (lv_comp_3_0= ruleComparison ) ) ( (lv_exp_4_0= ruleExpression ) ) otherlv_5= ')'
            {
            otherlv_2=(Token)match(input,17,FOLLOW_15); 

            				newLeafNode(otherlv_2, grammarAccess.getMultipleConditionAccess().getLeftParenthesisKeyword_2_0());
            			
            // InternalMyDsl.g:770:4: ( (lv_comp_3_0= ruleComparison ) )
            // InternalMyDsl.g:771:5: (lv_comp_3_0= ruleComparison )
            {
            // InternalMyDsl.g:771:5: (lv_comp_3_0= ruleComparison )
            // InternalMyDsl.g:772:6: lv_comp_3_0= ruleComparison
            {

            						newCompositeNode(grammarAccess.getMultipleConditionAccess().getCompComparisonParserRuleCall_2_1_0());
            					
            pushFollow(FOLLOW_6);
            lv_comp_3_0=ruleComparison();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMultipleConditionRule());
            						}
            						add(
            							current,
            							"comp",
            							lv_comp_3_0,
            							"org.xtext.example.mydsl.MyDsl.Comparison");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            // InternalMyDsl.g:789:4: ( (lv_exp_4_0= ruleExpression ) )
            // InternalMyDsl.g:790:5: (lv_exp_4_0= ruleExpression )
            {
            // InternalMyDsl.g:790:5: (lv_exp_4_0= ruleExpression )
            // InternalMyDsl.g:791:6: lv_exp_4_0= ruleExpression
            {

            						newCompositeNode(grammarAccess.getMultipleConditionAccess().getExpExpressionParserRuleCall_2_2_0());
            					
            pushFollow(FOLLOW_7);
            lv_exp_4_0=ruleExpression();

            state._fsp--;


            						if (current==null) {
            							current = createModelElementForParent(grammarAccess.getMultipleConditionRule());
            						}
            						add(
            							current,
            							"exp",
            							lv_exp_4_0,
            							"org.xtext.example.mydsl.MyDsl.Expression");
            						afterParserOrEnumRuleCall();
            					

            }


            }

            otherlv_5=(Token)match(input,19,FOLLOW_16); 

            				newLeafNode(otherlv_5, grammarAccess.getMultipleConditionAccess().getRightParenthesisKeyword_2_3());
            			

            }

            // InternalMyDsl.g:813:3: (otherlv_6= '(' otherlv_7= 'else' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==17) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==27) ) {
                    alt11=1;
                }
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:814:4: otherlv_6= '(' otherlv_7= 'else' ( (lv_expression_8_0= ruleExpression ) ) otherlv_9= ')'
                    {
                    otherlv_6=(Token)match(input,17,FOLLOW_17); 

                    				newLeafNode(otherlv_6, grammarAccess.getMultipleConditionAccess().getLeftParenthesisKeyword_3_0());
                    			
                    otherlv_7=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_7, grammarAccess.getMultipleConditionAccess().getElseKeyword_3_1());
                    			
                    // InternalMyDsl.g:822:4: ( (lv_expression_8_0= ruleExpression ) )
                    // InternalMyDsl.g:823:5: (lv_expression_8_0= ruleExpression )
                    {
                    // InternalMyDsl.g:823:5: (lv_expression_8_0= ruleExpression )
                    // InternalMyDsl.g:824:6: lv_expression_8_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getMultipleConditionAccess().getExpressionExpressionParserRuleCall_3_2_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expression_8_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMultipleConditionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_8_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_9=(Token)match(input,19,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getMultipleConditionAccess().getRightParenthesisKeyword_3_3());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMultipleCondition"


    // $ANTLR start "entryRuleApplication"
    // InternalMyDsl.g:850:1: entryRuleApplication returns [EObject current=null] : iv_ruleApplication= ruleApplication EOF ;
    public final EObject entryRuleApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleApplication = null;


        try {
            // InternalMyDsl.g:850:52: (iv_ruleApplication= ruleApplication EOF )
            // InternalMyDsl.g:851:2: iv_ruleApplication= ruleApplication EOF
            {
             newCompositeNode(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleApplication=ruleApplication();

            state._fsp--;

             current =iv_ruleApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMyDsl.g:857:1: ruleApplication returns [EObject current=null] : (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' ) ;
    public final EObject ruleApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_expression_1_0 = null;

        EObject lv_expressions_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:863:2: ( (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' ) )
            // InternalMyDsl.g:864:2: (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' )
            {
            // InternalMyDsl.g:864:2: (otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')' )
            // InternalMyDsl.g:865:3: otherlv_0= '(' ( (lv_expression_1_0= ruleExpression ) ) ( (lv_expressions_2_0= ruleExpression ) )* otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_0());
            		
            // InternalMyDsl.g:869:3: ( (lv_expression_1_0= ruleExpression ) )
            // InternalMyDsl.g:870:4: (lv_expression_1_0= ruleExpression )
            {
            // InternalMyDsl.g:870:4: (lv_expression_1_0= ruleExpression )
            // InternalMyDsl.g:871:5: lv_expression_1_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getApplicationAccess().getExpressionExpressionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_expression_1_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getApplicationRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_1_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:888:3: ( (lv_expressions_2_0= ruleExpression ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID||(LA12_0>=RULE_BOOL && LA12_0<=RULE_LETTER)||LA12_0==17) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:889:4: (lv_expressions_2_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:889:4: (lv_expressions_2_0= ruleExpression )
            	    // InternalMyDsl.g:890:5: lv_expressions_2_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getApplicationAccess().getExpressionsExpressionParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_expressions_2_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"expressions",
            	    						lv_expressions_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getApplicationAccess().getRightParenthesisKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleSet"
    // InternalMyDsl.g:915:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalMyDsl.g:915:44: (iv_ruleSet= ruleSet EOF )
            // InternalMyDsl.g:916:2: iv_ruleSet= ruleSet EOF
            {
             newCompositeNode(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSet=ruleSet();

            state._fsp--;

             current =iv_ruleSet; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalMyDsl.g:922:1: ruleSet returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'set!' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_cons_2_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:928:2: ( (otherlv_0= '(' otherlv_1= 'set!' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:929:2: (otherlv_0= '(' otherlv_1= 'set!' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:929:2: (otherlv_0= '(' otherlv_1= 'set!' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:930:3: otherlv_0= '(' otherlv_1= 'set!' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getSetAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getSetAccess().getSetKeyword_1());
            		
            // InternalMyDsl.g:938:3: ( (lv_cons_2_0= ruleConstant ) )
            // InternalMyDsl.g:939:4: (lv_cons_2_0= ruleConstant )
            {
            // InternalMyDsl.g:939:4: (lv_cons_2_0= ruleConstant )
            // InternalMyDsl.g:940:5: lv_cons_2_0= ruleConstant
            {

            					newCompositeNode(grammarAccess.getSetAccess().getConsConstantParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_cons_2_0=ruleConstant();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRule());
            					}
            					set(
            						current,
            						"cons",
            						lv_cons_2_0,
            						"org.xtext.example.mydsl.MyDsl.Constant");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:957:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalMyDsl.g:958:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalMyDsl.g:958:4: (lv_expression_3_0= ruleExpression )
            // InternalMyDsl.g:959:5: lv_expression_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSetAccess().getExpressionExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_expression_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSetRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getSetAccess().getRightParenthesisKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleConditional"
    // InternalMyDsl.g:984:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalMyDsl.g:984:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalMyDsl.g:985:2: iv_ruleConditional= ruleConditional EOF
            {
             newCompositeNode(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConditional=ruleConditional();

            state._fsp--;

             current =iv_ruleConditional; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalMyDsl.g:991:1: ruleConditional returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'if' ( (lv_condition_2_0= ruleComparison ) ) ( (lv_iftrue_3_0= ruleExpression ) ) ( (lv_else_4_0= ruleExpression ) )? otherlv_5= ')' ) ;
    public final EObject ruleConditional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_5=null;
        EObject lv_condition_2_0 = null;

        EObject lv_iftrue_3_0 = null;

        EObject lv_else_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:997:2: ( (otherlv_0= '(' otherlv_1= 'if' ( (lv_condition_2_0= ruleComparison ) ) ( (lv_iftrue_3_0= ruleExpression ) ) ( (lv_else_4_0= ruleExpression ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:998:2: (otherlv_0= '(' otherlv_1= 'if' ( (lv_condition_2_0= ruleComparison ) ) ( (lv_iftrue_3_0= ruleExpression ) ) ( (lv_else_4_0= ruleExpression ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:998:2: (otherlv_0= '(' otherlv_1= 'if' ( (lv_condition_2_0= ruleComparison ) ) ( (lv_iftrue_3_0= ruleExpression ) ) ( (lv_else_4_0= ruleExpression ) )? otherlv_5= ')' )
            // InternalMyDsl.g:999:3: otherlv_0= '(' otherlv_1= 'if' ( (lv_condition_2_0= ruleComparison ) ) ( (lv_iftrue_3_0= ruleExpression ) ) ( (lv_else_4_0= ruleExpression ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_15); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getIfKeyword_1());
            		
            // InternalMyDsl.g:1007:3: ( (lv_condition_2_0= ruleComparison ) )
            // InternalMyDsl.g:1008:4: (lv_condition_2_0= ruleComparison )
            {
            // InternalMyDsl.g:1008:4: (lv_condition_2_0= ruleComparison )
            // InternalMyDsl.g:1009:5: lv_condition_2_0= ruleComparison
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getConditionComparisonParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_6);
            lv_condition_2_0=ruleComparison();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"condition",
            						lv_condition_2_0,
            						"org.xtext.example.mydsl.MyDsl.Comparison");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1026:3: ( (lv_iftrue_3_0= ruleExpression ) )
            // InternalMyDsl.g:1027:4: (lv_iftrue_3_0= ruleExpression )
            {
            // InternalMyDsl.g:1027:4: (lv_iftrue_3_0= ruleExpression )
            // InternalMyDsl.g:1028:5: lv_iftrue_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getIftrueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_iftrue_3_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getConditionalRule());
            					}
            					set(
            						current,
            						"iftrue",
            						lv_iftrue_3_0,
            						"org.xtext.example.mydsl.MyDsl.Expression");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:1045:3: ( (lv_else_4_0= ruleExpression ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID||(LA13_0>=RULE_BOOL && LA13_0<=RULE_LETTER)||LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1046:4: (lv_else_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:1046:4: (lv_else_4_0= ruleExpression )
                    // InternalMyDsl.g:1047:5: lv_else_4_0= ruleExpression
                    {

                    					newCompositeNode(grammarAccess.getConditionalAccess().getElseExpressionParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_7);
                    lv_else_4_0=ruleExpression();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getConditionalRule());
                    					}
                    					set(
                    						current,
                    						"else",
                    						lv_else_4_0,
                    						"org.xtext.example.mydsl.MyDsl.Expression");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getConditionalAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleConstant"
    // InternalMyDsl.g:1072:1: entryRuleConstant returns [String current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final String entryRuleConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstant = null;


        try {
            // InternalMyDsl.g:1072:48: (iv_ruleConstant= ruleConstant EOF )
            // InternalMyDsl.g:1073:2: iv_ruleConstant= ruleConstant EOF
            {
             newCompositeNode(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleConstant=ruleConstant();

            state._fsp--;

             current =iv_ruleConstant.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalMyDsl.g:1079:1: ruleConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BOOL_0= RULE_BOOL | this_INT_1= RULE_INT | this_DOUBLE_2= RULE_DOUBLE | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID | this_LETTER_5= RULE_LETTER ) ;
    public final AntlrDatatypeRuleToken ruleConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOL_0=null;
        Token this_INT_1=null;
        Token this_DOUBLE_2=null;
        Token this_STRING_3=null;
        Token this_ID_4=null;
        Token this_LETTER_5=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1085:2: ( (this_BOOL_0= RULE_BOOL | this_INT_1= RULE_INT | this_DOUBLE_2= RULE_DOUBLE | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID | this_LETTER_5= RULE_LETTER ) )
            // InternalMyDsl.g:1086:2: (this_BOOL_0= RULE_BOOL | this_INT_1= RULE_INT | this_DOUBLE_2= RULE_DOUBLE | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID | this_LETTER_5= RULE_LETTER )
            {
            // InternalMyDsl.g:1086:2: (this_BOOL_0= RULE_BOOL | this_INT_1= RULE_INT | this_DOUBLE_2= RULE_DOUBLE | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID | this_LETTER_5= RULE_LETTER )
            int alt14=6;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                alt14=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt14=3;
                }
                break;
            case RULE_STRING:
                {
                alt14=4;
                }
                break;
            case RULE_ID:
                {
                alt14=5;
                }
                break;
            case RULE_LETTER:
                {
                alt14=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1087:3: this_BOOL_0= RULE_BOOL
                    {
                    this_BOOL_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    			current.merge(this_BOOL_0);
                    		

                    			newLeafNode(this_BOOL_0, grammarAccess.getConstantAccess().getBOOLTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1095:3: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_2); 

                    			current.merge(this_INT_1);
                    		

                    			newLeafNode(this_INT_1, grammarAccess.getConstantAccess().getINTTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1103:3: this_DOUBLE_2= RULE_DOUBLE
                    {
                    this_DOUBLE_2=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_2);
                    		

                    			newLeafNode(this_DOUBLE_2, grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1111:3: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_3);
                    		

                    			newLeafNode(this_STRING_3, grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1119:3: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_4);
                    		

                    			newLeafNode(this_ID_4, grammarAccess.getConstantAccess().getIDTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1127:3: this_LETTER_5= RULE_LETTER
                    {
                    this_LETTER_5=(Token)match(input,RULE_LETTER,FOLLOW_2); 

                    			current.merge(this_LETTER_5);
                    		

                    			newLeafNode(this_LETTER_5, grammarAccess.getConstantAccess().getLETTERTerminalRuleCall_5());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:1138:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:1138:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:1139:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:1145:1: ruleOperation returns [EObject current=null] : ( ( (lv_operation_0_0= '(' ) ) ( (lv_operator_1_0= RULE_OPER ) ) otherlv_2= '\\\\s' ( (lv_numb_3_0= RULE_NUMBER ) )* otherlv_4= '\\\\s' ( (lv_numb2_5_0= RULE_NUMBER ) )* otherlv_6= ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_0=null;
        Token lv_operator_1_0=null;
        Token otherlv_2=null;
        Token lv_numb_3_0=null;
        Token otherlv_4=null;
        Token lv_numb2_5_0=null;
        Token otherlv_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1151:2: ( ( ( (lv_operation_0_0= '(' ) ) ( (lv_operator_1_0= RULE_OPER ) ) otherlv_2= '\\\\s' ( (lv_numb_3_0= RULE_NUMBER ) )* otherlv_4= '\\\\s' ( (lv_numb2_5_0= RULE_NUMBER ) )* otherlv_6= ')' ) )
            // InternalMyDsl.g:1152:2: ( ( (lv_operation_0_0= '(' ) ) ( (lv_operator_1_0= RULE_OPER ) ) otherlv_2= '\\\\s' ( (lv_numb_3_0= RULE_NUMBER ) )* otherlv_4= '\\\\s' ( (lv_numb2_5_0= RULE_NUMBER ) )* otherlv_6= ')' )
            {
            // InternalMyDsl.g:1152:2: ( ( (lv_operation_0_0= '(' ) ) ( (lv_operator_1_0= RULE_OPER ) ) otherlv_2= '\\\\s' ( (lv_numb_3_0= RULE_NUMBER ) )* otherlv_4= '\\\\s' ( (lv_numb2_5_0= RULE_NUMBER ) )* otherlv_6= ')' )
            // InternalMyDsl.g:1153:3: ( (lv_operation_0_0= '(' ) ) ( (lv_operator_1_0= RULE_OPER ) ) otherlv_2= '\\\\s' ( (lv_numb_3_0= RULE_NUMBER ) )* otherlv_4= '\\\\s' ( (lv_numb2_5_0= RULE_NUMBER ) )* otherlv_6= ')'
            {
            // InternalMyDsl.g:1153:3: ( (lv_operation_0_0= '(' ) )
            // InternalMyDsl.g:1154:4: (lv_operation_0_0= '(' )
            {
            // InternalMyDsl.g:1154:4: (lv_operation_0_0= '(' )
            // InternalMyDsl.g:1155:5: lv_operation_0_0= '('
            {
            lv_operation_0_0=(Token)match(input,17,FOLLOW_21); 

            					newLeafNode(lv_operation_0_0, grammarAccess.getOperationAccess().getOperationLeftParenthesisKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(current, "operation", lv_operation_0_0, "(");
            				

            }


            }

            // InternalMyDsl.g:1167:3: ( (lv_operator_1_0= RULE_OPER ) )
            // InternalMyDsl.g:1168:4: (lv_operator_1_0= RULE_OPER )
            {
            // InternalMyDsl.g:1168:4: (lv_operator_1_0= RULE_OPER )
            // InternalMyDsl.g:1169:5: lv_operator_1_0= RULE_OPER
            {
            lv_operator_1_0=(Token)match(input,RULE_OPER,FOLLOW_22); 

            					newLeafNode(lv_operator_1_0, grammarAccess.getOperationAccess().getOperatorOPERTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"operator",
            						lv_operator_1_0,
            						"org.xtext.example.mydsl.MyDsl.OPER");
            				

            }


            }

            otherlv_2=(Token)match(input,30,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getSKeyword_2());
            		
            // InternalMyDsl.g:1189:3: ( (lv_numb_3_0= RULE_NUMBER ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_NUMBER) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:1190:4: (lv_numb_3_0= RULE_NUMBER )
            	    {
            	    // InternalMyDsl.g:1190:4: (lv_numb_3_0= RULE_NUMBER )
            	    // InternalMyDsl.g:1191:5: lv_numb_3_0= RULE_NUMBER
            	    {
            	    lv_numb_3_0=(Token)match(input,RULE_NUMBER,FOLLOW_23); 

            	    					newLeafNode(lv_numb_3_0, grammarAccess.getOperationAccess().getNumbNUMBERTerminalRuleCall_3_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOperationRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"numb",
            	    						lv_numb_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.NUMBER");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,30,FOLLOW_24); 

            			newLeafNode(otherlv_4, grammarAccess.getOperationAccess().getSKeyword_4());
            		
            // InternalMyDsl.g:1211:3: ( (lv_numb2_5_0= RULE_NUMBER ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_NUMBER) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMyDsl.g:1212:4: (lv_numb2_5_0= RULE_NUMBER )
            	    {
            	    // InternalMyDsl.g:1212:4: (lv_numb2_5_0= RULE_NUMBER )
            	    // InternalMyDsl.g:1213:5: lv_numb2_5_0= RULE_NUMBER
            	    {
            	    lv_numb2_5_0=(Token)match(input,RULE_NUMBER,FOLLOW_24); 

            	    					newLeafNode(lv_numb2_5_0, grammarAccess.getOperationAccess().getNumb2NUMBERTerminalRuleCall_5_0());
            	    				

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getOperationRule());
            	    					}
            	    					addWithLastConsumed(
            	    						current,
            	    						"numb2",
            	    						lv_numb2_5_0,
            	    						"org.xtext.example.mydsl.MyDsl.NUMBER");
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getOperationAccess().getRightParenthesisKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleInitial"
    // InternalMyDsl.g:1237:1: entryRuleInitial returns [EObject current=null] : iv_ruleInitial= ruleInitial EOF ;
    public final EObject entryRuleInitial() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleInitial = null;


        try {
            // InternalMyDsl.g:1237:48: (iv_ruleInitial= ruleInitial EOF )
            // InternalMyDsl.g:1238:2: iv_ruleInitial= ruleInitial EOF
            {
             newCompositeNode(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleInitial=ruleInitial();

            state._fsp--;

             current =iv_ruleInitial; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyDsl.g:1244:1: ruleInitial returns [EObject current=null] : ( ( (lv_init_0_1= RULE_LETTER | lv_init_0_2= '!' | lv_init_0_3= '$' | lv_init_0_4= '%' | lv_init_0_5= '&' | lv_init_0_6= '*' | lv_init_0_7= '/' | lv_init_0_8= ':' | lv_init_0_9= '<' | lv_init_0_10= '=' | lv_init_0_11= '>' | lv_init_0_12= '?' | lv_init_0_13= '~' | lv_init_0_14= '_' | lv_init_0_15= '^' ) ) ) ;
    public final EObject ruleInitial() throws RecognitionException {
        EObject current = null;

        Token lv_init_0_1=null;
        Token lv_init_0_2=null;
        Token lv_init_0_3=null;
        Token lv_init_0_4=null;
        Token lv_init_0_5=null;
        Token lv_init_0_6=null;
        Token lv_init_0_7=null;
        Token lv_init_0_8=null;
        Token lv_init_0_9=null;
        Token lv_init_0_10=null;
        Token lv_init_0_11=null;
        Token lv_init_0_12=null;
        Token lv_init_0_13=null;
        Token lv_init_0_14=null;
        Token lv_init_0_15=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1250:2: ( ( ( (lv_init_0_1= RULE_LETTER | lv_init_0_2= '!' | lv_init_0_3= '$' | lv_init_0_4= '%' | lv_init_0_5= '&' | lv_init_0_6= '*' | lv_init_0_7= '/' | lv_init_0_8= ':' | lv_init_0_9= '<' | lv_init_0_10= '=' | lv_init_0_11= '>' | lv_init_0_12= '?' | lv_init_0_13= '~' | lv_init_0_14= '_' | lv_init_0_15= '^' ) ) ) )
            // InternalMyDsl.g:1251:2: ( ( (lv_init_0_1= RULE_LETTER | lv_init_0_2= '!' | lv_init_0_3= '$' | lv_init_0_4= '%' | lv_init_0_5= '&' | lv_init_0_6= '*' | lv_init_0_7= '/' | lv_init_0_8= ':' | lv_init_0_9= '<' | lv_init_0_10= '=' | lv_init_0_11= '>' | lv_init_0_12= '?' | lv_init_0_13= '~' | lv_init_0_14= '_' | lv_init_0_15= '^' ) ) )
            {
            // InternalMyDsl.g:1251:2: ( ( (lv_init_0_1= RULE_LETTER | lv_init_0_2= '!' | lv_init_0_3= '$' | lv_init_0_4= '%' | lv_init_0_5= '&' | lv_init_0_6= '*' | lv_init_0_7= '/' | lv_init_0_8= ':' | lv_init_0_9= '<' | lv_init_0_10= '=' | lv_init_0_11= '>' | lv_init_0_12= '?' | lv_init_0_13= '~' | lv_init_0_14= '_' | lv_init_0_15= '^' ) ) )
            // InternalMyDsl.g:1252:3: ( (lv_init_0_1= RULE_LETTER | lv_init_0_2= '!' | lv_init_0_3= '$' | lv_init_0_4= '%' | lv_init_0_5= '&' | lv_init_0_6= '*' | lv_init_0_7= '/' | lv_init_0_8= ':' | lv_init_0_9= '<' | lv_init_0_10= '=' | lv_init_0_11= '>' | lv_init_0_12= '?' | lv_init_0_13= '~' | lv_init_0_14= '_' | lv_init_0_15= '^' ) )
            {
            // InternalMyDsl.g:1252:3: ( (lv_init_0_1= RULE_LETTER | lv_init_0_2= '!' | lv_init_0_3= '$' | lv_init_0_4= '%' | lv_init_0_5= '&' | lv_init_0_6= '*' | lv_init_0_7= '/' | lv_init_0_8= ':' | lv_init_0_9= '<' | lv_init_0_10= '=' | lv_init_0_11= '>' | lv_init_0_12= '?' | lv_init_0_13= '~' | lv_init_0_14= '_' | lv_init_0_15= '^' ) )
            // InternalMyDsl.g:1253:4: (lv_init_0_1= RULE_LETTER | lv_init_0_2= '!' | lv_init_0_3= '$' | lv_init_0_4= '%' | lv_init_0_5= '&' | lv_init_0_6= '*' | lv_init_0_7= '/' | lv_init_0_8= ':' | lv_init_0_9= '<' | lv_init_0_10= '=' | lv_init_0_11= '>' | lv_init_0_12= '?' | lv_init_0_13= '~' | lv_init_0_14= '_' | lv_init_0_15= '^' )
            {
            // InternalMyDsl.g:1253:4: (lv_init_0_1= RULE_LETTER | lv_init_0_2= '!' | lv_init_0_3= '$' | lv_init_0_4= '%' | lv_init_0_5= '&' | lv_init_0_6= '*' | lv_init_0_7= '/' | lv_init_0_8= ':' | lv_init_0_9= '<' | lv_init_0_10= '=' | lv_init_0_11= '>' | lv_init_0_12= '?' | lv_init_0_13= '~' | lv_init_0_14= '_' | lv_init_0_15= '^' )
            int alt17=15;
            switch ( input.LA(1) ) {
            case RULE_LETTER:
                {
                alt17=1;
                }
                break;
            case 31:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            case 33:
                {
                alt17=4;
                }
                break;
            case 34:
                {
                alt17=5;
                }
                break;
            case 35:
                {
                alt17=6;
                }
                break;
            case 36:
                {
                alt17=7;
                }
                break;
            case 37:
                {
                alt17=8;
                }
                break;
            case 21:
                {
                alt17=9;
                }
                break;
            case 23:
                {
                alt17=10;
                }
                break;
            case 22:
                {
                alt17=11;
                }
                break;
            case 38:
                {
                alt17=12;
                }
                break;
            case 39:
                {
                alt17=13;
                }
                break;
            case 40:
                {
                alt17=14;
                }
                break;
            case 41:
                {
                alt17=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1254:5: lv_init_0_1= RULE_LETTER
                    {
                    lv_init_0_1=(Token)match(input,RULE_LETTER,FOLLOW_2); 

                    					newLeafNode(lv_init_0_1, grammarAccess.getInitialAccess().getInitLETTERTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"init",
                    						lv_init_0_1,
                    						"org.xtext.example.mydsl.MyDsl.LETTER");
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1269:5: lv_init_0_2= '!'
                    {
                    lv_init_0_2=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_init_0_2, grammarAccess.getInitialAccess().getInitExclamationMarkKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_2, null);
                    				

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1280:5: lv_init_0_3= '$'
                    {
                    lv_init_0_3=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_init_0_3, grammarAccess.getInitialAccess().getInitDollarSignKeyword_0_2());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_3, null);
                    				

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1291:5: lv_init_0_4= '%'
                    {
                    lv_init_0_4=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_init_0_4, grammarAccess.getInitialAccess().getInitPercentSignKeyword_0_3());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_4, null);
                    				

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1302:5: lv_init_0_5= '&'
                    {
                    lv_init_0_5=(Token)match(input,34,FOLLOW_2); 

                    					newLeafNode(lv_init_0_5, grammarAccess.getInitialAccess().getInitAmpersandKeyword_0_4());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_5, null);
                    				

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1313:5: lv_init_0_6= '*'
                    {
                    lv_init_0_6=(Token)match(input,35,FOLLOW_2); 

                    					newLeafNode(lv_init_0_6, grammarAccess.getInitialAccess().getInitAsteriskKeyword_0_5());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_6, null);
                    				

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1324:5: lv_init_0_7= '/'
                    {
                    lv_init_0_7=(Token)match(input,36,FOLLOW_2); 

                    					newLeafNode(lv_init_0_7, grammarAccess.getInitialAccess().getInitSolidusKeyword_0_6());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_7, null);
                    				

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1335:5: lv_init_0_8= ':'
                    {
                    lv_init_0_8=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_init_0_8, grammarAccess.getInitialAccess().getInitColonKeyword_0_7());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_8, null);
                    				

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1346:5: lv_init_0_9= '<'
                    {
                    lv_init_0_9=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_init_0_9, grammarAccess.getInitialAccess().getInitLessThanSignKeyword_0_8());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_9, null);
                    				

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1357:5: lv_init_0_10= '='
                    {
                    lv_init_0_10=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_init_0_10, grammarAccess.getInitialAccess().getInitEqualsSignKeyword_0_9());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_10, null);
                    				

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1368:5: lv_init_0_11= '>'
                    {
                    lv_init_0_11=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_init_0_11, grammarAccess.getInitialAccess().getInitGreaterThanSignKeyword_0_10());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_11, null);
                    				

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1379:5: lv_init_0_12= '?'
                    {
                    lv_init_0_12=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_init_0_12, grammarAccess.getInitialAccess().getInitQuestionMarkKeyword_0_11());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_12, null);
                    				

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1390:5: lv_init_0_13= '~'
                    {
                    lv_init_0_13=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_init_0_13, grammarAccess.getInitialAccess().getInitTildeKeyword_0_12());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_13, null);
                    				

                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1401:5: lv_init_0_14= '_'
                    {
                    lv_init_0_14=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_init_0_14, grammarAccess.getInitialAccess().getInit_Keyword_0_13());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_14, null);
                    				

                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:1412:5: lv_init_0_15= '^'
                    {
                    lv_init_0_15=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_init_0_15, grammarAccess.getInitialAccess().getInitCircumflexAccentKeyword_0_14());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getInitialRule());
                    					}
                    					setWithLastConsumed(current, "init", lv_init_0_15, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleSubsequent"
    // InternalMyDsl.g:1428:1: entryRuleSubsequent returns [EObject current=null] : iv_ruleSubsequent= ruleSubsequent EOF ;
    public final EObject entryRuleSubsequent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubsequent = null;


        try {
            // InternalMyDsl.g:1428:51: (iv_ruleSubsequent= ruleSubsequent EOF )
            // InternalMyDsl.g:1429:2: iv_ruleSubsequent= ruleSubsequent EOF
            {
             newCompositeNode(grammarAccess.getSubsequentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubsequent=ruleSubsequent();

            state._fsp--;

             current =iv_ruleSubsequent; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubsequent"


    // $ANTLR start "ruleSubsequent"
    // InternalMyDsl.g:1435:1: ruleSubsequent returns [EObject current=null] : ( () ( ( (lv_init_1_0= ruleInitial ) ) | this_DIGIT_2= RULE_DIGIT | otherlv_3= '.' | otherlv_4= '+' | otherlv_5= '-' ) ) ;
    public final EObject ruleSubsequent() throws RecognitionException {
        EObject current = null;

        Token this_DIGIT_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_init_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1441:2: ( ( () ( ( (lv_init_1_0= ruleInitial ) ) | this_DIGIT_2= RULE_DIGIT | otherlv_3= '.' | otherlv_4= '+' | otherlv_5= '-' ) ) )
            // InternalMyDsl.g:1442:2: ( () ( ( (lv_init_1_0= ruleInitial ) ) | this_DIGIT_2= RULE_DIGIT | otherlv_3= '.' | otherlv_4= '+' | otherlv_5= '-' ) )
            {
            // InternalMyDsl.g:1442:2: ( () ( ( (lv_init_1_0= ruleInitial ) ) | this_DIGIT_2= RULE_DIGIT | otherlv_3= '.' | otherlv_4= '+' | otherlv_5= '-' ) )
            // InternalMyDsl.g:1443:3: () ( ( (lv_init_1_0= ruleInitial ) ) | this_DIGIT_2= RULE_DIGIT | otherlv_3= '.' | otherlv_4= '+' | otherlv_5= '-' )
            {
            // InternalMyDsl.g:1443:3: ()
            // InternalMyDsl.g:1444:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getSubsequentAccess().getSubsequentAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:1450:3: ( ( (lv_init_1_0= ruleInitial ) ) | this_DIGIT_2= RULE_DIGIT | otherlv_3= '.' | otherlv_4= '+' | otherlv_5= '-' )
            int alt18=5;
            switch ( input.LA(1) ) {
            case RULE_LETTER:
            case 21:
            case 22:
            case 23:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
                {
                alt18=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt18=2;
                }
                break;
            case 20:
                {
                alt18=3;
                }
                break;
            case 42:
                {
                alt18=4;
                }
                break;
            case 43:
                {
                alt18=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMyDsl.g:1451:4: ( (lv_init_1_0= ruleInitial ) )
                    {
                    // InternalMyDsl.g:1451:4: ( (lv_init_1_0= ruleInitial ) )
                    // InternalMyDsl.g:1452:5: (lv_init_1_0= ruleInitial )
                    {
                    // InternalMyDsl.g:1452:5: (lv_init_1_0= ruleInitial )
                    // InternalMyDsl.g:1453:6: lv_init_1_0= ruleInitial
                    {

                    						newCompositeNode(grammarAccess.getSubsequentAccess().getInitInitialParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_init_1_0=ruleInitial();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubsequentRule());
                    						}
                    						set(
                    							current,
                    							"init",
                    							lv_init_1_0,
                    							"org.xtext.example.mydsl.MyDsl.Initial");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1471:4: this_DIGIT_2= RULE_DIGIT
                    {
                    this_DIGIT_2=(Token)match(input,RULE_DIGIT,FOLLOW_2); 

                    				newLeafNode(this_DIGIT_2, grammarAccess.getSubsequentAccess().getDIGITTerminalRuleCall_1_1());
                    			

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1476:4: otherlv_3= '.'
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getSubsequentAccess().getFullStopKeyword_1_2());
                    			

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1481:4: otherlv_4= '+'
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getSubsequentAccess().getPlusSignKeyword_1_3());
                    			

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1486:4: otherlv_5= '-'
                    {
                    otherlv_5=(Token)match(input,43,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getSubsequentAccess().getHyphenMinusKeyword_1_4());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubsequent"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\21\1\22\2\4\1\uffff\2\4\2\uffff";
    static final String dfa_3s = "\1\21\1\22\1\21\1\4\1\uffff\2\24\2\uffff";
    static final String dfa_4s = "\4\uffff\1\1\2\uffff\1\2\1\3";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\4\14\uffff\1\3",
            "\1\5",
            "",
            "\1\6\16\uffff\1\7\1\10",
            "\1\6\16\uffff\1\7\1\10",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "208:2: ( (otherlv_0= '(' otherlv_1= 'define' ( (lv_variable_2_0= RULE_ID ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' ) | (otherlv_13= '(' otherlv_14= 'define' otherlv_15= '(' ( (lv_variable_16_0= RULE_ID ) ) ( (lv_variables_17_0= RULE_ID ) )* otherlv_18= '.' ( (lv_var_19_0= RULE_ID ) ) otherlv_20= ')' ( (lv_body_21_0= ruleBody ) ) otherlv_22= ')' ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000000207D2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000000A07D0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000207D0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x00000000000007D0L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000080020L});

}