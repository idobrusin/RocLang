package robotcontrol.ide.contentassist.antlr.internal;

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
import robotcontrol.services.RocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRocParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PERIOD", "RULE_AND", "RULE_FOR", "RULE_WITH", "RULE_SPEED_KEY", "RULE_DURATION", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pronounced'", "'trace of'", "'slightly'", "'severe'", "'maximum'", "'milliseconds'", "'seconds'", "'minutes'", "'face'", "'head'", "'neutral'", "'drop jaw'", "'nod head'", "'tilt'", "'left'", "'right'", "'turn head'", "'turn eyes'", "'up'", "'down'", "'slowest'", "'slow'", "'normal'", "'fast'", "'full'"
    };
    public static final int RULE_WITH=7;
    public static final int RULE_DURATION=9;
    public static final int RULE_STRING=12;
    public static final int RULE_AND=5;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int RULE_SPEED_KEY=8;
    public static final int T__18=18;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_FOR=6;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=11;
    public static final int RULE_WS=15;
    public static final int RULE_PERIOD=4;
    public static final int RULE_ANY_OTHER=16;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=10;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalRocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalRocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalRocParser.tokenNames; }
    public String getGrammarFileName() { return "InternalRoc.g"; }


    	private RocGrammarAccess grammarAccess;

    	public void setGrammarAccess(RocGrammarAccess grammarAccess) {
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
    // InternalRoc.g:53:1: entryRuleProgram : ruleProgram EOF ;
    public final void entryRuleProgram() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalRoc.g:57:1: ( ruleProgram EOF )
            // InternalRoc.g:58:1: ruleProgram EOF
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

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalRoc.g:68:1: ruleProgram : ( ( rule__Program__MovementsAssignment )* ) ;
    public final void ruleProgram() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:73:2: ( ( ( rule__Program__MovementsAssignment )* ) )
            // InternalRoc.g:74:2: ( ( rule__Program__MovementsAssignment )* )
            {
            // InternalRoc.g:74:2: ( ( rule__Program__MovementsAssignment )* )
            // InternalRoc.g:75:3: ( rule__Program__MovementsAssignment )*
            {
             before(grammarAccess.getProgramAccess().getMovementsAssignment()); 
            // InternalRoc.g:76:3: ( rule__Program__MovementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=17 && LA1_0<=21)||(LA1_0>=27 && LA1_0<=30)||(LA1_0>=33 && LA1_0<=34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRoc.g:76:4: rule__Program__MovementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Program__MovementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getProgramAccess().getMovementsAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMovement"
    // InternalRoc.g:86:1: entryRuleMovement : ruleMovement EOF ;
    public final void entryRuleMovement() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalRoc.g:90:1: ( ruleMovement EOF )
            // InternalRoc.g:91:1: ruleMovement EOF
            {
             before(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            ruleMovement();

            state._fsp--;

             after(grammarAccess.getMovementRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalRoc.g:101:1: ruleMovement : ( ( rule__Movement__Group__0 ) ) ;
    public final void ruleMovement() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:106:2: ( ( ( rule__Movement__Group__0 ) ) )
            // InternalRoc.g:107:2: ( ( rule__Movement__Group__0 ) )
            {
            // InternalRoc.g:107:2: ( ( rule__Movement__Group__0 ) )
            // InternalRoc.g:108:3: ( rule__Movement__Group__0 )
            {
             before(grammarAccess.getMovementAccess().getGroup()); 
            // InternalRoc.g:109:3: ( rule__Movement__Group__0 )
            // InternalRoc.g:109:4: rule__Movement__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Movement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMovementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleMotion"
    // InternalRoc.g:119:1: entryRuleMotion : ruleMotion EOF ;
    public final void entryRuleMotion() throws RecognitionException {
        try {
            // InternalRoc.g:120:1: ( ruleMotion EOF )
            // InternalRoc.g:121:1: ruleMotion EOF
            {
             before(grammarAccess.getMotionRule()); 
            pushFollow(FOLLOW_1);
            ruleMotion();

            state._fsp--;

             after(grammarAccess.getMotionRule()); 
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
    // $ANTLR end "entryRuleMotion"


    // $ANTLR start "ruleMotion"
    // InternalRoc.g:128:1: ruleMotion : ( ( rule__Motion__Alternatives ) ) ;
    public final void ruleMotion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:132:2: ( ( ( rule__Motion__Alternatives ) ) )
            // InternalRoc.g:133:2: ( ( rule__Motion__Alternatives ) )
            {
            // InternalRoc.g:133:2: ( ( rule__Motion__Alternatives ) )
            // InternalRoc.g:134:3: ( rule__Motion__Alternatives )
            {
             before(grammarAccess.getMotionAccess().getAlternatives()); 
            // InternalRoc.g:135:3: ( rule__Motion__Alternatives )
            // InternalRoc.g:135:4: rule__Motion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Motion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMotionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleMotion"


    // $ANTLR start "entryRuleAction"
    // InternalRoc.g:144:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalRoc.g:145:1: ( ruleAction EOF )
            // InternalRoc.g:146:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRoc.g:153:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:157:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalRoc.g:158:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalRoc.g:158:2: ( ( rule__Action__Alternatives ) )
            // InternalRoc.g:159:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalRoc.g:160:3: ( rule__Action__Alternatives )
            // InternalRoc.g:160:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCompleteAction"
    // InternalRoc.g:169:1: entryRuleCompleteAction : ruleCompleteAction EOF ;
    public final void entryRuleCompleteAction() throws RecognitionException {
        try {
            // InternalRoc.g:170:1: ( ruleCompleteAction EOF )
            // InternalRoc.g:171:1: ruleCompleteAction EOF
            {
             before(grammarAccess.getCompleteActionRule()); 
            pushFollow(FOLLOW_1);
            ruleCompleteAction();

            state._fsp--;

             after(grammarAccess.getCompleteActionRule()); 
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
    // $ANTLR end "entryRuleCompleteAction"


    // $ANTLR start "ruleCompleteAction"
    // InternalRoc.g:178:1: ruleCompleteAction : ( ( rule__CompleteAction__Group__0 ) ) ;
    public final void ruleCompleteAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:182:2: ( ( ( rule__CompleteAction__Group__0 ) ) )
            // InternalRoc.g:183:2: ( ( rule__CompleteAction__Group__0 ) )
            {
            // InternalRoc.g:183:2: ( ( rule__CompleteAction__Group__0 ) )
            // InternalRoc.g:184:3: ( rule__CompleteAction__Group__0 )
            {
             before(grammarAccess.getCompleteActionAccess().getGroup()); 
            // InternalRoc.g:185:3: ( rule__CompleteAction__Group__0 )
            // InternalRoc.g:185:4: rule__CompleteAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__CompleteAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCompleteActionAccess().getGroup()); 

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
    // $ANTLR end "ruleCompleteAction"


    // $ANTLR start "entryRuleSingleAction"
    // InternalRoc.g:194:1: entryRuleSingleAction : ruleSingleAction EOF ;
    public final void entryRuleSingleAction() throws RecognitionException {
        try {
            // InternalRoc.g:195:1: ( ruleSingleAction EOF )
            // InternalRoc.g:196:1: ruleSingleAction EOF
            {
             before(grammarAccess.getSingleActionRule()); 
            pushFollow(FOLLOW_1);
            ruleSingleAction();

            state._fsp--;

             after(grammarAccess.getSingleActionRule()); 
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
    // $ANTLR end "entryRuleSingleAction"


    // $ANTLR start "ruleSingleAction"
    // InternalRoc.g:203:1: ruleSingleAction : ( ( rule__SingleAction__Alternatives ) ) ;
    public final void ruleSingleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:207:2: ( ( ( rule__SingleAction__Alternatives ) ) )
            // InternalRoc.g:208:2: ( ( rule__SingleAction__Alternatives ) )
            {
            // InternalRoc.g:208:2: ( ( rule__SingleAction__Alternatives ) )
            // InternalRoc.g:209:3: ( rule__SingleAction__Alternatives )
            {
             before(grammarAccess.getSingleActionAccess().getAlternatives()); 
            // InternalRoc.g:210:3: ( rule__SingleAction__Alternatives )
            // InternalRoc.g:210:4: rule__SingleAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SingleAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSingleActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSingleAction"


    // $ANTLR start "entryRuleDirectedAction"
    // InternalRoc.g:219:1: entryRuleDirectedAction : ruleDirectedAction EOF ;
    public final void entryRuleDirectedAction() throws RecognitionException {
        try {
            // InternalRoc.g:220:1: ( ruleDirectedAction EOF )
            // InternalRoc.g:221:1: ruleDirectedAction EOF
            {
             before(grammarAccess.getDirectedActionRule()); 
            pushFollow(FOLLOW_1);
            ruleDirectedAction();

            state._fsp--;

             after(grammarAccess.getDirectedActionRule()); 
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
    // $ANTLR end "entryRuleDirectedAction"


    // $ANTLR start "ruleDirectedAction"
    // InternalRoc.g:228:1: ruleDirectedAction : ( ( rule__DirectedAction__Alternatives ) ) ;
    public final void ruleDirectedAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:232:2: ( ( ( rule__DirectedAction__Alternatives ) ) )
            // InternalRoc.g:233:2: ( ( rule__DirectedAction__Alternatives ) )
            {
            // InternalRoc.g:233:2: ( ( rule__DirectedAction__Alternatives ) )
            // InternalRoc.g:234:3: ( rule__DirectedAction__Alternatives )
            {
             before(grammarAccess.getDirectedActionAccess().getAlternatives()); 
            // InternalRoc.g:235:3: ( rule__DirectedAction__Alternatives )
            // InternalRoc.g:235:4: rule__DirectedAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectedActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDirectedAction"


    // $ANTLR start "entryRuleLeftRightDirectedAction"
    // InternalRoc.g:244:1: entryRuleLeftRightDirectedAction : ruleLeftRightDirectedAction EOF ;
    public final void entryRuleLeftRightDirectedAction() throws RecognitionException {
        try {
            // InternalRoc.g:245:1: ( ruleLeftRightDirectedAction EOF )
            // InternalRoc.g:246:1: ruleLeftRightDirectedAction EOF
            {
             before(grammarAccess.getLeftRightDirectedActionRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftRightDirectedAction();

            state._fsp--;

             after(grammarAccess.getLeftRightDirectedActionRule()); 
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
    // $ANTLR end "entryRuleLeftRightDirectedAction"


    // $ANTLR start "ruleLeftRightDirectedAction"
    // InternalRoc.g:253:1: ruleLeftRightDirectedAction : ( ( rule__LeftRightDirectedAction__Group__0 ) ) ;
    public final void ruleLeftRightDirectedAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:257:2: ( ( ( rule__LeftRightDirectedAction__Group__0 ) ) )
            // InternalRoc.g:258:2: ( ( rule__LeftRightDirectedAction__Group__0 ) )
            {
            // InternalRoc.g:258:2: ( ( rule__LeftRightDirectedAction__Group__0 ) )
            // InternalRoc.g:259:3: ( rule__LeftRightDirectedAction__Group__0 )
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getGroup()); 
            // InternalRoc.g:260:3: ( rule__LeftRightDirectedAction__Group__0 )
            // InternalRoc.g:260:4: rule__LeftRightDirectedAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LeftRightDirectedAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLeftRightDirectedActionAccess().getGroup()); 

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
    // $ANTLR end "ruleLeftRightDirectedAction"


    // $ANTLR start "entryRuleLeftRightDirection"
    // InternalRoc.g:269:1: entryRuleLeftRightDirection : ruleLeftRightDirection EOF ;
    public final void entryRuleLeftRightDirection() throws RecognitionException {
        try {
            // InternalRoc.g:270:1: ( ruleLeftRightDirection EOF )
            // InternalRoc.g:271:1: ruleLeftRightDirection EOF
            {
             before(grammarAccess.getLeftRightDirectionRule()); 
            pushFollow(FOLLOW_1);
            ruleLeftRightDirection();

            state._fsp--;

             after(grammarAccess.getLeftRightDirectionRule()); 
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
    // $ANTLR end "entryRuleLeftRightDirection"


    // $ANTLR start "ruleLeftRightDirection"
    // InternalRoc.g:278:1: ruleLeftRightDirection : ( ( rule__LeftRightDirection__Alternatives ) ) ;
    public final void ruleLeftRightDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:282:2: ( ( ( rule__LeftRightDirection__Alternatives ) ) )
            // InternalRoc.g:283:2: ( ( rule__LeftRightDirection__Alternatives ) )
            {
            // InternalRoc.g:283:2: ( ( rule__LeftRightDirection__Alternatives ) )
            // InternalRoc.g:284:3: ( rule__LeftRightDirection__Alternatives )
            {
             before(grammarAccess.getLeftRightDirectionAccess().getAlternatives()); 
            // InternalRoc.g:285:3: ( rule__LeftRightDirection__Alternatives )
            // InternalRoc.g:285:4: rule__LeftRightDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LeftRightDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLeftRightDirectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLeftRightDirection"


    // $ANTLR start "entryRuleFullDirectedAction"
    // InternalRoc.g:294:1: entryRuleFullDirectedAction : ruleFullDirectedAction EOF ;
    public final void entryRuleFullDirectedAction() throws RecognitionException {
        try {
            // InternalRoc.g:295:1: ( ruleFullDirectedAction EOF )
            // InternalRoc.g:296:1: ruleFullDirectedAction EOF
            {
             before(grammarAccess.getFullDirectedActionRule()); 
            pushFollow(FOLLOW_1);
            ruleFullDirectedAction();

            state._fsp--;

             after(grammarAccess.getFullDirectedActionRule()); 
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
    // $ANTLR end "entryRuleFullDirectedAction"


    // $ANTLR start "ruleFullDirectedAction"
    // InternalRoc.g:303:1: ruleFullDirectedAction : ( ( rule__FullDirectedAction__Alternatives ) ) ;
    public final void ruleFullDirectedAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:307:2: ( ( ( rule__FullDirectedAction__Alternatives ) ) )
            // InternalRoc.g:308:2: ( ( rule__FullDirectedAction__Alternatives ) )
            {
            // InternalRoc.g:308:2: ( ( rule__FullDirectedAction__Alternatives ) )
            // InternalRoc.g:309:3: ( rule__FullDirectedAction__Alternatives )
            {
             before(grammarAccess.getFullDirectedActionAccess().getAlternatives()); 
            // InternalRoc.g:310:3: ( rule__FullDirectedAction__Alternatives )
            // InternalRoc.g:310:4: rule__FullDirectedAction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FullDirectedAction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFullDirectedActionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleFullDirectedAction"


    // $ANTLR start "entryRuleDirection"
    // InternalRoc.g:319:1: entryRuleDirection : ruleDirection EOF ;
    public final void entryRuleDirection() throws RecognitionException {
        try {
            // InternalRoc.g:320:1: ( ruleDirection EOF )
            // InternalRoc.g:321:1: ruleDirection EOF
            {
             before(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_1);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectionRule()); 
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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalRoc.g:328:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:332:2: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRoc.g:333:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRoc.g:333:2: ( ( rule__Direction__Alternatives ) )
            // InternalRoc.g:334:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRoc.g:335:3: ( rule__Direction__Alternatives )
            // InternalRoc.g:335:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "entryRuleSpeed"
    // InternalRoc.g:344:1: entryRuleSpeed : ruleSpeed EOF ;
    public final void entryRuleSpeed() throws RecognitionException {
        try {
            // InternalRoc.g:345:1: ( ruleSpeed EOF )
            // InternalRoc.g:346:1: ruleSpeed EOF
            {
             before(grammarAccess.getSpeedRule()); 
            pushFollow(FOLLOW_1);
            ruleSpeed();

            state._fsp--;

             after(grammarAccess.getSpeedRule()); 
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
    // $ANTLR end "entryRuleSpeed"


    // $ANTLR start "ruleSpeed"
    // InternalRoc.g:353:1: ruleSpeed : ( ( rule__Speed__Alternatives ) ) ;
    public final void ruleSpeed() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:357:2: ( ( ( rule__Speed__Alternatives ) ) )
            // InternalRoc.g:358:2: ( ( rule__Speed__Alternatives ) )
            {
            // InternalRoc.g:358:2: ( ( rule__Speed__Alternatives ) )
            // InternalRoc.g:359:3: ( rule__Speed__Alternatives )
            {
             before(grammarAccess.getSpeedAccess().getAlternatives()); 
            // InternalRoc.g:360:3: ( rule__Speed__Alternatives )
            // InternalRoc.g:360:4: rule__Speed__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Speed__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSpeedAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSpeed"


    // $ANTLR start "ruleIntensity"
    // InternalRoc.g:369:1: ruleIntensity : ( ( rule__Intensity__Alternatives ) ) ;
    public final void ruleIntensity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:373:1: ( ( ( rule__Intensity__Alternatives ) ) )
            // InternalRoc.g:374:2: ( ( rule__Intensity__Alternatives ) )
            {
            // InternalRoc.g:374:2: ( ( rule__Intensity__Alternatives ) )
            // InternalRoc.g:375:3: ( rule__Intensity__Alternatives )
            {
             before(grammarAccess.getIntensityAccess().getAlternatives()); 
            // InternalRoc.g:376:3: ( rule__Intensity__Alternatives )
            // InternalRoc.g:376:4: rule__Intensity__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Intensity__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getIntensityAccess().getAlternatives()); 

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
    // $ANTLR end "ruleIntensity"


    // $ANTLR start "ruleDurationUnit"
    // InternalRoc.g:385:1: ruleDurationUnit : ( ( rule__DurationUnit__Alternatives ) ) ;
    public final void ruleDurationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:389:1: ( ( ( rule__DurationUnit__Alternatives ) ) )
            // InternalRoc.g:390:2: ( ( rule__DurationUnit__Alternatives ) )
            {
            // InternalRoc.g:390:2: ( ( rule__DurationUnit__Alternatives ) )
            // InternalRoc.g:391:3: ( rule__DurationUnit__Alternatives )
            {
             before(grammarAccess.getDurationUnitAccess().getAlternatives()); 
            // InternalRoc.g:392:3: ( rule__DurationUnit__Alternatives )
            // InternalRoc.g:392:4: rule__DurationUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DurationUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDurationUnitAccess().getAlternatives()); 

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
    // $ANTLR end "ruleDurationUnit"


    // $ANTLR start "rule__Motion__Alternatives"
    // InternalRoc.g:400:1: rule__Motion__Alternatives : ( ( ( rule__Motion__Group_0__0 ) ) | ( ( rule__Motion__Group_1__0 ) ) );
    public final void rule__Motion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:404:1: ( ( ( rule__Motion__Group_0__0 ) ) | ( ( rule__Motion__Group_1__0 ) ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalRoc.g:405:2: ( ( rule__Motion__Group_0__0 ) )
                    {
                    // InternalRoc.g:405:2: ( ( rule__Motion__Group_0__0 ) )
                    // InternalRoc.g:406:3: ( rule__Motion__Group_0__0 )
                    {
                     before(grammarAccess.getMotionAccess().getGroup_0()); 
                    // InternalRoc.g:407:3: ( rule__Motion__Group_0__0 )
                    // InternalRoc.g:407:4: rule__Motion__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Motion__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMotionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:411:2: ( ( rule__Motion__Group_1__0 ) )
                    {
                    // InternalRoc.g:411:2: ( ( rule__Motion__Group_1__0 ) )
                    // InternalRoc.g:412:3: ( rule__Motion__Group_1__0 )
                    {
                     before(grammarAccess.getMotionAccess().getGroup_1()); 
                    // InternalRoc.g:413:3: ( rule__Motion__Group_1__0 )
                    // InternalRoc.g:413:4: rule__Motion__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Motion__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMotionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Motion__Alternatives"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalRoc.g:421:1: rule__Action__Alternatives : ( ( ( rule__Action__ActionHolderAssignment_0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:425:1: ( ( ( rule__Action__ActionHolderAssignment_0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=28 && LA3_2<=29)) ) {
                    alt3=2;
                }
                else if ( (LA3_2==30||(LA3_2>=33 && LA3_2<=34)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA3_3 = input.LA(2);

                if ( ((LA3_3>=28 && LA3_3<=29)) ) {
                    alt3=2;
                }
                else if ( (LA3_3==30||(LA3_3>=33 && LA3_3<=34)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA3_4 = input.LA(2);

                if ( ((LA3_4>=28 && LA3_4<=29)) ) {
                    alt3=2;
                }
                else if ( (LA3_4==30||(LA3_4>=33 && LA3_4<=34)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            case 20:
                {
                int LA3_5 = input.LA(2);

                if ( ((LA3_5>=28 && LA3_5<=29)) ) {
                    alt3=2;
                }
                else if ( (LA3_5==30||(LA3_5>=33 && LA3_5<=34)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 5, input);

                    throw nvae;
                }
                }
                break;
            case 21:
                {
                int LA3_6 = input.LA(2);

                if ( ((LA3_6>=28 && LA3_6<=29)) ) {
                    alt3=2;
                }
                else if ( (LA3_6==30||(LA3_6>=33 && LA3_6<=34)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 6, input);

                    throw nvae;
                }
                }
                break;
            case 28:
            case 29:
                {
                alt3=2;
                }
                break;
            case 30:
            case 33:
            case 34:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalRoc.g:426:2: ( ( rule__Action__ActionHolderAssignment_0 ) )
                    {
                    // InternalRoc.g:426:2: ( ( rule__Action__ActionHolderAssignment_0 ) )
                    // InternalRoc.g:427:3: ( rule__Action__ActionHolderAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getActionHolderAssignment_0()); 
                    // InternalRoc.g:428:3: ( rule__Action__ActionHolderAssignment_0 )
                    // InternalRoc.g:428:4: rule__Action__ActionHolderAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__ActionHolderAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getActionHolderAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:432:2: ( ( rule__Action__Group_1__0 ) )
                    {
                    // InternalRoc.g:432:2: ( ( rule__Action__Group_1__0 ) )
                    // InternalRoc.g:433:3: ( rule__Action__Group_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_1()); 
                    // InternalRoc.g:434:3: ( rule__Action__Group_1__0 )
                    // InternalRoc.g:434:4: rule__Action__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:438:2: ( ( rule__Action__Group_2__0 ) )
                    {
                    // InternalRoc.g:438:2: ( ( rule__Action__Group_2__0 ) )
                    // InternalRoc.g:439:3: ( rule__Action__Group_2__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_2()); 
                    // InternalRoc.g:440:3: ( rule__Action__Group_2__0 )
                    // InternalRoc.g:440:4: rule__Action__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getActionAccess().getGroup_2()); 

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
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__SingleAction__Alternatives"
    // InternalRoc.g:448:1: rule__SingleAction__Alternatives : ( ( ( rule__SingleAction__ActionNameAssignment_0 ) ) | ( ( rule__SingleAction__ActionNameAssignment_1 ) ) );
    public final void rule__SingleAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:452:1: ( ( ( rule__SingleAction__ActionNameAssignment_0 ) ) | ( ( rule__SingleAction__ActionNameAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==29) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoc.g:453:2: ( ( rule__SingleAction__ActionNameAssignment_0 ) )
                    {
                    // InternalRoc.g:453:2: ( ( rule__SingleAction__ActionNameAssignment_0 ) )
                    // InternalRoc.g:454:3: ( rule__SingleAction__ActionNameAssignment_0 )
                    {
                     before(grammarAccess.getSingleActionAccess().getActionNameAssignment_0()); 
                    // InternalRoc.g:455:3: ( rule__SingleAction__ActionNameAssignment_0 )
                    // InternalRoc.g:455:4: rule__SingleAction__ActionNameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAction__ActionNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleActionAccess().getActionNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:459:2: ( ( rule__SingleAction__ActionNameAssignment_1 ) )
                    {
                    // InternalRoc.g:459:2: ( ( rule__SingleAction__ActionNameAssignment_1 ) )
                    // InternalRoc.g:460:3: ( rule__SingleAction__ActionNameAssignment_1 )
                    {
                     before(grammarAccess.getSingleActionAccess().getActionNameAssignment_1()); 
                    // InternalRoc.g:461:3: ( rule__SingleAction__ActionNameAssignment_1 )
                    // InternalRoc.g:461:4: rule__SingleAction__ActionNameAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__SingleAction__ActionNameAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSingleActionAccess().getActionNameAssignment_1()); 

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
    // $ANTLR end "rule__SingleAction__Alternatives"


    // $ANTLR start "rule__DirectedAction__Alternatives"
    // InternalRoc.g:469:1: rule__DirectedAction__Alternatives : ( ( ( rule__DirectedAction__Group_0__0 ) ) | ( ( rule__DirectedAction__Group_1__0 ) ) );
    public final void rule__DirectedAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:473:1: ( ( ( rule__DirectedAction__Group_0__0 ) ) | ( ( rule__DirectedAction__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=33 && LA5_0<=34)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoc.g:474:2: ( ( rule__DirectedAction__Group_0__0 ) )
                    {
                    // InternalRoc.g:474:2: ( ( rule__DirectedAction__Group_0__0 ) )
                    // InternalRoc.g:475:3: ( rule__DirectedAction__Group_0__0 )
                    {
                     before(grammarAccess.getDirectedActionAccess().getGroup_0()); 
                    // InternalRoc.g:476:3: ( rule__DirectedAction__Group_0__0 )
                    // InternalRoc.g:476:4: rule__DirectedAction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectedAction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectedActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:480:2: ( ( rule__DirectedAction__Group_1__0 ) )
                    {
                    // InternalRoc.g:480:2: ( ( rule__DirectedAction__Group_1__0 ) )
                    // InternalRoc.g:481:3: ( rule__DirectedAction__Group_1__0 )
                    {
                     before(grammarAccess.getDirectedActionAccess().getGroup_1()); 
                    // InternalRoc.g:482:3: ( rule__DirectedAction__Group_1__0 )
                    // InternalRoc.g:482:4: rule__DirectedAction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectedAction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectedActionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__DirectedAction__Alternatives"


    // $ANTLR start "rule__LeftRightDirection__Alternatives"
    // InternalRoc.g:490:1: rule__LeftRightDirection__Alternatives : ( ( ( rule__LeftRightDirection__LeftAssignment_0 ) ) | ( ( rule__LeftRightDirection__RightAssignment_1 ) ) );
    public final void rule__LeftRightDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:494:1: ( ( ( rule__LeftRightDirection__LeftAssignment_0 ) ) | ( ( rule__LeftRightDirection__RightAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            else if ( (LA6_0==32) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoc.g:495:2: ( ( rule__LeftRightDirection__LeftAssignment_0 ) )
                    {
                    // InternalRoc.g:495:2: ( ( rule__LeftRightDirection__LeftAssignment_0 ) )
                    // InternalRoc.g:496:3: ( rule__LeftRightDirection__LeftAssignment_0 )
                    {
                     before(grammarAccess.getLeftRightDirectionAccess().getLeftAssignment_0()); 
                    // InternalRoc.g:497:3: ( rule__LeftRightDirection__LeftAssignment_0 )
                    // InternalRoc.g:497:4: rule__LeftRightDirection__LeftAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeftRightDirection__LeftAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLeftRightDirectionAccess().getLeftAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:501:2: ( ( rule__LeftRightDirection__RightAssignment_1 ) )
                    {
                    // InternalRoc.g:501:2: ( ( rule__LeftRightDirection__RightAssignment_1 ) )
                    // InternalRoc.g:502:3: ( rule__LeftRightDirection__RightAssignment_1 )
                    {
                     before(grammarAccess.getLeftRightDirectionAccess().getRightAssignment_1()); 
                    // InternalRoc.g:503:3: ( rule__LeftRightDirection__RightAssignment_1 )
                    // InternalRoc.g:503:4: rule__LeftRightDirection__RightAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LeftRightDirection__RightAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLeftRightDirectionAccess().getRightAssignment_1()); 

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
    // $ANTLR end "rule__LeftRightDirection__Alternatives"


    // $ANTLR start "rule__FullDirectedAction__Alternatives"
    // InternalRoc.g:511:1: rule__FullDirectedAction__Alternatives : ( ( ( rule__FullDirectedAction__TurnHeadAssignment_0 ) ) | ( ( rule__FullDirectedAction__TurnEyesAssignment_1 ) ) );
    public final void rule__FullDirectedAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:515:1: ( ( ( rule__FullDirectedAction__TurnHeadAssignment_0 ) ) | ( ( rule__FullDirectedAction__TurnEyesAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==33) ) {
                alt7=1;
            }
            else if ( (LA7_0==34) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoc.g:516:2: ( ( rule__FullDirectedAction__TurnHeadAssignment_0 ) )
                    {
                    // InternalRoc.g:516:2: ( ( rule__FullDirectedAction__TurnHeadAssignment_0 ) )
                    // InternalRoc.g:517:3: ( rule__FullDirectedAction__TurnHeadAssignment_0 )
                    {
                     before(grammarAccess.getFullDirectedActionAccess().getTurnHeadAssignment_0()); 
                    // InternalRoc.g:518:3: ( rule__FullDirectedAction__TurnHeadAssignment_0 )
                    // InternalRoc.g:518:4: rule__FullDirectedAction__TurnHeadAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FullDirectedAction__TurnHeadAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFullDirectedActionAccess().getTurnHeadAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:522:2: ( ( rule__FullDirectedAction__TurnEyesAssignment_1 ) )
                    {
                    // InternalRoc.g:522:2: ( ( rule__FullDirectedAction__TurnEyesAssignment_1 ) )
                    // InternalRoc.g:523:3: ( rule__FullDirectedAction__TurnEyesAssignment_1 )
                    {
                     before(grammarAccess.getFullDirectedActionAccess().getTurnEyesAssignment_1()); 
                    // InternalRoc.g:524:3: ( rule__FullDirectedAction__TurnEyesAssignment_1 )
                    // InternalRoc.g:524:4: rule__FullDirectedAction__TurnEyesAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FullDirectedAction__TurnEyesAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFullDirectedActionAccess().getTurnEyesAssignment_1()); 

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
    // $ANTLR end "rule__FullDirectedAction__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalRoc.g:532:1: rule__Direction__Alternatives : ( ( ( rule__Direction__UPAssignment_0 ) ) | ( ( rule__Direction__DOWNAssignment_1 ) ) | ( ( rule__Direction__LEFTAssignment_2 ) ) | ( ( rule__Direction__RIGHTAssignment_3 ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:536:1: ( ( ( rule__Direction__UPAssignment_0 ) ) | ( ( rule__Direction__DOWNAssignment_1 ) ) | ( ( rule__Direction__LEFTAssignment_2 ) ) | ( ( rule__Direction__RIGHTAssignment_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 31:
                {
                alt8=3;
                }
                break;
            case 32:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalRoc.g:537:2: ( ( rule__Direction__UPAssignment_0 ) )
                    {
                    // InternalRoc.g:537:2: ( ( rule__Direction__UPAssignment_0 ) )
                    // InternalRoc.g:538:3: ( rule__Direction__UPAssignment_0 )
                    {
                     before(grammarAccess.getDirectionAccess().getUPAssignment_0()); 
                    // InternalRoc.g:539:3: ( rule__Direction__UPAssignment_0 )
                    // InternalRoc.g:539:4: rule__Direction__UPAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Direction__UPAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectionAccess().getUPAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:543:2: ( ( rule__Direction__DOWNAssignment_1 ) )
                    {
                    // InternalRoc.g:543:2: ( ( rule__Direction__DOWNAssignment_1 ) )
                    // InternalRoc.g:544:3: ( rule__Direction__DOWNAssignment_1 )
                    {
                     before(grammarAccess.getDirectionAccess().getDOWNAssignment_1()); 
                    // InternalRoc.g:545:3: ( rule__Direction__DOWNAssignment_1 )
                    // InternalRoc.g:545:4: rule__Direction__DOWNAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Direction__DOWNAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectionAccess().getDOWNAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:549:2: ( ( rule__Direction__LEFTAssignment_2 ) )
                    {
                    // InternalRoc.g:549:2: ( ( rule__Direction__LEFTAssignment_2 ) )
                    // InternalRoc.g:550:3: ( rule__Direction__LEFTAssignment_2 )
                    {
                     before(grammarAccess.getDirectionAccess().getLEFTAssignment_2()); 
                    // InternalRoc.g:551:3: ( rule__Direction__LEFTAssignment_2 )
                    // InternalRoc.g:551:4: rule__Direction__LEFTAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Direction__LEFTAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectionAccess().getLEFTAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoc.g:555:2: ( ( rule__Direction__RIGHTAssignment_3 ) )
                    {
                    // InternalRoc.g:555:2: ( ( rule__Direction__RIGHTAssignment_3 ) )
                    // InternalRoc.g:556:3: ( rule__Direction__RIGHTAssignment_3 )
                    {
                     before(grammarAccess.getDirectionAccess().getRIGHTAssignment_3()); 
                    // InternalRoc.g:557:3: ( rule__Direction__RIGHTAssignment_3 )
                    // InternalRoc.g:557:4: rule__Direction__RIGHTAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Direction__RIGHTAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectionAccess().getRIGHTAssignment_3()); 

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
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__Speed__Alternatives"
    // InternalRoc.g:565:1: rule__Speed__Alternatives : ( ( ( rule__Speed__SLOWESTAssignment_0 ) ) | ( ( rule__Speed__SLOWAssignment_1 ) ) | ( ( rule__Speed__NORMALAssignment_2 ) ) | ( ( rule__Speed__FASTAssignment_3 ) ) | ( ( rule__Speed__FULLAssignment_4 ) ) );
    public final void rule__Speed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:569:1: ( ( ( rule__Speed__SLOWESTAssignment_0 ) ) | ( ( rule__Speed__SLOWAssignment_1 ) ) | ( ( rule__Speed__NORMALAssignment_2 ) ) | ( ( rule__Speed__FASTAssignment_3 ) ) | ( ( rule__Speed__FULLAssignment_4 ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt9=1;
                }
                break;
            case 38:
                {
                alt9=2;
                }
                break;
            case 39:
                {
                alt9=3;
                }
                break;
            case 40:
                {
                alt9=4;
                }
                break;
            case 41:
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
                    // InternalRoc.g:570:2: ( ( rule__Speed__SLOWESTAssignment_0 ) )
                    {
                    // InternalRoc.g:570:2: ( ( rule__Speed__SLOWESTAssignment_0 ) )
                    // InternalRoc.g:571:3: ( rule__Speed__SLOWESTAssignment_0 )
                    {
                     before(grammarAccess.getSpeedAccess().getSLOWESTAssignment_0()); 
                    // InternalRoc.g:572:3: ( rule__Speed__SLOWESTAssignment_0 )
                    // InternalRoc.g:572:4: rule__Speed__SLOWESTAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Speed__SLOWESTAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpeedAccess().getSLOWESTAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:576:2: ( ( rule__Speed__SLOWAssignment_1 ) )
                    {
                    // InternalRoc.g:576:2: ( ( rule__Speed__SLOWAssignment_1 ) )
                    // InternalRoc.g:577:3: ( rule__Speed__SLOWAssignment_1 )
                    {
                     before(grammarAccess.getSpeedAccess().getSLOWAssignment_1()); 
                    // InternalRoc.g:578:3: ( rule__Speed__SLOWAssignment_1 )
                    // InternalRoc.g:578:4: rule__Speed__SLOWAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Speed__SLOWAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpeedAccess().getSLOWAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:582:2: ( ( rule__Speed__NORMALAssignment_2 ) )
                    {
                    // InternalRoc.g:582:2: ( ( rule__Speed__NORMALAssignment_2 ) )
                    // InternalRoc.g:583:3: ( rule__Speed__NORMALAssignment_2 )
                    {
                     before(grammarAccess.getSpeedAccess().getNORMALAssignment_2()); 
                    // InternalRoc.g:584:3: ( rule__Speed__NORMALAssignment_2 )
                    // InternalRoc.g:584:4: rule__Speed__NORMALAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Speed__NORMALAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpeedAccess().getNORMALAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoc.g:588:2: ( ( rule__Speed__FASTAssignment_3 ) )
                    {
                    // InternalRoc.g:588:2: ( ( rule__Speed__FASTAssignment_3 ) )
                    // InternalRoc.g:589:3: ( rule__Speed__FASTAssignment_3 )
                    {
                     before(grammarAccess.getSpeedAccess().getFASTAssignment_3()); 
                    // InternalRoc.g:590:3: ( rule__Speed__FASTAssignment_3 )
                    // InternalRoc.g:590:4: rule__Speed__FASTAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__Speed__FASTAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpeedAccess().getFASTAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRoc.g:594:2: ( ( rule__Speed__FULLAssignment_4 ) )
                    {
                    // InternalRoc.g:594:2: ( ( rule__Speed__FULLAssignment_4 ) )
                    // InternalRoc.g:595:3: ( rule__Speed__FULLAssignment_4 )
                    {
                     before(grammarAccess.getSpeedAccess().getFULLAssignment_4()); 
                    // InternalRoc.g:596:3: ( rule__Speed__FULLAssignment_4 )
                    // InternalRoc.g:596:4: rule__Speed__FULLAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Speed__FULLAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getSpeedAccess().getFULLAssignment_4()); 

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
    // $ANTLR end "rule__Speed__Alternatives"


    // $ANTLR start "rule__Intensity__Alternatives"
    // InternalRoc.g:604:1: rule__Intensity__Alternatives : ( ( ( 'pronounced' ) ) | ( ( 'trace of' ) ) | ( ( 'slightly' ) ) | ( ( 'severe' ) ) | ( ( 'maximum' ) ) );
    public final void rule__Intensity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:608:1: ( ( ( 'pronounced' ) ) | ( ( 'trace of' ) ) | ( ( 'slightly' ) ) | ( ( 'severe' ) ) | ( ( 'maximum' ) ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt10=1;
                }
                break;
            case 18:
                {
                alt10=2;
                }
                break;
            case 19:
                {
                alt10=3;
                }
                break;
            case 20:
                {
                alt10=4;
                }
                break;
            case 21:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRoc.g:609:2: ( ( 'pronounced' ) )
                    {
                    // InternalRoc.g:609:2: ( ( 'pronounced' ) )
                    // InternalRoc.g:610:3: ( 'pronounced' )
                    {
                     before(grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0()); 
                    // InternalRoc.g:611:3: ( 'pronounced' )
                    // InternalRoc.g:611:4: 'pronounced'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:615:2: ( ( 'trace of' ) )
                    {
                    // InternalRoc.g:615:2: ( ( 'trace of' ) )
                    // InternalRoc.g:616:3: ( 'trace of' )
                    {
                     before(grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1()); 
                    // InternalRoc.g:617:3: ( 'trace of' )
                    // InternalRoc.g:617:4: 'trace of'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:621:2: ( ( 'slightly' ) )
                    {
                    // InternalRoc.g:621:2: ( ( 'slightly' ) )
                    // InternalRoc.g:622:3: ( 'slightly' )
                    {
                     before(grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2()); 
                    // InternalRoc.g:623:3: ( 'slightly' )
                    // InternalRoc.g:623:4: 'slightly'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoc.g:627:2: ( ( 'severe' ) )
                    {
                    // InternalRoc.g:627:2: ( ( 'severe' ) )
                    // InternalRoc.g:628:3: ( 'severe' )
                    {
                     before(grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalRoc.g:629:3: ( 'severe' )
                    // InternalRoc.g:629:4: 'severe'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRoc.g:633:2: ( ( 'maximum' ) )
                    {
                    // InternalRoc.g:633:2: ( ( 'maximum' ) )
                    // InternalRoc.g:634:3: ( 'maximum' )
                    {
                     before(grammarAccess.getIntensityAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalRoc.g:635:3: ( 'maximum' )
                    // InternalRoc.g:635:4: 'maximum'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getEEnumLiteralDeclaration_4()); 

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
    // $ANTLR end "rule__Intensity__Alternatives"


    // $ANTLR start "rule__DurationUnit__Alternatives"
    // InternalRoc.g:643:1: rule__DurationUnit__Alternatives : ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) );
    public final void rule__DurationUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:647:1: ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt11=1;
                }
                break;
            case 23:
                {
                alt11=2;
                }
                break;
            case 24:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRoc.g:648:2: ( ( 'milliseconds' ) )
                    {
                    // InternalRoc.g:648:2: ( ( 'milliseconds' ) )
                    // InternalRoc.g:649:3: ( 'milliseconds' )
                    {
                     before(grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0()); 
                    // InternalRoc.g:650:3: ( 'milliseconds' )
                    // InternalRoc.g:650:4: 'milliseconds'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:654:2: ( ( 'seconds' ) )
                    {
                    // InternalRoc.g:654:2: ( ( 'seconds' ) )
                    // InternalRoc.g:655:3: ( 'seconds' )
                    {
                     before(grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1()); 
                    // InternalRoc.g:656:3: ( 'seconds' )
                    // InternalRoc.g:656:4: 'seconds'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:660:2: ( ( 'minutes' ) )
                    {
                    // InternalRoc.g:660:2: ( ( 'minutes' ) )
                    // InternalRoc.g:661:3: ( 'minutes' )
                    {
                     before(grammarAccess.getDurationUnitAccess().getMINUTESEnumLiteralDeclaration_2()); 
                    // InternalRoc.g:662:3: ( 'minutes' )
                    // InternalRoc.g:662:4: 'minutes'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationUnitAccess().getMINUTESEnumLiteralDeclaration_2()); 

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
    // $ANTLR end "rule__DurationUnit__Alternatives"


    // $ANTLR start "rule__Movement__Group__0"
    // InternalRoc.g:670:1: rule__Movement__Group__0 : rule__Movement__Group__0__Impl rule__Movement__Group__1 ;
    public final void rule__Movement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:674:1: ( rule__Movement__Group__0__Impl rule__Movement__Group__1 )
            // InternalRoc.g:675:2: rule__Movement__Group__0__Impl rule__Movement__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Movement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movement__Group__1();

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
    // $ANTLR end "rule__Movement__Group__0"


    // $ANTLR start "rule__Movement__Group__0__Impl"
    // InternalRoc.g:682:1: rule__Movement__Group__0__Impl : ( ( rule__Movement__MotionsAssignment_0 ) ) ;
    public final void rule__Movement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:686:1: ( ( ( rule__Movement__MotionsAssignment_0 ) ) )
            // InternalRoc.g:687:1: ( ( rule__Movement__MotionsAssignment_0 ) )
            {
            // InternalRoc.g:687:1: ( ( rule__Movement__MotionsAssignment_0 ) )
            // InternalRoc.g:688:2: ( rule__Movement__MotionsAssignment_0 )
            {
             before(grammarAccess.getMovementAccess().getMotionsAssignment_0()); 
            // InternalRoc.g:689:2: ( rule__Movement__MotionsAssignment_0 )
            // InternalRoc.g:689:3: rule__Movement__MotionsAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Movement__MotionsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMovementAccess().getMotionsAssignment_0()); 

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
    // $ANTLR end "rule__Movement__Group__0__Impl"


    // $ANTLR start "rule__Movement__Group__1"
    // InternalRoc.g:697:1: rule__Movement__Group__1 : rule__Movement__Group__1__Impl rule__Movement__Group__2 ;
    public final void rule__Movement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:701:1: ( rule__Movement__Group__1__Impl rule__Movement__Group__2 )
            // InternalRoc.g:702:2: rule__Movement__Group__1__Impl rule__Movement__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Movement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movement__Group__2();

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
    // $ANTLR end "rule__Movement__Group__1"


    // $ANTLR start "rule__Movement__Group__1__Impl"
    // InternalRoc.g:709:1: rule__Movement__Group__1__Impl : ( ( rule__Movement__Group_1__0 )* ) ;
    public final void rule__Movement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:713:1: ( ( ( rule__Movement__Group_1__0 )* ) )
            // InternalRoc.g:714:1: ( ( rule__Movement__Group_1__0 )* )
            {
            // InternalRoc.g:714:1: ( ( rule__Movement__Group_1__0 )* )
            // InternalRoc.g:715:2: ( rule__Movement__Group_1__0 )*
            {
             before(grammarAccess.getMovementAccess().getGroup_1()); 
            // InternalRoc.g:716:2: ( rule__Movement__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRoc.g:716:3: rule__Movement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Movement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getMovementAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Movement__Group__1__Impl"


    // $ANTLR start "rule__Movement__Group__2"
    // InternalRoc.g:724:1: rule__Movement__Group__2 : rule__Movement__Group__2__Impl ;
    public final void rule__Movement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:728:1: ( rule__Movement__Group__2__Impl )
            // InternalRoc.g:729:2: rule__Movement__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movement__Group__2__Impl();

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
    // $ANTLR end "rule__Movement__Group__2"


    // $ANTLR start "rule__Movement__Group__2__Impl"
    // InternalRoc.g:735:1: rule__Movement__Group__2__Impl : ( RULE_PERIOD ) ;
    public final void rule__Movement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:739:1: ( ( RULE_PERIOD ) )
            // InternalRoc.g:740:1: ( RULE_PERIOD )
            {
            // InternalRoc.g:740:1: ( RULE_PERIOD )
            // InternalRoc.g:741:2: RULE_PERIOD
            {
             before(grammarAccess.getMovementAccess().getPERIODTerminalRuleCall_2()); 
            match(input,RULE_PERIOD,FOLLOW_2); 
             after(grammarAccess.getMovementAccess().getPERIODTerminalRuleCall_2()); 

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
    // $ANTLR end "rule__Movement__Group__2__Impl"


    // $ANTLR start "rule__Movement__Group_1__0"
    // InternalRoc.g:751:1: rule__Movement__Group_1__0 : rule__Movement__Group_1__0__Impl rule__Movement__Group_1__1 ;
    public final void rule__Movement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:755:1: ( rule__Movement__Group_1__0__Impl rule__Movement__Group_1__1 )
            // InternalRoc.g:756:2: rule__Movement__Group_1__0__Impl rule__Movement__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Movement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Movement__Group_1__1();

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
    // $ANTLR end "rule__Movement__Group_1__0"


    // $ANTLR start "rule__Movement__Group_1__0__Impl"
    // InternalRoc.g:763:1: rule__Movement__Group_1__0__Impl : ( RULE_AND ) ;
    public final void rule__Movement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:767:1: ( ( RULE_AND ) )
            // InternalRoc.g:768:1: ( RULE_AND )
            {
            // InternalRoc.g:768:1: ( RULE_AND )
            // InternalRoc.g:769:2: RULE_AND
            {
             before(grammarAccess.getMovementAccess().getANDTerminalRuleCall_1_0()); 
            match(input,RULE_AND,FOLLOW_2); 
             after(grammarAccess.getMovementAccess().getANDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Movement__Group_1__0__Impl"


    // $ANTLR start "rule__Movement__Group_1__1"
    // InternalRoc.g:778:1: rule__Movement__Group_1__1 : rule__Movement__Group_1__1__Impl ;
    public final void rule__Movement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:782:1: ( rule__Movement__Group_1__1__Impl )
            // InternalRoc.g:783:2: rule__Movement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Movement__Group_1__1__Impl();

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
    // $ANTLR end "rule__Movement__Group_1__1"


    // $ANTLR start "rule__Movement__Group_1__1__Impl"
    // InternalRoc.g:789:1: rule__Movement__Group_1__1__Impl : ( ( rule__Movement__MotionsAssignment_1_1 ) ) ;
    public final void rule__Movement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:793:1: ( ( ( rule__Movement__MotionsAssignment_1_1 ) ) )
            // InternalRoc.g:794:1: ( ( rule__Movement__MotionsAssignment_1_1 ) )
            {
            // InternalRoc.g:794:1: ( ( rule__Movement__MotionsAssignment_1_1 ) )
            // InternalRoc.g:795:2: ( rule__Movement__MotionsAssignment_1_1 )
            {
             before(grammarAccess.getMovementAccess().getMotionsAssignment_1_1()); 
            // InternalRoc.g:796:2: ( rule__Movement__MotionsAssignment_1_1 )
            // InternalRoc.g:796:3: rule__Movement__MotionsAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Movement__MotionsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMovementAccess().getMotionsAssignment_1_1()); 

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
    // $ANTLR end "rule__Movement__Group_1__1__Impl"


    // $ANTLR start "rule__Motion__Group_0__0"
    // InternalRoc.g:805:1: rule__Motion__Group_0__0 : rule__Motion__Group_0__0__Impl rule__Motion__Group_0__1 ;
    public final void rule__Motion__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:809:1: ( rule__Motion__Group_0__0__Impl rule__Motion__Group_0__1 )
            // InternalRoc.g:810:2: rule__Motion__Group_0__0__Impl rule__Motion__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Motion__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motion__Group_0__1();

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
    // $ANTLR end "rule__Motion__Group_0__0"


    // $ANTLR start "rule__Motion__Group_0__0__Impl"
    // InternalRoc.g:817:1: rule__Motion__Group_0__0__Impl : ( ( rule__Motion__ActionAssignment_0_0 ) ) ;
    public final void rule__Motion__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:821:1: ( ( ( rule__Motion__ActionAssignment_0_0 ) ) )
            // InternalRoc.g:822:1: ( ( rule__Motion__ActionAssignment_0_0 ) )
            {
            // InternalRoc.g:822:1: ( ( rule__Motion__ActionAssignment_0_0 ) )
            // InternalRoc.g:823:2: ( rule__Motion__ActionAssignment_0_0 )
            {
             before(grammarAccess.getMotionAccess().getActionAssignment_0_0()); 
            // InternalRoc.g:824:2: ( rule__Motion__ActionAssignment_0_0 )
            // InternalRoc.g:824:3: rule__Motion__ActionAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Motion__ActionAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getMotionAccess().getActionAssignment_0_0()); 

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
    // $ANTLR end "rule__Motion__Group_0__0__Impl"


    // $ANTLR start "rule__Motion__Group_0__1"
    // InternalRoc.g:832:1: rule__Motion__Group_0__1 : rule__Motion__Group_0__1__Impl rule__Motion__Group_0__2 ;
    public final void rule__Motion__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:836:1: ( rule__Motion__Group_0__1__Impl rule__Motion__Group_0__2 )
            // InternalRoc.g:837:2: rule__Motion__Group_0__1__Impl rule__Motion__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__Motion__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motion__Group_0__2();

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
    // $ANTLR end "rule__Motion__Group_0__1"


    // $ANTLR start "rule__Motion__Group_0__1__Impl"
    // InternalRoc.g:844:1: rule__Motion__Group_0__1__Impl : ( RULE_FOR ) ;
    public final void rule__Motion__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:848:1: ( ( RULE_FOR ) )
            // InternalRoc.g:849:1: ( RULE_FOR )
            {
            // InternalRoc.g:849:1: ( RULE_FOR )
            // InternalRoc.g:850:2: RULE_FOR
            {
             before(grammarAccess.getMotionAccess().getFORTerminalRuleCall_0_1()); 
            match(input,RULE_FOR,FOLLOW_2); 
             after(grammarAccess.getMotionAccess().getFORTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__Motion__Group_0__1__Impl"


    // $ANTLR start "rule__Motion__Group_0__2"
    // InternalRoc.g:859:1: rule__Motion__Group_0__2 : rule__Motion__Group_0__2__Impl rule__Motion__Group_0__3 ;
    public final void rule__Motion__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:863:1: ( rule__Motion__Group_0__2__Impl rule__Motion__Group_0__3 )
            // InternalRoc.g:864:2: rule__Motion__Group_0__2__Impl rule__Motion__Group_0__3
            {
            pushFollow(FOLLOW_9);
            rule__Motion__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motion__Group_0__3();

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
    // $ANTLR end "rule__Motion__Group_0__2"


    // $ANTLR start "rule__Motion__Group_0__2__Impl"
    // InternalRoc.g:871:1: rule__Motion__Group_0__2__Impl : ( ( rule__Motion__DurationAssignment_0_2 ) ) ;
    public final void rule__Motion__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:875:1: ( ( ( rule__Motion__DurationAssignment_0_2 ) ) )
            // InternalRoc.g:876:1: ( ( rule__Motion__DurationAssignment_0_2 ) )
            {
            // InternalRoc.g:876:1: ( ( rule__Motion__DurationAssignment_0_2 ) )
            // InternalRoc.g:877:2: ( rule__Motion__DurationAssignment_0_2 )
            {
             before(grammarAccess.getMotionAccess().getDurationAssignment_0_2()); 
            // InternalRoc.g:878:2: ( rule__Motion__DurationAssignment_0_2 )
            // InternalRoc.g:878:3: rule__Motion__DurationAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Motion__DurationAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMotionAccess().getDurationAssignment_0_2()); 

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
    // $ANTLR end "rule__Motion__Group_0__2__Impl"


    // $ANTLR start "rule__Motion__Group_0__3"
    // InternalRoc.g:886:1: rule__Motion__Group_0__3 : rule__Motion__Group_0__3__Impl ;
    public final void rule__Motion__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:890:1: ( rule__Motion__Group_0__3__Impl )
            // InternalRoc.g:891:2: rule__Motion__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Motion__Group_0__3__Impl();

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
    // $ANTLR end "rule__Motion__Group_0__3"


    // $ANTLR start "rule__Motion__Group_0__3__Impl"
    // InternalRoc.g:897:1: rule__Motion__Group_0__3__Impl : ( ( rule__Motion__DurationUnitAssignment_0_3 ) ) ;
    public final void rule__Motion__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:901:1: ( ( ( rule__Motion__DurationUnitAssignment_0_3 ) ) )
            // InternalRoc.g:902:1: ( ( rule__Motion__DurationUnitAssignment_0_3 ) )
            {
            // InternalRoc.g:902:1: ( ( rule__Motion__DurationUnitAssignment_0_3 ) )
            // InternalRoc.g:903:2: ( rule__Motion__DurationUnitAssignment_0_3 )
            {
             before(grammarAccess.getMotionAccess().getDurationUnitAssignment_0_3()); 
            // InternalRoc.g:904:2: ( rule__Motion__DurationUnitAssignment_0_3 )
            // InternalRoc.g:904:3: rule__Motion__DurationUnitAssignment_0_3
            {
            pushFollow(FOLLOW_2);
            rule__Motion__DurationUnitAssignment_0_3();

            state._fsp--;


            }

             after(grammarAccess.getMotionAccess().getDurationUnitAssignment_0_3()); 

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
    // $ANTLR end "rule__Motion__Group_0__3__Impl"


    // $ANTLR start "rule__Motion__Group_1__0"
    // InternalRoc.g:913:1: rule__Motion__Group_1__0 : rule__Motion__Group_1__0__Impl rule__Motion__Group_1__1 ;
    public final void rule__Motion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:917:1: ( rule__Motion__Group_1__0__Impl rule__Motion__Group_1__1 )
            // InternalRoc.g:918:2: rule__Motion__Group_1__0__Impl rule__Motion__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__Motion__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motion__Group_1__1();

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
    // $ANTLR end "rule__Motion__Group_1__0"


    // $ANTLR start "rule__Motion__Group_1__0__Impl"
    // InternalRoc.g:925:1: rule__Motion__Group_1__0__Impl : ( ( rule__Motion__ActionAssignment_1_0 ) ) ;
    public final void rule__Motion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:929:1: ( ( ( rule__Motion__ActionAssignment_1_0 ) ) )
            // InternalRoc.g:930:1: ( ( rule__Motion__ActionAssignment_1_0 ) )
            {
            // InternalRoc.g:930:1: ( ( rule__Motion__ActionAssignment_1_0 ) )
            // InternalRoc.g:931:2: ( rule__Motion__ActionAssignment_1_0 )
            {
             before(grammarAccess.getMotionAccess().getActionAssignment_1_0()); 
            // InternalRoc.g:932:2: ( rule__Motion__ActionAssignment_1_0 )
            // InternalRoc.g:932:3: rule__Motion__ActionAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Motion__ActionAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMotionAccess().getActionAssignment_1_0()); 

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
    // $ANTLR end "rule__Motion__Group_1__0__Impl"


    // $ANTLR start "rule__Motion__Group_1__1"
    // InternalRoc.g:940:1: rule__Motion__Group_1__1 : rule__Motion__Group_1__1__Impl rule__Motion__Group_1__2 ;
    public final void rule__Motion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:944:1: ( rule__Motion__Group_1__1__Impl rule__Motion__Group_1__2 )
            // InternalRoc.g:945:2: rule__Motion__Group_1__1__Impl rule__Motion__Group_1__2
            {
            pushFollow(FOLLOW_11);
            rule__Motion__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motion__Group_1__2();

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
    // $ANTLR end "rule__Motion__Group_1__1"


    // $ANTLR start "rule__Motion__Group_1__1__Impl"
    // InternalRoc.g:952:1: rule__Motion__Group_1__1__Impl : ( RULE_WITH ) ;
    public final void rule__Motion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:956:1: ( ( RULE_WITH ) )
            // InternalRoc.g:957:1: ( RULE_WITH )
            {
            // InternalRoc.g:957:1: ( RULE_WITH )
            // InternalRoc.g:958:2: RULE_WITH
            {
             before(grammarAccess.getMotionAccess().getWITHTerminalRuleCall_1_1()); 
            match(input,RULE_WITH,FOLLOW_2); 
             after(grammarAccess.getMotionAccess().getWITHTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__Motion__Group_1__1__Impl"


    // $ANTLR start "rule__Motion__Group_1__2"
    // InternalRoc.g:967:1: rule__Motion__Group_1__2 : rule__Motion__Group_1__2__Impl rule__Motion__Group_1__3 ;
    public final void rule__Motion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:971:1: ( rule__Motion__Group_1__2__Impl rule__Motion__Group_1__3 )
            // InternalRoc.g:972:2: rule__Motion__Group_1__2__Impl rule__Motion__Group_1__3
            {
            pushFollow(FOLLOW_12);
            rule__Motion__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motion__Group_1__3();

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
    // $ANTLR end "rule__Motion__Group_1__2"


    // $ANTLR start "rule__Motion__Group_1__2__Impl"
    // InternalRoc.g:979:1: rule__Motion__Group_1__2__Impl : ( ( rule__Motion__SpeedAssignment_1_2 ) ) ;
    public final void rule__Motion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:983:1: ( ( ( rule__Motion__SpeedAssignment_1_2 ) ) )
            // InternalRoc.g:984:1: ( ( rule__Motion__SpeedAssignment_1_2 ) )
            {
            // InternalRoc.g:984:1: ( ( rule__Motion__SpeedAssignment_1_2 ) )
            // InternalRoc.g:985:2: ( rule__Motion__SpeedAssignment_1_2 )
            {
             before(grammarAccess.getMotionAccess().getSpeedAssignment_1_2()); 
            // InternalRoc.g:986:2: ( rule__Motion__SpeedAssignment_1_2 )
            // InternalRoc.g:986:3: rule__Motion__SpeedAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Motion__SpeedAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMotionAccess().getSpeedAssignment_1_2()); 

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
    // $ANTLR end "rule__Motion__Group_1__2__Impl"


    // $ANTLR start "rule__Motion__Group_1__3"
    // InternalRoc.g:994:1: rule__Motion__Group_1__3 : rule__Motion__Group_1__3__Impl ;
    public final void rule__Motion__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:998:1: ( rule__Motion__Group_1__3__Impl )
            // InternalRoc.g:999:2: rule__Motion__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Motion__Group_1__3__Impl();

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
    // $ANTLR end "rule__Motion__Group_1__3"


    // $ANTLR start "rule__Motion__Group_1__3__Impl"
    // InternalRoc.g:1005:1: rule__Motion__Group_1__3__Impl : ( RULE_SPEED_KEY ) ;
    public final void rule__Motion__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1009:1: ( ( RULE_SPEED_KEY ) )
            // InternalRoc.g:1010:1: ( RULE_SPEED_KEY )
            {
            // InternalRoc.g:1010:1: ( RULE_SPEED_KEY )
            // InternalRoc.g:1011:2: RULE_SPEED_KEY
            {
             before(grammarAccess.getMotionAccess().getSPEED_KEYTerminalRuleCall_1_3()); 
            match(input,RULE_SPEED_KEY,FOLLOW_2); 
             after(grammarAccess.getMotionAccess().getSPEED_KEYTerminalRuleCall_1_3()); 

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
    // $ANTLR end "rule__Motion__Group_1__3__Impl"


    // $ANTLR start "rule__Action__Group_1__0"
    // InternalRoc.g:1021:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1025:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // InternalRoc.g:1026:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__Action__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_1__1();

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
    // $ANTLR end "rule__Action__Group_1__0"


    // $ANTLR start "rule__Action__Group_1__0__Impl"
    // InternalRoc.g:1033:1: rule__Action__Group_1__0__Impl : ( ( rule__Action__IntensityAssignment_1_0 )? ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1037:1: ( ( ( rule__Action__IntensityAssignment_1_0 )? ) )
            // InternalRoc.g:1038:1: ( ( rule__Action__IntensityAssignment_1_0 )? )
            {
            // InternalRoc.g:1038:1: ( ( rule__Action__IntensityAssignment_1_0 )? )
            // InternalRoc.g:1039:2: ( rule__Action__IntensityAssignment_1_0 )?
            {
             before(grammarAccess.getActionAccess().getIntensityAssignment_1_0()); 
            // InternalRoc.g:1040:2: ( rule__Action__IntensityAssignment_1_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=17 && LA13_0<=21)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoc.g:1040:3: rule__Action__IntensityAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__IntensityAssignment_1_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getIntensityAssignment_1_0()); 

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
    // $ANTLR end "rule__Action__Group_1__0__Impl"


    // $ANTLR start "rule__Action__Group_1__1"
    // InternalRoc.g:1048:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1052:1: ( rule__Action__Group_1__1__Impl )
            // InternalRoc.g:1053:2: rule__Action__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_1__1__Impl();

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
    // $ANTLR end "rule__Action__Group_1__1"


    // $ANTLR start "rule__Action__Group_1__1__Impl"
    // InternalRoc.g:1059:1: rule__Action__Group_1__1__Impl : ( ( rule__Action__ActionHolderAssignment_1_1 ) ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1063:1: ( ( ( rule__Action__ActionHolderAssignment_1_1 ) ) )
            // InternalRoc.g:1064:1: ( ( rule__Action__ActionHolderAssignment_1_1 ) )
            {
            // InternalRoc.g:1064:1: ( ( rule__Action__ActionHolderAssignment_1_1 ) )
            // InternalRoc.g:1065:2: ( rule__Action__ActionHolderAssignment_1_1 )
            {
             before(grammarAccess.getActionAccess().getActionHolderAssignment_1_1()); 
            // InternalRoc.g:1066:2: ( rule__Action__ActionHolderAssignment_1_1 )
            // InternalRoc.g:1066:3: rule__Action__ActionHolderAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionHolderAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionHolderAssignment_1_1()); 

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
    // $ANTLR end "rule__Action__Group_1__1__Impl"


    // $ANTLR start "rule__Action__Group_2__0"
    // InternalRoc.g:1075:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1079:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalRoc.g:1080:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
            {
            pushFollow(FOLLOW_6);
            rule__Action__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Action__Group_2__1();

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
    // $ANTLR end "rule__Action__Group_2__0"


    // $ANTLR start "rule__Action__Group_2__0__Impl"
    // InternalRoc.g:1087:1: rule__Action__Group_2__0__Impl : ( ( rule__Action__IntensityAssignment_2_0 )? ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1091:1: ( ( ( rule__Action__IntensityAssignment_2_0 )? ) )
            // InternalRoc.g:1092:1: ( ( rule__Action__IntensityAssignment_2_0 )? )
            {
            // InternalRoc.g:1092:1: ( ( rule__Action__IntensityAssignment_2_0 )? )
            // InternalRoc.g:1093:2: ( rule__Action__IntensityAssignment_2_0 )?
            {
             before(grammarAccess.getActionAccess().getIntensityAssignment_2_0()); 
            // InternalRoc.g:1094:2: ( rule__Action__IntensityAssignment_2_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=17 && LA14_0<=21)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRoc.g:1094:3: rule__Action__IntensityAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Action__IntensityAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getActionAccess().getIntensityAssignment_2_0()); 

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
    // $ANTLR end "rule__Action__Group_2__0__Impl"


    // $ANTLR start "rule__Action__Group_2__1"
    // InternalRoc.g:1102:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1106:1: ( rule__Action__Group_2__1__Impl )
            // InternalRoc.g:1107:2: rule__Action__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Action__Group_2__1__Impl();

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
    // $ANTLR end "rule__Action__Group_2__1"


    // $ANTLR start "rule__Action__Group_2__1__Impl"
    // InternalRoc.g:1113:1: rule__Action__Group_2__1__Impl : ( ( rule__Action__ActionHolderAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1117:1: ( ( ( rule__Action__ActionHolderAssignment_2_1 ) ) )
            // InternalRoc.g:1118:1: ( ( rule__Action__ActionHolderAssignment_2_1 ) )
            {
            // InternalRoc.g:1118:1: ( ( rule__Action__ActionHolderAssignment_2_1 ) )
            // InternalRoc.g:1119:2: ( rule__Action__ActionHolderAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getActionHolderAssignment_2_1()); 
            // InternalRoc.g:1120:2: ( rule__Action__ActionHolderAssignment_2_1 )
            // InternalRoc.g:1120:3: rule__Action__ActionHolderAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Action__ActionHolderAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getActionHolderAssignment_2_1()); 

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
    // $ANTLR end "rule__Action__Group_2__1__Impl"


    // $ANTLR start "rule__CompleteAction__Group__0"
    // InternalRoc.g:1129:1: rule__CompleteAction__Group__0 : rule__CompleteAction__Group__0__Impl rule__CompleteAction__Group__1 ;
    public final void rule__CompleteAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1133:1: ( rule__CompleteAction__Group__0__Impl rule__CompleteAction__Group__1 )
            // InternalRoc.g:1134:2: rule__CompleteAction__Group__0__Impl rule__CompleteAction__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__CompleteAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__CompleteAction__Group__1();

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
    // $ANTLR end "rule__CompleteAction__Group__0"


    // $ANTLR start "rule__CompleteAction__Group__0__Impl"
    // InternalRoc.g:1141:1: rule__CompleteAction__Group__0__Impl : ( ( rule__CompleteAction__ActionNameAssignment_0 ) ) ;
    public final void rule__CompleteAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1145:1: ( ( ( rule__CompleteAction__ActionNameAssignment_0 ) ) )
            // InternalRoc.g:1146:1: ( ( rule__CompleteAction__ActionNameAssignment_0 ) )
            {
            // InternalRoc.g:1146:1: ( ( rule__CompleteAction__ActionNameAssignment_0 ) )
            // InternalRoc.g:1147:2: ( rule__CompleteAction__ActionNameAssignment_0 )
            {
             before(grammarAccess.getCompleteActionAccess().getActionNameAssignment_0()); 
            // InternalRoc.g:1148:2: ( rule__CompleteAction__ActionNameAssignment_0 )
            // InternalRoc.g:1148:3: rule__CompleteAction__ActionNameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__CompleteAction__ActionNameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getCompleteActionAccess().getActionNameAssignment_0()); 

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
    // $ANTLR end "rule__CompleteAction__Group__0__Impl"


    // $ANTLR start "rule__CompleteAction__Group__1"
    // InternalRoc.g:1156:1: rule__CompleteAction__Group__1 : rule__CompleteAction__Group__1__Impl ;
    public final void rule__CompleteAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1160:1: ( rule__CompleteAction__Group__1__Impl )
            // InternalRoc.g:1161:2: rule__CompleteAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__CompleteAction__Group__1__Impl();

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
    // $ANTLR end "rule__CompleteAction__Group__1"


    // $ANTLR start "rule__CompleteAction__Group__1__Impl"
    // InternalRoc.g:1167:1: rule__CompleteAction__Group__1__Impl : ( 'face' ) ;
    public final void rule__CompleteAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1171:1: ( ( 'face' ) )
            // InternalRoc.g:1172:1: ( 'face' )
            {
            // InternalRoc.g:1172:1: ( 'face' )
            // InternalRoc.g:1173:2: 'face'
            {
             before(grammarAccess.getCompleteActionAccess().getFaceKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCompleteActionAccess().getFaceKeyword_1()); 

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
    // $ANTLR end "rule__CompleteAction__Group__1__Impl"


    // $ANTLR start "rule__DirectedAction__Group_0__0"
    // InternalRoc.g:1183:1: rule__DirectedAction__Group_0__0 : rule__DirectedAction__Group_0__0__Impl rule__DirectedAction__Group_0__1 ;
    public final void rule__DirectedAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1187:1: ( rule__DirectedAction__Group_0__0__Impl rule__DirectedAction__Group_0__1 )
            // InternalRoc.g:1188:2: rule__DirectedAction__Group_0__0__Impl rule__DirectedAction__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__DirectedAction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedAction__Group_0__1();

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
    // $ANTLR end "rule__DirectedAction__Group_0__0"


    // $ANTLR start "rule__DirectedAction__Group_0__0__Impl"
    // InternalRoc.g:1195:1: rule__DirectedAction__Group_0__0__Impl : ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) ) ;
    public final void rule__DirectedAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1199:1: ( ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) ) )
            // InternalRoc.g:1200:1: ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) )
            {
            // InternalRoc.g:1200:1: ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) )
            // InternalRoc.g:1201:2: ( rule__DirectedAction__ActionNameAssignment_0_0 )
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameAssignment_0_0()); 
            // InternalRoc.g:1202:2: ( rule__DirectedAction__ActionNameAssignment_0_0 )
            // InternalRoc.g:1202:3: rule__DirectedAction__ActionNameAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAction__ActionNameAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedActionAccess().getActionNameAssignment_0_0()); 

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
    // $ANTLR end "rule__DirectedAction__Group_0__0__Impl"


    // $ANTLR start "rule__DirectedAction__Group_0__1"
    // InternalRoc.g:1210:1: rule__DirectedAction__Group_0__1 : rule__DirectedAction__Group_0__1__Impl ;
    public final void rule__DirectedAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1214:1: ( rule__DirectedAction__Group_0__1__Impl )
            // InternalRoc.g:1215:2: rule__DirectedAction__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAction__Group_0__1__Impl();

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
    // $ANTLR end "rule__DirectedAction__Group_0__1"


    // $ANTLR start "rule__DirectedAction__Group_0__1__Impl"
    // InternalRoc.g:1221:1: rule__DirectedAction__Group_0__1__Impl : ( ( rule__DirectedAction__DirectionAssignment_0_1 ) ) ;
    public final void rule__DirectedAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1225:1: ( ( ( rule__DirectedAction__DirectionAssignment_0_1 ) ) )
            // InternalRoc.g:1226:1: ( ( rule__DirectedAction__DirectionAssignment_0_1 ) )
            {
            // InternalRoc.g:1226:1: ( ( rule__DirectedAction__DirectionAssignment_0_1 ) )
            // InternalRoc.g:1227:2: ( rule__DirectedAction__DirectionAssignment_0_1 )
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionAssignment_0_1()); 
            // InternalRoc.g:1228:2: ( rule__DirectedAction__DirectionAssignment_0_1 )
            // InternalRoc.g:1228:3: rule__DirectedAction__DirectionAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAction__DirectionAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectedActionAccess().getDirectionAssignment_0_1()); 

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
    // $ANTLR end "rule__DirectedAction__Group_0__1__Impl"


    // $ANTLR start "rule__DirectedAction__Group_1__0"
    // InternalRoc.g:1237:1: rule__DirectedAction__Group_1__0 : rule__DirectedAction__Group_1__0__Impl rule__DirectedAction__Group_1__1 ;
    public final void rule__DirectedAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1241:1: ( rule__DirectedAction__Group_1__0__Impl rule__DirectedAction__Group_1__1 )
            // InternalRoc.g:1242:2: rule__DirectedAction__Group_1__0__Impl rule__DirectedAction__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__DirectedAction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedAction__Group_1__1();

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
    // $ANTLR end "rule__DirectedAction__Group_1__0"


    // $ANTLR start "rule__DirectedAction__Group_1__0__Impl"
    // InternalRoc.g:1249:1: rule__DirectedAction__Group_1__0__Impl : ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) ) ;
    public final void rule__DirectedAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1253:1: ( ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) ) )
            // InternalRoc.g:1254:1: ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) )
            {
            // InternalRoc.g:1254:1: ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) )
            // InternalRoc.g:1255:2: ( rule__DirectedAction__ActionNameAssignment_1_0 )
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameAssignment_1_0()); 
            // InternalRoc.g:1256:2: ( rule__DirectedAction__ActionNameAssignment_1_0 )
            // InternalRoc.g:1256:3: rule__DirectedAction__ActionNameAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAction__ActionNameAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedActionAccess().getActionNameAssignment_1_0()); 

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
    // $ANTLR end "rule__DirectedAction__Group_1__0__Impl"


    // $ANTLR start "rule__DirectedAction__Group_1__1"
    // InternalRoc.g:1264:1: rule__DirectedAction__Group_1__1 : rule__DirectedAction__Group_1__1__Impl ;
    public final void rule__DirectedAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1268:1: ( rule__DirectedAction__Group_1__1__Impl )
            // InternalRoc.g:1269:2: rule__DirectedAction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAction__Group_1__1__Impl();

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
    // $ANTLR end "rule__DirectedAction__Group_1__1"


    // $ANTLR start "rule__DirectedAction__Group_1__1__Impl"
    // InternalRoc.g:1275:1: rule__DirectedAction__Group_1__1__Impl : ( ( rule__DirectedAction__DirectionAssignment_1_1 ) ) ;
    public final void rule__DirectedAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1279:1: ( ( ( rule__DirectedAction__DirectionAssignment_1_1 ) ) )
            // InternalRoc.g:1280:1: ( ( rule__DirectedAction__DirectionAssignment_1_1 ) )
            {
            // InternalRoc.g:1280:1: ( ( rule__DirectedAction__DirectionAssignment_1_1 ) )
            // InternalRoc.g:1281:2: ( rule__DirectedAction__DirectionAssignment_1_1 )
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionAssignment_1_1()); 
            // InternalRoc.g:1282:2: ( rule__DirectedAction__DirectionAssignment_1_1 )
            // InternalRoc.g:1282:3: rule__DirectedAction__DirectionAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAction__DirectionAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectedActionAccess().getDirectionAssignment_1_1()); 

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
    // $ANTLR end "rule__DirectedAction__Group_1__1__Impl"


    // $ANTLR start "rule__LeftRightDirectedAction__Group__0"
    // InternalRoc.g:1291:1: rule__LeftRightDirectedAction__Group__0 : rule__LeftRightDirectedAction__Group__0__Impl rule__LeftRightDirectedAction__Group__1 ;
    public final void rule__LeftRightDirectedAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1295:1: ( rule__LeftRightDirectedAction__Group__0__Impl rule__LeftRightDirectedAction__Group__1 )
            // InternalRoc.g:1296:2: rule__LeftRightDirectedAction__Group__0__Impl rule__LeftRightDirectedAction__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__LeftRightDirectedAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LeftRightDirectedAction__Group__1();

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
    // $ANTLR end "rule__LeftRightDirectedAction__Group__0"


    // $ANTLR start "rule__LeftRightDirectedAction__Group__0__Impl"
    // InternalRoc.g:1303:1: rule__LeftRightDirectedAction__Group__0__Impl : ( ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 ) ) ;
    public final void rule__LeftRightDirectedAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1307:1: ( ( ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 ) ) )
            // InternalRoc.g:1308:1: ( ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 ) )
            {
            // InternalRoc.g:1308:1: ( ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 ) )
            // InternalRoc.g:1309:2: ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 )
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadAssignment_0()); 
            // InternalRoc.g:1310:2: ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 )
            // InternalRoc.g:1310:3: rule__LeftRightDirectedAction__TiltHeadAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__LeftRightDirectedAction__TiltHeadAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadAssignment_0()); 

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
    // $ANTLR end "rule__LeftRightDirectedAction__Group__0__Impl"


    // $ANTLR start "rule__LeftRightDirectedAction__Group__1"
    // InternalRoc.g:1318:1: rule__LeftRightDirectedAction__Group__1 : rule__LeftRightDirectedAction__Group__1__Impl ;
    public final void rule__LeftRightDirectedAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1322:1: ( rule__LeftRightDirectedAction__Group__1__Impl )
            // InternalRoc.g:1323:2: rule__LeftRightDirectedAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LeftRightDirectedAction__Group__1__Impl();

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
    // $ANTLR end "rule__LeftRightDirectedAction__Group__1"


    // $ANTLR start "rule__LeftRightDirectedAction__Group__1__Impl"
    // InternalRoc.g:1329:1: rule__LeftRightDirectedAction__Group__1__Impl : ( 'head' ) ;
    public final void rule__LeftRightDirectedAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1333:1: ( ( 'head' ) )
            // InternalRoc.g:1334:1: ( 'head' )
            {
            // InternalRoc.g:1334:1: ( 'head' )
            // InternalRoc.g:1335:2: 'head'
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getHeadKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getLeftRightDirectedActionAccess().getHeadKeyword_1()); 

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
    // $ANTLR end "rule__LeftRightDirectedAction__Group__1__Impl"


    // $ANTLR start "rule__Program__MovementsAssignment"
    // InternalRoc.g:1345:1: rule__Program__MovementsAssignment : ( ruleMovement ) ;
    public final void rule__Program__MovementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1349:1: ( ( ruleMovement ) )
            // InternalRoc.g:1350:2: ( ruleMovement )
            {
            // InternalRoc.g:1350:2: ( ruleMovement )
            // InternalRoc.g:1351:3: ruleMovement
            {
             before(grammarAccess.getProgramAccess().getMovementsMovementParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMovement();

            state._fsp--;

             after(grammarAccess.getProgramAccess().getMovementsMovementParserRuleCall_0()); 

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
    // $ANTLR end "rule__Program__MovementsAssignment"


    // $ANTLR start "rule__Movement__MotionsAssignment_0"
    // InternalRoc.g:1360:1: rule__Movement__MotionsAssignment_0 : ( ruleMotion ) ;
    public final void rule__Movement__MotionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1364:1: ( ( ruleMotion ) )
            // InternalRoc.g:1365:2: ( ruleMotion )
            {
            // InternalRoc.g:1365:2: ( ruleMotion )
            // InternalRoc.g:1366:3: ruleMotion
            {
             before(grammarAccess.getMovementAccess().getMotionsMotionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleMotion();

            state._fsp--;

             after(grammarAccess.getMovementAccess().getMotionsMotionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Movement__MotionsAssignment_0"


    // $ANTLR start "rule__Movement__MotionsAssignment_1_1"
    // InternalRoc.g:1375:1: rule__Movement__MotionsAssignment_1_1 : ( ruleMotion ) ;
    public final void rule__Movement__MotionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1379:1: ( ( ruleMotion ) )
            // InternalRoc.g:1380:2: ( ruleMotion )
            {
            // InternalRoc.g:1380:2: ( ruleMotion )
            // InternalRoc.g:1381:3: ruleMotion
            {
             before(grammarAccess.getMovementAccess().getMotionsMotionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMotion();

            state._fsp--;

             after(grammarAccess.getMovementAccess().getMotionsMotionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Movement__MotionsAssignment_1_1"


    // $ANTLR start "rule__Motion__ActionAssignment_0_0"
    // InternalRoc.g:1390:1: rule__Motion__ActionAssignment_0_0 : ( ruleAction ) ;
    public final void rule__Motion__ActionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1394:1: ( ( ruleAction ) )
            // InternalRoc.g:1395:2: ( ruleAction )
            {
            // InternalRoc.g:1395:2: ( ruleAction )
            // InternalRoc.g:1396:3: ruleAction
            {
             before(grammarAccess.getMotionAccess().getActionActionParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMotionAccess().getActionActionParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__Motion__ActionAssignment_0_0"


    // $ANTLR start "rule__Motion__DurationAssignment_0_2"
    // InternalRoc.g:1405:1: rule__Motion__DurationAssignment_0_2 : ( RULE_DURATION ) ;
    public final void rule__Motion__DurationAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1409:1: ( ( RULE_DURATION ) )
            // InternalRoc.g:1410:2: ( RULE_DURATION )
            {
            // InternalRoc.g:1410:2: ( RULE_DURATION )
            // InternalRoc.g:1411:3: RULE_DURATION
            {
             before(grammarAccess.getMotionAccess().getDurationDURATIONTerminalRuleCall_0_2_0()); 
            match(input,RULE_DURATION,FOLLOW_2); 
             after(grammarAccess.getMotionAccess().getDurationDURATIONTerminalRuleCall_0_2_0()); 

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
    // $ANTLR end "rule__Motion__DurationAssignment_0_2"


    // $ANTLR start "rule__Motion__DurationUnitAssignment_0_3"
    // InternalRoc.g:1420:1: rule__Motion__DurationUnitAssignment_0_3 : ( ruleDurationUnit ) ;
    public final void rule__Motion__DurationUnitAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1424:1: ( ( ruleDurationUnit ) )
            // InternalRoc.g:1425:2: ( ruleDurationUnit )
            {
            // InternalRoc.g:1425:2: ( ruleDurationUnit )
            // InternalRoc.g:1426:3: ruleDurationUnit
            {
             before(grammarAccess.getMotionAccess().getDurationUnitDurationUnitEnumRuleCall_0_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDurationUnit();

            state._fsp--;

             after(grammarAccess.getMotionAccess().getDurationUnitDurationUnitEnumRuleCall_0_3_0()); 

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
    // $ANTLR end "rule__Motion__DurationUnitAssignment_0_3"


    // $ANTLR start "rule__Motion__ActionAssignment_1_0"
    // InternalRoc.g:1435:1: rule__Motion__ActionAssignment_1_0 : ( ruleAction ) ;
    public final void rule__Motion__ActionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1439:1: ( ( ruleAction ) )
            // InternalRoc.g:1440:2: ( ruleAction )
            {
            // InternalRoc.g:1440:2: ( ruleAction )
            // InternalRoc.g:1441:3: ruleAction
            {
             before(grammarAccess.getMotionAccess().getActionActionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMotionAccess().getActionActionParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Motion__ActionAssignment_1_0"


    // $ANTLR start "rule__Motion__SpeedAssignment_1_2"
    // InternalRoc.g:1450:1: rule__Motion__SpeedAssignment_1_2 : ( ruleSpeed ) ;
    public final void rule__Motion__SpeedAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1454:1: ( ( ruleSpeed ) )
            // InternalRoc.g:1455:2: ( ruleSpeed )
            {
            // InternalRoc.g:1455:2: ( ruleSpeed )
            // InternalRoc.g:1456:3: ruleSpeed
            {
             before(grammarAccess.getMotionAccess().getSpeedSpeedParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSpeed();

            state._fsp--;

             after(grammarAccess.getMotionAccess().getSpeedSpeedParserRuleCall_1_2_0()); 

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
    // $ANTLR end "rule__Motion__SpeedAssignment_1_2"


    // $ANTLR start "rule__Action__ActionHolderAssignment_0"
    // InternalRoc.g:1465:1: rule__Action__ActionHolderAssignment_0 : ( ruleCompleteAction ) ;
    public final void rule__Action__ActionHolderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1469:1: ( ( ruleCompleteAction ) )
            // InternalRoc.g:1470:2: ( ruleCompleteAction )
            {
            // InternalRoc.g:1470:2: ( ruleCompleteAction )
            // InternalRoc.g:1471:3: ruleCompleteAction
            {
             before(grammarAccess.getActionAccess().getActionHolderCompleteActionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleCompleteAction();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionHolderCompleteActionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__Action__ActionHolderAssignment_0"


    // $ANTLR start "rule__Action__IntensityAssignment_1_0"
    // InternalRoc.g:1480:1: rule__Action__IntensityAssignment_1_0 : ( ruleIntensity ) ;
    public final void rule__Action__IntensityAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1484:1: ( ( ruleIntensity ) )
            // InternalRoc.g:1485:2: ( ruleIntensity )
            {
            // InternalRoc.g:1485:2: ( ruleIntensity )
            // InternalRoc.g:1486:3: ruleIntensity
            {
             before(grammarAccess.getActionAccess().getIntensityIntensityEnumRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntensity();

            state._fsp--;

             after(grammarAccess.getActionAccess().getIntensityIntensityEnumRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__Action__IntensityAssignment_1_0"


    // $ANTLR start "rule__Action__ActionHolderAssignment_1_1"
    // InternalRoc.g:1495:1: rule__Action__ActionHolderAssignment_1_1 : ( ruleSingleAction ) ;
    public final void rule__Action__ActionHolderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1499:1: ( ( ruleSingleAction ) )
            // InternalRoc.g:1500:2: ( ruleSingleAction )
            {
            // InternalRoc.g:1500:2: ( ruleSingleAction )
            // InternalRoc.g:1501:3: ruleSingleAction
            {
             before(grammarAccess.getActionAccess().getActionHolderSingleActionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSingleAction();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionHolderSingleActionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Action__ActionHolderAssignment_1_1"


    // $ANTLR start "rule__Action__IntensityAssignment_2_0"
    // InternalRoc.g:1510:1: rule__Action__IntensityAssignment_2_0 : ( ruleIntensity ) ;
    public final void rule__Action__IntensityAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1514:1: ( ( ruleIntensity ) )
            // InternalRoc.g:1515:2: ( ruleIntensity )
            {
            // InternalRoc.g:1515:2: ( ruleIntensity )
            // InternalRoc.g:1516:3: ruleIntensity
            {
             before(grammarAccess.getActionAccess().getIntensityIntensityEnumRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleIntensity();

            state._fsp--;

             after(grammarAccess.getActionAccess().getIntensityIntensityEnumRuleCall_2_0_0()); 

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
    // $ANTLR end "rule__Action__IntensityAssignment_2_0"


    // $ANTLR start "rule__Action__ActionHolderAssignment_2_1"
    // InternalRoc.g:1525:1: rule__Action__ActionHolderAssignment_2_1 : ( ruleDirectedAction ) ;
    public final void rule__Action__ActionHolderAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1529:1: ( ( ruleDirectedAction ) )
            // InternalRoc.g:1530:2: ( ruleDirectedAction )
            {
            // InternalRoc.g:1530:2: ( ruleDirectedAction )
            // InternalRoc.g:1531:3: ruleDirectedAction
            {
             before(grammarAccess.getActionAccess().getActionHolderDirectedActionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirectedAction();

            state._fsp--;

             after(grammarAccess.getActionAccess().getActionHolderDirectedActionParserRuleCall_2_1_0()); 

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
    // $ANTLR end "rule__Action__ActionHolderAssignment_2_1"


    // $ANTLR start "rule__CompleteAction__ActionNameAssignment_0"
    // InternalRoc.g:1540:1: rule__CompleteAction__ActionNameAssignment_0 : ( ( 'neutral' ) ) ;
    public final void rule__CompleteAction__ActionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1544:1: ( ( ( 'neutral' ) ) )
            // InternalRoc.g:1545:2: ( ( 'neutral' ) )
            {
            // InternalRoc.g:1545:2: ( ( 'neutral' ) )
            // InternalRoc.g:1546:3: ( 'neutral' )
            {
             before(grammarAccess.getCompleteActionAccess().getActionNameNeutralKeyword_0_0()); 
            // InternalRoc.g:1547:3: ( 'neutral' )
            // InternalRoc.g:1548:4: 'neutral'
            {
             before(grammarAccess.getCompleteActionAccess().getActionNameNeutralKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getCompleteActionAccess().getActionNameNeutralKeyword_0_0()); 

            }

             after(grammarAccess.getCompleteActionAccess().getActionNameNeutralKeyword_0_0()); 

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
    // $ANTLR end "rule__CompleteAction__ActionNameAssignment_0"


    // $ANTLR start "rule__SingleAction__ActionNameAssignment_0"
    // InternalRoc.g:1559:1: rule__SingleAction__ActionNameAssignment_0 : ( ( 'drop jaw' ) ) ;
    public final void rule__SingleAction__ActionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1563:1: ( ( ( 'drop jaw' ) ) )
            // InternalRoc.g:1564:2: ( ( 'drop jaw' ) )
            {
            // InternalRoc.g:1564:2: ( ( 'drop jaw' ) )
            // InternalRoc.g:1565:3: ( 'drop jaw' )
            {
             before(grammarAccess.getSingleActionAccess().getActionNameDropJawKeyword_0_0()); 
            // InternalRoc.g:1566:3: ( 'drop jaw' )
            // InternalRoc.g:1567:4: 'drop jaw'
            {
             before(grammarAccess.getSingleActionAccess().getActionNameDropJawKeyword_0_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSingleActionAccess().getActionNameDropJawKeyword_0_0()); 

            }

             after(grammarAccess.getSingleActionAccess().getActionNameDropJawKeyword_0_0()); 

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
    // $ANTLR end "rule__SingleAction__ActionNameAssignment_0"


    // $ANTLR start "rule__SingleAction__ActionNameAssignment_1"
    // InternalRoc.g:1578:1: rule__SingleAction__ActionNameAssignment_1 : ( ( 'nod head' ) ) ;
    public final void rule__SingleAction__ActionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1582:1: ( ( ( 'nod head' ) ) )
            // InternalRoc.g:1583:2: ( ( 'nod head' ) )
            {
            // InternalRoc.g:1583:2: ( ( 'nod head' ) )
            // InternalRoc.g:1584:3: ( 'nod head' )
            {
             before(grammarAccess.getSingleActionAccess().getActionNameNodHeadKeyword_1_0()); 
            // InternalRoc.g:1585:3: ( 'nod head' )
            // InternalRoc.g:1586:4: 'nod head'
            {
             before(grammarAccess.getSingleActionAccess().getActionNameNodHeadKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSingleActionAccess().getActionNameNodHeadKeyword_1_0()); 

            }

             after(grammarAccess.getSingleActionAccess().getActionNameNodHeadKeyword_1_0()); 

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
    // $ANTLR end "rule__SingleAction__ActionNameAssignment_1"


    // $ANTLR start "rule__DirectedAction__ActionNameAssignment_0_0"
    // InternalRoc.g:1597:1: rule__DirectedAction__ActionNameAssignment_0_0 : ( ruleLeftRightDirectedAction ) ;
    public final void rule__DirectedAction__ActionNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1601:1: ( ( ruleLeftRightDirectedAction ) )
            // InternalRoc.g:1602:2: ( ruleLeftRightDirectedAction )
            {
            // InternalRoc.g:1602:2: ( ruleLeftRightDirectedAction )
            // InternalRoc.g:1603:3: ruleLeftRightDirectedAction
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameLeftRightDirectedActionParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleLeftRightDirectedAction();

            state._fsp--;

             after(grammarAccess.getDirectedActionAccess().getActionNameLeftRightDirectedActionParserRuleCall_0_0_0()); 

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
    // $ANTLR end "rule__DirectedAction__ActionNameAssignment_0_0"


    // $ANTLR start "rule__DirectedAction__DirectionAssignment_0_1"
    // InternalRoc.g:1612:1: rule__DirectedAction__DirectionAssignment_0_1 : ( ruleLeftRightDirection ) ;
    public final void rule__DirectedAction__DirectionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1616:1: ( ( ruleLeftRightDirection ) )
            // InternalRoc.g:1617:2: ( ruleLeftRightDirection )
            {
            // InternalRoc.g:1617:2: ( ruleLeftRightDirection )
            // InternalRoc.g:1618:3: ruleLeftRightDirection
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionLeftRightDirectionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLeftRightDirection();

            state._fsp--;

             after(grammarAccess.getDirectedActionAccess().getDirectionLeftRightDirectionParserRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__DirectedAction__DirectionAssignment_0_1"


    // $ANTLR start "rule__DirectedAction__ActionNameAssignment_1_0"
    // InternalRoc.g:1627:1: rule__DirectedAction__ActionNameAssignment_1_0 : ( ruleFullDirectedAction ) ;
    public final void rule__DirectedAction__ActionNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1631:1: ( ( ruleFullDirectedAction ) )
            // InternalRoc.g:1632:2: ( ruleFullDirectedAction )
            {
            // InternalRoc.g:1632:2: ( ruleFullDirectedAction )
            // InternalRoc.g:1633:3: ruleFullDirectedAction
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameFullDirectedActionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFullDirectedAction();

            state._fsp--;

             after(grammarAccess.getDirectedActionAccess().getActionNameFullDirectedActionParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__DirectedAction__ActionNameAssignment_1_0"


    // $ANTLR start "rule__DirectedAction__DirectionAssignment_1_1"
    // InternalRoc.g:1642:1: rule__DirectedAction__DirectionAssignment_1_1 : ( ruleDirection ) ;
    public final void rule__DirectedAction__DirectionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1646:1: ( ( ruleDirection ) )
            // InternalRoc.g:1647:2: ( ruleDirection )
            {
            // InternalRoc.g:1647:2: ( ruleDirection )
            // InternalRoc.g:1648:3: ruleDirection
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionDirectionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectedActionAccess().getDirectionDirectionParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__DirectedAction__DirectionAssignment_1_1"


    // $ANTLR start "rule__LeftRightDirectedAction__TiltHeadAssignment_0"
    // InternalRoc.g:1657:1: rule__LeftRightDirectedAction__TiltHeadAssignment_0 : ( ( 'tilt' ) ) ;
    public final void rule__LeftRightDirectedAction__TiltHeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1661:1: ( ( ( 'tilt' ) ) )
            // InternalRoc.g:1662:2: ( ( 'tilt' ) )
            {
            // InternalRoc.g:1662:2: ( ( 'tilt' ) )
            // InternalRoc.g:1663:3: ( 'tilt' )
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltKeyword_0_0()); 
            // InternalRoc.g:1664:3: ( 'tilt' )
            // InternalRoc.g:1665:4: 'tilt'
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltKeyword_0_0()); 

            }

             after(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltKeyword_0_0()); 

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
    // $ANTLR end "rule__LeftRightDirectedAction__TiltHeadAssignment_0"


    // $ANTLR start "rule__LeftRightDirection__LeftAssignment_0"
    // InternalRoc.g:1676:1: rule__LeftRightDirection__LeftAssignment_0 : ( ( 'left' ) ) ;
    public final void rule__LeftRightDirection__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1680:1: ( ( ( 'left' ) ) )
            // InternalRoc.g:1681:2: ( ( 'left' ) )
            {
            // InternalRoc.g:1681:2: ( ( 'left' ) )
            // InternalRoc.g:1682:3: ( 'left' )
            {
             before(grammarAccess.getLeftRightDirectionAccess().getLeftLeftKeyword_0_0()); 
            // InternalRoc.g:1683:3: ( 'left' )
            // InternalRoc.g:1684:4: 'left'
            {
             before(grammarAccess.getLeftRightDirectionAccess().getLeftLeftKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getLeftRightDirectionAccess().getLeftLeftKeyword_0_0()); 

            }

             after(grammarAccess.getLeftRightDirectionAccess().getLeftLeftKeyword_0_0()); 

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
    // $ANTLR end "rule__LeftRightDirection__LeftAssignment_0"


    // $ANTLR start "rule__LeftRightDirection__RightAssignment_1"
    // InternalRoc.g:1695:1: rule__LeftRightDirection__RightAssignment_1 : ( ( 'right' ) ) ;
    public final void rule__LeftRightDirection__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1699:1: ( ( ( 'right' ) ) )
            // InternalRoc.g:1700:2: ( ( 'right' ) )
            {
            // InternalRoc.g:1700:2: ( ( 'right' ) )
            // InternalRoc.g:1701:3: ( 'right' )
            {
             before(grammarAccess.getLeftRightDirectionAccess().getRightRightKeyword_1_0()); 
            // InternalRoc.g:1702:3: ( 'right' )
            // InternalRoc.g:1703:4: 'right'
            {
             before(grammarAccess.getLeftRightDirectionAccess().getRightRightKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getLeftRightDirectionAccess().getRightRightKeyword_1_0()); 

            }

             after(grammarAccess.getLeftRightDirectionAccess().getRightRightKeyword_1_0()); 

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
    // $ANTLR end "rule__LeftRightDirection__RightAssignment_1"


    // $ANTLR start "rule__FullDirectedAction__TurnHeadAssignment_0"
    // InternalRoc.g:1714:1: rule__FullDirectedAction__TurnHeadAssignment_0 : ( ( 'turn head' ) ) ;
    public final void rule__FullDirectedAction__TurnHeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1718:1: ( ( ( 'turn head' ) ) )
            // InternalRoc.g:1719:2: ( ( 'turn head' ) )
            {
            // InternalRoc.g:1719:2: ( ( 'turn head' ) )
            // InternalRoc.g:1720:3: ( 'turn head' )
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnHeadKeyword_0_0()); 
            // InternalRoc.g:1721:3: ( 'turn head' )
            // InternalRoc.g:1722:4: 'turn head'
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnHeadKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnHeadKeyword_0_0()); 

            }

             after(grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnHeadKeyword_0_0()); 

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
    // $ANTLR end "rule__FullDirectedAction__TurnHeadAssignment_0"


    // $ANTLR start "rule__FullDirectedAction__TurnEyesAssignment_1"
    // InternalRoc.g:1733:1: rule__FullDirectedAction__TurnEyesAssignment_1 : ( ( 'turn eyes' ) ) ;
    public final void rule__FullDirectedAction__TurnEyesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1737:1: ( ( ( 'turn eyes' ) ) )
            // InternalRoc.g:1738:2: ( ( 'turn eyes' ) )
            {
            // InternalRoc.g:1738:2: ( ( 'turn eyes' ) )
            // InternalRoc.g:1739:3: ( 'turn eyes' )
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnEyesKeyword_1_0()); 
            // InternalRoc.g:1740:3: ( 'turn eyes' )
            // InternalRoc.g:1741:4: 'turn eyes'
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnEyesKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnEyesKeyword_1_0()); 

            }

             after(grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnEyesKeyword_1_0()); 

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
    // $ANTLR end "rule__FullDirectedAction__TurnEyesAssignment_1"


    // $ANTLR start "rule__Direction__UPAssignment_0"
    // InternalRoc.g:1752:1: rule__Direction__UPAssignment_0 : ( ( 'up' ) ) ;
    public final void rule__Direction__UPAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1756:1: ( ( ( 'up' ) ) )
            // InternalRoc.g:1757:2: ( ( 'up' ) )
            {
            // InternalRoc.g:1757:2: ( ( 'up' ) )
            // InternalRoc.g:1758:3: ( 'up' )
            {
             before(grammarAccess.getDirectionAccess().getUPUpKeyword_0_0()); 
            // InternalRoc.g:1759:3: ( 'up' )
            // InternalRoc.g:1760:4: 'up'
            {
             before(grammarAccess.getDirectionAccess().getUPUpKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getUPUpKeyword_0_0()); 

            }

             after(grammarAccess.getDirectionAccess().getUPUpKeyword_0_0()); 

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
    // $ANTLR end "rule__Direction__UPAssignment_0"


    // $ANTLR start "rule__Direction__DOWNAssignment_1"
    // InternalRoc.g:1771:1: rule__Direction__DOWNAssignment_1 : ( ( 'down' ) ) ;
    public final void rule__Direction__DOWNAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1775:1: ( ( ( 'down' ) ) )
            // InternalRoc.g:1776:2: ( ( 'down' ) )
            {
            // InternalRoc.g:1776:2: ( ( 'down' ) )
            // InternalRoc.g:1777:3: ( 'down' )
            {
             before(grammarAccess.getDirectionAccess().getDOWNDownKeyword_1_0()); 
            // InternalRoc.g:1778:3: ( 'down' )
            // InternalRoc.g:1779:4: 'down'
            {
             before(grammarAccess.getDirectionAccess().getDOWNDownKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getDOWNDownKeyword_1_0()); 

            }

             after(grammarAccess.getDirectionAccess().getDOWNDownKeyword_1_0()); 

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
    // $ANTLR end "rule__Direction__DOWNAssignment_1"


    // $ANTLR start "rule__Direction__LEFTAssignment_2"
    // InternalRoc.g:1790:1: rule__Direction__LEFTAssignment_2 : ( ( 'left' ) ) ;
    public final void rule__Direction__LEFTAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1794:1: ( ( ( 'left' ) ) )
            // InternalRoc.g:1795:2: ( ( 'left' ) )
            {
            // InternalRoc.g:1795:2: ( ( 'left' ) )
            // InternalRoc.g:1796:3: ( 'left' )
            {
             before(grammarAccess.getDirectionAccess().getLEFTLeftKeyword_2_0()); 
            // InternalRoc.g:1797:3: ( 'left' )
            // InternalRoc.g:1798:4: 'left'
            {
             before(grammarAccess.getDirectionAccess().getLEFTLeftKeyword_2_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getLEFTLeftKeyword_2_0()); 

            }

             after(grammarAccess.getDirectionAccess().getLEFTLeftKeyword_2_0()); 

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
    // $ANTLR end "rule__Direction__LEFTAssignment_2"


    // $ANTLR start "rule__Direction__RIGHTAssignment_3"
    // InternalRoc.g:1809:1: rule__Direction__RIGHTAssignment_3 : ( ( 'right' ) ) ;
    public final void rule__Direction__RIGHTAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1813:1: ( ( ( 'right' ) ) )
            // InternalRoc.g:1814:2: ( ( 'right' ) )
            {
            // InternalRoc.g:1814:2: ( ( 'right' ) )
            // InternalRoc.g:1815:3: ( 'right' )
            {
             before(grammarAccess.getDirectionAccess().getRIGHTRightKeyword_3_0()); 
            // InternalRoc.g:1816:3: ( 'right' )
            // InternalRoc.g:1817:4: 'right'
            {
             before(grammarAccess.getDirectionAccess().getRIGHTRightKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDirectionAccess().getRIGHTRightKeyword_3_0()); 

            }

             after(grammarAccess.getDirectionAccess().getRIGHTRightKeyword_3_0()); 

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
    // $ANTLR end "rule__Direction__RIGHTAssignment_3"


    // $ANTLR start "rule__Speed__SLOWESTAssignment_0"
    // InternalRoc.g:1828:1: rule__Speed__SLOWESTAssignment_0 : ( ( 'slowest' ) ) ;
    public final void rule__Speed__SLOWESTAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1832:1: ( ( ( 'slowest' ) ) )
            // InternalRoc.g:1833:2: ( ( 'slowest' ) )
            {
            // InternalRoc.g:1833:2: ( ( 'slowest' ) )
            // InternalRoc.g:1834:3: ( 'slowest' )
            {
             before(grammarAccess.getSpeedAccess().getSLOWESTSlowestKeyword_0_0()); 
            // InternalRoc.g:1835:3: ( 'slowest' )
            // InternalRoc.g:1836:4: 'slowest'
            {
             before(grammarAccess.getSpeedAccess().getSLOWESTSlowestKeyword_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getSpeedAccess().getSLOWESTSlowestKeyword_0_0()); 

            }

             after(grammarAccess.getSpeedAccess().getSLOWESTSlowestKeyword_0_0()); 

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
    // $ANTLR end "rule__Speed__SLOWESTAssignment_0"


    // $ANTLR start "rule__Speed__SLOWAssignment_1"
    // InternalRoc.g:1847:1: rule__Speed__SLOWAssignment_1 : ( ( 'slow' ) ) ;
    public final void rule__Speed__SLOWAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1851:1: ( ( ( 'slow' ) ) )
            // InternalRoc.g:1852:2: ( ( 'slow' ) )
            {
            // InternalRoc.g:1852:2: ( ( 'slow' ) )
            // InternalRoc.g:1853:3: ( 'slow' )
            {
             before(grammarAccess.getSpeedAccess().getSLOWSlowKeyword_1_0()); 
            // InternalRoc.g:1854:3: ( 'slow' )
            // InternalRoc.g:1855:4: 'slow'
            {
             before(grammarAccess.getSpeedAccess().getSLOWSlowKeyword_1_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getSpeedAccess().getSLOWSlowKeyword_1_0()); 

            }

             after(grammarAccess.getSpeedAccess().getSLOWSlowKeyword_1_0()); 

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
    // $ANTLR end "rule__Speed__SLOWAssignment_1"


    // $ANTLR start "rule__Speed__NORMALAssignment_2"
    // InternalRoc.g:1866:1: rule__Speed__NORMALAssignment_2 : ( ( 'normal' ) ) ;
    public final void rule__Speed__NORMALAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1870:1: ( ( ( 'normal' ) ) )
            // InternalRoc.g:1871:2: ( ( 'normal' ) )
            {
            // InternalRoc.g:1871:2: ( ( 'normal' ) )
            // InternalRoc.g:1872:3: ( 'normal' )
            {
             before(grammarAccess.getSpeedAccess().getNORMALNormalKeyword_2_0()); 
            // InternalRoc.g:1873:3: ( 'normal' )
            // InternalRoc.g:1874:4: 'normal'
            {
             before(grammarAccess.getSpeedAccess().getNORMALNormalKeyword_2_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getSpeedAccess().getNORMALNormalKeyword_2_0()); 

            }

             after(grammarAccess.getSpeedAccess().getNORMALNormalKeyword_2_0()); 

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
    // $ANTLR end "rule__Speed__NORMALAssignment_2"


    // $ANTLR start "rule__Speed__FASTAssignment_3"
    // InternalRoc.g:1885:1: rule__Speed__FASTAssignment_3 : ( ( 'fast' ) ) ;
    public final void rule__Speed__FASTAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1889:1: ( ( ( 'fast' ) ) )
            // InternalRoc.g:1890:2: ( ( 'fast' ) )
            {
            // InternalRoc.g:1890:2: ( ( 'fast' ) )
            // InternalRoc.g:1891:3: ( 'fast' )
            {
             before(grammarAccess.getSpeedAccess().getFASTFastKeyword_3_0()); 
            // InternalRoc.g:1892:3: ( 'fast' )
            // InternalRoc.g:1893:4: 'fast'
            {
             before(grammarAccess.getSpeedAccess().getFASTFastKeyword_3_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getSpeedAccess().getFASTFastKeyword_3_0()); 

            }

             after(grammarAccess.getSpeedAccess().getFASTFastKeyword_3_0()); 

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
    // $ANTLR end "rule__Speed__FASTAssignment_3"


    // $ANTLR start "rule__Speed__FULLAssignment_4"
    // InternalRoc.g:1904:1: rule__Speed__FULLAssignment_4 : ( ( 'full' ) ) ;
    public final void rule__Speed__FULLAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1908:1: ( ( ( 'full' ) ) )
            // InternalRoc.g:1909:2: ( ( 'full' ) )
            {
            // InternalRoc.g:1909:2: ( ( 'full' ) )
            // InternalRoc.g:1910:3: ( 'full' )
            {
             before(grammarAccess.getSpeedAccess().getFULLFullKeyword_4_0()); 
            // InternalRoc.g:1911:3: ( 'full' )
            // InternalRoc.g:1912:4: 'full'
            {
             before(grammarAccess.getSpeedAccess().getFULLFullKeyword_4_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getSpeedAccess().getFULLFullKeyword_4_0()); 

            }

             after(grammarAccess.getSpeedAccess().getFULLFullKeyword_4_0()); 

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
    // $ANTLR end "rule__Speed__FULLAssignment_4"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\21\1\31\5\34\2\6\1\32\2\37\1\6\2\uffff\1\37\6\6";
    static final String dfa_3s = "\1\42\1\31\5\42\2\7\1\32\2\44\1\7\2\uffff\1\40\6\7";
    static final String dfa_4s = "\15\uffff\1\1\1\2\7\uffff";
    static final String dfa_5s = "\26\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\1\3\1\4\1\5\1\6\5\uffff\1\1\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\14",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\17",
            "\1\22\1\23\2\uffff\1\20\1\21",
            "\1\22\1\23\2\uffff\1\20\1\21",
            "\1\15\1\16",
            "",
            "",
            "\1\24\1\25",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16",
            "\1\15\1\16"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "400:1: rule__Motion__Alternatives : ( ( ( rule__Motion__Group_0__0 ) ) | ( ( rule__Motion__Group_1__0 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000006783E0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x00000006783E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000003E000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000303E0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001980000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000004000000L});

}