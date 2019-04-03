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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BOOL", "RULE_INT", "RULE_DOUBLE", "RULE_STRING", "RULE_ID", "RULE_LETTER", "RULE_DIGIT", "RULE_NUMBER", "RULE_OPER", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'<'", "'>'", "'='", "'>='", "'<='", "'!'", "'$'", "'%'", "'&'", "'*'", "'/'", "':'", "'?'", "'~'", "'_'", "'^'", "'.'", "'+'", "'-'", "'('", "'define'", "')'", "'cond'", "'else'", "'set!'", "'if'", "'\\\\s'"
    };
    public static final int T__19=19;
    public static final int T__17=17;
    public static final int RULE_OPER=12;
    public static final int T__18=18;
    public static final int RULE_ID=8;
    public static final int RULE_DIGIT=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=6;
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
    public static final int RULE_BOOL=4;
    public static final int RULE_NUMBER=11;
    public static final int RULE_LETTER=9;
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
    // InternalMyDsl.g:62:1: ruleProgram : ( ( rule__Program__ProgramAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Program__ProgramAssignment )* ) )
            // InternalMyDsl.g:67:2: ( ( rule__Program__ProgramAssignment )* )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Program__ProgramAssignment )* )
            // InternalMyDsl.g:68:3: ( rule__Program__ProgramAssignment )*
            {
             before(grammarAccess.getProgramAccess().getProgramAssignment()); 
            // InternalMyDsl.g:69:3: ( rule__Program__ProgramAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_BOOL && LA1_0<=RULE_LETTER)||LA1_0==36) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:69:4: rule__Program__ProgramAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__ProgramAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getProgramAssignment()); 

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


    // $ANTLR start "entryRuleForm"
    // InternalMyDsl.g:78:1: entryRuleForm : ruleForm EOF ;
    public final void entryRuleForm() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleForm EOF )
            // InternalMyDsl.g:80:1: ruleForm EOF
            {
             before(grammarAccess.getFormRule()); 
            pushFollow(FOLLOW_1);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getFormRule()); 
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
    // $ANTLR end "entryRuleForm"


    // $ANTLR start "ruleForm"
    // InternalMyDsl.g:87:1: ruleForm : ( ( rule__Form__Alternatives ) ) ;
    public final void ruleForm() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Form__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Form__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Form__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Form__Alternatives )
            {
             before(grammarAccess.getFormAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Form__Alternatives )
            // InternalMyDsl.g:94:4: rule__Form__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Form__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFormAccess().getAlternatives()); 

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
    // $ANTLR end "ruleForm"


    // $ANTLR start "entryRuleDefinition"
    // InternalMyDsl.g:103:1: entryRuleDefinition : ruleDefinition EOF ;
    public final void entryRuleDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleDefinition EOF )
            // InternalMyDsl.g:105:1: ruleDefinition EOF
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
    // InternalMyDsl.g:112:1: ruleDefinition : ( ( rule__Definition__VariableDefinitionAssignment ) ) ;
    public final void ruleDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Definition__VariableDefinitionAssignment ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Definition__VariableDefinitionAssignment ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Definition__VariableDefinitionAssignment ) )
            // InternalMyDsl.g:118:3: ( rule__Definition__VariableDefinitionAssignment )
            {
             before(grammarAccess.getDefinitionAccess().getVariableDefinitionAssignment()); 
            // InternalMyDsl.g:119:3: ( rule__Definition__VariableDefinitionAssignment )
            // InternalMyDsl.g:119:4: rule__Definition__VariableDefinitionAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Definition__VariableDefinitionAssignment();

            state._fsp--;


            }

             after(grammarAccess.getDefinitionAccess().getVariableDefinitionAssignment()); 

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


    // $ANTLR start "entryRuleVariableDefinition"
    // InternalMyDsl.g:128:1: entryRuleVariableDefinition : ruleVariableDefinition EOF ;
    public final void entryRuleVariableDefinition() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleVariableDefinition EOF )
            // InternalMyDsl.g:130:1: ruleVariableDefinition EOF
            {
             before(grammarAccess.getVariableDefinitionRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionRule()); 
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
    // $ANTLR end "entryRuleVariableDefinition"


    // $ANTLR start "ruleVariableDefinition"
    // InternalMyDsl.g:137:1: ruleVariableDefinition : ( ( rule__VariableDefinition__Alternatives ) ) ;
    public final void ruleVariableDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__VariableDefinition__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__VariableDefinition__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__VariableDefinition__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__VariableDefinition__Alternatives )
            {
             before(grammarAccess.getVariableDefinitionAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__VariableDefinition__Alternatives )
            // InternalMyDsl.g:144:4: rule__VariableDefinition__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleVariableDefinition"


    // $ANTLR start "entryRuleBody"
    // InternalMyDsl.g:153:1: entryRuleBody : ruleBody EOF ;
    public final void entryRuleBody() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleBody EOF )
            // InternalMyDsl.g:155:1: ruleBody EOF
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
    // InternalMyDsl.g:162:1: ruleBody : ( ( rule__Body__Group__0 ) ) ;
    public final void ruleBody() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Body__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Body__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Body__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Body__Group__0 )
            {
             before(grammarAccess.getBodyAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Body__Group__0 )
            // InternalMyDsl.g:169:4: rule__Body__Group__0
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
    // InternalMyDsl.g:178:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleExpression EOF )
            // InternalMyDsl.g:180:1: ruleExpression EOF
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
    // InternalMyDsl.g:187:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Expression__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Expression__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Expression__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__Expression__Alternatives )
            {
             before(grammarAccess.getExpressionAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__Expression__Alternatives )
            // InternalMyDsl.g:194:4: rule__Expression__Alternatives
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
    // InternalMyDsl.g:203:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleComparison EOF )
            // InternalMyDsl.g:205:1: ruleComparison EOF
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
    // InternalMyDsl.g:212:1: ruleComparison : ( ( rule__Comparison__Group__0 ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Comparison__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Comparison__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Comparison__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Comparison__Group__0 )
            {
             before(grammarAccess.getComparisonAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Comparison__Group__0 )
            // InternalMyDsl.g:219:4: rule__Comparison__Group__0
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


    // $ANTLR start "entryRuleMultipleCondition"
    // InternalMyDsl.g:228:1: entryRuleMultipleCondition : ruleMultipleCondition EOF ;
    public final void entryRuleMultipleCondition() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleMultipleCondition EOF )
            // InternalMyDsl.g:230:1: ruleMultipleCondition EOF
            {
             before(grammarAccess.getMultipleConditionRule()); 
            pushFollow(FOLLOW_1);
            ruleMultipleCondition();

            state._fsp--;

             after(grammarAccess.getMultipleConditionRule()); 
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
    // $ANTLR end "entryRuleMultipleCondition"


    // $ANTLR start "ruleMultipleCondition"
    // InternalMyDsl.g:237:1: ruleMultipleCondition : ( ( rule__MultipleCondition__Group__0 ) ) ;
    public final void ruleMultipleCondition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__MultipleCondition__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__MultipleCondition__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__MultipleCondition__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__MultipleCondition__Group__0 )
            {
             before(grammarAccess.getMultipleConditionAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__MultipleCondition__Group__0 )
            // InternalMyDsl.g:244:4: rule__MultipleCondition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleConditionAccess().getGroup()); 

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
    // $ANTLR end "ruleMultipleCondition"


    // $ANTLR start "entryRuleApplication"
    // InternalMyDsl.g:253:1: entryRuleApplication : ruleApplication EOF ;
    public final void entryRuleApplication() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleApplication EOF )
            // InternalMyDsl.g:255:1: ruleApplication EOF
            {
             before(grammarAccess.getApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getApplicationRule()); 
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
    // $ANTLR end "entryRuleApplication"


    // $ANTLR start "ruleApplication"
    // InternalMyDsl.g:262:1: ruleApplication : ( ( rule__Application__Group__0 ) ) ;
    public final void ruleApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Application__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Application__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Application__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Application__Group__0 )
            {
             before(grammarAccess.getApplicationAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Application__Group__0 )
            // InternalMyDsl.g:269:4: rule__Application__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getGroup()); 

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
    // $ANTLR end "ruleApplication"


    // $ANTLR start "entryRuleSet"
    // InternalMyDsl.g:278:1: entryRuleSet : ruleSet EOF ;
    public final void entryRuleSet() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleSet EOF )
            // InternalMyDsl.g:280:1: ruleSet EOF
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
    // InternalMyDsl.g:287:1: ruleSet : ( ( rule__Set__Group__0 ) ) ;
    public final void ruleSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Set__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Set__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Set__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Set__Group__0 )
            {
             before(grammarAccess.getSetAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Set__Group__0 )
            // InternalMyDsl.g:294:4: rule__Set__Group__0
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
    // InternalMyDsl.g:303:1: entryRuleConditional : ruleConditional EOF ;
    public final void entryRuleConditional() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleConditional EOF )
            // InternalMyDsl.g:305:1: ruleConditional EOF
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
    // InternalMyDsl.g:312:1: ruleConditional : ( ( rule__Conditional__Group__0 ) ) ;
    public final void ruleConditional() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Conditional__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Conditional__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Conditional__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Conditional__Group__0 )
            {
             before(grammarAccess.getConditionalAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Conditional__Group__0 )
            // InternalMyDsl.g:319:4: rule__Conditional__Group__0
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
    // InternalMyDsl.g:328:1: entryRuleConstant : ruleConstant EOF ;
    public final void entryRuleConstant() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleConstant EOF )
            // InternalMyDsl.g:330:1: ruleConstant EOF
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
    // InternalMyDsl.g:337:1: ruleConstant : ( ( rule__Constant__Alternatives ) ) ;
    public final void ruleConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Constant__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Constant__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Constant__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__Constant__Alternatives )
            {
             before(grammarAccess.getConstantAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__Constant__Alternatives )
            // InternalMyDsl.g:344:4: rule__Constant__Alternatives
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


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:353:1: entryRuleOperation : ruleOperation EOF ;
    public final void entryRuleOperation() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleOperation EOF )
            // InternalMyDsl.g:355:1: ruleOperation EOF
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
    // InternalMyDsl.g:362:1: ruleOperation : ( ( rule__Operation__Group__0 ) ) ;
    public final void ruleOperation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Operation__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Operation__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Operation__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Operation__Group__0 )
            {
             before(grammarAccess.getOperationAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Operation__Group__0 )
            // InternalMyDsl.g:369:4: rule__Operation__Group__0
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


    // $ANTLR start "entryRuleInitial"
    // InternalMyDsl.g:378:1: entryRuleInitial : ruleInitial EOF ;
    public final void entryRuleInitial() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleInitial EOF )
            // InternalMyDsl.g:380:1: ruleInitial EOF
            {
             before(grammarAccess.getInitialRule()); 
            pushFollow(FOLLOW_1);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getInitialRule()); 
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
    // $ANTLR end "entryRuleInitial"


    // $ANTLR start "ruleInitial"
    // InternalMyDsl.g:387:1: ruleInitial : ( ( rule__Initial__InitAssignment ) ) ;
    public final void ruleInitial() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Initial__InitAssignment ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Initial__InitAssignment ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Initial__InitAssignment ) )
            // InternalMyDsl.g:393:3: ( rule__Initial__InitAssignment )
            {
             before(grammarAccess.getInitialAccess().getInitAssignment()); 
            // InternalMyDsl.g:394:3: ( rule__Initial__InitAssignment )
            // InternalMyDsl.g:394:4: rule__Initial__InitAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Initial__InitAssignment();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getInitAssignment()); 

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
    // $ANTLR end "ruleInitial"


    // $ANTLR start "entryRuleSubsequent"
    // InternalMyDsl.g:403:1: entryRuleSubsequent : ruleSubsequent EOF ;
    public final void entryRuleSubsequent() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleSubsequent EOF )
            // InternalMyDsl.g:405:1: ruleSubsequent EOF
            {
             before(grammarAccess.getSubsequentRule()); 
            pushFollow(FOLLOW_1);
            ruleSubsequent();

            state._fsp--;

             after(grammarAccess.getSubsequentRule()); 
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
    // $ANTLR end "entryRuleSubsequent"


    // $ANTLR start "ruleSubsequent"
    // InternalMyDsl.g:412:1: ruleSubsequent : ( ( rule__Subsequent__Group__0 ) ) ;
    public final void ruleSubsequent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Subsequent__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Subsequent__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Subsequent__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Subsequent__Group__0 )
            {
             before(grammarAccess.getSubsequentAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Subsequent__Group__0 )
            // InternalMyDsl.g:419:4: rule__Subsequent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Subsequent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSubsequentAccess().getGroup()); 

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
    // $ANTLR end "ruleSubsequent"


    // $ANTLR start "rule__Form__Alternatives"
    // InternalMyDsl.g:427:1: rule__Form__Alternatives : ( ( ( rule__Form__DefinitionAssignment_0 ) ) | ( ( rule__Form__ExpressionAssignment_1 ) ) );
    public final void rule__Form__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:431:1: ( ( ( rule__Form__DefinitionAssignment_0 ) ) | ( ( rule__Form__ExpressionAssignment_1 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==36) ) {
                int LA2_1 = input.LA(2);

                if ( ((LA2_1>=RULE_BOOL && LA2_1<=RULE_LETTER)||LA2_1==RULE_OPER||LA2_1==36||LA2_1==39||(LA2_1>=41 && LA2_1<=42)) ) {
                    alt2=2;
                }
                else if ( (LA2_1==37) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
            }
            else if ( ((LA2_0>=RULE_BOOL && LA2_0<=RULE_LETTER)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:432:2: ( ( rule__Form__DefinitionAssignment_0 ) )
                    {
                    // InternalMyDsl.g:432:2: ( ( rule__Form__DefinitionAssignment_0 ) )
                    // InternalMyDsl.g:433:3: ( rule__Form__DefinitionAssignment_0 )
                    {
                     before(grammarAccess.getFormAccess().getDefinitionAssignment_0()); 
                    // InternalMyDsl.g:434:3: ( rule__Form__DefinitionAssignment_0 )
                    // InternalMyDsl.g:434:4: rule__Form__DefinitionAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__DefinitionAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormAccess().getDefinitionAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:438:2: ( ( rule__Form__ExpressionAssignment_1 ) )
                    {
                    // InternalMyDsl.g:438:2: ( ( rule__Form__ExpressionAssignment_1 ) )
                    // InternalMyDsl.g:439:3: ( rule__Form__ExpressionAssignment_1 )
                    {
                     before(grammarAccess.getFormAccess().getExpressionAssignment_1()); 
                    // InternalMyDsl.g:440:3: ( rule__Form__ExpressionAssignment_1 )
                    // InternalMyDsl.g:440:4: rule__Form__ExpressionAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Form__ExpressionAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFormAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end "rule__Form__Alternatives"


    // $ANTLR start "rule__VariableDefinition__Alternatives"
    // InternalMyDsl.g:448:1: rule__VariableDefinition__Alternatives : ( ( ( rule__VariableDefinition__Group_0__0 ) ) | ( ( rule__VariableDefinition__Group_1__0 ) ) | ( ( rule__VariableDefinition__Group_2__0 ) ) );
    public final void rule__VariableDefinition__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:452:1: ( ( ( rule__VariableDefinition__Group_0__0 ) ) | ( ( rule__VariableDefinition__Group_1__0 ) ) | ( ( rule__VariableDefinition__Group_2__0 ) ) )
            int alt3=3;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:453:2: ( ( rule__VariableDefinition__Group_0__0 ) )
                    {
                    // InternalMyDsl.g:453:2: ( ( rule__VariableDefinition__Group_0__0 ) )
                    // InternalMyDsl.g:454:3: ( rule__VariableDefinition__Group_0__0 )
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getGroup_0()); 
                    // InternalMyDsl.g:455:3: ( rule__VariableDefinition__Group_0__0 )
                    // InternalMyDsl.g:455:4: rule__VariableDefinition__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDefinition__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDefinitionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:459:2: ( ( rule__VariableDefinition__Group_1__0 ) )
                    {
                    // InternalMyDsl.g:459:2: ( ( rule__VariableDefinition__Group_1__0 ) )
                    // InternalMyDsl.g:460:3: ( rule__VariableDefinition__Group_1__0 )
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getGroup_1()); 
                    // InternalMyDsl.g:461:3: ( rule__VariableDefinition__Group_1__0 )
                    // InternalMyDsl.g:461:4: rule__VariableDefinition__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDefinition__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDefinitionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:465:2: ( ( rule__VariableDefinition__Group_2__0 ) )
                    {
                    // InternalMyDsl.g:465:2: ( ( rule__VariableDefinition__Group_2__0 ) )
                    // InternalMyDsl.g:466:3: ( rule__VariableDefinition__Group_2__0 )
                    {
                     before(grammarAccess.getVariableDefinitionAccess().getGroup_2()); 
                    // InternalMyDsl.g:467:3: ( rule__VariableDefinition__Group_2__0 )
                    // InternalMyDsl.g:467:4: rule__VariableDefinition__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__VariableDefinition__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getVariableDefinitionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__VariableDefinition__Alternatives"


    // $ANTLR start "rule__Expression__Alternatives"
    // InternalMyDsl.g:475:1: rule__Expression__Alternatives : ( ( ( rule__Expression__ConstantAssignment_0 ) ) | ( ( rule__Expression__OperAssignment_1 ) ) | ( ( rule__Expression__CondAssignment_2 ) ) | ( ( rule__Expression__SetAssignment_3 ) ) | ( ( rule__Expression__AppAssignment_4 ) ) | ( ( rule__Expression__MultAssignment_5 ) ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:479:1: ( ( ( rule__Expression__ConstantAssignment_0 ) ) | ( ( rule__Expression__OperAssignment_1 ) ) | ( ( rule__Expression__CondAssignment_2 ) ) | ( ( rule__Expression__SetAssignment_3 ) ) | ( ( rule__Expression__AppAssignment_4 ) ) | ( ( rule__Expression__MultAssignment_5 ) ) )
            int alt4=6;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_BOOL && LA4_0<=RULE_LETTER)) ) {
                alt4=1;
            }
            else if ( (LA4_0==36) ) {
                switch ( input.LA(2) ) {
                case 42:
                    {
                    alt4=3;
                    }
                    break;
                case RULE_BOOL:
                case RULE_INT:
                case RULE_DOUBLE:
                case RULE_STRING:
                case RULE_ID:
                case RULE_LETTER:
                case 36:
                    {
                    alt4=5;
                    }
                    break;
                case RULE_OPER:
                    {
                    alt4=2;
                    }
                    break;
                case 39:
                    {
                    alt4=6;
                    }
                    break;
                case 41:
                    {
                    alt4=4;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:480:2: ( ( rule__Expression__ConstantAssignment_0 ) )
                    {
                    // InternalMyDsl.g:480:2: ( ( rule__Expression__ConstantAssignment_0 ) )
                    // InternalMyDsl.g:481:3: ( rule__Expression__ConstantAssignment_0 )
                    {
                     before(grammarAccess.getExpressionAccess().getConstantAssignment_0()); 
                    // InternalMyDsl.g:482:3: ( rule__Expression__ConstantAssignment_0 )
                    // InternalMyDsl.g:482:4: rule__Expression__ConstantAssignment_0
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
                    // InternalMyDsl.g:486:2: ( ( rule__Expression__OperAssignment_1 ) )
                    {
                    // InternalMyDsl.g:486:2: ( ( rule__Expression__OperAssignment_1 ) )
                    // InternalMyDsl.g:487:3: ( rule__Expression__OperAssignment_1 )
                    {
                     before(grammarAccess.getExpressionAccess().getOperAssignment_1()); 
                    // InternalMyDsl.g:488:3: ( rule__Expression__OperAssignment_1 )
                    // InternalMyDsl.g:488:4: rule__Expression__OperAssignment_1
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
                    // InternalMyDsl.g:492:2: ( ( rule__Expression__CondAssignment_2 ) )
                    {
                    // InternalMyDsl.g:492:2: ( ( rule__Expression__CondAssignment_2 ) )
                    // InternalMyDsl.g:493:3: ( rule__Expression__CondAssignment_2 )
                    {
                     before(grammarAccess.getExpressionAccess().getCondAssignment_2()); 
                    // InternalMyDsl.g:494:3: ( rule__Expression__CondAssignment_2 )
                    // InternalMyDsl.g:494:4: rule__Expression__CondAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__CondAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getCondAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:498:2: ( ( rule__Expression__SetAssignment_3 ) )
                    {
                    // InternalMyDsl.g:498:2: ( ( rule__Expression__SetAssignment_3 ) )
                    // InternalMyDsl.g:499:3: ( rule__Expression__SetAssignment_3 )
                    {
                     before(grammarAccess.getExpressionAccess().getSetAssignment_3()); 
                    // InternalMyDsl.g:500:3: ( rule__Expression__SetAssignment_3 )
                    // InternalMyDsl.g:500:4: rule__Expression__SetAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__SetAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getSetAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:504:2: ( ( rule__Expression__AppAssignment_4 ) )
                    {
                    // InternalMyDsl.g:504:2: ( ( rule__Expression__AppAssignment_4 ) )
                    // InternalMyDsl.g:505:3: ( rule__Expression__AppAssignment_4 )
                    {
                     before(grammarAccess.getExpressionAccess().getAppAssignment_4()); 
                    // InternalMyDsl.g:506:3: ( rule__Expression__AppAssignment_4 )
                    // InternalMyDsl.g:506:4: rule__Expression__AppAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__AppAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getAppAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:510:2: ( ( rule__Expression__MultAssignment_5 ) )
                    {
                    // InternalMyDsl.g:510:2: ( ( rule__Expression__MultAssignment_5 ) )
                    // InternalMyDsl.g:511:3: ( rule__Expression__MultAssignment_5 )
                    {
                     before(grammarAccess.getExpressionAccess().getMultAssignment_5()); 
                    // InternalMyDsl.g:512:3: ( rule__Expression__MultAssignment_5 )
                    // InternalMyDsl.g:512:4: rule__Expression__MultAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__Expression__MultAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getExpressionAccess().getMultAssignment_5()); 

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
    // InternalMyDsl.g:520:1: rule__Comparison__Alternatives_1 : ( ( ( rule__Comparison__Group_1_0__0 ) ) | ( RULE_BOOL ) );
    public final void rule__Comparison__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:524:1: ( ( ( rule__Comparison__Group_1_0__0 ) ) | ( RULE_BOOL ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==36) ) {
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
                    // InternalMyDsl.g:525:2: ( ( rule__Comparison__Group_1_0__0 ) )
                    {
                    // InternalMyDsl.g:525:2: ( ( rule__Comparison__Group_1_0__0 ) )
                    // InternalMyDsl.g:526:3: ( rule__Comparison__Group_1_0__0 )
                    {
                     before(grammarAccess.getComparisonAccess().getGroup_1_0()); 
                    // InternalMyDsl.g:527:3: ( rule__Comparison__Group_1_0__0 )
                    // InternalMyDsl.g:527:4: rule__Comparison__Group_1_0__0
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
                    // InternalMyDsl.g:531:2: ( RULE_BOOL )
                    {
                    // InternalMyDsl.g:531:2: ( RULE_BOOL )
                    // InternalMyDsl.g:532:3: RULE_BOOL
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
    // InternalMyDsl.g:541:1: rule__Comparison__Alternatives_1_0_1 : ( ( '<' ) | ( '>' ) | ( '=' ) | ( '>=' ) | ( '<=' ) );
    public final void rule__Comparison__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:545:1: ( ( '<' ) | ( '>' ) | ( '=' ) | ( '>=' ) | ( '<=' ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 18:
                {
                alt6=2;
                }
                break;
            case 19:
                {
                alt6=3;
                }
                break;
            case 20:
                {
                alt6=4;
                }
                break;
            case 21:
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
                    // InternalMyDsl.g:546:2: ( '<' )
                    {
                    // InternalMyDsl.g:546:2: ( '<' )
                    // InternalMyDsl.g:547:3: '<'
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1_0()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getLessThanSignKeyword_1_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:552:2: ( '>' )
                    {
                    // InternalMyDsl.g:552:2: ( '>' )
                    // InternalMyDsl.g:553:3: '>'
                    {
                     before(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_1()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getGreaterThanSignKeyword_1_0_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:558:2: ( '=' )
                    {
                    // InternalMyDsl.g:558:2: ( '=' )
                    // InternalMyDsl.g:559:3: '='
                    {
                     before(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0_1_2()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getEqualsSignKeyword_1_0_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:564:2: ( '>=' )
                    {
                    // InternalMyDsl.g:564:2: ( '>=' )
                    // InternalMyDsl.g:565:3: '>='
                    {
                     before(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_1_3()); 
                    match(input,20,FOLLOW_2); 
                     after(grammarAccess.getComparisonAccess().getGreaterThanSignEqualsSignKeyword_1_0_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:570:2: ( '<=' )
                    {
                    // InternalMyDsl.g:570:2: ( '<=' )
                    // InternalMyDsl.g:571:3: '<='
                    {
                     before(grammarAccess.getComparisonAccess().getLessThanSignEqualsSignKeyword_1_0_1_4()); 
                    match(input,21,FOLLOW_2); 
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
    // InternalMyDsl.g:580:1: rule__Constant__Alternatives : ( ( RULE_BOOL ) | ( RULE_INT ) | ( RULE_DOUBLE ) | ( RULE_STRING ) | ( RULE_ID ) | ( RULE_LETTER ) );
    public final void rule__Constant__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:584:1: ( ( RULE_BOOL ) | ( RULE_INT ) | ( RULE_DOUBLE ) | ( RULE_STRING ) | ( RULE_ID ) | ( RULE_LETTER ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case RULE_BOOL:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:585:2: ( RULE_BOOL )
                    {
                    // InternalMyDsl.g:585:2: ( RULE_BOOL )
                    // InternalMyDsl.g:586:3: RULE_BOOL
                    {
                     before(grammarAccess.getConstantAccess().getBOOLTerminalRuleCall_0()); 
                    match(input,RULE_BOOL,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getBOOLTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:591:2: ( RULE_INT )
                    {
                    // InternalMyDsl.g:591:2: ( RULE_INT )
                    // InternalMyDsl.g:592:3: RULE_INT
                    {
                     before(grammarAccess.getConstantAccess().getINTTerminalRuleCall_1()); 
                    match(input,RULE_INT,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getINTTerminalRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:597:2: ( RULE_DOUBLE )
                    {
                    // InternalMyDsl.g:597:2: ( RULE_DOUBLE )
                    // InternalMyDsl.g:598:3: RULE_DOUBLE
                    {
                     before(grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_2()); 
                    match(input,RULE_DOUBLE,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getDOUBLETerminalRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:603:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:603:2: ( RULE_STRING )
                    // InternalMyDsl.g:604:3: RULE_STRING
                    {
                     before(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_3()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getSTRINGTerminalRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:609:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:609:2: ( RULE_ID )
                    // InternalMyDsl.g:610:3: RULE_ID
                    {
                     before(grammarAccess.getConstantAccess().getIDTerminalRuleCall_4()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getIDTerminalRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:615:2: ( RULE_LETTER )
                    {
                    // InternalMyDsl.g:615:2: ( RULE_LETTER )
                    // InternalMyDsl.g:616:3: RULE_LETTER
                    {
                     before(grammarAccess.getConstantAccess().getLETTERTerminalRuleCall_5()); 
                    match(input,RULE_LETTER,FOLLOW_2); 
                     after(grammarAccess.getConstantAccess().getLETTERTerminalRuleCall_5()); 

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


    // $ANTLR start "rule__Initial__InitAlternatives_0"
    // InternalMyDsl.g:625:1: rule__Initial__InitAlternatives_0 : ( ( RULE_LETTER ) | ( '!' ) | ( '$' ) | ( '%' ) | ( '&' ) | ( '*' ) | ( '/' ) | ( ':' ) | ( '<' ) | ( '=' ) | ( '>' ) | ( '?' ) | ( '~' ) | ( '_' ) | ( '^' ) );
    public final void rule__Initial__InitAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:629:1: ( ( RULE_LETTER ) | ( '!' ) | ( '$' ) | ( '%' ) | ( '&' ) | ( '*' ) | ( '/' ) | ( ':' ) | ( '<' ) | ( '=' ) | ( '>' ) | ( '?' ) | ( '~' ) | ( '_' ) | ( '^' ) )
            int alt8=15;
            switch ( input.LA(1) ) {
            case RULE_LETTER:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case 23:
                {
                alt8=3;
                }
                break;
            case 24:
                {
                alt8=4;
                }
                break;
            case 25:
                {
                alt8=5;
                }
                break;
            case 26:
                {
                alt8=6;
                }
                break;
            case 27:
                {
                alt8=7;
                }
                break;
            case 28:
                {
                alt8=8;
                }
                break;
            case 17:
                {
                alt8=9;
                }
                break;
            case 19:
                {
                alt8=10;
                }
                break;
            case 18:
                {
                alt8=11;
                }
                break;
            case 29:
                {
                alt8=12;
                }
                break;
            case 30:
                {
                alt8=13;
                }
                break;
            case 31:
                {
                alt8=14;
                }
                break;
            case 32:
                {
                alt8=15;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:630:2: ( RULE_LETTER )
                    {
                    // InternalMyDsl.g:630:2: ( RULE_LETTER )
                    // InternalMyDsl.g:631:3: RULE_LETTER
                    {
                     before(grammarAccess.getInitialAccess().getInitLETTERTerminalRuleCall_0_0()); 
                    match(input,RULE_LETTER,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitLETTERTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:636:2: ( '!' )
                    {
                    // InternalMyDsl.g:636:2: ( '!' )
                    // InternalMyDsl.g:637:3: '!'
                    {
                     before(grammarAccess.getInitialAccess().getInitExclamationMarkKeyword_0_1()); 
                    match(input,22,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitExclamationMarkKeyword_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:642:2: ( '$' )
                    {
                    // InternalMyDsl.g:642:2: ( '$' )
                    // InternalMyDsl.g:643:3: '$'
                    {
                     before(grammarAccess.getInitialAccess().getInitDollarSignKeyword_0_2()); 
                    match(input,23,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitDollarSignKeyword_0_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:648:2: ( '%' )
                    {
                    // InternalMyDsl.g:648:2: ( '%' )
                    // InternalMyDsl.g:649:3: '%'
                    {
                     before(grammarAccess.getInitialAccess().getInitPercentSignKeyword_0_3()); 
                    match(input,24,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitPercentSignKeyword_0_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:654:2: ( '&' )
                    {
                    // InternalMyDsl.g:654:2: ( '&' )
                    // InternalMyDsl.g:655:3: '&'
                    {
                     before(grammarAccess.getInitialAccess().getInitAmpersandKeyword_0_4()); 
                    match(input,25,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitAmpersandKeyword_0_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:660:2: ( '*' )
                    {
                    // InternalMyDsl.g:660:2: ( '*' )
                    // InternalMyDsl.g:661:3: '*'
                    {
                     before(grammarAccess.getInitialAccess().getInitAsteriskKeyword_0_5()); 
                    match(input,26,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitAsteriskKeyword_0_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:666:2: ( '/' )
                    {
                    // InternalMyDsl.g:666:2: ( '/' )
                    // InternalMyDsl.g:667:3: '/'
                    {
                     before(grammarAccess.getInitialAccess().getInitSolidusKeyword_0_6()); 
                    match(input,27,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitSolidusKeyword_0_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:672:2: ( ':' )
                    {
                    // InternalMyDsl.g:672:2: ( ':' )
                    // InternalMyDsl.g:673:3: ':'
                    {
                     before(grammarAccess.getInitialAccess().getInitColonKeyword_0_7()); 
                    match(input,28,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitColonKeyword_0_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:678:2: ( '<' )
                    {
                    // InternalMyDsl.g:678:2: ( '<' )
                    // InternalMyDsl.g:679:3: '<'
                    {
                     before(grammarAccess.getInitialAccess().getInitLessThanSignKeyword_0_8()); 
                    match(input,17,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitLessThanSignKeyword_0_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:684:2: ( '=' )
                    {
                    // InternalMyDsl.g:684:2: ( '=' )
                    // InternalMyDsl.g:685:3: '='
                    {
                     before(grammarAccess.getInitialAccess().getInitEqualsSignKeyword_0_9()); 
                    match(input,19,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitEqualsSignKeyword_0_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:690:2: ( '>' )
                    {
                    // InternalMyDsl.g:690:2: ( '>' )
                    // InternalMyDsl.g:691:3: '>'
                    {
                     before(grammarAccess.getInitialAccess().getInitGreaterThanSignKeyword_0_10()); 
                    match(input,18,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitGreaterThanSignKeyword_0_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:696:2: ( '?' )
                    {
                    // InternalMyDsl.g:696:2: ( '?' )
                    // InternalMyDsl.g:697:3: '?'
                    {
                     before(grammarAccess.getInitialAccess().getInitQuestionMarkKeyword_0_11()); 
                    match(input,29,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitQuestionMarkKeyword_0_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:702:2: ( '~' )
                    {
                    // InternalMyDsl.g:702:2: ( '~' )
                    // InternalMyDsl.g:703:3: '~'
                    {
                     before(grammarAccess.getInitialAccess().getInitTildeKeyword_0_12()); 
                    match(input,30,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitTildeKeyword_0_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:708:2: ( '_' )
                    {
                    // InternalMyDsl.g:708:2: ( '_' )
                    // InternalMyDsl.g:709:3: '_'
                    {
                     before(grammarAccess.getInitialAccess().getInit_Keyword_0_13()); 
                    match(input,31,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInit_Keyword_0_13()); 

                    }


                    }
                    break;
                case 15 :
                    // InternalMyDsl.g:714:2: ( '^' )
                    {
                    // InternalMyDsl.g:714:2: ( '^' )
                    // InternalMyDsl.g:715:3: '^'
                    {
                     before(grammarAccess.getInitialAccess().getInitCircumflexAccentKeyword_0_14()); 
                    match(input,32,FOLLOW_2); 
                     after(grammarAccess.getInitialAccess().getInitCircumflexAccentKeyword_0_14()); 

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
    // $ANTLR end "rule__Initial__InitAlternatives_0"


    // $ANTLR start "rule__Subsequent__Alternatives_1"
    // InternalMyDsl.g:724:1: rule__Subsequent__Alternatives_1 : ( ( ( rule__Subsequent__InitAssignment_1_0 ) ) | ( RULE_DIGIT ) | ( '.' ) | ( '+' ) | ( '-' ) );
    public final void rule__Subsequent__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:728:1: ( ( ( rule__Subsequent__InitAssignment_1_0 ) ) | ( RULE_DIGIT ) | ( '.' ) | ( '+' ) | ( '-' ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case RULE_LETTER:
            case 17:
            case 18:
            case 19:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                {
                alt9=1;
                }
                break;
            case RULE_DIGIT:
                {
                alt9=2;
                }
                break;
            case 33:
                {
                alt9=3;
                }
                break;
            case 34:
                {
                alt9=4;
                }
                break;
            case 35:
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
                    // InternalMyDsl.g:729:2: ( ( rule__Subsequent__InitAssignment_1_0 ) )
                    {
                    // InternalMyDsl.g:729:2: ( ( rule__Subsequent__InitAssignment_1_0 ) )
                    // InternalMyDsl.g:730:3: ( rule__Subsequent__InitAssignment_1_0 )
                    {
                     before(grammarAccess.getSubsequentAccess().getInitAssignment_1_0()); 
                    // InternalMyDsl.g:731:3: ( rule__Subsequent__InitAssignment_1_0 )
                    // InternalMyDsl.g:731:4: rule__Subsequent__InitAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Subsequent__InitAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubsequentAccess().getInitAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:735:2: ( RULE_DIGIT )
                    {
                    // InternalMyDsl.g:735:2: ( RULE_DIGIT )
                    // InternalMyDsl.g:736:3: RULE_DIGIT
                    {
                     before(grammarAccess.getSubsequentAccess().getDIGITTerminalRuleCall_1_1()); 
                    match(input,RULE_DIGIT,FOLLOW_2); 
                     after(grammarAccess.getSubsequentAccess().getDIGITTerminalRuleCall_1_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:741:2: ( '.' )
                    {
                    // InternalMyDsl.g:741:2: ( '.' )
                    // InternalMyDsl.g:742:3: '.'
                    {
                     before(grammarAccess.getSubsequentAccess().getFullStopKeyword_1_2()); 
                    match(input,33,FOLLOW_2); 
                     after(grammarAccess.getSubsequentAccess().getFullStopKeyword_1_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:747:2: ( '+' )
                    {
                    // InternalMyDsl.g:747:2: ( '+' )
                    // InternalMyDsl.g:748:3: '+'
                    {
                     before(grammarAccess.getSubsequentAccess().getPlusSignKeyword_1_3()); 
                    match(input,34,FOLLOW_2); 
                     after(grammarAccess.getSubsequentAccess().getPlusSignKeyword_1_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:753:2: ( '-' )
                    {
                    // InternalMyDsl.g:753:2: ( '-' )
                    // InternalMyDsl.g:754:3: '-'
                    {
                     before(grammarAccess.getSubsequentAccess().getHyphenMinusKeyword_1_4()); 
                    match(input,35,FOLLOW_2); 
                     after(grammarAccess.getSubsequentAccess().getHyphenMinusKeyword_1_4()); 

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
    // $ANTLR end "rule__Subsequent__Alternatives_1"


    // $ANTLR start "rule__VariableDefinition__Group_0__0"
    // InternalMyDsl.g:763:1: rule__VariableDefinition__Group_0__0 : rule__VariableDefinition__Group_0__0__Impl rule__VariableDefinition__Group_0__1 ;
    public final void rule__VariableDefinition__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:767:1: ( rule__VariableDefinition__Group_0__0__Impl rule__VariableDefinition__Group_0__1 )
            // InternalMyDsl.g:768:2: rule__VariableDefinition__Group_0__0__Impl rule__VariableDefinition__Group_0__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableDefinition__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_0__1();

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
    // $ANTLR end "rule__VariableDefinition__Group_0__0"


    // $ANTLR start "rule__VariableDefinition__Group_0__0__Impl"
    // InternalMyDsl.g:775:1: rule__VariableDefinition__Group_0__0__Impl : ( '(' ) ;
    public final void rule__VariableDefinition__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:779:1: ( ( '(' ) )
            // InternalMyDsl.g:780:1: ( '(' )
            {
            // InternalMyDsl.g:780:1: ( '(' )
            // InternalMyDsl.g:781:2: '('
            {
             before(grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_0_0()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_0__0__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_0__1"
    // InternalMyDsl.g:790:1: rule__VariableDefinition__Group_0__1 : rule__VariableDefinition__Group_0__1__Impl rule__VariableDefinition__Group_0__2 ;
    public final void rule__VariableDefinition__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:794:1: ( rule__VariableDefinition__Group_0__1__Impl rule__VariableDefinition__Group_0__2 )
            // InternalMyDsl.g:795:2: rule__VariableDefinition__Group_0__1__Impl rule__VariableDefinition__Group_0__2
            {
            pushFollow(FOLLOW_5);
            rule__VariableDefinition__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_0__2();

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
    // $ANTLR end "rule__VariableDefinition__Group_0__1"


    // $ANTLR start "rule__VariableDefinition__Group_0__1__Impl"
    // InternalMyDsl.g:802:1: rule__VariableDefinition__Group_0__1__Impl : ( 'define' ) ;
    public final void rule__VariableDefinition__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:806:1: ( ( 'define' ) )
            // InternalMyDsl.g:807:1: ( 'define' )
            {
            // InternalMyDsl.g:807:1: ( 'define' )
            // InternalMyDsl.g:808:2: 'define'
            {
             before(grammarAccess.getVariableDefinitionAccess().getDefineKeyword_0_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getDefineKeyword_0_1()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_0__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_0__2"
    // InternalMyDsl.g:817:1: rule__VariableDefinition__Group_0__2 : rule__VariableDefinition__Group_0__2__Impl rule__VariableDefinition__Group_0__3 ;
    public final void rule__VariableDefinition__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:821:1: ( rule__VariableDefinition__Group_0__2__Impl rule__VariableDefinition__Group_0__3 )
            // InternalMyDsl.g:822:2: rule__VariableDefinition__Group_0__2__Impl rule__VariableDefinition__Group_0__3
            {
            pushFollow(FOLLOW_6);
            rule__VariableDefinition__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_0__3();

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
    // $ANTLR end "rule__VariableDefinition__Group_0__2"


    // $ANTLR start "rule__VariableDefinition__Group_0__2__Impl"
    // InternalMyDsl.g:829:1: rule__VariableDefinition__Group_0__2__Impl : ( ( rule__VariableDefinition__VariableAssignment_0_2 ) ) ;
    public final void rule__VariableDefinition__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:833:1: ( ( ( rule__VariableDefinition__VariableAssignment_0_2 ) ) )
            // InternalMyDsl.g:834:1: ( ( rule__VariableDefinition__VariableAssignment_0_2 ) )
            {
            // InternalMyDsl.g:834:1: ( ( rule__VariableDefinition__VariableAssignment_0_2 ) )
            // InternalMyDsl.g:835:2: ( rule__VariableDefinition__VariableAssignment_0_2 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableAssignment_0_2()); 
            // InternalMyDsl.g:836:2: ( rule__VariableDefinition__VariableAssignment_0_2 )
            // InternalMyDsl.g:836:3: rule__VariableDefinition__VariableAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__VariableAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getVariableAssignment_0_2()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_0__2__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_0__3"
    // InternalMyDsl.g:844:1: rule__VariableDefinition__Group_0__3 : rule__VariableDefinition__Group_0__3__Impl rule__VariableDefinition__Group_0__4 ;
    public final void rule__VariableDefinition__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:848:1: ( rule__VariableDefinition__Group_0__3__Impl rule__VariableDefinition__Group_0__4 )
            // InternalMyDsl.g:849:2: rule__VariableDefinition__Group_0__3__Impl rule__VariableDefinition__Group_0__4
            {
            pushFollow(FOLLOW_7);
            rule__VariableDefinition__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_0__4();

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
    // $ANTLR end "rule__VariableDefinition__Group_0__3"


    // $ANTLR start "rule__VariableDefinition__Group_0__3__Impl"
    // InternalMyDsl.g:856:1: rule__VariableDefinition__Group_0__3__Impl : ( ( rule__VariableDefinition__ExpressionAssignment_0_3 ) ) ;
    public final void rule__VariableDefinition__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:860:1: ( ( ( rule__VariableDefinition__ExpressionAssignment_0_3 ) ) )
            // InternalMyDsl.g:861:1: ( ( rule__VariableDefinition__ExpressionAssignment_0_3 ) )
            {
            // InternalMyDsl.g:861:1: ( ( rule__VariableDefinition__ExpressionAssignment_0_3 ) )
            // InternalMyDsl.g:862:2: ( rule__VariableDefinition__ExpressionAssignment_0_3 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getExpressionAssignment_0_3()); 
            // InternalMyDsl.g:863:2: ( rule__VariableDefinition__ExpressionAssignment_0_3 )
            // InternalMyDsl.g:863:3: rule__VariableDefinition__ExpressionAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__ExpressionAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getExpressionAssignment_0_3()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_0__3__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_0__4"
    // InternalMyDsl.g:871:1: rule__VariableDefinition__Group_0__4 : rule__VariableDefinition__Group_0__4__Impl ;
    public final void rule__VariableDefinition__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:875:1: ( rule__VariableDefinition__Group_0__4__Impl )
            // InternalMyDsl.g:876:2: rule__VariableDefinition__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_0__4__Impl();

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
    // $ANTLR end "rule__VariableDefinition__Group_0__4"


    // $ANTLR start "rule__VariableDefinition__Group_0__4__Impl"
    // InternalMyDsl.g:882:1: rule__VariableDefinition__Group_0__4__Impl : ( ')' ) ;
    public final void rule__VariableDefinition__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:886:1: ( ( ')' ) )
            // InternalMyDsl.g:887:1: ( ')' )
            {
            // InternalMyDsl.g:887:1: ( ')' )
            // InternalMyDsl.g:888:2: ')'
            {
             before(grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_0_4()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_0_4()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_0__4__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__0"
    // InternalMyDsl.g:898:1: rule__VariableDefinition__Group_1__0 : rule__VariableDefinition__Group_1__0__Impl rule__VariableDefinition__Group_1__1 ;
    public final void rule__VariableDefinition__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:902:1: ( rule__VariableDefinition__Group_1__0__Impl rule__VariableDefinition__Group_1__1 )
            // InternalMyDsl.g:903:2: rule__VariableDefinition__Group_1__0__Impl rule__VariableDefinition__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableDefinition__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__1();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__0"


    // $ANTLR start "rule__VariableDefinition__Group_1__0__Impl"
    // InternalMyDsl.g:910:1: rule__VariableDefinition__Group_1__0__Impl : ( '(' ) ;
    public final void rule__VariableDefinition__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:914:1: ( ( '(' ) )
            // InternalMyDsl.g:915:1: ( '(' )
            {
            // InternalMyDsl.g:915:1: ( '(' )
            // InternalMyDsl.g:916:2: '('
            {
             before(grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__0__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__1"
    // InternalMyDsl.g:925:1: rule__VariableDefinition__Group_1__1 : rule__VariableDefinition__Group_1__1__Impl rule__VariableDefinition__Group_1__2 ;
    public final void rule__VariableDefinition__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:929:1: ( rule__VariableDefinition__Group_1__1__Impl rule__VariableDefinition__Group_1__2 )
            // InternalMyDsl.g:930:2: rule__VariableDefinition__Group_1__1__Impl rule__VariableDefinition__Group_1__2
            {
            pushFollow(FOLLOW_8);
            rule__VariableDefinition__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__2();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__1"


    // $ANTLR start "rule__VariableDefinition__Group_1__1__Impl"
    // InternalMyDsl.g:937:1: rule__VariableDefinition__Group_1__1__Impl : ( 'define' ) ;
    public final void rule__VariableDefinition__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:941:1: ( ( 'define' ) )
            // InternalMyDsl.g:942:1: ( 'define' )
            {
            // InternalMyDsl.g:942:1: ( 'define' )
            // InternalMyDsl.g:943:2: 'define'
            {
             before(grammarAccess.getVariableDefinitionAccess().getDefineKeyword_1_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getDefineKeyword_1_1()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__2"
    // InternalMyDsl.g:952:1: rule__VariableDefinition__Group_1__2 : rule__VariableDefinition__Group_1__2__Impl rule__VariableDefinition__Group_1__3 ;
    public final void rule__VariableDefinition__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:956:1: ( rule__VariableDefinition__Group_1__2__Impl rule__VariableDefinition__Group_1__3 )
            // InternalMyDsl.g:957:2: rule__VariableDefinition__Group_1__2__Impl rule__VariableDefinition__Group_1__3
            {
            pushFollow(FOLLOW_5);
            rule__VariableDefinition__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__3();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__2"


    // $ANTLR start "rule__VariableDefinition__Group_1__2__Impl"
    // InternalMyDsl.g:964:1: rule__VariableDefinition__Group_1__2__Impl : ( '(' ) ;
    public final void rule__VariableDefinition__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:968:1: ( ( '(' ) )
            // InternalMyDsl.g:969:1: ( '(' )
            {
            // InternalMyDsl.g:969:1: ( '(' )
            // InternalMyDsl.g:970:2: '('
            {
             before(grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_1_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__2__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__3"
    // InternalMyDsl.g:979:1: rule__VariableDefinition__Group_1__3 : rule__VariableDefinition__Group_1__3__Impl rule__VariableDefinition__Group_1__4 ;
    public final void rule__VariableDefinition__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:983:1: ( rule__VariableDefinition__Group_1__3__Impl rule__VariableDefinition__Group_1__4 )
            // InternalMyDsl.g:984:2: rule__VariableDefinition__Group_1__3__Impl rule__VariableDefinition__Group_1__4
            {
            pushFollow(FOLLOW_9);
            rule__VariableDefinition__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__4();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__3"


    // $ANTLR start "rule__VariableDefinition__Group_1__3__Impl"
    // InternalMyDsl.g:991:1: rule__VariableDefinition__Group_1__3__Impl : ( ( rule__VariableDefinition__VariableAssignment_1_3 ) ) ;
    public final void rule__VariableDefinition__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:995:1: ( ( ( rule__VariableDefinition__VariableAssignment_1_3 ) ) )
            // InternalMyDsl.g:996:1: ( ( rule__VariableDefinition__VariableAssignment_1_3 ) )
            {
            // InternalMyDsl.g:996:1: ( ( rule__VariableDefinition__VariableAssignment_1_3 ) )
            // InternalMyDsl.g:997:2: ( rule__VariableDefinition__VariableAssignment_1_3 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableAssignment_1_3()); 
            // InternalMyDsl.g:998:2: ( rule__VariableDefinition__VariableAssignment_1_3 )
            // InternalMyDsl.g:998:3: rule__VariableDefinition__VariableAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__VariableAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getVariableAssignment_1_3()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__3__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__4"
    // InternalMyDsl.g:1006:1: rule__VariableDefinition__Group_1__4 : rule__VariableDefinition__Group_1__4__Impl rule__VariableDefinition__Group_1__5 ;
    public final void rule__VariableDefinition__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1010:1: ( rule__VariableDefinition__Group_1__4__Impl rule__VariableDefinition__Group_1__5 )
            // InternalMyDsl.g:1011:2: rule__VariableDefinition__Group_1__4__Impl rule__VariableDefinition__Group_1__5
            {
            pushFollow(FOLLOW_9);
            rule__VariableDefinition__Group_1__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__5();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__4"


    // $ANTLR start "rule__VariableDefinition__Group_1__4__Impl"
    // InternalMyDsl.g:1018:1: rule__VariableDefinition__Group_1__4__Impl : ( ( rule__VariableDefinition__VariablesAssignment_1_4 )* ) ;
    public final void rule__VariableDefinition__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1022:1: ( ( ( rule__VariableDefinition__VariablesAssignment_1_4 )* ) )
            // InternalMyDsl.g:1023:1: ( ( rule__VariableDefinition__VariablesAssignment_1_4 )* )
            {
            // InternalMyDsl.g:1023:1: ( ( rule__VariableDefinition__VariablesAssignment_1_4 )* )
            // InternalMyDsl.g:1024:2: ( rule__VariableDefinition__VariablesAssignment_1_4 )*
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariablesAssignment_1_4()); 
            // InternalMyDsl.g:1025:2: ( rule__VariableDefinition__VariablesAssignment_1_4 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1025:3: rule__VariableDefinition__VariablesAssignment_1_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VariableDefinition__VariablesAssignment_1_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getVariableDefinitionAccess().getVariablesAssignment_1_4()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__4__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__5"
    // InternalMyDsl.g:1033:1: rule__VariableDefinition__Group_1__5 : rule__VariableDefinition__Group_1__5__Impl rule__VariableDefinition__Group_1__6 ;
    public final void rule__VariableDefinition__Group_1__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1037:1: ( rule__VariableDefinition__Group_1__5__Impl rule__VariableDefinition__Group_1__6 )
            // InternalMyDsl.g:1038:2: rule__VariableDefinition__Group_1__5__Impl rule__VariableDefinition__Group_1__6
            {
            pushFollow(FOLLOW_6);
            rule__VariableDefinition__Group_1__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__6();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__5"


    // $ANTLR start "rule__VariableDefinition__Group_1__5__Impl"
    // InternalMyDsl.g:1045:1: rule__VariableDefinition__Group_1__5__Impl : ( ')' ) ;
    public final void rule__VariableDefinition__Group_1__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1049:1: ( ( ')' ) )
            // InternalMyDsl.g:1050:1: ( ')' )
            {
            // InternalMyDsl.g:1050:1: ( ')' )
            // InternalMyDsl.g:1051:2: ')'
            {
             before(grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_1_5()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_1_5()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__5__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__6"
    // InternalMyDsl.g:1060:1: rule__VariableDefinition__Group_1__6 : rule__VariableDefinition__Group_1__6__Impl rule__VariableDefinition__Group_1__7 ;
    public final void rule__VariableDefinition__Group_1__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1064:1: ( rule__VariableDefinition__Group_1__6__Impl rule__VariableDefinition__Group_1__7 )
            // InternalMyDsl.g:1065:2: rule__VariableDefinition__Group_1__6__Impl rule__VariableDefinition__Group_1__7
            {
            pushFollow(FOLLOW_7);
            rule__VariableDefinition__Group_1__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__7();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__6"


    // $ANTLR start "rule__VariableDefinition__Group_1__6__Impl"
    // InternalMyDsl.g:1072:1: rule__VariableDefinition__Group_1__6__Impl : ( ( rule__VariableDefinition__BodyAssignment_1_6 ) ) ;
    public final void rule__VariableDefinition__Group_1__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1076:1: ( ( ( rule__VariableDefinition__BodyAssignment_1_6 ) ) )
            // InternalMyDsl.g:1077:1: ( ( rule__VariableDefinition__BodyAssignment_1_6 ) )
            {
            // InternalMyDsl.g:1077:1: ( ( rule__VariableDefinition__BodyAssignment_1_6 ) )
            // InternalMyDsl.g:1078:2: ( rule__VariableDefinition__BodyAssignment_1_6 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getBodyAssignment_1_6()); 
            // InternalMyDsl.g:1079:2: ( rule__VariableDefinition__BodyAssignment_1_6 )
            // InternalMyDsl.g:1079:3: rule__VariableDefinition__BodyAssignment_1_6
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__BodyAssignment_1_6();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getBodyAssignment_1_6()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__6__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_1__7"
    // InternalMyDsl.g:1087:1: rule__VariableDefinition__Group_1__7 : rule__VariableDefinition__Group_1__7__Impl ;
    public final void rule__VariableDefinition__Group_1__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1091:1: ( rule__VariableDefinition__Group_1__7__Impl )
            // InternalMyDsl.g:1092:2: rule__VariableDefinition__Group_1__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_1__7__Impl();

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
    // $ANTLR end "rule__VariableDefinition__Group_1__7"


    // $ANTLR start "rule__VariableDefinition__Group_1__7__Impl"
    // InternalMyDsl.g:1098:1: rule__VariableDefinition__Group_1__7__Impl : ( ')' ) ;
    public final void rule__VariableDefinition__Group_1__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( ')' ) )
            // InternalMyDsl.g:1103:1: ( ')' )
            {
            // InternalMyDsl.g:1103:1: ( ')' )
            // InternalMyDsl.g:1104:2: ')'
            {
             before(grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_1_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_1_7()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_1__7__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_2__0"
    // InternalMyDsl.g:1114:1: rule__VariableDefinition__Group_2__0 : rule__VariableDefinition__Group_2__0__Impl rule__VariableDefinition__Group_2__1 ;
    public final void rule__VariableDefinition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1118:1: ( rule__VariableDefinition__Group_2__0__Impl rule__VariableDefinition__Group_2__1 )
            // InternalMyDsl.g:1119:2: rule__VariableDefinition__Group_2__0__Impl rule__VariableDefinition__Group_2__1
            {
            pushFollow(FOLLOW_4);
            rule__VariableDefinition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_2__1();

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
    // $ANTLR end "rule__VariableDefinition__Group_2__0"


    // $ANTLR start "rule__VariableDefinition__Group_2__0__Impl"
    // InternalMyDsl.g:1126:1: rule__VariableDefinition__Group_2__0__Impl : ( '(' ) ;
    public final void rule__VariableDefinition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1130:1: ( ( '(' ) )
            // InternalMyDsl.g:1131:1: ( '(' )
            {
            // InternalMyDsl.g:1131:1: ( '(' )
            // InternalMyDsl.g:1132:2: '('
            {
             before(grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_2__0__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_2__1"
    // InternalMyDsl.g:1141:1: rule__VariableDefinition__Group_2__1 : rule__VariableDefinition__Group_2__1__Impl rule__VariableDefinition__Group_2__2 ;
    public final void rule__VariableDefinition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1145:1: ( rule__VariableDefinition__Group_2__1__Impl rule__VariableDefinition__Group_2__2 )
            // InternalMyDsl.g:1146:2: rule__VariableDefinition__Group_2__1__Impl rule__VariableDefinition__Group_2__2
            {
            pushFollow(FOLLOW_8);
            rule__VariableDefinition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_2__2();

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
    // $ANTLR end "rule__VariableDefinition__Group_2__1"


    // $ANTLR start "rule__VariableDefinition__Group_2__1__Impl"
    // InternalMyDsl.g:1153:1: rule__VariableDefinition__Group_2__1__Impl : ( 'define' ) ;
    public final void rule__VariableDefinition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1157:1: ( ( 'define' ) )
            // InternalMyDsl.g:1158:1: ( 'define' )
            {
            // InternalMyDsl.g:1158:1: ( 'define' )
            // InternalMyDsl.g:1159:2: 'define'
            {
             before(grammarAccess.getVariableDefinitionAccess().getDefineKeyword_2_1()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getDefineKeyword_2_1()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_2__1__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_2__2"
    // InternalMyDsl.g:1168:1: rule__VariableDefinition__Group_2__2 : rule__VariableDefinition__Group_2__2__Impl rule__VariableDefinition__Group_2__3 ;
    public final void rule__VariableDefinition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1172:1: ( rule__VariableDefinition__Group_2__2__Impl rule__VariableDefinition__Group_2__3 )
            // InternalMyDsl.g:1173:2: rule__VariableDefinition__Group_2__2__Impl rule__VariableDefinition__Group_2__3
            {
            pushFollow(FOLLOW_5);
            rule__VariableDefinition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_2__3();

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
    // $ANTLR end "rule__VariableDefinition__Group_2__2"


    // $ANTLR start "rule__VariableDefinition__Group_2__2__Impl"
    // InternalMyDsl.g:1180:1: rule__VariableDefinition__Group_2__2__Impl : ( '(' ) ;
    public final void rule__VariableDefinition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1184:1: ( ( '(' ) )
            // InternalMyDsl.g:1185:1: ( '(' )
            {
            // InternalMyDsl.g:1185:1: ( '(' )
            // InternalMyDsl.g:1186:2: '('
            {
             before(grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_2_2()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getLeftParenthesisKeyword_2_2()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_2__2__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_2__3"
    // InternalMyDsl.g:1195:1: rule__VariableDefinition__Group_2__3 : rule__VariableDefinition__Group_2__3__Impl rule__VariableDefinition__Group_2__4 ;
    public final void rule__VariableDefinition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1199:1: ( rule__VariableDefinition__Group_2__3__Impl rule__VariableDefinition__Group_2__4 )
            // InternalMyDsl.g:1200:2: rule__VariableDefinition__Group_2__3__Impl rule__VariableDefinition__Group_2__4
            {
            pushFollow(FOLLOW_11);
            rule__VariableDefinition__Group_2__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_2__4();

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
    // $ANTLR end "rule__VariableDefinition__Group_2__3"


    // $ANTLR start "rule__VariableDefinition__Group_2__3__Impl"
    // InternalMyDsl.g:1207:1: rule__VariableDefinition__Group_2__3__Impl : ( ( rule__VariableDefinition__VariableAssignment_2_3 ) ) ;
    public final void rule__VariableDefinition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1211:1: ( ( ( rule__VariableDefinition__VariableAssignment_2_3 ) ) )
            // InternalMyDsl.g:1212:1: ( ( rule__VariableDefinition__VariableAssignment_2_3 ) )
            {
            // InternalMyDsl.g:1212:1: ( ( rule__VariableDefinition__VariableAssignment_2_3 ) )
            // InternalMyDsl.g:1213:2: ( rule__VariableDefinition__VariableAssignment_2_3 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableAssignment_2_3()); 
            // InternalMyDsl.g:1214:2: ( rule__VariableDefinition__VariableAssignment_2_3 )
            // InternalMyDsl.g:1214:3: rule__VariableDefinition__VariableAssignment_2_3
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__VariableAssignment_2_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getVariableAssignment_2_3()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_2__3__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_2__4"
    // InternalMyDsl.g:1222:1: rule__VariableDefinition__Group_2__4 : rule__VariableDefinition__Group_2__4__Impl rule__VariableDefinition__Group_2__5 ;
    public final void rule__VariableDefinition__Group_2__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1226:1: ( rule__VariableDefinition__Group_2__4__Impl rule__VariableDefinition__Group_2__5 )
            // InternalMyDsl.g:1227:2: rule__VariableDefinition__Group_2__4__Impl rule__VariableDefinition__Group_2__5
            {
            pushFollow(FOLLOW_11);
            rule__VariableDefinition__Group_2__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_2__5();

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
    // $ANTLR end "rule__VariableDefinition__Group_2__4"


    // $ANTLR start "rule__VariableDefinition__Group_2__4__Impl"
    // InternalMyDsl.g:1234:1: rule__VariableDefinition__Group_2__4__Impl : ( ( rule__VariableDefinition__VariablesAssignment_2_4 )* ) ;
    public final void rule__VariableDefinition__Group_2__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1238:1: ( ( ( rule__VariableDefinition__VariablesAssignment_2_4 )* ) )
            // InternalMyDsl.g:1239:1: ( ( rule__VariableDefinition__VariablesAssignment_2_4 )* )
            {
            // InternalMyDsl.g:1239:1: ( ( rule__VariableDefinition__VariablesAssignment_2_4 )* )
            // InternalMyDsl.g:1240:2: ( rule__VariableDefinition__VariablesAssignment_2_4 )*
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariablesAssignment_2_4()); 
            // InternalMyDsl.g:1241:2: ( rule__VariableDefinition__VariablesAssignment_2_4 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_ID) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1241:3: rule__VariableDefinition__VariablesAssignment_2_4
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__VariableDefinition__VariablesAssignment_2_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getVariableDefinitionAccess().getVariablesAssignment_2_4()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_2__4__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_2__5"
    // InternalMyDsl.g:1249:1: rule__VariableDefinition__Group_2__5 : rule__VariableDefinition__Group_2__5__Impl rule__VariableDefinition__Group_2__6 ;
    public final void rule__VariableDefinition__Group_2__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1253:1: ( rule__VariableDefinition__Group_2__5__Impl rule__VariableDefinition__Group_2__6 )
            // InternalMyDsl.g:1254:2: rule__VariableDefinition__Group_2__5__Impl rule__VariableDefinition__Group_2__6
            {
            pushFollow(FOLLOW_5);
            rule__VariableDefinition__Group_2__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_2__6();

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
    // $ANTLR end "rule__VariableDefinition__Group_2__5"


    // $ANTLR start "rule__VariableDefinition__Group_2__5__Impl"
    // InternalMyDsl.g:1261:1: rule__VariableDefinition__Group_2__5__Impl : ( '.' ) ;
    public final void rule__VariableDefinition__Group_2__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1265:1: ( ( '.' ) )
            // InternalMyDsl.g:1266:1: ( '.' )
            {
            // InternalMyDsl.g:1266:1: ( '.' )
            // InternalMyDsl.g:1267:2: '.'
            {
             before(grammarAccess.getVariableDefinitionAccess().getFullStopKeyword_2_5()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getFullStopKeyword_2_5()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_2__5__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_2__6"
    // InternalMyDsl.g:1276:1: rule__VariableDefinition__Group_2__6 : rule__VariableDefinition__Group_2__6__Impl rule__VariableDefinition__Group_2__7 ;
    public final void rule__VariableDefinition__Group_2__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1280:1: ( rule__VariableDefinition__Group_2__6__Impl rule__VariableDefinition__Group_2__7 )
            // InternalMyDsl.g:1281:2: rule__VariableDefinition__Group_2__6__Impl rule__VariableDefinition__Group_2__7
            {
            pushFollow(FOLLOW_7);
            rule__VariableDefinition__Group_2__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_2__7();

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
    // $ANTLR end "rule__VariableDefinition__Group_2__6"


    // $ANTLR start "rule__VariableDefinition__Group_2__6__Impl"
    // InternalMyDsl.g:1288:1: rule__VariableDefinition__Group_2__6__Impl : ( ( rule__VariableDefinition__VarAssignment_2_6 ) ) ;
    public final void rule__VariableDefinition__Group_2__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1292:1: ( ( ( rule__VariableDefinition__VarAssignment_2_6 ) ) )
            // InternalMyDsl.g:1293:1: ( ( rule__VariableDefinition__VarAssignment_2_6 ) )
            {
            // InternalMyDsl.g:1293:1: ( ( rule__VariableDefinition__VarAssignment_2_6 ) )
            // InternalMyDsl.g:1294:2: ( rule__VariableDefinition__VarAssignment_2_6 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getVarAssignment_2_6()); 
            // InternalMyDsl.g:1295:2: ( rule__VariableDefinition__VarAssignment_2_6 )
            // InternalMyDsl.g:1295:3: rule__VariableDefinition__VarAssignment_2_6
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__VarAssignment_2_6();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getVarAssignment_2_6()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_2__6__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_2__7"
    // InternalMyDsl.g:1303:1: rule__VariableDefinition__Group_2__7 : rule__VariableDefinition__Group_2__7__Impl rule__VariableDefinition__Group_2__8 ;
    public final void rule__VariableDefinition__Group_2__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1307:1: ( rule__VariableDefinition__Group_2__7__Impl rule__VariableDefinition__Group_2__8 )
            // InternalMyDsl.g:1308:2: rule__VariableDefinition__Group_2__7__Impl rule__VariableDefinition__Group_2__8
            {
            pushFollow(FOLLOW_6);
            rule__VariableDefinition__Group_2__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_2__8();

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
    // $ANTLR end "rule__VariableDefinition__Group_2__7"


    // $ANTLR start "rule__VariableDefinition__Group_2__7__Impl"
    // InternalMyDsl.g:1315:1: rule__VariableDefinition__Group_2__7__Impl : ( ')' ) ;
    public final void rule__VariableDefinition__Group_2__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1319:1: ( ( ')' ) )
            // InternalMyDsl.g:1320:1: ( ')' )
            {
            // InternalMyDsl.g:1320:1: ( ')' )
            // InternalMyDsl.g:1321:2: ')'
            {
             before(grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_2_7()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_2_7()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_2__7__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_2__8"
    // InternalMyDsl.g:1330:1: rule__VariableDefinition__Group_2__8 : rule__VariableDefinition__Group_2__8__Impl rule__VariableDefinition__Group_2__9 ;
    public final void rule__VariableDefinition__Group_2__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1334:1: ( rule__VariableDefinition__Group_2__8__Impl rule__VariableDefinition__Group_2__9 )
            // InternalMyDsl.g:1335:2: rule__VariableDefinition__Group_2__8__Impl rule__VariableDefinition__Group_2__9
            {
            pushFollow(FOLLOW_7);
            rule__VariableDefinition__Group_2__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_2__9();

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
    // $ANTLR end "rule__VariableDefinition__Group_2__8"


    // $ANTLR start "rule__VariableDefinition__Group_2__8__Impl"
    // InternalMyDsl.g:1342:1: rule__VariableDefinition__Group_2__8__Impl : ( ( rule__VariableDefinition__BodyAssignment_2_8 ) ) ;
    public final void rule__VariableDefinition__Group_2__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1346:1: ( ( ( rule__VariableDefinition__BodyAssignment_2_8 ) ) )
            // InternalMyDsl.g:1347:1: ( ( rule__VariableDefinition__BodyAssignment_2_8 ) )
            {
            // InternalMyDsl.g:1347:1: ( ( rule__VariableDefinition__BodyAssignment_2_8 ) )
            // InternalMyDsl.g:1348:2: ( rule__VariableDefinition__BodyAssignment_2_8 )
            {
             before(grammarAccess.getVariableDefinitionAccess().getBodyAssignment_2_8()); 
            // InternalMyDsl.g:1349:2: ( rule__VariableDefinition__BodyAssignment_2_8 )
            // InternalMyDsl.g:1349:3: rule__VariableDefinition__BodyAssignment_2_8
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__BodyAssignment_2_8();

            state._fsp--;


            }

             after(grammarAccess.getVariableDefinitionAccess().getBodyAssignment_2_8()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_2__8__Impl"


    // $ANTLR start "rule__VariableDefinition__Group_2__9"
    // InternalMyDsl.g:1357:1: rule__VariableDefinition__Group_2__9 : rule__VariableDefinition__Group_2__9__Impl ;
    public final void rule__VariableDefinition__Group_2__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1361:1: ( rule__VariableDefinition__Group_2__9__Impl )
            // InternalMyDsl.g:1362:2: rule__VariableDefinition__Group_2__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VariableDefinition__Group_2__9__Impl();

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
    // $ANTLR end "rule__VariableDefinition__Group_2__9"


    // $ANTLR start "rule__VariableDefinition__Group_2__9__Impl"
    // InternalMyDsl.g:1368:1: rule__VariableDefinition__Group_2__9__Impl : ( ')' ) ;
    public final void rule__VariableDefinition__Group_2__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( ( ')' ) )
            // InternalMyDsl.g:1373:1: ( ')' )
            {
            // InternalMyDsl.g:1373:1: ( ')' )
            // InternalMyDsl.g:1374:2: ')'
            {
             before(grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_2_9()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getRightParenthesisKeyword_2_9()); 

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
    // $ANTLR end "rule__VariableDefinition__Group_2__9__Impl"


    // $ANTLR start "rule__Body__Group__0"
    // InternalMyDsl.g:1384:1: rule__Body__Group__0 : rule__Body__Group__0__Impl rule__Body__Group__1 ;
    public final void rule__Body__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1388:1: ( rule__Body__Group__0__Impl rule__Body__Group__1 )
            // InternalMyDsl.g:1389:2: rule__Body__Group__0__Impl rule__Body__Group__1
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
    // InternalMyDsl.g:1396:1: rule__Body__Group__0__Impl : ( ( rule__Body__DefinitionAssignment_0 )* ) ;
    public final void rule__Body__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1400:1: ( ( ( rule__Body__DefinitionAssignment_0 )* ) )
            // InternalMyDsl.g:1401:1: ( ( rule__Body__DefinitionAssignment_0 )* )
            {
            // InternalMyDsl.g:1401:1: ( ( rule__Body__DefinitionAssignment_0 )* )
            // InternalMyDsl.g:1402:2: ( rule__Body__DefinitionAssignment_0 )*
            {
             before(grammarAccess.getBodyAccess().getDefinitionAssignment_0()); 
            // InternalMyDsl.g:1403:2: ( rule__Body__DefinitionAssignment_0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==36) ) {
                    int LA12_2 = input.LA(2);

                    if ( (LA12_2==37) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1403:3: rule__Body__DefinitionAssignment_0
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Body__DefinitionAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
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
    // InternalMyDsl.g:1411:1: rule__Body__Group__1 : rule__Body__Group__1__Impl ;
    public final void rule__Body__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1415:1: ( rule__Body__Group__1__Impl )
            // InternalMyDsl.g:1416:2: rule__Body__Group__1__Impl
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
    // InternalMyDsl.g:1422:1: rule__Body__Group__1__Impl : ( ( ( rule__Body__ExpressionAssignment_1 ) ) ( ( rule__Body__ExpressionAssignment_1 )* ) ) ;
    public final void rule__Body__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1426:1: ( ( ( ( rule__Body__ExpressionAssignment_1 ) ) ( ( rule__Body__ExpressionAssignment_1 )* ) ) )
            // InternalMyDsl.g:1427:1: ( ( ( rule__Body__ExpressionAssignment_1 ) ) ( ( rule__Body__ExpressionAssignment_1 )* ) )
            {
            // InternalMyDsl.g:1427:1: ( ( ( rule__Body__ExpressionAssignment_1 ) ) ( ( rule__Body__ExpressionAssignment_1 )* ) )
            // InternalMyDsl.g:1428:2: ( ( rule__Body__ExpressionAssignment_1 ) ) ( ( rule__Body__ExpressionAssignment_1 )* )
            {
            // InternalMyDsl.g:1428:2: ( ( rule__Body__ExpressionAssignment_1 ) )
            // InternalMyDsl.g:1429:3: ( rule__Body__ExpressionAssignment_1 )
            {
             before(grammarAccess.getBodyAccess().getExpressionAssignment_1()); 
            // InternalMyDsl.g:1430:3: ( rule__Body__ExpressionAssignment_1 )
            // InternalMyDsl.g:1430:4: rule__Body__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_3);
            rule__Body__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBodyAccess().getExpressionAssignment_1()); 

            }

            // InternalMyDsl.g:1433:2: ( ( rule__Body__ExpressionAssignment_1 )* )
            // InternalMyDsl.g:1434:3: ( rule__Body__ExpressionAssignment_1 )*
            {
             before(grammarAccess.getBodyAccess().getExpressionAssignment_1()); 
            // InternalMyDsl.g:1435:3: ( rule__Body__ExpressionAssignment_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_BOOL && LA13_0<=RULE_LETTER)||LA13_0==36) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:1435:4: rule__Body__ExpressionAssignment_1
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Body__ExpressionAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // InternalMyDsl.g:1445:1: rule__Comparison__Group__0 : rule__Comparison__Group__0__Impl rule__Comparison__Group__1 ;
    public final void rule__Comparison__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1449:1: ( rule__Comparison__Group__0__Impl rule__Comparison__Group__1 )
            // InternalMyDsl.g:1450:2: rule__Comparison__Group__0__Impl rule__Comparison__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:1457:1: rule__Comparison__Group__0__Impl : ( () ) ;
    public final void rule__Comparison__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1461:1: ( ( () ) )
            // InternalMyDsl.g:1462:1: ( () )
            {
            // InternalMyDsl.g:1462:1: ( () )
            // InternalMyDsl.g:1463:2: ()
            {
             before(grammarAccess.getComparisonAccess().getComparisonAction_0()); 
            // InternalMyDsl.g:1464:2: ()
            // InternalMyDsl.g:1464:3: 
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
    // InternalMyDsl.g:1472:1: rule__Comparison__Group__1 : rule__Comparison__Group__1__Impl ;
    public final void rule__Comparison__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1476:1: ( rule__Comparison__Group__1__Impl )
            // InternalMyDsl.g:1477:2: rule__Comparison__Group__1__Impl
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
    // InternalMyDsl.g:1483:1: rule__Comparison__Group__1__Impl : ( ( rule__Comparison__Alternatives_1 ) ) ;
    public final void rule__Comparison__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1487:1: ( ( ( rule__Comparison__Alternatives_1 ) ) )
            // InternalMyDsl.g:1488:1: ( ( rule__Comparison__Alternatives_1 ) )
            {
            // InternalMyDsl.g:1488:1: ( ( rule__Comparison__Alternatives_1 ) )
            // InternalMyDsl.g:1489:2: ( rule__Comparison__Alternatives_1 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1()); 
            // InternalMyDsl.g:1490:2: ( rule__Comparison__Alternatives_1 )
            // InternalMyDsl.g:1490:3: rule__Comparison__Alternatives_1
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
    // InternalMyDsl.g:1499:1: rule__Comparison__Group_1_0__0 : rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 ;
    public final void rule__Comparison__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1503:1: ( rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1 )
            // InternalMyDsl.g:1504:2: rule__Comparison__Group_1_0__0__Impl rule__Comparison__Group_1_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalMyDsl.g:1511:1: rule__Comparison__Group_1_0__0__Impl : ( '(' ) ;
    public final void rule__Comparison__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1515:1: ( ( '(' ) )
            // InternalMyDsl.g:1516:1: ( '(' )
            {
            // InternalMyDsl.g:1516:1: ( '(' )
            // InternalMyDsl.g:1517:2: '('
            {
             before(grammarAccess.getComparisonAccess().getLeftParenthesisKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:1526:1: rule__Comparison__Group_1_0__1 : rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2 ;
    public final void rule__Comparison__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1530:1: ( rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2 )
            // InternalMyDsl.g:1531:2: rule__Comparison__Group_1_0__1__Impl rule__Comparison__Group_1_0__2
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1538:1: rule__Comparison__Group_1_0__1__Impl : ( ( rule__Comparison__Alternatives_1_0_1 ) ) ;
    public final void rule__Comparison__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1542:1: ( ( ( rule__Comparison__Alternatives_1_0_1 ) ) )
            // InternalMyDsl.g:1543:1: ( ( rule__Comparison__Alternatives_1_0_1 ) )
            {
            // InternalMyDsl.g:1543:1: ( ( rule__Comparison__Alternatives_1_0_1 ) )
            // InternalMyDsl.g:1544:2: ( rule__Comparison__Alternatives_1_0_1 )
            {
             before(grammarAccess.getComparisonAccess().getAlternatives_1_0_1()); 
            // InternalMyDsl.g:1545:2: ( rule__Comparison__Alternatives_1_0_1 )
            // InternalMyDsl.g:1545:3: rule__Comparison__Alternatives_1_0_1
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
    // InternalMyDsl.g:1553:1: rule__Comparison__Group_1_0__2 : rule__Comparison__Group_1_0__2__Impl rule__Comparison__Group_1_0__3 ;
    public final void rule__Comparison__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1557:1: ( rule__Comparison__Group_1_0__2__Impl rule__Comparison__Group_1_0__3 )
            // InternalMyDsl.g:1558:2: rule__Comparison__Group_1_0__2__Impl rule__Comparison__Group_1_0__3
            {
            pushFollow(FOLLOW_15);
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
    // InternalMyDsl.g:1565:1: rule__Comparison__Group_1_0__2__Impl : ( ( rule__Comparison__Num1Assignment_1_0_2 ) ) ;
    public final void rule__Comparison__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1569:1: ( ( ( rule__Comparison__Num1Assignment_1_0_2 ) ) )
            // InternalMyDsl.g:1570:1: ( ( rule__Comparison__Num1Assignment_1_0_2 ) )
            {
            // InternalMyDsl.g:1570:1: ( ( rule__Comparison__Num1Assignment_1_0_2 ) )
            // InternalMyDsl.g:1571:2: ( rule__Comparison__Num1Assignment_1_0_2 )
            {
             before(grammarAccess.getComparisonAccess().getNum1Assignment_1_0_2()); 
            // InternalMyDsl.g:1572:2: ( rule__Comparison__Num1Assignment_1_0_2 )
            // InternalMyDsl.g:1572:3: rule__Comparison__Num1Assignment_1_0_2
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
    // InternalMyDsl.g:1580:1: rule__Comparison__Group_1_0__3 : rule__Comparison__Group_1_0__3__Impl rule__Comparison__Group_1_0__4 ;
    public final void rule__Comparison__Group_1_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1584:1: ( rule__Comparison__Group_1_0__3__Impl rule__Comparison__Group_1_0__4 )
            // InternalMyDsl.g:1585:2: rule__Comparison__Group_1_0__3__Impl rule__Comparison__Group_1_0__4
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
    // InternalMyDsl.g:1592:1: rule__Comparison__Group_1_0__3__Impl : ( ( rule__Comparison__Num2Assignment_1_0_3 ) ) ;
    public final void rule__Comparison__Group_1_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1596:1: ( ( ( rule__Comparison__Num2Assignment_1_0_3 ) ) )
            // InternalMyDsl.g:1597:1: ( ( rule__Comparison__Num2Assignment_1_0_3 ) )
            {
            // InternalMyDsl.g:1597:1: ( ( rule__Comparison__Num2Assignment_1_0_3 ) )
            // InternalMyDsl.g:1598:2: ( rule__Comparison__Num2Assignment_1_0_3 )
            {
             before(grammarAccess.getComparisonAccess().getNum2Assignment_1_0_3()); 
            // InternalMyDsl.g:1599:2: ( rule__Comparison__Num2Assignment_1_0_3 )
            // InternalMyDsl.g:1599:3: rule__Comparison__Num2Assignment_1_0_3
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
    // InternalMyDsl.g:1607:1: rule__Comparison__Group_1_0__4 : rule__Comparison__Group_1_0__4__Impl ;
    public final void rule__Comparison__Group_1_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1611:1: ( rule__Comparison__Group_1_0__4__Impl )
            // InternalMyDsl.g:1612:2: rule__Comparison__Group_1_0__4__Impl
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
    // InternalMyDsl.g:1618:1: rule__Comparison__Group_1_0__4__Impl : ( ')' ) ;
    public final void rule__Comparison__Group_1_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1622:1: ( ( ')' ) )
            // InternalMyDsl.g:1623:1: ( ')' )
            {
            // InternalMyDsl.g:1623:1: ( ')' )
            // InternalMyDsl.g:1624:2: ')'
            {
             before(grammarAccess.getComparisonAccess().getRightParenthesisKeyword_1_0_4()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__MultipleCondition__Group__0"
    // InternalMyDsl.g:1634:1: rule__MultipleCondition__Group__0 : rule__MultipleCondition__Group__0__Impl rule__MultipleCondition__Group__1 ;
    public final void rule__MultipleCondition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1638:1: ( rule__MultipleCondition__Group__0__Impl rule__MultipleCondition__Group__1 )
            // InternalMyDsl.g:1639:2: rule__MultipleCondition__Group__0__Impl rule__MultipleCondition__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MultipleCondition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group__1();

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
    // $ANTLR end "rule__MultipleCondition__Group__0"


    // $ANTLR start "rule__MultipleCondition__Group__0__Impl"
    // InternalMyDsl.g:1646:1: rule__MultipleCondition__Group__0__Impl : ( '(' ) ;
    public final void rule__MultipleCondition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1650:1: ( ( '(' ) )
            // InternalMyDsl.g:1651:1: ( '(' )
            {
            // InternalMyDsl.g:1651:1: ( '(' )
            // InternalMyDsl.g:1652:2: '('
            {
             before(grammarAccess.getMultipleConditionAccess().getLeftParenthesisKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMultipleConditionAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__MultipleCondition__Group__0__Impl"


    // $ANTLR start "rule__MultipleCondition__Group__1"
    // InternalMyDsl.g:1661:1: rule__MultipleCondition__Group__1 : rule__MultipleCondition__Group__1__Impl rule__MultipleCondition__Group__2 ;
    public final void rule__MultipleCondition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1665:1: ( rule__MultipleCondition__Group__1__Impl rule__MultipleCondition__Group__2 )
            // InternalMyDsl.g:1666:2: rule__MultipleCondition__Group__1__Impl rule__MultipleCondition__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MultipleCondition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group__2();

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
    // $ANTLR end "rule__MultipleCondition__Group__1"


    // $ANTLR start "rule__MultipleCondition__Group__1__Impl"
    // InternalMyDsl.g:1673:1: rule__MultipleCondition__Group__1__Impl : ( 'cond' ) ;
    public final void rule__MultipleCondition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1677:1: ( ( 'cond' ) )
            // InternalMyDsl.g:1678:1: ( 'cond' )
            {
            // InternalMyDsl.g:1678:1: ( 'cond' )
            // InternalMyDsl.g:1679:2: 'cond'
            {
             before(grammarAccess.getMultipleConditionAccess().getCondKeyword_1()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMultipleConditionAccess().getCondKeyword_1()); 

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
    // $ANTLR end "rule__MultipleCondition__Group__1__Impl"


    // $ANTLR start "rule__MultipleCondition__Group__2"
    // InternalMyDsl.g:1688:1: rule__MultipleCondition__Group__2 : rule__MultipleCondition__Group__2__Impl rule__MultipleCondition__Group__3 ;
    public final void rule__MultipleCondition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1692:1: ( rule__MultipleCondition__Group__2__Impl rule__MultipleCondition__Group__3 )
            // InternalMyDsl.g:1693:2: rule__MultipleCondition__Group__2__Impl rule__MultipleCondition__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__MultipleCondition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group__3();

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
    // $ANTLR end "rule__MultipleCondition__Group__2"


    // $ANTLR start "rule__MultipleCondition__Group__2__Impl"
    // InternalMyDsl.g:1700:1: rule__MultipleCondition__Group__2__Impl : ( ( rule__MultipleCondition__Group_2__0 ) ) ;
    public final void rule__MultipleCondition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1704:1: ( ( ( rule__MultipleCondition__Group_2__0 ) ) )
            // InternalMyDsl.g:1705:1: ( ( rule__MultipleCondition__Group_2__0 ) )
            {
            // InternalMyDsl.g:1705:1: ( ( rule__MultipleCondition__Group_2__0 ) )
            // InternalMyDsl.g:1706:2: ( rule__MultipleCondition__Group_2__0 )
            {
             before(grammarAccess.getMultipleConditionAccess().getGroup_2()); 
            // InternalMyDsl.g:1707:2: ( rule__MultipleCondition__Group_2__0 )
            // InternalMyDsl.g:1707:3: rule__MultipleCondition__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getMultipleConditionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__MultipleCondition__Group__2__Impl"


    // $ANTLR start "rule__MultipleCondition__Group__3"
    // InternalMyDsl.g:1715:1: rule__MultipleCondition__Group__3 : rule__MultipleCondition__Group__3__Impl ;
    public final void rule__MultipleCondition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1719:1: ( rule__MultipleCondition__Group__3__Impl )
            // InternalMyDsl.g:1720:2: rule__MultipleCondition__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group__3__Impl();

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
    // $ANTLR end "rule__MultipleCondition__Group__3"


    // $ANTLR start "rule__MultipleCondition__Group__3__Impl"
    // InternalMyDsl.g:1726:1: rule__MultipleCondition__Group__3__Impl : ( ( rule__MultipleCondition__Group_3__0 )? ) ;
    public final void rule__MultipleCondition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1730:1: ( ( ( rule__MultipleCondition__Group_3__0 )? ) )
            // InternalMyDsl.g:1731:1: ( ( rule__MultipleCondition__Group_3__0 )? )
            {
            // InternalMyDsl.g:1731:1: ( ( rule__MultipleCondition__Group_3__0 )? )
            // InternalMyDsl.g:1732:2: ( rule__MultipleCondition__Group_3__0 )?
            {
             before(grammarAccess.getMultipleConditionAccess().getGroup_3()); 
            // InternalMyDsl.g:1733:2: ( rule__MultipleCondition__Group_3__0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==36) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==40) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1733:3: rule__MultipleCondition__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MultipleCondition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMultipleConditionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__MultipleCondition__Group__3__Impl"


    // $ANTLR start "rule__MultipleCondition__Group_2__0"
    // InternalMyDsl.g:1742:1: rule__MultipleCondition__Group_2__0 : rule__MultipleCondition__Group_2__0__Impl rule__MultipleCondition__Group_2__1 ;
    public final void rule__MultipleCondition__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1746:1: ( rule__MultipleCondition__Group_2__0__Impl rule__MultipleCondition__Group_2__1 )
            // InternalMyDsl.g:1747:2: rule__MultipleCondition__Group_2__0__Impl rule__MultipleCondition__Group_2__1
            {
            pushFollow(FOLLOW_13);
            rule__MultipleCondition__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group_2__1();

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
    // $ANTLR end "rule__MultipleCondition__Group_2__0"


    // $ANTLR start "rule__MultipleCondition__Group_2__0__Impl"
    // InternalMyDsl.g:1754:1: rule__MultipleCondition__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MultipleCondition__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1758:1: ( ( '(' ) )
            // InternalMyDsl.g:1759:1: ( '(' )
            {
            // InternalMyDsl.g:1759:1: ( '(' )
            // InternalMyDsl.g:1760:2: '('
            {
             before(grammarAccess.getMultipleConditionAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMultipleConditionAccess().getLeftParenthesisKeyword_2_0()); 

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
    // $ANTLR end "rule__MultipleCondition__Group_2__0__Impl"


    // $ANTLR start "rule__MultipleCondition__Group_2__1"
    // InternalMyDsl.g:1769:1: rule__MultipleCondition__Group_2__1 : rule__MultipleCondition__Group_2__1__Impl rule__MultipleCondition__Group_2__2 ;
    public final void rule__MultipleCondition__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1773:1: ( rule__MultipleCondition__Group_2__1__Impl rule__MultipleCondition__Group_2__2 )
            // InternalMyDsl.g:1774:2: rule__MultipleCondition__Group_2__1__Impl rule__MultipleCondition__Group_2__2
            {
            pushFollow(FOLLOW_6);
            rule__MultipleCondition__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group_2__2();

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
    // $ANTLR end "rule__MultipleCondition__Group_2__1"


    // $ANTLR start "rule__MultipleCondition__Group_2__1__Impl"
    // InternalMyDsl.g:1781:1: rule__MultipleCondition__Group_2__1__Impl : ( ( rule__MultipleCondition__CompAssignment_2_1 ) ) ;
    public final void rule__MultipleCondition__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1785:1: ( ( ( rule__MultipleCondition__CompAssignment_2_1 ) ) )
            // InternalMyDsl.g:1786:1: ( ( rule__MultipleCondition__CompAssignment_2_1 ) )
            {
            // InternalMyDsl.g:1786:1: ( ( rule__MultipleCondition__CompAssignment_2_1 ) )
            // InternalMyDsl.g:1787:2: ( rule__MultipleCondition__CompAssignment_2_1 )
            {
             before(grammarAccess.getMultipleConditionAccess().getCompAssignment_2_1()); 
            // InternalMyDsl.g:1788:2: ( rule__MultipleCondition__CompAssignment_2_1 )
            // InternalMyDsl.g:1788:3: rule__MultipleCondition__CompAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MultipleCondition__CompAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMultipleConditionAccess().getCompAssignment_2_1()); 

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
    // $ANTLR end "rule__MultipleCondition__Group_2__1__Impl"


    // $ANTLR start "rule__MultipleCondition__Group_2__2"
    // InternalMyDsl.g:1796:1: rule__MultipleCondition__Group_2__2 : rule__MultipleCondition__Group_2__2__Impl rule__MultipleCondition__Group_2__3 ;
    public final void rule__MultipleCondition__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1800:1: ( rule__MultipleCondition__Group_2__2__Impl rule__MultipleCondition__Group_2__3 )
            // InternalMyDsl.g:1801:2: rule__MultipleCondition__Group_2__2__Impl rule__MultipleCondition__Group_2__3
            {
            pushFollow(FOLLOW_7);
            rule__MultipleCondition__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group_2__3();

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
    // $ANTLR end "rule__MultipleCondition__Group_2__2"


    // $ANTLR start "rule__MultipleCondition__Group_2__2__Impl"
    // InternalMyDsl.g:1808:1: rule__MultipleCondition__Group_2__2__Impl : ( ( rule__MultipleCondition__ExpAssignment_2_2 ) ) ;
    public final void rule__MultipleCondition__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1812:1: ( ( ( rule__MultipleCondition__ExpAssignment_2_2 ) ) )
            // InternalMyDsl.g:1813:1: ( ( rule__MultipleCondition__ExpAssignment_2_2 ) )
            {
            // InternalMyDsl.g:1813:1: ( ( rule__MultipleCondition__ExpAssignment_2_2 ) )
            // InternalMyDsl.g:1814:2: ( rule__MultipleCondition__ExpAssignment_2_2 )
            {
             before(grammarAccess.getMultipleConditionAccess().getExpAssignment_2_2()); 
            // InternalMyDsl.g:1815:2: ( rule__MultipleCondition__ExpAssignment_2_2 )
            // InternalMyDsl.g:1815:3: rule__MultipleCondition__ExpAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__MultipleCondition__ExpAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getMultipleConditionAccess().getExpAssignment_2_2()); 

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
    // $ANTLR end "rule__MultipleCondition__Group_2__2__Impl"


    // $ANTLR start "rule__MultipleCondition__Group_2__3"
    // InternalMyDsl.g:1823:1: rule__MultipleCondition__Group_2__3 : rule__MultipleCondition__Group_2__3__Impl ;
    public final void rule__MultipleCondition__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1827:1: ( rule__MultipleCondition__Group_2__3__Impl )
            // InternalMyDsl.g:1828:2: rule__MultipleCondition__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group_2__3__Impl();

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
    // $ANTLR end "rule__MultipleCondition__Group_2__3"


    // $ANTLR start "rule__MultipleCondition__Group_2__3__Impl"
    // InternalMyDsl.g:1834:1: rule__MultipleCondition__Group_2__3__Impl : ( ')' ) ;
    public final void rule__MultipleCondition__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1838:1: ( ( ')' ) )
            // InternalMyDsl.g:1839:1: ( ')' )
            {
            // InternalMyDsl.g:1839:1: ( ')' )
            // InternalMyDsl.g:1840:2: ')'
            {
             before(grammarAccess.getMultipleConditionAccess().getRightParenthesisKeyword_2_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMultipleConditionAccess().getRightParenthesisKeyword_2_3()); 

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
    // $ANTLR end "rule__MultipleCondition__Group_2__3__Impl"


    // $ANTLR start "rule__MultipleCondition__Group_3__0"
    // InternalMyDsl.g:1850:1: rule__MultipleCondition__Group_3__0 : rule__MultipleCondition__Group_3__0__Impl rule__MultipleCondition__Group_3__1 ;
    public final void rule__MultipleCondition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1854:1: ( rule__MultipleCondition__Group_3__0__Impl rule__MultipleCondition__Group_3__1 )
            // InternalMyDsl.g:1855:2: rule__MultipleCondition__Group_3__0__Impl rule__MultipleCondition__Group_3__1
            {
            pushFollow(FOLLOW_17);
            rule__MultipleCondition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group_3__1();

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
    // $ANTLR end "rule__MultipleCondition__Group_3__0"


    // $ANTLR start "rule__MultipleCondition__Group_3__0__Impl"
    // InternalMyDsl.g:1862:1: rule__MultipleCondition__Group_3__0__Impl : ( '(' ) ;
    public final void rule__MultipleCondition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1866:1: ( ( '(' ) )
            // InternalMyDsl.g:1867:1: ( '(' )
            {
            // InternalMyDsl.g:1867:1: ( '(' )
            // InternalMyDsl.g:1868:2: '('
            {
             before(grammarAccess.getMultipleConditionAccess().getLeftParenthesisKeyword_3_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMultipleConditionAccess().getLeftParenthesisKeyword_3_0()); 

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
    // $ANTLR end "rule__MultipleCondition__Group_3__0__Impl"


    // $ANTLR start "rule__MultipleCondition__Group_3__1"
    // InternalMyDsl.g:1877:1: rule__MultipleCondition__Group_3__1 : rule__MultipleCondition__Group_3__1__Impl rule__MultipleCondition__Group_3__2 ;
    public final void rule__MultipleCondition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1881:1: ( rule__MultipleCondition__Group_3__1__Impl rule__MultipleCondition__Group_3__2 )
            // InternalMyDsl.g:1882:2: rule__MultipleCondition__Group_3__1__Impl rule__MultipleCondition__Group_3__2
            {
            pushFollow(FOLLOW_6);
            rule__MultipleCondition__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group_3__2();

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
    // $ANTLR end "rule__MultipleCondition__Group_3__1"


    // $ANTLR start "rule__MultipleCondition__Group_3__1__Impl"
    // InternalMyDsl.g:1889:1: rule__MultipleCondition__Group_3__1__Impl : ( 'else' ) ;
    public final void rule__MultipleCondition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1893:1: ( ( 'else' ) )
            // InternalMyDsl.g:1894:1: ( 'else' )
            {
            // InternalMyDsl.g:1894:1: ( 'else' )
            // InternalMyDsl.g:1895:2: 'else'
            {
             before(grammarAccess.getMultipleConditionAccess().getElseKeyword_3_1()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMultipleConditionAccess().getElseKeyword_3_1()); 

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
    // $ANTLR end "rule__MultipleCondition__Group_3__1__Impl"


    // $ANTLR start "rule__MultipleCondition__Group_3__2"
    // InternalMyDsl.g:1904:1: rule__MultipleCondition__Group_3__2 : rule__MultipleCondition__Group_3__2__Impl rule__MultipleCondition__Group_3__3 ;
    public final void rule__MultipleCondition__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1908:1: ( rule__MultipleCondition__Group_3__2__Impl rule__MultipleCondition__Group_3__3 )
            // InternalMyDsl.g:1909:2: rule__MultipleCondition__Group_3__2__Impl rule__MultipleCondition__Group_3__3
            {
            pushFollow(FOLLOW_7);
            rule__MultipleCondition__Group_3__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group_3__3();

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
    // $ANTLR end "rule__MultipleCondition__Group_3__2"


    // $ANTLR start "rule__MultipleCondition__Group_3__2__Impl"
    // InternalMyDsl.g:1916:1: rule__MultipleCondition__Group_3__2__Impl : ( ( rule__MultipleCondition__ExpressionAssignment_3_2 ) ) ;
    public final void rule__MultipleCondition__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1920:1: ( ( ( rule__MultipleCondition__ExpressionAssignment_3_2 ) ) )
            // InternalMyDsl.g:1921:1: ( ( rule__MultipleCondition__ExpressionAssignment_3_2 ) )
            {
            // InternalMyDsl.g:1921:1: ( ( rule__MultipleCondition__ExpressionAssignment_3_2 ) )
            // InternalMyDsl.g:1922:2: ( rule__MultipleCondition__ExpressionAssignment_3_2 )
            {
             before(grammarAccess.getMultipleConditionAccess().getExpressionAssignment_3_2()); 
            // InternalMyDsl.g:1923:2: ( rule__MultipleCondition__ExpressionAssignment_3_2 )
            // InternalMyDsl.g:1923:3: rule__MultipleCondition__ExpressionAssignment_3_2
            {
            pushFollow(FOLLOW_2);
            rule__MultipleCondition__ExpressionAssignment_3_2();

            state._fsp--;


            }

             after(grammarAccess.getMultipleConditionAccess().getExpressionAssignment_3_2()); 

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
    // $ANTLR end "rule__MultipleCondition__Group_3__2__Impl"


    // $ANTLR start "rule__MultipleCondition__Group_3__3"
    // InternalMyDsl.g:1931:1: rule__MultipleCondition__Group_3__3 : rule__MultipleCondition__Group_3__3__Impl ;
    public final void rule__MultipleCondition__Group_3__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1935:1: ( rule__MultipleCondition__Group_3__3__Impl )
            // InternalMyDsl.g:1936:2: rule__MultipleCondition__Group_3__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MultipleCondition__Group_3__3__Impl();

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
    // $ANTLR end "rule__MultipleCondition__Group_3__3"


    // $ANTLR start "rule__MultipleCondition__Group_3__3__Impl"
    // InternalMyDsl.g:1942:1: rule__MultipleCondition__Group_3__3__Impl : ( ')' ) ;
    public final void rule__MultipleCondition__Group_3__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1946:1: ( ( ')' ) )
            // InternalMyDsl.g:1947:1: ( ')' )
            {
            // InternalMyDsl.g:1947:1: ( ')' )
            // InternalMyDsl.g:1948:2: ')'
            {
             before(grammarAccess.getMultipleConditionAccess().getRightParenthesisKeyword_3_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMultipleConditionAccess().getRightParenthesisKeyword_3_3()); 

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
    // $ANTLR end "rule__MultipleCondition__Group_3__3__Impl"


    // $ANTLR start "rule__Application__Group__0"
    // InternalMyDsl.g:1958:1: rule__Application__Group__0 : rule__Application__Group__0__Impl rule__Application__Group__1 ;
    public final void rule__Application__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1962:1: ( rule__Application__Group__0__Impl rule__Application__Group__1 )
            // InternalMyDsl.g:1963:2: rule__Application__Group__0__Impl rule__Application__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Application__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__1();

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
    // $ANTLR end "rule__Application__Group__0"


    // $ANTLR start "rule__Application__Group__0__Impl"
    // InternalMyDsl.g:1970:1: rule__Application__Group__0__Impl : ( '(' ) ;
    public final void rule__Application__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1974:1: ( ( '(' ) )
            // InternalMyDsl.g:1975:1: ( '(' )
            {
            // InternalMyDsl.g:1975:1: ( '(' )
            // InternalMyDsl.g:1976:2: '('
            {
             before(grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getLeftParenthesisKeyword_0()); 

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
    // $ANTLR end "rule__Application__Group__0__Impl"


    // $ANTLR start "rule__Application__Group__1"
    // InternalMyDsl.g:1985:1: rule__Application__Group__1 : rule__Application__Group__1__Impl rule__Application__Group__2 ;
    public final void rule__Application__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1989:1: ( rule__Application__Group__1__Impl rule__Application__Group__2 )
            // InternalMyDsl.g:1990:2: rule__Application__Group__1__Impl rule__Application__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Application__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__2();

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
    // $ANTLR end "rule__Application__Group__1"


    // $ANTLR start "rule__Application__Group__1__Impl"
    // InternalMyDsl.g:1997:1: rule__Application__Group__1__Impl : ( ( rule__Application__ExpressionAssignment_1 ) ) ;
    public final void rule__Application__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2001:1: ( ( ( rule__Application__ExpressionAssignment_1 ) ) )
            // InternalMyDsl.g:2002:1: ( ( rule__Application__ExpressionAssignment_1 ) )
            {
            // InternalMyDsl.g:2002:1: ( ( rule__Application__ExpressionAssignment_1 ) )
            // InternalMyDsl.g:2003:2: ( rule__Application__ExpressionAssignment_1 )
            {
             before(grammarAccess.getApplicationAccess().getExpressionAssignment_1()); 
            // InternalMyDsl.g:2004:2: ( rule__Application__ExpressionAssignment_1 )
            // InternalMyDsl.g:2004:3: rule__Application__ExpressionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Application__ExpressionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getApplicationAccess().getExpressionAssignment_1()); 

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
    // $ANTLR end "rule__Application__Group__1__Impl"


    // $ANTLR start "rule__Application__Group__2"
    // InternalMyDsl.g:2012:1: rule__Application__Group__2 : rule__Application__Group__2__Impl rule__Application__Group__3 ;
    public final void rule__Application__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2016:1: ( rule__Application__Group__2__Impl rule__Application__Group__3 )
            // InternalMyDsl.g:2017:2: rule__Application__Group__2__Impl rule__Application__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Application__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Application__Group__3();

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
    // $ANTLR end "rule__Application__Group__2"


    // $ANTLR start "rule__Application__Group__2__Impl"
    // InternalMyDsl.g:2024:1: rule__Application__Group__2__Impl : ( ( rule__Application__ExpressionsAssignment_2 )* ) ;
    public final void rule__Application__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2028:1: ( ( ( rule__Application__ExpressionsAssignment_2 )* ) )
            // InternalMyDsl.g:2029:1: ( ( rule__Application__ExpressionsAssignment_2 )* )
            {
            // InternalMyDsl.g:2029:1: ( ( rule__Application__ExpressionsAssignment_2 )* )
            // InternalMyDsl.g:2030:2: ( rule__Application__ExpressionsAssignment_2 )*
            {
             before(grammarAccess.getApplicationAccess().getExpressionsAssignment_2()); 
            // InternalMyDsl.g:2031:2: ( rule__Application__ExpressionsAssignment_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_BOOL && LA15_0<=RULE_LETTER)||LA15_0==36) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMyDsl.g:2031:3: rule__Application__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Application__ExpressionsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getApplicationAccess().getExpressionsAssignment_2()); 

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
    // $ANTLR end "rule__Application__Group__2__Impl"


    // $ANTLR start "rule__Application__Group__3"
    // InternalMyDsl.g:2039:1: rule__Application__Group__3 : rule__Application__Group__3__Impl ;
    public final void rule__Application__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2043:1: ( rule__Application__Group__3__Impl )
            // InternalMyDsl.g:2044:2: rule__Application__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Application__Group__3__Impl();

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
    // $ANTLR end "rule__Application__Group__3"


    // $ANTLR start "rule__Application__Group__3__Impl"
    // InternalMyDsl.g:2050:1: rule__Application__Group__3__Impl : ( ')' ) ;
    public final void rule__Application__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2054:1: ( ( ')' ) )
            // InternalMyDsl.g:2055:1: ( ')' )
            {
            // InternalMyDsl.g:2055:1: ( ')' )
            // InternalMyDsl.g:2056:2: ')'
            {
             before(grammarAccess.getApplicationAccess().getRightParenthesisKeyword_3()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getApplicationAccess().getRightParenthesisKeyword_3()); 

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
    // $ANTLR end "rule__Application__Group__3__Impl"


    // $ANTLR start "rule__Set__Group__0"
    // InternalMyDsl.g:2066:1: rule__Set__Group__0 : rule__Set__Group__0__Impl rule__Set__Group__1 ;
    public final void rule__Set__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2070:1: ( rule__Set__Group__0__Impl rule__Set__Group__1 )
            // InternalMyDsl.g:2071:2: rule__Set__Group__0__Impl rule__Set__Group__1
            {
            pushFollow(FOLLOW_19);
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
    // InternalMyDsl.g:2078:1: rule__Set__Group__0__Impl : ( '(' ) ;
    public final void rule__Set__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2082:1: ( ( '(' ) )
            // InternalMyDsl.g:2083:1: ( '(' )
            {
            // InternalMyDsl.g:2083:1: ( '(' )
            // InternalMyDsl.g:2084:2: '('
            {
             before(grammarAccess.getSetAccess().getLeftParenthesisKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:2093:1: rule__Set__Group__1 : rule__Set__Group__1__Impl rule__Set__Group__2 ;
    public final void rule__Set__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2097:1: ( rule__Set__Group__1__Impl rule__Set__Group__2 )
            // InternalMyDsl.g:2098:2: rule__Set__Group__1__Impl rule__Set__Group__2
            {
            pushFollow(FOLLOW_20);
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
    // InternalMyDsl.g:2105:1: rule__Set__Group__1__Impl : ( 'set!' ) ;
    public final void rule__Set__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2109:1: ( ( 'set!' ) )
            // InternalMyDsl.g:2110:1: ( 'set!' )
            {
            // InternalMyDsl.g:2110:1: ( 'set!' )
            // InternalMyDsl.g:2111:2: 'set!'
            {
             before(grammarAccess.getSetAccess().getSetKeyword_1()); 
            match(input,41,FOLLOW_2); 
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
    // InternalMyDsl.g:2120:1: rule__Set__Group__2 : rule__Set__Group__2__Impl rule__Set__Group__3 ;
    public final void rule__Set__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2124:1: ( rule__Set__Group__2__Impl rule__Set__Group__3 )
            // InternalMyDsl.g:2125:2: rule__Set__Group__2__Impl rule__Set__Group__3
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
    // InternalMyDsl.g:2132:1: rule__Set__Group__2__Impl : ( ( rule__Set__ConsAssignment_2 ) ) ;
    public final void rule__Set__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2136:1: ( ( ( rule__Set__ConsAssignment_2 ) ) )
            // InternalMyDsl.g:2137:1: ( ( rule__Set__ConsAssignment_2 ) )
            {
            // InternalMyDsl.g:2137:1: ( ( rule__Set__ConsAssignment_2 ) )
            // InternalMyDsl.g:2138:2: ( rule__Set__ConsAssignment_2 )
            {
             before(grammarAccess.getSetAccess().getConsAssignment_2()); 
            // InternalMyDsl.g:2139:2: ( rule__Set__ConsAssignment_2 )
            // InternalMyDsl.g:2139:3: rule__Set__ConsAssignment_2
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
    // InternalMyDsl.g:2147:1: rule__Set__Group__3 : rule__Set__Group__3__Impl rule__Set__Group__4 ;
    public final void rule__Set__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2151:1: ( rule__Set__Group__3__Impl rule__Set__Group__4 )
            // InternalMyDsl.g:2152:2: rule__Set__Group__3__Impl rule__Set__Group__4
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
    // InternalMyDsl.g:2159:1: rule__Set__Group__3__Impl : ( ( rule__Set__ExpressionAssignment_3 ) ) ;
    public final void rule__Set__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2163:1: ( ( ( rule__Set__ExpressionAssignment_3 ) ) )
            // InternalMyDsl.g:2164:1: ( ( rule__Set__ExpressionAssignment_3 ) )
            {
            // InternalMyDsl.g:2164:1: ( ( rule__Set__ExpressionAssignment_3 ) )
            // InternalMyDsl.g:2165:2: ( rule__Set__ExpressionAssignment_3 )
            {
             before(grammarAccess.getSetAccess().getExpressionAssignment_3()); 
            // InternalMyDsl.g:2166:2: ( rule__Set__ExpressionAssignment_3 )
            // InternalMyDsl.g:2166:3: rule__Set__ExpressionAssignment_3
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
    // InternalMyDsl.g:2174:1: rule__Set__Group__4 : rule__Set__Group__4__Impl ;
    public final void rule__Set__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2178:1: ( rule__Set__Group__4__Impl )
            // InternalMyDsl.g:2179:2: rule__Set__Group__4__Impl
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
    // InternalMyDsl.g:2185:1: rule__Set__Group__4__Impl : ( ')' ) ;
    public final void rule__Set__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2189:1: ( ( ')' ) )
            // InternalMyDsl.g:2190:1: ( ')' )
            {
            // InternalMyDsl.g:2190:1: ( ')' )
            // InternalMyDsl.g:2191:2: ')'
            {
             before(grammarAccess.getSetAccess().getRightParenthesisKeyword_4()); 
            match(input,38,FOLLOW_2); 
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
    // InternalMyDsl.g:2201:1: rule__Conditional__Group__0 : rule__Conditional__Group__0__Impl rule__Conditional__Group__1 ;
    public final void rule__Conditional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2205:1: ( rule__Conditional__Group__0__Impl rule__Conditional__Group__1 )
            // InternalMyDsl.g:2206:2: rule__Conditional__Group__0__Impl rule__Conditional__Group__1
            {
            pushFollow(FOLLOW_21);
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
    // InternalMyDsl.g:2213:1: rule__Conditional__Group__0__Impl : ( '(' ) ;
    public final void rule__Conditional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2217:1: ( ( '(' ) )
            // InternalMyDsl.g:2218:1: ( '(' )
            {
            // InternalMyDsl.g:2218:1: ( '(' )
            // InternalMyDsl.g:2219:2: '('
            {
             before(grammarAccess.getConditionalAccess().getLeftParenthesisKeyword_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalMyDsl.g:2228:1: rule__Conditional__Group__1 : rule__Conditional__Group__1__Impl rule__Conditional__Group__2 ;
    public final void rule__Conditional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2232:1: ( rule__Conditional__Group__1__Impl rule__Conditional__Group__2 )
            // InternalMyDsl.g:2233:2: rule__Conditional__Group__1__Impl rule__Conditional__Group__2
            {
            pushFollow(FOLLOW_13);
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
    // InternalMyDsl.g:2240:1: rule__Conditional__Group__1__Impl : ( 'if' ) ;
    public final void rule__Conditional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2244:1: ( ( 'if' ) )
            // InternalMyDsl.g:2245:1: ( 'if' )
            {
            // InternalMyDsl.g:2245:1: ( 'if' )
            // InternalMyDsl.g:2246:2: 'if'
            {
             before(grammarAccess.getConditionalAccess().getIfKeyword_1()); 
            match(input,42,FOLLOW_2); 
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
    // InternalMyDsl.g:2255:1: rule__Conditional__Group__2 : rule__Conditional__Group__2__Impl rule__Conditional__Group__3 ;
    public final void rule__Conditional__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2259:1: ( rule__Conditional__Group__2__Impl rule__Conditional__Group__3 )
            // InternalMyDsl.g:2260:2: rule__Conditional__Group__2__Impl rule__Conditional__Group__3
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
    // InternalMyDsl.g:2267:1: rule__Conditional__Group__2__Impl : ( ( rule__Conditional__ConditionAssignment_2 ) ) ;
    public final void rule__Conditional__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2271:1: ( ( ( rule__Conditional__ConditionAssignment_2 ) ) )
            // InternalMyDsl.g:2272:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            {
            // InternalMyDsl.g:2272:1: ( ( rule__Conditional__ConditionAssignment_2 ) )
            // InternalMyDsl.g:2273:2: ( rule__Conditional__ConditionAssignment_2 )
            {
             before(grammarAccess.getConditionalAccess().getConditionAssignment_2()); 
            // InternalMyDsl.g:2274:2: ( rule__Conditional__ConditionAssignment_2 )
            // InternalMyDsl.g:2274:3: rule__Conditional__ConditionAssignment_2
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
    // InternalMyDsl.g:2282:1: rule__Conditional__Group__3 : rule__Conditional__Group__3__Impl rule__Conditional__Group__4 ;
    public final void rule__Conditional__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2286:1: ( rule__Conditional__Group__3__Impl rule__Conditional__Group__4 )
            // InternalMyDsl.g:2287:2: rule__Conditional__Group__3__Impl rule__Conditional__Group__4
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
    // InternalMyDsl.g:2294:1: rule__Conditional__Group__3__Impl : ( ( rule__Conditional__IftrueAssignment_3 ) ) ;
    public final void rule__Conditional__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2298:1: ( ( ( rule__Conditional__IftrueAssignment_3 ) ) )
            // InternalMyDsl.g:2299:1: ( ( rule__Conditional__IftrueAssignment_3 ) )
            {
            // InternalMyDsl.g:2299:1: ( ( rule__Conditional__IftrueAssignment_3 ) )
            // InternalMyDsl.g:2300:2: ( rule__Conditional__IftrueAssignment_3 )
            {
             before(grammarAccess.getConditionalAccess().getIftrueAssignment_3()); 
            // InternalMyDsl.g:2301:2: ( rule__Conditional__IftrueAssignment_3 )
            // InternalMyDsl.g:2301:3: rule__Conditional__IftrueAssignment_3
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
    // InternalMyDsl.g:2309:1: rule__Conditional__Group__4 : rule__Conditional__Group__4__Impl rule__Conditional__Group__5 ;
    public final void rule__Conditional__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2313:1: ( rule__Conditional__Group__4__Impl rule__Conditional__Group__5 )
            // InternalMyDsl.g:2314:2: rule__Conditional__Group__4__Impl rule__Conditional__Group__5
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
    // InternalMyDsl.g:2321:1: rule__Conditional__Group__4__Impl : ( ( rule__Conditional__ElseAssignment_4 )? ) ;
    public final void rule__Conditional__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2325:1: ( ( ( rule__Conditional__ElseAssignment_4 )? ) )
            // InternalMyDsl.g:2326:1: ( ( rule__Conditional__ElseAssignment_4 )? )
            {
            // InternalMyDsl.g:2326:1: ( ( rule__Conditional__ElseAssignment_4 )? )
            // InternalMyDsl.g:2327:2: ( rule__Conditional__ElseAssignment_4 )?
            {
             before(grammarAccess.getConditionalAccess().getElseAssignment_4()); 
            // InternalMyDsl.g:2328:2: ( rule__Conditional__ElseAssignment_4 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_BOOL && LA16_0<=RULE_LETTER)||LA16_0==36) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:2328:3: rule__Conditional__ElseAssignment_4
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
    // InternalMyDsl.g:2336:1: rule__Conditional__Group__5 : rule__Conditional__Group__5__Impl ;
    public final void rule__Conditional__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2340:1: ( rule__Conditional__Group__5__Impl )
            // InternalMyDsl.g:2341:2: rule__Conditional__Group__5__Impl
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
    // InternalMyDsl.g:2347:1: rule__Conditional__Group__5__Impl : ( ')' ) ;
    public final void rule__Conditional__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2351:1: ( ( ')' ) )
            // InternalMyDsl.g:2352:1: ( ')' )
            {
            // InternalMyDsl.g:2352:1: ( ')' )
            // InternalMyDsl.g:2353:2: ')'
            {
             before(grammarAccess.getConditionalAccess().getRightParenthesisKeyword_5()); 
            match(input,38,FOLLOW_2); 
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


    // $ANTLR start "rule__Operation__Group__0"
    // InternalMyDsl.g:2363:1: rule__Operation__Group__0 : rule__Operation__Group__0__Impl rule__Operation__Group__1 ;
    public final void rule__Operation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2367:1: ( rule__Operation__Group__0__Impl rule__Operation__Group__1 )
            // InternalMyDsl.g:2368:2: rule__Operation__Group__0__Impl rule__Operation__Group__1
            {
            pushFollow(FOLLOW_22);
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
    // InternalMyDsl.g:2375:1: rule__Operation__Group__0__Impl : ( ( rule__Operation__OperationAssignment_0 ) ) ;
    public final void rule__Operation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2379:1: ( ( ( rule__Operation__OperationAssignment_0 ) ) )
            // InternalMyDsl.g:2380:1: ( ( rule__Operation__OperationAssignment_0 ) )
            {
            // InternalMyDsl.g:2380:1: ( ( rule__Operation__OperationAssignment_0 ) )
            // InternalMyDsl.g:2381:2: ( rule__Operation__OperationAssignment_0 )
            {
             before(grammarAccess.getOperationAccess().getOperationAssignment_0()); 
            // InternalMyDsl.g:2382:2: ( rule__Operation__OperationAssignment_0 )
            // InternalMyDsl.g:2382:3: rule__Operation__OperationAssignment_0
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
    // InternalMyDsl.g:2390:1: rule__Operation__Group__1 : rule__Operation__Group__1__Impl rule__Operation__Group__2 ;
    public final void rule__Operation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2394:1: ( rule__Operation__Group__1__Impl rule__Operation__Group__2 )
            // InternalMyDsl.g:2395:2: rule__Operation__Group__1__Impl rule__Operation__Group__2
            {
            pushFollow(FOLLOW_23);
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
    // InternalMyDsl.g:2402:1: rule__Operation__Group__1__Impl : ( ( rule__Operation__OperatorAssignment_1 ) ) ;
    public final void rule__Operation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2406:1: ( ( ( rule__Operation__OperatorAssignment_1 ) ) )
            // InternalMyDsl.g:2407:1: ( ( rule__Operation__OperatorAssignment_1 ) )
            {
            // InternalMyDsl.g:2407:1: ( ( rule__Operation__OperatorAssignment_1 ) )
            // InternalMyDsl.g:2408:2: ( rule__Operation__OperatorAssignment_1 )
            {
             before(grammarAccess.getOperationAccess().getOperatorAssignment_1()); 
            // InternalMyDsl.g:2409:2: ( rule__Operation__OperatorAssignment_1 )
            // InternalMyDsl.g:2409:3: rule__Operation__OperatorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Operation__OperatorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOperationAccess().getOperatorAssignment_1()); 

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
    // InternalMyDsl.g:2417:1: rule__Operation__Group__2 : rule__Operation__Group__2__Impl rule__Operation__Group__3 ;
    public final void rule__Operation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2421:1: ( rule__Operation__Group__2__Impl rule__Operation__Group__3 )
            // InternalMyDsl.g:2422:2: rule__Operation__Group__2__Impl rule__Operation__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__Operation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__3();

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
    // InternalMyDsl.g:2429:1: rule__Operation__Group__2__Impl : ( '\\\\s' ) ;
    public final void rule__Operation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2433:1: ( ( '\\\\s' ) )
            // InternalMyDsl.g:2434:1: ( '\\\\s' )
            {
            // InternalMyDsl.g:2434:1: ( '\\\\s' )
            // InternalMyDsl.g:2435:2: '\\\\s'
            {
             before(grammarAccess.getOperationAccess().getSKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getSKeyword_2()); 

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


    // $ANTLR start "rule__Operation__Group__3"
    // InternalMyDsl.g:2444:1: rule__Operation__Group__3 : rule__Operation__Group__3__Impl rule__Operation__Group__4 ;
    public final void rule__Operation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2448:1: ( rule__Operation__Group__3__Impl rule__Operation__Group__4 )
            // InternalMyDsl.g:2449:2: rule__Operation__Group__3__Impl rule__Operation__Group__4
            {
            pushFollow(FOLLOW_24);
            rule__Operation__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__4();

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
    // $ANTLR end "rule__Operation__Group__3"


    // $ANTLR start "rule__Operation__Group__3__Impl"
    // InternalMyDsl.g:2456:1: rule__Operation__Group__3__Impl : ( ( rule__Operation__NumbAssignment_3 )* ) ;
    public final void rule__Operation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2460:1: ( ( ( rule__Operation__NumbAssignment_3 )* ) )
            // InternalMyDsl.g:2461:1: ( ( rule__Operation__NumbAssignment_3 )* )
            {
            // InternalMyDsl.g:2461:1: ( ( rule__Operation__NumbAssignment_3 )* )
            // InternalMyDsl.g:2462:2: ( rule__Operation__NumbAssignment_3 )*
            {
             before(grammarAccess.getOperationAccess().getNumbAssignment_3()); 
            // InternalMyDsl.g:2463:2: ( rule__Operation__NumbAssignment_3 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_NUMBER) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalMyDsl.g:2463:3: rule__Operation__NumbAssignment_3
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Operation__NumbAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getNumbAssignment_3()); 

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
    // $ANTLR end "rule__Operation__Group__3__Impl"


    // $ANTLR start "rule__Operation__Group__4"
    // InternalMyDsl.g:2471:1: rule__Operation__Group__4 : rule__Operation__Group__4__Impl rule__Operation__Group__5 ;
    public final void rule__Operation__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2475:1: ( rule__Operation__Group__4__Impl rule__Operation__Group__5 )
            // InternalMyDsl.g:2476:2: rule__Operation__Group__4__Impl rule__Operation__Group__5
            {
            pushFollow(FOLLOW_26);
            rule__Operation__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__5();

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
    // $ANTLR end "rule__Operation__Group__4"


    // $ANTLR start "rule__Operation__Group__4__Impl"
    // InternalMyDsl.g:2483:1: rule__Operation__Group__4__Impl : ( '\\\\s' ) ;
    public final void rule__Operation__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2487:1: ( ( '\\\\s' ) )
            // InternalMyDsl.g:2488:1: ( '\\\\s' )
            {
            // InternalMyDsl.g:2488:1: ( '\\\\s' )
            // InternalMyDsl.g:2489:2: '\\\\s'
            {
             before(grammarAccess.getOperationAccess().getSKeyword_4()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getSKeyword_4()); 

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
    // $ANTLR end "rule__Operation__Group__4__Impl"


    // $ANTLR start "rule__Operation__Group__5"
    // InternalMyDsl.g:2498:1: rule__Operation__Group__5 : rule__Operation__Group__5__Impl rule__Operation__Group__6 ;
    public final void rule__Operation__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2502:1: ( rule__Operation__Group__5__Impl rule__Operation__Group__6 )
            // InternalMyDsl.g:2503:2: rule__Operation__Group__5__Impl rule__Operation__Group__6
            {
            pushFollow(FOLLOW_26);
            rule__Operation__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Operation__Group__6();

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
    // $ANTLR end "rule__Operation__Group__5"


    // $ANTLR start "rule__Operation__Group__5__Impl"
    // InternalMyDsl.g:2510:1: rule__Operation__Group__5__Impl : ( ( rule__Operation__Numb2Assignment_5 )* ) ;
    public final void rule__Operation__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2514:1: ( ( ( rule__Operation__Numb2Assignment_5 )* ) )
            // InternalMyDsl.g:2515:1: ( ( rule__Operation__Numb2Assignment_5 )* )
            {
            // InternalMyDsl.g:2515:1: ( ( rule__Operation__Numb2Assignment_5 )* )
            // InternalMyDsl.g:2516:2: ( rule__Operation__Numb2Assignment_5 )*
            {
             before(grammarAccess.getOperationAccess().getNumb2Assignment_5()); 
            // InternalMyDsl.g:2517:2: ( rule__Operation__Numb2Assignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_NUMBER) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:2517:3: rule__Operation__Numb2Assignment_5
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Operation__Numb2Assignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getOperationAccess().getNumb2Assignment_5()); 

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
    // $ANTLR end "rule__Operation__Group__5__Impl"


    // $ANTLR start "rule__Operation__Group__6"
    // InternalMyDsl.g:2525:1: rule__Operation__Group__6 : rule__Operation__Group__6__Impl ;
    public final void rule__Operation__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2529:1: ( rule__Operation__Group__6__Impl )
            // InternalMyDsl.g:2530:2: rule__Operation__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Operation__Group__6__Impl();

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
    // $ANTLR end "rule__Operation__Group__6"


    // $ANTLR start "rule__Operation__Group__6__Impl"
    // InternalMyDsl.g:2536:1: rule__Operation__Group__6__Impl : ( ')' ) ;
    public final void rule__Operation__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2540:1: ( ( ')' ) )
            // InternalMyDsl.g:2541:1: ( ')' )
            {
            // InternalMyDsl.g:2541:1: ( ')' )
            // InternalMyDsl.g:2542:2: ')'
            {
             before(grammarAccess.getOperationAccess().getRightParenthesisKeyword_6()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getRightParenthesisKeyword_6()); 

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
    // $ANTLR end "rule__Operation__Group__6__Impl"


    // $ANTLR start "rule__Subsequent__Group__0"
    // InternalMyDsl.g:2552:1: rule__Subsequent__Group__0 : rule__Subsequent__Group__0__Impl rule__Subsequent__Group__1 ;
    public final void rule__Subsequent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2556:1: ( rule__Subsequent__Group__0__Impl rule__Subsequent__Group__1 )
            // InternalMyDsl.g:2557:2: rule__Subsequent__Group__0__Impl rule__Subsequent__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__Subsequent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Subsequent__Group__1();

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
    // $ANTLR end "rule__Subsequent__Group__0"


    // $ANTLR start "rule__Subsequent__Group__0__Impl"
    // InternalMyDsl.g:2564:1: rule__Subsequent__Group__0__Impl : ( () ) ;
    public final void rule__Subsequent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2568:1: ( ( () ) )
            // InternalMyDsl.g:2569:1: ( () )
            {
            // InternalMyDsl.g:2569:1: ( () )
            // InternalMyDsl.g:2570:2: ()
            {
             before(grammarAccess.getSubsequentAccess().getSubsequentAction_0()); 
            // InternalMyDsl.g:2571:2: ()
            // InternalMyDsl.g:2571:3: 
            {
            }

             after(grammarAccess.getSubsequentAccess().getSubsequentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Subsequent__Group__0__Impl"


    // $ANTLR start "rule__Subsequent__Group__1"
    // InternalMyDsl.g:2579:1: rule__Subsequent__Group__1 : rule__Subsequent__Group__1__Impl ;
    public final void rule__Subsequent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2583:1: ( rule__Subsequent__Group__1__Impl )
            // InternalMyDsl.g:2584:2: rule__Subsequent__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Subsequent__Group__1__Impl();

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
    // $ANTLR end "rule__Subsequent__Group__1"


    // $ANTLR start "rule__Subsequent__Group__1__Impl"
    // InternalMyDsl.g:2590:1: rule__Subsequent__Group__1__Impl : ( ( rule__Subsequent__Alternatives_1 ) ) ;
    public final void rule__Subsequent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2594:1: ( ( ( rule__Subsequent__Alternatives_1 ) ) )
            // InternalMyDsl.g:2595:1: ( ( rule__Subsequent__Alternatives_1 ) )
            {
            // InternalMyDsl.g:2595:1: ( ( rule__Subsequent__Alternatives_1 ) )
            // InternalMyDsl.g:2596:2: ( rule__Subsequent__Alternatives_1 )
            {
             before(grammarAccess.getSubsequentAccess().getAlternatives_1()); 
            // InternalMyDsl.g:2597:2: ( rule__Subsequent__Alternatives_1 )
            // InternalMyDsl.g:2597:3: rule__Subsequent__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__Subsequent__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getSubsequentAccess().getAlternatives_1()); 

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
    // $ANTLR end "rule__Subsequent__Group__1__Impl"


    // $ANTLR start "rule__Program__ProgramAssignment"
    // InternalMyDsl.g:2606:1: rule__Program__ProgramAssignment : ( ruleForm ) ;
    public final void rule__Program__ProgramAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2610:1: ( ( ruleForm ) )
            // InternalMyDsl.g:2611:2: ( ruleForm )
            {
            // InternalMyDsl.g:2611:2: ( ruleForm )
            // InternalMyDsl.g:2612:3: ruleForm
            {
             before(grammarAccess.getProgramAccess().getProgramFormParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleForm();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getProgramFormParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__ProgramAssignment"


    // $ANTLR start "rule__Form__DefinitionAssignment_0"
    // InternalMyDsl.g:2621:1: rule__Form__DefinitionAssignment_0 : ( ruleDefinition ) ;
    public final void rule__Form__DefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2625:1: ( ( ruleDefinition ) )
            // InternalMyDsl.g:2626:2: ( ruleDefinition )
            {
            // InternalMyDsl.g:2626:2: ( ruleDefinition )
            // InternalMyDsl.g:2627:3: ruleDefinition
            {
             before(grammarAccess.getFormAccess().getDefinitionDefinitionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDefinition();

            state._fsp--;

             after(grammarAccess.getFormAccess().getDefinitionDefinitionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Form__DefinitionAssignment_0"


    // $ANTLR start "rule__Form__ExpressionAssignment_1"
    // InternalMyDsl.g:2636:1: rule__Form__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Form__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2640:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2641:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2641:2: ( ruleExpression )
            // InternalMyDsl.g:2642:3: ruleExpression
            {
             before(grammarAccess.getFormAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getFormAccess().getExpressionExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Form__ExpressionAssignment_1"


    // $ANTLR start "rule__Definition__VariableDefinitionAssignment"
    // InternalMyDsl.g:2651:1: rule__Definition__VariableDefinitionAssignment : ( ruleVariableDefinition ) ;
    public final void rule__Definition__VariableDefinitionAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2655:1: ( ( ruleVariableDefinition ) )
            // InternalMyDsl.g:2656:2: ( ruleVariableDefinition )
            {
            // InternalMyDsl.g:2656:2: ( ruleVariableDefinition )
            // InternalMyDsl.g:2657:3: ruleVariableDefinition
            {
             before(grammarAccess.getDefinitionAccess().getVariableDefinitionVariableDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVariableDefinition();

            state._fsp--;

             after(grammarAccess.getDefinitionAccess().getVariableDefinitionVariableDefinitionParserRuleCall_0()); 

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
    // $ANTLR end "rule__Definition__VariableDefinitionAssignment"


    // $ANTLR start "rule__VariableDefinition__VariableAssignment_0_2"
    // InternalMyDsl.g:2666:1: rule__VariableDefinition__VariableAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__VariableAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2670:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2671:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2671:2: ( RULE_ID )
            // InternalMyDsl.g:2672:3: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getVariableIDTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__VariableDefinition__VariableAssignment_0_2"


    // $ANTLR start "rule__VariableDefinition__ExpressionAssignment_0_3"
    // InternalMyDsl.g:2681:1: rule__VariableDefinition__ExpressionAssignment_0_3 : ( ruleExpression ) ;
    public final void rule__VariableDefinition__ExpressionAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2685:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2686:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2686:2: ( ruleExpression )
            // InternalMyDsl.g:2687:3: ruleExpression
            {
             before(grammarAccess.getVariableDefinitionAccess().getExpressionExpressionParserRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionAccess().getExpressionExpressionParserRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__VariableDefinition__ExpressionAssignment_0_3"


    // $ANTLR start "rule__VariableDefinition__VariableAssignment_1_3"
    // InternalMyDsl.g:2696:1: rule__VariableDefinition__VariableAssignment_1_3 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__VariableAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2700:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2701:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2701:2: ( RULE_ID )
            // InternalMyDsl.g:2702:3: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableIDTerminalRuleCall_1_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getVariableIDTerminalRuleCall_1_3_0()); 

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
    // $ANTLR end "rule__VariableDefinition__VariableAssignment_1_3"


    // $ANTLR start "rule__VariableDefinition__VariablesAssignment_1_4"
    // InternalMyDsl.g:2711:1: rule__VariableDefinition__VariablesAssignment_1_4 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__VariablesAssignment_1_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2715:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2716:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2716:2: ( RULE_ID )
            // InternalMyDsl.g:2717:3: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariablesIDTerminalRuleCall_1_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getVariablesIDTerminalRuleCall_1_4_0()); 

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
    // $ANTLR end "rule__VariableDefinition__VariablesAssignment_1_4"


    // $ANTLR start "rule__VariableDefinition__BodyAssignment_1_6"
    // InternalMyDsl.g:2726:1: rule__VariableDefinition__BodyAssignment_1_6 : ( ruleBody ) ;
    public final void rule__VariableDefinition__BodyAssignment_1_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2730:1: ( ( ruleBody ) )
            // InternalMyDsl.g:2731:2: ( ruleBody )
            {
            // InternalMyDsl.g:2731:2: ( ruleBody )
            // InternalMyDsl.g:2732:3: ruleBody
            {
             before(grammarAccess.getVariableDefinitionAccess().getBodyBodyParserRuleCall_1_6_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionAccess().getBodyBodyParserRuleCall_1_6_0()); 

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
    // $ANTLR end "rule__VariableDefinition__BodyAssignment_1_6"


    // $ANTLR start "rule__VariableDefinition__VariableAssignment_2_3"
    // InternalMyDsl.g:2741:1: rule__VariableDefinition__VariableAssignment_2_3 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__VariableAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2745:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2746:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2746:2: ( RULE_ID )
            // InternalMyDsl.g:2747:3: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariableIDTerminalRuleCall_2_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getVariableIDTerminalRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__VariableDefinition__VariableAssignment_2_3"


    // $ANTLR start "rule__VariableDefinition__VariablesAssignment_2_4"
    // InternalMyDsl.g:2756:1: rule__VariableDefinition__VariablesAssignment_2_4 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__VariablesAssignment_2_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2760:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2761:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2761:2: ( RULE_ID )
            // InternalMyDsl.g:2762:3: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getVariablesIDTerminalRuleCall_2_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getVariablesIDTerminalRuleCall_2_4_0()); 

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
    // $ANTLR end "rule__VariableDefinition__VariablesAssignment_2_4"


    // $ANTLR start "rule__VariableDefinition__VarAssignment_2_6"
    // InternalMyDsl.g:2771:1: rule__VariableDefinition__VarAssignment_2_6 : ( RULE_ID ) ;
    public final void rule__VariableDefinition__VarAssignment_2_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2775:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2776:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2776:2: ( RULE_ID )
            // InternalMyDsl.g:2777:3: RULE_ID
            {
             before(grammarAccess.getVariableDefinitionAccess().getVarIDTerminalRuleCall_2_6_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableDefinitionAccess().getVarIDTerminalRuleCall_2_6_0()); 

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
    // $ANTLR end "rule__VariableDefinition__VarAssignment_2_6"


    // $ANTLR start "rule__VariableDefinition__BodyAssignment_2_8"
    // InternalMyDsl.g:2786:1: rule__VariableDefinition__BodyAssignment_2_8 : ( ruleBody ) ;
    public final void rule__VariableDefinition__BodyAssignment_2_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2790:1: ( ( ruleBody ) )
            // InternalMyDsl.g:2791:2: ( ruleBody )
            {
            // InternalMyDsl.g:2791:2: ( ruleBody )
            // InternalMyDsl.g:2792:3: ruleBody
            {
             before(grammarAccess.getVariableDefinitionAccess().getBodyBodyParserRuleCall_2_8_0()); 
            pushFollow(FOLLOW_2);
            ruleBody();

            state._fsp--;

             after(grammarAccess.getVariableDefinitionAccess().getBodyBodyParserRuleCall_2_8_0()); 

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
    // $ANTLR end "rule__VariableDefinition__BodyAssignment_2_8"


    // $ANTLR start "rule__Body__DefinitionAssignment_0"
    // InternalMyDsl.g:2801:1: rule__Body__DefinitionAssignment_0 : ( ruleDefinition ) ;
    public final void rule__Body__DefinitionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2805:1: ( ( ruleDefinition ) )
            // InternalMyDsl.g:2806:2: ( ruleDefinition )
            {
            // InternalMyDsl.g:2806:2: ( ruleDefinition )
            // InternalMyDsl.g:2807:3: ruleDefinition
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
    // InternalMyDsl.g:2816:1: rule__Body__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Body__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2820:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2821:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2821:2: ( ruleExpression )
            // InternalMyDsl.g:2822:3: ruleExpression
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
    // InternalMyDsl.g:2831:1: rule__Expression__ConstantAssignment_0 : ( ruleConstant ) ;
    public final void rule__Expression__ConstantAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2835:1: ( ( ruleConstant ) )
            // InternalMyDsl.g:2836:2: ( ruleConstant )
            {
            // InternalMyDsl.g:2836:2: ( ruleConstant )
            // InternalMyDsl.g:2837:3: ruleConstant
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
    // InternalMyDsl.g:2846:1: rule__Expression__OperAssignment_1 : ( ruleOperation ) ;
    public final void rule__Expression__OperAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2850:1: ( ( ruleOperation ) )
            // InternalMyDsl.g:2851:2: ( ruleOperation )
            {
            // InternalMyDsl.g:2851:2: ( ruleOperation )
            // InternalMyDsl.g:2852:3: ruleOperation
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


    // $ANTLR start "rule__Expression__CondAssignment_2"
    // InternalMyDsl.g:2861:1: rule__Expression__CondAssignment_2 : ( ruleConditional ) ;
    public final void rule__Expression__CondAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2865:1: ( ( ruleConditional ) )
            // InternalMyDsl.g:2866:2: ( ruleConditional )
            {
            // InternalMyDsl.g:2866:2: ( ruleConditional )
            // InternalMyDsl.g:2867:3: ruleConditional
            {
             before(grammarAccess.getExpressionAccess().getCondConditionalParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleConditional();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getCondConditionalParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Expression__CondAssignment_2"


    // $ANTLR start "rule__Expression__SetAssignment_3"
    // InternalMyDsl.g:2876:1: rule__Expression__SetAssignment_3 : ( ruleSet ) ;
    public final void rule__Expression__SetAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2880:1: ( ( ruleSet ) )
            // InternalMyDsl.g:2881:2: ( ruleSet )
            {
            // InternalMyDsl.g:2881:2: ( ruleSet )
            // InternalMyDsl.g:2882:3: ruleSet
            {
             before(grammarAccess.getExpressionAccess().getSetSetParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSet();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getSetSetParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Expression__SetAssignment_3"


    // $ANTLR start "rule__Expression__AppAssignment_4"
    // InternalMyDsl.g:2891:1: rule__Expression__AppAssignment_4 : ( ruleApplication ) ;
    public final void rule__Expression__AppAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2895:1: ( ( ruleApplication ) )
            // InternalMyDsl.g:2896:2: ( ruleApplication )
            {
            // InternalMyDsl.g:2896:2: ( ruleApplication )
            // InternalMyDsl.g:2897:3: ruleApplication
            {
             before(grammarAccess.getExpressionAccess().getAppApplicationParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleApplication();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getAppApplicationParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__Expression__AppAssignment_4"


    // $ANTLR start "rule__Expression__MultAssignment_5"
    // InternalMyDsl.g:2906:1: rule__Expression__MultAssignment_5 : ( ruleMultipleCondition ) ;
    public final void rule__Expression__MultAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2910:1: ( ( ruleMultipleCondition ) )
            // InternalMyDsl.g:2911:2: ( ruleMultipleCondition )
            {
            // InternalMyDsl.g:2911:2: ( ruleMultipleCondition )
            // InternalMyDsl.g:2912:3: ruleMultipleCondition
            {
             before(grammarAccess.getExpressionAccess().getMultMultipleConditionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMultipleCondition();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getMultMultipleConditionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Expression__MultAssignment_5"


    // $ANTLR start "rule__Comparison__Num1Assignment_1_0_2"
    // InternalMyDsl.g:2921:1: rule__Comparison__Num1Assignment_1_0_2 : ( RULE_NUMBER ) ;
    public final void rule__Comparison__Num1Assignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2925:1: ( ( RULE_NUMBER ) )
            // InternalMyDsl.g:2926:2: ( RULE_NUMBER )
            {
            // InternalMyDsl.g:2926:2: ( RULE_NUMBER )
            // InternalMyDsl.g:2927:3: RULE_NUMBER
            {
             before(grammarAccess.getComparisonAccess().getNum1NUMBERTerminalRuleCall_1_0_2_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getNum1NUMBERTerminalRuleCall_1_0_2_0()); 

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
    // InternalMyDsl.g:2936:1: rule__Comparison__Num2Assignment_1_0_3 : ( RULE_NUMBER ) ;
    public final void rule__Comparison__Num2Assignment_1_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2940:1: ( ( RULE_NUMBER ) )
            // InternalMyDsl.g:2941:2: ( RULE_NUMBER )
            {
            // InternalMyDsl.g:2941:2: ( RULE_NUMBER )
            // InternalMyDsl.g:2942:3: RULE_NUMBER
            {
             before(grammarAccess.getComparisonAccess().getNum2NUMBERTerminalRuleCall_1_0_3_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getComparisonAccess().getNum2NUMBERTerminalRuleCall_1_0_3_0()); 

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


    // $ANTLR start "rule__MultipleCondition__CompAssignment_2_1"
    // InternalMyDsl.g:2951:1: rule__MultipleCondition__CompAssignment_2_1 : ( ruleComparison ) ;
    public final void rule__MultipleCondition__CompAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2955:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:2956:2: ( ruleComparison )
            {
            // InternalMyDsl.g:2956:2: ( ruleComparison )
            // InternalMyDsl.g:2957:3: ruleComparison
            {
             before(grammarAccess.getMultipleConditionAccess().getCompComparisonParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComparison();

            state._fsp--;

             after(grammarAccess.getMultipleConditionAccess().getCompComparisonParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__MultipleCondition__CompAssignment_2_1"


    // $ANTLR start "rule__MultipleCondition__ExpAssignment_2_2"
    // InternalMyDsl.g:2966:1: rule__MultipleCondition__ExpAssignment_2_2 : ( ruleExpression ) ;
    public final void rule__MultipleCondition__ExpAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2970:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2971:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2971:2: ( ruleExpression )
            // InternalMyDsl.g:2972:3: ruleExpression
            {
             before(grammarAccess.getMultipleConditionAccess().getExpExpressionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMultipleConditionAccess().getExpExpressionParserRuleCall_2_2_0()); 

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
    // $ANTLR end "rule__MultipleCondition__ExpAssignment_2_2"


    // $ANTLR start "rule__MultipleCondition__ExpressionAssignment_3_2"
    // InternalMyDsl.g:2981:1: rule__MultipleCondition__ExpressionAssignment_3_2 : ( ruleExpression ) ;
    public final void rule__MultipleCondition__ExpressionAssignment_3_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2985:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:2986:2: ( ruleExpression )
            {
            // InternalMyDsl.g:2986:2: ( ruleExpression )
            // InternalMyDsl.g:2987:3: ruleExpression
            {
             before(grammarAccess.getMultipleConditionAccess().getExpressionExpressionParserRuleCall_3_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getMultipleConditionAccess().getExpressionExpressionParserRuleCall_3_2_0()); 

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
    // $ANTLR end "rule__MultipleCondition__ExpressionAssignment_3_2"


    // $ANTLR start "rule__Application__ExpressionAssignment_1"
    // InternalMyDsl.g:2996:1: rule__Application__ExpressionAssignment_1 : ( ruleExpression ) ;
    public final void rule__Application__ExpressionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3000:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3001:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3001:2: ( ruleExpression )
            // InternalMyDsl.g:3002:3: ruleExpression
            {
             before(grammarAccess.getApplicationAccess().getExpressionExpressionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getExpressionExpressionParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Application__ExpressionAssignment_1"


    // $ANTLR start "rule__Application__ExpressionsAssignment_2"
    // InternalMyDsl.g:3011:1: rule__Application__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__Application__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3015:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3016:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3016:2: ( ruleExpression )
            // InternalMyDsl.g:3017:3: ruleExpression
            {
             before(grammarAccess.getApplicationAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getApplicationAccess().getExpressionsExpressionParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Application__ExpressionsAssignment_2"


    // $ANTLR start "rule__Set__ConsAssignment_2"
    // InternalMyDsl.g:3026:1: rule__Set__ConsAssignment_2 : ( ruleConstant ) ;
    public final void rule__Set__ConsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3030:1: ( ( ruleConstant ) )
            // InternalMyDsl.g:3031:2: ( ruleConstant )
            {
            // InternalMyDsl.g:3031:2: ( ruleConstant )
            // InternalMyDsl.g:3032:3: ruleConstant
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
    // InternalMyDsl.g:3041:1: rule__Set__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Set__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3045:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3046:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3046:2: ( ruleExpression )
            // InternalMyDsl.g:3047:3: ruleExpression
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
    // InternalMyDsl.g:3056:1: rule__Conditional__ConditionAssignment_2 : ( ruleComparison ) ;
    public final void rule__Conditional__ConditionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3060:1: ( ( ruleComparison ) )
            // InternalMyDsl.g:3061:2: ( ruleComparison )
            {
            // InternalMyDsl.g:3061:2: ( ruleComparison )
            // InternalMyDsl.g:3062:3: ruleComparison
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
    // InternalMyDsl.g:3071:1: rule__Conditional__IftrueAssignment_3 : ( ruleExpression ) ;
    public final void rule__Conditional__IftrueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3075:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3076:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3076:2: ( ruleExpression )
            // InternalMyDsl.g:3077:3: ruleExpression
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
    // InternalMyDsl.g:3086:1: rule__Conditional__ElseAssignment_4 : ( ruleExpression ) ;
    public final void rule__Conditional__ElseAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3090:1: ( ( ruleExpression ) )
            // InternalMyDsl.g:3091:2: ( ruleExpression )
            {
            // InternalMyDsl.g:3091:2: ( ruleExpression )
            // InternalMyDsl.g:3092:3: ruleExpression
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


    // $ANTLR start "rule__Operation__OperationAssignment_0"
    // InternalMyDsl.g:3101:1: rule__Operation__OperationAssignment_0 : ( ( '(' ) ) ;
    public final void rule__Operation__OperationAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3105:1: ( ( ( '(' ) ) )
            // InternalMyDsl.g:3106:2: ( ( '(' ) )
            {
            // InternalMyDsl.g:3106:2: ( ( '(' ) )
            // InternalMyDsl.g:3107:3: ( '(' )
            {
             before(grammarAccess.getOperationAccess().getOperationLeftParenthesisKeyword_0_0()); 
            // InternalMyDsl.g:3108:3: ( '(' )
            // InternalMyDsl.g:3109:4: '('
            {
             before(grammarAccess.getOperationAccess().getOperationLeftParenthesisKeyword_0_0()); 
            match(input,36,FOLLOW_2); 
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


    // $ANTLR start "rule__Operation__OperatorAssignment_1"
    // InternalMyDsl.g:3120:1: rule__Operation__OperatorAssignment_1 : ( RULE_OPER ) ;
    public final void rule__Operation__OperatorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3124:1: ( ( RULE_OPER ) )
            // InternalMyDsl.g:3125:2: ( RULE_OPER )
            {
            // InternalMyDsl.g:3125:2: ( RULE_OPER )
            // InternalMyDsl.g:3126:3: RULE_OPER
            {
             before(grammarAccess.getOperationAccess().getOperatorOPERTerminalRuleCall_1_0()); 
            match(input,RULE_OPER,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getOperatorOPERTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Operation__OperatorAssignment_1"


    // $ANTLR start "rule__Operation__NumbAssignment_3"
    // InternalMyDsl.g:3135:1: rule__Operation__NumbAssignment_3 : ( RULE_NUMBER ) ;
    public final void rule__Operation__NumbAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3139:1: ( ( RULE_NUMBER ) )
            // InternalMyDsl.g:3140:2: ( RULE_NUMBER )
            {
            // InternalMyDsl.g:3140:2: ( RULE_NUMBER )
            // InternalMyDsl.g:3141:3: RULE_NUMBER
            {
             before(grammarAccess.getOperationAccess().getNumbNUMBERTerminalRuleCall_3_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getNumbNUMBERTerminalRuleCall_3_0()); 

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
    // $ANTLR end "rule__Operation__NumbAssignment_3"


    // $ANTLR start "rule__Operation__Numb2Assignment_5"
    // InternalMyDsl.g:3150:1: rule__Operation__Numb2Assignment_5 : ( RULE_NUMBER ) ;
    public final void rule__Operation__Numb2Assignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3154:1: ( ( RULE_NUMBER ) )
            // InternalMyDsl.g:3155:2: ( RULE_NUMBER )
            {
            // InternalMyDsl.g:3155:2: ( RULE_NUMBER )
            // InternalMyDsl.g:3156:3: RULE_NUMBER
            {
             before(grammarAccess.getOperationAccess().getNumb2NUMBERTerminalRuleCall_5_0()); 
            match(input,RULE_NUMBER,FOLLOW_2); 
             after(grammarAccess.getOperationAccess().getNumb2NUMBERTerminalRuleCall_5_0()); 

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
    // $ANTLR end "rule__Operation__Numb2Assignment_5"


    // $ANTLR start "rule__Initial__InitAssignment"
    // InternalMyDsl.g:3165:1: rule__Initial__InitAssignment : ( ( rule__Initial__InitAlternatives_0 ) ) ;
    public final void rule__Initial__InitAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3169:1: ( ( ( rule__Initial__InitAlternatives_0 ) ) )
            // InternalMyDsl.g:3170:2: ( ( rule__Initial__InitAlternatives_0 ) )
            {
            // InternalMyDsl.g:3170:2: ( ( rule__Initial__InitAlternatives_0 ) )
            // InternalMyDsl.g:3171:3: ( rule__Initial__InitAlternatives_0 )
            {
             before(grammarAccess.getInitialAccess().getInitAlternatives_0()); 
            // InternalMyDsl.g:3172:3: ( rule__Initial__InitAlternatives_0 )
            // InternalMyDsl.g:3172:4: rule__Initial__InitAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Initial__InitAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getInitialAccess().getInitAlternatives_0()); 

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
    // $ANTLR end "rule__Initial__InitAssignment"


    // $ANTLR start "rule__Subsequent__InitAssignment_1_0"
    // InternalMyDsl.g:3180:1: rule__Subsequent__InitAssignment_1_0 : ( ruleInitial ) ;
    public final void rule__Subsequent__InitAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3184:1: ( ( ruleInitial ) )
            // InternalMyDsl.g:3185:2: ( ruleInitial )
            {
            // InternalMyDsl.g:3185:2: ( ruleInitial )
            // InternalMyDsl.g:3186:3: ruleInitial
            {
             before(grammarAccess.getSubsequentAccess().getInitInitialParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleInitial();

            state._fsp--;

             after(grammarAccess.getSubsequentAccess().getInitInitialParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Subsequent__InitAssignment_1_0"

    // Delegated rules


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\11\uffff";
    static final String dfa_2s = "\1\44\1\45\1\10\1\uffff\3\10\2\uffff";
    static final String dfa_3s = "\1\44\1\45\1\44\1\uffff\1\10\2\46\2\uffff";
    static final String dfa_4s = "\3\uffff\1\1\3\uffff\1\2\1\3";
    static final String dfa_5s = "\11\uffff}>";
    static final String[] dfa_6s = {
            "\1\1",
            "\1\2",
            "\1\3\33\uffff\1\4",
            "",
            "\1\5",
            "\1\6\30\uffff\1\10\4\uffff\1\7",
            "\1\6\30\uffff\1\10\4\uffff\1\7",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "448:1: rule__VariableDefinition__Alternatives : ( ( ( rule__VariableDefinition__Group_0__0 ) ) | ( ( rule__VariableDefinition__Group_1__0 ) ) | ( ( rule__VariableDefinition__Group_2__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000010000003F2L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000010000003F0L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000004000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000102L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000200000100L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001000000010L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000003E0000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x00000050000003F0L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000000003F0L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000800L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000004000000800L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000FFFCE0600L});

}