package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_DIGIT", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_LETTER", "RULE_NEGATIVE", "RULE_MATH", "RULE_OPER", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'='", "'>='", "'<='", "'('", "'define'", "')'", "'set!'", "'if'", "'list'", "'length'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_MATH=11;
    public static final int RULE_NEGATIVE=10;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__19=19;
    public static final int RULE_DOUBLE=6;
    public static final int RULE_OPER=12;
    public static final int T__18=18;
    public static final int EOF=-1;
    public static final int RULE_ID=8;
    public static final int RULE_WS=16;
    public static final int RULE_DIGIT=5;
    public static final int RULE_ANY_OTHER=17;
    public static final int RULE_BOOL=4;
    public static final int RULE_LETTER=9;
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleProgram"
    // InternalMyDsl.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleProgram EOF )
            // InternalMyDsl.g:55:1: ruleProgram EOF
            {
             before(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            ruleProgram();

            state._fsp--;

             after(grammarAccess.getProgramRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMyDsl.g:62:1: ruleProgram : ( ( rule__Program__Alternatives )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Program__Alternatives )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Program__Alternatives )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Program__Alternatives )* )
            // InternalMyDsl.g:68:3: ( rule__Program__Alternatives )*
            {
             before(grammarAccess.getProgramAccess().getAlternatives()); 
            // InternalMyDsl.g:69:3: ( rule__Program__Alternatives )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_BOOL && LA1_0<=RULE_NEGATIVE)||LA1_0==RULE_OPER||LA1_0==23) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Program__Alternatives
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__Alternatives();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleDefinition"
    // InternalMyDsl.g:78:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleDefinition EOF )
            // InternalMyDsl.g:80:1: ruleDefinition EOF
            {
             before(grammarAccess.getDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // InternalMyDsl.g:87:1: ruleDefinition : ( ( rule__Definition__Alternatives ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Definition__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Definition__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Definition__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Definition__Alternatives )
            {
             before(grammarAccess.getDefinitionAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Definition__Alternatives )
            // InternalMyDsl.g:94:4: rule__Definition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleBody"
    // InternalMyDsl.g:103:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleBody EOF )
            // InternalMyDsl.g:105:1: ruleBody EOF
            {
             before(grammarAccess.getBodyRule()); 
            pushFollow(FOLLOW_1);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getBodyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBody"


    // $ANTLR start "ruleBody"
    // InternalMyDsl.g:112:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Body__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Body__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Body__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Body__Group__0 )
            // InternalMyDsl.g:119:4: rule__Body__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBody"


    // $ANTLR start "entryRuleExpression"
    // InternalMyDsl.g:128:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleExpression EOF )
            // InternalMyDsl.g:130:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMyDsl.g:137:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:144:4: rule__Expression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Expression__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getExpressionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleComparison"
    // InternalMyDsl.g:153:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleComparison EOF )
            // InternalMyDsl.g:155:1: ruleComparison EOF
            {
             before(grammarAccess.getComparisonRule()); 
            pushFollow(FOLLOW_1);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getComparisonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalMyDsl.g:162:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Comparison__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Comparison__Group__0 )
            // InternalMyDsl.g:169:4: rule__Comparison__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleTrigonometry"
    // InternalMyDsl.g:178:1: entryRuleTrigonometry : ruleTrigonometry EOF ;
    public final void entryRuleTrigonometry() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleTrigonometry EOF )
            // InternalMyDsl.g:180:1: ruleTrigonometry EOF
            {
             before(grammarAccess.getTrigonometryRule()); 
            pushFollow(FOLLOW_1);
            ruleTrigonometry();

            state._fsp--;

             after(grammarAccess.getTrigonometryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTrigonometry"


    // $ANTLR start "ruleTrigonometry"
    // InternalMyDsl.g:187:1: ruleTrigonometry : ( ( rule__Trigonometry__Group__0 ) ) ;
    public final void ruleTrigonometry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Trigonometry__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Trigonometry__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Trigonometry__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Trigonometry__Group__0 )
            {
             before(grammarAccess.getTrigonometryAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Trigonometry__Group__0 )
            // InternalMyDsl.g:194:4: rule__Trigonometry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Trigonometry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTrigonometryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTrigonometry"


    // $ANTLR start "entryRuleSet"
    // InternalMyDsl.g:203:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleSet EOF )
            // InternalMyDsl.g:205:1: ruleSet EOF
            {
             before(grammarAccess.getSetRule()); 
            pushFollow(FOLLOW_1);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getSetRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSet"


    // $ANTLR start "ruleSet"
    // InternalMyDsl.g:212:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Set__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Set__Group__0 )
            // InternalMyDsl.g:219:4: rule__Set__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSet"


    // $ANTLR start "entryRuleConditional"
    // InternalMyDsl.g:228:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleConditional EOF )
            // InternalMyDsl.g:230:1: ruleConditional EOF
            {
             before(grammarAccess.getConditionalRule()); 
            pushFollow(FOLLOW_1);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getConditionalRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConditional"


    // $ANTLR start "ruleConditional"
    // InternalMyDsl.g:237:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Conditional__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Conditional__Group__0 )
            // InternalMyDsl.g:244:4: rule__Conditional__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConditional"


    // $ANTLR start "entryRuleConstant"
    // InternalMyDsl.g:253:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleConstant EOF )
            // InternalMyDsl.g:255:1: ruleConstant EOF
            {
             before(grammarAccess.getConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleConstant"


    // $ANTLR start "ruleConstant"
    // InternalMyDsl.g:262:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Constant__Alternatives ) )
            // InternalMyDsl.g:268:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalMyDsl.g:269:3: ( rule__Constant__Alternatives )
            // InternalMyDsl.g:269:4: rule__Constant__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Constant__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getConstantAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleConstant"


    // $ANTLR start "entryRuleNestedOperation"
    // InternalMyDsl.g:278:1: entryRuleNestedOperation : ruleNestedOperation EOF ;
    public final void entryRuleNestedOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleNestedOperation EOF )
            // InternalMyDsl.g:280:1: ruleNestedOperation EOF
            {
             before(grammarAccess.getNestedOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleNestedOperation();

            state._fsp--;

             after(grammarAccess.getNestedOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNestedOperation"


    // $ANTLR start "ruleNestedOperation"
    // InternalMyDsl.g:287:1: ruleNestedOperation : ( ( rule__NestedOperation__Group__0 ) ) ;
    public final void ruleNestedOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__NestedOperation__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__NestedOperation__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__NestedOperation__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__NestedOperation__Group__0 )
            {
             before(grammarAccess.getNestedOperationAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__NestedOperation__Group__0 )
            // InternalMyDsl.g:294:4: rule__NestedOperation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NestedOperation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNestedOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedOperation"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:303:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleOperation EOF )
            // InternalMyDsl.g:305:1: ruleOperation EOF
            {
             before(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getOperationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:312:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Operation__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Operation__Group__0 )
            // InternalMyDsl.g:319:4: rule__Operation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleCalculate"
    // InternalMyDsl.g:328:1: entryRuleCalculate : ruleCalculate EOF ;
    public final void entryRuleCalculate() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleCalculate EOF )
            // InternalMyDsl.g:330:1: ruleCalculate EOF
            {
             before(grammarAccess.getCalculateRule()); 
            pushFollow(FOLLOW_1);
            ruleCalculate();

            state._fsp--;

             after(grammarAccess.getCalculateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCalculate"


    // $ANTLR start "ruleCalculate"
    // InternalMyDsl.g:337:1: ruleCalculate : ( ( rule__Calculate__Group__0 ) ) ;
    public final void ruleCalculate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Calculate__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Calculate__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Calculate__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Calculate__Group__0 )
            {
             before(grammarAccess.getCalculateAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Calculate__Group__0 )
            // InternalMyDsl.g:344:4: rule__Calculate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCalculateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCalculate"


    // $ANTLR start "entryRuleListNumbers"
    // InternalMyDsl.g:353:1: entryRuleListNumbers : ruleListNumbers EOF ;
    public final void entryRuleListNumbers() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleListNumbers EOF )
            // InternalMyDsl.g:355:1: ruleListNumbers EOF
            {
             before(grammarAccess.getListNumbersRule()); 
            pushFollow(FOLLOW_1);
            ruleListNumbers();

            state._fsp--;

             after(grammarAccess.getListNumbersRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListNumbers"


    // $ANTLR start "ruleListNumbers"
    // InternalMyDsl.g:362:1: ruleListNumbers : ( ( rule__ListNumbers__Group__0 ) ) ;
    public final void ruleListNumbers() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__ListNumbers__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__ListNumbers__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__ListNumbers__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__ListNumbers__Group__0 )
            {
             before(grammarAccess.getListNumbersAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__ListNumbers__Group__0 )
            // InternalMyDsl.g:369:4: rule__ListNumbers__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListNumbers__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListNumbersAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListNumbers"


    // $ANTLR start "entryRuleListLength"
    // InternalMyDsl.g:378:1: entryRuleListLength : ruleListLength EOF ;
    public final void entryRuleListLength() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleListLength EOF )
            // InternalMyDsl.g:380:1: ruleListLength EOF
            {
             before(grammarAccess.getListLengthRule()); 
            pushFollow(FOLLOW_1);
            ruleListLength();

            state._fsp--;

             after(grammarAccess.getListLengthRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleListLength"


    // $ANTLR start "ruleListLength"
    // InternalMyDsl.g:387:1: ruleListLength : ( ( rule__ListLength__Group__0 ) ) ;
    public final void ruleListLength() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__ListLength__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__ListLength__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__ListLength__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__ListLength__Group__0 )
            {
             before(grammarAccess.getListLengthAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__ListLength__Group__0 )
            // InternalMyDsl.g:394:4: rule__ListLength__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ListLength__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getListLengthAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleListLength"


    // $ANTLR start "entryRuleNumber"
    // InternalMyDsl.g:403:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleNumber EOF )
            // InternalMyDsl.g:405:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMyDsl.g:412:1: ruleNumber : ( ( rule__Number__Alternatives ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Number__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Number__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Number__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__Number__Alternatives )
            {
             before(grammarAccess.getNumberAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__Number__Alternatives )
            // InternalMyDsl.g:419:4: rule__Number__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Number__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__Program__Alternatives"
    // InternalMyDsl.g:427:1: rule__Program__Alternatives : ( ( ( rule__Program__ProgramAssignment_0 ) ) | ( ( rule__Program__ProgramAssignment_1 ) ) );
    public final void rule__Program__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( ( rule__Program__ProgramAssignment_0 ) ) | ( ( rule__Program__ProgramAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=RULE_BOOL && LA2_0<=RULE_NEGATIVE)||LA2_0==RULE_OPER) ) {
                alt2=1;
            }
            else if ( (LA2_0==23) ) {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==24) ) {
                    alt2=2;
                }
                else if ( ((LA2_2>=RULE_MATH && LA2_2<=RULE_OPER)||(LA2_2>=18 && LA2_2<=22)||(LA2_2>=26 && LA2_2<=29)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:432:2: ( ( rule__Program__ProgramAssignment_0 ) )
                    {
                    // InternalMyDsl.g:432:2: ( ( rule__Program__ProgramAssignment_0 ) )
                    // InternalMyDsl.g:433:3: ( rule__Program__ProgramAssignment_0 )
                    {
                     before(grammarAccess.getProgramAccess().getProgramAssignment_0()); 
                    // InternalMyDsl.g:434:3: ( rule__Program__ProgramAssignment_0 )
                    // InternalMyDsl.g:434:4: rule__Program__ProgramAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__ProgramAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getProgramAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:438:2: ( ( rule__Program__ProgramAssignment_1 ) )
                    {
                    // InternalMyDsl.g:438:2: ( ( rule__Program__ProgramAssignment_1 ) )
                    // InternalMyDsl.g:439:3: ( rule__Program__ProgramAssignment_1 )
                    {
                     before(grammarAccess.getProgramAccess().getProgramAssignment_1()); 
                    // InternalMyDsl.g:440:3: ( rule__Program__ProgramAssignment_1 )
                    // InternalMyDsl.g:440:4: rule__Program__ProgramAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Program__ProgramAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getProgramAccess().getProgramAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__Alternatives"


    // $ANTLR start "rule__Definition__Alternatives"
    // InternalMyDsl.g:448:1: rule__Definition__Alternatives : ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) );
    public final void rule__Definition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:452:1: ( ( ( rule__Definition__Group_0__0 ) ) | ( ( rule__Definition__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==23) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==24) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==23) ) {
                        alt3=2;
                    }
                    else if ( ((LA3_2>=RULE_BOOL && LA3_2<=RULE_NEGATIVE)) ) {
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
                    // InternalMyDsl.g:453:2: ( ( rule__Definition__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:453:2: ( ( rule__Definition__Group_0__0 ) )
                    // InternalMyDsl.g:454:3: ( rule__Definition__Group_0__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_0()); 
                    // InternalMyDsl.g:455:3: ( rule__Definition__Group_0__0 )
                    // InternalMyDsl.g:455:4: rule__Definition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:459:2: ( ( rule__Definition__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:459:2: ( ( rule__Definition__Group_1__0 ) )
                    // InternalMyDsl.g:460:3: ( rule__Definition__Group_1__0 )
                    {
                     before(grammarAccess.getDefinitionAccess().getGroup_1()); 
                    // InternalMyDsl.g:461:3: ( rule__Definition__Group_1__0 )
                    // InternalMyDsl.g:461:4: rule__Definition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Definition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDefinitionAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:469:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ConstantAssignment_0 ) ) | ( ( rule__Expression__OperAssignment_1 ) ) | ( ( rule__Expression__CompAssignment_2 ) ) | ( ( rule__Expression__CondAssignment_3 ) ) | ( ( rule__Expression__SetAssignment_4 ) ) | ( ( rule__Expression__TrigAssignment_5 ) ) | ( ( rule__Expression__ListAssignment_6 ) ) | ( ( rule__Expression__ListLengthAssignment_7 ) ) | ( ( rule__Expression__NestedOperationAssignment_8 ) ) | ( ( rule__Expression__CalculateAssignment_9 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:473:1: ( ( ( rule__Expression__ConstantAssignment_0 ) ) | ( ( rule__Expression__OperAssignment_1 ) ) | ( ( rule__Expression__CompAssignment_2 ) ) | ( ( rule__Expression__CondAssignment_3 ) ) | ( ( rule__Expression__SetAssignment_4 ) ) | ( ( rule__Expression__TrigAssignment_5 ) ) | ( ( rule__Expression__ListAssignment_6 ) ) | ( ( rule__Expression__ListLengthAssignment_7 ) ) | ( ( rule__Expression__NestedOperationAssignment_8 ) ) | ( ( rule__Expression__CalculateAssignment_9 ) ) )
            int alt4=10;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:474:2: ( ( rule__Expression__ConstantAssignment_0 ) )
                    {
                    // InternalMyDsl.g:474:2: ( ( rule__Expression__ConstantAssignment_0 ) )
                    // InternalMyDsl.g:475:3: ( rule__Expression__ConstantAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getConstantAssignment_0()); 
                    // InternalMyDsl.g:476:3: ( rule__Expression__ConstantAssignment_0 )
                    // InternalMyDsl.g:476:4: rule__Expression__ConstantAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ConstantAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getConstantAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:480:2: ( ( rule__Expression__OperAssignment_1 ) )
                    {
                    // InternalMyDsl.g:480:2: ( ( rule__Expression__OperAssignment_1 ) )
                    // InternalMyDsl.g:481:3: ( rule__Expression__OperAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperAssignment_1()); 
                    // InternalMyDsl.g:482:3: ( rule__Expression__OperAssignment_1 )
                    // InternalMyDsl.g:482:4: rule__Expression__OperAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__OperAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getOperAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:486:2: ( ( rule__Expression__CompAssignment_2 ) )
                    {
                    // InternalMyDsl.g:486:2: ( ( rule__Expression__CompAssignment_2 ) )
                    // InternalMyDsl.g:487:3: ( rule__Expression__CompAssignment_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getCompAssignment_2()); 
                    // InternalMyDsl.g:488:3: ( rule__Expression__CompAssignment_2 )
                    // InternalMyDsl.g:488:4: rule__Expression__CompAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__CompAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getCompAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:492:2: ( ( rule__Expression__CondAssignment_3 ) )
                    {
                    // InternalMyDsl.g:492:2: ( ( rule__Expression__CondAssignment_3 ) )
                    // InternalMyDsl.g:493:3: ( rule__Expression__CondAssignment_3 )
                    {
                     before(grammarAccess.getExpressionAccess().getCondAssignment_3()); 
                    // InternalMyDsl.g:494:3: ( rule__Expression__CondAssignment_3 )
                    // InternalMyDsl.g:494:4: rule__Expression__CondAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__CondAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getCondAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:498:2: ( ( rule__Expression__SetAssignment_4 ) )
                    {
                    // InternalMyDsl.g:498:2: ( ( rule__Expression__SetAssignment_4 ) )
                    // InternalMyDsl.g:499:3: ( rule__Expression__SetAssignment_4 )
                    {
                     before(grammarAccess.getExpressionAccess().getSetAssignment_4()); 
                    // InternalMyDsl.g:500:3: ( rule__Expression__SetAssignment_4 )
                    // InternalMyDsl.g:500:4: rule__Expression__SetAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__SetAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getSetAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:504:2: ( ( rule__Expression__TrigAssignment_5 ) )
                    {
                    // InternalMyDsl.g:504:2: ( ( rule__Expression__TrigAssignment_5 ) )
                    // InternalMyDsl.g:505:3: ( rule__Expression__TrigAssignment_5 )
                    {
                     before(grammarAccess.getExpressionAccess().getTrigAssignment_5()); 
                    // InternalMyDsl.g:506:3: ( rule__Expression__TrigAssignment_5 )
                    // InternalMyDsl.g:506:4: rule__Expression__TrigAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__TrigAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getTrigAssignment_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:510:2: ( ( rule__Expression__ListAssignment_6 ) )
                    {
                    // InternalMyDsl.g:510:2: ( ( rule__Expression__ListAssignment_6 ) )
                    // InternalMyDsl.g:511:3: ( rule__Expression__ListAssignment_6 )
                    {
                     before(grammarAccess.getExpressionAccess().getListAssignment_6()); 
                    // InternalMyDsl.g:512:3: ( rule__Expression__ListAssignment_6 )
                    // InternalMyDsl.g:512:4: rule__Expression__ListAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ListAssignment_6();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getListAssignment_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:516:2: ( ( rule__Expression__ListLengthAssignment_7 ) )
                    {
                    // InternalMyDsl.g:516:2: ( ( rule__Expression__ListLengthAssignment_7 ) )
                    // InternalMyDsl.g:517:3: ( rule__Expression__ListLengthAssignment_7 )
                    {
                     before(grammarAccess.getExpressionAccess().getListLengthAssignment_7()); 
                    // InternalMyDsl.g:518:3: ( rule__Expression__ListLengthAssignment_7 )
                    // InternalMyDsl.g:518:4: rule__Expression__ListLengthAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__ListLengthAssignment_7();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getListLengthAssignment_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:522:2: ( ( rule__Expression__NestedOperationAssignment_8 ) )
                    {
                    // InternalMyDsl.g:522:2: ( ( rule__Expression__NestedOperationAssignment_8 ) )
                    // InternalMyDsl.g:523:3: ( rule__Expression__NestedOperationAssignment_8 )
                    {
                     before(grammarAccess.getExpressionAccess().getNestedOperationAssignment_8()); 
                    // InternalMyDsl.g:524:3: ( rule__Expression__NestedOperationAssignment_8 )
                    // InternalMyDsl.g:524:4: rule__Expression__NestedOperationAssignment_8
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__NestedOperationAssignment_8();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getNestedOperationAssignment_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:528:2: ( ( rule__Expression__CalculateAssignment_9 ) )
                    {
                    // InternalMyDsl.g:528:2: ( ( rule__Expression__CalculateAssignment_9 ) )
                    // InternalMyDsl.g:529:3: ( rule__Expression__CalculateAssignment_9 )
                    {
                     before(grammarAccess.getExpressionAccess().getCalculateAssignment_9()); 
                    // InternalMyDsl.g:530:3: ( rule__Expression__CalculateAssignment_9 )
                    // InternalMyDsl.g:530:4: rule__Expression__CalculateAssignment_9
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__CalculateAssignment_9();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getCalculateAssignment_9()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__Alternatives"


    // $ANTLR start "rule__Comparison__Alternatives_1"
    // InternalMyDsl.g:538:1: rule__Comparison__Alternatives_1 : ( ( ( rule__Comparison__Group_1_0__0 ) ) | ( RULE_BOOL ) );
    public final void rule__Comparison__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:542:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) | ( RULE_BOOL ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_BOOL) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:543:2: ( ( rule__Comparison__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:543:2: ( ( rule__Comparison__Group_1_0__0 ) )
                    // InternalMyDsl.g:544:3: ( rule__Comparison__Group_1_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:545:3: ( rule__Comparison__Group_1_0__0 )
                    // InternalMyDsl.g:545:4: rule__Comparison__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Comparison__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:549:2: ( RULE_BOOL )
                    {
                    // InternalMyDsl.g:549:2: ( RULE_BOOL )
                    // InternalMyDsl.g:550:3: RULE_BOOL
                    {
                     before(grammarAccess.getComparisonAccess().getBOOLTerminalRuleCall_1_1()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getBOOLTerminalRuleCall_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives_1"


    // $ANTLR start "rule__Comparison__Alternatives_1_0_1"
    // InternalMyDsl.g:559:1: rule__Comparison__Alternatives_1_0_1 : ( ( '<' ) | ( '>' ) | ( '=' ) | ( '>=' ) | ( '<=' ) );
    public final void rule__Comparison__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:563:1: ( ( '<' ) | ( '>' ) | ( '=' ) | ( '>=' ) | ( '<=' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt6=1;
                }
                break;
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
                {
                alt6=3;
                }
                break;
            case 21:
                {
                alt6=4;
                }
                break;
            case 22:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:564:2: ( '<' )
                    {
                    // InternalMyDsl.g:564:2: ( '<' )
                    // InternalMyDsl.g:565:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1_0()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:570:2: ( '>' )
                    {
                    // InternalMyDsl.g:570:2: ( '>' )
                    // InternalMyDsl.g:571:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_1()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:576:2: ( '=' )
                    {
                    // InternalMyDsl.g:576:2: ( '=' )
                    // InternalMyDsl.g:577:3: '='
                    {
                     before(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0_1_2()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:582:2: ( '>=' )
                    {
                    // InternalMyDsl.g:582:2: ( '>=' )
                    // InternalMyDsl.g:583:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_1_3()); 
                    match(input,21,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:588:2: ( '<=' )
                    {
                    // InternalMyDsl.g:588:2: ( '<=' )
                    // InternalMyDsl.g:589:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_4()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives_1_0_1"


    // $ANTLR start "rule__Constant__Alternatives"
    // InternalMyDsl.g:598:1: rule__Constant__Alternatives : ( ( RULE_BOOL ) | ( RULE_DIGIT ) | ( RULE_DOUBLE ) | ( RULE_STRING ) | ( RULE_ID ) | ( RULE_LETTER ) | ( RULE_NEGATIVE ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:602:1: ( ( RULE_BOOL ) | ( RULE_DIGIT ) | ( RULE_DOUBLE ) | ( RULE_STRING ) | ( RULE_ID ) | ( RULE_LETTER ) | ( RULE_NEGATIVE ) )
            int alt7=7;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt7=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt7=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt7=3;
                }
                break;
            case RULE_STRING:
                {
                alt7=4;
                }
                break;
            case RULE_ID:
                {
                alt7=5;
                }
                break;
            case RULE_LETTER:
                {
                alt7=6;
                }
                break;
            case RULE_NEGATIVE:
                {
                alt7=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:603:2: ( RULE_BOOL )
                    {
                    // InternalMyDsl.g:603:2: ( RULE_BOOL )
                    // InternalMyDsl.g:604:3: RULE_BOOL
                    {
                     before(grammarAccess.getConstantAccess().getBOOLTerminalRuleCall_0()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getBOOLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:609:2: ( RULE_DIGIT )
                    {
                    // InternalMyDsl.g:609:2: ( RULE_DIGIT )
                    // InternalMyDsl.g:610:3: RULE_DIGIT
                    {
                     before(grammarAccess.getConstantAccess().getDIGITTerminalRuleCall_1()); 
                    match(input,RULE_DIGIT,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getDIGITTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:615:2: ( RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:615:2: ( RULE_DOUBLE )
                    // InternalMyDsl.g:616:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_2()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:621:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:621:2: ( RULE_STRING )
                    // InternalMyDsl.g:622:3: RULE_STRING
                    {
                     before(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_3()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:627:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:627:2: ( RULE_ID )
                    // InternalMyDsl.g:628:3: RULE_ID
                    {
                     before(grammarAccess.getConstantAccess().getIDTerminalRuleCall_4()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getIDTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:633:2: ( RULE_LETTER )
                    {
                    // InternalMyDsl.g:633:2: ( RULE_LETTER )
                    // InternalMyDsl.g:634:3: RULE_LETTER
                    {
                     before(grammarAccess.getConstantAccess().getLETTERTerminalRuleCall_5()); 
                    match(input,RULE_LETTER,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getLETTERTerminalRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:639:2: ( RULE_NEGATIVE )
                    {
                    // InternalMyDsl.g:639:2: ( RULE_NEGATIVE )
                    // InternalMyDsl.g:640:3: RULE_NEGATIVE
                    {
                     before(grammarAccess.getConstantAccess().getNEGATIVETerminalRuleCall_6()); 
                    match(input,RULE_NEGATIVE,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getNEGATIVETerminalRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Constant__Alternatives"


    // $ANTLR start "rule__Number__Alternatives"
    // InternalMyDsl.g:649:1: rule__Number__Alternatives : ( ( RULE_DIGIT ) | ( RULE_DOUBLE ) );
    public final void rule__Number__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:653:1: ( ( RULE_DIGIT ) | ( RULE_DOUBLE ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DIGIT) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_DOUBLE) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:654:2: ( RULE_DIGIT )
                    {
                    // InternalMyDsl.g:654:2: ( RULE_DIGIT )
                    // InternalMyDsl.g:655:3: RULE_DIGIT
                    {
                     before(grammarAccess.getNumberAccess().getDIGITTerminalRuleCall_0()); 
                    match(input,RULE_DIGIT,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getDIGITTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:660:2: ( RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:660:2: ( RULE_DOUBLE )
                    // InternalMyDsl.g:661:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getNumberAccess().getDOUBLETerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Alternatives"


    // $ANTLR start "rule__Definition__Group_0__0"
    // InternalMyDsl.g:670:1: rule__Definition__Group_0__0 : rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 ;
    public final void rule__Definition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:674:1: ( rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1 )
            // InternalMyDsl.g:675:2: rule__Definition__Group_0__0__Impl rule__Definition__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__Definition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0"


    // $ANTLR start "rule__Definition__Group_0__0__Impl"
    // InternalMyDsl.g:682:1: rule__Definition__Group_0__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:686:1: ( ( '(' ) )
            // InternalMyDsl.g:687:1: ( '(' )
            {
            // InternalMyDsl.g:687:1: ( '(' )
            // InternalMyDsl.g:688:2: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__0__Impl"


    // $ANTLR start "rule__Definition__Group_0__1"
    // InternalMyDsl.g:697:1: rule__Definition__Group_0__1 : rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 ;
    public final void rule__Definition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:701:1: ( rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2 )
            // InternalMyDsl.g:702:2: rule__Definition__Group_0__1__Impl rule__Definition__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Definition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1"


    // $ANTLR start "rule__Definition__Group_0__1__Impl"
    // InternalMyDsl.g:709:1: rule__Definition__Group_0__1__Impl : ( 'define' ) ;
    public final void rule__Definition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:713:1: ( ( 'define' ) )
            // InternalMyDsl.g:714:1: ( 'define' )
            {
            // InternalMyDsl.g:714:1: ( 'define' )
            // InternalMyDsl.g:715:2: 'define'
            {
             before(grammarAccess.getDefinitionAccess().getDefineKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getDefineKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__1__Impl"


    // $ANTLR start "rule__Definition__Group_0__2"
    // InternalMyDsl.g:724:1: rule__Definition__Group_0__2 : rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 ;
    public final void rule__Definition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3 )
            // InternalMyDsl.g:729:2: rule__Definition__Group_0__2__Impl rule__Definition__Group_0__3
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__2"


    // $ANTLR start "rule__Definition__Group_0__2__Impl"
    // InternalMyDsl.g:736:1: rule__Definition__Group_0__2__Impl : ( ( rule__Definition__ConsAssignment_0_2 ) ) ;
    public final void rule__Definition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:740:1: ( ( ( rule__Definition__ConsAssignment_0_2 ) ) )
            // InternalMyDsl.g:741:1: ( ( rule__Definition__ConsAssignment_0_2 ) )
            {
            // InternalMyDsl.g:741:1: ( ( rule__Definition__ConsAssignment_0_2 ) )
            // InternalMyDsl.g:742:2: ( rule__Definition__ConsAssignment_0_2 )
            {
             before(grammarAccess.getDefinitionAccess().getConsAssignment_0_2()); 
            // InternalMyDsl.g:743:2: ( rule__Definition__ConsAssignment_0_2 )
            // InternalMyDsl.g:743:3: rule__Definition__ConsAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ConsAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getConsAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__2__Impl"


    // $ANTLR start "rule__Definition__Group_0__3"
    // InternalMyDsl.g:751:1: rule__Definition__Group_0__3 : rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 ;
    public final void rule__Definition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:755:1: ( rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4 )
            // InternalMyDsl.g:756:2: rule__Definition__Group_0__3__Impl rule__Definition__Group_0__4
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__3"


    // $ANTLR start "rule__Definition__Group_0__3__Impl"
    // InternalMyDsl.g:763:1: rule__Definition__Group_0__3__Impl : ( ( rule__Definition__ExpressionAssignment_0_3 ) ) ;
    public final void rule__Definition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( ( ( rule__Definition__ExpressionAssignment_0_3 ) ) )
            // InternalMyDsl.g:768:1: ( ( rule__Definition__ExpressionAssignment_0_3 ) )
            {
            // InternalMyDsl.g:768:1: ( ( rule__Definition__ExpressionAssignment_0_3 ) )
            // InternalMyDsl.g:769:2: ( rule__Definition__ExpressionAssignment_0_3 )
            {
             before(grammarAccess.getDefinitionAccess().getExpressionAssignment_0_3()); 
            // InternalMyDsl.g:770:2: ( rule__Definition__ExpressionAssignment_0_3 )
            // InternalMyDsl.g:770:3: rule__Definition__ExpressionAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__ExpressionAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getExpressionAssignment_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__3__Impl"


    // $ANTLR start "rule__Definition__Group_0__4"
    // InternalMyDsl.g:778:1: rule__Definition__Group_0__4 : rule__Definition__Group_0__4__Impl ;
    public final void rule__Definition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:782:1: ( rule__Definition__Group_0__4__Impl )
            // InternalMyDsl.g:783:2: rule__Definition__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__4"


    // $ANTLR start "rule__Definition__Group_0__4__Impl"
    // InternalMyDsl.g:789:1: rule__Definition__Group_0__4__Impl : ( ')' ) ;
    public final void rule__Definition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( ( ')' ) )
            // InternalMyDsl.g:794:1: ( ')' )
            {
            // InternalMyDsl.g:794:1: ( ')' )
            // InternalMyDsl.g:795:2: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_0__4__Impl"


    // $ANTLR start "rule__Definition__Group_1__0"
    // InternalMyDsl.g:805:1: rule__Definition__Group_1__0 : rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 ;
    public final void rule__Definition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:809:1: ( rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1 )
            // InternalMyDsl.g:810:2: rule__Definition__Group_1__0__Impl rule__Definition__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__Definition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0"


    // $ANTLR start "rule__Definition__Group_1__0__Impl"
    // InternalMyDsl.g:817:1: rule__Definition__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Definition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( ( '(' ) )
            // InternalMyDsl.g:822:1: ( '(' )
            {
            // InternalMyDsl.g:822:1: ( '(' )
            // InternalMyDsl.g:823:2: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__0__Impl"


    // $ANTLR start "rule__Definition__Group_1__1"
    // InternalMyDsl.g:832:1: rule__Definition__Group_1__1 : rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 ;
    public final void rule__Definition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:836:1: ( rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2 )
            // InternalMyDsl.g:837:2: rule__Definition__Group_1__1__Impl rule__Definition__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__Definition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1"


    // $ANTLR start "rule__Definition__Group_1__1__Impl"
    // InternalMyDsl.g:844:1: rule__Definition__Group_1__1__Impl : ( 'define' ) ;
    public final void rule__Definition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( ( 'define' ) )
            // InternalMyDsl.g:849:1: ( 'define' )
            {
            // InternalMyDsl.g:849:1: ( 'define' )
            // InternalMyDsl.g:850:2: 'define'
            {
             before(grammarAccess.getDefinitionAccess().getDefineKeyword_1_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getDefineKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__1__Impl"


    // $ANTLR start "rule__Definition__Group_1__2"
    // InternalMyDsl.g:859:1: rule__Definition__Group_1__2 : rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 ;
    public final void rule__Definition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:863:1: ( rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3 )
            // InternalMyDsl.g:864:2: rule__Definition__Group_1__2__Impl rule__Definition__Group_1__3
            {
            pushFollow(FOLLOW_9);
            rule__Definition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2"


    // $ANTLR start "rule__Definition__Group_1__2__Impl"
    // InternalMyDsl.g:871:1: rule__Definition__Group_1__2__Impl : ( '(' ) ;
    public final void rule__Definition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( ( '(' ) )
            // InternalMyDsl.g:876:1: ( '(' )
            {
            // InternalMyDsl.g:876:1: ( '(' )
            // InternalMyDsl.g:877:2: '('
            {
             before(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getLeftParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__2__Impl"


    // $ANTLR start "rule__Definition__Group_1__3"
    // InternalMyDsl.g:886:1: rule__Definition__Group_1__3 : rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 ;
    public final void rule__Definition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:890:1: ( rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4 )
            // InternalMyDsl.g:891:2: rule__Definition__Group_1__3__Impl rule__Definition__Group_1__4
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3"


    // $ANTLR start "rule__Definition__Group_1__3__Impl"
    // InternalMyDsl.g:898:1: rule__Definition__Group_1__3__Impl : ( ( rule__Definition__VariableAssignment_1_3 ) ) ;
    public final void rule__Definition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( ( ( rule__Definition__VariableAssignment_1_3 ) ) )
            // InternalMyDsl.g:903:1: ( ( rule__Definition__VariableAssignment_1_3 ) )
            {
            // InternalMyDsl.g:903:1: ( ( rule__Definition__VariableAssignment_1_3 ) )
            // InternalMyDsl.g:904:2: ( rule__Definition__VariableAssignment_1_3 )
            {
             before(grammarAccess.getDefinitionAccess().getVariableAssignment_1_3()); 
            // InternalMyDsl.g:905:2: ( rule__Definition__VariableAssignment_1_3 )
            // InternalMyDsl.g:905:3: rule__Definition__VariableAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__Definition__VariableAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getVariableAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__3__Impl"


    // $ANTLR start "rule__Definition__Group_1__4"
    // InternalMyDsl.g:913:1: rule__Definition__Group_1__4 : rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5 ;
    public final void rule__Definition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:917:1: ( rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5 )
            // InternalMyDsl.g:918:2: rule__Definition__Group_1__4__Impl rule__Definition__Group_1__5
            {
            pushFollow(FOLLOW_10);
            rule__Definition__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__4"


    // $ANTLR start "rule__Definition__Group_1__4__Impl"
    // InternalMyDsl.g:925:1: rule__Definition__Group_1__4__Impl : ( ( rule__Definition__VariablesAssignment_1_4 )* ) ;
    public final void rule__Definition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( ( ( rule__Definition__VariablesAssignment_1_4 )* ) )
            // InternalMyDsl.g:930:1: ( ( rule__Definition__VariablesAssignment_1_4 )* )
            {
            // InternalMyDsl.g:930:1: ( ( rule__Definition__VariablesAssignment_1_4 )* )
            // InternalMyDsl.g:931:2: ( rule__Definition__VariablesAssignment_1_4 )*
            {
             before(grammarAccess.getDefinitionAccess().getVariablesAssignment_1_4()); 
            // InternalMyDsl.g:932:2: ( rule__Definition__VariablesAssignment_1_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:932:3: rule__Definition__VariablesAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Definition__VariablesAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDefinitionAccess().getVariablesAssignment_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__4__Impl"


    // $ANTLR start "rule__Definition__Group_1__5"
    // InternalMyDsl.g:940:1: rule__Definition__Group_1__5 : rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6 ;
    public final void rule__Definition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:944:1: ( rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6 )
            // InternalMyDsl.g:945:2: rule__Definition__Group_1__5__Impl rule__Definition__Group_1__6
            {
            pushFollow(FOLLOW_6);
            rule__Definition__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__5"


    // $ANTLR start "rule__Definition__Group_1__5__Impl"
    // InternalMyDsl.g:952:1: rule__Definition__Group_1__5__Impl : ( ')' ) ;
    public final void rule__Definition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( ( ')' ) )
            // InternalMyDsl.g:957:1: ( ')' )
            {
            // InternalMyDsl.g:957:1: ( ')' )
            // InternalMyDsl.g:958:2: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__5__Impl"


    // $ANTLR start "rule__Definition__Group_1__6"
    // InternalMyDsl.g:967:1: rule__Definition__Group_1__6 : rule__Definition__Group_1__6__Impl rule__Definition__Group_1__7 ;
    public final void rule__Definition__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:971:1: ( rule__Definition__Group_1__6__Impl rule__Definition__Group_1__7 )
            // InternalMyDsl.g:972:2: rule__Definition__Group_1__6__Impl rule__Definition__Group_1__7
            {
            pushFollow(FOLLOW_7);
            rule__Definition__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__6"


    // $ANTLR start "rule__Definition__Group_1__6__Impl"
    // InternalMyDsl.g:979:1: rule__Definition__Group_1__6__Impl : ( ( rule__Definition__BodyAssignment_1_6 ) ) ;
    public final void rule__Definition__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( ( ( rule__Definition__BodyAssignment_1_6 ) ) )
            // InternalMyDsl.g:984:1: ( ( rule__Definition__BodyAssignment_1_6 ) )
            {
            // InternalMyDsl.g:984:1: ( ( rule__Definition__BodyAssignment_1_6 ) )
            // InternalMyDsl.g:985:2: ( rule__Definition__BodyAssignment_1_6 )
            {
             before(grammarAccess.getDefinitionAccess().getBodyAssignment_1_6()); 
            // InternalMyDsl.g:986:2: ( rule__Definition__BodyAssignment_1_6 )
            // InternalMyDsl.g:986:3: rule__Definition__BodyAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__Definition__BodyAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getBodyAssignment_1_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__6__Impl"


    // $ANTLR start "rule__Definition__Group_1__7"
    // InternalMyDsl.g:994:1: rule__Definition__Group_1__7 : rule__Definition__Group_1__7__Impl ;
    public final void rule__Definition__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:998:1: ( rule__Definition__Group_1__7__Impl )
            // InternalMyDsl.g:999:2: rule__Definition__Group_1__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Definition__Group_1__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__7"


    // $ANTLR start "rule__Definition__Group_1__7__Impl"
    // InternalMyDsl.g:1005:1: rule__Definition__Group_1__7__Impl : ( ')' ) ;
    public final void rule__Definition__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( ')' ) )
            // InternalMyDsl.g:1010:1: ( ')' )
            {
            // InternalMyDsl.g:1010:1: ( ')' )
            // InternalMyDsl.g:1011:2: ')'
            {
             before(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_7()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getRightParenthesisKeyword_1_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__Group_1__7__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // InternalMyDsl.g:1021:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1025:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // InternalMyDsl.g:1026:2: rule__Body__Group__0__Impl rule__Body__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Body__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Body__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0"


    // $ANTLR start "rule__Body__Group__0__Impl"
    // InternalMyDsl.g:1033:1: rule__Body__Group__0__Impl : ( ( rule__Body__DefinitionAssignment_0 )* ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( ( ( rule__Body__DefinitionAssignment_0 )* ) )
            // InternalMyDsl.g:1038:1: ( ( rule__Body__DefinitionAssignment_0 )* )
            {
            // InternalMyDsl.g:1038:1: ( ( rule__Body__DefinitionAssignment_0 )* )
            // InternalMyDsl.g:1039:2: ( rule__Body__DefinitionAssignment_0 )*
            {
             before(grammarAccess.getBodyAccess().getDefinitionAssignment_0()); 
            // InternalMyDsl.g:1040:2: ( rule__Body__DefinitionAssignment_0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==23) ) {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==24) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1040:3: rule__Body__DefinitionAssignment_0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Body__DefinitionAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getDefinitionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__0__Impl"


    // $ANTLR start "rule__Body__Group__1"
    // InternalMyDsl.g:1048:1: rule__Body__Group__1 : rule__Body__Group__1__Impl ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1052:1: ( rule__Body__Group__1__Impl )
            // InternalMyDsl.g:1053:2: rule__Body__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Body__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1"


    // $ANTLR start "rule__Body__Group__1__Impl"
    // InternalMyDsl.g:1059:1: rule__Body__Group__1__Impl : ( ( ( rule__Body__ExpressionAssignment_1 ) ) ( ( rule__Body__ExpressionAssignment_1 )* ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( ( ( ( rule__Body__ExpressionAssignment_1 ) ) ( ( rule__Body__ExpressionAssignment_1 )* ) ) )
            // InternalMyDsl.g:1064:1: ( ( ( rule__Body__ExpressionAssignment_1 ) ) ( ( rule__Body__ExpressionAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1064:1: ( ( ( rule__Body__ExpressionAssignment_1 ) ) ( ( rule__Body__ExpressionAssignment_1 )* ) )
            // InternalMyDsl.g:1065:2: ( ( rule__Body__ExpressionAssignment_1 ) ) ( ( rule__Body__ExpressionAssignment_1 )* )
            {
            // InternalMyDsl.g:1065:2: ( ( rule__Body__ExpressionAssignment_1 ) )
            // InternalMyDsl.g:1066:3: ( rule__Body__ExpressionAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getExpressionAssignment_1()); 
            // InternalMyDsl.g:1067:3: ( rule__Body__ExpressionAssignment_1 )
            // InternalMyDsl.g:1067:4: rule__Body__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__Body__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getExpressionAssignment_1()); 

            }

            // InternalMyDsl.g:1070:2: ( ( rule__Body__ExpressionAssignment_1 )* )
            // InternalMyDsl.g:1071:3: ( rule__Body__ExpressionAssignment_1 )*
            {
             before(grammarAccess.getBodyAccess().getExpressionAssignment_1()); 
            // InternalMyDsl.g:1072:3: ( rule__Body__ExpressionAssignment_1 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_BOOL && LA11_0<=RULE_NEGATIVE)||LA11_0==RULE_OPER||LA11_0==23) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1072:4: rule__Body__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Body__ExpressionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getBodyAccess().getExpressionAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group__0"
    // InternalMyDsl.g:1082:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1086:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalMyDsl.g:1087:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Comparison__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0"


    // $ANTLR start "rule__Comparison__Group__0__Impl"
    // InternalMyDsl.g:1094:1: rule__Comparison__Group__0__Impl : ( () ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1098:1: ( ( () ) )
            // InternalMyDsl.g:1099:1: ( () )
            {
            // InternalMyDsl.g:1099:1: ( () )
            // InternalMyDsl.g:1100:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonAction_0()); 
            // InternalMyDsl.g:1101:2: ()
            // InternalMyDsl.g:1101:3: 
            {
            }

             after(grammarAccess.getComparisonAccess().getComparisonAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__0__Impl"


    // $ANTLR start "rule__Comparison__Group__1"
    // InternalMyDsl.g:1109:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1113:1: ( rule__Comparison__Group__1__Impl )
            // InternalMyDsl.g:1114:2: rule__Comparison__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1"


    // $ANTLR start "rule__Comparison__Group__1__Impl"
    // InternalMyDsl.g:1120:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Alternatives_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1124:1: ( ( ( rule__Comparison__Alternatives_1 ) ) )
            // InternalMyDsl.g:1125:1: ( ( rule__Comparison__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1125:1: ( ( rule__Comparison__Alternatives_1 ) )
            // InternalMyDsl.g:1126:2: ( rule__Comparison__Alternatives_1 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1127:2: ( rule__Comparison__Alternatives_1 )
            // InternalMyDsl.g:1127:3: rule__Comparison__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__0"
    // InternalMyDsl.g:1136:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1140:1: ( rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 )
            // InternalMyDsl.g:1141:2: rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Comparison__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__0"


    // $ANTLR start "rule__Comparison__Group_1_0__0__Impl"
    // InternalMyDsl.g:1148:1: rule__Comparison__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1152:1: ( ( '(' ) )
            // InternalMyDsl.g:1153:1: ( '(' )
            {
            // InternalMyDsl.g:1153:1: ( '(' )
            // InternalMyDsl.g:1154:2: '('
            {
             before(grammarAccess.getComparisonAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getLeftParenthesisKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__0__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__1"
    // InternalMyDsl.g:1163:1: rule__Comparison__Group_1_0__1 : rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2 ;
    public final void rule__Comparison__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1167:1: ( rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2 )
            // InternalMyDsl.g:1168:2: rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2
            {
            pushFollow(FOLLOW_14);
            rule__Comparison__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__1"


    // $ANTLR start "rule__Comparison__Group_1_0__1__Impl"
    // InternalMyDsl.g:1175:1: rule__Comparison__Group_1_0__1__Impl : ( ( rule__Comparison__Alternatives_1_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1179:1: ( ( ( rule__Comparison__Alternatives_1_0_1 ) ) )
            // InternalMyDsl.g:1180:1: ( ( rule__Comparison__Alternatives_1_0_1 ) )
            {
            // InternalMyDsl.g:1180:1: ( ( rule__Comparison__Alternatives_1_0_1 ) )
            // InternalMyDsl.g:1181:2: ( rule__Comparison__Alternatives_1_0_1 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0_1()); 
            // InternalMyDsl.g:1182:2: ( rule__Comparison__Alternatives_1_0_1 )
            // InternalMyDsl.g:1182:3: rule__Comparison__Alternatives_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Alternatives_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getAlternatives_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__1__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__2"
    // InternalMyDsl.g:1190:1: rule__Comparison__Group_1_0__2 : rule__Comparison__Group_1_0__2__Impl rule__Comparison__Group_1_0__3 ;
    public final void rule__Comparison__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1194:1: ( rule__Comparison__Group_1_0__2__Impl rule__Comparison__Group_1_0__3 )
            // InternalMyDsl.g:1195:2: rule__Comparison__Group_1_0__2__Impl rule__Comparison__Group_1_0__3
            {
            pushFollow(FOLLOW_14);
            rule__Comparison__Group_1_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__2"


    // $ANTLR start "rule__Comparison__Group_1_0__2__Impl"
    // InternalMyDsl.g:1202:1: rule__Comparison__Group_1_0__2__Impl : ( ( rule__Comparison__Num1Assignment_1_0_2 ) ) ;
    public final void rule__Comparison__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1206:1: ( ( ( rule__Comparison__Num1Assignment_1_0_2 ) ) )
            // InternalMyDsl.g:1207:1: ( ( rule__Comparison__Num1Assignment_1_0_2 ) )
            {
            // InternalMyDsl.g:1207:1: ( ( rule__Comparison__Num1Assignment_1_0_2 ) )
            // InternalMyDsl.g:1208:2: ( rule__Comparison__Num1Assignment_1_0_2 )
            {
             before(grammarAccess.getComparisonAccess().getNum1Assignment_1_0_2()); 
            // InternalMyDsl.g:1209:2: ( rule__Comparison__Num1Assignment_1_0_2 )
            // InternalMyDsl.g:1209:3: rule__Comparison__Num1Assignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Num1Assignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getNum1Assignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__2__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__3"
    // InternalMyDsl.g:1217:1: rule__Comparison__Group_1_0__3 : rule__Comparison__Group_1_0__3__Impl rule__Comparison__Group_1_0__4 ;
    public final void rule__Comparison__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1221:1: ( rule__Comparison__Group_1_0__3__Impl rule__Comparison__Group_1_0__4 )
            // InternalMyDsl.g:1222:2: rule__Comparison__Group_1_0__3__Impl rule__Comparison__Group_1_0__4
            {
            pushFollow(FOLLOW_7);
            rule__Comparison__Group_1_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__3"


    // $ANTLR start "rule__Comparison__Group_1_0__3__Impl"
    // InternalMyDsl.g:1229:1: rule__Comparison__Group_1_0__3__Impl : ( ( rule__Comparison__Num2Assignment_1_0_3 ) ) ;
    public final void rule__Comparison__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1233:1: ( ( ( rule__Comparison__Num2Assignment_1_0_3 ) ) )
            // InternalMyDsl.g:1234:1: ( ( rule__Comparison__Num2Assignment_1_0_3 ) )
            {
            // InternalMyDsl.g:1234:1: ( ( rule__Comparison__Num2Assignment_1_0_3 ) )
            // InternalMyDsl.g:1235:2: ( rule__Comparison__Num2Assignment_1_0_3 )
            {
             before(grammarAccess.getComparisonAccess().getNum2Assignment_1_0_3()); 
            // InternalMyDsl.g:1236:2: ( rule__Comparison__Num2Assignment_1_0_3 )
            // InternalMyDsl.g:1236:3: rule__Comparison__Num2Assignment_1_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Num2Assignment_1_0_3();

            state._fsp--;


            }

             after(grammarAccess.getComparisonAccess().getNum2Assignment_1_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__3__Impl"


    // $ANTLR start "rule__Comparison__Group_1_0__4"
    // InternalMyDsl.g:1244:1: rule__Comparison__Group_1_0__4 : rule__Comparison__Group_1_0__4__Impl ;
    public final void rule__Comparison__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1248:1: ( rule__Comparison__Group_1_0__4__Impl )
            // InternalMyDsl.g:1249:2: rule__Comparison__Group_1_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Comparison__Group_1_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__4"


    // $ANTLR start "rule__Comparison__Group_1_0__4__Impl"
    // InternalMyDsl.g:1255:1: rule__Comparison__Group_1_0__4__Impl : ( ')' ) ;
    public final void rule__Comparison__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1259:1: ( ( ')' ) )
            // InternalMyDsl.g:1260:1: ( ')' )
            {
            // InternalMyDsl.g:1260:1: ( ')' )
            // InternalMyDsl.g:1261:2: ')'
            {
             before(grammarAccess.getComparisonAccess().getRightParenthesisKeyword_1_0_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getRightParenthesisKeyword_1_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Group_1_0__4__Impl"


    // $ANTLR start "rule__Trigonometry__Group__0"
    // InternalMyDsl.g:1271:1: rule__Trigonometry__Group__0 : rule__Trigonometry__Group__0__Impl rule__Trigonometry__Group__1 ;
    public final void rule__Trigonometry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1275:1: ( rule__Trigonometry__Group__0__Impl rule__Trigonometry__Group__1 )
            // InternalMyDsl.g:1276:2: rule__Trigonometry__Group__0__Impl rule__Trigonometry__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Trigonometry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigonometry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigonometry__Group__0"


    // $ANTLR start "rule__Trigonometry__Group__0__Impl"
    // InternalMyDsl.g:1283:1: rule__Trigonometry__Group__0__Impl : ( ( rule__Trigonometry__TrigAssignment_0 ) ) ;
    public final void rule__Trigonometry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1287:1: ( ( ( rule__Trigonometry__TrigAssignment_0 ) ) )
            // InternalMyDsl.g:1288:1: ( ( rule__Trigonometry__TrigAssignment_0 ) )
            {
            // InternalMyDsl.g:1288:1: ( ( rule__Trigonometry__TrigAssignment_0 ) )
            // InternalMyDsl.g:1289:2: ( rule__Trigonometry__TrigAssignment_0 )
            {
             before(grammarAccess.getTrigonometryAccess().getTrigAssignment_0()); 
            // InternalMyDsl.g:1290:2: ( rule__Trigonometry__TrigAssignment_0 )
            // InternalMyDsl.g:1290:3: rule__Trigonometry__TrigAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Trigonometry__TrigAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getTrigonometryAccess().getTrigAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigonometry__Group__0__Impl"


    // $ANTLR start "rule__Trigonometry__Group__1"
    // InternalMyDsl.g:1298:1: rule__Trigonometry__Group__1 : rule__Trigonometry__Group__1__Impl rule__Trigonometry__Group__2 ;
    public final void rule__Trigonometry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1302:1: ( rule__Trigonometry__Group__1__Impl rule__Trigonometry__Group__2 )
            // InternalMyDsl.g:1303:2: rule__Trigonometry__Group__1__Impl rule__Trigonometry__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Trigonometry__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigonometry__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigonometry__Group__1"


    // $ANTLR start "rule__Trigonometry__Group__1__Impl"
    // InternalMyDsl.g:1310:1: rule__Trigonometry__Group__1__Impl : ( RULE_MATH ) ;
    public final void rule__Trigonometry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1314:1: ( ( RULE_MATH ) )
            // InternalMyDsl.g:1315:1: ( RULE_MATH )
            {
            // InternalMyDsl.g:1315:1: ( RULE_MATH )
            // InternalMyDsl.g:1316:2: RULE_MATH
            {
             before(grammarAccess.getTrigonometryAccess().getMATHTerminalRuleCall_1()); 
            match(input,RULE_MATH,FOLLOW_2); 
             after(grammarAccess.getTrigonometryAccess().getMATHTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigonometry__Group__1__Impl"


    // $ANTLR start "rule__Trigonometry__Group__2"
    // InternalMyDsl.g:1325:1: rule__Trigonometry__Group__2 : rule__Trigonometry__Group__2__Impl rule__Trigonometry__Group__3 ;
    public final void rule__Trigonometry__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1329:1: ( rule__Trigonometry__Group__2__Impl rule__Trigonometry__Group__3 )
            // InternalMyDsl.g:1330:2: rule__Trigonometry__Group__2__Impl rule__Trigonometry__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Trigonometry__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Trigonometry__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigonometry__Group__2"


    // $ANTLR start "rule__Trigonometry__Group__2__Impl"
    // InternalMyDsl.g:1337:1: rule__Trigonometry__Group__2__Impl : ( ( rule__Trigonometry__NumbAssignment_2 ) ) ;
    public final void rule__Trigonometry__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1341:1: ( ( ( rule__Trigonometry__NumbAssignment_2 ) ) )
            // InternalMyDsl.g:1342:1: ( ( rule__Trigonometry__NumbAssignment_2 ) )
            {
            // InternalMyDsl.g:1342:1: ( ( rule__Trigonometry__NumbAssignment_2 ) )
            // InternalMyDsl.g:1343:2: ( rule__Trigonometry__NumbAssignment_2 )
            {
             before(grammarAccess.getTrigonometryAccess().getNumbAssignment_2()); 
            // InternalMyDsl.g:1344:2: ( rule__Trigonometry__NumbAssignment_2 )
            // InternalMyDsl.g:1344:3: rule__Trigonometry__NumbAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Trigonometry__NumbAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getTrigonometryAccess().getNumbAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigonometry__Group__2__Impl"


    // $ANTLR start "rule__Trigonometry__Group__3"
    // InternalMyDsl.g:1352:1: rule__Trigonometry__Group__3 : rule__Trigonometry__Group__3__Impl ;
    public final void rule__Trigonometry__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1356:1: ( rule__Trigonometry__Group__3__Impl )
            // InternalMyDsl.g:1357:2: rule__Trigonometry__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Trigonometry__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigonometry__Group__3"


    // $ANTLR start "rule__Trigonometry__Group__3__Impl"
    // InternalMyDsl.g:1363:1: rule__Trigonometry__Group__3__Impl : ( ')' ) ;
    public final void rule__Trigonometry__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1367:1: ( ( ')' ) )
            // InternalMyDsl.g:1368:1: ( ')' )
            {
            // InternalMyDsl.g:1368:1: ( ')' )
            // InternalMyDsl.g:1369:2: ')'
            {
             before(grammarAccess.getTrigonometryAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getTrigonometryAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigonometry__Group__3__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // InternalMyDsl.g:1379:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1383:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalMyDsl.g:1384:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__Set__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0"


    // $ANTLR start "rule__Set__Group__0__Impl"
    // InternalMyDsl.g:1391:1: rule__Set__Group__0__Impl : ( '(' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1395:1: ( ( '(' ) )
            // InternalMyDsl.g:1396:1: ( '(' )
            {
            // InternalMyDsl.g:1396:1: ( '(' )
            // InternalMyDsl.g:1397:2: '('
            {
             before(grammarAccess.getSetAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__0__Impl"


    // $ANTLR start "rule__Set__Group__1"
    // InternalMyDsl.g:1406:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1410:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalMyDsl.g:1411:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Set__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1"


    // $ANTLR start "rule__Set__Group__1__Impl"
    // InternalMyDsl.g:1418:1: rule__Set__Group__1__Impl : ( 'set!' ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1422:1: ( ( 'set!' ) )
            // InternalMyDsl.g:1423:1: ( 'set!' )
            {
            // InternalMyDsl.g:1423:1: ( 'set!' )
            // InternalMyDsl.g:1424:2: 'set!'
            {
             before(grammarAccess.getSetAccess().getSetKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getSetKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__1__Impl"


    // $ANTLR start "rule__Set__Group__2"
    // InternalMyDsl.g:1433:1: rule__Set__Group__2 : rule__Set__Group__2__Impl rule__Set__Group__3 ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1437:1: ( rule__Set__Group__2__Impl rule__Set__Group__3 )
            // InternalMyDsl.g:1438:2: rule__Set__Group__2__Impl rule__Set__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Set__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2"


    // $ANTLR start "rule__Set__Group__2__Impl"
    // InternalMyDsl.g:1445:1: rule__Set__Group__2__Impl : ( ( rule__Set__ConsAssignment_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( ( ( rule__Set__ConsAssignment_2 ) ) )
            // InternalMyDsl.g:1450:1: ( ( rule__Set__ConsAssignment_2 ) )
            {
            // InternalMyDsl.g:1450:1: ( ( rule__Set__ConsAssignment_2 ) )
            // InternalMyDsl.g:1451:2: ( rule__Set__ConsAssignment_2 )
            {
             before(grammarAccess.getSetAccess().getConsAssignment_2()); 
            // InternalMyDsl.g:1452:2: ( rule__Set__ConsAssignment_2 )
            // InternalMyDsl.g:1452:3: rule__Set__ConsAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Set__ConsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getConsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__2__Impl"


    // $ANTLR start "rule__Set__Group__3"
    // InternalMyDsl.g:1460:1: rule__Set__Group__3 : rule__Set__Group__3__Impl rule__Set__Group__4 ;
    public final void rule__Set__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1464:1: ( rule__Set__Group__3__Impl rule__Set__Group__4 )
            // InternalMyDsl.g:1465:2: rule__Set__Group__3__Impl rule__Set__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Set__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Set__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__3"


    // $ANTLR start "rule__Set__Group__3__Impl"
    // InternalMyDsl.g:1472:1: rule__Set__Group__3__Impl : ( ( rule__Set__ExpressionAssignment_3 ) ) ;
    public final void rule__Set__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1476:1: ( ( ( rule__Set__ExpressionAssignment_3 ) ) )
            // InternalMyDsl.g:1477:1: ( ( rule__Set__ExpressionAssignment_3 ) )
            {
            // InternalMyDsl.g:1477:1: ( ( rule__Set__ExpressionAssignment_3 ) )
            // InternalMyDsl.g:1478:2: ( rule__Set__ExpressionAssignment_3 )
            {
             before(grammarAccess.getSetAccess().getExpressionAssignment_3()); 
            // InternalMyDsl.g:1479:2: ( rule__Set__ExpressionAssignment_3 )
            // InternalMyDsl.g:1479:3: rule__Set__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Set__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSetAccess().getExpressionAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__3__Impl"


    // $ANTLR start "rule__Set__Group__4"
    // InternalMyDsl.g:1487:1: rule__Set__Group__4 : rule__Set__Group__4__Impl ;
    public final void rule__Set__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1491:1: ( rule__Set__Group__4__Impl )
            // InternalMyDsl.g:1492:2: rule__Set__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Set__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__4"


    // $ANTLR start "rule__Set__Group__4__Impl"
    // InternalMyDsl.g:1498:1: rule__Set__Group__4__Impl : ( ')' ) ;
    public final void rule__Set__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1502:1: ( ( ')' ) )
            // InternalMyDsl.g:1503:1: ( ')' )
            {
            // InternalMyDsl.g:1503:1: ( ')' )
            // InternalMyDsl.g:1504:2: ')'
            {
             before(grammarAccess.getSetAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getSetAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__0"
    // InternalMyDsl.g:1514:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1518:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalMyDsl.g:1519:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__Conditional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0"


    // $ANTLR start "rule__Conditional__Group__0__Impl"
    // InternalMyDsl.g:1526:1: rule__Conditional__Group__0__Impl : ( '(' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1530:1: ( ( '(' ) )
            // InternalMyDsl.g:1531:1: ( '(' )
            {
            // InternalMyDsl.g:1531:1: ( '(' )
            // InternalMyDsl.g:1532:2: '('
            {
             before(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__0__Impl"


    // $ANTLR start "rule__Conditional__Group__1"
    // InternalMyDsl.g:1541:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1545:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalMyDsl.g:1546:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Conditional__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1"


    // $ANTLR start "rule__Conditional__Group__1__Impl"
    // InternalMyDsl.g:1553:1: rule__Conditional__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( ( 'if' ) )
            // InternalMyDsl.g:1558:1: ( 'if' )
            {
            // InternalMyDsl.g:1558:1: ( 'if' )
            // InternalMyDsl.g:1559:2: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getIfKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__1__Impl"


    // $ANTLR start "rule__Conditional__Group__2"
    // InternalMyDsl.g:1568:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1572:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // InternalMyDsl.g:1573:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Conditional__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2"


    // $ANTLR start "rule__Conditional__Group__2__Impl"
    // InternalMyDsl.g:1580:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__ConditionAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( ( ( rule__Conditional__ConditionAssignment_2 ) ) )
            // InternalMyDsl.g:1585:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            {
            // InternalMyDsl.g:1585:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            // InternalMyDsl.g:1586:2: ( rule__Conditional__ConditionAssignment_2 )
            {
             before(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 
            // InternalMyDsl.g:1587:2: ( rule__Conditional__ConditionAssignment_2 )
            // InternalMyDsl.g:1587:3: rule__Conditional__ConditionAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__ConditionAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__2__Impl"


    // $ANTLR start "rule__Conditional__Group__3"
    // InternalMyDsl.g:1595:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1599:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // InternalMyDsl.g:1600:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Conditional__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3"


    // $ANTLR start "rule__Conditional__Group__3__Impl"
    // InternalMyDsl.g:1607:1: rule__Conditional__Group__3__Impl : ( ( rule__Conditional__IftrueAssignment_3 ) ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1611:1: ( ( ( rule__Conditional__IftrueAssignment_3 ) ) )
            // InternalMyDsl.g:1612:1: ( ( rule__Conditional__IftrueAssignment_3 ) )
            {
            // InternalMyDsl.g:1612:1: ( ( rule__Conditional__IftrueAssignment_3 ) )
            // InternalMyDsl.g:1613:2: ( rule__Conditional__IftrueAssignment_3 )
            {
             before(grammarAccess.getConditionalAccess().getIftrueAssignment_3()); 
            // InternalMyDsl.g:1614:2: ( rule__Conditional__IftrueAssignment_3 )
            // InternalMyDsl.g:1614:3: rule__Conditional__IftrueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__IftrueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getConditionalAccess().getIftrueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__3__Impl"


    // $ANTLR start "rule__Conditional__Group__4"
    // InternalMyDsl.g:1622:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1626:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // InternalMyDsl.g:1627:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Conditional__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Conditional__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4"


    // $ANTLR start "rule__Conditional__Group__4__Impl"
    // InternalMyDsl.g:1634:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__ElseAssignment_4 )? ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( ( ( rule__Conditional__ElseAssignment_4 )? ) )
            // InternalMyDsl.g:1639:1: ( ( rule__Conditional__ElseAssignment_4 )? )
            {
            // InternalMyDsl.g:1639:1: ( ( rule__Conditional__ElseAssignment_4 )? )
            // InternalMyDsl.g:1640:2: ( rule__Conditional__ElseAssignment_4 )?
            {
             before(grammarAccess.getConditionalAccess().getElseAssignment_4()); 
            // InternalMyDsl.g:1641:2: ( rule__Conditional__ElseAssignment_4 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=RULE_BOOL && LA12_0<=RULE_NEGATIVE)||LA12_0==RULE_OPER||LA12_0==23) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1641:3: rule__Conditional__ElseAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Conditional__ElseAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getConditionalAccess().getElseAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__4__Impl"


    // $ANTLR start "rule__Conditional__Group__5"
    // InternalMyDsl.g:1649:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1653:1: ( rule__Conditional__Group__5__Impl )
            // InternalMyDsl.g:1654:2: rule__Conditional__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Conditional__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5"


    // $ANTLR start "rule__Conditional__Group__5__Impl"
    // InternalMyDsl.g:1660:1: rule__Conditional__Group__5__Impl : ( ')' ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1664:1: ( ( ')' ) )
            // InternalMyDsl.g:1665:1: ( ')' )
            {
            // InternalMyDsl.g:1665:1: ( ')' )
            // InternalMyDsl.g:1666:2: ')'
            {
             before(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_5()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__Group__5__Impl"


    // $ANTLR start "rule__NestedOperation__Group__0"
    // InternalMyDsl.g:1676:1: rule__NestedOperation__Group__0 : rule__NestedOperation__Group__0__Impl rule__NestedOperation__Group__1 ;
    public final void rule__NestedOperation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1680:1: ( rule__NestedOperation__Group__0__Impl rule__NestedOperation__Group__1 )
            // InternalMyDsl.g:1681:2: rule__NestedOperation__Group__0__Impl rule__NestedOperation__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__NestedOperation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedOperation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__Group__0"


    // $ANTLR start "rule__NestedOperation__Group__0__Impl"
    // InternalMyDsl.g:1688:1: rule__NestedOperation__Group__0__Impl : ( ( rule__NestedOperation__NestedOperationAssignment_0 ) ) ;
    public final void rule__NestedOperation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( ( ( rule__NestedOperation__NestedOperationAssignment_0 ) ) )
            // InternalMyDsl.g:1693:1: ( ( rule__NestedOperation__NestedOperationAssignment_0 ) )
            {
            // InternalMyDsl.g:1693:1: ( ( rule__NestedOperation__NestedOperationAssignment_0 ) )
            // InternalMyDsl.g:1694:2: ( rule__NestedOperation__NestedOperationAssignment_0 )
            {
             before(grammarAccess.getNestedOperationAccess().getNestedOperationAssignment_0()); 
            // InternalMyDsl.g:1695:2: ( rule__NestedOperation__NestedOperationAssignment_0 )
            // InternalMyDsl.g:1695:3: rule__NestedOperation__NestedOperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NestedOperation__NestedOperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNestedOperationAccess().getNestedOperationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__Group__0__Impl"


    // $ANTLR start "rule__NestedOperation__Group__1"
    // InternalMyDsl.g:1703:1: rule__NestedOperation__Group__1 : rule__NestedOperation__Group__1__Impl rule__NestedOperation__Group__2 ;
    public final void rule__NestedOperation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1707:1: ( rule__NestedOperation__Group__1__Impl rule__NestedOperation__Group__2 )
            // InternalMyDsl.g:1708:2: rule__NestedOperation__Group__1__Impl rule__NestedOperation__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__NestedOperation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedOperation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__Group__1"


    // $ANTLR start "rule__NestedOperation__Group__1__Impl"
    // InternalMyDsl.g:1715:1: rule__NestedOperation__Group__1__Impl : ( ( rule__NestedOperation__CalculateAssignment_1 ) ) ;
    public final void rule__NestedOperation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1719:1: ( ( ( rule__NestedOperation__CalculateAssignment_1 ) ) )
            // InternalMyDsl.g:1720:1: ( ( rule__NestedOperation__CalculateAssignment_1 ) )
            {
            // InternalMyDsl.g:1720:1: ( ( rule__NestedOperation__CalculateAssignment_1 ) )
            // InternalMyDsl.g:1721:2: ( rule__NestedOperation__CalculateAssignment_1 )
            {
             before(grammarAccess.getNestedOperationAccess().getCalculateAssignment_1()); 
            // InternalMyDsl.g:1722:2: ( rule__NestedOperation__CalculateAssignment_1 )
            // InternalMyDsl.g:1722:3: rule__NestedOperation__CalculateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__NestedOperation__CalculateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getNestedOperationAccess().getCalculateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__Group__1__Impl"


    // $ANTLR start "rule__NestedOperation__Group__2"
    // InternalMyDsl.g:1730:1: rule__NestedOperation__Group__2 : rule__NestedOperation__Group__2__Impl rule__NestedOperation__Group__3 ;
    public final void rule__NestedOperation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1734:1: ( rule__NestedOperation__Group__2__Impl rule__NestedOperation__Group__3 )
            // InternalMyDsl.g:1735:2: rule__NestedOperation__Group__2__Impl rule__NestedOperation__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__NestedOperation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NestedOperation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__Group__2"


    // $ANTLR start "rule__NestedOperation__Group__2__Impl"
    // InternalMyDsl.g:1742:1: rule__NestedOperation__Group__2__Impl : ( ( rule__NestedOperation__OperationAssignment_2 ) ) ;
    public final void rule__NestedOperation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1746:1: ( ( ( rule__NestedOperation__OperationAssignment_2 ) ) )
            // InternalMyDsl.g:1747:1: ( ( rule__NestedOperation__OperationAssignment_2 ) )
            {
            // InternalMyDsl.g:1747:1: ( ( rule__NestedOperation__OperationAssignment_2 ) )
            // InternalMyDsl.g:1748:2: ( rule__NestedOperation__OperationAssignment_2 )
            {
             before(grammarAccess.getNestedOperationAccess().getOperationAssignment_2()); 
            // InternalMyDsl.g:1749:2: ( rule__NestedOperation__OperationAssignment_2 )
            // InternalMyDsl.g:1749:3: rule__NestedOperation__OperationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NestedOperation__OperationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNestedOperationAccess().getOperationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__Group__2__Impl"


    // $ANTLR start "rule__NestedOperation__Group__3"
    // InternalMyDsl.g:1757:1: rule__NestedOperation__Group__3 : rule__NestedOperation__Group__3__Impl ;
    public final void rule__NestedOperation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1761:1: ( rule__NestedOperation__Group__3__Impl )
            // InternalMyDsl.g:1762:2: rule__NestedOperation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NestedOperation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__Group__3"


    // $ANTLR start "rule__NestedOperation__Group__3__Impl"
    // InternalMyDsl.g:1768:1: rule__NestedOperation__Group__3__Impl : ( ')' ) ;
    public final void rule__NestedOperation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1772:1: ( ( ')' ) )
            // InternalMyDsl.g:1773:1: ( ')' )
            {
            // InternalMyDsl.g:1773:1: ( ')' )
            // InternalMyDsl.g:1774:2: ')'
            {
             before(grammarAccess.getNestedOperationAccess().getRightParenthesisKeyword_3()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getNestedOperationAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__0"
    // InternalMyDsl.g:1784:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1788:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalMyDsl.g:1789:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Operation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0"


    // $ANTLR start "rule__Operation__Group__0__Impl"
    // InternalMyDsl.g:1796:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__OperationAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( ( ( rule__Operation__OperationAssignment_0 ) ) )
            // InternalMyDsl.g:1801:1: ( ( rule__Operation__OperationAssignment_0 ) )
            {
            // InternalMyDsl.g:1801:1: ( ( rule__Operation__OperationAssignment_0 ) )
            // InternalMyDsl.g:1802:2: ( rule__Operation__OperationAssignment_0 )
            {
             before(grammarAccess.getOperationAccess().getOperationAssignment_0()); 
            // InternalMyDsl.g:1803:2: ( rule__Operation__OperationAssignment_0 )
            // InternalMyDsl.g:1803:3: rule__Operation__OperationAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Operation__OperationAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOperationAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__0__Impl"


    // $ANTLR start "rule__Operation__Group__1"
    // InternalMyDsl.g:1811:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1815:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalMyDsl.g:1816:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Operation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1"


    // $ANTLR start "rule__Operation__Group__1__Impl"
    // InternalMyDsl.g:1823:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__CalculateAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1827:1: ( ( ( rule__Operation__CalculateAssignment_1 ) ) )
            // InternalMyDsl.g:1828:1: ( ( rule__Operation__CalculateAssignment_1 ) )
            {
            // InternalMyDsl.g:1828:1: ( ( rule__Operation__CalculateAssignment_1 ) )
            // InternalMyDsl.g:1829:2: ( rule__Operation__CalculateAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getCalculateAssignment_1()); 
            // InternalMyDsl.g:1830:2: ( rule__Operation__CalculateAssignment_1 )
            // InternalMyDsl.g:1830:3: rule__Operation__CalculateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__CalculateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getCalculateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__1__Impl"


    // $ANTLR start "rule__Operation__Group__2"
    // InternalMyDsl.g:1838:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1842:1: ( rule__Operation__Group__2__Impl )
            // InternalMyDsl.g:1843:2: rule__Operation__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2"


    // $ANTLR start "rule__Operation__Group__2__Impl"
    // InternalMyDsl.g:1849:1: rule__Operation__Group__2__Impl : ( ')' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1853:1: ( ( ')' ) )
            // InternalMyDsl.g:1854:1: ( ')' )
            {
            // InternalMyDsl.g:1854:1: ( ')' )
            // InternalMyDsl.g:1855:2: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__Group__2__Impl"


    // $ANTLR start "rule__Calculate__Group__0"
    // InternalMyDsl.g:1865:1: rule__Calculate__Group__0 : rule__Calculate__Group__0__Impl rule__Calculate__Group__1 ;
    public final void rule__Calculate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1869:1: ( rule__Calculate__Group__0__Impl rule__Calculate__Group__1 )
            // InternalMyDsl.g:1870:2: rule__Calculate__Group__0__Impl rule__Calculate__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Calculate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Calculate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__0"


    // $ANTLR start "rule__Calculate__Group__0__Impl"
    // InternalMyDsl.g:1877:1: rule__Calculate__Group__0__Impl : ( ( rule__Calculate__CalculateAssignment_0 ) ) ;
    public final void rule__Calculate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( ( ( rule__Calculate__CalculateAssignment_0 ) ) )
            // InternalMyDsl.g:1882:1: ( ( rule__Calculate__CalculateAssignment_0 ) )
            {
            // InternalMyDsl.g:1882:1: ( ( rule__Calculate__CalculateAssignment_0 ) )
            // InternalMyDsl.g:1883:2: ( rule__Calculate__CalculateAssignment_0 )
            {
             before(grammarAccess.getCalculateAccess().getCalculateAssignment_0()); 
            // InternalMyDsl.g:1884:2: ( rule__Calculate__CalculateAssignment_0 )
            // InternalMyDsl.g:1884:3: rule__Calculate__CalculateAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__CalculateAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCalculateAccess().getCalculateAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__0__Impl"


    // $ANTLR start "rule__Calculate__Group__1"
    // InternalMyDsl.g:1892:1: rule__Calculate__Group__1 : rule__Calculate__Group__1__Impl ;
    public final void rule__Calculate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1896:1: ( rule__Calculate__Group__1__Impl )
            // InternalMyDsl.g:1897:2: rule__Calculate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Calculate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__1"


    // $ANTLR start "rule__Calculate__Group__1__Impl"
    // InternalMyDsl.g:1903:1: rule__Calculate__Group__1__Impl : ( ( rule__Calculate__NumbAssignment_1 )* ) ;
    public final void rule__Calculate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1907:1: ( ( ( rule__Calculate__NumbAssignment_1 )* ) )
            // InternalMyDsl.g:1908:1: ( ( rule__Calculate__NumbAssignment_1 )* )
            {
            // InternalMyDsl.g:1908:1: ( ( rule__Calculate__NumbAssignment_1 )* )
            // InternalMyDsl.g:1909:2: ( rule__Calculate__NumbAssignment_1 )*
            {
             before(grammarAccess.getCalculateAccess().getNumbAssignment_1()); 
            // InternalMyDsl.g:1910:2: ( rule__Calculate__NumbAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_DIGIT) ) {
                    alt13=1;
                }
                else if ( (LA13_0==RULE_DOUBLE) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1910:3: rule__Calculate__NumbAssignment_1
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__Calculate__NumbAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getCalculateAccess().getNumbAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__Group__1__Impl"


    // $ANTLR start "rule__ListNumbers__Group__0"
    // InternalMyDsl.g:1919:1: rule__ListNumbers__Group__0 : rule__ListNumbers__Group__0__Impl rule__ListNumbers__Group__1 ;
    public final void rule__ListNumbers__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1923:1: ( rule__ListNumbers__Group__0__Impl rule__ListNumbers__Group__1 )
            // InternalMyDsl.g:1924:2: rule__ListNumbers__Group__0__Impl rule__ListNumbers__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ListNumbers__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListNumbers__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__Group__0"


    // $ANTLR start "rule__ListNumbers__Group__0__Impl"
    // InternalMyDsl.g:1931:1: rule__ListNumbers__Group__0__Impl : ( () ) ;
    public final void rule__ListNumbers__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1935:1: ( ( () ) )
            // InternalMyDsl.g:1936:1: ( () )
            {
            // InternalMyDsl.g:1936:1: ( () )
            // InternalMyDsl.g:1937:2: ()
            {
             before(grammarAccess.getListNumbersAccess().getListNumbersAction_0()); 
            // InternalMyDsl.g:1938:2: ()
            // InternalMyDsl.g:1938:3: 
            {
            }

             after(grammarAccess.getListNumbersAccess().getListNumbersAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__Group__0__Impl"


    // $ANTLR start "rule__ListNumbers__Group__1"
    // InternalMyDsl.g:1946:1: rule__ListNumbers__Group__1 : rule__ListNumbers__Group__1__Impl rule__ListNumbers__Group__2 ;
    public final void rule__ListNumbers__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1950:1: ( rule__ListNumbers__Group__1__Impl rule__ListNumbers__Group__2 )
            // InternalMyDsl.g:1951:2: rule__ListNumbers__Group__1__Impl rule__ListNumbers__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__ListNumbers__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListNumbers__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__Group__1"


    // $ANTLR start "rule__ListNumbers__Group__1__Impl"
    // InternalMyDsl.g:1958:1: rule__ListNumbers__Group__1__Impl : ( '(' ) ;
    public final void rule__ListNumbers__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( ( '(' ) )
            // InternalMyDsl.g:1963:1: ( '(' )
            {
            // InternalMyDsl.g:1963:1: ( '(' )
            // InternalMyDsl.g:1964:2: '('
            {
             before(grammarAccess.getListNumbersAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getListNumbersAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__Group__1__Impl"


    // $ANTLR start "rule__ListNumbers__Group__2"
    // InternalMyDsl.g:1973:1: rule__ListNumbers__Group__2 : rule__ListNumbers__Group__2__Impl rule__ListNumbers__Group__3 ;
    public final void rule__ListNumbers__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1977:1: ( rule__ListNumbers__Group__2__Impl rule__ListNumbers__Group__3 )
            // InternalMyDsl.g:1978:2: rule__ListNumbers__Group__2__Impl rule__ListNumbers__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ListNumbers__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListNumbers__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__Group__2"


    // $ANTLR start "rule__ListNumbers__Group__2__Impl"
    // InternalMyDsl.g:1985:1: rule__ListNumbers__Group__2__Impl : ( 'list' ) ;
    public final void rule__ListNumbers__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( ( 'list' ) )
            // InternalMyDsl.g:1990:1: ( 'list' )
            {
            // InternalMyDsl.g:1990:1: ( 'list' )
            // InternalMyDsl.g:1991:2: 'list'
            {
             before(grammarAccess.getListNumbersAccess().getListKeyword_2()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getListNumbersAccess().getListKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__Group__2__Impl"


    // $ANTLR start "rule__ListNumbers__Group__3"
    // InternalMyDsl.g:2000:1: rule__ListNumbers__Group__3 : rule__ListNumbers__Group__3__Impl rule__ListNumbers__Group__4 ;
    public final void rule__ListNumbers__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2004:1: ( rule__ListNumbers__Group__3__Impl rule__ListNumbers__Group__4 )
            // InternalMyDsl.g:2005:2: rule__ListNumbers__Group__3__Impl rule__ListNumbers__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__ListNumbers__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListNumbers__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__Group__3"


    // $ANTLR start "rule__ListNumbers__Group__3__Impl"
    // InternalMyDsl.g:2012:1: rule__ListNumbers__Group__3__Impl : ( ( rule__ListNumbers__NumberAssignment_3 )* ) ;
    public final void rule__ListNumbers__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2016:1: ( ( ( rule__ListNumbers__NumberAssignment_3 )* ) )
            // InternalMyDsl.g:2017:1: ( ( rule__ListNumbers__NumberAssignment_3 )* )
            {
            // InternalMyDsl.g:2017:1: ( ( rule__ListNumbers__NumberAssignment_3 )* )
            // InternalMyDsl.g:2018:2: ( rule__ListNumbers__NumberAssignment_3 )*
            {
             before(grammarAccess.getListNumbersAccess().getNumberAssignment_3()); 
            // InternalMyDsl.g:2019:2: ( rule__ListNumbers__NumberAssignment_3 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_DIGIT && LA14_0<=RULE_DOUBLE)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:2019:3: rule__ListNumbers__NumberAssignment_3
            	    {
            	    pushFollow(FOLLOW_19);
            	    rule__ListNumbers__NumberAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getListNumbersAccess().getNumberAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__Group__3__Impl"


    // $ANTLR start "rule__ListNumbers__Group__4"
    // InternalMyDsl.g:2027:1: rule__ListNumbers__Group__4 : rule__ListNumbers__Group__4__Impl ;
    public final void rule__ListNumbers__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2031:1: ( rule__ListNumbers__Group__4__Impl )
            // InternalMyDsl.g:2032:2: rule__ListNumbers__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListNumbers__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__Group__4"


    // $ANTLR start "rule__ListNumbers__Group__4__Impl"
    // InternalMyDsl.g:2038:1: rule__ListNumbers__Group__4__Impl : ( ')' ) ;
    public final void rule__ListNumbers__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2042:1: ( ( ')' ) )
            // InternalMyDsl.g:2043:1: ( ')' )
            {
            // InternalMyDsl.g:2043:1: ( ')' )
            // InternalMyDsl.g:2044:2: ')'
            {
             before(grammarAccess.getListNumbersAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getListNumbersAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__Group__4__Impl"


    // $ANTLR start "rule__ListLength__Group__0"
    // InternalMyDsl.g:2054:1: rule__ListLength__Group__0 : rule__ListLength__Group__0__Impl rule__ListLength__Group__1 ;
    public final void rule__ListLength__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2058:1: ( rule__ListLength__Group__0__Impl rule__ListLength__Group__1 )
            // InternalMyDsl.g:2059:2: rule__ListLength__Group__0__Impl rule__ListLength__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__ListLength__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListLength__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__Group__0"


    // $ANTLR start "rule__ListLength__Group__0__Impl"
    // InternalMyDsl.g:2066:1: rule__ListLength__Group__0__Impl : ( () ) ;
    public final void rule__ListLength__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2070:1: ( ( () ) )
            // InternalMyDsl.g:2071:1: ( () )
            {
            // InternalMyDsl.g:2071:1: ( () )
            // InternalMyDsl.g:2072:2: ()
            {
             before(grammarAccess.getListLengthAccess().getListLengthAction_0()); 
            // InternalMyDsl.g:2073:2: ()
            // InternalMyDsl.g:2073:3: 
            {
            }

             after(grammarAccess.getListLengthAccess().getListLengthAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__Group__0__Impl"


    // $ANTLR start "rule__ListLength__Group__1"
    // InternalMyDsl.g:2081:1: rule__ListLength__Group__1 : rule__ListLength__Group__1__Impl rule__ListLength__Group__2 ;
    public final void rule__ListLength__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2085:1: ( rule__ListLength__Group__1__Impl rule__ListLength__Group__2 )
            // InternalMyDsl.g:2086:2: rule__ListLength__Group__1__Impl rule__ListLength__Group__2
            {
            pushFollow(FOLLOW_22);
            rule__ListLength__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListLength__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__Group__1"


    // $ANTLR start "rule__ListLength__Group__1__Impl"
    // InternalMyDsl.g:2093:1: rule__ListLength__Group__1__Impl : ( '(' ) ;
    public final void rule__ListLength__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2097:1: ( ( '(' ) )
            // InternalMyDsl.g:2098:1: ( '(' )
            {
            // InternalMyDsl.g:2098:1: ( '(' )
            // InternalMyDsl.g:2099:2: '('
            {
             before(grammarAccess.getListLengthAccess().getLeftParenthesisKeyword_1()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getListLengthAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__Group__1__Impl"


    // $ANTLR start "rule__ListLength__Group__2"
    // InternalMyDsl.g:2108:1: rule__ListLength__Group__2 : rule__ListLength__Group__2__Impl rule__ListLength__Group__3 ;
    public final void rule__ListLength__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2112:1: ( rule__ListLength__Group__2__Impl rule__ListLength__Group__3 )
            // InternalMyDsl.g:2113:2: rule__ListLength__Group__2__Impl rule__ListLength__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__ListLength__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListLength__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__Group__2"


    // $ANTLR start "rule__ListLength__Group__2__Impl"
    // InternalMyDsl.g:2120:1: rule__ListLength__Group__2__Impl : ( 'length' ) ;
    public final void rule__ListLength__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2124:1: ( ( 'length' ) )
            // InternalMyDsl.g:2125:1: ( 'length' )
            {
            // InternalMyDsl.g:2125:1: ( 'length' )
            // InternalMyDsl.g:2126:2: 'length'
            {
             before(grammarAccess.getListLengthAccess().getLengthKeyword_2()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getListLengthAccess().getLengthKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__Group__2__Impl"


    // $ANTLR start "rule__ListLength__Group__3"
    // InternalMyDsl.g:2135:1: rule__ListLength__Group__3 : rule__ListLength__Group__3__Impl rule__ListLength__Group__4 ;
    public final void rule__ListLength__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2139:1: ( rule__ListLength__Group__3__Impl rule__ListLength__Group__4 )
            // InternalMyDsl.g:2140:2: rule__ListLength__Group__3__Impl rule__ListLength__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__ListLength__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ListLength__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__Group__3"


    // $ANTLR start "rule__ListLength__Group__3__Impl"
    // InternalMyDsl.g:2147:1: rule__ListLength__Group__3__Impl : ( ( rule__ListLength__ListNumbersAssignment_3 ) ) ;
    public final void rule__ListLength__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( ( ( rule__ListLength__ListNumbersAssignment_3 ) ) )
            // InternalMyDsl.g:2152:1: ( ( rule__ListLength__ListNumbersAssignment_3 ) )
            {
            // InternalMyDsl.g:2152:1: ( ( rule__ListLength__ListNumbersAssignment_3 ) )
            // InternalMyDsl.g:2153:2: ( rule__ListLength__ListNumbersAssignment_3 )
            {
             before(grammarAccess.getListLengthAccess().getListNumbersAssignment_3()); 
            // InternalMyDsl.g:2154:2: ( rule__ListLength__ListNumbersAssignment_3 )
            // InternalMyDsl.g:2154:3: rule__ListLength__ListNumbersAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__ListLength__ListNumbersAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getListLengthAccess().getListNumbersAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__Group__3__Impl"


    // $ANTLR start "rule__ListLength__Group__4"
    // InternalMyDsl.g:2162:1: rule__ListLength__Group__4 : rule__ListLength__Group__4__Impl ;
    public final void rule__ListLength__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2166:1: ( rule__ListLength__Group__4__Impl )
            // InternalMyDsl.g:2167:2: rule__ListLength__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ListLength__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__Group__4"


    // $ANTLR start "rule__ListLength__Group__4__Impl"
    // InternalMyDsl.g:2173:1: rule__ListLength__Group__4__Impl : ( ')' ) ;
    public final void rule__ListLength__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2177:1: ( ( ')' ) )
            // InternalMyDsl.g:2178:1: ( ')' )
            {
            // InternalMyDsl.g:2178:1: ( ')' )
            // InternalMyDsl.g:2179:2: ')'
            {
             before(grammarAccess.getListLengthAccess().getRightParenthesisKeyword_4()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getListLengthAccess().getRightParenthesisKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__Group__4__Impl"


    // $ANTLR start "rule__Program__ProgramAssignment_0"
    // InternalMyDsl.g:2189:1: rule__Program__ProgramAssignment_0 : ( ruleExpression ) ;
    public final void rule__Program__ProgramAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2193:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2194:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2194:2: ( ruleExpression )
            // InternalMyDsl.g:2195:3: ruleExpression
            {
             before(grammarAccess.getProgramAccess().getProgramExpressionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProgramExpressionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ProgramAssignment_0"


    // $ANTLR start "rule__Program__ProgramAssignment_1"
    // InternalMyDsl.g:2204:1: rule__Program__ProgramAssignment_1 : ( ruleDefinition ) ;
    public final void rule__Program__ProgramAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2208:1: ( ( ruleDefinition ) )
            // InternalMyDsl.g:2209:2: ( ruleDefinition )
            {
            // InternalMyDsl.g:2209:2: ( ruleDefinition )
            // InternalMyDsl.g:2210:3: ruleDefinition
            {
             before(grammarAccess.getProgramAccess().getProgramDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProgramDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Program__ProgramAssignment_1"


    // $ANTLR start "rule__Definition__ConsAssignment_0_2"
    // InternalMyDsl.g:2219:1: rule__Definition__ConsAssignment_0_2 : ( ruleConstant ) ;
    public final void rule__Definition__ConsAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2223:1: ( ( ruleConstant ) )
            // InternalMyDsl.g:2224:2: ( ruleConstant )
            {
            // InternalMyDsl.g:2224:2: ( ruleConstant )
            // InternalMyDsl.g:2225:3: ruleConstant
            {
             before(grammarAccess.getDefinitionAccess().getConsConstantParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getConsConstantParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ConsAssignment_0_2"


    // $ANTLR start "rule__Definition__ExpressionAssignment_0_3"
    // InternalMyDsl.g:2234:1: rule__Definition__ExpressionAssignment_0_3 : ( ruleExpression ) ;
    public final void rule__Definition__ExpressionAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2238:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2239:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2239:2: ( ruleExpression )
            // InternalMyDsl.g:2240:3: ruleExpression
            {
             before(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getExpressionExpressionParserRuleCall_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__ExpressionAssignment_0_3"


    // $ANTLR start "rule__Definition__VariableAssignment_1_3"
    // InternalMyDsl.g:2249:1: rule__Definition__VariableAssignment_1_3 : ( RULE_ID ) ;
    public final void rule__Definition__VariableAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2253:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2254:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2254:2: ( RULE_ID )
            // InternalMyDsl.g:2255:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getVariableIDTerminalRuleCall_1_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getVariableIDTerminalRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__VariableAssignment_1_3"


    // $ANTLR start "rule__Definition__VariablesAssignment_1_4"
    // InternalMyDsl.g:2264:1: rule__Definition__VariablesAssignment_1_4 : ( RULE_ID ) ;
    public final void rule__Definition__VariablesAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2268:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2269:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2269:2: ( RULE_ID )
            // InternalMyDsl.g:2270:3: RULE_ID
            {
             before(grammarAccess.getDefinitionAccess().getVariablesIDTerminalRuleCall_1_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDefinitionAccess().getVariablesIDTerminalRuleCall_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__VariablesAssignment_1_4"


    // $ANTLR start "rule__Definition__BodyAssignment_1_6"
    // InternalMyDsl.g:2279:1: rule__Definition__BodyAssignment_1_6 : ( ruleBody ) ;
    public final void rule__Definition__BodyAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2283:1: ( ( ruleBody ) )
            // InternalMyDsl.g:2284:2: ( ruleBody )
            {
            // InternalMyDsl.g:2284:2: ( ruleBody )
            // InternalMyDsl.g:2285:3: ruleBody
            {
             before(grammarAccess.getDefinitionAccess().getBodyBodyParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getBodyBodyParserRuleCall_1_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Definition__BodyAssignment_1_6"


    // $ANTLR start "rule__Body__DefinitionAssignment_0"
    // InternalMyDsl.g:2294:1: rule__Body__DefinitionAssignment_0 : ( ruleDefinition ) ;
    public final void rule__Body__DefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2298:1: ( ( ruleDefinition ) )
            // InternalMyDsl.g:2299:2: ( ruleDefinition )
            {
            // InternalMyDsl.g:2299:2: ( ruleDefinition )
            // InternalMyDsl.g:2300:3: ruleDefinition
            {
             before(grammarAccess.getBodyAccess().getDefinitionDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getDefinitionDefinitionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__DefinitionAssignment_0"


    // $ANTLR start "rule__Body__ExpressionAssignment_1"
    // InternalMyDsl.g:2309:1: rule__Body__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Body__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2314:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2314:2: ( ruleExpression )
            // InternalMyDsl.g:2315:3: ruleExpression
            {
             before(grammarAccess.getBodyAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getBodyAccess().getExpressionExpressionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Body__ExpressionAssignment_1"


    // $ANTLR start "rule__Expression__ConstantAssignment_0"
    // InternalMyDsl.g:2324:1: rule__Expression__ConstantAssignment_0 : ( ruleConstant ) ;
    public final void rule__Expression__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2328:1: ( ( ruleConstant ) )
            // InternalMyDsl.g:2329:2: ( ruleConstant )
            {
            // InternalMyDsl.g:2329:2: ( ruleConstant )
            // InternalMyDsl.g:2330:3: ruleConstant
            {
             before(grammarAccess.getExpressionAccess().getConstantConstantParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getConstantConstantParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ConstantAssignment_0"


    // $ANTLR start "rule__Expression__OperAssignment_1"
    // InternalMyDsl.g:2339:1: rule__Expression__OperAssignment_1 : ( ruleOperation ) ;
    public final void rule__Expression__OperAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2343:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:2344:2: ( ruleOperation )
            {
            // InternalMyDsl.g:2344:2: ( ruleOperation )
            // InternalMyDsl.g:2345:3: ruleOperation
            {
             before(grammarAccess.getExpressionAccess().getOperOperationParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getOperOperationParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__OperAssignment_1"


    // $ANTLR start "rule__Expression__CompAssignment_2"
    // InternalMyDsl.g:2354:1: rule__Expression__CompAssignment_2 : ( ruleComparison ) ;
    public final void rule__Expression__CompAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2358:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:2359:2: ( ruleComparison )
            {
            // InternalMyDsl.g:2359:2: ( ruleComparison )
            // InternalMyDsl.g:2360:3: ruleComparison
            {
             before(grammarAccess.getExpressionAccess().getCompComparisonParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getCompComparisonParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CompAssignment_2"


    // $ANTLR start "rule__Expression__CondAssignment_3"
    // InternalMyDsl.g:2369:1: rule__Expression__CondAssignment_3 : ( ruleConditional ) ;
    public final void rule__Expression__CondAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2373:1: ( ( ruleConditional ) )
            // InternalMyDsl.g:2374:2: ( ruleConditional )
            {
            // InternalMyDsl.g:2374:2: ( ruleConditional )
            // InternalMyDsl.g:2375:3: ruleConditional
            {
             before(grammarAccess.getExpressionAccess().getCondConditionalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getCondConditionalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CondAssignment_3"


    // $ANTLR start "rule__Expression__SetAssignment_4"
    // InternalMyDsl.g:2384:1: rule__Expression__SetAssignment_4 : ( ruleSet ) ;
    public final void rule__Expression__SetAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2388:1: ( ( ruleSet ) )
            // InternalMyDsl.g:2389:2: ( ruleSet )
            {
            // InternalMyDsl.g:2389:2: ( ruleSet )
            // InternalMyDsl.g:2390:3: ruleSet
            {
             before(grammarAccess.getExpressionAccess().getSetSetParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSetSetParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__SetAssignment_4"


    // $ANTLR start "rule__Expression__TrigAssignment_5"
    // InternalMyDsl.g:2399:1: rule__Expression__TrigAssignment_5 : ( ruleTrigonometry ) ;
    public final void rule__Expression__TrigAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2403:1: ( ( ruleTrigonometry ) )
            // InternalMyDsl.g:2404:2: ( ruleTrigonometry )
            {
            // InternalMyDsl.g:2404:2: ( ruleTrigonometry )
            // InternalMyDsl.g:2405:3: ruleTrigonometry
            {
             before(grammarAccess.getExpressionAccess().getTrigTrigonometryParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleTrigonometry();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getTrigTrigonometryParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__TrigAssignment_5"


    // $ANTLR start "rule__Expression__ListAssignment_6"
    // InternalMyDsl.g:2414:1: rule__Expression__ListAssignment_6 : ( ruleListNumbers ) ;
    public final void rule__Expression__ListAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2418:1: ( ( ruleListNumbers ) )
            // InternalMyDsl.g:2419:2: ( ruleListNumbers )
            {
            // InternalMyDsl.g:2419:2: ( ruleListNumbers )
            // InternalMyDsl.g:2420:3: ruleListNumbers
            {
             before(grammarAccess.getExpressionAccess().getListListNumbersParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleListNumbers();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getListListNumbersParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ListAssignment_6"


    // $ANTLR start "rule__Expression__ListLengthAssignment_7"
    // InternalMyDsl.g:2429:1: rule__Expression__ListLengthAssignment_7 : ( ruleListLength ) ;
    public final void rule__Expression__ListLengthAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2433:1: ( ( ruleListLength ) )
            // InternalMyDsl.g:2434:2: ( ruleListLength )
            {
            // InternalMyDsl.g:2434:2: ( ruleListLength )
            // InternalMyDsl.g:2435:3: ruleListLength
            {
             before(grammarAccess.getExpressionAccess().getListLengthListLengthParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleListLength();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getListLengthListLengthParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__ListLengthAssignment_7"


    // $ANTLR start "rule__Expression__NestedOperationAssignment_8"
    // InternalMyDsl.g:2444:1: rule__Expression__NestedOperationAssignment_8 : ( ruleNestedOperation ) ;
    public final void rule__Expression__NestedOperationAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2448:1: ( ( ruleNestedOperation ) )
            // InternalMyDsl.g:2449:2: ( ruleNestedOperation )
            {
            // InternalMyDsl.g:2449:2: ( ruleNestedOperation )
            // InternalMyDsl.g:2450:3: ruleNestedOperation
            {
             before(grammarAccess.getExpressionAccess().getNestedOperationNestedOperationParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleNestedOperation();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getNestedOperationNestedOperationParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__NestedOperationAssignment_8"


    // $ANTLR start "rule__Expression__CalculateAssignment_9"
    // InternalMyDsl.g:2459:1: rule__Expression__CalculateAssignment_9 : ( ruleCalculate ) ;
    public final void rule__Expression__CalculateAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2463:1: ( ( ruleCalculate ) )
            // InternalMyDsl.g:2464:2: ( ruleCalculate )
            {
            // InternalMyDsl.g:2464:2: ( ruleCalculate )
            // InternalMyDsl.g:2465:3: ruleCalculate
            {
             before(grammarAccess.getExpressionAccess().getCalculateCalculateParserRuleCall_9_0()); 
            pushFollow(FOLLOW_2);
            ruleCalculate();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getCalculateCalculateParserRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Expression__CalculateAssignment_9"


    // $ANTLR start "rule__Comparison__Num1Assignment_1_0_2"
    // InternalMyDsl.g:2474:1: rule__Comparison__Num1Assignment_1_0_2 : ( ruleNumber ) ;
    public final void rule__Comparison__Num1Assignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2478:1: ( ( ruleNumber ) )
            // InternalMyDsl.g:2479:2: ( ruleNumber )
            {
            // InternalMyDsl.g:2479:2: ( ruleNumber )
            // InternalMyDsl.g:2480:3: ruleNumber
            {
             before(grammarAccess.getComparisonAccess().getNum1NumberParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getNum1NumberParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Num1Assignment_1_0_2"


    // $ANTLR start "rule__Comparison__Num2Assignment_1_0_3"
    // InternalMyDsl.g:2489:1: rule__Comparison__Num2Assignment_1_0_3 : ( ruleNumber ) ;
    public final void rule__Comparison__Num2Assignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2493:1: ( ( ruleNumber ) )
            // InternalMyDsl.g:2494:2: ( ruleNumber )
            {
            // InternalMyDsl.g:2494:2: ( ruleNumber )
            // InternalMyDsl.g:2495:3: ruleNumber
            {
             before(grammarAccess.getComparisonAccess().getNum2NumberParserRuleCall_1_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getComparisonAccess().getNum2NumberParserRuleCall_1_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Num2Assignment_1_0_3"


    // $ANTLR start "rule__Trigonometry__TrigAssignment_0"
    // InternalMyDsl.g:2504:1: rule__Trigonometry__TrigAssignment_0 : ( ( '(' ) ) ;
    public final void rule__Trigonometry__TrigAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2508:1: ( ( ( '(' ) ) )
            // InternalMyDsl.g:2509:2: ( ( '(' ) )
            {
            // InternalMyDsl.g:2509:2: ( ( '(' ) )
            // InternalMyDsl.g:2510:3: ( '(' )
            {
             before(grammarAccess.getTrigonometryAccess().getTrigLeftParenthesisKeyword_0_0()); 
            // InternalMyDsl.g:2511:3: ( '(' )
            // InternalMyDsl.g:2512:4: '('
            {
             before(grammarAccess.getTrigonometryAccess().getTrigLeftParenthesisKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getTrigonometryAccess().getTrigLeftParenthesisKeyword_0_0()); 

            }

             after(grammarAccess.getTrigonometryAccess().getTrigLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigonometry__TrigAssignment_0"


    // $ANTLR start "rule__Trigonometry__NumbAssignment_2"
    // InternalMyDsl.g:2523:1: rule__Trigonometry__NumbAssignment_2 : ( ruleNumber ) ;
    public final void rule__Trigonometry__NumbAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2527:1: ( ( ruleNumber ) )
            // InternalMyDsl.g:2528:2: ( ruleNumber )
            {
            // InternalMyDsl.g:2528:2: ( ruleNumber )
            // InternalMyDsl.g:2529:3: ruleNumber
            {
             before(grammarAccess.getTrigonometryAccess().getNumbNumberParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getTrigonometryAccess().getNumbNumberParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Trigonometry__NumbAssignment_2"


    // $ANTLR start "rule__Set__ConsAssignment_2"
    // InternalMyDsl.g:2538:1: rule__Set__ConsAssignment_2 : ( ruleConstant ) ;
    public final void rule__Set__ConsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2542:1: ( ( ruleConstant ) )
            // InternalMyDsl.g:2543:2: ( ruleConstant )
            {
            // InternalMyDsl.g:2543:2: ( ruleConstant )
            // InternalMyDsl.g:2544:3: ruleConstant
            {
             before(grammarAccess.getSetAccess().getConsConstantParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConstant();

            state._fsp--;

             after(grammarAccess.getSetAccess().getConsConstantParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__ConsAssignment_2"


    // $ANTLR start "rule__Set__ExpressionAssignment_3"
    // InternalMyDsl.g:2553:1: rule__Set__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Set__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2557:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2558:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2558:2: ( ruleExpression )
            // InternalMyDsl.g:2559:3: ruleExpression
            {
             before(grammarAccess.getSetAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getSetAccess().getExpressionExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Set__ExpressionAssignment_3"


    // $ANTLR start "rule__Conditional__ConditionAssignment_2"
    // InternalMyDsl.g:2568:1: rule__Conditional__ConditionAssignment_2 : ( ruleComparison ) ;
    public final void rule__Conditional__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2572:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:2573:2: ( ruleComparison )
            {
            // InternalMyDsl.g:2573:2: ( ruleComparison )
            // InternalMyDsl.g:2574:3: ruleComparison
            {
             before(grammarAccess.getConditionalAccess().getConditionComparisonParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getConditionComparisonParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ConditionAssignment_2"


    // $ANTLR start "rule__Conditional__IftrueAssignment_3"
    // InternalMyDsl.g:2583:1: rule__Conditional__IftrueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Conditional__IftrueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2587:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2588:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2588:2: ( ruleExpression )
            // InternalMyDsl.g:2589:3: ruleExpression
            {
             before(grammarAccess.getConditionalAccess().getIftrueExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getIftrueExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__IftrueAssignment_3"


    // $ANTLR start "rule__Conditional__ElseAssignment_4"
    // InternalMyDsl.g:2598:1: rule__Conditional__ElseAssignment_4 : ( ruleExpression ) ;
    public final void rule__Conditional__ElseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2603:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2603:2: ( ruleExpression )
            // InternalMyDsl.g:2604:3: ruleExpression
            {
             before(grammarAccess.getConditionalAccess().getElseExpressionParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getConditionalAccess().getElseExpressionParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Conditional__ElseAssignment_4"


    // $ANTLR start "rule__NestedOperation__NestedOperationAssignment_0"
    // InternalMyDsl.g:2613:1: rule__NestedOperation__NestedOperationAssignment_0 : ( ( '(' ) ) ;
    public final void rule__NestedOperation__NestedOperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( ( ( '(' ) ) )
            // InternalMyDsl.g:2618:2: ( ( '(' ) )
            {
            // InternalMyDsl.g:2618:2: ( ( '(' ) )
            // InternalMyDsl.g:2619:3: ( '(' )
            {
             before(grammarAccess.getNestedOperationAccess().getNestedOperationLeftParenthesisKeyword_0_0()); 
            // InternalMyDsl.g:2620:3: ( '(' )
            // InternalMyDsl.g:2621:4: '('
            {
             before(grammarAccess.getNestedOperationAccess().getNestedOperationLeftParenthesisKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getNestedOperationAccess().getNestedOperationLeftParenthesisKeyword_0_0()); 

            }

             after(grammarAccess.getNestedOperationAccess().getNestedOperationLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__NestedOperationAssignment_0"


    // $ANTLR start "rule__NestedOperation__CalculateAssignment_1"
    // InternalMyDsl.g:2632:1: rule__NestedOperation__CalculateAssignment_1 : ( ruleCalculate ) ;
    public final void rule__NestedOperation__CalculateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2636:1: ( ( ruleCalculate ) )
            // InternalMyDsl.g:2637:2: ( ruleCalculate )
            {
            // InternalMyDsl.g:2637:2: ( ruleCalculate )
            // InternalMyDsl.g:2638:3: ruleCalculate
            {
             before(grammarAccess.getNestedOperationAccess().getCalculateCalculateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCalculate();

            state._fsp--;

             after(grammarAccess.getNestedOperationAccess().getCalculateCalculateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__CalculateAssignment_1"


    // $ANTLR start "rule__NestedOperation__OperationAssignment_2"
    // InternalMyDsl.g:2647:1: rule__NestedOperation__OperationAssignment_2 : ( ruleOperation ) ;
    public final void rule__NestedOperation__OperationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2651:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:2652:2: ( ruleOperation )
            {
            // InternalMyDsl.g:2652:2: ( ruleOperation )
            // InternalMyDsl.g:2653:3: ruleOperation
            {
             before(grammarAccess.getNestedOperationAccess().getOperationOperationParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleOperation();

            state._fsp--;

             after(grammarAccess.getNestedOperationAccess().getOperationOperationParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedOperation__OperationAssignment_2"


    // $ANTLR start "rule__Operation__OperationAssignment_0"
    // InternalMyDsl.g:2662:1: rule__Operation__OperationAssignment_0 : ( ( '(' ) ) ;
    public final void rule__Operation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2666:1: ( ( ( '(' ) ) )
            // InternalMyDsl.g:2667:2: ( ( '(' ) )
            {
            // InternalMyDsl.g:2667:2: ( ( '(' ) )
            // InternalMyDsl.g:2668:3: ( '(' )
            {
             before(grammarAccess.getOperationAccess().getOperationLeftParenthesisKeyword_0_0()); 
            // InternalMyDsl.g:2669:3: ( '(' )
            // InternalMyDsl.g:2670:4: '('
            {
             before(grammarAccess.getOperationAccess().getOperationLeftParenthesisKeyword_0_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOperationLeftParenthesisKeyword_0_0()); 

            }

             after(grammarAccess.getOperationAccess().getOperationLeftParenthesisKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__OperationAssignment_0"


    // $ANTLR start "rule__Operation__CalculateAssignment_1"
    // InternalMyDsl.g:2681:1: rule__Operation__CalculateAssignment_1 : ( ruleCalculate ) ;
    public final void rule__Operation__CalculateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2685:1: ( ( ruleCalculate ) )
            // InternalMyDsl.g:2686:2: ( ruleCalculate )
            {
            // InternalMyDsl.g:2686:2: ( ruleCalculate )
            // InternalMyDsl.g:2687:3: ruleCalculate
            {
             before(grammarAccess.getOperationAccess().getCalculateCalculateParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCalculate();

            state._fsp--;

             after(grammarAccess.getOperationAccess().getCalculateCalculateParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operation__CalculateAssignment_1"


    // $ANTLR start "rule__Calculate__CalculateAssignment_0"
    // InternalMyDsl.g:2696:1: rule__Calculate__CalculateAssignment_0 : ( RULE_OPER ) ;
    public final void rule__Calculate__CalculateAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2700:1: ( ( RULE_OPER ) )
            // InternalMyDsl.g:2701:2: ( RULE_OPER )
            {
            // InternalMyDsl.g:2701:2: ( RULE_OPER )
            // InternalMyDsl.g:2702:3: RULE_OPER
            {
             before(grammarAccess.getCalculateAccess().getCalculateOPERTerminalRuleCall_0_0()); 
            match(input,RULE_OPER,FOLLOW_2); 
             after(grammarAccess.getCalculateAccess().getCalculateOPERTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__CalculateAssignment_0"


    // $ANTLR start "rule__Calculate__NumbAssignment_1"
    // InternalMyDsl.g:2711:1: rule__Calculate__NumbAssignment_1 : ( ruleNumber ) ;
    public final void rule__Calculate__NumbAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2715:1: ( ( ruleNumber ) )
            // InternalMyDsl.g:2716:2: ( ruleNumber )
            {
            // InternalMyDsl.g:2716:2: ( ruleNumber )
            // InternalMyDsl.g:2717:3: ruleNumber
            {
             before(grammarAccess.getCalculateAccess().getNumbNumberParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getCalculateAccess().getNumbNumberParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Calculate__NumbAssignment_1"


    // $ANTLR start "rule__ListNumbers__NumberAssignment_3"
    // InternalMyDsl.g:2726:1: rule__ListNumbers__NumberAssignment_3 : ( ruleNumber ) ;
    public final void rule__ListNumbers__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2730:1: ( ( ruleNumber ) )
            // InternalMyDsl.g:2731:2: ( ruleNumber )
            {
            // InternalMyDsl.g:2731:2: ( ruleNumber )
            // InternalMyDsl.g:2732:3: ruleNumber
            {
             before(grammarAccess.getListNumbersAccess().getNumberNumberParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getListNumbersAccess().getNumberNumberParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListNumbers__NumberAssignment_3"


    // $ANTLR start "rule__ListLength__ListNumbersAssignment_3"
    // InternalMyDsl.g:2741:1: rule__ListLength__ListNumbersAssignment_3 : ( ruleListNumbers ) ;
    public final void rule__ListLength__ListNumbersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2745:1: ( ( ruleListNumbers ) )
            // InternalMyDsl.g:2746:2: ( ruleListNumbers )
            {
            // InternalMyDsl.g:2746:2: ( ruleListNumbers )
            // InternalMyDsl.g:2747:3: ruleListNumbers
            {
             before(grammarAccess.getListLengthAccess().getListNumbersListNumbersParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleListNumbers();

            state._fsp--;

             after(grammarAccess.getListLengthAccess().getListNumbersListNumbersParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ListLength__ListNumbersAssignment_3"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\4\1\uffff\1\13\4\uffff\1\5\3\uffff\2\5\2\uffff";
    static final String dfa_3s = "\1\27\1\uffff\1\35\4\uffff\1\31\3\uffff\2\31\2\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\uffff\1\12\1\5\1\7\1\10\1\uffff\1\4\1\6\1\3\2\uffff\1\11\1\2";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\7\1\1\uffff\1\3\12\uffff\1\2",
            "",
            "\1\11\1\7\5\uffff\5\12\3\uffff\1\4\1\10\1\5\1\6",
            "",
            "",
            "",
            "",
            "\1\13\1\14\20\uffff\1\15\1\uffff\1\16",
            "",
            "",
            "",
            "\1\13\1\14\20\uffff\1\15\1\uffff\1\16",
            "\1\13\1\14\20\uffff\1\15\1\uffff\1\16",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "469:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ConstantAssignment_0 ) ) | ( ( rule__Expression__OperAssignment_1 ) ) | ( ( rule__Expression__CompAssignment_2 ) ) | ( ( rule__Expression__CondAssignment_3 ) ) | ( ( rule__Expression__SetAssignment_4 ) ) | ( ( rule__Expression__TrigAssignment_5 ) ) | ( ( rule__Expression__ListAssignment_6 ) ) | ( ( rule__Expression__ListLengthAssignment_7 ) ) | ( ( rule__Expression__NestedOperationAssignment_8 ) ) | ( ( rule__Expression__CalculateAssignment_9 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000000008017F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000007F0L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000000008017F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000100L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000800010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000000028017F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000062L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000060L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});

}