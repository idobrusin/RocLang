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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PERIOD", "RULE_AND", "RULE_FOR", "RULE_DURATION", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pronounced'", "'trace of'", "'slightly'", "'severe'", "'maximum'", "'milliseconds'", "'seconds'", "'minutes'", "'face'", "'head'", "'eyes'", "'neutral'", "'drop jaw'", "'nod Head'", "'tilt'", "'left'", "'right'", "'back'", "'forth'", "'turn'", "'up'", "'down'"
    };
    public static final int RULE_DURATION=7;
    public static final int RULE_STRING=10;
    public static final int RULE_AND=5;
    public static final int RULE_SL_COMMENT=12;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
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
    public static final int RULE_ID=9;
    public static final int RULE_WS=13;
    public static final int RULE_PERIOD=4;
    public static final int RULE_ANY_OTHER=14;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=8;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=11;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
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

                if ( ((LA1_0>=15 && LA1_0<=19)||LA1_0==24||(LA1_0>=26 && LA1_0<=29)||LA1_0==34) ) {
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
    // InternalRoc.g:128:1: ruleMotion : ( ( rule__Motion__Group__0 ) ) ;
    public final void ruleMotion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:132:2: ( ( ( rule__Motion__Group__0 ) ) )
            // InternalRoc.g:133:2: ( ( rule__Motion__Group__0 ) )
            {
            // InternalRoc.g:133:2: ( ( rule__Motion__Group__0 ) )
            // InternalRoc.g:134:3: ( rule__Motion__Group__0 )
            {
             before(grammarAccess.getMotionAccess().getGroup()); 
            // InternalRoc.g:135:3: ( rule__Motion__Group__0 )
            // InternalRoc.g:135:4: rule__Motion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Motion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMotionAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRuleBackForthDirectedAction"
    // InternalRoc.g:294:1: entryRuleBackForthDirectedAction : ruleBackForthDirectedAction EOF ;
    public final void entryRuleBackForthDirectedAction() throws RecognitionException {
        try {
            // InternalRoc.g:295:1: ( ruleBackForthDirectedAction EOF )
            // InternalRoc.g:296:1: ruleBackForthDirectedAction EOF
            {
             before(grammarAccess.getBackForthDirectedActionRule()); 
            pushFollow(FOLLOW_1);
            ruleBackForthDirectedAction();

            state._fsp--;

             after(grammarAccess.getBackForthDirectedActionRule()); 
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
    // $ANTLR end "entryRuleBackForthDirectedAction"


    // $ANTLR start "ruleBackForthDirectedAction"
    // InternalRoc.g:303:1: ruleBackForthDirectedAction : ( ( rule__BackForthDirectedAction__HeadAssignment ) ) ;
    public final void ruleBackForthDirectedAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:307:2: ( ( ( rule__BackForthDirectedAction__HeadAssignment ) ) )
            // InternalRoc.g:308:2: ( ( rule__BackForthDirectedAction__HeadAssignment ) )
            {
            // InternalRoc.g:308:2: ( ( rule__BackForthDirectedAction__HeadAssignment ) )
            // InternalRoc.g:309:3: ( rule__BackForthDirectedAction__HeadAssignment )
            {
             before(grammarAccess.getBackForthDirectedActionAccess().getHeadAssignment()); 
            // InternalRoc.g:310:3: ( rule__BackForthDirectedAction__HeadAssignment )
            // InternalRoc.g:310:4: rule__BackForthDirectedAction__HeadAssignment
            {
            pushFollow(FOLLOW_2);
            rule__BackForthDirectedAction__HeadAssignment();

            state._fsp--;


            }

             after(grammarAccess.getBackForthDirectedActionAccess().getHeadAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackForthDirectedAction"


    // $ANTLR start "entryRuleBackForthDirection"
    // InternalRoc.g:319:1: entryRuleBackForthDirection : ruleBackForthDirection EOF ;
    public final void entryRuleBackForthDirection() throws RecognitionException {
        try {
            // InternalRoc.g:320:1: ( ruleBackForthDirection EOF )
            // InternalRoc.g:321:1: ruleBackForthDirection EOF
            {
             before(grammarAccess.getBackForthDirectionRule()); 
            pushFollow(FOLLOW_1);
            ruleBackForthDirection();

            state._fsp--;

             after(grammarAccess.getBackForthDirectionRule()); 
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
    // $ANTLR end "entryRuleBackForthDirection"


    // $ANTLR start "ruleBackForthDirection"
    // InternalRoc.g:328:1: ruleBackForthDirection : ( ( rule__BackForthDirection__Alternatives ) ) ;
    public final void ruleBackForthDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:332:2: ( ( ( rule__BackForthDirection__Alternatives ) ) )
            // InternalRoc.g:333:2: ( ( rule__BackForthDirection__Alternatives ) )
            {
            // InternalRoc.g:333:2: ( ( rule__BackForthDirection__Alternatives ) )
            // InternalRoc.g:334:3: ( rule__BackForthDirection__Alternatives )
            {
             before(grammarAccess.getBackForthDirectionAccess().getAlternatives()); 
            // InternalRoc.g:335:3: ( rule__BackForthDirection__Alternatives )
            // InternalRoc.g:335:4: rule__BackForthDirection__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__BackForthDirection__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBackForthDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBackForthDirection"


    // $ANTLR start "entryRuleFullDirectedAction"
    // InternalRoc.g:344:1: entryRuleFullDirectedAction : ruleFullDirectedAction EOF ;
    public final void entryRuleFullDirectedAction() throws RecognitionException {
        try {
            // InternalRoc.g:345:1: ( ruleFullDirectedAction EOF )
            // InternalRoc.g:346:1: ruleFullDirectedAction EOF
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
    // InternalRoc.g:353:1: ruleFullDirectedAction : ( ( rule__FullDirectedAction__Alternatives ) ) ;
    public final void ruleFullDirectedAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:357:2: ( ( ( rule__FullDirectedAction__Alternatives ) ) )
            // InternalRoc.g:358:2: ( ( rule__FullDirectedAction__Alternatives ) )
            {
            // InternalRoc.g:358:2: ( ( rule__FullDirectedAction__Alternatives ) )
            // InternalRoc.g:359:3: ( rule__FullDirectedAction__Alternatives )
            {
             before(grammarAccess.getFullDirectedActionAccess().getAlternatives()); 
            // InternalRoc.g:360:3: ( rule__FullDirectedAction__Alternatives )
            // InternalRoc.g:360:4: rule__FullDirectedAction__Alternatives
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
    // InternalRoc.g:369:1: entryRuleDirection : ruleDirection EOF ;
    public final void entryRuleDirection() throws RecognitionException {
        try {
            // InternalRoc.g:370:1: ( ruleDirection EOF )
            // InternalRoc.g:371:1: ruleDirection EOF
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
    // InternalRoc.g:378:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:382:2: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalRoc.g:383:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalRoc.g:383:2: ( ( rule__Direction__Alternatives ) )
            // InternalRoc.g:384:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalRoc.g:385:3: ( rule__Direction__Alternatives )
            // InternalRoc.g:385:4: rule__Direction__Alternatives
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


    // $ANTLR start "ruleIntensity"
    // InternalRoc.g:394:1: ruleIntensity : ( ( rule__Intensity__Alternatives ) ) ;
    public final void ruleIntensity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:398:1: ( ( ( rule__Intensity__Alternatives ) ) )
            // InternalRoc.g:399:2: ( ( rule__Intensity__Alternatives ) )
            {
            // InternalRoc.g:399:2: ( ( rule__Intensity__Alternatives ) )
            // InternalRoc.g:400:3: ( rule__Intensity__Alternatives )
            {
             before(grammarAccess.getIntensityAccess().getAlternatives()); 
            // InternalRoc.g:401:3: ( rule__Intensity__Alternatives )
            // InternalRoc.g:401:4: rule__Intensity__Alternatives
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
    // InternalRoc.g:410:1: ruleDurationUnit : ( ( rule__DurationUnit__Alternatives ) ) ;
    public final void ruleDurationUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:414:1: ( ( ( rule__DurationUnit__Alternatives ) ) )
            // InternalRoc.g:415:2: ( ( rule__DurationUnit__Alternatives ) )
            {
            // InternalRoc.g:415:2: ( ( rule__DurationUnit__Alternatives ) )
            // InternalRoc.g:416:3: ( rule__DurationUnit__Alternatives )
            {
             before(grammarAccess.getDurationUnitAccess().getAlternatives()); 
            // InternalRoc.g:417:3: ( rule__DurationUnit__Alternatives )
            // InternalRoc.g:417:4: rule__DurationUnit__Alternatives
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


    // $ANTLR start "rule__Action__Alternatives"
    // InternalRoc.g:425:1: rule__Action__Alternatives : ( ( ( rule__Action__ActionHolderAssignment_0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:429:1: ( ( ( rule__Action__ActionHolderAssignment_0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt2=1;
                }
                break;
            case 15:
                {
                int LA2_2 = input.LA(2);

                if ( ((LA2_2>=27 && LA2_2<=28)) ) {
                    alt2=2;
                }
                else if ( (LA2_2==24||LA2_2==29||LA2_2==34) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA2_3 = input.LA(2);

                if ( ((LA2_3>=27 && LA2_3<=28)) ) {
                    alt2=2;
                }
                else if ( (LA2_3==24||LA2_3==29||LA2_3==34) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA2_4 = input.LA(2);

                if ( ((LA2_4>=27 && LA2_4<=28)) ) {
                    alt2=2;
                }
                else if ( (LA2_4==24||LA2_4==29||LA2_4==34) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA2_5 = input.LA(2);

                if ( ((LA2_5>=27 && LA2_5<=28)) ) {
                    alt2=2;
                }
                else if ( (LA2_5==24||LA2_5==29||LA2_5==34) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 5, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA2_6 = input.LA(2);

                if ( ((LA2_6>=27 && LA2_6<=28)) ) {
                    alt2=2;
                }
                else if ( (LA2_6==24||LA2_6==29||LA2_6==34) ) {
                    alt2=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 6, input);

                    throw nvae;
                }
                }
                break;
            case 27:
            case 28:
                {
                alt2=2;
                }
                break;
            case 24:
            case 29:
            case 34:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalRoc.g:430:2: ( ( rule__Action__ActionHolderAssignment_0 ) )
                    {
                    // InternalRoc.g:430:2: ( ( rule__Action__ActionHolderAssignment_0 ) )
                    // InternalRoc.g:431:3: ( rule__Action__ActionHolderAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getActionHolderAssignment_0()); 
                    // InternalRoc.g:432:3: ( rule__Action__ActionHolderAssignment_0 )
                    // InternalRoc.g:432:4: rule__Action__ActionHolderAssignment_0
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
                    // InternalRoc.g:436:2: ( ( rule__Action__Group_1__0 ) )
                    {
                    // InternalRoc.g:436:2: ( ( rule__Action__Group_1__0 ) )
                    // InternalRoc.g:437:3: ( rule__Action__Group_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_1()); 
                    // InternalRoc.g:438:3: ( rule__Action__Group_1__0 )
                    // InternalRoc.g:438:4: rule__Action__Group_1__0
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
                    // InternalRoc.g:442:2: ( ( rule__Action__Group_2__0 ) )
                    {
                    // InternalRoc.g:442:2: ( ( rule__Action__Group_2__0 ) )
                    // InternalRoc.g:443:3: ( rule__Action__Group_2__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_2()); 
                    // InternalRoc.g:444:3: ( rule__Action__Group_2__0 )
                    // InternalRoc.g:444:4: rule__Action__Group_2__0
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
    // InternalRoc.g:452:1: rule__SingleAction__Alternatives : ( ( ( rule__SingleAction__ActionNameAssignment_0 ) ) | ( ( rule__SingleAction__ActionNameAssignment_1 ) ) );
    public final void rule__SingleAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:456:1: ( ( ( rule__SingleAction__ActionNameAssignment_0 ) ) | ( ( rule__SingleAction__ActionNameAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==27) ) {
                alt3=1;
            }
            else if ( (LA3_0==28) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalRoc.g:457:2: ( ( rule__SingleAction__ActionNameAssignment_0 ) )
                    {
                    // InternalRoc.g:457:2: ( ( rule__SingleAction__ActionNameAssignment_0 ) )
                    // InternalRoc.g:458:3: ( rule__SingleAction__ActionNameAssignment_0 )
                    {
                     before(grammarAccess.getSingleActionAccess().getActionNameAssignment_0()); 
                    // InternalRoc.g:459:3: ( rule__SingleAction__ActionNameAssignment_0 )
                    // InternalRoc.g:459:4: rule__SingleAction__ActionNameAssignment_0
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
                    // InternalRoc.g:463:2: ( ( rule__SingleAction__ActionNameAssignment_1 ) )
                    {
                    // InternalRoc.g:463:2: ( ( rule__SingleAction__ActionNameAssignment_1 ) )
                    // InternalRoc.g:464:3: ( rule__SingleAction__ActionNameAssignment_1 )
                    {
                     before(grammarAccess.getSingleActionAccess().getActionNameAssignment_1()); 
                    // InternalRoc.g:465:3: ( rule__SingleAction__ActionNameAssignment_1 )
                    // InternalRoc.g:465:4: rule__SingleAction__ActionNameAssignment_1
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
    // InternalRoc.g:473:1: rule__DirectedAction__Alternatives : ( ( ( rule__DirectedAction__Group_0__0 ) ) | ( ( rule__DirectedAction__Group_1__0 ) ) | ( ( rule__DirectedAction__Group_2__0 ) ) );
    public final void rule__DirectedAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:477:1: ( ( ( rule__DirectedAction__Group_0__0 ) ) | ( ( rule__DirectedAction__Group_1__0 ) ) | ( ( rule__DirectedAction__Group_2__0 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt4=1;
                }
                break;
            case 24:
                {
                alt4=2;
                }
                break;
            case 34:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalRoc.g:478:2: ( ( rule__DirectedAction__Group_0__0 ) )
                    {
                    // InternalRoc.g:478:2: ( ( rule__DirectedAction__Group_0__0 ) )
                    // InternalRoc.g:479:3: ( rule__DirectedAction__Group_0__0 )
                    {
                     before(grammarAccess.getDirectedActionAccess().getGroup_0()); 
                    // InternalRoc.g:480:3: ( rule__DirectedAction__Group_0__0 )
                    // InternalRoc.g:480:4: rule__DirectedAction__Group_0__0
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
                    // InternalRoc.g:484:2: ( ( rule__DirectedAction__Group_1__0 ) )
                    {
                    // InternalRoc.g:484:2: ( ( rule__DirectedAction__Group_1__0 ) )
                    // InternalRoc.g:485:3: ( rule__DirectedAction__Group_1__0 )
                    {
                     before(grammarAccess.getDirectedActionAccess().getGroup_1()); 
                    // InternalRoc.g:486:3: ( rule__DirectedAction__Group_1__0 )
                    // InternalRoc.g:486:4: rule__DirectedAction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectedAction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectedActionAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:490:2: ( ( rule__DirectedAction__Group_2__0 ) )
                    {
                    // InternalRoc.g:490:2: ( ( rule__DirectedAction__Group_2__0 ) )
                    // InternalRoc.g:491:3: ( rule__DirectedAction__Group_2__0 )
                    {
                     before(grammarAccess.getDirectedActionAccess().getGroup_2()); 
                    // InternalRoc.g:492:3: ( rule__DirectedAction__Group_2__0 )
                    // InternalRoc.g:492:4: rule__DirectedAction__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__DirectedAction__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getDirectedActionAccess().getGroup_2()); 

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
    // InternalRoc.g:500:1: rule__LeftRightDirection__Alternatives : ( ( ( rule__LeftRightDirection__LeftAssignment_0 ) ) | ( ( rule__LeftRightDirection__RightAssignment_1 ) ) );
    public final void rule__LeftRightDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:504:1: ( ( ( rule__LeftRightDirection__LeftAssignment_0 ) ) | ( ( rule__LeftRightDirection__RightAssignment_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==30) ) {
                alt5=1;
            }
            else if ( (LA5_0==31) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoc.g:505:2: ( ( rule__LeftRightDirection__LeftAssignment_0 ) )
                    {
                    // InternalRoc.g:505:2: ( ( rule__LeftRightDirection__LeftAssignment_0 ) )
                    // InternalRoc.g:506:3: ( rule__LeftRightDirection__LeftAssignment_0 )
                    {
                     before(grammarAccess.getLeftRightDirectionAccess().getLeftAssignment_0()); 
                    // InternalRoc.g:507:3: ( rule__LeftRightDirection__LeftAssignment_0 )
                    // InternalRoc.g:507:4: rule__LeftRightDirection__LeftAssignment_0
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
                    // InternalRoc.g:511:2: ( ( rule__LeftRightDirection__RightAssignment_1 ) )
                    {
                    // InternalRoc.g:511:2: ( ( rule__LeftRightDirection__RightAssignment_1 ) )
                    // InternalRoc.g:512:3: ( rule__LeftRightDirection__RightAssignment_1 )
                    {
                     before(grammarAccess.getLeftRightDirectionAccess().getRightAssignment_1()); 
                    // InternalRoc.g:513:3: ( rule__LeftRightDirection__RightAssignment_1 )
                    // InternalRoc.g:513:4: rule__LeftRightDirection__RightAssignment_1
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


    // $ANTLR start "rule__BackForthDirection__Alternatives"
    // InternalRoc.g:521:1: rule__BackForthDirection__Alternatives : ( ( ( rule__BackForthDirection__BackAssignment_0 ) ) | ( ( rule__BackForthDirection__ForthAssignment_1 ) ) );
    public final void rule__BackForthDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:525:1: ( ( ( rule__BackForthDirection__BackAssignment_0 ) ) | ( ( rule__BackForthDirection__ForthAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            else if ( (LA6_0==33) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoc.g:526:2: ( ( rule__BackForthDirection__BackAssignment_0 ) )
                    {
                    // InternalRoc.g:526:2: ( ( rule__BackForthDirection__BackAssignment_0 ) )
                    // InternalRoc.g:527:3: ( rule__BackForthDirection__BackAssignment_0 )
                    {
                     before(grammarAccess.getBackForthDirectionAccess().getBackAssignment_0()); 
                    // InternalRoc.g:528:3: ( rule__BackForthDirection__BackAssignment_0 )
                    // InternalRoc.g:528:4: rule__BackForthDirection__BackAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__BackForthDirection__BackAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getBackForthDirectionAccess().getBackAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:532:2: ( ( rule__BackForthDirection__ForthAssignment_1 ) )
                    {
                    // InternalRoc.g:532:2: ( ( rule__BackForthDirection__ForthAssignment_1 ) )
                    // InternalRoc.g:533:3: ( rule__BackForthDirection__ForthAssignment_1 )
                    {
                     before(grammarAccess.getBackForthDirectionAccess().getForthAssignment_1()); 
                    // InternalRoc.g:534:3: ( rule__BackForthDirection__ForthAssignment_1 )
                    // InternalRoc.g:534:4: rule__BackForthDirection__ForthAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__BackForthDirection__ForthAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getBackForthDirectionAccess().getForthAssignment_1()); 

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
    // $ANTLR end "rule__BackForthDirection__Alternatives"


    // $ANTLR start "rule__FullDirectedAction__Alternatives"
    // InternalRoc.g:542:1: rule__FullDirectedAction__Alternatives : ( ( ( rule__FullDirectedAction__Group_0__0 ) ) | ( ( rule__FullDirectedAction__Group_1__0 ) ) );
    public final void rule__FullDirectedAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:546:1: ( ( ( rule__FullDirectedAction__Group_0__0 ) ) | ( ( rule__FullDirectedAction__Group_1__0 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==34) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==25) ) {
                    alt7=2;
                }
                else if ( (LA7_1==24) ) {
                    alt7=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoc.g:547:2: ( ( rule__FullDirectedAction__Group_0__0 ) )
                    {
                    // InternalRoc.g:547:2: ( ( rule__FullDirectedAction__Group_0__0 ) )
                    // InternalRoc.g:548:3: ( rule__FullDirectedAction__Group_0__0 )
                    {
                     before(grammarAccess.getFullDirectedActionAccess().getGroup_0()); 
                    // InternalRoc.g:549:3: ( rule__FullDirectedAction__Group_0__0 )
                    // InternalRoc.g:549:4: rule__FullDirectedAction__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FullDirectedAction__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFullDirectedActionAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:553:2: ( ( rule__FullDirectedAction__Group_1__0 ) )
                    {
                    // InternalRoc.g:553:2: ( ( rule__FullDirectedAction__Group_1__0 ) )
                    // InternalRoc.g:554:3: ( rule__FullDirectedAction__Group_1__0 )
                    {
                     before(grammarAccess.getFullDirectedActionAccess().getGroup_1()); 
                    // InternalRoc.g:555:3: ( rule__FullDirectedAction__Group_1__0 )
                    // InternalRoc.g:555:4: rule__FullDirectedAction__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FullDirectedAction__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFullDirectedActionAccess().getGroup_1()); 

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
    // InternalRoc.g:563:1: rule__Direction__Alternatives : ( ( ( rule__Direction__UPAssignment_0 ) ) | ( ( rule__Direction__DOWNAssignment_1 ) ) | ( ( rule__Direction__LEFTAssignment_2 ) ) | ( ( rule__Direction__RIGHTAssignment_3 ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:567:1: ( ( ( rule__Direction__UPAssignment_0 ) ) | ( ( rule__Direction__DOWNAssignment_1 ) ) | ( ( rule__Direction__LEFTAssignment_2 ) ) | ( ( rule__Direction__RIGHTAssignment_3 ) ) )
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
            case 30:
                {
                alt8=3;
                }
                break;
            case 31:
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
                    // InternalRoc.g:568:2: ( ( rule__Direction__UPAssignment_0 ) )
                    {
                    // InternalRoc.g:568:2: ( ( rule__Direction__UPAssignment_0 ) )
                    // InternalRoc.g:569:3: ( rule__Direction__UPAssignment_0 )
                    {
                     before(grammarAccess.getDirectionAccess().getUPAssignment_0()); 
                    // InternalRoc.g:570:3: ( rule__Direction__UPAssignment_0 )
                    // InternalRoc.g:570:4: rule__Direction__UPAssignment_0
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
                    // InternalRoc.g:574:2: ( ( rule__Direction__DOWNAssignment_1 ) )
                    {
                    // InternalRoc.g:574:2: ( ( rule__Direction__DOWNAssignment_1 ) )
                    // InternalRoc.g:575:3: ( rule__Direction__DOWNAssignment_1 )
                    {
                     before(grammarAccess.getDirectionAccess().getDOWNAssignment_1()); 
                    // InternalRoc.g:576:3: ( rule__Direction__DOWNAssignment_1 )
                    // InternalRoc.g:576:4: rule__Direction__DOWNAssignment_1
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
                    // InternalRoc.g:580:2: ( ( rule__Direction__LEFTAssignment_2 ) )
                    {
                    // InternalRoc.g:580:2: ( ( rule__Direction__LEFTAssignment_2 ) )
                    // InternalRoc.g:581:3: ( rule__Direction__LEFTAssignment_2 )
                    {
                     before(grammarAccess.getDirectionAccess().getLEFTAssignment_2()); 
                    // InternalRoc.g:582:3: ( rule__Direction__LEFTAssignment_2 )
                    // InternalRoc.g:582:4: rule__Direction__LEFTAssignment_2
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
                    // InternalRoc.g:586:2: ( ( rule__Direction__RIGHTAssignment_3 ) )
                    {
                    // InternalRoc.g:586:2: ( ( rule__Direction__RIGHTAssignment_3 ) )
                    // InternalRoc.g:587:3: ( rule__Direction__RIGHTAssignment_3 )
                    {
                     before(grammarAccess.getDirectionAccess().getRIGHTAssignment_3()); 
                    // InternalRoc.g:588:3: ( rule__Direction__RIGHTAssignment_3 )
                    // InternalRoc.g:588:4: rule__Direction__RIGHTAssignment_3
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


    // $ANTLR start "rule__Intensity__Alternatives"
    // InternalRoc.g:596:1: rule__Intensity__Alternatives : ( ( ( 'pronounced' ) ) | ( ( 'trace of' ) ) | ( ( 'slightly' ) ) | ( ( 'severe' ) ) | ( ( 'maximum' ) ) );
    public final void rule__Intensity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:600:1: ( ( ( 'pronounced' ) ) | ( ( 'trace of' ) ) | ( ( 'slightly' ) ) | ( ( 'severe' ) ) | ( ( 'maximum' ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt9=1;
                }
                break;
            case 16:
                {
                alt9=2;
                }
                break;
            case 17:
                {
                alt9=3;
                }
                break;
            case 18:
                {
                alt9=4;
                }
                break;
            case 19:
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
                    // InternalRoc.g:601:2: ( ( 'pronounced' ) )
                    {
                    // InternalRoc.g:601:2: ( ( 'pronounced' ) )
                    // InternalRoc.g:602:3: ( 'pronounced' )
                    {
                     before(grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0()); 
                    // InternalRoc.g:603:3: ( 'pronounced' )
                    // InternalRoc.g:603:4: 'pronounced'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:607:2: ( ( 'trace of' ) )
                    {
                    // InternalRoc.g:607:2: ( ( 'trace of' ) )
                    // InternalRoc.g:608:3: ( 'trace of' )
                    {
                     before(grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1()); 
                    // InternalRoc.g:609:3: ( 'trace of' )
                    // InternalRoc.g:609:4: 'trace of'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:613:2: ( ( 'slightly' ) )
                    {
                    // InternalRoc.g:613:2: ( ( 'slightly' ) )
                    // InternalRoc.g:614:3: ( 'slightly' )
                    {
                     before(grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2()); 
                    // InternalRoc.g:615:3: ( 'slightly' )
                    // InternalRoc.g:615:4: 'slightly'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoc.g:619:2: ( ( 'severe' ) )
                    {
                    // InternalRoc.g:619:2: ( ( 'severe' ) )
                    // InternalRoc.g:620:3: ( 'severe' )
                    {
                     before(grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalRoc.g:621:3: ( 'severe' )
                    // InternalRoc.g:621:4: 'severe'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRoc.g:625:2: ( ( 'maximum' ) )
                    {
                    // InternalRoc.g:625:2: ( ( 'maximum' ) )
                    // InternalRoc.g:626:3: ( 'maximum' )
                    {
                     before(grammarAccess.getIntensityAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalRoc.g:627:3: ( 'maximum' )
                    // InternalRoc.g:627:4: 'maximum'
                    {
                    match(input,19,FOLLOW_2); 

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
    // InternalRoc.g:635:1: rule__DurationUnit__Alternatives : ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) );
    public final void rule__DurationUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:639:1: ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt10=1;
                }
                break;
            case 21:
                {
                alt10=2;
                }
                break;
            case 22:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalRoc.g:640:2: ( ( 'milliseconds' ) )
                    {
                    // InternalRoc.g:640:2: ( ( 'milliseconds' ) )
                    // InternalRoc.g:641:3: ( 'milliseconds' )
                    {
                     before(grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0()); 
                    // InternalRoc.g:642:3: ( 'milliseconds' )
                    // InternalRoc.g:642:4: 'milliseconds'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:646:2: ( ( 'seconds' ) )
                    {
                    // InternalRoc.g:646:2: ( ( 'seconds' ) )
                    // InternalRoc.g:647:3: ( 'seconds' )
                    {
                     before(grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1()); 
                    // InternalRoc.g:648:3: ( 'seconds' )
                    // InternalRoc.g:648:4: 'seconds'
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:652:2: ( ( 'minutes' ) )
                    {
                    // InternalRoc.g:652:2: ( ( 'minutes' ) )
                    // InternalRoc.g:653:3: ( 'minutes' )
                    {
                     before(grammarAccess.getDurationUnitAccess().getMINUTESEnumLiteralDeclaration_2()); 
                    // InternalRoc.g:654:3: ( 'minutes' )
                    // InternalRoc.g:654:4: 'minutes'
                    {
                    match(input,22,FOLLOW_2); 

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
    // InternalRoc.g:662:1: rule__Movement__Group__0 : rule__Movement__Group__0__Impl rule__Movement__Group__1 ;
    public final void rule__Movement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:666:1: ( rule__Movement__Group__0__Impl rule__Movement__Group__1 )
            // InternalRoc.g:667:2: rule__Movement__Group__0__Impl rule__Movement__Group__1
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
    // InternalRoc.g:674:1: rule__Movement__Group__0__Impl : ( ( rule__Movement__MotionsAssignment_0 ) ) ;
    public final void rule__Movement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:678:1: ( ( ( rule__Movement__MotionsAssignment_0 ) ) )
            // InternalRoc.g:679:1: ( ( rule__Movement__MotionsAssignment_0 ) )
            {
            // InternalRoc.g:679:1: ( ( rule__Movement__MotionsAssignment_0 ) )
            // InternalRoc.g:680:2: ( rule__Movement__MotionsAssignment_0 )
            {
             before(grammarAccess.getMovementAccess().getMotionsAssignment_0()); 
            // InternalRoc.g:681:2: ( rule__Movement__MotionsAssignment_0 )
            // InternalRoc.g:681:3: rule__Movement__MotionsAssignment_0
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
    // InternalRoc.g:689:1: rule__Movement__Group__1 : rule__Movement__Group__1__Impl rule__Movement__Group__2 ;
    public final void rule__Movement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:693:1: ( rule__Movement__Group__1__Impl rule__Movement__Group__2 )
            // InternalRoc.g:694:2: rule__Movement__Group__1__Impl rule__Movement__Group__2
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
    // InternalRoc.g:701:1: rule__Movement__Group__1__Impl : ( ( rule__Movement__Group_1__0 )* ) ;
    public final void rule__Movement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:705:1: ( ( ( rule__Movement__Group_1__0 )* ) )
            // InternalRoc.g:706:1: ( ( rule__Movement__Group_1__0 )* )
            {
            // InternalRoc.g:706:1: ( ( rule__Movement__Group_1__0 )* )
            // InternalRoc.g:707:2: ( rule__Movement__Group_1__0 )*
            {
             before(grammarAccess.getMovementAccess().getGroup_1()); 
            // InternalRoc.g:708:2: ( rule__Movement__Group_1__0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==RULE_AND) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalRoc.g:708:3: rule__Movement__Group_1__0
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Movement__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
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
    // InternalRoc.g:716:1: rule__Movement__Group__2 : rule__Movement__Group__2__Impl ;
    public final void rule__Movement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:720:1: ( rule__Movement__Group__2__Impl )
            // InternalRoc.g:721:2: rule__Movement__Group__2__Impl
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
    // InternalRoc.g:727:1: rule__Movement__Group__2__Impl : ( RULE_PERIOD ) ;
    public final void rule__Movement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:731:1: ( ( RULE_PERIOD ) )
            // InternalRoc.g:732:1: ( RULE_PERIOD )
            {
            // InternalRoc.g:732:1: ( RULE_PERIOD )
            // InternalRoc.g:733:2: RULE_PERIOD
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
    // InternalRoc.g:743:1: rule__Movement__Group_1__0 : rule__Movement__Group_1__0__Impl rule__Movement__Group_1__1 ;
    public final void rule__Movement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:747:1: ( rule__Movement__Group_1__0__Impl rule__Movement__Group_1__1 )
            // InternalRoc.g:748:2: rule__Movement__Group_1__0__Impl rule__Movement__Group_1__1
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
    // InternalRoc.g:755:1: rule__Movement__Group_1__0__Impl : ( RULE_AND ) ;
    public final void rule__Movement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:759:1: ( ( RULE_AND ) )
            // InternalRoc.g:760:1: ( RULE_AND )
            {
            // InternalRoc.g:760:1: ( RULE_AND )
            // InternalRoc.g:761:2: RULE_AND
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
    // InternalRoc.g:770:1: rule__Movement__Group_1__1 : rule__Movement__Group_1__1__Impl ;
    public final void rule__Movement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:774:1: ( rule__Movement__Group_1__1__Impl )
            // InternalRoc.g:775:2: rule__Movement__Group_1__1__Impl
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
    // InternalRoc.g:781:1: rule__Movement__Group_1__1__Impl : ( ( rule__Movement__MotionsAssignment_1_1 ) ) ;
    public final void rule__Movement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:785:1: ( ( ( rule__Movement__MotionsAssignment_1_1 ) ) )
            // InternalRoc.g:786:1: ( ( rule__Movement__MotionsAssignment_1_1 ) )
            {
            // InternalRoc.g:786:1: ( ( rule__Movement__MotionsAssignment_1_1 ) )
            // InternalRoc.g:787:2: ( rule__Movement__MotionsAssignment_1_1 )
            {
             before(grammarAccess.getMovementAccess().getMotionsAssignment_1_1()); 
            // InternalRoc.g:788:2: ( rule__Movement__MotionsAssignment_1_1 )
            // InternalRoc.g:788:3: rule__Movement__MotionsAssignment_1_1
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


    // $ANTLR start "rule__Motion__Group__0"
    // InternalRoc.g:797:1: rule__Motion__Group__0 : rule__Motion__Group__0__Impl rule__Motion__Group__1 ;
    public final void rule__Motion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:801:1: ( rule__Motion__Group__0__Impl rule__Motion__Group__1 )
            // InternalRoc.g:802:2: rule__Motion__Group__0__Impl rule__Motion__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__Motion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motion__Group__1();

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
    // $ANTLR end "rule__Motion__Group__0"


    // $ANTLR start "rule__Motion__Group__0__Impl"
    // InternalRoc.g:809:1: rule__Motion__Group__0__Impl : ( ( rule__Motion__ActionAssignment_0 ) ) ;
    public final void rule__Motion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:813:1: ( ( ( rule__Motion__ActionAssignment_0 ) ) )
            // InternalRoc.g:814:1: ( ( rule__Motion__ActionAssignment_0 ) )
            {
            // InternalRoc.g:814:1: ( ( rule__Motion__ActionAssignment_0 ) )
            // InternalRoc.g:815:2: ( rule__Motion__ActionAssignment_0 )
            {
             before(grammarAccess.getMotionAccess().getActionAssignment_0()); 
            // InternalRoc.g:816:2: ( rule__Motion__ActionAssignment_0 )
            // InternalRoc.g:816:3: rule__Motion__ActionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Motion__ActionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getMotionAccess().getActionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motion__Group__0__Impl"


    // $ANTLR start "rule__Motion__Group__1"
    // InternalRoc.g:824:1: rule__Motion__Group__1 : rule__Motion__Group__1__Impl rule__Motion__Group__2 ;
    public final void rule__Motion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:828:1: ( rule__Motion__Group__1__Impl rule__Motion__Group__2 )
            // InternalRoc.g:829:2: rule__Motion__Group__1__Impl rule__Motion__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Motion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motion__Group__2();

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
    // $ANTLR end "rule__Motion__Group__1"


    // $ANTLR start "rule__Motion__Group__1__Impl"
    // InternalRoc.g:836:1: rule__Motion__Group__1__Impl : ( RULE_FOR ) ;
    public final void rule__Motion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:840:1: ( ( RULE_FOR ) )
            // InternalRoc.g:841:1: ( RULE_FOR )
            {
            // InternalRoc.g:841:1: ( RULE_FOR )
            // InternalRoc.g:842:2: RULE_FOR
            {
             before(grammarAccess.getMotionAccess().getFORTerminalRuleCall_1()); 
            match(input,RULE_FOR,FOLLOW_2); 
             after(grammarAccess.getMotionAccess().getFORTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motion__Group__1__Impl"


    // $ANTLR start "rule__Motion__Group__2"
    // InternalRoc.g:851:1: rule__Motion__Group__2 : rule__Motion__Group__2__Impl rule__Motion__Group__3 ;
    public final void rule__Motion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:855:1: ( rule__Motion__Group__2__Impl rule__Motion__Group__3 )
            // InternalRoc.g:856:2: rule__Motion__Group__2__Impl rule__Motion__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__Motion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Motion__Group__3();

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
    // $ANTLR end "rule__Motion__Group__2"


    // $ANTLR start "rule__Motion__Group__2__Impl"
    // InternalRoc.g:863:1: rule__Motion__Group__2__Impl : ( ( rule__Motion__DurationAssignment_2 ) ) ;
    public final void rule__Motion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:867:1: ( ( ( rule__Motion__DurationAssignment_2 ) ) )
            // InternalRoc.g:868:1: ( ( rule__Motion__DurationAssignment_2 ) )
            {
            // InternalRoc.g:868:1: ( ( rule__Motion__DurationAssignment_2 ) )
            // InternalRoc.g:869:2: ( rule__Motion__DurationAssignment_2 )
            {
             before(grammarAccess.getMotionAccess().getDurationAssignment_2()); 
            // InternalRoc.g:870:2: ( rule__Motion__DurationAssignment_2 )
            // InternalRoc.g:870:3: rule__Motion__DurationAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Motion__DurationAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMotionAccess().getDurationAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motion__Group__2__Impl"


    // $ANTLR start "rule__Motion__Group__3"
    // InternalRoc.g:878:1: rule__Motion__Group__3 : rule__Motion__Group__3__Impl ;
    public final void rule__Motion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:882:1: ( rule__Motion__Group__3__Impl )
            // InternalRoc.g:883:2: rule__Motion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Motion__Group__3__Impl();

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
    // $ANTLR end "rule__Motion__Group__3"


    // $ANTLR start "rule__Motion__Group__3__Impl"
    // InternalRoc.g:889:1: rule__Motion__Group__3__Impl : ( ( rule__Motion__DurationUnitAssignment_3 ) ) ;
    public final void rule__Motion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:893:1: ( ( ( rule__Motion__DurationUnitAssignment_3 ) ) )
            // InternalRoc.g:894:1: ( ( rule__Motion__DurationUnitAssignment_3 ) )
            {
            // InternalRoc.g:894:1: ( ( rule__Motion__DurationUnitAssignment_3 ) )
            // InternalRoc.g:895:2: ( rule__Motion__DurationUnitAssignment_3 )
            {
             before(grammarAccess.getMotionAccess().getDurationUnitAssignment_3()); 
            // InternalRoc.g:896:2: ( rule__Motion__DurationUnitAssignment_3 )
            // InternalRoc.g:896:3: rule__Motion__DurationUnitAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Motion__DurationUnitAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMotionAccess().getDurationUnitAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motion__Group__3__Impl"


    // $ANTLR start "rule__Action__Group_1__0"
    // InternalRoc.g:905:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:909:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // InternalRoc.g:910:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
            {
            pushFollow(FOLLOW_10);
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
    // InternalRoc.g:917:1: rule__Action__Group_1__0__Impl : ( ( rule__Action__IntensityAssignment_1_0 )? ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:921:1: ( ( ( rule__Action__IntensityAssignment_1_0 )? ) )
            // InternalRoc.g:922:1: ( ( rule__Action__IntensityAssignment_1_0 )? )
            {
            // InternalRoc.g:922:1: ( ( rule__Action__IntensityAssignment_1_0 )? )
            // InternalRoc.g:923:2: ( rule__Action__IntensityAssignment_1_0 )?
            {
             before(grammarAccess.getActionAccess().getIntensityAssignment_1_0()); 
            // InternalRoc.g:924:2: ( rule__Action__IntensityAssignment_1_0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=15 && LA12_0<=19)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalRoc.g:924:3: rule__Action__IntensityAssignment_1_0
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
    // InternalRoc.g:932:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:936:1: ( rule__Action__Group_1__1__Impl )
            // InternalRoc.g:937:2: rule__Action__Group_1__1__Impl
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
    // InternalRoc.g:943:1: rule__Action__Group_1__1__Impl : ( ( rule__Action__ActionHolderAssignment_1_1 ) ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:947:1: ( ( ( rule__Action__ActionHolderAssignment_1_1 ) ) )
            // InternalRoc.g:948:1: ( ( rule__Action__ActionHolderAssignment_1_1 ) )
            {
            // InternalRoc.g:948:1: ( ( rule__Action__ActionHolderAssignment_1_1 ) )
            // InternalRoc.g:949:2: ( rule__Action__ActionHolderAssignment_1_1 )
            {
             before(grammarAccess.getActionAccess().getActionHolderAssignment_1_1()); 
            // InternalRoc.g:950:2: ( rule__Action__ActionHolderAssignment_1_1 )
            // InternalRoc.g:950:3: rule__Action__ActionHolderAssignment_1_1
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
    // InternalRoc.g:959:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:963:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalRoc.g:964:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
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
    // InternalRoc.g:971:1: rule__Action__Group_2__0__Impl : ( ( rule__Action__IntensityAssignment_2_0 )? ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:975:1: ( ( ( rule__Action__IntensityAssignment_2_0 )? ) )
            // InternalRoc.g:976:1: ( ( rule__Action__IntensityAssignment_2_0 )? )
            {
            // InternalRoc.g:976:1: ( ( rule__Action__IntensityAssignment_2_0 )? )
            // InternalRoc.g:977:2: ( rule__Action__IntensityAssignment_2_0 )?
            {
             before(grammarAccess.getActionAccess().getIntensityAssignment_2_0()); 
            // InternalRoc.g:978:2: ( rule__Action__IntensityAssignment_2_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=15 && LA13_0<=19)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoc.g:978:3: rule__Action__IntensityAssignment_2_0
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
    // InternalRoc.g:986:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:990:1: ( rule__Action__Group_2__1__Impl )
            // InternalRoc.g:991:2: rule__Action__Group_2__1__Impl
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
    // InternalRoc.g:997:1: rule__Action__Group_2__1__Impl : ( ( rule__Action__ActionHolderAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1001:1: ( ( ( rule__Action__ActionHolderAssignment_2_1 ) ) )
            // InternalRoc.g:1002:1: ( ( rule__Action__ActionHolderAssignment_2_1 ) )
            {
            // InternalRoc.g:1002:1: ( ( rule__Action__ActionHolderAssignment_2_1 ) )
            // InternalRoc.g:1003:2: ( rule__Action__ActionHolderAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getActionHolderAssignment_2_1()); 
            // InternalRoc.g:1004:2: ( rule__Action__ActionHolderAssignment_2_1 )
            // InternalRoc.g:1004:3: rule__Action__ActionHolderAssignment_2_1
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
    // InternalRoc.g:1013:1: rule__CompleteAction__Group__0 : rule__CompleteAction__Group__0__Impl rule__CompleteAction__Group__1 ;
    public final void rule__CompleteAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1017:1: ( rule__CompleteAction__Group__0__Impl rule__CompleteAction__Group__1 )
            // InternalRoc.g:1018:2: rule__CompleteAction__Group__0__Impl rule__CompleteAction__Group__1
            {
            pushFollow(FOLLOW_11);
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
    // InternalRoc.g:1025:1: rule__CompleteAction__Group__0__Impl : ( ( rule__CompleteAction__ActionNameAssignment_0 ) ) ;
    public final void rule__CompleteAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1029:1: ( ( ( rule__CompleteAction__ActionNameAssignment_0 ) ) )
            // InternalRoc.g:1030:1: ( ( rule__CompleteAction__ActionNameAssignment_0 ) )
            {
            // InternalRoc.g:1030:1: ( ( rule__CompleteAction__ActionNameAssignment_0 ) )
            // InternalRoc.g:1031:2: ( rule__CompleteAction__ActionNameAssignment_0 )
            {
             before(grammarAccess.getCompleteActionAccess().getActionNameAssignment_0()); 
            // InternalRoc.g:1032:2: ( rule__CompleteAction__ActionNameAssignment_0 )
            // InternalRoc.g:1032:3: rule__CompleteAction__ActionNameAssignment_0
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
    // InternalRoc.g:1040:1: rule__CompleteAction__Group__1 : rule__CompleteAction__Group__1__Impl ;
    public final void rule__CompleteAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1044:1: ( rule__CompleteAction__Group__1__Impl )
            // InternalRoc.g:1045:2: rule__CompleteAction__Group__1__Impl
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
    // InternalRoc.g:1051:1: rule__CompleteAction__Group__1__Impl : ( 'face' ) ;
    public final void rule__CompleteAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1055:1: ( ( 'face' ) )
            // InternalRoc.g:1056:1: ( 'face' )
            {
            // InternalRoc.g:1056:1: ( 'face' )
            // InternalRoc.g:1057:2: 'face'
            {
             before(grammarAccess.getCompleteActionAccess().getFaceKeyword_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalRoc.g:1067:1: rule__DirectedAction__Group_0__0 : rule__DirectedAction__Group_0__0__Impl rule__DirectedAction__Group_0__1 ;
    public final void rule__DirectedAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1071:1: ( rule__DirectedAction__Group_0__0__Impl rule__DirectedAction__Group_0__1 )
            // InternalRoc.g:1072:2: rule__DirectedAction__Group_0__0__Impl rule__DirectedAction__Group_0__1
            {
            pushFollow(FOLLOW_12);
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
    // InternalRoc.g:1079:1: rule__DirectedAction__Group_0__0__Impl : ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) ) ;
    public final void rule__DirectedAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1083:1: ( ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) ) )
            // InternalRoc.g:1084:1: ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) )
            {
            // InternalRoc.g:1084:1: ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) )
            // InternalRoc.g:1085:2: ( rule__DirectedAction__ActionNameAssignment_0_0 )
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameAssignment_0_0()); 
            // InternalRoc.g:1086:2: ( rule__DirectedAction__ActionNameAssignment_0_0 )
            // InternalRoc.g:1086:3: rule__DirectedAction__ActionNameAssignment_0_0
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
    // InternalRoc.g:1094:1: rule__DirectedAction__Group_0__1 : rule__DirectedAction__Group_0__1__Impl ;
    public final void rule__DirectedAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1098:1: ( rule__DirectedAction__Group_0__1__Impl )
            // InternalRoc.g:1099:2: rule__DirectedAction__Group_0__1__Impl
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
    // InternalRoc.g:1105:1: rule__DirectedAction__Group_0__1__Impl : ( ( rule__DirectedAction__DirectionAssignment_0_1 ) ) ;
    public final void rule__DirectedAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1109:1: ( ( ( rule__DirectedAction__DirectionAssignment_0_1 ) ) )
            // InternalRoc.g:1110:1: ( ( rule__DirectedAction__DirectionAssignment_0_1 ) )
            {
            // InternalRoc.g:1110:1: ( ( rule__DirectedAction__DirectionAssignment_0_1 ) )
            // InternalRoc.g:1111:2: ( rule__DirectedAction__DirectionAssignment_0_1 )
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionAssignment_0_1()); 
            // InternalRoc.g:1112:2: ( rule__DirectedAction__DirectionAssignment_0_1 )
            // InternalRoc.g:1112:3: rule__DirectedAction__DirectionAssignment_0_1
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
    // InternalRoc.g:1121:1: rule__DirectedAction__Group_1__0 : rule__DirectedAction__Group_1__0__Impl rule__DirectedAction__Group_1__1 ;
    public final void rule__DirectedAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1125:1: ( rule__DirectedAction__Group_1__0__Impl rule__DirectedAction__Group_1__1 )
            // InternalRoc.g:1126:2: rule__DirectedAction__Group_1__0__Impl rule__DirectedAction__Group_1__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalRoc.g:1133:1: rule__DirectedAction__Group_1__0__Impl : ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) ) ;
    public final void rule__DirectedAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1137:1: ( ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) ) )
            // InternalRoc.g:1138:1: ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) )
            {
            // InternalRoc.g:1138:1: ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) )
            // InternalRoc.g:1139:2: ( rule__DirectedAction__ActionNameAssignment_1_0 )
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameAssignment_1_0()); 
            // InternalRoc.g:1140:2: ( rule__DirectedAction__ActionNameAssignment_1_0 )
            // InternalRoc.g:1140:3: rule__DirectedAction__ActionNameAssignment_1_0
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
    // InternalRoc.g:1148:1: rule__DirectedAction__Group_1__1 : rule__DirectedAction__Group_1__1__Impl ;
    public final void rule__DirectedAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1152:1: ( rule__DirectedAction__Group_1__1__Impl )
            // InternalRoc.g:1153:2: rule__DirectedAction__Group_1__1__Impl
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
    // InternalRoc.g:1159:1: rule__DirectedAction__Group_1__1__Impl : ( ( rule__DirectedAction__DirectionAssignment_1_1 ) ) ;
    public final void rule__DirectedAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1163:1: ( ( ( rule__DirectedAction__DirectionAssignment_1_1 ) ) )
            // InternalRoc.g:1164:1: ( ( rule__DirectedAction__DirectionAssignment_1_1 ) )
            {
            // InternalRoc.g:1164:1: ( ( rule__DirectedAction__DirectionAssignment_1_1 ) )
            // InternalRoc.g:1165:2: ( rule__DirectedAction__DirectionAssignment_1_1 )
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionAssignment_1_1()); 
            // InternalRoc.g:1166:2: ( rule__DirectedAction__DirectionAssignment_1_1 )
            // InternalRoc.g:1166:3: rule__DirectedAction__DirectionAssignment_1_1
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


    // $ANTLR start "rule__DirectedAction__Group_2__0"
    // InternalRoc.g:1175:1: rule__DirectedAction__Group_2__0 : rule__DirectedAction__Group_2__0__Impl rule__DirectedAction__Group_2__1 ;
    public final void rule__DirectedAction__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1179:1: ( rule__DirectedAction__Group_2__0__Impl rule__DirectedAction__Group_2__1 )
            // InternalRoc.g:1180:2: rule__DirectedAction__Group_2__0__Impl rule__DirectedAction__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__DirectedAction__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DirectedAction__Group_2__1();

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
    // $ANTLR end "rule__DirectedAction__Group_2__0"


    // $ANTLR start "rule__DirectedAction__Group_2__0__Impl"
    // InternalRoc.g:1187:1: rule__DirectedAction__Group_2__0__Impl : ( ( rule__DirectedAction__ActionNameAssignment_2_0 ) ) ;
    public final void rule__DirectedAction__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1191:1: ( ( ( rule__DirectedAction__ActionNameAssignment_2_0 ) ) )
            // InternalRoc.g:1192:1: ( ( rule__DirectedAction__ActionNameAssignment_2_0 ) )
            {
            // InternalRoc.g:1192:1: ( ( rule__DirectedAction__ActionNameAssignment_2_0 ) )
            // InternalRoc.g:1193:2: ( rule__DirectedAction__ActionNameAssignment_2_0 )
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameAssignment_2_0()); 
            // InternalRoc.g:1194:2: ( rule__DirectedAction__ActionNameAssignment_2_0 )
            // InternalRoc.g:1194:3: rule__DirectedAction__ActionNameAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAction__ActionNameAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getDirectedActionAccess().getActionNameAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAction__Group_2__0__Impl"


    // $ANTLR start "rule__DirectedAction__Group_2__1"
    // InternalRoc.g:1202:1: rule__DirectedAction__Group_2__1 : rule__DirectedAction__Group_2__1__Impl ;
    public final void rule__DirectedAction__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1206:1: ( rule__DirectedAction__Group_2__1__Impl )
            // InternalRoc.g:1207:2: rule__DirectedAction__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAction__Group_2__1__Impl();

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
    // $ANTLR end "rule__DirectedAction__Group_2__1"


    // $ANTLR start "rule__DirectedAction__Group_2__1__Impl"
    // InternalRoc.g:1213:1: rule__DirectedAction__Group_2__1__Impl : ( ( rule__DirectedAction__DirectionAssignment_2_1 ) ) ;
    public final void rule__DirectedAction__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1217:1: ( ( ( rule__DirectedAction__DirectionAssignment_2_1 ) ) )
            // InternalRoc.g:1218:1: ( ( rule__DirectedAction__DirectionAssignment_2_1 ) )
            {
            // InternalRoc.g:1218:1: ( ( rule__DirectedAction__DirectionAssignment_2_1 ) )
            // InternalRoc.g:1219:2: ( rule__DirectedAction__DirectionAssignment_2_1 )
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionAssignment_2_1()); 
            // InternalRoc.g:1220:2: ( rule__DirectedAction__DirectionAssignment_2_1 )
            // InternalRoc.g:1220:3: rule__DirectedAction__DirectionAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__DirectedAction__DirectionAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getDirectedActionAccess().getDirectionAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAction__Group_2__1__Impl"


    // $ANTLR start "rule__LeftRightDirectedAction__Group__0"
    // InternalRoc.g:1229:1: rule__LeftRightDirectedAction__Group__0 : rule__LeftRightDirectedAction__Group__0__Impl rule__LeftRightDirectedAction__Group__1 ;
    public final void rule__LeftRightDirectedAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1233:1: ( rule__LeftRightDirectedAction__Group__0__Impl rule__LeftRightDirectedAction__Group__1 )
            // InternalRoc.g:1234:2: rule__LeftRightDirectedAction__Group__0__Impl rule__LeftRightDirectedAction__Group__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalRoc.g:1241:1: rule__LeftRightDirectedAction__Group__0__Impl : ( ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 ) ) ;
    public final void rule__LeftRightDirectedAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1245:1: ( ( ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 ) ) )
            // InternalRoc.g:1246:1: ( ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 ) )
            {
            // InternalRoc.g:1246:1: ( ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 ) )
            // InternalRoc.g:1247:2: ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 )
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadAssignment_0()); 
            // InternalRoc.g:1248:2: ( rule__LeftRightDirectedAction__TiltHeadAssignment_0 )
            // InternalRoc.g:1248:3: rule__LeftRightDirectedAction__TiltHeadAssignment_0
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
    // InternalRoc.g:1256:1: rule__LeftRightDirectedAction__Group__1 : rule__LeftRightDirectedAction__Group__1__Impl ;
    public final void rule__LeftRightDirectedAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1260:1: ( rule__LeftRightDirectedAction__Group__1__Impl )
            // InternalRoc.g:1261:2: rule__LeftRightDirectedAction__Group__1__Impl
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
    // InternalRoc.g:1267:1: rule__LeftRightDirectedAction__Group__1__Impl : ( 'head' ) ;
    public final void rule__LeftRightDirectedAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1271:1: ( ( 'head' ) )
            // InternalRoc.g:1272:1: ( 'head' )
            {
            // InternalRoc.g:1272:1: ( 'head' )
            // InternalRoc.g:1273:2: 'head'
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getHeadKeyword_1()); 
            match(input,24,FOLLOW_2); 
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


    // $ANTLR start "rule__FullDirectedAction__Group_0__0"
    // InternalRoc.g:1283:1: rule__FullDirectedAction__Group_0__0 : rule__FullDirectedAction__Group_0__0__Impl rule__FullDirectedAction__Group_0__1 ;
    public final void rule__FullDirectedAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1287:1: ( rule__FullDirectedAction__Group_0__0__Impl rule__FullDirectedAction__Group_0__1 )
            // InternalRoc.g:1288:2: rule__FullDirectedAction__Group_0__0__Impl rule__FullDirectedAction__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__FullDirectedAction__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FullDirectedAction__Group_0__1();

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
    // $ANTLR end "rule__FullDirectedAction__Group_0__0"


    // $ANTLR start "rule__FullDirectedAction__Group_0__0__Impl"
    // InternalRoc.g:1295:1: rule__FullDirectedAction__Group_0__0__Impl : ( ( rule__FullDirectedAction__TurnHeadAssignment_0_0 ) ) ;
    public final void rule__FullDirectedAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1299:1: ( ( ( rule__FullDirectedAction__TurnHeadAssignment_0_0 ) ) )
            // InternalRoc.g:1300:1: ( ( rule__FullDirectedAction__TurnHeadAssignment_0_0 ) )
            {
            // InternalRoc.g:1300:1: ( ( rule__FullDirectedAction__TurnHeadAssignment_0_0 ) )
            // InternalRoc.g:1301:2: ( rule__FullDirectedAction__TurnHeadAssignment_0_0 )
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnHeadAssignment_0_0()); 
            // InternalRoc.g:1302:2: ( rule__FullDirectedAction__TurnHeadAssignment_0_0 )
            // InternalRoc.g:1302:3: rule__FullDirectedAction__TurnHeadAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__FullDirectedAction__TurnHeadAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getFullDirectedActionAccess().getTurnHeadAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullDirectedAction__Group_0__0__Impl"


    // $ANTLR start "rule__FullDirectedAction__Group_0__1"
    // InternalRoc.g:1310:1: rule__FullDirectedAction__Group_0__1 : rule__FullDirectedAction__Group_0__1__Impl ;
    public final void rule__FullDirectedAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1314:1: ( rule__FullDirectedAction__Group_0__1__Impl )
            // InternalRoc.g:1315:2: rule__FullDirectedAction__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FullDirectedAction__Group_0__1__Impl();

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
    // $ANTLR end "rule__FullDirectedAction__Group_0__1"


    // $ANTLR start "rule__FullDirectedAction__Group_0__1__Impl"
    // InternalRoc.g:1321:1: rule__FullDirectedAction__Group_0__1__Impl : ( 'head' ) ;
    public final void rule__FullDirectedAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1325:1: ( ( 'head' ) )
            // InternalRoc.g:1326:1: ( 'head' )
            {
            // InternalRoc.g:1326:1: ( 'head' )
            // InternalRoc.g:1327:2: 'head'
            {
             before(grammarAccess.getFullDirectedActionAccess().getHeadKeyword_0_1()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFullDirectedActionAccess().getHeadKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullDirectedAction__Group_0__1__Impl"


    // $ANTLR start "rule__FullDirectedAction__Group_1__0"
    // InternalRoc.g:1337:1: rule__FullDirectedAction__Group_1__0 : rule__FullDirectedAction__Group_1__0__Impl rule__FullDirectedAction__Group_1__1 ;
    public final void rule__FullDirectedAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1341:1: ( rule__FullDirectedAction__Group_1__0__Impl rule__FullDirectedAction__Group_1__1 )
            // InternalRoc.g:1342:2: rule__FullDirectedAction__Group_1__0__Impl rule__FullDirectedAction__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__FullDirectedAction__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FullDirectedAction__Group_1__1();

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
    // $ANTLR end "rule__FullDirectedAction__Group_1__0"


    // $ANTLR start "rule__FullDirectedAction__Group_1__0__Impl"
    // InternalRoc.g:1349:1: rule__FullDirectedAction__Group_1__0__Impl : ( ( rule__FullDirectedAction__TurnEyesAssignment_1_0 ) ) ;
    public final void rule__FullDirectedAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1353:1: ( ( ( rule__FullDirectedAction__TurnEyesAssignment_1_0 ) ) )
            // InternalRoc.g:1354:1: ( ( rule__FullDirectedAction__TurnEyesAssignment_1_0 ) )
            {
            // InternalRoc.g:1354:1: ( ( rule__FullDirectedAction__TurnEyesAssignment_1_0 ) )
            // InternalRoc.g:1355:2: ( rule__FullDirectedAction__TurnEyesAssignment_1_0 )
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnEyesAssignment_1_0()); 
            // InternalRoc.g:1356:2: ( rule__FullDirectedAction__TurnEyesAssignment_1_0 )
            // InternalRoc.g:1356:3: rule__FullDirectedAction__TurnEyesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FullDirectedAction__TurnEyesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFullDirectedActionAccess().getTurnEyesAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullDirectedAction__Group_1__0__Impl"


    // $ANTLR start "rule__FullDirectedAction__Group_1__1"
    // InternalRoc.g:1364:1: rule__FullDirectedAction__Group_1__1 : rule__FullDirectedAction__Group_1__1__Impl ;
    public final void rule__FullDirectedAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1368:1: ( rule__FullDirectedAction__Group_1__1__Impl )
            // InternalRoc.g:1369:2: rule__FullDirectedAction__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FullDirectedAction__Group_1__1__Impl();

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
    // $ANTLR end "rule__FullDirectedAction__Group_1__1"


    // $ANTLR start "rule__FullDirectedAction__Group_1__1__Impl"
    // InternalRoc.g:1375:1: rule__FullDirectedAction__Group_1__1__Impl : ( 'eyes' ) ;
    public final void rule__FullDirectedAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1379:1: ( ( 'eyes' ) )
            // InternalRoc.g:1380:1: ( 'eyes' )
            {
            // InternalRoc.g:1380:1: ( 'eyes' )
            // InternalRoc.g:1381:2: 'eyes'
            {
             before(grammarAccess.getFullDirectedActionAccess().getEyesKeyword_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getFullDirectedActionAccess().getEyesKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullDirectedAction__Group_1__1__Impl"


    // $ANTLR start "rule__Program__MovementsAssignment"
    // InternalRoc.g:1391:1: rule__Program__MovementsAssignment : ( ruleMovement ) ;
    public final void rule__Program__MovementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1395:1: ( ( ruleMovement ) )
            // InternalRoc.g:1396:2: ( ruleMovement )
            {
            // InternalRoc.g:1396:2: ( ruleMovement )
            // InternalRoc.g:1397:3: ruleMovement
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
    // InternalRoc.g:1406:1: rule__Movement__MotionsAssignment_0 : ( ruleMotion ) ;
    public final void rule__Movement__MotionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1410:1: ( ( ruleMotion ) )
            // InternalRoc.g:1411:2: ( ruleMotion )
            {
            // InternalRoc.g:1411:2: ( ruleMotion )
            // InternalRoc.g:1412:3: ruleMotion
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
    // InternalRoc.g:1421:1: rule__Movement__MotionsAssignment_1_1 : ( ruleMotion ) ;
    public final void rule__Movement__MotionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1425:1: ( ( ruleMotion ) )
            // InternalRoc.g:1426:2: ( ruleMotion )
            {
            // InternalRoc.g:1426:2: ( ruleMotion )
            // InternalRoc.g:1427:3: ruleMotion
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


    // $ANTLR start "rule__Motion__ActionAssignment_0"
    // InternalRoc.g:1436:1: rule__Motion__ActionAssignment_0 : ( ruleAction ) ;
    public final void rule__Motion__ActionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1440:1: ( ( ruleAction ) )
            // InternalRoc.g:1441:2: ( ruleAction )
            {
            // InternalRoc.g:1441:2: ( ruleAction )
            // InternalRoc.g:1442:3: ruleAction
            {
             before(grammarAccess.getMotionAccess().getActionActionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMotionAccess().getActionActionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motion__ActionAssignment_0"


    // $ANTLR start "rule__Motion__DurationAssignment_2"
    // InternalRoc.g:1451:1: rule__Motion__DurationAssignment_2 : ( RULE_DURATION ) ;
    public final void rule__Motion__DurationAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1455:1: ( ( RULE_DURATION ) )
            // InternalRoc.g:1456:2: ( RULE_DURATION )
            {
            // InternalRoc.g:1456:2: ( RULE_DURATION )
            // InternalRoc.g:1457:3: RULE_DURATION
            {
             before(grammarAccess.getMotionAccess().getDurationDurationTerminalRuleCall_2_0()); 
            match(input,RULE_DURATION,FOLLOW_2); 
             after(grammarAccess.getMotionAccess().getDurationDurationTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motion__DurationAssignment_2"


    // $ANTLR start "rule__Motion__DurationUnitAssignment_3"
    // InternalRoc.g:1466:1: rule__Motion__DurationUnitAssignment_3 : ( ruleDurationUnit ) ;
    public final void rule__Motion__DurationUnitAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1470:1: ( ( ruleDurationUnit ) )
            // InternalRoc.g:1471:2: ( ruleDurationUnit )
            {
            // InternalRoc.g:1471:2: ( ruleDurationUnit )
            // InternalRoc.g:1472:3: ruleDurationUnit
            {
             before(grammarAccess.getMotionAccess().getDurationUnitDurationUnitEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleDurationUnit();

            state._fsp--;

             after(grammarAccess.getMotionAccess().getDurationUnitDurationUnitEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motion__DurationUnitAssignment_3"


    // $ANTLR start "rule__Action__ActionHolderAssignment_0"
    // InternalRoc.g:1481:1: rule__Action__ActionHolderAssignment_0 : ( ruleCompleteAction ) ;
    public final void rule__Action__ActionHolderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1485:1: ( ( ruleCompleteAction ) )
            // InternalRoc.g:1486:2: ( ruleCompleteAction )
            {
            // InternalRoc.g:1486:2: ( ruleCompleteAction )
            // InternalRoc.g:1487:3: ruleCompleteAction
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
    // InternalRoc.g:1496:1: rule__Action__IntensityAssignment_1_0 : ( ruleIntensity ) ;
    public final void rule__Action__IntensityAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1500:1: ( ( ruleIntensity ) )
            // InternalRoc.g:1501:2: ( ruleIntensity )
            {
            // InternalRoc.g:1501:2: ( ruleIntensity )
            // InternalRoc.g:1502:3: ruleIntensity
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
    // InternalRoc.g:1511:1: rule__Action__ActionHolderAssignment_1_1 : ( ruleSingleAction ) ;
    public final void rule__Action__ActionHolderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1515:1: ( ( ruleSingleAction ) )
            // InternalRoc.g:1516:2: ( ruleSingleAction )
            {
            // InternalRoc.g:1516:2: ( ruleSingleAction )
            // InternalRoc.g:1517:3: ruleSingleAction
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
    // InternalRoc.g:1526:1: rule__Action__IntensityAssignment_2_0 : ( ruleIntensity ) ;
    public final void rule__Action__IntensityAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1530:1: ( ( ruleIntensity ) )
            // InternalRoc.g:1531:2: ( ruleIntensity )
            {
            // InternalRoc.g:1531:2: ( ruleIntensity )
            // InternalRoc.g:1532:3: ruleIntensity
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
    // InternalRoc.g:1541:1: rule__Action__ActionHolderAssignment_2_1 : ( ruleDirectedAction ) ;
    public final void rule__Action__ActionHolderAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1545:1: ( ( ruleDirectedAction ) )
            // InternalRoc.g:1546:2: ( ruleDirectedAction )
            {
            // InternalRoc.g:1546:2: ( ruleDirectedAction )
            // InternalRoc.g:1547:3: ruleDirectedAction
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
    // InternalRoc.g:1556:1: rule__CompleteAction__ActionNameAssignment_0 : ( ( 'neutral' ) ) ;
    public final void rule__CompleteAction__ActionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1560:1: ( ( ( 'neutral' ) ) )
            // InternalRoc.g:1561:2: ( ( 'neutral' ) )
            {
            // InternalRoc.g:1561:2: ( ( 'neutral' ) )
            // InternalRoc.g:1562:3: ( 'neutral' )
            {
             before(grammarAccess.getCompleteActionAccess().getActionNameNeutralKeyword_0_0()); 
            // InternalRoc.g:1563:3: ( 'neutral' )
            // InternalRoc.g:1564:4: 'neutral'
            {
             before(grammarAccess.getCompleteActionAccess().getActionNameNeutralKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRoc.g:1575:1: rule__SingleAction__ActionNameAssignment_0 : ( ( 'drop jaw' ) ) ;
    public final void rule__SingleAction__ActionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1579:1: ( ( ( 'drop jaw' ) ) )
            // InternalRoc.g:1580:2: ( ( 'drop jaw' ) )
            {
            // InternalRoc.g:1580:2: ( ( 'drop jaw' ) )
            // InternalRoc.g:1581:3: ( 'drop jaw' )
            {
             before(grammarAccess.getSingleActionAccess().getActionNameDropJawKeyword_0_0()); 
            // InternalRoc.g:1582:3: ( 'drop jaw' )
            // InternalRoc.g:1583:4: 'drop jaw'
            {
             before(grammarAccess.getSingleActionAccess().getActionNameDropJawKeyword_0_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRoc.g:1594:1: rule__SingleAction__ActionNameAssignment_1 : ( ( 'nod Head' ) ) ;
    public final void rule__SingleAction__ActionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1598:1: ( ( ( 'nod Head' ) ) )
            // InternalRoc.g:1599:2: ( ( 'nod Head' ) )
            {
            // InternalRoc.g:1599:2: ( ( 'nod Head' ) )
            // InternalRoc.g:1600:3: ( 'nod Head' )
            {
             before(grammarAccess.getSingleActionAccess().getActionNameNodHeadKeyword_1_0()); 
            // InternalRoc.g:1601:3: ( 'nod Head' )
            // InternalRoc.g:1602:4: 'nod Head'
            {
             before(grammarAccess.getSingleActionAccess().getActionNameNodHeadKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
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
    // InternalRoc.g:1613:1: rule__DirectedAction__ActionNameAssignment_0_0 : ( ruleLeftRightDirectedAction ) ;
    public final void rule__DirectedAction__ActionNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1617:1: ( ( ruleLeftRightDirectedAction ) )
            // InternalRoc.g:1618:2: ( ruleLeftRightDirectedAction )
            {
            // InternalRoc.g:1618:2: ( ruleLeftRightDirectedAction )
            // InternalRoc.g:1619:3: ruleLeftRightDirectedAction
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
    // InternalRoc.g:1628:1: rule__DirectedAction__DirectionAssignment_0_1 : ( ruleLeftRightDirection ) ;
    public final void rule__DirectedAction__DirectionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1632:1: ( ( ruleLeftRightDirection ) )
            // InternalRoc.g:1633:2: ( ruleLeftRightDirection )
            {
            // InternalRoc.g:1633:2: ( ruleLeftRightDirection )
            // InternalRoc.g:1634:3: ruleLeftRightDirection
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
    // InternalRoc.g:1643:1: rule__DirectedAction__ActionNameAssignment_1_0 : ( ruleBackForthDirectedAction ) ;
    public final void rule__DirectedAction__ActionNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1647:1: ( ( ruleBackForthDirectedAction ) )
            // InternalRoc.g:1648:2: ( ruleBackForthDirectedAction )
            {
            // InternalRoc.g:1648:2: ( ruleBackForthDirectedAction )
            // InternalRoc.g:1649:3: ruleBackForthDirectedAction
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameBackForthDirectedActionParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleBackForthDirectedAction();

            state._fsp--;

             after(grammarAccess.getDirectedActionAccess().getActionNameBackForthDirectedActionParserRuleCall_1_0_0()); 

            }


            }

        }
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
    // InternalRoc.g:1658:1: rule__DirectedAction__DirectionAssignment_1_1 : ( ruleBackForthDirection ) ;
    public final void rule__DirectedAction__DirectionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1662:1: ( ( ruleBackForthDirection ) )
            // InternalRoc.g:1663:2: ( ruleBackForthDirection )
            {
            // InternalRoc.g:1663:2: ( ruleBackForthDirection )
            // InternalRoc.g:1664:3: ruleBackForthDirection
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionBackForthDirectionParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleBackForthDirection();

            state._fsp--;

             after(grammarAccess.getDirectedActionAccess().getDirectionBackForthDirectionParserRuleCall_1_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__DirectedAction__ActionNameAssignment_2_0"
    // InternalRoc.g:1673:1: rule__DirectedAction__ActionNameAssignment_2_0 : ( ruleFullDirectedAction ) ;
    public final void rule__DirectedAction__ActionNameAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1677:1: ( ( ruleFullDirectedAction ) )
            // InternalRoc.g:1678:2: ( ruleFullDirectedAction )
            {
            // InternalRoc.g:1678:2: ( ruleFullDirectedAction )
            // InternalRoc.g:1679:3: ruleFullDirectedAction
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameFullDirectedActionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFullDirectedAction();

            state._fsp--;

             after(grammarAccess.getDirectedActionAccess().getActionNameFullDirectedActionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAction__ActionNameAssignment_2_0"


    // $ANTLR start "rule__DirectedAction__DirectionAssignment_2_1"
    // InternalRoc.g:1688:1: rule__DirectedAction__DirectionAssignment_2_1 : ( ruleDirection ) ;
    public final void rule__DirectedAction__DirectionAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1692:1: ( ( ruleDirection ) )
            // InternalRoc.g:1693:2: ( ruleDirection )
            {
            // InternalRoc.g:1693:2: ( ruleDirection )
            // InternalRoc.g:1694:3: ruleDirection
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionDirectionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getDirectedActionAccess().getDirectionDirectionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DirectedAction__DirectionAssignment_2_1"


    // $ANTLR start "rule__LeftRightDirectedAction__TiltHeadAssignment_0"
    // InternalRoc.g:1703:1: rule__LeftRightDirectedAction__TiltHeadAssignment_0 : ( ( 'tilt' ) ) ;
    public final void rule__LeftRightDirectedAction__TiltHeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1707:1: ( ( ( 'tilt' ) ) )
            // InternalRoc.g:1708:2: ( ( 'tilt' ) )
            {
            // InternalRoc.g:1708:2: ( ( 'tilt' ) )
            // InternalRoc.g:1709:3: ( 'tilt' )
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltKeyword_0_0()); 
            // InternalRoc.g:1710:3: ( 'tilt' )
            // InternalRoc.g:1711:4: 'tilt'
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRoc.g:1722:1: rule__LeftRightDirection__LeftAssignment_0 : ( ( 'left' ) ) ;
    public final void rule__LeftRightDirection__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1726:1: ( ( ( 'left' ) ) )
            // InternalRoc.g:1727:2: ( ( 'left' ) )
            {
            // InternalRoc.g:1727:2: ( ( 'left' ) )
            // InternalRoc.g:1728:3: ( 'left' )
            {
             before(grammarAccess.getLeftRightDirectionAccess().getLeftLeftKeyword_0_0()); 
            // InternalRoc.g:1729:3: ( 'left' )
            // InternalRoc.g:1730:4: 'left'
            {
             before(grammarAccess.getLeftRightDirectionAccess().getLeftLeftKeyword_0_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRoc.g:1741:1: rule__LeftRightDirection__RightAssignment_1 : ( ( 'right' ) ) ;
    public final void rule__LeftRightDirection__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1745:1: ( ( ( 'right' ) ) )
            // InternalRoc.g:1746:2: ( ( 'right' ) )
            {
            // InternalRoc.g:1746:2: ( ( 'right' ) )
            // InternalRoc.g:1747:3: ( 'right' )
            {
             before(grammarAccess.getLeftRightDirectionAccess().getRightRightKeyword_1_0()); 
            // InternalRoc.g:1748:3: ( 'right' )
            // InternalRoc.g:1749:4: 'right'
            {
             before(grammarAccess.getLeftRightDirectionAccess().getRightRightKeyword_1_0()); 
            match(input,31,FOLLOW_2); 
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


    // $ANTLR start "rule__BackForthDirectedAction__HeadAssignment"
    // InternalRoc.g:1760:1: rule__BackForthDirectedAction__HeadAssignment : ( ( 'head' ) ) ;
    public final void rule__BackForthDirectedAction__HeadAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1764:1: ( ( ( 'head' ) ) )
            // InternalRoc.g:1765:2: ( ( 'head' ) )
            {
            // InternalRoc.g:1765:2: ( ( 'head' ) )
            // InternalRoc.g:1766:3: ( 'head' )
            {
             before(grammarAccess.getBackForthDirectedActionAccess().getHeadHeadKeyword_0()); 
            // InternalRoc.g:1767:3: ( 'head' )
            // InternalRoc.g:1768:4: 'head'
            {
             before(grammarAccess.getBackForthDirectedActionAccess().getHeadHeadKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getBackForthDirectedActionAccess().getHeadHeadKeyword_0()); 

            }

             after(grammarAccess.getBackForthDirectedActionAccess().getHeadHeadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackForthDirectedAction__HeadAssignment"


    // $ANTLR start "rule__BackForthDirection__BackAssignment_0"
    // InternalRoc.g:1779:1: rule__BackForthDirection__BackAssignment_0 : ( ( 'back' ) ) ;
    public final void rule__BackForthDirection__BackAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1783:1: ( ( ( 'back' ) ) )
            // InternalRoc.g:1784:2: ( ( 'back' ) )
            {
            // InternalRoc.g:1784:2: ( ( 'back' ) )
            // InternalRoc.g:1785:3: ( 'back' )
            {
             before(grammarAccess.getBackForthDirectionAccess().getBackBackKeyword_0_0()); 
            // InternalRoc.g:1786:3: ( 'back' )
            // InternalRoc.g:1787:4: 'back'
            {
             before(grammarAccess.getBackForthDirectionAccess().getBackBackKeyword_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getBackForthDirectionAccess().getBackBackKeyword_0_0()); 

            }

             after(grammarAccess.getBackForthDirectionAccess().getBackBackKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackForthDirection__BackAssignment_0"


    // $ANTLR start "rule__BackForthDirection__ForthAssignment_1"
    // InternalRoc.g:1798:1: rule__BackForthDirection__ForthAssignment_1 : ( ( 'forth' ) ) ;
    public final void rule__BackForthDirection__ForthAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1802:1: ( ( ( 'forth' ) ) )
            // InternalRoc.g:1803:2: ( ( 'forth' ) )
            {
            // InternalRoc.g:1803:2: ( ( 'forth' ) )
            // InternalRoc.g:1804:3: ( 'forth' )
            {
             before(grammarAccess.getBackForthDirectionAccess().getForthForthKeyword_1_0()); 
            // InternalRoc.g:1805:3: ( 'forth' )
            // InternalRoc.g:1806:4: 'forth'
            {
             before(grammarAccess.getBackForthDirectionAccess().getForthForthKeyword_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getBackForthDirectionAccess().getForthForthKeyword_1_0()); 

            }

             after(grammarAccess.getBackForthDirectionAccess().getForthForthKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BackForthDirection__ForthAssignment_1"


    // $ANTLR start "rule__FullDirectedAction__TurnHeadAssignment_0_0"
    // InternalRoc.g:1817:1: rule__FullDirectedAction__TurnHeadAssignment_0_0 : ( ( 'turn' ) ) ;
    public final void rule__FullDirectedAction__TurnHeadAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1821:1: ( ( ( 'turn' ) ) )
            // InternalRoc.g:1822:2: ( ( 'turn' ) )
            {
            // InternalRoc.g:1822:2: ( ( 'turn' ) )
            // InternalRoc.g:1823:3: ( 'turn' )
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnKeyword_0_0_0()); 
            // InternalRoc.g:1824:3: ( 'turn' )
            // InternalRoc.g:1825:4: 'turn'
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnKeyword_0_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnKeyword_0_0_0()); 

            }

             after(grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullDirectedAction__TurnHeadAssignment_0_0"


    // $ANTLR start "rule__FullDirectedAction__TurnEyesAssignment_1_0"
    // InternalRoc.g:1836:1: rule__FullDirectedAction__TurnEyesAssignment_1_0 : ( ( 'turn' ) ) ;
    public final void rule__FullDirectedAction__TurnEyesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1840:1: ( ( ( 'turn' ) ) )
            // InternalRoc.g:1841:2: ( ( 'turn' ) )
            {
            // InternalRoc.g:1841:2: ( ( 'turn' ) )
            // InternalRoc.g:1842:3: ( 'turn' )
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnKeyword_1_0_0()); 
            // InternalRoc.g:1843:3: ( 'turn' )
            // InternalRoc.g:1844:4: 'turn'
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnKeyword_1_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnKeyword_1_0_0()); 

            }

             after(grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FullDirectedAction__TurnEyesAssignment_1_0"


    // $ANTLR start "rule__Direction__UPAssignment_0"
    // InternalRoc.g:1855:1: rule__Direction__UPAssignment_0 : ( ( 'up' ) ) ;
    public final void rule__Direction__UPAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1859:1: ( ( ( 'up' ) ) )
            // InternalRoc.g:1860:2: ( ( 'up' ) )
            {
            // InternalRoc.g:1860:2: ( ( 'up' ) )
            // InternalRoc.g:1861:3: ( 'up' )
            {
             before(grammarAccess.getDirectionAccess().getUPUpKeyword_0_0()); 
            // InternalRoc.g:1862:3: ( 'up' )
            // InternalRoc.g:1863:4: 'up'
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
    // InternalRoc.g:1874:1: rule__Direction__DOWNAssignment_1 : ( ( 'down' ) ) ;
    public final void rule__Direction__DOWNAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1878:1: ( ( ( 'down' ) ) )
            // InternalRoc.g:1879:2: ( ( 'down' ) )
            {
            // InternalRoc.g:1879:2: ( ( 'down' ) )
            // InternalRoc.g:1880:3: ( 'down' )
            {
             before(grammarAccess.getDirectionAccess().getDOWNDownKeyword_1_0()); 
            // InternalRoc.g:1881:3: ( 'down' )
            // InternalRoc.g:1882:4: 'down'
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
    // InternalRoc.g:1893:1: rule__Direction__LEFTAssignment_2 : ( ( 'left' ) ) ;
    public final void rule__Direction__LEFTAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1897:1: ( ( ( 'left' ) ) )
            // InternalRoc.g:1898:2: ( ( 'left' ) )
            {
            // InternalRoc.g:1898:2: ( ( 'left' ) )
            // InternalRoc.g:1899:3: ( 'left' )
            {
             before(grammarAccess.getDirectionAccess().getLEFTLeftKeyword_2_0()); 
            // InternalRoc.g:1900:3: ( 'left' )
            // InternalRoc.g:1901:4: 'left'
            {
             before(grammarAccess.getDirectionAccess().getLEFTLeftKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRoc.g:1912:1: rule__Direction__RIGHTAssignment_3 : ( ( 'right' ) ) ;
    public final void rule__Direction__RIGHTAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1916:1: ( ( ( 'right' ) ) )
            // InternalRoc.g:1917:2: ( ( 'right' ) )
            {
            // InternalRoc.g:1917:2: ( ( 'right' ) )
            // InternalRoc.g:1918:3: ( 'right' )
            {
             before(grammarAccess.getDirectionAccess().getRIGHTRightKeyword_3_0()); 
            // InternalRoc.g:1919:3: ( 'right' )
            // InternalRoc.g:1920:4: 'right'
            {
             before(grammarAccess.getDirectionAccess().getRIGHTRightKeyword_3_0()); 
            match(input,31,FOLLOW_2); 
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000043D0F8002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000043D0F8000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000180F8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000018C0000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000002000000L});

}