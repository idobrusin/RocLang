package robot.control.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import robot.control.services.RocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_AND", "RULE_PERIOD", "RULE_FOR", "RULE_DURATION", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'neutral'", "'face'", "'drop jaw'", "'nod Head'", "'tilt'", "'head'", "'left'", "'right'", "'back'", "'forth'", "'turn'", "'eyes'", "'up'", "'down'", "'pronounced'", "'trace of'", "'slightly'", "'severe'", "'maximum'", "'milliseconds'", "'seconds'", "'minutes'"
    };
    public static final int RULE_DURATION=7;
    public static final int RULE_STRING=10;
    public static final int RULE_AND=4;
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
    public static final int RULE_PERIOD=5;
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

        public InternalRocParser(TokenStream input, RocGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected RocGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalRoc.g:65:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalRoc.g:67:2: (iv_ruleProgram= ruleProgram EOF )
            // InternalRoc.g:68:2: iv_ruleProgram= ruleProgram EOF
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalRoc.g:77:1: ruleProgram returns [EObject current=null] : ( (lv_movements_0_0= ruleMovement ) )* ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        EObject lv_movements_0_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalRoc.g:84:2: ( ( (lv_movements_0_0= ruleMovement ) )* )
            // InternalRoc.g:85:2: ( (lv_movements_0_0= ruleMovement ) )*
            {
            // InternalRoc.g:85:2: ( (lv_movements_0_0= ruleMovement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=17 && LA1_0<=20)||LA1_0==25||(LA1_0>=29 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalRoc.g:86:3: (lv_movements_0_0= ruleMovement )
            	    {
            	    // InternalRoc.g:86:3: (lv_movements_0_0= ruleMovement )
            	    // InternalRoc.g:87:4: lv_movements_0_0= ruleMovement
            	    {

            	    				newCompositeNode(grammarAccess.getProgramAccess().getMovementsMovementParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_movements_0_0=ruleMovement();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getProgramRule());
            	    				}
            	    				add(
            	    					current,
            	    					"movements",
            	    					lv_movements_0_0,
            	    					"robot.control.Roc.Movement");
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

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMovement"
    // InternalRoc.g:110:1: entryRuleMovement returns [EObject current=null] : iv_ruleMovement= ruleMovement EOF ;
    public final EObject entryRuleMovement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMovement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalRoc.g:112:2: (iv_ruleMovement= ruleMovement EOF )
            // InternalRoc.g:113:2: iv_ruleMovement= ruleMovement EOF
            {
             newCompositeNode(grammarAccess.getMovementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovement=ruleMovement();

            state._fsp--;

             current =iv_ruleMovement; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // InternalRoc.g:122:1: ruleMovement returns [EObject current=null] : ( ( (lv_motions_0_0= ruleMotion ) ) (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )* this_PERIOD_3= RULE_PERIOD ) ;
    public final EObject ruleMovement() throws RecognitionException {
        EObject current = null;

        Token this_AND_1=null;
        Token this_PERIOD_3=null;
        EObject lv_motions_0_0 = null;

        EObject lv_motions_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalRoc.g:129:2: ( ( ( (lv_motions_0_0= ruleMotion ) ) (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )* this_PERIOD_3= RULE_PERIOD ) )
            // InternalRoc.g:130:2: ( ( (lv_motions_0_0= ruleMotion ) ) (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )* this_PERIOD_3= RULE_PERIOD )
            {
            // InternalRoc.g:130:2: ( ( (lv_motions_0_0= ruleMotion ) ) (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )* this_PERIOD_3= RULE_PERIOD )
            // InternalRoc.g:131:3: ( (lv_motions_0_0= ruleMotion ) ) (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )* this_PERIOD_3= RULE_PERIOD
            {
            // InternalRoc.g:131:3: ( (lv_motions_0_0= ruleMotion ) )
            // InternalRoc.g:132:4: (lv_motions_0_0= ruleMotion )
            {
            // InternalRoc.g:132:4: (lv_motions_0_0= ruleMotion )
            // InternalRoc.g:133:5: lv_motions_0_0= ruleMotion
            {

            					newCompositeNode(grammarAccess.getMovementAccess().getMotionsMotionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_4);
            lv_motions_0_0=ruleMotion();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMovementRule());
            					}
            					add(
            						current,
            						"motions",
            						lv_motions_0_0,
            						"robot.control.Roc.Motion");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalRoc.g:150:3: (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_AND) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalRoc.g:151:4: this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) )
            	    {
            	    this_AND_1=(Token)match(input,RULE_AND,FOLLOW_5); 

            	    				newLeafNode(this_AND_1, grammarAccess.getMovementAccess().getANDTerminalRuleCall_1_0());
            	    			
            	    // InternalRoc.g:155:4: ( (lv_motions_2_0= ruleMotion ) )
            	    // InternalRoc.g:156:5: (lv_motions_2_0= ruleMotion )
            	    {
            	    // InternalRoc.g:156:5: (lv_motions_2_0= ruleMotion )
            	    // InternalRoc.g:157:6: lv_motions_2_0= ruleMotion
            	    {

            	    						newCompositeNode(grammarAccess.getMovementAccess().getMotionsMotionParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_motions_2_0=ruleMotion();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMovementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"motions",
            	    							lv_motions_2_0,
            	    							"robot.control.Roc.Motion");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            this_PERIOD_3=(Token)match(input,RULE_PERIOD,FOLLOW_2); 

            			newLeafNode(this_PERIOD_3, grammarAccess.getMovementAccess().getPERIODTerminalRuleCall_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleMotion"
    // InternalRoc.g:186:1: entryRuleMotion returns [EObject current=null] : iv_ruleMotion= ruleMotion EOF ;
    public final EObject entryRuleMotion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMotion = null;


        try {
            // InternalRoc.g:186:47: (iv_ruleMotion= ruleMotion EOF )
            // InternalRoc.g:187:2: iv_ruleMotion= ruleMotion EOF
            {
             newCompositeNode(grammarAccess.getMotionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMotion=ruleMotion();

            state._fsp--;

             current =iv_ruleMotion; 
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
    // $ANTLR end "entryRuleMotion"


    // $ANTLR start "ruleMotion"
    // InternalRoc.g:193:1: ruleMotion returns [EObject current=null] : ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) ;
    public final EObject ruleMotion() throws RecognitionException {
        EObject current = null;

        Token this_FOR_1=null;
        Token lv_duration_2_0=null;
        EObject lv_action_0_0 = null;

        Enumerator lv_durationUnit_3_0 = null;



        	enterRule();

        try {
            // InternalRoc.g:199:2: ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) )
            // InternalRoc.g:200:2: ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) )
            {
            // InternalRoc.g:200:2: ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) )
            // InternalRoc.g:201:3: ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) )
            {
            // InternalRoc.g:201:3: ( (lv_action_0_0= ruleAction ) )
            // InternalRoc.g:202:4: (lv_action_0_0= ruleAction )
            {
            // InternalRoc.g:202:4: (lv_action_0_0= ruleAction )
            // InternalRoc.g:203:5: lv_action_0_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getMotionAccess().getActionActionParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_6);
            lv_action_0_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMotionRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_0_0,
            						"robot.control.Roc.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            this_FOR_1=(Token)match(input,RULE_FOR,FOLLOW_7); 

            			newLeafNode(this_FOR_1, grammarAccess.getMotionAccess().getFORTerminalRuleCall_1());
            		
            // InternalRoc.g:224:3: ( (lv_duration_2_0= RULE_DURATION ) )
            // InternalRoc.g:225:4: (lv_duration_2_0= RULE_DURATION )
            {
            // InternalRoc.g:225:4: (lv_duration_2_0= RULE_DURATION )
            // InternalRoc.g:226:5: lv_duration_2_0= RULE_DURATION
            {
            lv_duration_2_0=(Token)match(input,RULE_DURATION,FOLLOW_8); 

            					newLeafNode(lv_duration_2_0, grammarAccess.getMotionAccess().getDurationDurationTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMotionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"duration",
            						lv_duration_2_0,
            						"robot.control.Roc.Duration");
            				

            }


            }

            // InternalRoc.g:242:3: ( (lv_durationUnit_3_0= ruleDurationUnit ) )
            // InternalRoc.g:243:4: (lv_durationUnit_3_0= ruleDurationUnit )
            {
            // InternalRoc.g:243:4: (lv_durationUnit_3_0= ruleDurationUnit )
            // InternalRoc.g:244:5: lv_durationUnit_3_0= ruleDurationUnit
            {

            					newCompositeNode(grammarAccess.getMotionAccess().getDurationUnitDurationUnitEnumRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_durationUnit_3_0=ruleDurationUnit();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMotionRule());
            					}
            					set(
            						current,
            						"durationUnit",
            						lv_durationUnit_3_0,
            						"robot.control.Roc.DurationUnit");
            					afterParserOrEnumRuleCall();
            				

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
    // $ANTLR end "ruleMotion"


    // $ANTLR start "entryRuleAction"
    // InternalRoc.g:265:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRoc.g:265:47: (iv_ruleAction= ruleAction EOF )
            // InternalRoc.g:266:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
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
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalRoc.g:272:1: ruleAction returns [EObject current=null] : ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actionHolder_0_0 = null;

        Enumerator lv_intensity_1_0 = null;

        EObject lv_actionHolder_2_0 = null;

        Enumerator lv_intensity_3_0 = null;

        EObject lv_actionHolder_4_0 = null;



        	enterRule();

        try {
            // InternalRoc.g:278:2: ( ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) ) )
            // InternalRoc.g:279:2: ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) )
            {
            // InternalRoc.g:279:2: ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                int LA5_2 = input.LA(2);

                if ( ((LA5_2>=17 && LA5_2<=18)) ) {
                    alt5=2;
                }
                else if ( ((LA5_2>=19 && LA5_2<=20)||LA5_2==25) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 30:
                {
                int LA5_3 = input.LA(2);

                if ( ((LA5_3>=19 && LA5_3<=20)||LA5_3==25) ) {
                    alt5=3;
                }
                else if ( ((LA5_3>=17 && LA5_3<=18)) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            case 31:
                {
                int LA5_4 = input.LA(2);

                if ( ((LA5_4>=17 && LA5_4<=18)) ) {
                    alt5=2;
                }
                else if ( ((LA5_4>=19 && LA5_4<=20)||LA5_4==25) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 4, input);

                    throw nvae;
                }
                }
                break;
            case 32:
                {
                int LA5_5 = input.LA(2);

                if ( ((LA5_5>=17 && LA5_5<=18)) ) {
                    alt5=2;
                }
                else if ( ((LA5_5>=19 && LA5_5<=20)||LA5_5==25) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 5, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA5_6 = input.LA(2);

                if ( ((LA5_6>=17 && LA5_6<=18)) ) {
                    alt5=2;
                }
                else if ( ((LA5_6>=19 && LA5_6<=20)||LA5_6==25) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 6, input);

                    throw nvae;
                }
                }
                break;
            case 17:
            case 18:
                {
                alt5=2;
                }
                break;
            case 19:
            case 20:
            case 25:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalRoc.g:280:3: ( (lv_actionHolder_0_0= ruleCompleteAction ) )
                    {
                    // InternalRoc.g:280:3: ( (lv_actionHolder_0_0= ruleCompleteAction ) )
                    // InternalRoc.g:281:4: (lv_actionHolder_0_0= ruleCompleteAction )
                    {
                    // InternalRoc.g:281:4: (lv_actionHolder_0_0= ruleCompleteAction )
                    // InternalRoc.g:282:5: lv_actionHolder_0_0= ruleCompleteAction
                    {

                    					newCompositeNode(grammarAccess.getActionAccess().getActionHolderCompleteActionParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actionHolder_0_0=ruleCompleteAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getActionRule());
                    					}
                    					set(
                    						current,
                    						"actionHolder",
                    						lv_actionHolder_0_0,
                    						"robot.control.Roc.CompleteAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:300:3: ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) )
                    {
                    // InternalRoc.g:300:3: ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) )
                    // InternalRoc.g:301:4: ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) )
                    {
                    // InternalRoc.g:301:4: ( (lv_intensity_1_0= ruleIntensity ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=29 && LA3_0<=33)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // InternalRoc.g:302:5: (lv_intensity_1_0= ruleIntensity )
                            {
                            // InternalRoc.g:302:5: (lv_intensity_1_0= ruleIntensity )
                            // InternalRoc.g:303:6: lv_intensity_1_0= ruleIntensity
                            {

                            						newCompositeNode(grammarAccess.getActionAccess().getIntensityIntensityEnumRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_9);
                            lv_intensity_1_0=ruleIntensity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getActionRule());
                            						}
                            						set(
                            							current,
                            							"intensity",
                            							lv_intensity_1_0,
                            							"robot.control.Roc.Intensity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalRoc.g:320:4: ( (lv_actionHolder_2_0= ruleSingleAction ) )
                    // InternalRoc.g:321:5: (lv_actionHolder_2_0= ruleSingleAction )
                    {
                    // InternalRoc.g:321:5: (lv_actionHolder_2_0= ruleSingleAction )
                    // InternalRoc.g:322:6: lv_actionHolder_2_0= ruleSingleAction
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getActionHolderSingleActionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_actionHolder_2_0=ruleSingleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"actionHolder",
                    							lv_actionHolder_2_0,
                    							"robot.control.Roc.SingleAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:341:3: ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) )
                    {
                    // InternalRoc.g:341:3: ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) )
                    // InternalRoc.g:342:4: ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) )
                    {
                    // InternalRoc.g:342:4: ( (lv_intensity_3_0= ruleIntensity ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=29 && LA4_0<=33)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalRoc.g:343:5: (lv_intensity_3_0= ruleIntensity )
                            {
                            // InternalRoc.g:343:5: (lv_intensity_3_0= ruleIntensity )
                            // InternalRoc.g:344:6: lv_intensity_3_0= ruleIntensity
                            {

                            						newCompositeNode(grammarAccess.getActionAccess().getIntensityIntensityEnumRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_10);
                            lv_intensity_3_0=ruleIntensity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getActionRule());
                            						}
                            						set(
                            							current,
                            							"intensity",
                            							lv_intensity_3_0,
                            							"robot.control.Roc.Intensity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalRoc.g:361:4: ( (lv_actionHolder_4_0= ruleDirectedAction ) )
                    // InternalRoc.g:362:5: (lv_actionHolder_4_0= ruleDirectedAction )
                    {
                    // InternalRoc.g:362:5: (lv_actionHolder_4_0= ruleDirectedAction )
                    // InternalRoc.g:363:6: lv_actionHolder_4_0= ruleDirectedAction
                    {

                    						newCompositeNode(grammarAccess.getActionAccess().getActionHolderDirectedActionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_actionHolder_4_0=ruleDirectedAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getActionRule());
                    						}
                    						set(
                    							current,
                    							"actionHolder",
                    							lv_actionHolder_4_0,
                    							"robot.control.Roc.DirectedAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCompleteAction"
    // InternalRoc.g:385:1: entryRuleCompleteAction returns [EObject current=null] : iv_ruleCompleteAction= ruleCompleteAction EOF ;
    public final EObject entryRuleCompleteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteAction = null;


        try {
            // InternalRoc.g:385:55: (iv_ruleCompleteAction= ruleCompleteAction EOF )
            // InternalRoc.g:386:2: iv_ruleCompleteAction= ruleCompleteAction EOF
            {
             newCompositeNode(grammarAccess.getCompleteActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompleteAction=ruleCompleteAction();

            state._fsp--;

             current =iv_ruleCompleteAction; 
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
    // $ANTLR end "entryRuleCompleteAction"


    // $ANTLR start "ruleCompleteAction"
    // InternalRoc.g:392:1: ruleCompleteAction returns [EObject current=null] : ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' ) ;
    public final EObject ruleCompleteAction() throws RecognitionException {
        EObject current = null;

        Token lv_actionName_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoc.g:398:2: ( ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' ) )
            // InternalRoc.g:399:2: ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' )
            {
            // InternalRoc.g:399:2: ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' )
            // InternalRoc.g:400:3: ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face'
            {
            // InternalRoc.g:400:3: ( (lv_actionName_0_0= 'neutral' ) )
            // InternalRoc.g:401:4: (lv_actionName_0_0= 'neutral' )
            {
            // InternalRoc.g:401:4: (lv_actionName_0_0= 'neutral' )
            // InternalRoc.g:402:5: lv_actionName_0_0= 'neutral'
            {
            lv_actionName_0_0=(Token)match(input,15,FOLLOW_11); 

            					newLeafNode(lv_actionName_0_0, grammarAccess.getCompleteActionAccess().getActionNameNeutralKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompleteActionRule());
            					}
            					setWithLastConsumed(current, "actionName", lv_actionName_0_0, "neutral");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getCompleteActionAccess().getFaceKeyword_1());
            		

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
    // $ANTLR end "ruleCompleteAction"


    // $ANTLR start "entryRuleSingleAction"
    // InternalRoc.g:422:1: entryRuleSingleAction returns [EObject current=null] : iv_ruleSingleAction= ruleSingleAction EOF ;
    public final EObject entryRuleSingleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAction = null;


        try {
            // InternalRoc.g:422:53: (iv_ruleSingleAction= ruleSingleAction EOF )
            // InternalRoc.g:423:2: iv_ruleSingleAction= ruleSingleAction EOF
            {
             newCompositeNode(grammarAccess.getSingleActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleAction=ruleSingleAction();

            state._fsp--;

             current =iv_ruleSingleAction; 
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
    // $ANTLR end "entryRuleSingleAction"


    // $ANTLR start "ruleSingleAction"
    // InternalRoc.g:429:1: ruleSingleAction returns [EObject current=null] : ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod Head' ) ) ) ;
    public final EObject ruleSingleAction() throws RecognitionException {
        EObject current = null;

        Token lv_actionName_0_0=null;
        Token lv_actionName_1_0=null;


        	enterRule();

        try {
            // InternalRoc.g:435:2: ( ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod Head' ) ) ) )
            // InternalRoc.g:436:2: ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod Head' ) ) )
            {
            // InternalRoc.g:436:2: ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod Head' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==17) ) {
                alt6=1;
            }
            else if ( (LA6_0==18) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalRoc.g:437:3: ( (lv_actionName_0_0= 'drop jaw' ) )
                    {
                    // InternalRoc.g:437:3: ( (lv_actionName_0_0= 'drop jaw' ) )
                    // InternalRoc.g:438:4: (lv_actionName_0_0= 'drop jaw' )
                    {
                    // InternalRoc.g:438:4: (lv_actionName_0_0= 'drop jaw' )
                    // InternalRoc.g:439:5: lv_actionName_0_0= 'drop jaw'
                    {
                    lv_actionName_0_0=(Token)match(input,17,FOLLOW_2); 

                    					newLeafNode(lv_actionName_0_0, grammarAccess.getSingleActionAccess().getActionNameDropJawKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleActionRule());
                    					}
                    					setWithLastConsumed(current, "actionName", lv_actionName_0_0, "drop jaw");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:452:3: ( (lv_actionName_1_0= 'nod Head' ) )
                    {
                    // InternalRoc.g:452:3: ( (lv_actionName_1_0= 'nod Head' ) )
                    // InternalRoc.g:453:4: (lv_actionName_1_0= 'nod Head' )
                    {
                    // InternalRoc.g:453:4: (lv_actionName_1_0= 'nod Head' )
                    // InternalRoc.g:454:5: lv_actionName_1_0= 'nod Head'
                    {
                    lv_actionName_1_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_actionName_1_0, grammarAccess.getSingleActionAccess().getActionNameNodHeadKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleActionRule());
                    					}
                    					setWithLastConsumed(current, "actionName", lv_actionName_1_0, "nod Head");
                    				

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
    // $ANTLR end "ruleSingleAction"


    // $ANTLR start "entryRuleDirectedAction"
    // InternalRoc.g:470:1: entryRuleDirectedAction returns [EObject current=null] : iv_ruleDirectedAction= ruleDirectedAction EOF ;
    public final EObject entryRuleDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedAction = null;


        try {
            // InternalRoc.g:470:55: (iv_ruleDirectedAction= ruleDirectedAction EOF )
            // InternalRoc.g:471:2: iv_ruleDirectedAction= ruleDirectedAction EOF
            {
             newCompositeNode(grammarAccess.getDirectedActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectedAction=ruleDirectedAction();

            state._fsp--;

             current =iv_ruleDirectedAction; 
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
    // $ANTLR end "entryRuleDirectedAction"


    // $ANTLR start "ruleDirectedAction"
    // InternalRoc.g:477:1: ruleDirectedAction returns [EObject current=null] : ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) ) | ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) ) ) ;
    public final EObject ruleDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actionName_0_0 = null;

        EObject lv_direction_1_0 = null;

        EObject lv_actionName_2_0 = null;

        EObject lv_direction_3_0 = null;

        EObject lv_actionName_4_0 = null;

        EObject lv_direction_5_0 = null;



        	enterRule();

        try {
            // InternalRoc.g:483:2: ( ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) ) | ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) ) ) )
            // InternalRoc.g:484:2: ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) ) | ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) ) )
            {
            // InternalRoc.g:484:2: ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) ) | ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 25:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalRoc.g:485:3: ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) )
                    {
                    // InternalRoc.g:485:3: ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) )
                    // InternalRoc.g:486:4: ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) )
                    {
                    // InternalRoc.g:486:4: ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) )
                    // InternalRoc.g:487:5: (lv_actionName_0_0= ruleLeftRightDirectedAction )
                    {
                    // InternalRoc.g:487:5: (lv_actionName_0_0= ruleLeftRightDirectedAction )
                    // InternalRoc.g:488:6: lv_actionName_0_0= ruleLeftRightDirectedAction
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getActionNameLeftRightDirectedActionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_actionName_0_0=ruleLeftRightDirectedAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedActionRule());
                    						}
                    						set(
                    							current,
                    							"actionName",
                    							lv_actionName_0_0,
                    							"robot.control.Roc.LeftRightDirectedAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRoc.g:505:4: ( (lv_direction_1_0= ruleLeftRightDirection ) )
                    // InternalRoc.g:506:5: (lv_direction_1_0= ruleLeftRightDirection )
                    {
                    // InternalRoc.g:506:5: (lv_direction_1_0= ruleLeftRightDirection )
                    // InternalRoc.g:507:6: lv_direction_1_0= ruleLeftRightDirection
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getDirectionLeftRightDirectionParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_1_0=ruleLeftRightDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedActionRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_1_0,
                    							"robot.control.Roc.LeftRightDirection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:526:3: ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) )
                    {
                    // InternalRoc.g:526:3: ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) )
                    // InternalRoc.g:527:4: ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) )
                    {
                    // InternalRoc.g:527:4: ( (lv_actionName_2_0= ruleBackForthDirectedAction ) )
                    // InternalRoc.g:528:5: (lv_actionName_2_0= ruleBackForthDirectedAction )
                    {
                    // InternalRoc.g:528:5: (lv_actionName_2_0= ruleBackForthDirectedAction )
                    // InternalRoc.g:529:6: lv_actionName_2_0= ruleBackForthDirectedAction
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getActionNameBackForthDirectedActionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_actionName_2_0=ruleBackForthDirectedAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedActionRule());
                    						}
                    						set(
                    							current,
                    							"actionName",
                    							lv_actionName_2_0,
                    							"robot.control.Roc.BackForthDirectedAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRoc.g:546:4: ( (lv_direction_3_0= ruleBackForthDirection ) )
                    // InternalRoc.g:547:5: (lv_direction_3_0= ruleBackForthDirection )
                    {
                    // InternalRoc.g:547:5: (lv_direction_3_0= ruleBackForthDirection )
                    // InternalRoc.g:548:6: lv_direction_3_0= ruleBackForthDirection
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getDirectionBackForthDirectionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_3_0=ruleBackForthDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedActionRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_3_0,
                    							"robot.control.Roc.BackForthDirection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:567:3: ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) )
                    {
                    // InternalRoc.g:567:3: ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) )
                    // InternalRoc.g:568:4: ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) )
                    {
                    // InternalRoc.g:568:4: ( (lv_actionName_4_0= ruleFullDirectedAction ) )
                    // InternalRoc.g:569:5: (lv_actionName_4_0= ruleFullDirectedAction )
                    {
                    // InternalRoc.g:569:5: (lv_actionName_4_0= ruleFullDirectedAction )
                    // InternalRoc.g:570:6: lv_actionName_4_0= ruleFullDirectedAction
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getActionNameFullDirectedActionParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_actionName_4_0=ruleFullDirectedAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedActionRule());
                    						}
                    						set(
                    							current,
                    							"actionName",
                    							lv_actionName_4_0,
                    							"robot.control.Roc.FullDirectedAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRoc.g:587:4: ( (lv_direction_5_0= ruleDirection ) )
                    // InternalRoc.g:588:5: (lv_direction_5_0= ruleDirection )
                    {
                    // InternalRoc.g:588:5: (lv_direction_5_0= ruleDirection )
                    // InternalRoc.g:589:6: lv_direction_5_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getDirectionDirectionParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_5_0=ruleDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedActionRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_5_0,
                    							"robot.control.Roc.Direction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


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
    // $ANTLR end "ruleDirectedAction"


    // $ANTLR start "entryRuleLeftRightDirectedAction"
    // InternalRoc.g:611:1: entryRuleLeftRightDirectedAction returns [EObject current=null] : iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF ;
    public final EObject entryRuleLeftRightDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftRightDirectedAction = null;


        try {
            // InternalRoc.g:611:64: (iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF )
            // InternalRoc.g:612:2: iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF
            {
             newCompositeNode(grammarAccess.getLeftRightDirectedActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftRightDirectedAction=ruleLeftRightDirectedAction();

            state._fsp--;

             current =iv_ruleLeftRightDirectedAction; 
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
    // $ANTLR end "entryRuleLeftRightDirectedAction"


    // $ANTLR start "ruleLeftRightDirectedAction"
    // InternalRoc.g:618:1: ruleLeftRightDirectedAction returns [EObject current=null] : ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' ) ;
    public final EObject ruleLeftRightDirectedAction() throws RecognitionException {
        EObject current = null;

        Token lv_tiltHead_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoc.g:624:2: ( ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' ) )
            // InternalRoc.g:625:2: ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' )
            {
            // InternalRoc.g:625:2: ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' )
            // InternalRoc.g:626:3: ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head'
            {
            // InternalRoc.g:626:3: ( (lv_tiltHead_0_0= 'tilt' ) )
            // InternalRoc.g:627:4: (lv_tiltHead_0_0= 'tilt' )
            {
            // InternalRoc.g:627:4: (lv_tiltHead_0_0= 'tilt' )
            // InternalRoc.g:628:5: lv_tiltHead_0_0= 'tilt'
            {
            lv_tiltHead_0_0=(Token)match(input,19,FOLLOW_15); 

            					newLeafNode(lv_tiltHead_0_0, grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeftRightDirectedActionRule());
            					}
            					setWithLastConsumed(current, "tiltHead", lv_tiltHead_0_0, "tilt");
            				

            }


            }

            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getLeftRightDirectedActionAccess().getHeadKeyword_1());
            		

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
    // $ANTLR end "ruleLeftRightDirectedAction"


    // $ANTLR start "entryRuleLeftRightDirection"
    // InternalRoc.g:648:1: entryRuleLeftRightDirection returns [EObject current=null] : iv_ruleLeftRightDirection= ruleLeftRightDirection EOF ;
    public final EObject entryRuleLeftRightDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftRightDirection = null;


        try {
            // InternalRoc.g:648:59: (iv_ruleLeftRightDirection= ruleLeftRightDirection EOF )
            // InternalRoc.g:649:2: iv_ruleLeftRightDirection= ruleLeftRightDirection EOF
            {
             newCompositeNode(grammarAccess.getLeftRightDirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftRightDirection=ruleLeftRightDirection();

            state._fsp--;

             current =iv_ruleLeftRightDirection; 
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
    // $ANTLR end "entryRuleLeftRightDirection"


    // $ANTLR start "ruleLeftRightDirection"
    // InternalRoc.g:655:1: ruleLeftRightDirection returns [EObject current=null] : ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) ) ;
    public final EObject ruleLeftRightDirection() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;


        	enterRule();

        try {
            // InternalRoc.g:661:2: ( ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) ) )
            // InternalRoc.g:662:2: ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) )
            {
            // InternalRoc.g:662:2: ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( (LA8_0==22) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoc.g:663:3: ( (lv_left_0_0= 'left' ) )
                    {
                    // InternalRoc.g:663:3: ( (lv_left_0_0= 'left' ) )
                    // InternalRoc.g:664:4: (lv_left_0_0= 'left' )
                    {
                    // InternalRoc.g:664:4: (lv_left_0_0= 'left' )
                    // InternalRoc.g:665:5: lv_left_0_0= 'left'
                    {
                    lv_left_0_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_left_0_0, grammarAccess.getLeftRightDirectionAccess().getLeftLeftKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeftRightDirectionRule());
                    					}
                    					setWithLastConsumed(current, "left", lv_left_0_0, "left");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:678:3: ( (lv_right_1_0= 'right' ) )
                    {
                    // InternalRoc.g:678:3: ( (lv_right_1_0= 'right' ) )
                    // InternalRoc.g:679:4: (lv_right_1_0= 'right' )
                    {
                    // InternalRoc.g:679:4: (lv_right_1_0= 'right' )
                    // InternalRoc.g:680:5: lv_right_1_0= 'right'
                    {
                    lv_right_1_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_right_1_0, grammarAccess.getLeftRightDirectionAccess().getRightRightKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLeftRightDirectionRule());
                    					}
                    					setWithLastConsumed(current, "right", lv_right_1_0, "right");
                    				

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
    // $ANTLR end "ruleLeftRightDirection"


    // $ANTLR start "entryRuleBackForthDirectedAction"
    // InternalRoc.g:696:1: entryRuleBackForthDirectedAction returns [EObject current=null] : iv_ruleBackForthDirectedAction= ruleBackForthDirectedAction EOF ;
    public final EObject entryRuleBackForthDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackForthDirectedAction = null;


        try {
            // InternalRoc.g:696:64: (iv_ruleBackForthDirectedAction= ruleBackForthDirectedAction EOF )
            // InternalRoc.g:697:2: iv_ruleBackForthDirectedAction= ruleBackForthDirectedAction EOF
            {
             newCompositeNode(grammarAccess.getBackForthDirectedActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackForthDirectedAction=ruleBackForthDirectedAction();

            state._fsp--;

             current =iv_ruleBackForthDirectedAction; 
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
    // $ANTLR end "entryRuleBackForthDirectedAction"


    // $ANTLR start "ruleBackForthDirectedAction"
    // InternalRoc.g:703:1: ruleBackForthDirectedAction returns [EObject current=null] : ( (lv_head_0_0= 'head' ) ) ;
    public final EObject ruleBackForthDirectedAction() throws RecognitionException {
        EObject current = null;

        Token lv_head_0_0=null;


        	enterRule();

        try {
            // InternalRoc.g:709:2: ( ( (lv_head_0_0= 'head' ) ) )
            // InternalRoc.g:710:2: ( (lv_head_0_0= 'head' ) )
            {
            // InternalRoc.g:710:2: ( (lv_head_0_0= 'head' ) )
            // InternalRoc.g:711:3: (lv_head_0_0= 'head' )
            {
            // InternalRoc.g:711:3: (lv_head_0_0= 'head' )
            // InternalRoc.g:712:4: lv_head_0_0= 'head'
            {
            lv_head_0_0=(Token)match(input,20,FOLLOW_2); 

            				newLeafNode(lv_head_0_0, grammarAccess.getBackForthDirectedActionAccess().getHeadHeadKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getBackForthDirectedActionRule());
            				}
            				setWithLastConsumed(current, "head", lv_head_0_0, "head");
            			

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
    // $ANTLR end "ruleBackForthDirectedAction"


    // $ANTLR start "entryRuleBackForthDirection"
    // InternalRoc.g:727:1: entryRuleBackForthDirection returns [EObject current=null] : iv_ruleBackForthDirection= ruleBackForthDirection EOF ;
    public final EObject entryRuleBackForthDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBackForthDirection = null;


        try {
            // InternalRoc.g:727:59: (iv_ruleBackForthDirection= ruleBackForthDirection EOF )
            // InternalRoc.g:728:2: iv_ruleBackForthDirection= ruleBackForthDirection EOF
            {
             newCompositeNode(grammarAccess.getBackForthDirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackForthDirection=ruleBackForthDirection();

            state._fsp--;

             current =iv_ruleBackForthDirection; 
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
    // $ANTLR end "entryRuleBackForthDirection"


    // $ANTLR start "ruleBackForthDirection"
    // InternalRoc.g:734:1: ruleBackForthDirection returns [EObject current=null] : ( ( (lv_back_0_0= 'back' ) ) | ( (lv_forth_1_0= 'forth' ) ) ) ;
    public final EObject ruleBackForthDirection() throws RecognitionException {
        EObject current = null;

        Token lv_back_0_0=null;
        Token lv_forth_1_0=null;


        	enterRule();

        try {
            // InternalRoc.g:740:2: ( ( ( (lv_back_0_0= 'back' ) ) | ( (lv_forth_1_0= 'forth' ) ) ) )
            // InternalRoc.g:741:2: ( ( (lv_back_0_0= 'back' ) ) | ( (lv_forth_1_0= 'forth' ) ) )
            {
            // InternalRoc.g:741:2: ( ( (lv_back_0_0= 'back' ) ) | ( (lv_forth_1_0= 'forth' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==23) ) {
                alt9=1;
            }
            else if ( (LA9_0==24) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoc.g:742:3: ( (lv_back_0_0= 'back' ) )
                    {
                    // InternalRoc.g:742:3: ( (lv_back_0_0= 'back' ) )
                    // InternalRoc.g:743:4: (lv_back_0_0= 'back' )
                    {
                    // InternalRoc.g:743:4: (lv_back_0_0= 'back' )
                    // InternalRoc.g:744:5: lv_back_0_0= 'back'
                    {
                    lv_back_0_0=(Token)match(input,23,FOLLOW_2); 

                    					newLeafNode(lv_back_0_0, grammarAccess.getBackForthDirectionAccess().getBackBackKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBackForthDirectionRule());
                    					}
                    					setWithLastConsumed(current, "back", lv_back_0_0, "back");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:757:3: ( (lv_forth_1_0= 'forth' ) )
                    {
                    // InternalRoc.g:757:3: ( (lv_forth_1_0= 'forth' ) )
                    // InternalRoc.g:758:4: (lv_forth_1_0= 'forth' )
                    {
                    // InternalRoc.g:758:4: (lv_forth_1_0= 'forth' )
                    // InternalRoc.g:759:5: lv_forth_1_0= 'forth'
                    {
                    lv_forth_1_0=(Token)match(input,24,FOLLOW_2); 

                    					newLeafNode(lv_forth_1_0, grammarAccess.getBackForthDirectionAccess().getForthForthKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getBackForthDirectionRule());
                    					}
                    					setWithLastConsumed(current, "forth", lv_forth_1_0, "forth");
                    				

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
    // $ANTLR end "ruleBackForthDirection"


    // $ANTLR start "entryRuleFullDirectedAction"
    // InternalRoc.g:775:1: entryRuleFullDirectedAction returns [EObject current=null] : iv_ruleFullDirectedAction= ruleFullDirectedAction EOF ;
    public final EObject entryRuleFullDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullDirectedAction = null;


        try {
            // InternalRoc.g:775:59: (iv_ruleFullDirectedAction= ruleFullDirectedAction EOF )
            // InternalRoc.g:776:2: iv_ruleFullDirectedAction= ruleFullDirectedAction EOF
            {
             newCompositeNode(grammarAccess.getFullDirectedActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFullDirectedAction=ruleFullDirectedAction();

            state._fsp--;

             current =iv_ruleFullDirectedAction; 
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
    // $ANTLR end "entryRuleFullDirectedAction"


    // $ANTLR start "ruleFullDirectedAction"
    // InternalRoc.g:782:1: ruleFullDirectedAction returns [EObject current=null] : ( ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' ) | ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' ) ) ;
    public final EObject ruleFullDirectedAction() throws RecognitionException {
        EObject current = null;

        Token lv_turnHead_0_0=null;
        Token otherlv_1=null;
        Token lv_turnEyes_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalRoc.g:788:2: ( ( ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' ) | ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' ) ) )
            // InternalRoc.g:789:2: ( ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' ) | ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' ) )
            {
            // InternalRoc.g:789:2: ( ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' ) | ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==26) ) {
                    alt10=2;
                }
                else if ( (LA10_1==20) ) {
                    alt10=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoc.g:790:3: ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' )
                    {
                    // InternalRoc.g:790:3: ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' )
                    // InternalRoc.g:791:4: ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head'
                    {
                    // InternalRoc.g:791:4: ( (lv_turnHead_0_0= 'turn' ) )
                    // InternalRoc.g:792:5: (lv_turnHead_0_0= 'turn' )
                    {
                    // InternalRoc.g:792:5: (lv_turnHead_0_0= 'turn' )
                    // InternalRoc.g:793:6: lv_turnHead_0_0= 'turn'
                    {
                    lv_turnHead_0_0=(Token)match(input,25,FOLLOW_15); 

                    						newLeafNode(lv_turnHead_0_0, grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFullDirectedActionRule());
                    						}
                    						setWithLastConsumed(current, "turnHead", lv_turnHead_0_0, "turn");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,20,FOLLOW_2); 

                    				newLeafNode(otherlv_1, grammarAccess.getFullDirectedActionAccess().getHeadKeyword_0_1());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:811:3: ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' )
                    {
                    // InternalRoc.g:811:3: ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' )
                    // InternalRoc.g:812:4: ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes'
                    {
                    // InternalRoc.g:812:4: ( (lv_turnEyes_2_0= 'turn' ) )
                    // InternalRoc.g:813:5: (lv_turnEyes_2_0= 'turn' )
                    {
                    // InternalRoc.g:813:5: (lv_turnEyes_2_0= 'turn' )
                    // InternalRoc.g:814:6: lv_turnEyes_2_0= 'turn'
                    {
                    lv_turnEyes_2_0=(Token)match(input,25,FOLLOW_16); 

                    						newLeafNode(lv_turnEyes_2_0, grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFullDirectedActionRule());
                    						}
                    						setWithLastConsumed(current, "turnEyes", lv_turnEyes_2_0, "turn");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_3, grammarAccess.getFullDirectedActionAccess().getEyesKeyword_1_1());
                    			

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
    // $ANTLR end "ruleFullDirectedAction"


    // $ANTLR start "entryRuleDirection"
    // InternalRoc.g:835:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // InternalRoc.g:835:50: (iv_ruleDirection= ruleDirection EOF )
            // InternalRoc.g:836:2: iv_ruleDirection= ruleDirection EOF
            {
             newCompositeNode(grammarAccess.getDirectionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
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
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // InternalRoc.g:842:1: ruleDirection returns [EObject current=null] : ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Token lv_UP_0_0=null;
        Token lv_DOWN_1_0=null;
        Token lv_LEFT_2_0=null;
        Token lv_RIGHT_3_0=null;


        	enterRule();

        try {
            // InternalRoc.g:848:2: ( ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) ) )
            // InternalRoc.g:849:2: ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) )
            {
            // InternalRoc.g:849:2: ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt11=1;
                }
                break;
            case 28:
                {
                alt11=2;
                }
                break;
            case 21:
                {
                alt11=3;
                }
                break;
            case 22:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalRoc.g:850:3: ( (lv_UP_0_0= 'up' ) )
                    {
                    // InternalRoc.g:850:3: ( (lv_UP_0_0= 'up' ) )
                    // InternalRoc.g:851:4: (lv_UP_0_0= 'up' )
                    {
                    // InternalRoc.g:851:4: (lv_UP_0_0= 'up' )
                    // InternalRoc.g:852:5: lv_UP_0_0= 'up'
                    {
                    lv_UP_0_0=(Token)match(input,27,FOLLOW_2); 

                    					newLeafNode(lv_UP_0_0, grammarAccess.getDirectionAccess().getUPUpKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDirectionRule());
                    					}
                    					setWithLastConsumed(current, "UP", lv_UP_0_0, "up");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:865:3: ( (lv_DOWN_1_0= 'down' ) )
                    {
                    // InternalRoc.g:865:3: ( (lv_DOWN_1_0= 'down' ) )
                    // InternalRoc.g:866:4: (lv_DOWN_1_0= 'down' )
                    {
                    // InternalRoc.g:866:4: (lv_DOWN_1_0= 'down' )
                    // InternalRoc.g:867:5: lv_DOWN_1_0= 'down'
                    {
                    lv_DOWN_1_0=(Token)match(input,28,FOLLOW_2); 

                    					newLeafNode(lv_DOWN_1_0, grammarAccess.getDirectionAccess().getDOWNDownKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDirectionRule());
                    					}
                    					setWithLastConsumed(current, "DOWN", lv_DOWN_1_0, "down");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:880:3: ( (lv_LEFT_2_0= 'left' ) )
                    {
                    // InternalRoc.g:880:3: ( (lv_LEFT_2_0= 'left' ) )
                    // InternalRoc.g:881:4: (lv_LEFT_2_0= 'left' )
                    {
                    // InternalRoc.g:881:4: (lv_LEFT_2_0= 'left' )
                    // InternalRoc.g:882:5: lv_LEFT_2_0= 'left'
                    {
                    lv_LEFT_2_0=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_LEFT_2_0, grammarAccess.getDirectionAccess().getLEFTLeftKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDirectionRule());
                    					}
                    					setWithLastConsumed(current, "LEFT", lv_LEFT_2_0, "left");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRoc.g:895:3: ( (lv_RIGHT_3_0= 'right' ) )
                    {
                    // InternalRoc.g:895:3: ( (lv_RIGHT_3_0= 'right' ) )
                    // InternalRoc.g:896:4: (lv_RIGHT_3_0= 'right' )
                    {
                    // InternalRoc.g:896:4: (lv_RIGHT_3_0= 'right' )
                    // InternalRoc.g:897:5: lv_RIGHT_3_0= 'right'
                    {
                    lv_RIGHT_3_0=(Token)match(input,22,FOLLOW_2); 

                    					newLeafNode(lv_RIGHT_3_0, grammarAccess.getDirectionAccess().getRIGHTRightKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getDirectionRule());
                    					}
                    					setWithLastConsumed(current, "RIGHT", lv_RIGHT_3_0, "right");
                    				

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
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleIntensity"
    // InternalRoc.g:913:1: ruleIntensity returns [Enumerator current=null] : ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) ) ;
    public final Enumerator ruleIntensity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRoc.g:919:2: ( ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) ) )
            // InternalRoc.g:920:2: ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) )
            {
            // InternalRoc.g:920:2: ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 29:
                {
                alt12=1;
                }
                break;
            case 30:
                {
                alt12=2;
                }
                break;
            case 31:
                {
                alt12=3;
                }
                break;
            case 32:
                {
                alt12=4;
                }
                break;
            case 33:
                {
                alt12=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalRoc.g:921:3: (enumLiteral_0= 'pronounced' )
                    {
                    // InternalRoc.g:921:3: (enumLiteral_0= 'pronounced' )
                    // InternalRoc.g:922:4: enumLiteral_0= 'pronounced'
                    {
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:929:3: (enumLiteral_1= 'trace of' )
                    {
                    // InternalRoc.g:929:3: (enumLiteral_1= 'trace of' )
                    // InternalRoc.g:930:4: enumLiteral_1= 'trace of'
                    {
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:937:3: (enumLiteral_2= 'slightly' )
                    {
                    // InternalRoc.g:937:3: (enumLiteral_2= 'slightly' )
                    // InternalRoc.g:938:4: enumLiteral_2= 'slightly'
                    {
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRoc.g:945:3: (enumLiteral_3= 'severe' )
                    {
                    // InternalRoc.g:945:3: (enumLiteral_3= 'severe' )
                    // InternalRoc.g:946:4: enumLiteral_3= 'severe'
                    {
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRoc.g:953:3: (enumLiteral_4= 'maximum' )
                    {
                    // InternalRoc.g:953:3: (enumLiteral_4= 'maximum' )
                    // InternalRoc.g:954:4: enumLiteral_4= 'maximum'
                    {
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getIntensityAccess().getEEnumLiteralDeclaration_4());
                    			

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
    // $ANTLR end "ruleIntensity"


    // $ANTLR start "ruleDurationUnit"
    // InternalRoc.g:964:1: ruleDurationUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) ;
    public final Enumerator ruleDurationUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRoc.g:970:2: ( ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) )
            // InternalRoc.g:971:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            {
            // InternalRoc.g:971:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            int alt13=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt13=1;
                }
                break;
            case 35:
                {
                alt13=2;
                }
                break;
            case 36:
                {
                alt13=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRoc.g:972:3: (enumLiteral_0= 'milliseconds' )
                    {
                    // InternalRoc.g:972:3: (enumLiteral_0= 'milliseconds' )
                    // InternalRoc.g:973:4: enumLiteral_0= 'milliseconds'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:980:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalRoc.g:980:3: (enumLiteral_1= 'seconds' )
                    // InternalRoc.g:981:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:988:3: (enumLiteral_2= 'minutes' )
                    {
                    // InternalRoc.g:988:3: (enumLiteral_2= 'minutes' )
                    // InternalRoc.g:989:4: enumLiteral_2= 'minutes'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getDurationUnitAccess().getMINUTESEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getDurationUnitAccess().getMINUTESEnumLiteralDeclaration_2());
                    			

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
    // $ANTLR end "ruleDurationUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000003E21E8002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000003E21E8030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000001C00000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000003E0060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000003E21E8000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000000L});

}