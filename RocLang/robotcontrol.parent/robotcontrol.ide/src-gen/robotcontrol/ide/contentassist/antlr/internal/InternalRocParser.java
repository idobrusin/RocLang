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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_PERIOD", "RULE_AND", "RULE_FOR", "RULE_WITH", "RULE_SPEED_KEY", "RULE_DURATION", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pronounced'", "'trace of'", "'slightly'", "'severe'", "'maximum'", "'milliseconds'", "'seconds'", "'minutes'", "'neutral face'", "'drop jaw'", "'nod head'", "'tilt head'", "'left'", "'right'", "'turn head'", "'turn eyes'", "'up'", "'down'", "'slowest'", "'slow'", "'normal'", "'fast'", "'full'"
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

                if ( ((LA1_0>=17 && LA1_0<=21)||(LA1_0>=25 && LA1_0<=28)||(LA1_0>=31 && LA1_0<=32)) ) {
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
    // InternalRoc.g:178:1: ruleCompleteAction : ( ( rule__CompleteAction__ActionNameAssignment ) ) ;
    public final void ruleCompleteAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:182:2: ( ( ( rule__CompleteAction__ActionNameAssignment ) ) )
            // InternalRoc.g:183:2: ( ( rule__CompleteAction__ActionNameAssignment ) )
            {
            // InternalRoc.g:183:2: ( ( rule__CompleteAction__ActionNameAssignment ) )
            // InternalRoc.g:184:3: ( rule__CompleteAction__ActionNameAssignment )
            {
             before(grammarAccess.getCompleteActionAccess().getActionNameAssignment()); 
            // InternalRoc.g:185:3: ( rule__CompleteAction__ActionNameAssignment )
            // InternalRoc.g:185:4: rule__CompleteAction__ActionNameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__CompleteAction__ActionNameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getCompleteActionAccess().getActionNameAssignment()); 

            }


            }

        }
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
    // InternalRoc.g:253:1: ruleLeftRightDirectedAction : ( ( rule__LeftRightDirectedAction__TiltHeadAssignment ) ) ;
    public final void ruleLeftRightDirectedAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:257:2: ( ( ( rule__LeftRightDirectedAction__TiltHeadAssignment ) ) )
            // InternalRoc.g:258:2: ( ( rule__LeftRightDirectedAction__TiltHeadAssignment ) )
            {
            // InternalRoc.g:258:2: ( ( rule__LeftRightDirectedAction__TiltHeadAssignment ) )
            // InternalRoc.g:259:3: ( rule__LeftRightDirectedAction__TiltHeadAssignment )
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadAssignment()); 
            // InternalRoc.g:260:3: ( rule__LeftRightDirectedAction__TiltHeadAssignment )
            // InternalRoc.g:260:4: rule__LeftRightDirectedAction__TiltHeadAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LeftRightDirectedAction__TiltHeadAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadAssignment()); 

            }


            }

        }
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
    // InternalRoc.g:400:1: rule__Motion__Alternatives : ( ( ( rule__Motion__Group_0__0 ) ) | ( ( rule__Motion__Group_1__0 ) ) | ( ( rule__Motion__ActionAssignment_2 ) ) );
    public final void rule__Motion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:404:1: ( ( ( rule__Motion__Group_0__0 ) ) | ( ( rule__Motion__Group_1__0 ) ) | ( ( rule__Motion__ActionAssignment_2 ) ) )
            int alt2=3;
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
                case 3 :
                    // InternalRoc.g:417:2: ( ( rule__Motion__ActionAssignment_2 ) )
                    {
                    // InternalRoc.g:417:2: ( ( rule__Motion__ActionAssignment_2 ) )
                    // InternalRoc.g:418:3: ( rule__Motion__ActionAssignment_2 )
                    {
                     before(grammarAccess.getMotionAccess().getActionAssignment_2()); 
                    // InternalRoc.g:419:3: ( rule__Motion__ActionAssignment_2 )
                    // InternalRoc.g:419:4: rule__Motion__ActionAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Motion__ActionAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMotionAccess().getActionAssignment_2()); 

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
    // InternalRoc.g:427:1: rule__Action__Alternatives : ( ( ( rule__Action__ActionHolderAssignment_0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:431:1: ( ( ( rule__Action__ActionHolderAssignment_0 ) ) | ( ( rule__Action__Group_1__0 ) ) | ( ( rule__Action__Group_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>=26 && LA3_2<=27)) ) {
                    alt3=2;
                }
                else if ( (LA3_2==28||(LA3_2>=31 && LA3_2<=32)) ) {
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

                if ( ((LA3_3>=26 && LA3_3<=27)) ) {
                    alt3=2;
                }
                else if ( (LA3_3==28||(LA3_3>=31 && LA3_3<=32)) ) {
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

                if ( ((LA3_4>=26 && LA3_4<=27)) ) {
                    alt3=2;
                }
                else if ( (LA3_4==28||(LA3_4>=31 && LA3_4<=32)) ) {
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

                if ( ((LA3_5>=26 && LA3_5<=27)) ) {
                    alt3=2;
                }
                else if ( (LA3_5==28||(LA3_5>=31 && LA3_5<=32)) ) {
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

                if ( ((LA3_6>=26 && LA3_6<=27)) ) {
                    alt3=2;
                }
                else if ( (LA3_6==28||(LA3_6>=31 && LA3_6<=32)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 6, input);

                    throw nvae;
                }
                }
                break;
            case 26:
            case 27:
                {
                alt3=2;
                }
                break;
            case 28:
            case 31:
            case 32:
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
                    // InternalRoc.g:432:2: ( ( rule__Action__ActionHolderAssignment_0 ) )
                    {
                    // InternalRoc.g:432:2: ( ( rule__Action__ActionHolderAssignment_0 ) )
                    // InternalRoc.g:433:3: ( rule__Action__ActionHolderAssignment_0 )
                    {
                     before(grammarAccess.getActionAccess().getActionHolderAssignment_0()); 
                    // InternalRoc.g:434:3: ( rule__Action__ActionHolderAssignment_0 )
                    // InternalRoc.g:434:4: rule__Action__ActionHolderAssignment_0
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
                    // InternalRoc.g:438:2: ( ( rule__Action__Group_1__0 ) )
                    {
                    // InternalRoc.g:438:2: ( ( rule__Action__Group_1__0 ) )
                    // InternalRoc.g:439:3: ( rule__Action__Group_1__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_1()); 
                    // InternalRoc.g:440:3: ( rule__Action__Group_1__0 )
                    // InternalRoc.g:440:4: rule__Action__Group_1__0
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
                    // InternalRoc.g:444:2: ( ( rule__Action__Group_2__0 ) )
                    {
                    // InternalRoc.g:444:2: ( ( rule__Action__Group_2__0 ) )
                    // InternalRoc.g:445:3: ( rule__Action__Group_2__0 )
                    {
                     before(grammarAccess.getActionAccess().getGroup_2()); 
                    // InternalRoc.g:446:3: ( rule__Action__Group_2__0 )
                    // InternalRoc.g:446:4: rule__Action__Group_2__0
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
    // InternalRoc.g:454:1: rule__SingleAction__Alternatives : ( ( ( rule__SingleAction__ActionNameAssignment_0 ) ) | ( ( rule__SingleAction__ActionNameAssignment_1 ) ) );
    public final void rule__SingleAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:458:1: ( ( ( rule__SingleAction__ActionNameAssignment_0 ) ) | ( ( rule__SingleAction__ActionNameAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            else if ( (LA4_0==27) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalRoc.g:459:2: ( ( rule__SingleAction__ActionNameAssignment_0 ) )
                    {
                    // InternalRoc.g:459:2: ( ( rule__SingleAction__ActionNameAssignment_0 ) )
                    // InternalRoc.g:460:3: ( rule__SingleAction__ActionNameAssignment_0 )
                    {
                     before(grammarAccess.getSingleActionAccess().getActionNameAssignment_0()); 
                    // InternalRoc.g:461:3: ( rule__SingleAction__ActionNameAssignment_0 )
                    // InternalRoc.g:461:4: rule__SingleAction__ActionNameAssignment_0
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
                    // InternalRoc.g:465:2: ( ( rule__SingleAction__ActionNameAssignment_1 ) )
                    {
                    // InternalRoc.g:465:2: ( ( rule__SingleAction__ActionNameAssignment_1 ) )
                    // InternalRoc.g:466:3: ( rule__SingleAction__ActionNameAssignment_1 )
                    {
                     before(grammarAccess.getSingleActionAccess().getActionNameAssignment_1()); 
                    // InternalRoc.g:467:3: ( rule__SingleAction__ActionNameAssignment_1 )
                    // InternalRoc.g:467:4: rule__SingleAction__ActionNameAssignment_1
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
    // InternalRoc.g:475:1: rule__DirectedAction__Alternatives : ( ( ( rule__DirectedAction__Group_0__0 ) ) | ( ( rule__DirectedAction__Group_1__0 ) ) );
    public final void rule__DirectedAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:479:1: ( ( ( rule__DirectedAction__Group_0__0 ) ) | ( ( rule__DirectedAction__Group_1__0 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==28) ) {
                alt5=1;
            }
            else if ( ((LA5_0>=31 && LA5_0<=32)) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalRoc.g:480:2: ( ( rule__DirectedAction__Group_0__0 ) )
                    {
                    // InternalRoc.g:480:2: ( ( rule__DirectedAction__Group_0__0 ) )
                    // InternalRoc.g:481:3: ( rule__DirectedAction__Group_0__0 )
                    {
                     before(grammarAccess.getDirectedActionAccess().getGroup_0()); 
                    // InternalRoc.g:482:3: ( rule__DirectedAction__Group_0__0 )
                    // InternalRoc.g:482:4: rule__DirectedAction__Group_0__0
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
                    // InternalRoc.g:486:2: ( ( rule__DirectedAction__Group_1__0 ) )
                    {
                    // InternalRoc.g:486:2: ( ( rule__DirectedAction__Group_1__0 ) )
                    // InternalRoc.g:487:3: ( rule__DirectedAction__Group_1__0 )
                    {
                     before(grammarAccess.getDirectedActionAccess().getGroup_1()); 
                    // InternalRoc.g:488:3: ( rule__DirectedAction__Group_1__0 )
                    // InternalRoc.g:488:4: rule__DirectedAction__Group_1__0
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
    // InternalRoc.g:496:1: rule__LeftRightDirection__Alternatives : ( ( ( rule__LeftRightDirection__LeftAssignment_0 ) ) | ( ( rule__LeftRightDirection__RightAssignment_1 ) ) );
    public final void rule__LeftRightDirection__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:500:1: ( ( ( rule__LeftRightDirection__LeftAssignment_0 ) ) | ( ( rule__LeftRightDirection__RightAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==29) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoc.g:501:2: ( ( rule__LeftRightDirection__LeftAssignment_0 ) )
                    {
                    // InternalRoc.g:501:2: ( ( rule__LeftRightDirection__LeftAssignment_0 ) )
                    // InternalRoc.g:502:3: ( rule__LeftRightDirection__LeftAssignment_0 )
                    {
                     before(grammarAccess.getLeftRightDirectionAccess().getLeftAssignment_0()); 
                    // InternalRoc.g:503:3: ( rule__LeftRightDirection__LeftAssignment_0 )
                    // InternalRoc.g:503:4: rule__LeftRightDirection__LeftAssignment_0
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
                    // InternalRoc.g:507:2: ( ( rule__LeftRightDirection__RightAssignment_1 ) )
                    {
                    // InternalRoc.g:507:2: ( ( rule__LeftRightDirection__RightAssignment_1 ) )
                    // InternalRoc.g:508:3: ( rule__LeftRightDirection__RightAssignment_1 )
                    {
                     before(grammarAccess.getLeftRightDirectionAccess().getRightAssignment_1()); 
                    // InternalRoc.g:509:3: ( rule__LeftRightDirection__RightAssignment_1 )
                    // InternalRoc.g:509:4: rule__LeftRightDirection__RightAssignment_1
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
    // InternalRoc.g:517:1: rule__FullDirectedAction__Alternatives : ( ( ( rule__FullDirectedAction__TurnHeadAssignment_0 ) ) | ( ( rule__FullDirectedAction__TurnEyesAssignment_1 ) ) );
    public final void rule__FullDirectedAction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:521:1: ( ( ( rule__FullDirectedAction__TurnHeadAssignment_0 ) ) | ( ( rule__FullDirectedAction__TurnEyesAssignment_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                alt7=1;
            }
            else if ( (LA7_0==32) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoc.g:522:2: ( ( rule__FullDirectedAction__TurnHeadAssignment_0 ) )
                    {
                    // InternalRoc.g:522:2: ( ( rule__FullDirectedAction__TurnHeadAssignment_0 ) )
                    // InternalRoc.g:523:3: ( rule__FullDirectedAction__TurnHeadAssignment_0 )
                    {
                     before(grammarAccess.getFullDirectedActionAccess().getTurnHeadAssignment_0()); 
                    // InternalRoc.g:524:3: ( rule__FullDirectedAction__TurnHeadAssignment_0 )
                    // InternalRoc.g:524:4: rule__FullDirectedAction__TurnHeadAssignment_0
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
                    // InternalRoc.g:528:2: ( ( rule__FullDirectedAction__TurnEyesAssignment_1 ) )
                    {
                    // InternalRoc.g:528:2: ( ( rule__FullDirectedAction__TurnEyesAssignment_1 ) )
                    // InternalRoc.g:529:3: ( rule__FullDirectedAction__TurnEyesAssignment_1 )
                    {
                     before(grammarAccess.getFullDirectedActionAccess().getTurnEyesAssignment_1()); 
                    // InternalRoc.g:530:3: ( rule__FullDirectedAction__TurnEyesAssignment_1 )
                    // InternalRoc.g:530:4: rule__FullDirectedAction__TurnEyesAssignment_1
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
    // InternalRoc.g:538:1: rule__Direction__Alternatives : ( ( ( rule__Direction__UPAssignment_0 ) ) | ( ( rule__Direction__DOWNAssignment_1 ) ) | ( ( rule__Direction__LEFTAssignment_2 ) ) | ( ( rule__Direction__RIGHTAssignment_3 ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:542:1: ( ( ( rule__Direction__UPAssignment_0 ) ) | ( ( rule__Direction__DOWNAssignment_1 ) ) | ( ( rule__Direction__LEFTAssignment_2 ) ) | ( ( rule__Direction__RIGHTAssignment_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt8=1;
                }
                break;
            case 34:
                {
                alt8=2;
                }
                break;
            case 29:
                {
                alt8=3;
                }
                break;
            case 30:
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
                    // InternalRoc.g:543:2: ( ( rule__Direction__UPAssignment_0 ) )
                    {
                    // InternalRoc.g:543:2: ( ( rule__Direction__UPAssignment_0 ) )
                    // InternalRoc.g:544:3: ( rule__Direction__UPAssignment_0 )
                    {
                     before(grammarAccess.getDirectionAccess().getUPAssignment_0()); 
                    // InternalRoc.g:545:3: ( rule__Direction__UPAssignment_0 )
                    // InternalRoc.g:545:4: rule__Direction__UPAssignment_0
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
                    // InternalRoc.g:549:2: ( ( rule__Direction__DOWNAssignment_1 ) )
                    {
                    // InternalRoc.g:549:2: ( ( rule__Direction__DOWNAssignment_1 ) )
                    // InternalRoc.g:550:3: ( rule__Direction__DOWNAssignment_1 )
                    {
                     before(grammarAccess.getDirectionAccess().getDOWNAssignment_1()); 
                    // InternalRoc.g:551:3: ( rule__Direction__DOWNAssignment_1 )
                    // InternalRoc.g:551:4: rule__Direction__DOWNAssignment_1
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
                    // InternalRoc.g:555:2: ( ( rule__Direction__LEFTAssignment_2 ) )
                    {
                    // InternalRoc.g:555:2: ( ( rule__Direction__LEFTAssignment_2 ) )
                    // InternalRoc.g:556:3: ( rule__Direction__LEFTAssignment_2 )
                    {
                     before(grammarAccess.getDirectionAccess().getLEFTAssignment_2()); 
                    // InternalRoc.g:557:3: ( rule__Direction__LEFTAssignment_2 )
                    // InternalRoc.g:557:4: rule__Direction__LEFTAssignment_2
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
                    // InternalRoc.g:561:2: ( ( rule__Direction__RIGHTAssignment_3 ) )
                    {
                    // InternalRoc.g:561:2: ( ( rule__Direction__RIGHTAssignment_3 ) )
                    // InternalRoc.g:562:3: ( rule__Direction__RIGHTAssignment_3 )
                    {
                     before(grammarAccess.getDirectionAccess().getRIGHTAssignment_3()); 
                    // InternalRoc.g:563:3: ( rule__Direction__RIGHTAssignment_3 )
                    // InternalRoc.g:563:4: rule__Direction__RIGHTAssignment_3
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
    // InternalRoc.g:571:1: rule__Speed__Alternatives : ( ( ( rule__Speed__SLOWESTAssignment_0 ) ) | ( ( rule__Speed__SLOWAssignment_1 ) ) | ( ( rule__Speed__NORMALAssignment_2 ) ) | ( ( rule__Speed__FASTAssignment_3 ) ) | ( ( rule__Speed__FULLAssignment_4 ) ) );
    public final void rule__Speed__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:575:1: ( ( ( rule__Speed__SLOWESTAssignment_0 ) ) | ( ( rule__Speed__SLOWAssignment_1 ) ) | ( ( rule__Speed__NORMALAssignment_2 ) ) | ( ( rule__Speed__FASTAssignment_3 ) ) | ( ( rule__Speed__FULLAssignment_4 ) ) )
            int alt9=5;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt9=1;
                }
                break;
            case 36:
                {
                alt9=2;
                }
                break;
            case 37:
                {
                alt9=3;
                }
                break;
            case 38:
                {
                alt9=4;
                }
                break;
            case 39:
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
                    // InternalRoc.g:576:2: ( ( rule__Speed__SLOWESTAssignment_0 ) )
                    {
                    // InternalRoc.g:576:2: ( ( rule__Speed__SLOWESTAssignment_0 ) )
                    // InternalRoc.g:577:3: ( rule__Speed__SLOWESTAssignment_0 )
                    {
                     before(grammarAccess.getSpeedAccess().getSLOWESTAssignment_0()); 
                    // InternalRoc.g:578:3: ( rule__Speed__SLOWESTAssignment_0 )
                    // InternalRoc.g:578:4: rule__Speed__SLOWESTAssignment_0
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
                    // InternalRoc.g:582:2: ( ( rule__Speed__SLOWAssignment_1 ) )
                    {
                    // InternalRoc.g:582:2: ( ( rule__Speed__SLOWAssignment_1 ) )
                    // InternalRoc.g:583:3: ( rule__Speed__SLOWAssignment_1 )
                    {
                     before(grammarAccess.getSpeedAccess().getSLOWAssignment_1()); 
                    // InternalRoc.g:584:3: ( rule__Speed__SLOWAssignment_1 )
                    // InternalRoc.g:584:4: rule__Speed__SLOWAssignment_1
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
                    // InternalRoc.g:588:2: ( ( rule__Speed__NORMALAssignment_2 ) )
                    {
                    // InternalRoc.g:588:2: ( ( rule__Speed__NORMALAssignment_2 ) )
                    // InternalRoc.g:589:3: ( rule__Speed__NORMALAssignment_2 )
                    {
                     before(grammarAccess.getSpeedAccess().getNORMALAssignment_2()); 
                    // InternalRoc.g:590:3: ( rule__Speed__NORMALAssignment_2 )
                    // InternalRoc.g:590:4: rule__Speed__NORMALAssignment_2
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
                    // InternalRoc.g:594:2: ( ( rule__Speed__FASTAssignment_3 ) )
                    {
                    // InternalRoc.g:594:2: ( ( rule__Speed__FASTAssignment_3 ) )
                    // InternalRoc.g:595:3: ( rule__Speed__FASTAssignment_3 )
                    {
                     before(grammarAccess.getSpeedAccess().getFASTAssignment_3()); 
                    // InternalRoc.g:596:3: ( rule__Speed__FASTAssignment_3 )
                    // InternalRoc.g:596:4: rule__Speed__FASTAssignment_3
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
                    // InternalRoc.g:600:2: ( ( rule__Speed__FULLAssignment_4 ) )
                    {
                    // InternalRoc.g:600:2: ( ( rule__Speed__FULLAssignment_4 ) )
                    // InternalRoc.g:601:3: ( rule__Speed__FULLAssignment_4 )
                    {
                     before(grammarAccess.getSpeedAccess().getFULLAssignment_4()); 
                    // InternalRoc.g:602:3: ( rule__Speed__FULLAssignment_4 )
                    // InternalRoc.g:602:4: rule__Speed__FULLAssignment_4
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
    // InternalRoc.g:610:1: rule__Intensity__Alternatives : ( ( ( 'pronounced' ) ) | ( ( 'trace of' ) ) | ( ( 'slightly' ) ) | ( ( 'severe' ) ) | ( ( 'maximum' ) ) );
    public final void rule__Intensity__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:614:1: ( ( ( 'pronounced' ) ) | ( ( 'trace of' ) ) | ( ( 'slightly' ) ) | ( ( 'severe' ) ) | ( ( 'maximum' ) ) )
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
                    // InternalRoc.g:615:2: ( ( 'pronounced' ) )
                    {
                    // InternalRoc.g:615:2: ( ( 'pronounced' ) )
                    // InternalRoc.g:616:3: ( 'pronounced' )
                    {
                     before(grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0()); 
                    // InternalRoc.g:617:3: ( 'pronounced' )
                    // InternalRoc.g:617:4: 'pronounced'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:621:2: ( ( 'trace of' ) )
                    {
                    // InternalRoc.g:621:2: ( ( 'trace of' ) )
                    // InternalRoc.g:622:3: ( 'trace of' )
                    {
                     before(grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1()); 
                    // InternalRoc.g:623:3: ( 'trace of' )
                    // InternalRoc.g:623:4: 'trace of'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:627:2: ( ( 'slightly' ) )
                    {
                    // InternalRoc.g:627:2: ( ( 'slightly' ) )
                    // InternalRoc.g:628:3: ( 'slightly' )
                    {
                     before(grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2()); 
                    // InternalRoc.g:629:3: ( 'slightly' )
                    // InternalRoc.g:629:4: 'slightly'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalRoc.g:633:2: ( ( 'severe' ) )
                    {
                    // InternalRoc.g:633:2: ( ( 'severe' ) )
                    // InternalRoc.g:634:3: ( 'severe' )
                    {
                     before(grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3()); 
                    // InternalRoc.g:635:3: ( 'severe' )
                    // InternalRoc.g:635:4: 'severe'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalRoc.g:639:2: ( ( 'maximum' ) )
                    {
                    // InternalRoc.g:639:2: ( ( 'maximum' ) )
                    // InternalRoc.g:640:3: ( 'maximum' )
                    {
                     before(grammarAccess.getIntensityAccess().getEEnumLiteralDeclaration_4()); 
                    // InternalRoc.g:641:3: ( 'maximum' )
                    // InternalRoc.g:641:4: 'maximum'
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
    // InternalRoc.g:649:1: rule__DurationUnit__Alternatives : ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) );
    public final void rule__DurationUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:653:1: ( ( ( 'milliseconds' ) ) | ( ( 'seconds' ) ) | ( ( 'minutes' ) ) )
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
                    // InternalRoc.g:654:2: ( ( 'milliseconds' ) )
                    {
                    // InternalRoc.g:654:2: ( ( 'milliseconds' ) )
                    // InternalRoc.g:655:3: ( 'milliseconds' )
                    {
                     before(grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0()); 
                    // InternalRoc.g:656:3: ( 'milliseconds' )
                    // InternalRoc.g:656:4: 'milliseconds'
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:660:2: ( ( 'seconds' ) )
                    {
                    // InternalRoc.g:660:2: ( ( 'seconds' ) )
                    // InternalRoc.g:661:3: ( 'seconds' )
                    {
                     before(grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1()); 
                    // InternalRoc.g:662:3: ( 'seconds' )
                    // InternalRoc.g:662:4: 'seconds'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:666:2: ( ( 'minutes' ) )
                    {
                    // InternalRoc.g:666:2: ( ( 'minutes' ) )
                    // InternalRoc.g:667:3: ( 'minutes' )
                    {
                     before(grammarAccess.getDurationUnitAccess().getMINUTESEnumLiteralDeclaration_2()); 
                    // InternalRoc.g:668:3: ( 'minutes' )
                    // InternalRoc.g:668:4: 'minutes'
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
    // InternalRoc.g:676:1: rule__Movement__Group__0 : rule__Movement__Group__0__Impl rule__Movement__Group__1 ;
    public final void rule__Movement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:680:1: ( rule__Movement__Group__0__Impl rule__Movement__Group__1 )
            // InternalRoc.g:681:2: rule__Movement__Group__0__Impl rule__Movement__Group__1
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
    // InternalRoc.g:688:1: rule__Movement__Group__0__Impl : ( ( rule__Movement__MotionsAssignment_0 ) ) ;
    public final void rule__Movement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:692:1: ( ( ( rule__Movement__MotionsAssignment_0 ) ) )
            // InternalRoc.g:693:1: ( ( rule__Movement__MotionsAssignment_0 ) )
            {
            // InternalRoc.g:693:1: ( ( rule__Movement__MotionsAssignment_0 ) )
            // InternalRoc.g:694:2: ( rule__Movement__MotionsAssignment_0 )
            {
             before(grammarAccess.getMovementAccess().getMotionsAssignment_0()); 
            // InternalRoc.g:695:2: ( rule__Movement__MotionsAssignment_0 )
            // InternalRoc.g:695:3: rule__Movement__MotionsAssignment_0
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
    // InternalRoc.g:703:1: rule__Movement__Group__1 : rule__Movement__Group__1__Impl rule__Movement__Group__2 ;
    public final void rule__Movement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:707:1: ( rule__Movement__Group__1__Impl rule__Movement__Group__2 )
            // InternalRoc.g:708:2: rule__Movement__Group__1__Impl rule__Movement__Group__2
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
    // InternalRoc.g:715:1: rule__Movement__Group__1__Impl : ( ( rule__Movement__Group_1__0 )* ) ;
    public final void rule__Movement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:719:1: ( ( ( rule__Movement__Group_1__0 )* ) )
            // InternalRoc.g:720:1: ( ( rule__Movement__Group_1__0 )* )
            {
            // InternalRoc.g:720:1: ( ( rule__Movement__Group_1__0 )* )
            // InternalRoc.g:721:2: ( rule__Movement__Group_1__0 )*
            {
             before(grammarAccess.getMovementAccess().getGroup_1()); 
            // InternalRoc.g:722:2: ( rule__Movement__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalRoc.g:722:3: rule__Movement__Group_1__0
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
    // InternalRoc.g:730:1: rule__Movement__Group__2 : rule__Movement__Group__2__Impl ;
    public final void rule__Movement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:734:1: ( rule__Movement__Group__2__Impl )
            // InternalRoc.g:735:2: rule__Movement__Group__2__Impl
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
    // InternalRoc.g:741:1: rule__Movement__Group__2__Impl : ( RULE_PERIOD ) ;
    public final void rule__Movement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:745:1: ( ( RULE_PERIOD ) )
            // InternalRoc.g:746:1: ( RULE_PERIOD )
            {
            // InternalRoc.g:746:1: ( RULE_PERIOD )
            // InternalRoc.g:747:2: RULE_PERIOD
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
    // InternalRoc.g:757:1: rule__Movement__Group_1__0 : rule__Movement__Group_1__0__Impl rule__Movement__Group_1__1 ;
    public final void rule__Movement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:761:1: ( rule__Movement__Group_1__0__Impl rule__Movement__Group_1__1 )
            // InternalRoc.g:762:2: rule__Movement__Group_1__0__Impl rule__Movement__Group_1__1
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
    // InternalRoc.g:769:1: rule__Movement__Group_1__0__Impl : ( RULE_AND ) ;
    public final void rule__Movement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:773:1: ( ( RULE_AND ) )
            // InternalRoc.g:774:1: ( RULE_AND )
            {
            // InternalRoc.g:774:1: ( RULE_AND )
            // InternalRoc.g:775:2: RULE_AND
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
    // InternalRoc.g:784:1: rule__Movement__Group_1__1 : rule__Movement__Group_1__1__Impl ;
    public final void rule__Movement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:788:1: ( rule__Movement__Group_1__1__Impl )
            // InternalRoc.g:789:2: rule__Movement__Group_1__1__Impl
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
    // InternalRoc.g:795:1: rule__Movement__Group_1__1__Impl : ( ( rule__Movement__MotionsAssignment_1_1 ) ) ;
    public final void rule__Movement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:799:1: ( ( ( rule__Movement__MotionsAssignment_1_1 ) ) )
            // InternalRoc.g:800:1: ( ( rule__Movement__MotionsAssignment_1_1 ) )
            {
            // InternalRoc.g:800:1: ( ( rule__Movement__MotionsAssignment_1_1 ) )
            // InternalRoc.g:801:2: ( rule__Movement__MotionsAssignment_1_1 )
            {
             before(grammarAccess.getMovementAccess().getMotionsAssignment_1_1()); 
            // InternalRoc.g:802:2: ( rule__Movement__MotionsAssignment_1_1 )
            // InternalRoc.g:802:3: rule__Movement__MotionsAssignment_1_1
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
    // InternalRoc.g:811:1: rule__Motion__Group_0__0 : rule__Motion__Group_0__0__Impl rule__Motion__Group_0__1 ;
    public final void rule__Motion__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:815:1: ( rule__Motion__Group_0__0__Impl rule__Motion__Group_0__1 )
            // InternalRoc.g:816:2: rule__Motion__Group_0__0__Impl rule__Motion__Group_0__1
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
    // InternalRoc.g:823:1: rule__Motion__Group_0__0__Impl : ( ( rule__Motion__ActionAssignment_0_0 ) ) ;
    public final void rule__Motion__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:827:1: ( ( ( rule__Motion__ActionAssignment_0_0 ) ) )
            // InternalRoc.g:828:1: ( ( rule__Motion__ActionAssignment_0_0 ) )
            {
            // InternalRoc.g:828:1: ( ( rule__Motion__ActionAssignment_0_0 ) )
            // InternalRoc.g:829:2: ( rule__Motion__ActionAssignment_0_0 )
            {
             before(grammarAccess.getMotionAccess().getActionAssignment_0_0()); 
            // InternalRoc.g:830:2: ( rule__Motion__ActionAssignment_0_0 )
            // InternalRoc.g:830:3: rule__Motion__ActionAssignment_0_0
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
    // InternalRoc.g:838:1: rule__Motion__Group_0__1 : rule__Motion__Group_0__1__Impl rule__Motion__Group_0__2 ;
    public final void rule__Motion__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:842:1: ( rule__Motion__Group_0__1__Impl rule__Motion__Group_0__2 )
            // InternalRoc.g:843:2: rule__Motion__Group_0__1__Impl rule__Motion__Group_0__2
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
    // InternalRoc.g:850:1: rule__Motion__Group_0__1__Impl : ( RULE_FOR ) ;
    public final void rule__Motion__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:854:1: ( ( RULE_FOR ) )
            // InternalRoc.g:855:1: ( RULE_FOR )
            {
            // InternalRoc.g:855:1: ( RULE_FOR )
            // InternalRoc.g:856:2: RULE_FOR
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
    // InternalRoc.g:865:1: rule__Motion__Group_0__2 : rule__Motion__Group_0__2__Impl rule__Motion__Group_0__3 ;
    public final void rule__Motion__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:869:1: ( rule__Motion__Group_0__2__Impl rule__Motion__Group_0__3 )
            // InternalRoc.g:870:2: rule__Motion__Group_0__2__Impl rule__Motion__Group_0__3
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
    // InternalRoc.g:877:1: rule__Motion__Group_0__2__Impl : ( ( rule__Motion__DurationAssignment_0_2 ) ) ;
    public final void rule__Motion__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:881:1: ( ( ( rule__Motion__DurationAssignment_0_2 ) ) )
            // InternalRoc.g:882:1: ( ( rule__Motion__DurationAssignment_0_2 ) )
            {
            // InternalRoc.g:882:1: ( ( rule__Motion__DurationAssignment_0_2 ) )
            // InternalRoc.g:883:2: ( rule__Motion__DurationAssignment_0_2 )
            {
             before(grammarAccess.getMotionAccess().getDurationAssignment_0_2()); 
            // InternalRoc.g:884:2: ( rule__Motion__DurationAssignment_0_2 )
            // InternalRoc.g:884:3: rule__Motion__DurationAssignment_0_2
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
    // InternalRoc.g:892:1: rule__Motion__Group_0__3 : rule__Motion__Group_0__3__Impl ;
    public final void rule__Motion__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:896:1: ( rule__Motion__Group_0__3__Impl )
            // InternalRoc.g:897:2: rule__Motion__Group_0__3__Impl
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
    // InternalRoc.g:903:1: rule__Motion__Group_0__3__Impl : ( ( rule__Motion__DurationUnitAssignment_0_3 ) ) ;
    public final void rule__Motion__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:907:1: ( ( ( rule__Motion__DurationUnitAssignment_0_3 ) ) )
            // InternalRoc.g:908:1: ( ( rule__Motion__DurationUnitAssignment_0_3 ) )
            {
            // InternalRoc.g:908:1: ( ( rule__Motion__DurationUnitAssignment_0_3 ) )
            // InternalRoc.g:909:2: ( rule__Motion__DurationUnitAssignment_0_3 )
            {
             before(grammarAccess.getMotionAccess().getDurationUnitAssignment_0_3()); 
            // InternalRoc.g:910:2: ( rule__Motion__DurationUnitAssignment_0_3 )
            // InternalRoc.g:910:3: rule__Motion__DurationUnitAssignment_0_3
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
    // InternalRoc.g:919:1: rule__Motion__Group_1__0 : rule__Motion__Group_1__0__Impl rule__Motion__Group_1__1 ;
    public final void rule__Motion__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:923:1: ( rule__Motion__Group_1__0__Impl rule__Motion__Group_1__1 )
            // InternalRoc.g:924:2: rule__Motion__Group_1__0__Impl rule__Motion__Group_1__1
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
    // InternalRoc.g:931:1: rule__Motion__Group_1__0__Impl : ( ( rule__Motion__ActionAssignment_1_0 ) ) ;
    public final void rule__Motion__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:935:1: ( ( ( rule__Motion__ActionAssignment_1_0 ) ) )
            // InternalRoc.g:936:1: ( ( rule__Motion__ActionAssignment_1_0 ) )
            {
            // InternalRoc.g:936:1: ( ( rule__Motion__ActionAssignment_1_0 ) )
            // InternalRoc.g:937:2: ( rule__Motion__ActionAssignment_1_0 )
            {
             before(grammarAccess.getMotionAccess().getActionAssignment_1_0()); 
            // InternalRoc.g:938:2: ( rule__Motion__ActionAssignment_1_0 )
            // InternalRoc.g:938:3: rule__Motion__ActionAssignment_1_0
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
    // InternalRoc.g:946:1: rule__Motion__Group_1__1 : rule__Motion__Group_1__1__Impl rule__Motion__Group_1__2 ;
    public final void rule__Motion__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:950:1: ( rule__Motion__Group_1__1__Impl rule__Motion__Group_1__2 )
            // InternalRoc.g:951:2: rule__Motion__Group_1__1__Impl rule__Motion__Group_1__2
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
    // InternalRoc.g:958:1: rule__Motion__Group_1__1__Impl : ( RULE_WITH ) ;
    public final void rule__Motion__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:962:1: ( ( RULE_WITH ) )
            // InternalRoc.g:963:1: ( RULE_WITH )
            {
            // InternalRoc.g:963:1: ( RULE_WITH )
            // InternalRoc.g:964:2: RULE_WITH
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
    // InternalRoc.g:973:1: rule__Motion__Group_1__2 : rule__Motion__Group_1__2__Impl rule__Motion__Group_1__3 ;
    public final void rule__Motion__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:977:1: ( rule__Motion__Group_1__2__Impl rule__Motion__Group_1__3 )
            // InternalRoc.g:978:2: rule__Motion__Group_1__2__Impl rule__Motion__Group_1__3
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
    // InternalRoc.g:985:1: rule__Motion__Group_1__2__Impl : ( ( rule__Motion__SpeedAssignment_1_2 ) ) ;
    public final void rule__Motion__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:989:1: ( ( ( rule__Motion__SpeedAssignment_1_2 ) ) )
            // InternalRoc.g:990:1: ( ( rule__Motion__SpeedAssignment_1_2 ) )
            {
            // InternalRoc.g:990:1: ( ( rule__Motion__SpeedAssignment_1_2 ) )
            // InternalRoc.g:991:2: ( rule__Motion__SpeedAssignment_1_2 )
            {
             before(grammarAccess.getMotionAccess().getSpeedAssignment_1_2()); 
            // InternalRoc.g:992:2: ( rule__Motion__SpeedAssignment_1_2 )
            // InternalRoc.g:992:3: rule__Motion__SpeedAssignment_1_2
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
    // InternalRoc.g:1000:1: rule__Motion__Group_1__3 : rule__Motion__Group_1__3__Impl ;
    public final void rule__Motion__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1004:1: ( rule__Motion__Group_1__3__Impl )
            // InternalRoc.g:1005:2: rule__Motion__Group_1__3__Impl
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
    // InternalRoc.g:1011:1: rule__Motion__Group_1__3__Impl : ( RULE_SPEED_KEY ) ;
    public final void rule__Motion__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1015:1: ( ( RULE_SPEED_KEY ) )
            // InternalRoc.g:1016:1: ( RULE_SPEED_KEY )
            {
            // InternalRoc.g:1016:1: ( RULE_SPEED_KEY )
            // InternalRoc.g:1017:2: RULE_SPEED_KEY
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
    // InternalRoc.g:1027:1: rule__Action__Group_1__0 : rule__Action__Group_1__0__Impl rule__Action__Group_1__1 ;
    public final void rule__Action__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1031:1: ( rule__Action__Group_1__0__Impl rule__Action__Group_1__1 )
            // InternalRoc.g:1032:2: rule__Action__Group_1__0__Impl rule__Action__Group_1__1
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
    // InternalRoc.g:1039:1: rule__Action__Group_1__0__Impl : ( ( rule__Action__IntensityAssignment_1_0 )? ) ;
    public final void rule__Action__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1043:1: ( ( ( rule__Action__IntensityAssignment_1_0 )? ) )
            // InternalRoc.g:1044:1: ( ( rule__Action__IntensityAssignment_1_0 )? )
            {
            // InternalRoc.g:1044:1: ( ( rule__Action__IntensityAssignment_1_0 )? )
            // InternalRoc.g:1045:2: ( rule__Action__IntensityAssignment_1_0 )?
            {
             before(grammarAccess.getActionAccess().getIntensityAssignment_1_0()); 
            // InternalRoc.g:1046:2: ( rule__Action__IntensityAssignment_1_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=17 && LA13_0<=21)) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalRoc.g:1046:3: rule__Action__IntensityAssignment_1_0
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
    // InternalRoc.g:1054:1: rule__Action__Group_1__1 : rule__Action__Group_1__1__Impl ;
    public final void rule__Action__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1058:1: ( rule__Action__Group_1__1__Impl )
            // InternalRoc.g:1059:2: rule__Action__Group_1__1__Impl
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
    // InternalRoc.g:1065:1: rule__Action__Group_1__1__Impl : ( ( rule__Action__ActionHolderAssignment_1_1 ) ) ;
    public final void rule__Action__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1069:1: ( ( ( rule__Action__ActionHolderAssignment_1_1 ) ) )
            // InternalRoc.g:1070:1: ( ( rule__Action__ActionHolderAssignment_1_1 ) )
            {
            // InternalRoc.g:1070:1: ( ( rule__Action__ActionHolderAssignment_1_1 ) )
            // InternalRoc.g:1071:2: ( rule__Action__ActionHolderAssignment_1_1 )
            {
             before(grammarAccess.getActionAccess().getActionHolderAssignment_1_1()); 
            // InternalRoc.g:1072:2: ( rule__Action__ActionHolderAssignment_1_1 )
            // InternalRoc.g:1072:3: rule__Action__ActionHolderAssignment_1_1
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
    // InternalRoc.g:1081:1: rule__Action__Group_2__0 : rule__Action__Group_2__0__Impl rule__Action__Group_2__1 ;
    public final void rule__Action__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1085:1: ( rule__Action__Group_2__0__Impl rule__Action__Group_2__1 )
            // InternalRoc.g:1086:2: rule__Action__Group_2__0__Impl rule__Action__Group_2__1
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
    // InternalRoc.g:1093:1: rule__Action__Group_2__0__Impl : ( ( rule__Action__IntensityAssignment_2_0 )? ) ;
    public final void rule__Action__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1097:1: ( ( ( rule__Action__IntensityAssignment_2_0 )? ) )
            // InternalRoc.g:1098:1: ( ( rule__Action__IntensityAssignment_2_0 )? )
            {
            // InternalRoc.g:1098:1: ( ( rule__Action__IntensityAssignment_2_0 )? )
            // InternalRoc.g:1099:2: ( rule__Action__IntensityAssignment_2_0 )?
            {
             before(grammarAccess.getActionAccess().getIntensityAssignment_2_0()); 
            // InternalRoc.g:1100:2: ( rule__Action__IntensityAssignment_2_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( ((LA14_0>=17 && LA14_0<=21)) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalRoc.g:1100:3: rule__Action__IntensityAssignment_2_0
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
    // InternalRoc.g:1108:1: rule__Action__Group_2__1 : rule__Action__Group_2__1__Impl ;
    public final void rule__Action__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1112:1: ( rule__Action__Group_2__1__Impl )
            // InternalRoc.g:1113:2: rule__Action__Group_2__1__Impl
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
    // InternalRoc.g:1119:1: rule__Action__Group_2__1__Impl : ( ( rule__Action__ActionHolderAssignment_2_1 ) ) ;
    public final void rule__Action__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1123:1: ( ( ( rule__Action__ActionHolderAssignment_2_1 ) ) )
            // InternalRoc.g:1124:1: ( ( rule__Action__ActionHolderAssignment_2_1 ) )
            {
            // InternalRoc.g:1124:1: ( ( rule__Action__ActionHolderAssignment_2_1 ) )
            // InternalRoc.g:1125:2: ( rule__Action__ActionHolderAssignment_2_1 )
            {
             before(grammarAccess.getActionAccess().getActionHolderAssignment_2_1()); 
            // InternalRoc.g:1126:2: ( rule__Action__ActionHolderAssignment_2_1 )
            // InternalRoc.g:1126:3: rule__Action__ActionHolderAssignment_2_1
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


    // $ANTLR start "rule__DirectedAction__Group_0__0"
    // InternalRoc.g:1135:1: rule__DirectedAction__Group_0__0 : rule__DirectedAction__Group_0__0__Impl rule__DirectedAction__Group_0__1 ;
    public final void rule__DirectedAction__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1139:1: ( rule__DirectedAction__Group_0__0__Impl rule__DirectedAction__Group_0__1 )
            // InternalRoc.g:1140:2: rule__DirectedAction__Group_0__0__Impl rule__DirectedAction__Group_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalRoc.g:1147:1: rule__DirectedAction__Group_0__0__Impl : ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) ) ;
    public final void rule__DirectedAction__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1151:1: ( ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) ) )
            // InternalRoc.g:1152:1: ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) )
            {
            // InternalRoc.g:1152:1: ( ( rule__DirectedAction__ActionNameAssignment_0_0 ) )
            // InternalRoc.g:1153:2: ( rule__DirectedAction__ActionNameAssignment_0_0 )
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameAssignment_0_0()); 
            // InternalRoc.g:1154:2: ( rule__DirectedAction__ActionNameAssignment_0_0 )
            // InternalRoc.g:1154:3: rule__DirectedAction__ActionNameAssignment_0_0
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
    // InternalRoc.g:1162:1: rule__DirectedAction__Group_0__1 : rule__DirectedAction__Group_0__1__Impl ;
    public final void rule__DirectedAction__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1166:1: ( rule__DirectedAction__Group_0__1__Impl )
            // InternalRoc.g:1167:2: rule__DirectedAction__Group_0__1__Impl
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
    // InternalRoc.g:1173:1: rule__DirectedAction__Group_0__1__Impl : ( ( rule__DirectedAction__DirectionAssignment_0_1 ) ) ;
    public final void rule__DirectedAction__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1177:1: ( ( ( rule__DirectedAction__DirectionAssignment_0_1 ) ) )
            // InternalRoc.g:1178:1: ( ( rule__DirectedAction__DirectionAssignment_0_1 ) )
            {
            // InternalRoc.g:1178:1: ( ( rule__DirectedAction__DirectionAssignment_0_1 ) )
            // InternalRoc.g:1179:2: ( rule__DirectedAction__DirectionAssignment_0_1 )
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionAssignment_0_1()); 
            // InternalRoc.g:1180:2: ( rule__DirectedAction__DirectionAssignment_0_1 )
            // InternalRoc.g:1180:3: rule__DirectedAction__DirectionAssignment_0_1
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
    // InternalRoc.g:1189:1: rule__DirectedAction__Group_1__0 : rule__DirectedAction__Group_1__0__Impl rule__DirectedAction__Group_1__1 ;
    public final void rule__DirectedAction__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1193:1: ( rule__DirectedAction__Group_1__0__Impl rule__DirectedAction__Group_1__1 )
            // InternalRoc.g:1194:2: rule__DirectedAction__Group_1__0__Impl rule__DirectedAction__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalRoc.g:1201:1: rule__DirectedAction__Group_1__0__Impl : ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) ) ;
    public final void rule__DirectedAction__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1205:1: ( ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) ) )
            // InternalRoc.g:1206:1: ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) )
            {
            // InternalRoc.g:1206:1: ( ( rule__DirectedAction__ActionNameAssignment_1_0 ) )
            // InternalRoc.g:1207:2: ( rule__DirectedAction__ActionNameAssignment_1_0 )
            {
             before(grammarAccess.getDirectedActionAccess().getActionNameAssignment_1_0()); 
            // InternalRoc.g:1208:2: ( rule__DirectedAction__ActionNameAssignment_1_0 )
            // InternalRoc.g:1208:3: rule__DirectedAction__ActionNameAssignment_1_0
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
    // InternalRoc.g:1216:1: rule__DirectedAction__Group_1__1 : rule__DirectedAction__Group_1__1__Impl ;
    public final void rule__DirectedAction__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1220:1: ( rule__DirectedAction__Group_1__1__Impl )
            // InternalRoc.g:1221:2: rule__DirectedAction__Group_1__1__Impl
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
    // InternalRoc.g:1227:1: rule__DirectedAction__Group_1__1__Impl : ( ( rule__DirectedAction__DirectionAssignment_1_1 ) ) ;
    public final void rule__DirectedAction__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1231:1: ( ( ( rule__DirectedAction__DirectionAssignment_1_1 ) ) )
            // InternalRoc.g:1232:1: ( ( rule__DirectedAction__DirectionAssignment_1_1 ) )
            {
            // InternalRoc.g:1232:1: ( ( rule__DirectedAction__DirectionAssignment_1_1 ) )
            // InternalRoc.g:1233:2: ( rule__DirectedAction__DirectionAssignment_1_1 )
            {
             before(grammarAccess.getDirectedActionAccess().getDirectionAssignment_1_1()); 
            // InternalRoc.g:1234:2: ( rule__DirectedAction__DirectionAssignment_1_1 )
            // InternalRoc.g:1234:3: rule__DirectedAction__DirectionAssignment_1_1
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


    // $ANTLR start "rule__Program__MovementsAssignment"
    // InternalRoc.g:1243:1: rule__Program__MovementsAssignment : ( ruleMovement ) ;
    public final void rule__Program__MovementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1247:1: ( ( ruleMovement ) )
            // InternalRoc.g:1248:2: ( ruleMovement )
            {
            // InternalRoc.g:1248:2: ( ruleMovement )
            // InternalRoc.g:1249:3: ruleMovement
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
    // InternalRoc.g:1258:1: rule__Movement__MotionsAssignment_0 : ( ruleMotion ) ;
    public final void rule__Movement__MotionsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1262:1: ( ( ruleMotion ) )
            // InternalRoc.g:1263:2: ( ruleMotion )
            {
            // InternalRoc.g:1263:2: ( ruleMotion )
            // InternalRoc.g:1264:3: ruleMotion
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
    // InternalRoc.g:1273:1: rule__Movement__MotionsAssignment_1_1 : ( ruleMotion ) ;
    public final void rule__Movement__MotionsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1277:1: ( ( ruleMotion ) )
            // InternalRoc.g:1278:2: ( ruleMotion )
            {
            // InternalRoc.g:1278:2: ( ruleMotion )
            // InternalRoc.g:1279:3: ruleMotion
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
    // InternalRoc.g:1288:1: rule__Motion__ActionAssignment_0_0 : ( ruleAction ) ;
    public final void rule__Motion__ActionAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1292:1: ( ( ruleAction ) )
            // InternalRoc.g:1293:2: ( ruleAction )
            {
            // InternalRoc.g:1293:2: ( ruleAction )
            // InternalRoc.g:1294:3: ruleAction
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
    // InternalRoc.g:1303:1: rule__Motion__DurationAssignment_0_2 : ( RULE_DURATION ) ;
    public final void rule__Motion__DurationAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1307:1: ( ( RULE_DURATION ) )
            // InternalRoc.g:1308:2: ( RULE_DURATION )
            {
            // InternalRoc.g:1308:2: ( RULE_DURATION )
            // InternalRoc.g:1309:3: RULE_DURATION
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
    // InternalRoc.g:1318:1: rule__Motion__DurationUnitAssignment_0_3 : ( ruleDurationUnit ) ;
    public final void rule__Motion__DurationUnitAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1322:1: ( ( ruleDurationUnit ) )
            // InternalRoc.g:1323:2: ( ruleDurationUnit )
            {
            // InternalRoc.g:1323:2: ( ruleDurationUnit )
            // InternalRoc.g:1324:3: ruleDurationUnit
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
    // InternalRoc.g:1333:1: rule__Motion__ActionAssignment_1_0 : ( ruleAction ) ;
    public final void rule__Motion__ActionAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1337:1: ( ( ruleAction ) )
            // InternalRoc.g:1338:2: ( ruleAction )
            {
            // InternalRoc.g:1338:2: ( ruleAction )
            // InternalRoc.g:1339:3: ruleAction
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
    // InternalRoc.g:1348:1: rule__Motion__SpeedAssignment_1_2 : ( ruleSpeed ) ;
    public final void rule__Motion__SpeedAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1352:1: ( ( ruleSpeed ) )
            // InternalRoc.g:1353:2: ( ruleSpeed )
            {
            // InternalRoc.g:1353:2: ( ruleSpeed )
            // InternalRoc.g:1354:3: ruleSpeed
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


    // $ANTLR start "rule__Motion__ActionAssignment_2"
    // InternalRoc.g:1363:1: rule__Motion__ActionAssignment_2 : ( ruleAction ) ;
    public final void rule__Motion__ActionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1367:1: ( ( ruleAction ) )
            // InternalRoc.g:1368:2: ( ruleAction )
            {
            // InternalRoc.g:1368:2: ( ruleAction )
            // InternalRoc.g:1369:3: ruleAction
            {
             before(grammarAccess.getMotionAccess().getActionActionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getMotionAccess().getActionActionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Motion__ActionAssignment_2"


    // $ANTLR start "rule__Action__ActionHolderAssignment_0"
    // InternalRoc.g:1378:1: rule__Action__ActionHolderAssignment_0 : ( ruleCompleteAction ) ;
    public final void rule__Action__ActionHolderAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1382:1: ( ( ruleCompleteAction ) )
            // InternalRoc.g:1383:2: ( ruleCompleteAction )
            {
            // InternalRoc.g:1383:2: ( ruleCompleteAction )
            // InternalRoc.g:1384:3: ruleCompleteAction
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
    // InternalRoc.g:1393:1: rule__Action__IntensityAssignment_1_0 : ( ruleIntensity ) ;
    public final void rule__Action__IntensityAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1397:1: ( ( ruleIntensity ) )
            // InternalRoc.g:1398:2: ( ruleIntensity )
            {
            // InternalRoc.g:1398:2: ( ruleIntensity )
            // InternalRoc.g:1399:3: ruleIntensity
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
    // InternalRoc.g:1408:1: rule__Action__ActionHolderAssignment_1_1 : ( ruleSingleAction ) ;
    public final void rule__Action__ActionHolderAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1412:1: ( ( ruleSingleAction ) )
            // InternalRoc.g:1413:2: ( ruleSingleAction )
            {
            // InternalRoc.g:1413:2: ( ruleSingleAction )
            // InternalRoc.g:1414:3: ruleSingleAction
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
    // InternalRoc.g:1423:1: rule__Action__IntensityAssignment_2_0 : ( ruleIntensity ) ;
    public final void rule__Action__IntensityAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1427:1: ( ( ruleIntensity ) )
            // InternalRoc.g:1428:2: ( ruleIntensity )
            {
            // InternalRoc.g:1428:2: ( ruleIntensity )
            // InternalRoc.g:1429:3: ruleIntensity
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
    // InternalRoc.g:1438:1: rule__Action__ActionHolderAssignment_2_1 : ( ruleDirectedAction ) ;
    public final void rule__Action__ActionHolderAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1442:1: ( ( ruleDirectedAction ) )
            // InternalRoc.g:1443:2: ( ruleDirectedAction )
            {
            // InternalRoc.g:1443:2: ( ruleDirectedAction )
            // InternalRoc.g:1444:3: ruleDirectedAction
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


    // $ANTLR start "rule__CompleteAction__ActionNameAssignment"
    // InternalRoc.g:1453:1: rule__CompleteAction__ActionNameAssignment : ( ( 'neutral face' ) ) ;
    public final void rule__CompleteAction__ActionNameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1457:1: ( ( ( 'neutral face' ) ) )
            // InternalRoc.g:1458:2: ( ( 'neutral face' ) )
            {
            // InternalRoc.g:1458:2: ( ( 'neutral face' ) )
            // InternalRoc.g:1459:3: ( 'neutral face' )
            {
             before(grammarAccess.getCompleteActionAccess().getActionNameNeutralFaceKeyword_0()); 
            // InternalRoc.g:1460:3: ( 'neutral face' )
            // InternalRoc.g:1461:4: 'neutral face'
            {
             before(grammarAccess.getCompleteActionAccess().getActionNameNeutralFaceKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCompleteActionAccess().getActionNameNeutralFaceKeyword_0()); 

            }

             after(grammarAccess.getCompleteActionAccess().getActionNameNeutralFaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__CompleteAction__ActionNameAssignment"


    // $ANTLR start "rule__SingleAction__ActionNameAssignment_0"
    // InternalRoc.g:1472:1: rule__SingleAction__ActionNameAssignment_0 : ( ( 'drop jaw' ) ) ;
    public final void rule__SingleAction__ActionNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1476:1: ( ( ( 'drop jaw' ) ) )
            // InternalRoc.g:1477:2: ( ( 'drop jaw' ) )
            {
            // InternalRoc.g:1477:2: ( ( 'drop jaw' ) )
            // InternalRoc.g:1478:3: ( 'drop jaw' )
            {
             before(grammarAccess.getSingleActionAccess().getActionNameDropJawKeyword_0_0()); 
            // InternalRoc.g:1479:3: ( 'drop jaw' )
            // InternalRoc.g:1480:4: 'drop jaw'
            {
             before(grammarAccess.getSingleActionAccess().getActionNameDropJawKeyword_0_0()); 
            match(input,26,FOLLOW_2); 
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
    // InternalRoc.g:1491:1: rule__SingleAction__ActionNameAssignment_1 : ( ( 'nod head' ) ) ;
    public final void rule__SingleAction__ActionNameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1495:1: ( ( ( 'nod head' ) ) )
            // InternalRoc.g:1496:2: ( ( 'nod head' ) )
            {
            // InternalRoc.g:1496:2: ( ( 'nod head' ) )
            // InternalRoc.g:1497:3: ( 'nod head' )
            {
             before(grammarAccess.getSingleActionAccess().getActionNameNodHeadKeyword_1_0()); 
            // InternalRoc.g:1498:3: ( 'nod head' )
            // InternalRoc.g:1499:4: 'nod head'
            {
             before(grammarAccess.getSingleActionAccess().getActionNameNodHeadKeyword_1_0()); 
            match(input,27,FOLLOW_2); 
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
    // InternalRoc.g:1510:1: rule__DirectedAction__ActionNameAssignment_0_0 : ( ruleLeftRightDirectedAction ) ;
    public final void rule__DirectedAction__ActionNameAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1514:1: ( ( ruleLeftRightDirectedAction ) )
            // InternalRoc.g:1515:2: ( ruleLeftRightDirectedAction )
            {
            // InternalRoc.g:1515:2: ( ruleLeftRightDirectedAction )
            // InternalRoc.g:1516:3: ruleLeftRightDirectedAction
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
    // InternalRoc.g:1525:1: rule__DirectedAction__DirectionAssignment_0_1 : ( ruleLeftRightDirection ) ;
    public final void rule__DirectedAction__DirectionAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1529:1: ( ( ruleLeftRightDirection ) )
            // InternalRoc.g:1530:2: ( ruleLeftRightDirection )
            {
            // InternalRoc.g:1530:2: ( ruleLeftRightDirection )
            // InternalRoc.g:1531:3: ruleLeftRightDirection
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
    // InternalRoc.g:1540:1: rule__DirectedAction__ActionNameAssignment_1_0 : ( ruleFullDirectedAction ) ;
    public final void rule__DirectedAction__ActionNameAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1544:1: ( ( ruleFullDirectedAction ) )
            // InternalRoc.g:1545:2: ( ruleFullDirectedAction )
            {
            // InternalRoc.g:1545:2: ( ruleFullDirectedAction )
            // InternalRoc.g:1546:3: ruleFullDirectedAction
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
    // InternalRoc.g:1555:1: rule__DirectedAction__DirectionAssignment_1_1 : ( ruleDirection ) ;
    public final void rule__DirectedAction__DirectionAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1559:1: ( ( ruleDirection ) )
            // InternalRoc.g:1560:2: ( ruleDirection )
            {
            // InternalRoc.g:1560:2: ( ruleDirection )
            // InternalRoc.g:1561:3: ruleDirection
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


    // $ANTLR start "rule__LeftRightDirectedAction__TiltHeadAssignment"
    // InternalRoc.g:1570:1: rule__LeftRightDirectedAction__TiltHeadAssignment : ( ( 'tilt head' ) ) ;
    public final void rule__LeftRightDirectedAction__TiltHeadAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1574:1: ( ( ( 'tilt head' ) ) )
            // InternalRoc.g:1575:2: ( ( 'tilt head' ) )
            {
            // InternalRoc.g:1575:2: ( ( 'tilt head' ) )
            // InternalRoc.g:1576:3: ( 'tilt head' )
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltHeadKeyword_0()); 
            // InternalRoc.g:1577:3: ( 'tilt head' )
            // InternalRoc.g:1578:4: 'tilt head'
            {
             before(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltHeadKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltHeadKeyword_0()); 

            }

             after(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltHeadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LeftRightDirectedAction__TiltHeadAssignment"


    // $ANTLR start "rule__LeftRightDirection__LeftAssignment_0"
    // InternalRoc.g:1589:1: rule__LeftRightDirection__LeftAssignment_0 : ( ( 'left' ) ) ;
    public final void rule__LeftRightDirection__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1593:1: ( ( ( 'left' ) ) )
            // InternalRoc.g:1594:2: ( ( 'left' ) )
            {
            // InternalRoc.g:1594:2: ( ( 'left' ) )
            // InternalRoc.g:1595:3: ( 'left' )
            {
             before(grammarAccess.getLeftRightDirectionAccess().getLeftLeftKeyword_0_0()); 
            // InternalRoc.g:1596:3: ( 'left' )
            // InternalRoc.g:1597:4: 'left'
            {
             before(grammarAccess.getLeftRightDirectionAccess().getLeftLeftKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRoc.g:1608:1: rule__LeftRightDirection__RightAssignment_1 : ( ( 'right' ) ) ;
    public final void rule__LeftRightDirection__RightAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1612:1: ( ( ( 'right' ) ) )
            // InternalRoc.g:1613:2: ( ( 'right' ) )
            {
            // InternalRoc.g:1613:2: ( ( 'right' ) )
            // InternalRoc.g:1614:3: ( 'right' )
            {
             before(grammarAccess.getLeftRightDirectionAccess().getRightRightKeyword_1_0()); 
            // InternalRoc.g:1615:3: ( 'right' )
            // InternalRoc.g:1616:4: 'right'
            {
             before(grammarAccess.getLeftRightDirectionAccess().getRightRightKeyword_1_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRoc.g:1627:1: rule__FullDirectedAction__TurnHeadAssignment_0 : ( ( 'turn head' ) ) ;
    public final void rule__FullDirectedAction__TurnHeadAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1631:1: ( ( ( 'turn head' ) ) )
            // InternalRoc.g:1632:2: ( ( 'turn head' ) )
            {
            // InternalRoc.g:1632:2: ( ( 'turn head' ) )
            // InternalRoc.g:1633:3: ( 'turn head' )
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnHeadKeyword_0_0()); 
            // InternalRoc.g:1634:3: ( 'turn head' )
            // InternalRoc.g:1635:4: 'turn head'
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnHeadKeyword_0_0()); 
            match(input,31,FOLLOW_2); 
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
    // InternalRoc.g:1646:1: rule__FullDirectedAction__TurnEyesAssignment_1 : ( ( 'turn eyes' ) ) ;
    public final void rule__FullDirectedAction__TurnEyesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1650:1: ( ( ( 'turn eyes' ) ) )
            // InternalRoc.g:1651:2: ( ( 'turn eyes' ) )
            {
            // InternalRoc.g:1651:2: ( ( 'turn eyes' ) )
            // InternalRoc.g:1652:3: ( 'turn eyes' )
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnEyesKeyword_1_0()); 
            // InternalRoc.g:1653:3: ( 'turn eyes' )
            // InternalRoc.g:1654:4: 'turn eyes'
            {
             before(grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnEyesKeyword_1_0()); 
            match(input,32,FOLLOW_2); 
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
    // InternalRoc.g:1665:1: rule__Direction__UPAssignment_0 : ( ( 'up' ) ) ;
    public final void rule__Direction__UPAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1669:1: ( ( ( 'up' ) ) )
            // InternalRoc.g:1670:2: ( ( 'up' ) )
            {
            // InternalRoc.g:1670:2: ( ( 'up' ) )
            // InternalRoc.g:1671:3: ( 'up' )
            {
             before(grammarAccess.getDirectionAccess().getUPUpKeyword_0_0()); 
            // InternalRoc.g:1672:3: ( 'up' )
            // InternalRoc.g:1673:4: 'up'
            {
             before(grammarAccess.getDirectionAccess().getUPUpKeyword_0_0()); 
            match(input,33,FOLLOW_2); 
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
    // InternalRoc.g:1684:1: rule__Direction__DOWNAssignment_1 : ( ( 'down' ) ) ;
    public final void rule__Direction__DOWNAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1688:1: ( ( ( 'down' ) ) )
            // InternalRoc.g:1689:2: ( ( 'down' ) )
            {
            // InternalRoc.g:1689:2: ( ( 'down' ) )
            // InternalRoc.g:1690:3: ( 'down' )
            {
             before(grammarAccess.getDirectionAccess().getDOWNDownKeyword_1_0()); 
            // InternalRoc.g:1691:3: ( 'down' )
            // InternalRoc.g:1692:4: 'down'
            {
             before(grammarAccess.getDirectionAccess().getDOWNDownKeyword_1_0()); 
            match(input,34,FOLLOW_2); 
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
    // InternalRoc.g:1703:1: rule__Direction__LEFTAssignment_2 : ( ( 'left' ) ) ;
    public final void rule__Direction__LEFTAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1707:1: ( ( ( 'left' ) ) )
            // InternalRoc.g:1708:2: ( ( 'left' ) )
            {
            // InternalRoc.g:1708:2: ( ( 'left' ) )
            // InternalRoc.g:1709:3: ( 'left' )
            {
             before(grammarAccess.getDirectionAccess().getLEFTLeftKeyword_2_0()); 
            // InternalRoc.g:1710:3: ( 'left' )
            // InternalRoc.g:1711:4: 'left'
            {
             before(grammarAccess.getDirectionAccess().getLEFTLeftKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
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
    // InternalRoc.g:1722:1: rule__Direction__RIGHTAssignment_3 : ( ( 'right' ) ) ;
    public final void rule__Direction__RIGHTAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1726:1: ( ( ( 'right' ) ) )
            // InternalRoc.g:1727:2: ( ( 'right' ) )
            {
            // InternalRoc.g:1727:2: ( ( 'right' ) )
            // InternalRoc.g:1728:3: ( 'right' )
            {
             before(grammarAccess.getDirectionAccess().getRIGHTRightKeyword_3_0()); 
            // InternalRoc.g:1729:3: ( 'right' )
            // InternalRoc.g:1730:4: 'right'
            {
             before(grammarAccess.getDirectionAccess().getRIGHTRightKeyword_3_0()); 
            match(input,30,FOLLOW_2); 
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
    // InternalRoc.g:1741:1: rule__Speed__SLOWESTAssignment_0 : ( ( 'slowest' ) ) ;
    public final void rule__Speed__SLOWESTAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1745:1: ( ( ( 'slowest' ) ) )
            // InternalRoc.g:1746:2: ( ( 'slowest' ) )
            {
            // InternalRoc.g:1746:2: ( ( 'slowest' ) )
            // InternalRoc.g:1747:3: ( 'slowest' )
            {
             before(grammarAccess.getSpeedAccess().getSLOWESTSlowestKeyword_0_0()); 
            // InternalRoc.g:1748:3: ( 'slowest' )
            // InternalRoc.g:1749:4: 'slowest'
            {
             before(grammarAccess.getSpeedAccess().getSLOWESTSlowestKeyword_0_0()); 
            match(input,35,FOLLOW_2); 
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
    // InternalRoc.g:1760:1: rule__Speed__SLOWAssignment_1 : ( ( 'slow' ) ) ;
    public final void rule__Speed__SLOWAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1764:1: ( ( ( 'slow' ) ) )
            // InternalRoc.g:1765:2: ( ( 'slow' ) )
            {
            // InternalRoc.g:1765:2: ( ( 'slow' ) )
            // InternalRoc.g:1766:3: ( 'slow' )
            {
             before(grammarAccess.getSpeedAccess().getSLOWSlowKeyword_1_0()); 
            // InternalRoc.g:1767:3: ( 'slow' )
            // InternalRoc.g:1768:4: 'slow'
            {
             before(grammarAccess.getSpeedAccess().getSLOWSlowKeyword_1_0()); 
            match(input,36,FOLLOW_2); 
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
    // InternalRoc.g:1779:1: rule__Speed__NORMALAssignment_2 : ( ( 'normal' ) ) ;
    public final void rule__Speed__NORMALAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1783:1: ( ( ( 'normal' ) ) )
            // InternalRoc.g:1784:2: ( ( 'normal' ) )
            {
            // InternalRoc.g:1784:2: ( ( 'normal' ) )
            // InternalRoc.g:1785:3: ( 'normal' )
            {
             before(grammarAccess.getSpeedAccess().getNORMALNormalKeyword_2_0()); 
            // InternalRoc.g:1786:3: ( 'normal' )
            // InternalRoc.g:1787:4: 'normal'
            {
             before(grammarAccess.getSpeedAccess().getNORMALNormalKeyword_2_0()); 
            match(input,37,FOLLOW_2); 
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
    // InternalRoc.g:1798:1: rule__Speed__FASTAssignment_3 : ( ( 'fast' ) ) ;
    public final void rule__Speed__FASTAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1802:1: ( ( ( 'fast' ) ) )
            // InternalRoc.g:1803:2: ( ( 'fast' ) )
            {
            // InternalRoc.g:1803:2: ( ( 'fast' ) )
            // InternalRoc.g:1804:3: ( 'fast' )
            {
             before(grammarAccess.getSpeedAccess().getFASTFastKeyword_3_0()); 
            // InternalRoc.g:1805:3: ( 'fast' )
            // InternalRoc.g:1806:4: 'fast'
            {
             before(grammarAccess.getSpeedAccess().getFASTFastKeyword_3_0()); 
            match(input,38,FOLLOW_2); 
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
    // InternalRoc.g:1817:1: rule__Speed__FULLAssignment_4 : ( ( 'full' ) ) ;
    public final void rule__Speed__FULLAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalRoc.g:1821:1: ( ( ( 'full' ) ) )
            // InternalRoc.g:1822:2: ( ( 'full' ) )
            {
            // InternalRoc.g:1822:2: ( ( 'full' ) )
            // InternalRoc.g:1823:3: ( 'full' )
            {
             before(grammarAccess.getSpeedAccess().getFULLFullKeyword_4_0()); 
            // InternalRoc.g:1824:3: ( 'full' )
            // InternalRoc.g:1825:4: 'full'
            {
             before(grammarAccess.getSpeedAccess().getFULLFullKeyword_4_0()); 
            match(input,39,FOLLOW_2); 
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
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\uffff\1\16\5\uffff\2\16\6\uffff\6\16";
    static final String dfa_3s = "\1\21\1\4\5\32\2\4\3\35\3\uffff\6\4";
    static final String dfa_4s = "\1\40\1\7\5\40\2\7\1\36\2\42\3\uffff\6\7";
    static final String dfa_5s = "\14\uffff\1\2\1\1\1\3\6\uffff";
    static final String dfa_6s = "\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\3\1\4\1\5\1\6\3\uffff\1\1\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\2\16\1\15\1\14",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\2\16\1\15\1\14",
            "\2\16\1\15\1\14",
            "\1\17\1\20",
            "\1\23\1\24\2\uffff\1\21\1\22",
            "\1\23\1\24\2\uffff\1\21\1\22",
            "",
            "",
            "",
            "\2\16\1\15\1\14",
            "\2\16\1\15\1\14",
            "\2\16\1\15\1\14",
            "\2\16\1\15\1\14",
            "\2\16\1\15\1\14",
            "\2\16\1\15\1\14"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "400:1: rule__Motion__Alternatives : ( ( ( rule__Motion__Group_0__0 ) ) | ( ( rule__Motion__Group_1__0 ) ) | ( ( rule__Motion__ActionAssignment_2 ) ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x000000019E3E0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000019E3E0000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001C00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000F800000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000C3E0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000060000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000660000000L});

}