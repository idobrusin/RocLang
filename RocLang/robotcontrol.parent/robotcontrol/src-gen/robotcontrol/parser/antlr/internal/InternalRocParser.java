package robotcontrol.parser.antlr.internal;

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
import robotcontrol.services.RocGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalRocParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_AND", "RULE_PERIOD", "RULE_FOR", "RULE_DURATION", "RULE_WITH", "RULE_SPEED_KEY", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'neutral'", "'face'", "'drop jaw'", "'nod head'", "'tilt'", "'head'", "'left'", "'right'", "'turn head'", "'turn eyes'", "'up'", "'down'", "'slowest'", "'slow'", "'normal'", "'fast'", "'full'", "'pronounced'", "'trace of'", "'slightly'", "'severe'", "'maximum'", "'milliseconds'", "'seconds'", "'minutes'"
    };
    public static final int RULE_WITH=8;
    public static final int RULE_DURATION=7;
    public static final int RULE_STRING=12;
    public static final int RULE_AND=4;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__19=19;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int RULE_SPEED_KEY=9;
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
    public static final int RULE_PERIOD=5;
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

                if ( (LA1_0==17||(LA1_0>=19 && LA1_0<=21)||(LA1_0>=25 && LA1_0<=26)||(LA1_0>=34 && LA1_0<=38)) ) {
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
            	    					"robotcontrol.Roc.Movement");
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
            						"robotcontrol.Roc.Motion");
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
            	    							"robotcontrol.Roc.Motion");
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
    // InternalRoc.g:193:1: ruleMotion returns [EObject current=null] : ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) | ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY ) ) ;
    public final EObject ruleMotion() throws RecognitionException {
        EObject current = null;

        Token this_FOR_1=null;
        Token lv_duration_2_0=null;
        Token this_WITH_5=null;
        Token this_SPEED_KEY_7=null;
        EObject lv_action_0_0 = null;

        Enumerator lv_durationUnit_3_0 = null;

        EObject lv_action_4_0 = null;

        EObject lv_speed_6_0 = null;



        	enterRule();

        try {
            // InternalRoc.g:199:2: ( ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) | ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY ) ) )
            // InternalRoc.g:200:2: ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) | ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY ) )
            {
            // InternalRoc.g:200:2: ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) | ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalRoc.g:201:3: ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) )
                    {
                    // InternalRoc.g:201:3: ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) )
                    // InternalRoc.g:202:4: ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) )
                    {
                    // InternalRoc.g:202:4: ( (lv_action_0_0= ruleAction ) )
                    // InternalRoc.g:203:5: (lv_action_0_0= ruleAction )
                    {
                    // InternalRoc.g:203:5: (lv_action_0_0= ruleAction )
                    // InternalRoc.g:204:6: lv_action_0_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getMotionAccess().getActionActionParserRuleCall_0_0_0());
                    					
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
                    							"robotcontrol.Roc.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_FOR_1=(Token)match(input,RULE_FOR,FOLLOW_7); 

                    				newLeafNode(this_FOR_1, grammarAccess.getMotionAccess().getFORTerminalRuleCall_0_1());
                    			
                    // InternalRoc.g:225:4: ( (lv_duration_2_0= RULE_DURATION ) )
                    // InternalRoc.g:226:5: (lv_duration_2_0= RULE_DURATION )
                    {
                    // InternalRoc.g:226:5: (lv_duration_2_0= RULE_DURATION )
                    // InternalRoc.g:227:6: lv_duration_2_0= RULE_DURATION
                    {
                    lv_duration_2_0=(Token)match(input,RULE_DURATION,FOLLOW_8); 

                    						newLeafNode(lv_duration_2_0, grammarAccess.getMotionAccess().getDurationDURATIONTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMotionRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"duration",
                    							lv_duration_2_0,
                    							"robotcontrol.Roc.DURATION");
                    					

                    }


                    }

                    // InternalRoc.g:243:4: ( (lv_durationUnit_3_0= ruleDurationUnit ) )
                    // InternalRoc.g:244:5: (lv_durationUnit_3_0= ruleDurationUnit )
                    {
                    // InternalRoc.g:244:5: (lv_durationUnit_3_0= ruleDurationUnit )
                    // InternalRoc.g:245:6: lv_durationUnit_3_0= ruleDurationUnit
                    {

                    						newCompositeNode(grammarAccess.getMotionAccess().getDurationUnitDurationUnitEnumRuleCall_0_3_0());
                    					
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
                    							"robotcontrol.Roc.DurationUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:264:3: ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY )
                    {
                    // InternalRoc.g:264:3: ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY )
                    // InternalRoc.g:265:4: ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY
                    {
                    // InternalRoc.g:265:4: ( (lv_action_4_0= ruleAction ) )
                    // InternalRoc.g:266:5: (lv_action_4_0= ruleAction )
                    {
                    // InternalRoc.g:266:5: (lv_action_4_0= ruleAction )
                    // InternalRoc.g:267:6: lv_action_4_0= ruleAction
                    {

                    						newCompositeNode(grammarAccess.getMotionAccess().getActionActionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_action_4_0=ruleAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMotionRule());
                    						}
                    						set(
                    							current,
                    							"action",
                    							lv_action_4_0,
                    							"robotcontrol.Roc.Action");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_WITH_5=(Token)match(input,RULE_WITH,FOLLOW_10); 

                    				newLeafNode(this_WITH_5, grammarAccess.getMotionAccess().getWITHTerminalRuleCall_1_1());
                    			
                    // InternalRoc.g:288:4: ( (lv_speed_6_0= ruleSpeed ) )
                    // InternalRoc.g:289:5: (lv_speed_6_0= ruleSpeed )
                    {
                    // InternalRoc.g:289:5: (lv_speed_6_0= ruleSpeed )
                    // InternalRoc.g:290:6: lv_speed_6_0= ruleSpeed
                    {

                    						newCompositeNode(grammarAccess.getMotionAccess().getSpeedSpeedParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_speed_6_0=ruleSpeed();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMotionRule());
                    						}
                    						set(
                    							current,
                    							"speed",
                    							lv_speed_6_0,
                    							"robotcontrol.Roc.Speed");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    this_SPEED_KEY_7=(Token)match(input,RULE_SPEED_KEY,FOLLOW_2); 

                    				newLeafNode(this_SPEED_KEY_7, grammarAccess.getMotionAccess().getSPEED_KEYTerminalRuleCall_1_3());
                    			

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
    // $ANTLR end "ruleMotion"


    // $ANTLR start "entryRuleAction"
    // InternalRoc.g:316:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRoc.g:316:47: (iv_ruleAction= ruleAction EOF )
            // InternalRoc.g:317:2: iv_ruleAction= ruleAction EOF
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
    // InternalRoc.g:323:1: ruleAction returns [EObject current=null] : ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actionHolder_0_0 = null;

        Enumerator lv_intensity_1_0 = null;

        EObject lv_actionHolder_2_0 = null;

        Enumerator lv_intensity_3_0 = null;

        EObject lv_actionHolder_4_0 = null;



        	enterRule();

        try {
            // InternalRoc.g:329:2: ( ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) ) )
            // InternalRoc.g:330:2: ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) )
            {
            // InternalRoc.g:330:2: ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 34:
                {
                int LA6_2 = input.LA(2);

                if ( ((LA6_2>=19 && LA6_2<=20)) ) {
                    alt6=2;
                }
                else if ( (LA6_2==21||(LA6_2>=25 && LA6_2<=26)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA6_3 = input.LA(2);

                if ( ((LA6_3>=19 && LA6_3<=20)) ) {
                    alt6=2;
                }
                else if ( (LA6_3==21||(LA6_3>=25 && LA6_3<=26)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==21||(LA6_4>=25 && LA6_4<=26)) ) {
                    alt6=3;
                }
                else if ( ((LA6_4>=19 && LA6_4<=20)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 37:
                {
                int LA6_5 = input.LA(2);

                if ( ((LA6_5>=19 && LA6_5<=20)) ) {
                    alt6=2;
                }
                else if ( (LA6_5==21||(LA6_5>=25 && LA6_5<=26)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA6_6 = input.LA(2);

                if ( ((LA6_6>=19 && LA6_6<=20)) ) {
                    alt6=2;
                }
                else if ( (LA6_6==21||(LA6_6>=25 && LA6_6<=26)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 6, input);

                    throw nvae;
                }
                }
                break;
            case 19:
            case 20:
                {
                alt6=2;
                }
                break;
            case 21:
            case 25:
            case 26:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalRoc.g:331:3: ( (lv_actionHolder_0_0= ruleCompleteAction ) )
                    {
                    // InternalRoc.g:331:3: ( (lv_actionHolder_0_0= ruleCompleteAction ) )
                    // InternalRoc.g:332:4: (lv_actionHolder_0_0= ruleCompleteAction )
                    {
                    // InternalRoc.g:332:4: (lv_actionHolder_0_0= ruleCompleteAction )
                    // InternalRoc.g:333:5: lv_actionHolder_0_0= ruleCompleteAction
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
                    						"robotcontrol.Roc.CompleteAction");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:351:3: ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) )
                    {
                    // InternalRoc.g:351:3: ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) )
                    // InternalRoc.g:352:4: ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) )
                    {
                    // InternalRoc.g:352:4: ( (lv_intensity_1_0= ruleIntensity ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=34 && LA4_0<=38)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalRoc.g:353:5: (lv_intensity_1_0= ruleIntensity )
                            {
                            // InternalRoc.g:353:5: (lv_intensity_1_0= ruleIntensity )
                            // InternalRoc.g:354:6: lv_intensity_1_0= ruleIntensity
                            {

                            						newCompositeNode(grammarAccess.getActionAccess().getIntensityIntensityEnumRuleCall_1_0_0());
                            					
                            pushFollow(FOLLOW_12);
                            lv_intensity_1_0=ruleIntensity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getActionRule());
                            						}
                            						set(
                            							current,
                            							"intensity",
                            							lv_intensity_1_0,
                            							"robotcontrol.Roc.Intensity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalRoc.g:371:4: ( (lv_actionHolder_2_0= ruleSingleAction ) )
                    // InternalRoc.g:372:5: (lv_actionHolder_2_0= ruleSingleAction )
                    {
                    // InternalRoc.g:372:5: (lv_actionHolder_2_0= ruleSingleAction )
                    // InternalRoc.g:373:6: lv_actionHolder_2_0= ruleSingleAction
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
                    							"robotcontrol.Roc.SingleAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:392:3: ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) )
                    {
                    // InternalRoc.g:392:3: ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) )
                    // InternalRoc.g:393:4: ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) )
                    {
                    // InternalRoc.g:393:4: ( (lv_intensity_3_0= ruleIntensity ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=34 && LA5_0<=38)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalRoc.g:394:5: (lv_intensity_3_0= ruleIntensity )
                            {
                            // InternalRoc.g:394:5: (lv_intensity_3_0= ruleIntensity )
                            // InternalRoc.g:395:6: lv_intensity_3_0= ruleIntensity
                            {

                            						newCompositeNode(grammarAccess.getActionAccess().getIntensityIntensityEnumRuleCall_2_0_0());
                            					
                            pushFollow(FOLLOW_13);
                            lv_intensity_3_0=ruleIntensity();

                            state._fsp--;


                            						if (current==null) {
                            							current = createModelElementForParent(grammarAccess.getActionRule());
                            						}
                            						set(
                            							current,
                            							"intensity",
                            							lv_intensity_3_0,
                            							"robotcontrol.Roc.Intensity");
                            						afterParserOrEnumRuleCall();
                            					

                            }


                            }
                            break;

                    }

                    // InternalRoc.g:412:4: ( (lv_actionHolder_4_0= ruleDirectedAction ) )
                    // InternalRoc.g:413:5: (lv_actionHolder_4_0= ruleDirectedAction )
                    {
                    // InternalRoc.g:413:5: (lv_actionHolder_4_0= ruleDirectedAction )
                    // InternalRoc.g:414:6: lv_actionHolder_4_0= ruleDirectedAction
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
                    							"robotcontrol.Roc.DirectedAction");
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
    // InternalRoc.g:436:1: entryRuleCompleteAction returns [EObject current=null] : iv_ruleCompleteAction= ruleCompleteAction EOF ;
    public final EObject entryRuleCompleteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteAction = null;


        try {
            // InternalRoc.g:436:55: (iv_ruleCompleteAction= ruleCompleteAction EOF )
            // InternalRoc.g:437:2: iv_ruleCompleteAction= ruleCompleteAction EOF
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
    // InternalRoc.g:443:1: ruleCompleteAction returns [EObject current=null] : ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' ) ;
    public final EObject ruleCompleteAction() throws RecognitionException {
        EObject current = null;

        Token lv_actionName_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoc.g:449:2: ( ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' ) )
            // InternalRoc.g:450:2: ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' )
            {
            // InternalRoc.g:450:2: ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' )
            // InternalRoc.g:451:3: ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face'
            {
            // InternalRoc.g:451:3: ( (lv_actionName_0_0= 'neutral' ) )
            // InternalRoc.g:452:4: (lv_actionName_0_0= 'neutral' )
            {
            // InternalRoc.g:452:4: (lv_actionName_0_0= 'neutral' )
            // InternalRoc.g:453:5: lv_actionName_0_0= 'neutral'
            {
            lv_actionName_0_0=(Token)match(input,17,FOLLOW_14); 

            					newLeafNode(lv_actionName_0_0, grammarAccess.getCompleteActionAccess().getActionNameNeutralKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCompleteActionRule());
            					}
            					setWithLastConsumed(current, "actionName", lv_actionName_0_0, "neutral");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_2); 

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
    // InternalRoc.g:473:1: entryRuleSingleAction returns [EObject current=null] : iv_ruleSingleAction= ruleSingleAction EOF ;
    public final EObject entryRuleSingleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAction = null;


        try {
            // InternalRoc.g:473:53: (iv_ruleSingleAction= ruleSingleAction EOF )
            // InternalRoc.g:474:2: iv_ruleSingleAction= ruleSingleAction EOF
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
    // InternalRoc.g:480:1: ruleSingleAction returns [EObject current=null] : ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod head' ) ) ) ;
    public final EObject ruleSingleAction() throws RecognitionException {
        EObject current = null;

        Token lv_actionName_0_0=null;
        Token lv_actionName_1_0=null;


        	enterRule();

        try {
            // InternalRoc.g:486:2: ( ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod head' ) ) ) )
            // InternalRoc.g:487:2: ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod head' ) ) )
            {
            // InternalRoc.g:487:2: ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod head' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==20) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoc.g:488:3: ( (lv_actionName_0_0= 'drop jaw' ) )
                    {
                    // InternalRoc.g:488:3: ( (lv_actionName_0_0= 'drop jaw' ) )
                    // InternalRoc.g:489:4: (lv_actionName_0_0= 'drop jaw' )
                    {
                    // InternalRoc.g:489:4: (lv_actionName_0_0= 'drop jaw' )
                    // InternalRoc.g:490:5: lv_actionName_0_0= 'drop jaw'
                    {
                    lv_actionName_0_0=(Token)match(input,19,FOLLOW_2); 

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
                    // InternalRoc.g:503:3: ( (lv_actionName_1_0= 'nod head' ) )
                    {
                    // InternalRoc.g:503:3: ( (lv_actionName_1_0= 'nod head' ) )
                    // InternalRoc.g:504:4: (lv_actionName_1_0= 'nod head' )
                    {
                    // InternalRoc.g:504:4: (lv_actionName_1_0= 'nod head' )
                    // InternalRoc.g:505:5: lv_actionName_1_0= 'nod head'
                    {
                    lv_actionName_1_0=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_actionName_1_0, grammarAccess.getSingleActionAccess().getActionNameNodHeadKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSingleActionRule());
                    					}
                    					setWithLastConsumed(current, "actionName", lv_actionName_1_0, "nod head");
                    				

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
    // InternalRoc.g:521:1: entryRuleDirectedAction returns [EObject current=null] : iv_ruleDirectedAction= ruleDirectedAction EOF ;
    public final EObject entryRuleDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedAction = null;


        try {
            // InternalRoc.g:521:55: (iv_ruleDirectedAction= ruleDirectedAction EOF )
            // InternalRoc.g:522:2: iv_ruleDirectedAction= ruleDirectedAction EOF
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
    // InternalRoc.g:528:1: ruleDirectedAction returns [EObject current=null] : ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) ) ) ;
    public final EObject ruleDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actionName_0_0 = null;

        EObject lv_direction_1_0 = null;

        EObject lv_actionName_2_0 = null;

        EObject lv_direction_3_0 = null;



        	enterRule();

        try {
            // InternalRoc.g:534:2: ( ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) ) ) )
            // InternalRoc.g:535:2: ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) ) )
            {
            // InternalRoc.g:535:2: ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==21) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=25 && LA8_0<=26)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoc.g:536:3: ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) )
                    {
                    // InternalRoc.g:536:3: ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) )
                    // InternalRoc.g:537:4: ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) )
                    {
                    // InternalRoc.g:537:4: ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) )
                    // InternalRoc.g:538:5: (lv_actionName_0_0= ruleLeftRightDirectedAction )
                    {
                    // InternalRoc.g:538:5: (lv_actionName_0_0= ruleLeftRightDirectedAction )
                    // InternalRoc.g:539:6: lv_actionName_0_0= ruleLeftRightDirectedAction
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getActionNameLeftRightDirectedActionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_actionName_0_0=ruleLeftRightDirectedAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedActionRule());
                    						}
                    						set(
                    							current,
                    							"actionName",
                    							lv_actionName_0_0,
                    							"robotcontrol.Roc.LeftRightDirectedAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRoc.g:556:4: ( (lv_direction_1_0= ruleLeftRightDirection ) )
                    // InternalRoc.g:557:5: (lv_direction_1_0= ruleLeftRightDirection )
                    {
                    // InternalRoc.g:557:5: (lv_direction_1_0= ruleLeftRightDirection )
                    // InternalRoc.g:558:6: lv_direction_1_0= ruleLeftRightDirection
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
                    							"robotcontrol.Roc.LeftRightDirection");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:577:3: ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) )
                    {
                    // InternalRoc.g:577:3: ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) )
                    // InternalRoc.g:578:4: ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) )
                    {
                    // InternalRoc.g:578:4: ( (lv_actionName_2_0= ruleFullDirectedAction ) )
                    // InternalRoc.g:579:5: (lv_actionName_2_0= ruleFullDirectedAction )
                    {
                    // InternalRoc.g:579:5: (lv_actionName_2_0= ruleFullDirectedAction )
                    // InternalRoc.g:580:6: lv_actionName_2_0= ruleFullDirectedAction
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getActionNameFullDirectedActionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_actionName_2_0=ruleFullDirectedAction();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedActionRule());
                    						}
                    						set(
                    							current,
                    							"actionName",
                    							lv_actionName_2_0,
                    							"robotcontrol.Roc.FullDirectedAction");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalRoc.g:597:4: ( (lv_direction_3_0= ruleDirection ) )
                    // InternalRoc.g:598:5: (lv_direction_3_0= ruleDirection )
                    {
                    // InternalRoc.g:598:5: (lv_direction_3_0= ruleDirection )
                    // InternalRoc.g:599:6: lv_direction_3_0= ruleDirection
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getDirectionDirectionParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_3_0=ruleDirection();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getDirectedActionRule());
                    						}
                    						set(
                    							current,
                    							"direction",
                    							lv_direction_3_0,
                    							"robotcontrol.Roc.Direction");
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
    // InternalRoc.g:621:1: entryRuleLeftRightDirectedAction returns [EObject current=null] : iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF ;
    public final EObject entryRuleLeftRightDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftRightDirectedAction = null;


        try {
            // InternalRoc.g:621:64: (iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF )
            // InternalRoc.g:622:2: iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF
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
    // InternalRoc.g:628:1: ruleLeftRightDirectedAction returns [EObject current=null] : ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' ) ;
    public final EObject ruleLeftRightDirectedAction() throws RecognitionException {
        EObject current = null;

        Token lv_tiltHead_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalRoc.g:634:2: ( ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' ) )
            // InternalRoc.g:635:2: ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' )
            {
            // InternalRoc.g:635:2: ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' )
            // InternalRoc.g:636:3: ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head'
            {
            // InternalRoc.g:636:3: ( (lv_tiltHead_0_0= 'tilt' ) )
            // InternalRoc.g:637:4: (lv_tiltHead_0_0= 'tilt' )
            {
            // InternalRoc.g:637:4: (lv_tiltHead_0_0= 'tilt' )
            // InternalRoc.g:638:5: lv_tiltHead_0_0= 'tilt'
            {
            lv_tiltHead_0_0=(Token)match(input,21,FOLLOW_17); 

            					newLeafNode(lv_tiltHead_0_0, grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltKeyword_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLeftRightDirectedActionRule());
            					}
            					setWithLastConsumed(current, "tiltHead", lv_tiltHead_0_0, "tilt");
            				

            }


            }

            otherlv_1=(Token)match(input,22,FOLLOW_2); 

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
    // InternalRoc.g:658:1: entryRuleLeftRightDirection returns [EObject current=null] : iv_ruleLeftRightDirection= ruleLeftRightDirection EOF ;
    public final EObject entryRuleLeftRightDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftRightDirection = null;


        try {
            // InternalRoc.g:658:59: (iv_ruleLeftRightDirection= ruleLeftRightDirection EOF )
            // InternalRoc.g:659:2: iv_ruleLeftRightDirection= ruleLeftRightDirection EOF
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
    // InternalRoc.g:665:1: ruleLeftRightDirection returns [EObject current=null] : ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) ) ;
    public final EObject ruleLeftRightDirection() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;


        	enterRule();

        try {
            // InternalRoc.g:671:2: ( ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) ) )
            // InternalRoc.g:672:2: ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) )
            {
            // InternalRoc.g:672:2: ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) )
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
                    // InternalRoc.g:673:3: ( (lv_left_0_0= 'left' ) )
                    {
                    // InternalRoc.g:673:3: ( (lv_left_0_0= 'left' ) )
                    // InternalRoc.g:674:4: (lv_left_0_0= 'left' )
                    {
                    // InternalRoc.g:674:4: (lv_left_0_0= 'left' )
                    // InternalRoc.g:675:5: lv_left_0_0= 'left'
                    {
                    lv_left_0_0=(Token)match(input,23,FOLLOW_2); 

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
                    // InternalRoc.g:688:3: ( (lv_right_1_0= 'right' ) )
                    {
                    // InternalRoc.g:688:3: ( (lv_right_1_0= 'right' ) )
                    // InternalRoc.g:689:4: (lv_right_1_0= 'right' )
                    {
                    // InternalRoc.g:689:4: (lv_right_1_0= 'right' )
                    // InternalRoc.g:690:5: lv_right_1_0= 'right'
                    {
                    lv_right_1_0=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleFullDirectedAction"
    // InternalRoc.g:706:1: entryRuleFullDirectedAction returns [EObject current=null] : iv_ruleFullDirectedAction= ruleFullDirectedAction EOF ;
    public final EObject entryRuleFullDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullDirectedAction = null;


        try {
            // InternalRoc.g:706:59: (iv_ruleFullDirectedAction= ruleFullDirectedAction EOF )
            // InternalRoc.g:707:2: iv_ruleFullDirectedAction= ruleFullDirectedAction EOF
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
    // InternalRoc.g:713:1: ruleFullDirectedAction returns [EObject current=null] : ( ( (lv_turnHead_0_0= 'turn head' ) ) | ( (lv_turnEyes_1_0= 'turn eyes' ) ) ) ;
    public final EObject ruleFullDirectedAction() throws RecognitionException {
        EObject current = null;

        Token lv_turnHead_0_0=null;
        Token lv_turnEyes_1_0=null;


        	enterRule();

        try {
            // InternalRoc.g:719:2: ( ( ( (lv_turnHead_0_0= 'turn head' ) ) | ( (lv_turnEyes_1_0= 'turn eyes' ) ) ) )
            // InternalRoc.g:720:2: ( ( (lv_turnHead_0_0= 'turn head' ) ) | ( (lv_turnEyes_1_0= 'turn eyes' ) ) )
            {
            // InternalRoc.g:720:2: ( ( (lv_turnHead_0_0= 'turn head' ) ) | ( (lv_turnEyes_1_0= 'turn eyes' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                alt10=1;
            }
            else if ( (LA10_0==26) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoc.g:721:3: ( (lv_turnHead_0_0= 'turn head' ) )
                    {
                    // InternalRoc.g:721:3: ( (lv_turnHead_0_0= 'turn head' ) )
                    // InternalRoc.g:722:4: (lv_turnHead_0_0= 'turn head' )
                    {
                    // InternalRoc.g:722:4: (lv_turnHead_0_0= 'turn head' )
                    // InternalRoc.g:723:5: lv_turnHead_0_0= 'turn head'
                    {
                    lv_turnHead_0_0=(Token)match(input,25,FOLLOW_2); 

                    					newLeafNode(lv_turnHead_0_0, grammarAccess.getFullDirectedActionAccess().getTurnHeadTurnHeadKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFullDirectedActionRule());
                    					}
                    					setWithLastConsumed(current, "turnHead", lv_turnHead_0_0, "turn head");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:736:3: ( (lv_turnEyes_1_0= 'turn eyes' ) )
                    {
                    // InternalRoc.g:736:3: ( (lv_turnEyes_1_0= 'turn eyes' ) )
                    // InternalRoc.g:737:4: (lv_turnEyes_1_0= 'turn eyes' )
                    {
                    // InternalRoc.g:737:4: (lv_turnEyes_1_0= 'turn eyes' )
                    // InternalRoc.g:738:5: lv_turnEyes_1_0= 'turn eyes'
                    {
                    lv_turnEyes_1_0=(Token)match(input,26,FOLLOW_2); 

                    					newLeafNode(lv_turnEyes_1_0, grammarAccess.getFullDirectedActionAccess().getTurnEyesTurnEyesKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFullDirectedActionRule());
                    					}
                    					setWithLastConsumed(current, "turnEyes", lv_turnEyes_1_0, "turn eyes");
                    				

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
    // $ANTLR end "ruleFullDirectedAction"


    // $ANTLR start "entryRuleDirection"
    // InternalRoc.g:754:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // InternalRoc.g:754:50: (iv_ruleDirection= ruleDirection EOF )
            // InternalRoc.g:755:2: iv_ruleDirection= ruleDirection EOF
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
    // InternalRoc.g:761:1: ruleDirection returns [EObject current=null] : ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Token lv_UP_0_0=null;
        Token lv_DOWN_1_0=null;
        Token lv_LEFT_2_0=null;
        Token lv_RIGHT_3_0=null;


        	enterRule();

        try {
            // InternalRoc.g:767:2: ( ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) ) )
            // InternalRoc.g:768:2: ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) )
            {
            // InternalRoc.g:768:2: ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) )
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
            case 23:
                {
                alt11=3;
                }
                break;
            case 24:
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
                    // InternalRoc.g:769:3: ( (lv_UP_0_0= 'up' ) )
                    {
                    // InternalRoc.g:769:3: ( (lv_UP_0_0= 'up' ) )
                    // InternalRoc.g:770:4: (lv_UP_0_0= 'up' )
                    {
                    // InternalRoc.g:770:4: (lv_UP_0_0= 'up' )
                    // InternalRoc.g:771:5: lv_UP_0_0= 'up'
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
                    // InternalRoc.g:784:3: ( (lv_DOWN_1_0= 'down' ) )
                    {
                    // InternalRoc.g:784:3: ( (lv_DOWN_1_0= 'down' ) )
                    // InternalRoc.g:785:4: (lv_DOWN_1_0= 'down' )
                    {
                    // InternalRoc.g:785:4: (lv_DOWN_1_0= 'down' )
                    // InternalRoc.g:786:5: lv_DOWN_1_0= 'down'
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
                    // InternalRoc.g:799:3: ( (lv_LEFT_2_0= 'left' ) )
                    {
                    // InternalRoc.g:799:3: ( (lv_LEFT_2_0= 'left' ) )
                    // InternalRoc.g:800:4: (lv_LEFT_2_0= 'left' )
                    {
                    // InternalRoc.g:800:4: (lv_LEFT_2_0= 'left' )
                    // InternalRoc.g:801:5: lv_LEFT_2_0= 'left'
                    {
                    lv_LEFT_2_0=(Token)match(input,23,FOLLOW_2); 

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
                    // InternalRoc.g:814:3: ( (lv_RIGHT_3_0= 'right' ) )
                    {
                    // InternalRoc.g:814:3: ( (lv_RIGHT_3_0= 'right' ) )
                    // InternalRoc.g:815:4: (lv_RIGHT_3_0= 'right' )
                    {
                    // InternalRoc.g:815:4: (lv_RIGHT_3_0= 'right' )
                    // InternalRoc.g:816:5: lv_RIGHT_3_0= 'right'
                    {
                    lv_RIGHT_3_0=(Token)match(input,24,FOLLOW_2); 

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


    // $ANTLR start "entryRuleSpeed"
    // InternalRoc.g:832:1: entryRuleSpeed returns [EObject current=null] : iv_ruleSpeed= ruleSpeed EOF ;
    public final EObject entryRuleSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeed = null;


        try {
            // InternalRoc.g:832:46: (iv_ruleSpeed= ruleSpeed EOF )
            // InternalRoc.g:833:2: iv_ruleSpeed= ruleSpeed EOF
            {
             newCompositeNode(grammarAccess.getSpeedRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSpeed=ruleSpeed();

            state._fsp--;

             current =iv_ruleSpeed; 
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
    // $ANTLR end "entryRuleSpeed"


    // $ANTLR start "ruleSpeed"
    // InternalRoc.g:839:1: ruleSpeed returns [EObject current=null] : ( ( (lv_SLOWEST_0_0= 'slowest' ) ) | ( (lv_SLOW_1_0= 'slow' ) ) | ( (lv_NORMAL_2_0= 'normal' ) ) | ( (lv_FAST_3_0= 'fast' ) ) | ( (lv_FULL_4_0= 'full' ) ) ) ;
    public final EObject ruleSpeed() throws RecognitionException {
        EObject current = null;

        Token lv_SLOWEST_0_0=null;
        Token lv_SLOW_1_0=null;
        Token lv_NORMAL_2_0=null;
        Token lv_FAST_3_0=null;
        Token lv_FULL_4_0=null;


        	enterRule();

        try {
            // InternalRoc.g:845:2: ( ( ( (lv_SLOWEST_0_0= 'slowest' ) ) | ( (lv_SLOW_1_0= 'slow' ) ) | ( (lv_NORMAL_2_0= 'normal' ) ) | ( (lv_FAST_3_0= 'fast' ) ) | ( (lv_FULL_4_0= 'full' ) ) ) )
            // InternalRoc.g:846:2: ( ( (lv_SLOWEST_0_0= 'slowest' ) ) | ( (lv_SLOW_1_0= 'slow' ) ) | ( (lv_NORMAL_2_0= 'normal' ) ) | ( (lv_FAST_3_0= 'fast' ) ) | ( (lv_FULL_4_0= 'full' ) ) )
            {
            // InternalRoc.g:846:2: ( ( (lv_SLOWEST_0_0= 'slowest' ) ) | ( (lv_SLOW_1_0= 'slow' ) ) | ( (lv_NORMAL_2_0= 'normal' ) ) | ( (lv_FAST_3_0= 'fast' ) ) | ( (lv_FULL_4_0= 'full' ) ) )
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
                    // InternalRoc.g:847:3: ( (lv_SLOWEST_0_0= 'slowest' ) )
                    {
                    // InternalRoc.g:847:3: ( (lv_SLOWEST_0_0= 'slowest' ) )
                    // InternalRoc.g:848:4: (lv_SLOWEST_0_0= 'slowest' )
                    {
                    // InternalRoc.g:848:4: (lv_SLOWEST_0_0= 'slowest' )
                    // InternalRoc.g:849:5: lv_SLOWEST_0_0= 'slowest'
                    {
                    lv_SLOWEST_0_0=(Token)match(input,29,FOLLOW_2); 

                    					newLeafNode(lv_SLOWEST_0_0, grammarAccess.getSpeedAccess().getSLOWESTSlowestKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpeedRule());
                    					}
                    					setWithLastConsumed(current, "SLOWEST", lv_SLOWEST_0_0, "slowest");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:862:3: ( (lv_SLOW_1_0= 'slow' ) )
                    {
                    // InternalRoc.g:862:3: ( (lv_SLOW_1_0= 'slow' ) )
                    // InternalRoc.g:863:4: (lv_SLOW_1_0= 'slow' )
                    {
                    // InternalRoc.g:863:4: (lv_SLOW_1_0= 'slow' )
                    // InternalRoc.g:864:5: lv_SLOW_1_0= 'slow'
                    {
                    lv_SLOW_1_0=(Token)match(input,30,FOLLOW_2); 

                    					newLeafNode(lv_SLOW_1_0, grammarAccess.getSpeedAccess().getSLOWSlowKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpeedRule());
                    					}
                    					setWithLastConsumed(current, "SLOW", lv_SLOW_1_0, "slow");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:877:3: ( (lv_NORMAL_2_0= 'normal' ) )
                    {
                    // InternalRoc.g:877:3: ( (lv_NORMAL_2_0= 'normal' ) )
                    // InternalRoc.g:878:4: (lv_NORMAL_2_0= 'normal' )
                    {
                    // InternalRoc.g:878:4: (lv_NORMAL_2_0= 'normal' )
                    // InternalRoc.g:879:5: lv_NORMAL_2_0= 'normal'
                    {
                    lv_NORMAL_2_0=(Token)match(input,31,FOLLOW_2); 

                    					newLeafNode(lv_NORMAL_2_0, grammarAccess.getSpeedAccess().getNORMALNormalKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpeedRule());
                    					}
                    					setWithLastConsumed(current, "NORMAL", lv_NORMAL_2_0, "normal");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalRoc.g:892:3: ( (lv_FAST_3_0= 'fast' ) )
                    {
                    // InternalRoc.g:892:3: ( (lv_FAST_3_0= 'fast' ) )
                    // InternalRoc.g:893:4: (lv_FAST_3_0= 'fast' )
                    {
                    // InternalRoc.g:893:4: (lv_FAST_3_0= 'fast' )
                    // InternalRoc.g:894:5: lv_FAST_3_0= 'fast'
                    {
                    lv_FAST_3_0=(Token)match(input,32,FOLLOW_2); 

                    					newLeafNode(lv_FAST_3_0, grammarAccess.getSpeedAccess().getFASTFastKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpeedRule());
                    					}
                    					setWithLastConsumed(current, "FAST", lv_FAST_3_0, "fast");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalRoc.g:907:3: ( (lv_FULL_4_0= 'full' ) )
                    {
                    // InternalRoc.g:907:3: ( (lv_FULL_4_0= 'full' ) )
                    // InternalRoc.g:908:4: (lv_FULL_4_0= 'full' )
                    {
                    // InternalRoc.g:908:4: (lv_FULL_4_0= 'full' )
                    // InternalRoc.g:909:5: lv_FULL_4_0= 'full'
                    {
                    lv_FULL_4_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_FULL_4_0, grammarAccess.getSpeedAccess().getFULLFullKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getSpeedRule());
                    					}
                    					setWithLastConsumed(current, "FULL", lv_FULL_4_0, "full");
                    				

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
    // $ANTLR end "ruleSpeed"


    // $ANTLR start "ruleIntensity"
    // InternalRoc.g:925:1: ruleIntensity returns [Enumerator current=null] : ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) ) ;
    public final Enumerator ruleIntensity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRoc.g:931:2: ( ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) ) )
            // InternalRoc.g:932:2: ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) )
            {
            // InternalRoc.g:932:2: ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) )
            int alt13=5;
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
            case 37:
                {
                alt13=4;
                }
                break;
            case 38:
                {
                alt13=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalRoc.g:933:3: (enumLiteral_0= 'pronounced' )
                    {
                    // InternalRoc.g:933:3: (enumLiteral_0= 'pronounced' )
                    // InternalRoc.g:934:4: enumLiteral_0= 'pronounced'
                    {
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:941:3: (enumLiteral_1= 'trace of' )
                    {
                    // InternalRoc.g:941:3: (enumLiteral_1= 'trace of' )
                    // InternalRoc.g:942:4: enumLiteral_1= 'trace of'
                    {
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:949:3: (enumLiteral_2= 'slightly' )
                    {
                    // InternalRoc.g:949:3: (enumLiteral_2= 'slightly' )
                    // InternalRoc.g:950:4: enumLiteral_2= 'slightly'
                    {
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRoc.g:957:3: (enumLiteral_3= 'severe' )
                    {
                    // InternalRoc.g:957:3: (enumLiteral_3= 'severe' )
                    // InternalRoc.g:958:4: enumLiteral_3= 'severe'
                    {
                    enumLiteral_3=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRoc.g:965:3: (enumLiteral_4= 'maximum' )
                    {
                    // InternalRoc.g:965:3: (enumLiteral_4= 'maximum' )
                    // InternalRoc.g:966:4: enumLiteral_4= 'maximum'
                    {
                    enumLiteral_4=(Token)match(input,38,FOLLOW_2); 

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
    // InternalRoc.g:976:1: ruleDurationUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) ;
    public final Enumerator ruleDurationUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRoc.g:982:2: ( ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) )
            // InternalRoc.g:983:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            {
            // InternalRoc.g:983:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt14=1;
                }
                break;
            case 40:
                {
                alt14=2;
                }
                break;
            case 41:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalRoc.g:984:3: (enumLiteral_0= 'milliseconds' )
                    {
                    // InternalRoc.g:984:3: (enumLiteral_0= 'milliseconds' )
                    // InternalRoc.g:985:4: enumLiteral_0= 'milliseconds'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_2); 

                    				current = grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:992:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalRoc.g:992:3: (enumLiteral_1= 'seconds' )
                    // InternalRoc.g:993:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_2); 

                    				current = grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:1000:3: (enumLiteral_2= 'minutes' )
                    {
                    // InternalRoc.g:1000:3: (enumLiteral_2= 'minutes' )
                    // InternalRoc.g:1001:4: enumLiteral_2= 'minutes'
                    {
                    enumLiteral_2=(Token)match(input,41,FOLLOW_2); 

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


    protected DFA3 dfa3 = new DFA3(this);
    static final String dfa_1s = "\26\uffff";
    static final String dfa_2s = "\1\21\1\22\5\23\2\6\1\26\2\27\1\6\2\uffff\1\27\6\6";
    static final String dfa_3s = "\1\46\1\22\5\32\2\10\1\26\2\34\1\10\2\uffff\1\30\6\10";
    static final String dfa_4s = "\15\uffff\1\2\1\1\7\uffff";
    static final String dfa_5s = "\26\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\uffff\1\7\1\10\1\11\3\uffff\1\12\1\13\7\uffff\1\2\1\3\1\4\1\5\1\6",
            "\1\14",
            "\1\7\1\10\1\11\3\uffff\1\12\1\13",
            "\1\7\1\10\1\11\3\uffff\1\12\1\13",
            "\1\7\1\10\1\11\3\uffff\1\12\1\13",
            "\1\7\1\10\1\11\3\uffff\1\12\1\13",
            "\1\7\1\10\1\11\3\uffff\1\12\1\13",
            "\1\16\1\uffff\1\15",
            "\1\16\1\uffff\1\15",
            "\1\17",
            "\1\22\1\23\2\uffff\1\20\1\21",
            "\1\22\1\23\2\uffff\1\20\1\21",
            "\1\16\1\uffff\1\15",
            "",
            "",
            "\1\24\1\25",
            "\1\16\1\uffff\1\15",
            "\1\16\1\uffff\1\15",
            "\1\16\1\uffff\1\15",
            "\1\16\1\uffff\1\15",
            "\1\16\1\uffff\1\15",
            "\1\16\1\uffff\1\15"
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
            return "200:2: ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) | ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000007C063A0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000007C063A0030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000038000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000003E0000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000007C00180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000007C063A0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000019800000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});

}