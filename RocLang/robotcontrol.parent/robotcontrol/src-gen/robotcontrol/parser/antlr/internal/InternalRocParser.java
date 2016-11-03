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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_AND", "RULE_PERIOD", "RULE_FOR", "RULE_DURATION", "RULE_WITH", "RULE_SPEED_KEY", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'neutral face'", "'drop jaw'", "'nod head'", "'tilt head'", "'left'", "'right'", "'turn head'", "'turn eyes'", "'up'", "'down'", "'slowest'", "'slow'", "'normal'", "'fast'", "'full'", "'pronounced'", "'trace of'", "'slightly'", "'severe'", "'maximum'", "'milliseconds'", "'seconds'", "'minutes'"
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

                if ( ((LA1_0>=17 && LA1_0<=20)||(LA1_0>=23 && LA1_0<=24)||(LA1_0>=32 && LA1_0<=36)) ) {
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
    // InternalRoc.g:193:1: ruleMotion returns [EObject current=null] : ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) | ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY ) | ( (lv_action_8_0= ruleAction ) ) ) ;
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

        EObject lv_action_8_0 = null;



        	enterRule();

        try {
            // InternalRoc.g:199:2: ( ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) | ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY ) | ( (lv_action_8_0= ruleAction ) ) ) )
            // InternalRoc.g:200:2: ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) | ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY ) | ( (lv_action_8_0= ruleAction ) ) )
            {
            // InternalRoc.g:200:2: ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) | ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY ) | ( (lv_action_8_0= ruleAction ) ) )
            int alt3=3;
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
                case 3 :
                    // InternalRoc.g:313:3: ( (lv_action_8_0= ruleAction ) )
                    {
                    // InternalRoc.g:313:3: ( (lv_action_8_0= ruleAction ) )
                    // InternalRoc.g:314:4: (lv_action_8_0= ruleAction )
                    {
                    // InternalRoc.g:314:4: (lv_action_8_0= ruleAction )
                    // InternalRoc.g:315:5: lv_action_8_0= ruleAction
                    {

                    					newCompositeNode(grammarAccess.getMotionAccess().getActionActionParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_action_8_0=ruleAction();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMotionRule());
                    					}
                    					set(
                    						current,
                    						"action",
                    						lv_action_8_0,
                    						"robotcontrol.Roc.Action");
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
    // $ANTLR end "ruleMotion"


    // $ANTLR start "entryRuleAction"
    // InternalRoc.g:336:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalRoc.g:336:47: (iv_ruleAction= ruleAction EOF )
            // InternalRoc.g:337:2: iv_ruleAction= ruleAction EOF
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
    // InternalRoc.g:343:1: ruleAction returns [EObject current=null] : ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actionHolder_0_0 = null;

        Enumerator lv_intensity_1_0 = null;

        EObject lv_actionHolder_2_0 = null;

        Enumerator lv_intensity_3_0 = null;

        EObject lv_actionHolder_4_0 = null;



        	enterRule();

        try {
            // InternalRoc.g:349:2: ( ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) ) )
            // InternalRoc.g:350:2: ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) )
            {
            // InternalRoc.g:350:2: ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                int LA6_2 = input.LA(2);

                if ( (LA6_2==20||(LA6_2>=23 && LA6_2<=24)) ) {
                    alt6=3;
                }
                else if ( ((LA6_2>=18 && LA6_2<=19)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 2, input);

                    throw nvae;
                }
                }
                break;
            case 33:
                {
                int LA6_3 = input.LA(2);

                if ( ((LA6_3>=18 && LA6_3<=19)) ) {
                    alt6=2;
                }
                else if ( (LA6_3==20||(LA6_3>=23 && LA6_3<=24)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 3, input);

                    throw nvae;
                }
                }
                break;
            case 34:
                {
                int LA6_4 = input.LA(2);

                if ( ((LA6_4>=18 && LA6_4<=19)) ) {
                    alt6=2;
                }
                else if ( (LA6_4==20||(LA6_4>=23 && LA6_4<=24)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;
                }
                }
                break;
            case 35:
                {
                int LA6_5 = input.LA(2);

                if ( (LA6_5==20||(LA6_5>=23 && LA6_5<=24)) ) {
                    alt6=3;
                }
                else if ( ((LA6_5>=18 && LA6_5<=19)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 5, input);

                    throw nvae;
                }
                }
                break;
            case 36:
                {
                int LA6_6 = input.LA(2);

                if ( ((LA6_6>=18 && LA6_6<=19)) ) {
                    alt6=2;
                }
                else if ( (LA6_6==20||(LA6_6>=23 && LA6_6<=24)) ) {
                    alt6=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 6, input);

                    throw nvae;
                }
                }
                break;
            case 18:
            case 19:
                {
                alt6=2;
                }
                break;
            case 20:
            case 23:
            case 24:
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
                    // InternalRoc.g:351:3: ( (lv_actionHolder_0_0= ruleCompleteAction ) )
                    {
                    // InternalRoc.g:351:3: ( (lv_actionHolder_0_0= ruleCompleteAction ) )
                    // InternalRoc.g:352:4: (lv_actionHolder_0_0= ruleCompleteAction )
                    {
                    // InternalRoc.g:352:4: (lv_actionHolder_0_0= ruleCompleteAction )
                    // InternalRoc.g:353:5: lv_actionHolder_0_0= ruleCompleteAction
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
                    // InternalRoc.g:371:3: ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) )
                    {
                    // InternalRoc.g:371:3: ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) )
                    // InternalRoc.g:372:4: ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) )
                    {
                    // InternalRoc.g:372:4: ( (lv_intensity_1_0= ruleIntensity ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=32 && LA4_0<=36)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalRoc.g:373:5: (lv_intensity_1_0= ruleIntensity )
                            {
                            // InternalRoc.g:373:5: (lv_intensity_1_0= ruleIntensity )
                            // InternalRoc.g:374:6: lv_intensity_1_0= ruleIntensity
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

                    // InternalRoc.g:391:4: ( (lv_actionHolder_2_0= ruleSingleAction ) )
                    // InternalRoc.g:392:5: (lv_actionHolder_2_0= ruleSingleAction )
                    {
                    // InternalRoc.g:392:5: (lv_actionHolder_2_0= ruleSingleAction )
                    // InternalRoc.g:393:6: lv_actionHolder_2_0= ruleSingleAction
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
                    // InternalRoc.g:412:3: ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) )
                    {
                    // InternalRoc.g:412:3: ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) )
                    // InternalRoc.g:413:4: ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) )
                    {
                    // InternalRoc.g:413:4: ( (lv_intensity_3_0= ruleIntensity ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=32 && LA5_0<=36)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalRoc.g:414:5: (lv_intensity_3_0= ruleIntensity )
                            {
                            // InternalRoc.g:414:5: (lv_intensity_3_0= ruleIntensity )
                            // InternalRoc.g:415:6: lv_intensity_3_0= ruleIntensity
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

                    // InternalRoc.g:432:4: ( (lv_actionHolder_4_0= ruleDirectedAction ) )
                    // InternalRoc.g:433:5: (lv_actionHolder_4_0= ruleDirectedAction )
                    {
                    // InternalRoc.g:433:5: (lv_actionHolder_4_0= ruleDirectedAction )
                    // InternalRoc.g:434:6: lv_actionHolder_4_0= ruleDirectedAction
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
    // InternalRoc.g:456:1: entryRuleCompleteAction returns [EObject current=null] : iv_ruleCompleteAction= ruleCompleteAction EOF ;
    public final EObject entryRuleCompleteAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCompleteAction = null;


        try {
            // InternalRoc.g:456:55: (iv_ruleCompleteAction= ruleCompleteAction EOF )
            // InternalRoc.g:457:2: iv_ruleCompleteAction= ruleCompleteAction EOF
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
    // InternalRoc.g:463:1: ruleCompleteAction returns [EObject current=null] : ( (lv_actionName_0_0= 'neutral face' ) ) ;
    public final EObject ruleCompleteAction() throws RecognitionException {
        EObject current = null;

        Token lv_actionName_0_0=null;


        	enterRule();

        try {
            // InternalRoc.g:469:2: ( ( (lv_actionName_0_0= 'neutral face' ) ) )
            // InternalRoc.g:470:2: ( (lv_actionName_0_0= 'neutral face' ) )
            {
            // InternalRoc.g:470:2: ( (lv_actionName_0_0= 'neutral face' ) )
            // InternalRoc.g:471:3: (lv_actionName_0_0= 'neutral face' )
            {
            // InternalRoc.g:471:3: (lv_actionName_0_0= 'neutral face' )
            // InternalRoc.g:472:4: lv_actionName_0_0= 'neutral face'
            {
            lv_actionName_0_0=(Token)match(input,17,FOLLOW_2); 

            				newLeafNode(lv_actionName_0_0, grammarAccess.getCompleteActionAccess().getActionNameNeutralFaceKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getCompleteActionRule());
            				}
            				setWithLastConsumed(current, "actionName", lv_actionName_0_0, "neutral face");
            			

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
    // $ANTLR end "ruleCompleteAction"


    // $ANTLR start "entryRuleSingleAction"
    // InternalRoc.g:487:1: entryRuleSingleAction returns [EObject current=null] : iv_ruleSingleAction= ruleSingleAction EOF ;
    public final EObject entryRuleSingleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleAction = null;


        try {
            // InternalRoc.g:487:53: (iv_ruleSingleAction= ruleSingleAction EOF )
            // InternalRoc.g:488:2: iv_ruleSingleAction= ruleSingleAction EOF
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
    // InternalRoc.g:494:1: ruleSingleAction returns [EObject current=null] : ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod head' ) ) ) ;
    public final EObject ruleSingleAction() throws RecognitionException {
        EObject current = null;

        Token lv_actionName_0_0=null;
        Token lv_actionName_1_0=null;


        	enterRule();

        try {
            // InternalRoc.g:500:2: ( ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod head' ) ) ) )
            // InternalRoc.g:501:2: ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod head' ) ) )
            {
            // InternalRoc.g:501:2: ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod head' ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            else if ( (LA7_0==19) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalRoc.g:502:3: ( (lv_actionName_0_0= 'drop jaw' ) )
                    {
                    // InternalRoc.g:502:3: ( (lv_actionName_0_0= 'drop jaw' ) )
                    // InternalRoc.g:503:4: (lv_actionName_0_0= 'drop jaw' )
                    {
                    // InternalRoc.g:503:4: (lv_actionName_0_0= 'drop jaw' )
                    // InternalRoc.g:504:5: lv_actionName_0_0= 'drop jaw'
                    {
                    lv_actionName_0_0=(Token)match(input,18,FOLLOW_2); 

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
                    // InternalRoc.g:517:3: ( (lv_actionName_1_0= 'nod head' ) )
                    {
                    // InternalRoc.g:517:3: ( (lv_actionName_1_0= 'nod head' ) )
                    // InternalRoc.g:518:4: (lv_actionName_1_0= 'nod head' )
                    {
                    // InternalRoc.g:518:4: (lv_actionName_1_0= 'nod head' )
                    // InternalRoc.g:519:5: lv_actionName_1_0= 'nod head'
                    {
                    lv_actionName_1_0=(Token)match(input,19,FOLLOW_2); 

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
    // InternalRoc.g:535:1: entryRuleDirectedAction returns [EObject current=null] : iv_ruleDirectedAction= ruleDirectedAction EOF ;
    public final EObject entryRuleDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirectedAction = null;


        try {
            // InternalRoc.g:535:55: (iv_ruleDirectedAction= ruleDirectedAction EOF )
            // InternalRoc.g:536:2: iv_ruleDirectedAction= ruleDirectedAction EOF
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
    // InternalRoc.g:542:1: ruleDirectedAction returns [EObject current=null] : ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) ) ) ;
    public final EObject ruleDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject lv_actionName_0_0 = null;

        EObject lv_direction_1_0 = null;

        EObject lv_actionName_2_0 = null;

        EObject lv_direction_3_0 = null;



        	enterRule();

        try {
            // InternalRoc.g:548:2: ( ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) ) ) )
            // InternalRoc.g:549:2: ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) ) )
            {
            // InternalRoc.g:549:2: ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( ((LA8_0>=23 && LA8_0<=24)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalRoc.g:550:3: ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) )
                    {
                    // InternalRoc.g:550:3: ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) )
                    // InternalRoc.g:551:4: ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) )
                    {
                    // InternalRoc.g:551:4: ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) )
                    // InternalRoc.g:552:5: (lv_actionName_0_0= ruleLeftRightDirectedAction )
                    {
                    // InternalRoc.g:552:5: (lv_actionName_0_0= ruleLeftRightDirectedAction )
                    // InternalRoc.g:553:6: lv_actionName_0_0= ruleLeftRightDirectedAction
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getActionNameLeftRightDirectedActionParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_14);
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

                    // InternalRoc.g:570:4: ( (lv_direction_1_0= ruleLeftRightDirection ) )
                    // InternalRoc.g:571:5: (lv_direction_1_0= ruleLeftRightDirection )
                    {
                    // InternalRoc.g:571:5: (lv_direction_1_0= ruleLeftRightDirection )
                    // InternalRoc.g:572:6: lv_direction_1_0= ruleLeftRightDirection
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
                    // InternalRoc.g:591:3: ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) )
                    {
                    // InternalRoc.g:591:3: ( ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) ) )
                    // InternalRoc.g:592:4: ( (lv_actionName_2_0= ruleFullDirectedAction ) ) ( (lv_direction_3_0= ruleDirection ) )
                    {
                    // InternalRoc.g:592:4: ( (lv_actionName_2_0= ruleFullDirectedAction ) )
                    // InternalRoc.g:593:5: (lv_actionName_2_0= ruleFullDirectedAction )
                    {
                    // InternalRoc.g:593:5: (lv_actionName_2_0= ruleFullDirectedAction )
                    // InternalRoc.g:594:6: lv_actionName_2_0= ruleFullDirectedAction
                    {

                    						newCompositeNode(grammarAccess.getDirectedActionAccess().getActionNameFullDirectedActionParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_15);
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

                    // InternalRoc.g:611:4: ( (lv_direction_3_0= ruleDirection ) )
                    // InternalRoc.g:612:5: (lv_direction_3_0= ruleDirection )
                    {
                    // InternalRoc.g:612:5: (lv_direction_3_0= ruleDirection )
                    // InternalRoc.g:613:6: lv_direction_3_0= ruleDirection
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
    // InternalRoc.g:635:1: entryRuleLeftRightDirectedAction returns [EObject current=null] : iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF ;
    public final EObject entryRuleLeftRightDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftRightDirectedAction = null;


        try {
            // InternalRoc.g:635:64: (iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF )
            // InternalRoc.g:636:2: iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF
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
    // InternalRoc.g:642:1: ruleLeftRightDirectedAction returns [EObject current=null] : ( (lv_tiltHead_0_0= 'tilt head' ) ) ;
    public final EObject ruleLeftRightDirectedAction() throws RecognitionException {
        EObject current = null;

        Token lv_tiltHead_0_0=null;


        	enterRule();

        try {
            // InternalRoc.g:648:2: ( ( (lv_tiltHead_0_0= 'tilt head' ) ) )
            // InternalRoc.g:649:2: ( (lv_tiltHead_0_0= 'tilt head' ) )
            {
            // InternalRoc.g:649:2: ( (lv_tiltHead_0_0= 'tilt head' ) )
            // InternalRoc.g:650:3: (lv_tiltHead_0_0= 'tilt head' )
            {
            // InternalRoc.g:650:3: (lv_tiltHead_0_0= 'tilt head' )
            // InternalRoc.g:651:4: lv_tiltHead_0_0= 'tilt head'
            {
            lv_tiltHead_0_0=(Token)match(input,20,FOLLOW_2); 

            				newLeafNode(lv_tiltHead_0_0, grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltHeadKeyword_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getLeftRightDirectedActionRule());
            				}
            				setWithLastConsumed(current, "tiltHead", lv_tiltHead_0_0, "tilt head");
            			

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
    // $ANTLR end "ruleLeftRightDirectedAction"


    // $ANTLR start "entryRuleLeftRightDirection"
    // InternalRoc.g:666:1: entryRuleLeftRightDirection returns [EObject current=null] : iv_ruleLeftRightDirection= ruleLeftRightDirection EOF ;
    public final EObject entryRuleLeftRightDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLeftRightDirection = null;


        try {
            // InternalRoc.g:666:59: (iv_ruleLeftRightDirection= ruleLeftRightDirection EOF )
            // InternalRoc.g:667:2: iv_ruleLeftRightDirection= ruleLeftRightDirection EOF
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
    // InternalRoc.g:673:1: ruleLeftRightDirection returns [EObject current=null] : ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) ) ;
    public final EObject ruleLeftRightDirection() throws RecognitionException {
        EObject current = null;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;


        	enterRule();

        try {
            // InternalRoc.g:679:2: ( ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) ) )
            // InternalRoc.g:680:2: ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) )
            {
            // InternalRoc.g:680:2: ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            else if ( (LA9_0==22) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalRoc.g:681:3: ( (lv_left_0_0= 'left' ) )
                    {
                    // InternalRoc.g:681:3: ( (lv_left_0_0= 'left' ) )
                    // InternalRoc.g:682:4: (lv_left_0_0= 'left' )
                    {
                    // InternalRoc.g:682:4: (lv_left_0_0= 'left' )
                    // InternalRoc.g:683:5: lv_left_0_0= 'left'
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
                    // InternalRoc.g:696:3: ( (lv_right_1_0= 'right' ) )
                    {
                    // InternalRoc.g:696:3: ( (lv_right_1_0= 'right' ) )
                    // InternalRoc.g:697:4: (lv_right_1_0= 'right' )
                    {
                    // InternalRoc.g:697:4: (lv_right_1_0= 'right' )
                    // InternalRoc.g:698:5: lv_right_1_0= 'right'
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


    // $ANTLR start "entryRuleFullDirectedAction"
    // InternalRoc.g:714:1: entryRuleFullDirectedAction returns [EObject current=null] : iv_ruleFullDirectedAction= ruleFullDirectedAction EOF ;
    public final EObject entryRuleFullDirectedAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFullDirectedAction = null;


        try {
            // InternalRoc.g:714:59: (iv_ruleFullDirectedAction= ruleFullDirectedAction EOF )
            // InternalRoc.g:715:2: iv_ruleFullDirectedAction= ruleFullDirectedAction EOF
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
    // InternalRoc.g:721:1: ruleFullDirectedAction returns [EObject current=null] : ( ( (lv_turnHead_0_0= 'turn head' ) ) | ( (lv_turnEyes_1_0= 'turn eyes' ) ) ) ;
    public final EObject ruleFullDirectedAction() throws RecognitionException {
        EObject current = null;

        Token lv_turnHead_0_0=null;
        Token lv_turnEyes_1_0=null;


        	enterRule();

        try {
            // InternalRoc.g:727:2: ( ( ( (lv_turnHead_0_0= 'turn head' ) ) | ( (lv_turnEyes_1_0= 'turn eyes' ) ) ) )
            // InternalRoc.g:728:2: ( ( (lv_turnHead_0_0= 'turn head' ) ) | ( (lv_turnEyes_1_0= 'turn eyes' ) ) )
            {
            // InternalRoc.g:728:2: ( ( (lv_turnHead_0_0= 'turn head' ) ) | ( (lv_turnEyes_1_0= 'turn eyes' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==23) ) {
                alt10=1;
            }
            else if ( (LA10_0==24) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalRoc.g:729:3: ( (lv_turnHead_0_0= 'turn head' ) )
                    {
                    // InternalRoc.g:729:3: ( (lv_turnHead_0_0= 'turn head' ) )
                    // InternalRoc.g:730:4: (lv_turnHead_0_0= 'turn head' )
                    {
                    // InternalRoc.g:730:4: (lv_turnHead_0_0= 'turn head' )
                    // InternalRoc.g:731:5: lv_turnHead_0_0= 'turn head'
                    {
                    lv_turnHead_0_0=(Token)match(input,23,FOLLOW_2); 

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
                    // InternalRoc.g:744:3: ( (lv_turnEyes_1_0= 'turn eyes' ) )
                    {
                    // InternalRoc.g:744:3: ( (lv_turnEyes_1_0= 'turn eyes' ) )
                    // InternalRoc.g:745:4: (lv_turnEyes_1_0= 'turn eyes' )
                    {
                    // InternalRoc.g:745:4: (lv_turnEyes_1_0= 'turn eyes' )
                    // InternalRoc.g:746:5: lv_turnEyes_1_0= 'turn eyes'
                    {
                    lv_turnEyes_1_0=(Token)match(input,24,FOLLOW_2); 

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
    // InternalRoc.g:762:1: entryRuleDirection returns [EObject current=null] : iv_ruleDirection= ruleDirection EOF ;
    public final EObject entryRuleDirection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDirection = null;


        try {
            // InternalRoc.g:762:50: (iv_ruleDirection= ruleDirection EOF )
            // InternalRoc.g:763:2: iv_ruleDirection= ruleDirection EOF
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
    // InternalRoc.g:769:1: ruleDirection returns [EObject current=null] : ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) ) ;
    public final EObject ruleDirection() throws RecognitionException {
        EObject current = null;

        Token lv_UP_0_0=null;
        Token lv_DOWN_1_0=null;
        Token lv_LEFT_2_0=null;
        Token lv_RIGHT_3_0=null;


        	enterRule();

        try {
            // InternalRoc.g:775:2: ( ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) ) )
            // InternalRoc.g:776:2: ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) )
            {
            // InternalRoc.g:776:2: ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt11=1;
                }
                break;
            case 26:
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
                    // InternalRoc.g:777:3: ( (lv_UP_0_0= 'up' ) )
                    {
                    // InternalRoc.g:777:3: ( (lv_UP_0_0= 'up' ) )
                    // InternalRoc.g:778:4: (lv_UP_0_0= 'up' )
                    {
                    // InternalRoc.g:778:4: (lv_UP_0_0= 'up' )
                    // InternalRoc.g:779:5: lv_UP_0_0= 'up'
                    {
                    lv_UP_0_0=(Token)match(input,25,FOLLOW_2); 

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
                    // InternalRoc.g:792:3: ( (lv_DOWN_1_0= 'down' ) )
                    {
                    // InternalRoc.g:792:3: ( (lv_DOWN_1_0= 'down' ) )
                    // InternalRoc.g:793:4: (lv_DOWN_1_0= 'down' )
                    {
                    // InternalRoc.g:793:4: (lv_DOWN_1_0= 'down' )
                    // InternalRoc.g:794:5: lv_DOWN_1_0= 'down'
                    {
                    lv_DOWN_1_0=(Token)match(input,26,FOLLOW_2); 

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
                    // InternalRoc.g:807:3: ( (lv_LEFT_2_0= 'left' ) )
                    {
                    // InternalRoc.g:807:3: ( (lv_LEFT_2_0= 'left' ) )
                    // InternalRoc.g:808:4: (lv_LEFT_2_0= 'left' )
                    {
                    // InternalRoc.g:808:4: (lv_LEFT_2_0= 'left' )
                    // InternalRoc.g:809:5: lv_LEFT_2_0= 'left'
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
                    // InternalRoc.g:822:3: ( (lv_RIGHT_3_0= 'right' ) )
                    {
                    // InternalRoc.g:822:3: ( (lv_RIGHT_3_0= 'right' ) )
                    // InternalRoc.g:823:4: (lv_RIGHT_3_0= 'right' )
                    {
                    // InternalRoc.g:823:4: (lv_RIGHT_3_0= 'right' )
                    // InternalRoc.g:824:5: lv_RIGHT_3_0= 'right'
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


    // $ANTLR start "entryRuleSpeed"
    // InternalRoc.g:840:1: entryRuleSpeed returns [EObject current=null] : iv_ruleSpeed= ruleSpeed EOF ;
    public final EObject entryRuleSpeed() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSpeed = null;


        try {
            // InternalRoc.g:840:46: (iv_ruleSpeed= ruleSpeed EOF )
            // InternalRoc.g:841:2: iv_ruleSpeed= ruleSpeed EOF
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
    // InternalRoc.g:847:1: ruleSpeed returns [EObject current=null] : ( ( (lv_SLOWEST_0_0= 'slowest' ) ) | ( (lv_SLOW_1_0= 'slow' ) ) | ( (lv_NORMAL_2_0= 'normal' ) ) | ( (lv_FAST_3_0= 'fast' ) ) | ( (lv_FULL_4_0= 'full' ) ) ) ;
    public final EObject ruleSpeed() throws RecognitionException {
        EObject current = null;

        Token lv_SLOWEST_0_0=null;
        Token lv_SLOW_1_0=null;
        Token lv_NORMAL_2_0=null;
        Token lv_FAST_3_0=null;
        Token lv_FULL_4_0=null;


        	enterRule();

        try {
            // InternalRoc.g:853:2: ( ( ( (lv_SLOWEST_0_0= 'slowest' ) ) | ( (lv_SLOW_1_0= 'slow' ) ) | ( (lv_NORMAL_2_0= 'normal' ) ) | ( (lv_FAST_3_0= 'fast' ) ) | ( (lv_FULL_4_0= 'full' ) ) ) )
            // InternalRoc.g:854:2: ( ( (lv_SLOWEST_0_0= 'slowest' ) ) | ( (lv_SLOW_1_0= 'slow' ) ) | ( (lv_NORMAL_2_0= 'normal' ) ) | ( (lv_FAST_3_0= 'fast' ) ) | ( (lv_FULL_4_0= 'full' ) ) )
            {
            // InternalRoc.g:854:2: ( ( (lv_SLOWEST_0_0= 'slowest' ) ) | ( (lv_SLOW_1_0= 'slow' ) ) | ( (lv_NORMAL_2_0= 'normal' ) ) | ( (lv_FAST_3_0= 'fast' ) ) | ( (lv_FULL_4_0= 'full' ) ) )
            int alt12=5;
            switch ( input.LA(1) ) {
            case 27:
                {
                alt12=1;
                }
                break;
            case 28:
                {
                alt12=2;
                }
                break;
            case 29:
                {
                alt12=3;
                }
                break;
            case 30:
                {
                alt12=4;
                }
                break;
            case 31:
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
                    // InternalRoc.g:855:3: ( (lv_SLOWEST_0_0= 'slowest' ) )
                    {
                    // InternalRoc.g:855:3: ( (lv_SLOWEST_0_0= 'slowest' ) )
                    // InternalRoc.g:856:4: (lv_SLOWEST_0_0= 'slowest' )
                    {
                    // InternalRoc.g:856:4: (lv_SLOWEST_0_0= 'slowest' )
                    // InternalRoc.g:857:5: lv_SLOWEST_0_0= 'slowest'
                    {
                    lv_SLOWEST_0_0=(Token)match(input,27,FOLLOW_2); 

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
                    // InternalRoc.g:870:3: ( (lv_SLOW_1_0= 'slow' ) )
                    {
                    // InternalRoc.g:870:3: ( (lv_SLOW_1_0= 'slow' ) )
                    // InternalRoc.g:871:4: (lv_SLOW_1_0= 'slow' )
                    {
                    // InternalRoc.g:871:4: (lv_SLOW_1_0= 'slow' )
                    // InternalRoc.g:872:5: lv_SLOW_1_0= 'slow'
                    {
                    lv_SLOW_1_0=(Token)match(input,28,FOLLOW_2); 

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
                    // InternalRoc.g:885:3: ( (lv_NORMAL_2_0= 'normal' ) )
                    {
                    // InternalRoc.g:885:3: ( (lv_NORMAL_2_0= 'normal' ) )
                    // InternalRoc.g:886:4: (lv_NORMAL_2_0= 'normal' )
                    {
                    // InternalRoc.g:886:4: (lv_NORMAL_2_0= 'normal' )
                    // InternalRoc.g:887:5: lv_NORMAL_2_0= 'normal'
                    {
                    lv_NORMAL_2_0=(Token)match(input,29,FOLLOW_2); 

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
                    // InternalRoc.g:900:3: ( (lv_FAST_3_0= 'fast' ) )
                    {
                    // InternalRoc.g:900:3: ( (lv_FAST_3_0= 'fast' ) )
                    // InternalRoc.g:901:4: (lv_FAST_3_0= 'fast' )
                    {
                    // InternalRoc.g:901:4: (lv_FAST_3_0= 'fast' )
                    // InternalRoc.g:902:5: lv_FAST_3_0= 'fast'
                    {
                    lv_FAST_3_0=(Token)match(input,30,FOLLOW_2); 

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
                    // InternalRoc.g:915:3: ( (lv_FULL_4_0= 'full' ) )
                    {
                    // InternalRoc.g:915:3: ( (lv_FULL_4_0= 'full' ) )
                    // InternalRoc.g:916:4: (lv_FULL_4_0= 'full' )
                    {
                    // InternalRoc.g:916:4: (lv_FULL_4_0= 'full' )
                    // InternalRoc.g:917:5: lv_FULL_4_0= 'full'
                    {
                    lv_FULL_4_0=(Token)match(input,31,FOLLOW_2); 

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
    // InternalRoc.g:933:1: ruleIntensity returns [Enumerator current=null] : ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) ) ;
    public final Enumerator ruleIntensity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalRoc.g:939:2: ( ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) ) )
            // InternalRoc.g:940:2: ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) )
            {
            // InternalRoc.g:940:2: ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) )
            int alt13=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt13=1;
                }
                break;
            case 33:
                {
                alt13=2;
                }
                break;
            case 34:
                {
                alt13=3;
                }
                break;
            case 35:
                {
                alt13=4;
                }
                break;
            case 36:
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
                    // InternalRoc.g:941:3: (enumLiteral_0= 'pronounced' )
                    {
                    // InternalRoc.g:941:3: (enumLiteral_0= 'pronounced' )
                    // InternalRoc.g:942:4: enumLiteral_0= 'pronounced'
                    {
                    enumLiteral_0=(Token)match(input,32,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getIntensityAccess().getCEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:949:3: (enumLiteral_1= 'trace of' )
                    {
                    // InternalRoc.g:949:3: (enumLiteral_1= 'trace of' )
                    // InternalRoc.g:950:4: enumLiteral_1= 'trace of'
                    {
                    enumLiteral_1=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getIntensityAccess().getAEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:957:3: (enumLiteral_2= 'slightly' )
                    {
                    // InternalRoc.g:957:3: (enumLiteral_2= 'slightly' )
                    // InternalRoc.g:958:4: enumLiteral_2= 'slightly'
                    {
                    enumLiteral_2=(Token)match(input,34,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getIntensityAccess().getBEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalRoc.g:965:3: (enumLiteral_3= 'severe' )
                    {
                    // InternalRoc.g:965:3: (enumLiteral_3= 'severe' )
                    // InternalRoc.g:966:4: enumLiteral_3= 'severe'
                    {
                    enumLiteral_3=(Token)match(input,35,FOLLOW_2); 

                    				current = grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getIntensityAccess().getDEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalRoc.g:973:3: (enumLiteral_4= 'maximum' )
                    {
                    // InternalRoc.g:973:3: (enumLiteral_4= 'maximum' )
                    // InternalRoc.g:974:4: enumLiteral_4= 'maximum'
                    {
                    enumLiteral_4=(Token)match(input,36,FOLLOW_2); 

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
    // InternalRoc.g:984:1: ruleDurationUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) ;
    public final Enumerator ruleDurationUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalRoc.g:990:2: ( ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) )
            // InternalRoc.g:991:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            {
            // InternalRoc.g:991:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt14=1;
                }
                break;
            case 38:
                {
                alt14=2;
                }
                break;
            case 39:
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
                    // InternalRoc.g:992:3: (enumLiteral_0= 'milliseconds' )
                    {
                    // InternalRoc.g:992:3: (enumLiteral_0= 'milliseconds' )
                    // InternalRoc.g:993:4: enumLiteral_0= 'milliseconds'
                    {
                    enumLiteral_0=(Token)match(input,37,FOLLOW_2); 

                    				current = grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDurationUnitAccess().getMILLISECONDSEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalRoc.g:1000:3: (enumLiteral_1= 'seconds' )
                    {
                    // InternalRoc.g:1000:3: (enumLiteral_1= 'seconds' )
                    // InternalRoc.g:1001:4: enumLiteral_1= 'seconds'
                    {
                    enumLiteral_1=(Token)match(input,38,FOLLOW_2); 

                    				current = grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDurationUnitAccess().getSECONDSEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalRoc.g:1008:3: (enumLiteral_2= 'minutes' )
                    {
                    // InternalRoc.g:1008:3: (enumLiteral_2= 'minutes' )
                    // InternalRoc.g:1009:4: enumLiteral_2= 'minutes'
                    {
                    enumLiteral_2=(Token)match(input,39,FOLLOW_2); 

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
    static final String dfa_1s = "\25\uffff";
    static final String dfa_2s = "\1\uffff\1\16\5\uffff\2\16\6\uffff\6\16";
    static final String dfa_3s = "\1\21\1\4\5\22\2\4\3\25\3\uffff\6\4";
    static final String dfa_4s = "\1\44\1\10\5\30\2\10\1\26\2\32\3\uffff\6\10";
    static final String dfa_5s = "\14\uffff\1\2\1\1\1\3\6\uffff";
    static final String dfa_6s = "\25\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\1\7\1\10\1\11\2\uffff\1\12\1\13\7\uffff\1\2\1\3\1\4\1\5\1\6",
            "\2\16\1\15\1\uffff\1\14",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\1\7\1\10\1\11\2\uffff\1\12\1\13",
            "\2\16\1\15\1\uffff\1\14",
            "\2\16\1\15\1\uffff\1\14",
            "\1\17\1\20",
            "\1\23\1\24\2\uffff\1\21\1\22",
            "\1\23\1\24\2\uffff\1\21\1\22",
            "",
            "",
            "",
            "\2\16\1\15\1\uffff\1\14",
            "\2\16\1\15\1\uffff\1\14",
            "\2\16\1\15\1\uffff\1\14",
            "\2\16\1\15\1\uffff\1\14",
            "\2\16\1\15\1\uffff\1\14",
            "\2\16\1\15\1\uffff\1\14"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "200:2: ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) | ( ( (lv_action_4_0= ruleAction ) ) this_WITH_5= RULE_WITH ( (lv_speed_6_0= ruleSpeed ) ) this_SPEED_KEY_7= RULE_SPEED_KEY ) | ( (lv_action_8_0= ruleAction ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001F019E0002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000001F019E0030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000E000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000F8000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000001F000C0000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000001F019E0000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000006600000L});

}