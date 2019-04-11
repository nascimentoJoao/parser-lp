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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_BOOL", "RULE_MATH", "RULE_DIGIT", "RULE_DOUBLE", "RULE_STRING", "RULE_LETTER", "RULE_NEGATIVE", "RULE_OPER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'('", "'define'", "')'", "'<'", "'>'", "'='", "'>='", "'<='", "'set!'", "'if'", "'list'", "'length'"
    };
    public static final int RULE_STRING=9;
    public static final int RULE_MATH=6;
    public static final int RULE_NEGATIVE=11;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_DOUBLE=8;
    public static final int RULE_OPER=12;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=16;
    public static final int RULE_DIGIT=7;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_BOOL=5;
    public static final int RULE_LETTER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=13;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=14;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalMyDsl.g:71:1: ruleProgram returns [EObject current=null] : ( ( (lv_program_0_0= ruleExpression ) ) | ( (lv_program_1_0= ruleDefinition ) ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_program_0_0 = null;

        EObject lv_program_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( ( (lv_program_0_0= ruleExpression ) ) | ( (lv_program_1_0= ruleDefinition ) ) )* )
            // InternalMyDsl.g:78:2: ( ( (lv_program_0_0= ruleExpression ) ) | ( (lv_program_1_0= ruleDefinition ) ) )*
            {
            // InternalMyDsl.g:78:2: ( ( (lv_program_0_0= ruleExpression ) ) | ( (lv_program_1_0= ruleDefinition ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_ID && LA1_0<=RULE_BOOL)||(LA1_0>=RULE_DIGIT && LA1_0<=RULE_OPER)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==18) ) {
                    int LA1_3 = input.LA(2);

                    if ( (LA1_3==RULE_MATH||LA1_3==RULE_OPER||(LA1_3>=21 && LA1_3<=29)) ) {
                        alt1=1;
                    }
                    else if ( (LA1_3==19) ) {
                        alt1=2;
                    }


                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:79:3: ( (lv_program_0_0= ruleExpression ) )
            	    {
            	    // InternalMyDsl.g:79:3: ( (lv_program_0_0= ruleExpression ) )
            	    // InternalMyDsl.g:80:4: (lv_program_0_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:80:4: (lv_program_0_0= ruleExpression )
            	    // InternalMyDsl.g:81:5: lv_program_0_0= ruleExpression
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getProgramExpressionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_program_0_0=ruleExpression();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"program",
            	    						lv_program_0_0,
            	    						"org.xtext.example.mydsl.MyDsl.Expression");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMyDsl.g:99:3: ( (lv_program_1_0= ruleDefinition ) )
            	    {
            	    // InternalMyDsl.g:99:3: ( (lv_program_1_0= ruleDefinition ) )
            	    // InternalMyDsl.g:100:4: (lv_program_1_0= ruleDefinition )
            	    {
            	    // InternalMyDsl.g:100:4: (lv_program_1_0= ruleDefinition )
            	    // InternalMyDsl.g:101:5: lv_program_1_0= ruleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getProgramAccess().getProgramDefinitionParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_program_1_0=ruleDefinition();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getProgramRule());
            	    					}
            	    					add(
            	    						current,
            	    						"program",
            	    						lv_program_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Definition");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


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


    // $ANTLR start "entryRuleDefinition"
    // InternalMyDsl.g:122:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // InternalMyDsl.g:122:51: (iv_ruleDefinition= ruleDefinition EOF )
            // InternalMyDsl.g:123:2: iv_ruleDefinition= ruleDefinition EOF
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
    // InternalMyDsl.g:129:1: ruleDefinition returns [EObject current=null] : ( (otherlv_0= '(' otherlv_1= 'define' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' ) ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_variable_8_0=null;
        Token lv_variables_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        AntlrDatatypeRuleToken lv_cons_2_0 = null;

        EObject lv_expression_3_0 = null;

        EObject lv_body_11_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:135:2: ( ( (otherlv_0= '(' otherlv_1= 'define' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' ) ) )
            // InternalMyDsl.g:136:2: ( (otherlv_0= '(' otherlv_1= 'define' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' ) )
            {
            // InternalMyDsl.g:136:2: ( (otherlv_0= '(' otherlv_1= 'define' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) | (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==19) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==18) ) {
                        alt3=2;
                    }
                    else if ( ((LA3_2>=RULE_ID && LA3_2<=RULE_BOOL)||(LA3_2>=RULE_DIGIT && LA3_2<=RULE_NEGATIVE)) ) {
                        alt3=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:137:3: (otherlv_0= '(' otherlv_1= 'define' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
                    {
                    // InternalMyDsl.g:137:3: (otherlv_0= '(' otherlv_1= 'define' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
                    // InternalMyDsl.g:138:4: otherlv_0= '(' otherlv_1= 'define' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
                    {
                    otherlv_0=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_0, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_0_0());
                    			
                    otherlv_1=(Token)match(input,19,FOLLOW_5); 

                    				newLeafNode(otherlv_1, grammarAccess.getDefinitionAccess().getDefineKeyword_0_1());
                    			
                    // InternalMyDsl.g:146:4: ( (lv_cons_2_0= ruleConstant ) )
                    // InternalMyDsl.g:147:5: (lv_cons_2_0= ruleConstant )
                    {
                    // InternalMyDsl.g:147:5: (lv_cons_2_0= ruleConstant )
                    // InternalMyDsl.g:148:6: lv_cons_2_0= ruleConstant
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getConsConstantParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_cons_2_0=ruleConstant();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"cons",
                    							lv_cons_2_0,
                    							"org.xtext.example.mydsl.MyDsl.Constant");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:165:4: ( (lv_expression_3_0= ruleExpression ) )
                    // InternalMyDsl.g:166:5: (lv_expression_3_0= ruleExpression )
                    {
                    // InternalMyDsl.g:166:5: (lv_expression_3_0= ruleExpression )
                    // InternalMyDsl.g:167:6: lv_expression_3_0= ruleExpression
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_0_3_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_expression_3_0=ruleExpression();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"expression",
                    							lv_expression_3_0,
                    							"org.xtext.example.mydsl.MyDsl.Expression");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:190:3: (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' )
                    {
                    // InternalMyDsl.g:190:3: (otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')' )
                    // InternalMyDsl.g:191:4: otherlv_5= '(' otherlv_6= 'define' otherlv_7= '(' ( (lv_variable_8_0= RULE_ID ) ) ( (lv_variables_9_0= RULE_ID ) )* otherlv_10= ')' ( (lv_body_11_0= ruleBody ) ) otherlv_12= ')'
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_4); 

                    				newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0());
                    			
                    otherlv_6=(Token)match(input,19,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getDefinitionAccess().getDefineKeyword_1_1());
                    			
                    otherlv_7=(Token)match(input,18,FOLLOW_9); 

                    				newLeafNode(otherlv_7, grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_2());
                    			
                    // InternalMyDsl.g:203:4: ( (lv_variable_8_0= RULE_ID ) )
                    // InternalMyDsl.g:204:5: (lv_variable_8_0= RULE_ID )
                    {
                    // InternalMyDsl.g:204:5: (lv_variable_8_0= RULE_ID )
                    // InternalMyDsl.g:205:6: lv_variable_8_0= RULE_ID
                    {
                    lv_variable_8_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(lv_variable_8_0, grammarAccess.getDefinitionAccess().getVariableIDTerminalRuleCall_1_3_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getDefinitionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"variable",
                    							lv_variable_8_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalMyDsl.g:221:4: ( (lv_variables_9_0= RULE_ID ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_ID) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalMyDsl.g:222:5: (lv_variables_9_0= RULE_ID )
                    	    {
                    	    // InternalMyDsl.g:222:5: (lv_variables_9_0= RULE_ID )
                    	    // InternalMyDsl.g:223:6: lv_variables_9_0= RULE_ID
                    	    {
                    	    lv_variables_9_0=(Token)match(input,RULE_ID,FOLLOW_10); 

                    	    						newLeafNode(lv_variables_9_0, grammarAccess.getDefinitionAccess().getVariablesIDTerminalRuleCall_1_4_0());
                    	    					

                    	    						if (current==null) {
                    	    							current = createModelElement(grammarAccess.getDefinitionRule());
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
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_10, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_5());
                    			
                    // InternalMyDsl.g:243:4: ( (lv_body_11_0= ruleBody ) )
                    // InternalMyDsl.g:244:5: (lv_body_11_0= ruleBody )
                    {
                    // InternalMyDsl.g:244:5: (lv_body_11_0= ruleBody )
                    // InternalMyDsl.g:245:6: lv_body_11_0= ruleBody
                    {

                    						newCompositeNode(grammarAccess.getDefinitionAccess().getBodyBodyParserRuleCall_1_6_0());
                    					
                    pushFollow(FOLLOW_7);
                    lv_body_11_0=ruleBody();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDefinitionRule());
                    						}
                    						set(
                    							current,
                    							"body",
                    							lv_body_11_0,
                    							"org.xtext.example.mydsl.MyDsl.Body");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_7());
                    			

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleBody"
    // InternalMyDsl.g:271:1: entryRuleBody returns [EObject current=null] : iv_ruleBody= ruleBody EOF ;
    public final EObject entryRuleBody() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBody = null;


        try {
            // InternalMyDsl.g:271:45: (iv_ruleBody= ruleBody EOF )
            // InternalMyDsl.g:272:2: iv_ruleBody= ruleBody EOF
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
    // InternalMyDsl.g:278:1: ruleBody returns [EObject current=null] : ( ( (lv_definition_0_0= ruleDefinition ) )* ( (lv_expression_1_0= ruleExpression ) )+ ) ;
    public final EObject ruleBody() throws RecognitionException {
        EObject current = null;

        EObject lv_definition_0_0 = null;

        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:284:2: ( ( ( (lv_definition_0_0= ruleDefinition ) )* ( (lv_expression_1_0= ruleExpression ) )+ ) )
            // InternalMyDsl.g:285:2: ( ( (lv_definition_0_0= ruleDefinition ) )* ( (lv_expression_1_0= ruleExpression ) )+ )
            {
            // InternalMyDsl.g:285:2: ( ( (lv_definition_0_0= ruleDefinition ) )* ( (lv_expression_1_0= ruleExpression ) )+ )
            // InternalMyDsl.g:286:3: ( (lv_definition_0_0= ruleDefinition ) )* ( (lv_expression_1_0= ruleExpression ) )+
            {
            // InternalMyDsl.g:286:3: ( (lv_definition_0_0= ruleDefinition ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==18) ) {
                    int LA4_2 = input.LA(2);

                    if ( (LA4_2==19) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:287:4: (lv_definition_0_0= ruleDefinition )
            	    {
            	    // InternalMyDsl.g:287:4: (lv_definition_0_0= ruleDefinition )
            	    // InternalMyDsl.g:288:5: lv_definition_0_0= ruleDefinition
            	    {

            	    					newCompositeNode(grammarAccess.getBodyAccess().getDefinitionDefinitionParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_6);
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
            	    break loop4;
                }
            } while (true);

            // InternalMyDsl.g:305:3: ( (lv_expression_1_0= ruleExpression ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_BOOL)||(LA5_0>=RULE_DIGIT && LA5_0<=RULE_OPER)||LA5_0==18) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:306:4: (lv_expression_1_0= ruleExpression )
            	    {
            	    // InternalMyDsl.g:306:4: (lv_expression_1_0= ruleExpression )
            	    // InternalMyDsl.g:307:5: lv_expression_1_0= ruleExpression
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
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // InternalMyDsl.g:328:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalMyDsl.g:328:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalMyDsl.g:329:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalMyDsl.g:335:1: ruleExpression returns [EObject current=null] : ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_oper_1_0= ruleOperation ) ) | ( (lv_comp_2_0= ruleComparison ) ) | ( (lv_cond_3_0= ruleConditional ) ) | ( (lv_set_4_0= ruleSet ) ) | ( (lv_trig_5_0= ruleTrigonometry ) ) | ( (lv_list_6_0= ruleListNumbers ) ) | ( (lv_listLength_7_0= ruleListLength ) ) | ( (lv_nestedOperation_8_0= ruleNestedOperation ) ) | ( (lv_calculate_9_0= ruleCalculate ) ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_constant_0_0 = null;

        EObject lv_oper_1_0 = null;

        EObject lv_comp_2_0 = null;

        EObject lv_cond_3_0 = null;

        EObject lv_set_4_0 = null;

        EObject lv_trig_5_0 = null;

        EObject lv_list_6_0 = null;

        EObject lv_listLength_7_0 = null;

        EObject lv_nestedOperation_8_0 = null;

        EObject lv_calculate_9_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:341:2: ( ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_oper_1_0= ruleOperation ) ) | ( (lv_comp_2_0= ruleComparison ) ) | ( (lv_cond_3_0= ruleConditional ) ) | ( (lv_set_4_0= ruleSet ) ) | ( (lv_trig_5_0= ruleTrigonometry ) ) | ( (lv_list_6_0= ruleListNumbers ) ) | ( (lv_listLength_7_0= ruleListLength ) ) | ( (lv_nestedOperation_8_0= ruleNestedOperation ) ) | ( (lv_calculate_9_0= ruleCalculate ) ) ) )
            // InternalMyDsl.g:342:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_oper_1_0= ruleOperation ) ) | ( (lv_comp_2_0= ruleComparison ) ) | ( (lv_cond_3_0= ruleConditional ) ) | ( (lv_set_4_0= ruleSet ) ) | ( (lv_trig_5_0= ruleTrigonometry ) ) | ( (lv_list_6_0= ruleListNumbers ) ) | ( (lv_listLength_7_0= ruleListLength ) ) | ( (lv_nestedOperation_8_0= ruleNestedOperation ) ) | ( (lv_calculate_9_0= ruleCalculate ) ) )
            {
            // InternalMyDsl.g:342:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_oper_1_0= ruleOperation ) ) | ( (lv_comp_2_0= ruleComparison ) ) | ( (lv_cond_3_0= ruleConditional ) ) | ( (lv_set_4_0= ruleSet ) ) | ( (lv_trig_5_0= ruleTrigonometry ) ) | ( (lv_list_6_0= ruleListNumbers ) ) | ( (lv_listLength_7_0= ruleListLength ) ) | ( (lv_nestedOperation_8_0= ruleNestedOperation ) ) | ( (lv_calculate_9_0= ruleCalculate ) ) )
            int alt6=10;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:343:3: ( (lv_constant_0_0= ruleConstant ) )
                    {
                    // InternalMyDsl.g:343:3: ( (lv_constant_0_0= ruleConstant ) )
                    // InternalMyDsl.g:344:4: (lv_constant_0_0= ruleConstant )
                    {
                    // InternalMyDsl.g:344:4: (lv_constant_0_0= ruleConstant )
                    // InternalMyDsl.g:345:5: lv_constant_0_0= ruleConstant
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
                    // InternalMyDsl.g:363:3: ( (lv_oper_1_0= ruleOperation ) )
                    {
                    // InternalMyDsl.g:363:3: ( (lv_oper_1_0= ruleOperation ) )
                    // InternalMyDsl.g:364:4: (lv_oper_1_0= ruleOperation )
                    {
                    // InternalMyDsl.g:364:4: (lv_oper_1_0= ruleOperation )
                    // InternalMyDsl.g:365:5: lv_oper_1_0= ruleOperation
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
                    // InternalMyDsl.g:383:3: ( (lv_comp_2_0= ruleComparison ) )
                    {
                    // InternalMyDsl.g:383:3: ( (lv_comp_2_0= ruleComparison ) )
                    // InternalMyDsl.g:384:4: (lv_comp_2_0= ruleComparison )
                    {
                    // InternalMyDsl.g:384:4: (lv_comp_2_0= ruleComparison )
                    // InternalMyDsl.g:385:5: lv_comp_2_0= ruleComparison
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getCompComparisonParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comp_2_0=ruleComparison();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"comp",
                    						lv_comp_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Comparison");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:403:3: ( (lv_cond_3_0= ruleConditional ) )
                    {
                    // InternalMyDsl.g:403:3: ( (lv_cond_3_0= ruleConditional ) )
                    // InternalMyDsl.g:404:4: (lv_cond_3_0= ruleConditional )
                    {
                    // InternalMyDsl.g:404:4: (lv_cond_3_0= ruleConditional )
                    // InternalMyDsl.g:405:5: lv_cond_3_0= ruleConditional
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getCondConditionalParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_cond_3_0=ruleConditional();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"cond",
                    						lv_cond_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Conditional");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:423:3: ( (lv_set_4_0= ruleSet ) )
                    {
                    // InternalMyDsl.g:423:3: ( (lv_set_4_0= ruleSet ) )
                    // InternalMyDsl.g:424:4: (lv_set_4_0= ruleSet )
                    {
                    // InternalMyDsl.g:424:4: (lv_set_4_0= ruleSet )
                    // InternalMyDsl.g:425:5: lv_set_4_0= ruleSet
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getSetSetParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_set_4_0=ruleSet();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"set",
                    						lv_set_4_0,
                    						"org.xtext.example.mydsl.MyDsl.Set");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:443:3: ( (lv_trig_5_0= ruleTrigonometry ) )
                    {
                    // InternalMyDsl.g:443:3: ( (lv_trig_5_0= ruleTrigonometry ) )
                    // InternalMyDsl.g:444:4: (lv_trig_5_0= ruleTrigonometry )
                    {
                    // InternalMyDsl.g:444:4: (lv_trig_5_0= ruleTrigonometry )
                    // InternalMyDsl.g:445:5: lv_trig_5_0= ruleTrigonometry
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getTrigTrigonometryParserRuleCall_5_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_trig_5_0=ruleTrigonometry();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"trig",
                    						lv_trig_5_0,
                    						"org.xtext.example.mydsl.MyDsl.Trigonometry");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:463:3: ( (lv_list_6_0= ruleListNumbers ) )
                    {
                    // InternalMyDsl.g:463:3: ( (lv_list_6_0= ruleListNumbers ) )
                    // InternalMyDsl.g:464:4: (lv_list_6_0= ruleListNumbers )
                    {
                    // InternalMyDsl.g:464:4: (lv_list_6_0= ruleListNumbers )
                    // InternalMyDsl.g:465:5: lv_list_6_0= ruleListNumbers
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getListListNumbersParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_list_6_0=ruleListNumbers();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"list",
                    						lv_list_6_0,
                    						"org.xtext.example.mydsl.MyDsl.ListNumbers");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:483:3: ( (lv_listLength_7_0= ruleListLength ) )
                    {
                    // InternalMyDsl.g:483:3: ( (lv_listLength_7_0= ruleListLength ) )
                    // InternalMyDsl.g:484:4: (lv_listLength_7_0= ruleListLength )
                    {
                    // InternalMyDsl.g:484:4: (lv_listLength_7_0= ruleListLength )
                    // InternalMyDsl.g:485:5: lv_listLength_7_0= ruleListLength
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getListLengthListLengthParserRuleCall_7_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_listLength_7_0=ruleListLength();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"listLength",
                    						lv_listLength_7_0,
                    						"org.xtext.example.mydsl.MyDsl.ListLength");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:503:3: ( (lv_nestedOperation_8_0= ruleNestedOperation ) )
                    {
                    // InternalMyDsl.g:503:3: ( (lv_nestedOperation_8_0= ruleNestedOperation ) )
                    // InternalMyDsl.g:504:4: (lv_nestedOperation_8_0= ruleNestedOperation )
                    {
                    // InternalMyDsl.g:504:4: (lv_nestedOperation_8_0= ruleNestedOperation )
                    // InternalMyDsl.g:505:5: lv_nestedOperation_8_0= ruleNestedOperation
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getNestedOperationNestedOperationParserRuleCall_8_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_nestedOperation_8_0=ruleNestedOperation();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"nestedOperation",
                    						lv_nestedOperation_8_0,
                    						"org.xtext.example.mydsl.MyDsl.NestedOperation");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:523:3: ( (lv_calculate_9_0= ruleCalculate ) )
                    {
                    // InternalMyDsl.g:523:3: ( (lv_calculate_9_0= ruleCalculate ) )
                    // InternalMyDsl.g:524:4: (lv_calculate_9_0= ruleCalculate )
                    {
                    // InternalMyDsl.g:524:4: (lv_calculate_9_0= ruleCalculate )
                    // InternalMyDsl.g:525:5: lv_calculate_9_0= ruleCalculate
                    {

                    					newCompositeNode(grammarAccess.getExpressionAccess().getCalculateCalculateParserRuleCall_9_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_calculate_9_0=ruleCalculate();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getExpressionRule());
                    					}
                    					set(
                    						current,
                    						"calculate",
                    						lv_calculate_9_0,
                    						"org.xtext.example.mydsl.MyDsl.Calculate");
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
    // InternalMyDsl.g:546:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalMyDsl.g:546:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalMyDsl.g:547:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalMyDsl.g:553:1: ruleComparison returns [EObject current=null] : ( () ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= ruleNumber ) ) ( (lv_num2_8_0= ruleNumber ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL ) ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_9=null;
        Token this_BOOL_10=null;
        AntlrDatatypeRuleToken lv_num1_7_0 = null;

        AntlrDatatypeRuleToken lv_num2_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:559:2: ( ( () ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= ruleNumber ) ) ( (lv_num2_8_0= ruleNumber ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL ) ) )
            // InternalMyDsl.g:560:2: ( () ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= ruleNumber ) ) ( (lv_num2_8_0= ruleNumber ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL ) )
            {
            // InternalMyDsl.g:560:2: ( () ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= ruleNumber ) ) ( (lv_num2_8_0= ruleNumber ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL ) )
            // InternalMyDsl.g:561:3: () ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= ruleNumber ) ) ( (lv_num2_8_0= ruleNumber ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL )
            {
            // InternalMyDsl.g:561:3: ()
            // InternalMyDsl.g:562:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComparisonAccess().getComparisonAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:568:3: ( (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= ruleNumber ) ) ( (lv_num2_8_0= ruleNumber ) ) otherlv_9= ')' ) | this_BOOL_10= RULE_BOOL )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==18) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_BOOL) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:569:4: (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= ruleNumber ) ) ( (lv_num2_8_0= ruleNumber ) ) otherlv_9= ')' )
                    {
                    // InternalMyDsl.g:569:4: (otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= ruleNumber ) ) ( (lv_num2_8_0= ruleNumber ) ) otherlv_9= ')' )
                    // InternalMyDsl.g:570:5: otherlv_1= '(' (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' ) ( (lv_num1_7_0= ruleNumber ) ) ( (lv_num2_8_0= ruleNumber ) ) otherlv_9= ')'
                    {
                    otherlv_1=(Token)match(input,18,FOLLOW_11); 

                    					newLeafNode(otherlv_1, grammarAccess.getComparisonAccess().getLeftParenthesisKeyword_1_0_0());
                    				
                    // InternalMyDsl.g:574:5: (otherlv_2= '<' | otherlv_3= '>' | otherlv_4= '=' | otherlv_5= '>=' | otherlv_6= '<=' )
                    int alt7=5;
                    switch ( input.LA(1) ) {
                    case 21:
                        {
                        alt7=1;
                        }
                        break;
                    case 22:
                        {
                        alt7=2;
                        }
                        break;
                    case 23:
                        {
                        alt7=3;
                        }
                        break;
                    case 24:
                        {
                        alt7=4;
                        }
                        break;
                    case 25:
                        {
                        alt7=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }

                    switch (alt7) {
                        case 1 :
                            // InternalMyDsl.g:575:6: otherlv_2= '<'
                            {
                            otherlv_2=(Token)match(input,21,FOLLOW_12); 

                            						newLeafNode(otherlv_2, grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1_0());
                            					

                            }
                            break;
                        case 2 :
                            // InternalMyDsl.g:580:6: otherlv_3= '>'
                            {
                            otherlv_3=(Token)match(input,22,FOLLOW_12); 

                            						newLeafNode(otherlv_3, grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_1());
                            					

                            }
                            break;
                        case 3 :
                            // InternalMyDsl.g:585:6: otherlv_4= '='
                            {
                            otherlv_4=(Token)match(input,23,FOLLOW_12); 

                            						newLeafNode(otherlv_4, grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0_1_2());
                            					

                            }
                            break;
                        case 4 :
                            // InternalMyDsl.g:590:6: otherlv_5= '>='
                            {
                            otherlv_5=(Token)match(input,24,FOLLOW_12); 

                            						newLeafNode(otherlv_5, grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_1_3());
                            					

                            }
                            break;
                        case 5 :
                            // InternalMyDsl.g:595:6: otherlv_6= '<='
                            {
                            otherlv_6=(Token)match(input,25,FOLLOW_12); 

                            						newLeafNode(otherlv_6, grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_4());
                            					

                            }
                            break;

                    }

                    // InternalMyDsl.g:600:5: ( (lv_num1_7_0= ruleNumber ) )
                    // InternalMyDsl.g:601:6: (lv_num1_7_0= ruleNumber )
                    {
                    // InternalMyDsl.g:601:6: (lv_num1_7_0= ruleNumber )
                    // InternalMyDsl.g:602:7: lv_num1_7_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getComparisonAccess().getNum1NumberParserRuleCall_1_0_2_0());
                    						
                    pushFollow(FOLLOW_12);
                    lv_num1_7_0=ruleNumber();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getComparisonRule());
                    							}
                    							set(
                    								current,
                    								"num1",
                    								lv_num1_7_0,
                    								"org.xtext.example.mydsl.MyDsl.Number");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    // InternalMyDsl.g:619:5: ( (lv_num2_8_0= ruleNumber ) )
                    // InternalMyDsl.g:620:6: (lv_num2_8_0= ruleNumber )
                    {
                    // InternalMyDsl.g:620:6: (lv_num2_8_0= ruleNumber )
                    // InternalMyDsl.g:621:7: lv_num2_8_0= ruleNumber
                    {

                    							newCompositeNode(grammarAccess.getComparisonAccess().getNum2NumberParserRuleCall_1_0_3_0());
                    						
                    pushFollow(FOLLOW_7);
                    lv_num2_8_0=ruleNumber();

                    state._fsp--;


                    							if (current==null) {
                    								current = createModelElementForParent(grammarAccess.getComparisonRule());
                    							}
                    							set(
                    								current,
                    								"num2",
                    								lv_num2_8_0,
                    								"org.xtext.example.mydsl.MyDsl.Number");
                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }

                    otherlv_9=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(otherlv_9, grammarAccess.getComparisonAccess().getRightParenthesisKeyword_1_0_4());
                    				

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:644:4: this_BOOL_10= RULE_BOOL
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


    // $ANTLR start "entryRuleTrigonometry"
    // InternalMyDsl.g:653:1: entryRuleTrigonometry returns [EObject current=null] : iv_ruleTrigonometry= ruleTrigonometry EOF ;
    public final EObject entryRuleTrigonometry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTrigonometry = null;


        try {
            // InternalMyDsl.g:653:53: (iv_ruleTrigonometry= ruleTrigonometry EOF )
            // InternalMyDsl.g:654:2: iv_ruleTrigonometry= ruleTrigonometry EOF
            {
             newCompositeNode(grammarAccess.getTrigonometryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTrigonometry=ruleTrigonometry();

            state._fsp--;

             current =iv_ruleTrigonometry; 
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
    // $ANTLR end "entryRuleTrigonometry"


    // $ANTLR start "ruleTrigonometry"
    // InternalMyDsl.g:660:1: ruleTrigonometry returns [EObject current=null] : ( ( (lv_trig_0_0= '(' ) ) this_MATH_1= RULE_MATH ( (lv_numb_2_0= ruleNumber ) ) otherlv_3= ')' ) ;
    public final EObject ruleTrigonometry() throws RecognitionException {
        EObject current = null;

        Token lv_trig_0_0=null;
        Token this_MATH_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_numb_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:666:2: ( ( ( (lv_trig_0_0= '(' ) ) this_MATH_1= RULE_MATH ( (lv_numb_2_0= ruleNumber ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:667:2: ( ( (lv_trig_0_0= '(' ) ) this_MATH_1= RULE_MATH ( (lv_numb_2_0= ruleNumber ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:667:2: ( ( (lv_trig_0_0= '(' ) ) this_MATH_1= RULE_MATH ( (lv_numb_2_0= ruleNumber ) ) otherlv_3= ')' )
            // InternalMyDsl.g:668:3: ( (lv_trig_0_0= '(' ) ) this_MATH_1= RULE_MATH ( (lv_numb_2_0= ruleNumber ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:668:3: ( (lv_trig_0_0= '(' ) )
            // InternalMyDsl.g:669:4: (lv_trig_0_0= '(' )
            {
            // InternalMyDsl.g:669:4: (lv_trig_0_0= '(' )
            // InternalMyDsl.g:670:5: lv_trig_0_0= '('
            {
            lv_trig_0_0=(Token)match(input,18,FOLLOW_13); 

            					newLeafNode(lv_trig_0_0, grammarAccess.getTrigonometryAccess().getTrigLeftParenthesisKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTrigonometryRule());
            					}
            					setWithLastConsumed(current, "trig", lv_trig_0_0, "(");
            				

            }


            }

            this_MATH_1=(Token)match(input,RULE_MATH,FOLLOW_12); 

            			newLeafNode(this_MATH_1, grammarAccess.getTrigonometryAccess().getMATHTerminalRuleCall_1());
            		
            // InternalMyDsl.g:686:3: ( (lv_numb_2_0= ruleNumber ) )
            // InternalMyDsl.g:687:4: (lv_numb_2_0= ruleNumber )
            {
            // InternalMyDsl.g:687:4: (lv_numb_2_0= ruleNumber )
            // InternalMyDsl.g:688:5: lv_numb_2_0= ruleNumber
            {

            					newCompositeNode(grammarAccess.getTrigonometryAccess().getNumbNumberParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_numb_2_0=ruleNumber();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTrigonometryRule());
            					}
            					add(
            						current,
            						"numb",
            						lv_numb_2_0,
            						"org.xtext.example.mydsl.MyDsl.Number");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getTrigonometryAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleTrigonometry"


    // $ANTLR start "entryRuleSet"
    // InternalMyDsl.g:713:1: entryRuleSet returns [EObject current=null] : iv_ruleSet= ruleSet EOF ;
    public final EObject entryRuleSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSet = null;


        try {
            // InternalMyDsl.g:713:44: (iv_ruleSet= ruleSet EOF )
            // InternalMyDsl.g:714:2: iv_ruleSet= ruleSet EOF
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
    // InternalMyDsl.g:720:1: ruleSet returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'set!' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) ;
    public final EObject ruleSet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_cons_2_0 = null;

        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:726:2: ( (otherlv_0= '(' otherlv_1= 'set!' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:727:2: (otherlv_0= '(' otherlv_1= 'set!' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:727:2: (otherlv_0= '(' otherlv_1= 'set!' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')' )
            // InternalMyDsl.g:728:3: otherlv_0= '(' otherlv_1= 'set!' ( (lv_cons_2_0= ruleConstant ) ) ( (lv_expression_3_0= ruleExpression ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getSetAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getSetAccess().getSetKeyword_1());
            		
            // InternalMyDsl.g:736:3: ( (lv_cons_2_0= ruleConstant ) )
            // InternalMyDsl.g:737:4: (lv_cons_2_0= ruleConstant )
            {
            // InternalMyDsl.g:737:4: (lv_cons_2_0= ruleConstant )
            // InternalMyDsl.g:738:5: lv_cons_2_0= ruleConstant
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

            // InternalMyDsl.g:755:3: ( (lv_expression_3_0= ruleExpression ) )
            // InternalMyDsl.g:756:4: (lv_expression_3_0= ruleExpression )
            {
            // InternalMyDsl.g:756:4: (lv_expression_3_0= ruleExpression )
            // InternalMyDsl.g:757:5: lv_expression_3_0= ruleExpression
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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMyDsl.g:782:1: entryRuleConditional returns [EObject current=null] : iv_ruleConditional= ruleConditional EOF ;
    public final EObject entryRuleConditional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditional = null;


        try {
            // InternalMyDsl.g:782:52: (iv_ruleConditional= ruleConditional EOF )
            // InternalMyDsl.g:783:2: iv_ruleConditional= ruleConditional EOF
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
    // InternalMyDsl.g:789:1: ruleConditional returns [EObject current=null] : (otherlv_0= '(' otherlv_1= 'if' ( (lv_condition_2_0= ruleComparison ) ) ( (lv_iftrue_3_0= ruleExpression ) ) ( (lv_else_4_0= ruleExpression ) )? otherlv_5= ')' ) ;
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
            // InternalMyDsl.g:795:2: ( (otherlv_0= '(' otherlv_1= 'if' ( (lv_condition_2_0= ruleComparison ) ) ( (lv_iftrue_3_0= ruleExpression ) ) ( (lv_else_4_0= ruleExpression ) )? otherlv_5= ')' ) )
            // InternalMyDsl.g:796:2: (otherlv_0= '(' otherlv_1= 'if' ( (lv_condition_2_0= ruleComparison ) ) ( (lv_iftrue_3_0= ruleExpression ) ) ( (lv_else_4_0= ruleExpression ) )? otherlv_5= ')' )
            {
            // InternalMyDsl.g:796:2: (otherlv_0= '(' otherlv_1= 'if' ( (lv_condition_2_0= ruleComparison ) ) ( (lv_iftrue_3_0= ruleExpression ) ) ( (lv_else_4_0= ruleExpression ) )? otherlv_5= ')' )
            // InternalMyDsl.g:797:3: otherlv_0= '(' otherlv_1= 'if' ( (lv_condition_2_0= ruleComparison ) ) ( (lv_iftrue_3_0= ruleExpression ) ) ( (lv_else_4_0= ruleExpression ) )? otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0());
            		
            otherlv_1=(Token)match(input,27,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getConditionalAccess().getIfKeyword_1());
            		
            // InternalMyDsl.g:805:3: ( (lv_condition_2_0= ruleComparison ) )
            // InternalMyDsl.g:806:4: (lv_condition_2_0= ruleComparison )
            {
            // InternalMyDsl.g:806:4: (lv_condition_2_0= ruleComparison )
            // InternalMyDsl.g:807:5: lv_condition_2_0= ruleComparison
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

            // InternalMyDsl.g:824:3: ( (lv_iftrue_3_0= ruleExpression ) )
            // InternalMyDsl.g:825:4: (lv_iftrue_3_0= ruleExpression )
            {
            // InternalMyDsl.g:825:4: (lv_iftrue_3_0= ruleExpression )
            // InternalMyDsl.g:826:5: lv_iftrue_3_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getConditionalAccess().getIftrueExpressionParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_17);
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

            // InternalMyDsl.g:843:3: ( (lv_else_4_0= ruleExpression ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>=RULE_ID && LA9_0<=RULE_BOOL)||(LA9_0>=RULE_DIGIT && LA9_0<=RULE_OPER)||LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:844:4: (lv_else_4_0= ruleExpression )
                    {
                    // InternalMyDsl.g:844:4: (lv_else_4_0= ruleExpression )
                    // InternalMyDsl.g:845:5: lv_else_4_0= ruleExpression
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

            otherlv_5=(Token)match(input,20,FOLLOW_2); 

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
    // InternalMyDsl.g:870:1: entryRuleConstant returns [String current=null] : iv_ruleConstant= ruleConstant EOF ;
    public final String entryRuleConstant() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleConstant = null;


        try {
            // InternalMyDsl.g:870:48: (iv_ruleConstant= ruleConstant EOF )
            // InternalMyDsl.g:871:2: iv_ruleConstant= ruleConstant EOF
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
    // InternalMyDsl.g:877:1: ruleConstant returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_BOOL_0= RULE_BOOL | this_DIGIT_1= RULE_DIGIT | this_DOUBLE_2= RULE_DOUBLE | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID | this_LETTER_5= RULE_LETTER | this_NEGATIVE_6= RULE_NEGATIVE ) ;
    public final AntlrDatatypeRuleToken ruleConstant() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_BOOL_0=null;
        Token this_DIGIT_1=null;
        Token this_DOUBLE_2=null;
        Token this_STRING_3=null;
        Token this_ID_4=null;
        Token this_LETTER_5=null;
        Token this_NEGATIVE_6=null;


        	enterRule();

        try {
            // InternalMyDsl.g:883:2: ( (this_BOOL_0= RULE_BOOL | this_DIGIT_1= RULE_DIGIT | this_DOUBLE_2= RULE_DOUBLE | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID | this_LETTER_5= RULE_LETTER | this_NEGATIVE_6= RULE_NEGATIVE ) )
            // InternalMyDsl.g:884:2: (this_BOOL_0= RULE_BOOL | this_DIGIT_1= RULE_DIGIT | this_DOUBLE_2= RULE_DOUBLE | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID | this_LETTER_5= RULE_LETTER | this_NEGATIVE_6= RULE_NEGATIVE )
            {
            // InternalMyDsl.g:884:2: (this_BOOL_0= RULE_BOOL | this_DIGIT_1= RULE_DIGIT | this_DOUBLE_2= RULE_DOUBLE | this_STRING_3= RULE_STRING | this_ID_4= RULE_ID | this_LETTER_5= RULE_LETTER | this_NEGATIVE_6= RULE_NEGATIVE )
            int alt10=7;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt10=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt10=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt10=3;
                }
                break;
            case RULE_STRING:
                {
                alt10=4;
                }
                break;
            case RULE_ID:
                {
                alt10=5;
                }
                break;
            case RULE_LETTER:
                {
                alt10=6;
                }
                break;
            case RULE_NEGATIVE:
                {
                alt10=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:885:3: this_BOOL_0= RULE_BOOL
                    {
                    this_BOOL_0=(Token)match(input,RULE_BOOL,FOLLOW_2); 

                    			current.merge(this_BOOL_0);
                    		

                    			newLeafNode(this_BOOL_0, grammarAccess.getConstantAccess().getBOOLTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:893:3: this_DIGIT_1= RULE_DIGIT
                    {
                    this_DIGIT_1=(Token)match(input,RULE_DIGIT,FOLLOW_2); 

                    			current.merge(this_DIGIT_1);
                    		

                    			newLeafNode(this_DIGIT_1, grammarAccess.getConstantAccess().getDIGITTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:901:3: this_DOUBLE_2= RULE_DOUBLE
                    {
                    this_DOUBLE_2=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_2);
                    		

                    			newLeafNode(this_DOUBLE_2, grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_2());
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:909:3: this_STRING_3= RULE_STRING
                    {
                    this_STRING_3=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_3);
                    		

                    			newLeafNode(this_STRING_3, grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_3());
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:917:3: this_ID_4= RULE_ID
                    {
                    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_4);
                    		

                    			newLeafNode(this_ID_4, grammarAccess.getConstantAccess().getIDTerminalRuleCall_4());
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:925:3: this_LETTER_5= RULE_LETTER
                    {
                    this_LETTER_5=(Token)match(input,RULE_LETTER,FOLLOW_2); 

                    			current.merge(this_LETTER_5);
                    		

                    			newLeafNode(this_LETTER_5, grammarAccess.getConstantAccess().getLETTERTerminalRuleCall_5());
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:933:3: this_NEGATIVE_6= RULE_NEGATIVE
                    {
                    this_NEGATIVE_6=(Token)match(input,RULE_NEGATIVE,FOLLOW_2); 

                    			current.merge(this_NEGATIVE_6);
                    		

                    			newLeafNode(this_NEGATIVE_6, grammarAccess.getConstantAccess().getNEGATIVETerminalRuleCall_6());
                    		

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


    // $ANTLR start "entryRuleNestedOperation"
    // InternalMyDsl.g:944:1: entryRuleNestedOperation returns [EObject current=null] : iv_ruleNestedOperation= ruleNestedOperation EOF ;
    public final EObject entryRuleNestedOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedOperation = null;


        try {
            // InternalMyDsl.g:944:56: (iv_ruleNestedOperation= ruleNestedOperation EOF )
            // InternalMyDsl.g:945:2: iv_ruleNestedOperation= ruleNestedOperation EOF
            {
             newCompositeNode(grammarAccess.getNestedOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNestedOperation=ruleNestedOperation();

            state._fsp--;

             current =iv_ruleNestedOperation; 
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
    // $ANTLR end "entryRuleNestedOperation"


    // $ANTLR start "ruleNestedOperation"
    // InternalMyDsl.g:951:1: ruleNestedOperation returns [EObject current=null] : ( ( (lv_nestedOperation_0_0= '(' ) ) ( (lv_calculate_1_0= ruleCalculate ) ) ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= ')' ) ;
    public final EObject ruleNestedOperation() throws RecognitionException {
        EObject current = null;

        Token lv_nestedOperation_0_0=null;
        Token otherlv_3=null;
        EObject lv_calculate_1_0 = null;

        EObject lv_operation_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:957:2: ( ( ( (lv_nestedOperation_0_0= '(' ) ) ( (lv_calculate_1_0= ruleCalculate ) ) ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= ')' ) )
            // InternalMyDsl.g:958:2: ( ( (lv_nestedOperation_0_0= '(' ) ) ( (lv_calculate_1_0= ruleCalculate ) ) ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= ')' )
            {
            // InternalMyDsl.g:958:2: ( ( (lv_nestedOperation_0_0= '(' ) ) ( (lv_calculate_1_0= ruleCalculate ) ) ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= ')' )
            // InternalMyDsl.g:959:3: ( (lv_nestedOperation_0_0= '(' ) ) ( (lv_calculate_1_0= ruleCalculate ) ) ( (lv_operation_2_0= ruleOperation ) ) otherlv_3= ')'
            {
            // InternalMyDsl.g:959:3: ( (lv_nestedOperation_0_0= '(' ) )
            // InternalMyDsl.g:960:4: (lv_nestedOperation_0_0= '(' )
            {
            // InternalMyDsl.g:960:4: (lv_nestedOperation_0_0= '(' )
            // InternalMyDsl.g:961:5: lv_nestedOperation_0_0= '('
            {
            lv_nestedOperation_0_0=(Token)match(input,18,FOLLOW_6); 

            					newLeafNode(lv_nestedOperation_0_0, grammarAccess.getNestedOperationAccess().getNestedOperationLeftParenthesisKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNestedOperationRule());
            					}
            					setWithLastConsumed(current, "nestedOperation", lv_nestedOperation_0_0, "(");
            				

            }


            }

            // InternalMyDsl.g:973:3: ( (lv_calculate_1_0= ruleCalculate ) )
            // InternalMyDsl.g:974:4: (lv_calculate_1_0= ruleCalculate )
            {
            // InternalMyDsl.g:974:4: (lv_calculate_1_0= ruleCalculate )
            // InternalMyDsl.g:975:5: lv_calculate_1_0= ruleCalculate
            {

            					newCompositeNode(grammarAccess.getNestedOperationAccess().getCalculateCalculateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_8);
            lv_calculate_1_0=ruleCalculate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestedOperationRule());
            					}
            					add(
            						current,
            						"calculate",
            						lv_calculate_1_0,
            						"org.xtext.example.mydsl.MyDsl.Calculate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:992:3: ( (lv_operation_2_0= ruleOperation ) )
            // InternalMyDsl.g:993:4: (lv_operation_2_0= ruleOperation )
            {
            // InternalMyDsl.g:993:4: (lv_operation_2_0= ruleOperation )
            // InternalMyDsl.g:994:5: lv_operation_2_0= ruleOperation
            {

            					newCompositeNode(grammarAccess.getNestedOperationAccess().getOperationOperationParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_7);
            lv_operation_2_0=ruleOperation();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNestedOperationRule());
            					}
            					add(
            						current,
            						"operation",
            						lv_operation_2_0,
            						"org.xtext.example.mydsl.MyDsl.Operation");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_3, grammarAccess.getNestedOperationAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleNestedOperation"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:1019:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:1019:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:1020:2: iv_ruleOperation= ruleOperation EOF
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
    // InternalMyDsl.g:1026:1: ruleOperation returns [EObject current=null] : ( ( (lv_operation_0_0= '(' ) ) ( (lv_calculate_1_0= ruleCalculate ) ) otherlv_2= ')' ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        Token lv_operation_0_0=null;
        Token otherlv_2=null;
        EObject lv_calculate_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1032:2: ( ( ( (lv_operation_0_0= '(' ) ) ( (lv_calculate_1_0= ruleCalculate ) ) otherlv_2= ')' ) )
            // InternalMyDsl.g:1033:2: ( ( (lv_operation_0_0= '(' ) ) ( (lv_calculate_1_0= ruleCalculate ) ) otherlv_2= ')' )
            {
            // InternalMyDsl.g:1033:2: ( ( (lv_operation_0_0= '(' ) ) ( (lv_calculate_1_0= ruleCalculate ) ) otherlv_2= ')' )
            // InternalMyDsl.g:1034:3: ( (lv_operation_0_0= '(' ) ) ( (lv_calculate_1_0= ruleCalculate ) ) otherlv_2= ')'
            {
            // InternalMyDsl.g:1034:3: ( (lv_operation_0_0= '(' ) )
            // InternalMyDsl.g:1035:4: (lv_operation_0_0= '(' )
            {
            // InternalMyDsl.g:1035:4: (lv_operation_0_0= '(' )
            // InternalMyDsl.g:1036:5: lv_operation_0_0= '('
            {
            lv_operation_0_0=(Token)match(input,18,FOLLOW_6); 

            					newLeafNode(lv_operation_0_0, grammarAccess.getOperationAccess().getOperationLeftParenthesisKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getOperationRule());
            					}
            					setWithLastConsumed(current, "operation", lv_operation_0_0, "(");
            				

            }


            }

            // InternalMyDsl.g:1048:3: ( (lv_calculate_1_0= ruleCalculate ) )
            // InternalMyDsl.g:1049:4: (lv_calculate_1_0= ruleCalculate )
            {
            // InternalMyDsl.g:1049:4: (lv_calculate_1_0= ruleCalculate )
            // InternalMyDsl.g:1050:5: lv_calculate_1_0= ruleCalculate
            {

            					newCompositeNode(grammarAccess.getOperationAccess().getCalculateCalculateParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_7);
            lv_calculate_1_0=ruleCalculate();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getOperationRule());
            					}
            					add(
            						current,
            						"calculate",
            						lv_calculate_1_0,
            						"org.xtext.example.mydsl.MyDsl.Calculate");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getOperationAccess().getRightParenthesisKeyword_2());
            		

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


    // $ANTLR start "entryRuleCalculate"
    // InternalMyDsl.g:1075:1: entryRuleCalculate returns [EObject current=null] : iv_ruleCalculate= ruleCalculate EOF ;
    public final EObject entryRuleCalculate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCalculate = null;


        try {
            // InternalMyDsl.g:1075:50: (iv_ruleCalculate= ruleCalculate EOF )
            // InternalMyDsl.g:1076:2: iv_ruleCalculate= ruleCalculate EOF
            {
             newCompositeNode(grammarAccess.getCalculateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCalculate=ruleCalculate();

            state._fsp--;

             current =iv_ruleCalculate; 
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
    // $ANTLR end "entryRuleCalculate"


    // $ANTLR start "ruleCalculate"
    // InternalMyDsl.g:1082:1: ruleCalculate returns [EObject current=null] : ( ( (lv_calculate_0_0= RULE_OPER ) ) ( (lv_numb_1_0= ruleNumber ) )* ) ;
    public final EObject ruleCalculate() throws RecognitionException {
        EObject current = null;

        Token lv_calculate_0_0=null;
        AntlrDatatypeRuleToken lv_numb_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1088:2: ( ( ( (lv_calculate_0_0= RULE_OPER ) ) ( (lv_numb_1_0= ruleNumber ) )* ) )
            // InternalMyDsl.g:1089:2: ( ( (lv_calculate_0_0= RULE_OPER ) ) ( (lv_numb_1_0= ruleNumber ) )* )
            {
            // InternalMyDsl.g:1089:2: ( ( (lv_calculate_0_0= RULE_OPER ) ) ( (lv_numb_1_0= ruleNumber ) )* )
            // InternalMyDsl.g:1090:3: ( (lv_calculate_0_0= RULE_OPER ) ) ( (lv_numb_1_0= ruleNumber ) )*
            {
            // InternalMyDsl.g:1090:3: ( (lv_calculate_0_0= RULE_OPER ) )
            // InternalMyDsl.g:1091:4: (lv_calculate_0_0= RULE_OPER )
            {
            // InternalMyDsl.g:1091:4: (lv_calculate_0_0= RULE_OPER )
            // InternalMyDsl.g:1092:5: lv_calculate_0_0= RULE_OPER
            {
            lv_calculate_0_0=(Token)match(input,RULE_OPER,FOLLOW_18); 

            					newLeafNode(lv_calculate_0_0, grammarAccess.getCalculateAccess().getCalculateOPERTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCalculateRule());
            					}
            					setWithLastConsumed(
            						current,
            						"calculate",
            						lv_calculate_0_0,
            						"org.xtext.example.mydsl.MyDsl.OPER");
            				

            }


            }

            // InternalMyDsl.g:1108:3: ( (lv_numb_1_0= ruleNumber ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_DIGIT) ) {
                    alt11=1;
                }
                else if ( (LA11_0==RULE_DOUBLE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1109:4: (lv_numb_1_0= ruleNumber )
            	    {
            	    // InternalMyDsl.g:1109:4: (lv_numb_1_0= ruleNumber )
            	    // InternalMyDsl.g:1110:5: lv_numb_1_0= ruleNumber
            	    {

            	    					newCompositeNode(grammarAccess.getCalculateAccess().getNumbNumberParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_numb_1_0=ruleNumber();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCalculateRule());
            	    					}
            	    					add(
            	    						current,
            	    						"numb",
            	    						lv_numb_1_0,
            	    						"org.xtext.example.mydsl.MyDsl.Number");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
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
    // $ANTLR end "ruleCalculate"


    // $ANTLR start "entryRuleListNumbers"
    // InternalMyDsl.g:1131:1: entryRuleListNumbers returns [EObject current=null] : iv_ruleListNumbers= ruleListNumbers EOF ;
    public final EObject entryRuleListNumbers() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListNumbers = null;


        try {
            // InternalMyDsl.g:1131:52: (iv_ruleListNumbers= ruleListNumbers EOF )
            // InternalMyDsl.g:1132:2: iv_ruleListNumbers= ruleListNumbers EOF
            {
             newCompositeNode(grammarAccess.getListNumbersRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListNumbers=ruleListNumbers();

            state._fsp--;

             current =iv_ruleListNumbers; 
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
    // $ANTLR end "entryRuleListNumbers"


    // $ANTLR start "ruleListNumbers"
    // InternalMyDsl.g:1138:1: ruleListNumbers returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'list' ( (lv_number_3_0= ruleNumber ) )* otherlv_4= ')' ) ;
    public final EObject ruleListNumbers() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_number_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1144:2: ( ( () otherlv_1= '(' otherlv_2= 'list' ( (lv_number_3_0= ruleNumber ) )* otherlv_4= ')' ) )
            // InternalMyDsl.g:1145:2: ( () otherlv_1= '(' otherlv_2= 'list' ( (lv_number_3_0= ruleNumber ) )* otherlv_4= ')' )
            {
            // InternalMyDsl.g:1145:2: ( () otherlv_1= '(' otherlv_2= 'list' ( (lv_number_3_0= ruleNumber ) )* otherlv_4= ')' )
            // InternalMyDsl.g:1146:3: () otherlv_1= '(' otherlv_2= 'list' ( (lv_number_3_0= ruleNumber ) )* otherlv_4= ')'
            {
            // InternalMyDsl.g:1146:3: ()
            // InternalMyDsl.g:1147:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListNumbersAccess().getListNumbersAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_19); 

            			newLeafNode(otherlv_1, grammarAccess.getListNumbersAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,28,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getListNumbersAccess().getListKeyword_2());
            		
            // InternalMyDsl.g:1161:3: ( (lv_number_3_0= ruleNumber ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_DIGIT && LA12_0<=RULE_DOUBLE)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1162:4: (lv_number_3_0= ruleNumber )
            	    {
            	    // InternalMyDsl.g:1162:4: (lv_number_3_0= ruleNumber )
            	    // InternalMyDsl.g:1163:5: lv_number_3_0= ruleNumber
            	    {

            	    					newCompositeNode(grammarAccess.getListNumbersAccess().getNumberNumberParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_20);
            	    lv_number_3_0=ruleNumber();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getListNumbersRule());
            	    					}
            	    					add(
            	    						current,
            	    						"number",
            	    						lv_number_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.Number");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListNumbersAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleListNumbers"


    // $ANTLR start "entryRuleListLength"
    // InternalMyDsl.g:1188:1: entryRuleListLength returns [EObject current=null] : iv_ruleListLength= ruleListLength EOF ;
    public final EObject entryRuleListLength() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleListLength = null;


        try {
            // InternalMyDsl.g:1188:51: (iv_ruleListLength= ruleListLength EOF )
            // InternalMyDsl.g:1189:2: iv_ruleListLength= ruleListLength EOF
            {
             newCompositeNode(grammarAccess.getListLengthRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleListLength=ruleListLength();

            state._fsp--;

             current =iv_ruleListLength; 
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
    // $ANTLR end "entryRuleListLength"


    // $ANTLR start "ruleListLength"
    // InternalMyDsl.g:1195:1: ruleListLength returns [EObject current=null] : ( () otherlv_1= '(' otherlv_2= 'length' ( (lv_listNumbers_3_0= ruleListNumbers ) ) otherlv_4= ')' ) ;
    public final EObject ruleListLength() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_listNumbers_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1201:2: ( ( () otherlv_1= '(' otherlv_2= 'length' ( (lv_listNumbers_3_0= ruleListNumbers ) ) otherlv_4= ')' ) )
            // InternalMyDsl.g:1202:2: ( () otherlv_1= '(' otherlv_2= 'length' ( (lv_listNumbers_3_0= ruleListNumbers ) ) otherlv_4= ')' )
            {
            // InternalMyDsl.g:1202:2: ( () otherlv_1= '(' otherlv_2= 'length' ( (lv_listNumbers_3_0= ruleListNumbers ) ) otherlv_4= ')' )
            // InternalMyDsl.g:1203:3: () otherlv_1= '(' otherlv_2= 'length' ( (lv_listNumbers_3_0= ruleListNumbers ) ) otherlv_4= ')'
            {
            // InternalMyDsl.g:1203:3: ()
            // InternalMyDsl.g:1204:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getListLengthAccess().getListLengthAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_1, grammarAccess.getListLengthAccess().getLeftParenthesisKeyword_1());
            		
            otherlv_2=(Token)match(input,29,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getListLengthAccess().getLengthKeyword_2());
            		
            // InternalMyDsl.g:1218:3: ( (lv_listNumbers_3_0= ruleListNumbers ) )
            // InternalMyDsl.g:1219:4: (lv_listNumbers_3_0= ruleListNumbers )
            {
            // InternalMyDsl.g:1219:4: (lv_listNumbers_3_0= ruleListNumbers )
            // InternalMyDsl.g:1220:5: lv_listNumbers_3_0= ruleListNumbers
            {

            					newCompositeNode(grammarAccess.getListLengthAccess().getListNumbersListNumbersParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_7);
            lv_listNumbers_3_0=ruleListNumbers();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getListLengthRule());
            					}
            					add(
            						current,
            						"listNumbers",
            						lv_listNumbers_3_0,
            						"org.xtext.example.mydsl.MyDsl.ListNumbers");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getListLengthAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "ruleListLength"


    // $ANTLR start "entryRuleNumber"
    // InternalMyDsl.g:1245:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;


        try {
            // InternalMyDsl.g:1245:46: (iv_ruleNumber= ruleNumber EOF )
            // InternalMyDsl.g:1246:2: iv_ruleNumber= ruleNumber EOF
            {
             newCompositeNode(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;

             current =iv_ruleNumber.getText(); 
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
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMyDsl.g:1252:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_0= RULE_DIGIT | this_DOUBLE_1= RULE_DOUBLE ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_0=null;
        Token this_DOUBLE_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1258:2: ( (this_DIGIT_0= RULE_DIGIT | this_DOUBLE_1= RULE_DOUBLE ) )
            // InternalMyDsl.g:1259:2: (this_DIGIT_0= RULE_DIGIT | this_DOUBLE_1= RULE_DOUBLE )
            {
            // InternalMyDsl.g:1259:2: (this_DIGIT_0= RULE_DIGIT | this_DOUBLE_1= RULE_DOUBLE )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DIGIT) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_DOUBLE) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1260:3: this_DIGIT_0= RULE_DIGIT
                    {
                    this_DIGIT_0=(Token)match(input,RULE_DIGIT,FOLLOW_2); 

                    			current.merge(this_DIGIT_0);
                    		

                    			newLeafNode(this_DIGIT_0, grammarAccess.getNumberAccess().getDIGITTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1268:3: this_DOUBLE_1= RULE_DOUBLE
                    {
                    this_DOUBLE_1=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    			current.merge(this_DOUBLE_1);
                    		

                    			newLeafNode(this_DOUBLE_1, grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleNumber"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\6\1\uffff\1\7\6\uffff\2\7\2\uffff";
    static final String dfa_3s = "\1\22\1\uffff\1\35\1\uffff\1\24\6\uffff\2\24\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\12\1\uffff\1\7\1\10\1\5\1\4\1\3\1\6\2\uffff\1\11\1\2";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\2\1\1\uffff\5\1\1\3\5\uffff\1\2",
            "",
            "\1\12\5\uffff\1\4\10\uffff\5\11\1\7\1\10\1\5\1\6",
            "",
            "\1\13\1\14\11\uffff\1\15\1\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\1\14\11\uffff\1\15\1\uffff\1\16",
            "\1\13\1\14\11\uffff\1\15\1\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "342:2: ( ( (lv_constant_0_0= ruleConstant ) ) | ( (lv_oper_1_0= ruleOperation ) ) | ( (lv_comp_2_0= ruleComparison ) ) | ( (lv_cond_3_0= ruleConditional ) ) | ( (lv_set_4_0= ruleSet ) ) | ( (lv_trig_5_0= ruleTrigonometry ) ) | ( (lv_list_6_0= ruleListNumbers ) ) | ( (lv_listLength_7_0= ruleListLength ) ) | ( (lv_nestedOperation_8_0= ruleNestedOperation ) ) | ( (lv_calculate_9_0= ruleCalculate ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000041FB2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000FB0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000041FB0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100010L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000003E00000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000040020L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000141FB0L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000182L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100180L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});

}