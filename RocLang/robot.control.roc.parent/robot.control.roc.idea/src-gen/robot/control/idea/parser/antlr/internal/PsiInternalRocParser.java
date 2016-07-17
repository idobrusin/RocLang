package robot.control.idea.parser.antlr.internal;

import org.eclipse.xtext.idea.parser.AbstractPsiAntlrParser;
import robot.control.idea.lang.RocElementTypeProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import robot.control.services.RocGrammarAccess;

import com.intellij.lang.PsiBuilder;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class PsiInternalRocParser extends AbstractPsiAntlrParser {
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


        public PsiInternalRocParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public PsiInternalRocParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return PsiInternalRocParser.tokenNames; }
    public String getGrammarFileName() { return "PsiInternalRoc.g"; }



    	protected RocGrammarAccess grammarAccess;

    	protected RocElementTypeProvider elementTypeProvider;

    	public PsiInternalRocParser(PsiBuilder builder, TokenStream input, RocElementTypeProvider elementTypeProvider, RocGrammarAccess grammarAccess) {
    		this(input);
    		setPsiBuilder(builder);
    		this.grammarAccess = grammarAccess;
    		this.elementTypeProvider = elementTypeProvider;
    	}

    	@Override
    	protected String getFirstRuleName() {
    		return "Program";
    	}




    // $ANTLR start "entryRuleProgram"
    // PsiInternalRoc.g:52:1: entryRuleProgram returns [Boolean current=false] : iv_ruleProgram= ruleProgram EOF ;
    public final Boolean entryRuleProgram() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleProgram = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // PsiInternalRoc.g:54:2: (iv_ruleProgram= ruleProgram EOF )
            // PsiInternalRoc.g:55:2: iv_ruleProgram= ruleProgram EOF
            {
             markComposite(elementTypeProvider.getProgramElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
        return current;
    }
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // PsiInternalRoc.g:64:1: ruleProgram returns [Boolean current=false] : ( (lv_movements_0_0= ruleMovement ) )* ;
    public final Boolean ruleProgram() throws RecognitionException {
        Boolean current = false;

        Boolean lv_movements_0_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // PsiInternalRoc.g:67:2: ( ( (lv_movements_0_0= ruleMovement ) )* )
            // PsiInternalRoc.g:68:2: ( (lv_movements_0_0= ruleMovement ) )*
            {
            // PsiInternalRoc.g:68:2: ( (lv_movements_0_0= ruleMovement ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15||(LA1_0>=17 && LA1_0<=20)||LA1_0==25||(LA1_0>=29 && LA1_0<=33)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PsiInternalRoc.g:69:3: (lv_movements_0_0= ruleMovement )
            	    {
            	    // PsiInternalRoc.g:69:3: (lv_movements_0_0= ruleMovement )
            	    // PsiInternalRoc.g:70:4: lv_movements_0_0= ruleMovement
            	    {

            	    				markComposite(elementTypeProvider.getProgram_MovementsMovementParserRuleCall_0ElementType());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_movements_0_0=ruleMovement();

            	    state._fsp--;


            	    				doneComposite();
            	    				if(!current) {
            	    					associateWithSemanticElement();
            	    					current = true;
            	    				}
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMovement"
    // PsiInternalRoc.g:89:1: entryRuleMovement returns [Boolean current=false] : iv_ruleMovement= ruleMovement EOF ;
    public final Boolean entryRuleMovement() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMovement = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // PsiInternalRoc.g:91:2: (iv_ruleMovement= ruleMovement EOF )
            // PsiInternalRoc.g:92:2: iv_ruleMovement= ruleMovement EOF
            {
             markComposite(elementTypeProvider.getMovementElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleMovement=ruleMovement();

            state._fsp--;

             current =iv_ruleMovement; 
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
        return current;
    }
    // $ANTLR end "entryRuleMovement"


    // $ANTLR start "ruleMovement"
    // PsiInternalRoc.g:101:1: ruleMovement returns [Boolean current=false] : ( ( (lv_motions_0_0= ruleMotion ) ) (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )* this_PERIOD_3= RULE_PERIOD ) ;
    public final Boolean ruleMovement() throws RecognitionException {
        Boolean current = false;

        Token this_AND_1=null;
        Token this_PERIOD_3=null;
        Boolean lv_motions_0_0 = null;

        Boolean lv_motions_2_0 = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // PsiInternalRoc.g:104:2: ( ( ( (lv_motions_0_0= ruleMotion ) ) (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )* this_PERIOD_3= RULE_PERIOD ) )
            // PsiInternalRoc.g:105:2: ( ( (lv_motions_0_0= ruleMotion ) ) (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )* this_PERIOD_3= RULE_PERIOD )
            {
            // PsiInternalRoc.g:105:2: ( ( (lv_motions_0_0= ruleMotion ) ) (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )* this_PERIOD_3= RULE_PERIOD )
            // PsiInternalRoc.g:106:3: ( (lv_motions_0_0= ruleMotion ) ) (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )* this_PERIOD_3= RULE_PERIOD
            {
            // PsiInternalRoc.g:106:3: ( (lv_motions_0_0= ruleMotion ) )
            // PsiInternalRoc.g:107:4: (lv_motions_0_0= ruleMotion )
            {
            // PsiInternalRoc.g:107:4: (lv_motions_0_0= ruleMotion )
            // PsiInternalRoc.g:108:5: lv_motions_0_0= ruleMotion
            {

            					markComposite(elementTypeProvider.getMovement_MotionsMotionParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_4);
            lv_motions_0_0=ruleMotion();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }

            // PsiInternalRoc.g:121:3: (this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_AND) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // PsiInternalRoc.g:122:4: this_AND_1= RULE_AND ( (lv_motions_2_0= ruleMotion ) )
            	    {

            	    				markLeaf(elementTypeProvider.getMovement_ANDTerminalRuleCall_1_0ElementType());
            	    			
            	    this_AND_1=(Token)match(input,RULE_AND,FOLLOW_5); 

            	    				doneLeaf(this_AND_1);
            	    			
            	    // PsiInternalRoc.g:129:4: ( (lv_motions_2_0= ruleMotion ) )
            	    // PsiInternalRoc.g:130:5: (lv_motions_2_0= ruleMotion )
            	    {
            	    // PsiInternalRoc.g:130:5: (lv_motions_2_0= ruleMotion )
            	    // PsiInternalRoc.g:131:6: lv_motions_2_0= ruleMotion
            	    {

            	    						markComposite(elementTypeProvider.getMovement_MotionsMotionParserRuleCall_1_1_0ElementType());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_motions_2_0=ruleMotion();

            	    state._fsp--;


            	    						doneComposite();
            	    						if(!current) {
            	    							associateWithSemanticElement();
            	    							current = true;
            	    						}
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            			markLeaf(elementTypeProvider.getMovement_PERIODTerminalRuleCall_2ElementType());
            		
            this_PERIOD_3=(Token)match(input,RULE_PERIOD,FOLLOW_2); 

            			doneLeaf(this_PERIOD_3);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMovement"


    // $ANTLR start "entryRuleMotion"
    // PsiInternalRoc.g:159:1: entryRuleMotion returns [Boolean current=false] : iv_ruleMotion= ruleMotion EOF ;
    public final Boolean entryRuleMotion() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleMotion = null;


        try {
            // PsiInternalRoc.g:159:48: (iv_ruleMotion= ruleMotion EOF )
            // PsiInternalRoc.g:160:2: iv_ruleMotion= ruleMotion EOF
            {
             markComposite(elementTypeProvider.getMotionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleMotion=ruleMotion();

            state._fsp--;

             current =iv_ruleMotion; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMotion"


    // $ANTLR start "ruleMotion"
    // PsiInternalRoc.g:166:1: ruleMotion returns [Boolean current=false] : ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) ;
    public final Boolean ruleMotion() throws RecognitionException {
        Boolean current = false;

        Token this_FOR_1=null;
        Token lv_duration_2_0=null;
        Boolean lv_action_0_0 = null;

        Boolean lv_durationUnit_3_0 = null;


        try {
            // PsiInternalRoc.g:167:1: ( ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) ) )
            // PsiInternalRoc.g:168:2: ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) )
            {
            // PsiInternalRoc.g:168:2: ( ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) ) )
            // PsiInternalRoc.g:169:3: ( (lv_action_0_0= ruleAction ) ) this_FOR_1= RULE_FOR ( (lv_duration_2_0= RULE_DURATION ) ) ( (lv_durationUnit_3_0= ruleDurationUnit ) )
            {
            // PsiInternalRoc.g:169:3: ( (lv_action_0_0= ruleAction ) )
            // PsiInternalRoc.g:170:4: (lv_action_0_0= ruleAction )
            {
            // PsiInternalRoc.g:170:4: (lv_action_0_0= ruleAction )
            // PsiInternalRoc.g:171:5: lv_action_0_0= ruleAction
            {

            					markComposite(elementTypeProvider.getMotion_ActionActionParserRuleCall_0_0ElementType());
            				
            pushFollow(FOLLOW_6);
            lv_action_0_0=ruleAction();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getMotion_FORTerminalRuleCall_1ElementType());
            		
            this_FOR_1=(Token)match(input,RULE_FOR,FOLLOW_7); 

            			doneLeaf(this_FOR_1);
            		
            // PsiInternalRoc.g:191:3: ( (lv_duration_2_0= RULE_DURATION ) )
            // PsiInternalRoc.g:192:4: (lv_duration_2_0= RULE_DURATION )
            {
            // PsiInternalRoc.g:192:4: (lv_duration_2_0= RULE_DURATION )
            // PsiInternalRoc.g:193:5: lv_duration_2_0= RULE_DURATION
            {

            					markLeaf(elementTypeProvider.getMotion_DurationDurationTerminalRuleCall_2_0ElementType());
            				
            lv_duration_2_0=(Token)match(input,RULE_DURATION,FOLLOW_8); 

            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            					doneLeaf(lv_duration_2_0);
            				

            }


            }

            // PsiInternalRoc.g:208:3: ( (lv_durationUnit_3_0= ruleDurationUnit ) )
            // PsiInternalRoc.g:209:4: (lv_durationUnit_3_0= ruleDurationUnit )
            {
            // PsiInternalRoc.g:209:4: (lv_durationUnit_3_0= ruleDurationUnit )
            // PsiInternalRoc.g:210:5: lv_durationUnit_3_0= ruleDurationUnit
            {

            					markComposite(elementTypeProvider.getMotion_DurationUnitDurationUnitEnumRuleCall_3_0ElementType());
            				
            pushFollow(FOLLOW_2);
            lv_durationUnit_3_0=ruleDurationUnit();

            state._fsp--;


            					doneComposite();
            					if(!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMotion"


    // $ANTLR start "entryRuleAction"
    // PsiInternalRoc.g:227:1: entryRuleAction returns [Boolean current=false] : iv_ruleAction= ruleAction EOF ;
    public final Boolean entryRuleAction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleAction = null;


        try {
            // PsiInternalRoc.g:227:48: (iv_ruleAction= ruleAction EOF )
            // PsiInternalRoc.g:228:2: iv_ruleAction= ruleAction EOF
            {
             markComposite(elementTypeProvider.getActionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // PsiInternalRoc.g:234:1: ruleAction returns [Boolean current=false] : ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) ) ;
    public final Boolean ruleAction() throws RecognitionException {
        Boolean current = false;

        Boolean lv_actionHolder_0_0 = null;

        Boolean lv_intensity_1_0 = null;

        Boolean lv_actionHolder_2_0 = null;

        Boolean lv_intensity_3_0 = null;

        Boolean lv_actionHolder_4_0 = null;


        try {
            // PsiInternalRoc.g:235:1: ( ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) ) )
            // PsiInternalRoc.g:236:2: ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) )
            {
            // PsiInternalRoc.g:236:2: ( ( (lv_actionHolder_0_0= ruleCompleteAction ) ) | ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) ) | ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) ) )
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

                if ( ((LA5_2>=19 && LA5_2<=20)||LA5_2==25) ) {
                    alt5=3;
                }
                else if ( ((LA5_2>=17 && LA5_2<=18)) ) {
                    alt5=2;
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

                if ( ((LA5_3>=17 && LA5_3<=18)) ) {
                    alt5=2;
                }
                else if ( ((LA5_3>=19 && LA5_3<=20)||LA5_3==25) ) {
                    alt5=3;
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

                if ( ((LA5_4>=19 && LA5_4<=20)||LA5_4==25) ) {
                    alt5=3;
                }
                else if ( ((LA5_4>=17 && LA5_4<=18)) ) {
                    alt5=2;
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
                    // PsiInternalRoc.g:237:3: ( (lv_actionHolder_0_0= ruleCompleteAction ) )
                    {
                    // PsiInternalRoc.g:237:3: ( (lv_actionHolder_0_0= ruleCompleteAction ) )
                    // PsiInternalRoc.g:238:4: (lv_actionHolder_0_0= ruleCompleteAction )
                    {
                    // PsiInternalRoc.g:238:4: (lv_actionHolder_0_0= ruleCompleteAction )
                    // PsiInternalRoc.g:239:5: lv_actionHolder_0_0= ruleCompleteAction
                    {

                    					markComposite(elementTypeProvider.getAction_ActionHolderCompleteActionParserRuleCall_0_0ElementType());
                    				
                    pushFollow(FOLLOW_2);
                    lv_actionHolder_0_0=ruleCompleteAction();

                    state._fsp--;


                    					doneComposite();
                    					if(!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalRoc.g:253:3: ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) )
                    {
                    // PsiInternalRoc.g:253:3: ( ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) ) )
                    // PsiInternalRoc.g:254:4: ( (lv_intensity_1_0= ruleIntensity ) )? ( (lv_actionHolder_2_0= ruleSingleAction ) )
                    {
                    // PsiInternalRoc.g:254:4: ( (lv_intensity_1_0= ruleIntensity ) )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( ((LA3_0>=29 && LA3_0<=33)) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // PsiInternalRoc.g:255:5: (lv_intensity_1_0= ruleIntensity )
                            {
                            // PsiInternalRoc.g:255:5: (lv_intensity_1_0= ruleIntensity )
                            // PsiInternalRoc.g:256:6: lv_intensity_1_0= ruleIntensity
                            {

                            						markComposite(elementTypeProvider.getAction_IntensityIntensityEnumRuleCall_1_0_0ElementType());
                            					
                            pushFollow(FOLLOW_9);
                            lv_intensity_1_0=ruleIntensity();

                            state._fsp--;


                            						doneComposite();
                            						if(!current) {
                            							associateWithSemanticElement();
                            							current = true;
                            						}
                            					

                            }


                            }
                            break;

                    }

                    // PsiInternalRoc.g:269:4: ( (lv_actionHolder_2_0= ruleSingleAction ) )
                    // PsiInternalRoc.g:270:5: (lv_actionHolder_2_0= ruleSingleAction )
                    {
                    // PsiInternalRoc.g:270:5: (lv_actionHolder_2_0= ruleSingleAction )
                    // PsiInternalRoc.g:271:6: lv_actionHolder_2_0= ruleSingleAction
                    {

                    						markComposite(elementTypeProvider.getAction_ActionHolderSingleActionParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_actionHolder_2_0=ruleSingleAction();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalRoc.g:286:3: ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) )
                    {
                    // PsiInternalRoc.g:286:3: ( ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) ) )
                    // PsiInternalRoc.g:287:4: ( (lv_intensity_3_0= ruleIntensity ) )? ( (lv_actionHolder_4_0= ruleDirectedAction ) )
                    {
                    // PsiInternalRoc.g:287:4: ( (lv_intensity_3_0= ruleIntensity ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( ((LA4_0>=29 && LA4_0<=33)) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // PsiInternalRoc.g:288:5: (lv_intensity_3_0= ruleIntensity )
                            {
                            // PsiInternalRoc.g:288:5: (lv_intensity_3_0= ruleIntensity )
                            // PsiInternalRoc.g:289:6: lv_intensity_3_0= ruleIntensity
                            {

                            						markComposite(elementTypeProvider.getAction_IntensityIntensityEnumRuleCall_2_0_0ElementType());
                            					
                            pushFollow(FOLLOW_10);
                            lv_intensity_3_0=ruleIntensity();

                            state._fsp--;


                            						doneComposite();
                            						if(!current) {
                            							associateWithSemanticElement();
                            							current = true;
                            						}
                            					

                            }


                            }
                            break;

                    }

                    // PsiInternalRoc.g:302:4: ( (lv_actionHolder_4_0= ruleDirectedAction ) )
                    // PsiInternalRoc.g:303:5: (lv_actionHolder_4_0= ruleDirectedAction )
                    {
                    // PsiInternalRoc.g:303:5: (lv_actionHolder_4_0= ruleDirectedAction )
                    // PsiInternalRoc.g:304:6: lv_actionHolder_4_0= ruleDirectedAction
                    {

                    						markComposite(elementTypeProvider.getAction_ActionHolderDirectedActionParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_actionHolder_4_0=ruleDirectedAction();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleCompleteAction"
    // PsiInternalRoc.g:322:1: entryRuleCompleteAction returns [Boolean current=false] : iv_ruleCompleteAction= ruleCompleteAction EOF ;
    public final Boolean entryRuleCompleteAction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleCompleteAction = null;


        try {
            // PsiInternalRoc.g:322:56: (iv_ruleCompleteAction= ruleCompleteAction EOF )
            // PsiInternalRoc.g:323:2: iv_ruleCompleteAction= ruleCompleteAction EOF
            {
             markComposite(elementTypeProvider.getCompleteActionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleCompleteAction=ruleCompleteAction();

            state._fsp--;

             current =iv_ruleCompleteAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCompleteAction"


    // $ANTLR start "ruleCompleteAction"
    // PsiInternalRoc.g:329:1: ruleCompleteAction returns [Boolean current=false] : ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' ) ;
    public final Boolean ruleCompleteAction() throws RecognitionException {
        Boolean current = false;

        Token lv_actionName_0_0=null;
        Token otherlv_1=null;

        try {
            // PsiInternalRoc.g:330:1: ( ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' ) )
            // PsiInternalRoc.g:331:2: ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' )
            {
            // PsiInternalRoc.g:331:2: ( ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face' )
            // PsiInternalRoc.g:332:3: ( (lv_actionName_0_0= 'neutral' ) ) otherlv_1= 'face'
            {
            // PsiInternalRoc.g:332:3: ( (lv_actionName_0_0= 'neutral' ) )
            // PsiInternalRoc.g:333:4: (lv_actionName_0_0= 'neutral' )
            {
            // PsiInternalRoc.g:333:4: (lv_actionName_0_0= 'neutral' )
            // PsiInternalRoc.g:334:5: lv_actionName_0_0= 'neutral'
            {

            					markLeaf(elementTypeProvider.getCompleteAction_ActionNameNeutralKeyword_0_0ElementType());
            				
            lv_actionName_0_0=(Token)match(input,15,FOLLOW_11); 

            					doneLeaf(lv_actionName_0_0);
            				

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getCompleteAction_FaceKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,16,FOLLOW_2); 

            			doneLeaf(otherlv_1);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCompleteAction"


    // $ANTLR start "entryRuleSingleAction"
    // PsiInternalRoc.g:360:1: entryRuleSingleAction returns [Boolean current=false] : iv_ruleSingleAction= ruleSingleAction EOF ;
    public final Boolean entryRuleSingleAction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleSingleAction = null;


        try {
            // PsiInternalRoc.g:360:54: (iv_ruleSingleAction= ruleSingleAction EOF )
            // PsiInternalRoc.g:361:2: iv_ruleSingleAction= ruleSingleAction EOF
            {
             markComposite(elementTypeProvider.getSingleActionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleAction=ruleSingleAction();

            state._fsp--;

             current =iv_ruleSingleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSingleAction"


    // $ANTLR start "ruleSingleAction"
    // PsiInternalRoc.g:367:1: ruleSingleAction returns [Boolean current=false] : ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod Head' ) ) ) ;
    public final Boolean ruleSingleAction() throws RecognitionException {
        Boolean current = false;

        Token lv_actionName_0_0=null;
        Token lv_actionName_1_0=null;

        try {
            // PsiInternalRoc.g:368:1: ( ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod Head' ) ) ) )
            // PsiInternalRoc.g:369:2: ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod Head' ) ) )
            {
            // PsiInternalRoc.g:369:2: ( ( (lv_actionName_0_0= 'drop jaw' ) ) | ( (lv_actionName_1_0= 'nod Head' ) ) )
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
                    // PsiInternalRoc.g:370:3: ( (lv_actionName_0_0= 'drop jaw' ) )
                    {
                    // PsiInternalRoc.g:370:3: ( (lv_actionName_0_0= 'drop jaw' ) )
                    // PsiInternalRoc.g:371:4: (lv_actionName_0_0= 'drop jaw' )
                    {
                    // PsiInternalRoc.g:371:4: (lv_actionName_0_0= 'drop jaw' )
                    // PsiInternalRoc.g:372:5: lv_actionName_0_0= 'drop jaw'
                    {

                    					markLeaf(elementTypeProvider.getSingleAction_ActionNameDropJawKeyword_0_0ElementType());
                    				
                    lv_actionName_0_0=(Token)match(input,17,FOLLOW_2); 

                    					doneLeaf(lv_actionName_0_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalRoc.g:388:3: ( (lv_actionName_1_0= 'nod Head' ) )
                    {
                    // PsiInternalRoc.g:388:3: ( (lv_actionName_1_0= 'nod Head' ) )
                    // PsiInternalRoc.g:389:4: (lv_actionName_1_0= 'nod Head' )
                    {
                    // PsiInternalRoc.g:389:4: (lv_actionName_1_0= 'nod Head' )
                    // PsiInternalRoc.g:390:5: lv_actionName_1_0= 'nod Head'
                    {

                    					markLeaf(elementTypeProvider.getSingleAction_ActionNameNodHeadKeyword_1_0ElementType());
                    				
                    lv_actionName_1_0=(Token)match(input,18,FOLLOW_2); 

                    					doneLeaf(lv_actionName_1_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSingleAction"


    // $ANTLR start "entryRuleDirectedAction"
    // PsiInternalRoc.g:409:1: entryRuleDirectedAction returns [Boolean current=false] : iv_ruleDirectedAction= ruleDirectedAction EOF ;
    public final Boolean entryRuleDirectedAction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDirectedAction = null;


        try {
            // PsiInternalRoc.g:409:56: (iv_ruleDirectedAction= ruleDirectedAction EOF )
            // PsiInternalRoc.g:410:2: iv_ruleDirectedAction= ruleDirectedAction EOF
            {
             markComposite(elementTypeProvider.getDirectedActionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirectedAction=ruleDirectedAction();

            state._fsp--;

             current =iv_ruleDirectedAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirectedAction"


    // $ANTLR start "ruleDirectedAction"
    // PsiInternalRoc.g:416:1: ruleDirectedAction returns [Boolean current=false] : ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) ) | ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) ) ) ;
    public final Boolean ruleDirectedAction() throws RecognitionException {
        Boolean current = false;

        Boolean lv_actionName_0_0 = null;

        Boolean lv_direction_1_0 = null;

        Boolean lv_actionName_2_0 = null;

        Boolean lv_direction_3_0 = null;

        Boolean lv_actionName_4_0 = null;

        Boolean lv_direction_5_0 = null;


        try {
            // PsiInternalRoc.g:417:1: ( ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) ) | ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) ) ) )
            // PsiInternalRoc.g:418:2: ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) ) | ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) ) )
            {
            // PsiInternalRoc.g:418:2: ( ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) ) | ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) ) | ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) ) )
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
                    // PsiInternalRoc.g:419:3: ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) )
                    {
                    // PsiInternalRoc.g:419:3: ( ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) ) )
                    // PsiInternalRoc.g:420:4: ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) ) ( (lv_direction_1_0= ruleLeftRightDirection ) )
                    {
                    // PsiInternalRoc.g:420:4: ( (lv_actionName_0_0= ruleLeftRightDirectedAction ) )
                    // PsiInternalRoc.g:421:5: (lv_actionName_0_0= ruleLeftRightDirectedAction )
                    {
                    // PsiInternalRoc.g:421:5: (lv_actionName_0_0= ruleLeftRightDirectedAction )
                    // PsiInternalRoc.g:422:6: lv_actionName_0_0= ruleLeftRightDirectedAction
                    {

                    						markComposite(elementTypeProvider.getDirectedAction_ActionNameLeftRightDirectedActionParserRuleCall_0_0_0ElementType());
                    					
                    pushFollow(FOLLOW_12);
                    lv_actionName_0_0=ruleLeftRightDirectedAction();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }

                    // PsiInternalRoc.g:435:4: ( (lv_direction_1_0= ruleLeftRightDirection ) )
                    // PsiInternalRoc.g:436:5: (lv_direction_1_0= ruleLeftRightDirection )
                    {
                    // PsiInternalRoc.g:436:5: (lv_direction_1_0= ruleLeftRightDirection )
                    // PsiInternalRoc.g:437:6: lv_direction_1_0= ruleLeftRightDirection
                    {

                    						markComposite(elementTypeProvider.getDirectedAction_DirectionLeftRightDirectionParserRuleCall_0_1_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_1_0=ruleLeftRightDirection();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalRoc.g:452:3: ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) )
                    {
                    // PsiInternalRoc.g:452:3: ( ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) ) )
                    // PsiInternalRoc.g:453:4: ( (lv_actionName_2_0= ruleBackForthDirectedAction ) ) ( (lv_direction_3_0= ruleBackForthDirection ) )
                    {
                    // PsiInternalRoc.g:453:4: ( (lv_actionName_2_0= ruleBackForthDirectedAction ) )
                    // PsiInternalRoc.g:454:5: (lv_actionName_2_0= ruleBackForthDirectedAction )
                    {
                    // PsiInternalRoc.g:454:5: (lv_actionName_2_0= ruleBackForthDirectedAction )
                    // PsiInternalRoc.g:455:6: lv_actionName_2_0= ruleBackForthDirectedAction
                    {

                    						markComposite(elementTypeProvider.getDirectedAction_ActionNameBackForthDirectedActionParserRuleCall_1_0_0ElementType());
                    					
                    pushFollow(FOLLOW_13);
                    lv_actionName_2_0=ruleBackForthDirectedAction();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }

                    // PsiInternalRoc.g:468:4: ( (lv_direction_3_0= ruleBackForthDirection ) )
                    // PsiInternalRoc.g:469:5: (lv_direction_3_0= ruleBackForthDirection )
                    {
                    // PsiInternalRoc.g:469:5: (lv_direction_3_0= ruleBackForthDirection )
                    // PsiInternalRoc.g:470:6: lv_direction_3_0= ruleBackForthDirection
                    {

                    						markComposite(elementTypeProvider.getDirectedAction_DirectionBackForthDirectionParserRuleCall_1_1_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_3_0=ruleBackForthDirection();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalRoc.g:485:3: ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) )
                    {
                    // PsiInternalRoc.g:485:3: ( ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) ) )
                    // PsiInternalRoc.g:486:4: ( (lv_actionName_4_0= ruleFullDirectedAction ) ) ( (lv_direction_5_0= ruleDirection ) )
                    {
                    // PsiInternalRoc.g:486:4: ( (lv_actionName_4_0= ruleFullDirectedAction ) )
                    // PsiInternalRoc.g:487:5: (lv_actionName_4_0= ruleFullDirectedAction )
                    {
                    // PsiInternalRoc.g:487:5: (lv_actionName_4_0= ruleFullDirectedAction )
                    // PsiInternalRoc.g:488:6: lv_actionName_4_0= ruleFullDirectedAction
                    {

                    						markComposite(elementTypeProvider.getDirectedAction_ActionNameFullDirectedActionParserRuleCall_2_0_0ElementType());
                    					
                    pushFollow(FOLLOW_14);
                    lv_actionName_4_0=ruleFullDirectedAction();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }

                    // PsiInternalRoc.g:501:4: ( (lv_direction_5_0= ruleDirection ) )
                    // PsiInternalRoc.g:502:5: (lv_direction_5_0= ruleDirection )
                    {
                    // PsiInternalRoc.g:502:5: (lv_direction_5_0= ruleDirection )
                    // PsiInternalRoc.g:503:6: lv_direction_5_0= ruleDirection
                    {

                    						markComposite(elementTypeProvider.getDirectedAction_DirectionDirectionParserRuleCall_2_1_0ElementType());
                    					
                    pushFollow(FOLLOW_2);
                    lv_direction_5_0=ruleDirection();

                    state._fsp--;


                    						doneComposite();
                    						if(!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirectedAction"


    // $ANTLR start "entryRuleLeftRightDirectedAction"
    // PsiInternalRoc.g:521:1: entryRuleLeftRightDirectedAction returns [Boolean current=false] : iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF ;
    public final Boolean entryRuleLeftRightDirectedAction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLeftRightDirectedAction = null;


        try {
            // PsiInternalRoc.g:521:65: (iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF )
            // PsiInternalRoc.g:522:2: iv_ruleLeftRightDirectedAction= ruleLeftRightDirectedAction EOF
            {
             markComposite(elementTypeProvider.getLeftRightDirectedActionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftRightDirectedAction=ruleLeftRightDirectedAction();

            state._fsp--;

             current =iv_ruleLeftRightDirectedAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftRightDirectedAction"


    // $ANTLR start "ruleLeftRightDirectedAction"
    // PsiInternalRoc.g:528:1: ruleLeftRightDirectedAction returns [Boolean current=false] : ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' ) ;
    public final Boolean ruleLeftRightDirectedAction() throws RecognitionException {
        Boolean current = false;

        Token lv_tiltHead_0_0=null;
        Token otherlv_1=null;

        try {
            // PsiInternalRoc.g:529:1: ( ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' ) )
            // PsiInternalRoc.g:530:2: ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' )
            {
            // PsiInternalRoc.g:530:2: ( ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head' )
            // PsiInternalRoc.g:531:3: ( (lv_tiltHead_0_0= 'tilt' ) ) otherlv_1= 'head'
            {
            // PsiInternalRoc.g:531:3: ( (lv_tiltHead_0_0= 'tilt' ) )
            // PsiInternalRoc.g:532:4: (lv_tiltHead_0_0= 'tilt' )
            {
            // PsiInternalRoc.g:532:4: (lv_tiltHead_0_0= 'tilt' )
            // PsiInternalRoc.g:533:5: lv_tiltHead_0_0= 'tilt'
            {

            					markLeaf(elementTypeProvider.getLeftRightDirectedAction_TiltHeadTiltKeyword_0_0ElementType());
            				
            lv_tiltHead_0_0=(Token)match(input,19,FOLLOW_15); 

            					doneLeaf(lv_tiltHead_0_0);
            				

            					if (!current) {
            						associateWithSemanticElement();
            						current = true;
            					}
            				

            }


            }


            			markLeaf(elementTypeProvider.getLeftRightDirectedAction_HeadKeyword_1ElementType());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_2); 

            			doneLeaf(otherlv_1);
            		

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftRightDirectedAction"


    // $ANTLR start "entryRuleLeftRightDirection"
    // PsiInternalRoc.g:559:1: entryRuleLeftRightDirection returns [Boolean current=false] : iv_ruleLeftRightDirection= ruleLeftRightDirection EOF ;
    public final Boolean entryRuleLeftRightDirection() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleLeftRightDirection = null;


        try {
            // PsiInternalRoc.g:559:60: (iv_ruleLeftRightDirection= ruleLeftRightDirection EOF )
            // PsiInternalRoc.g:560:2: iv_ruleLeftRightDirection= ruleLeftRightDirection EOF
            {
             markComposite(elementTypeProvider.getLeftRightDirectionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleLeftRightDirection=ruleLeftRightDirection();

            state._fsp--;

             current =iv_ruleLeftRightDirection; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLeftRightDirection"


    // $ANTLR start "ruleLeftRightDirection"
    // PsiInternalRoc.g:566:1: ruleLeftRightDirection returns [Boolean current=false] : ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) ) ;
    public final Boolean ruleLeftRightDirection() throws RecognitionException {
        Boolean current = false;

        Token lv_left_0_0=null;
        Token lv_right_1_0=null;

        try {
            // PsiInternalRoc.g:567:1: ( ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) ) )
            // PsiInternalRoc.g:568:2: ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) )
            {
            // PsiInternalRoc.g:568:2: ( ( (lv_left_0_0= 'left' ) ) | ( (lv_right_1_0= 'right' ) ) )
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
                    // PsiInternalRoc.g:569:3: ( (lv_left_0_0= 'left' ) )
                    {
                    // PsiInternalRoc.g:569:3: ( (lv_left_0_0= 'left' ) )
                    // PsiInternalRoc.g:570:4: (lv_left_0_0= 'left' )
                    {
                    // PsiInternalRoc.g:570:4: (lv_left_0_0= 'left' )
                    // PsiInternalRoc.g:571:5: lv_left_0_0= 'left'
                    {

                    					markLeaf(elementTypeProvider.getLeftRightDirection_LeftLeftKeyword_0_0ElementType());
                    				
                    lv_left_0_0=(Token)match(input,21,FOLLOW_2); 

                    					doneLeaf(lv_left_0_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalRoc.g:587:3: ( (lv_right_1_0= 'right' ) )
                    {
                    // PsiInternalRoc.g:587:3: ( (lv_right_1_0= 'right' ) )
                    // PsiInternalRoc.g:588:4: (lv_right_1_0= 'right' )
                    {
                    // PsiInternalRoc.g:588:4: (lv_right_1_0= 'right' )
                    // PsiInternalRoc.g:589:5: lv_right_1_0= 'right'
                    {

                    					markLeaf(elementTypeProvider.getLeftRightDirection_RightRightKeyword_1_0ElementType());
                    				
                    lv_right_1_0=(Token)match(input,22,FOLLOW_2); 

                    					doneLeaf(lv_right_1_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLeftRightDirection"


    // $ANTLR start "entryRuleBackForthDirectedAction"
    // PsiInternalRoc.g:608:1: entryRuleBackForthDirectedAction returns [Boolean current=false] : iv_ruleBackForthDirectedAction= ruleBackForthDirectedAction EOF ;
    public final Boolean entryRuleBackForthDirectedAction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBackForthDirectedAction = null;


        try {
            // PsiInternalRoc.g:608:65: (iv_ruleBackForthDirectedAction= ruleBackForthDirectedAction EOF )
            // PsiInternalRoc.g:609:2: iv_ruleBackForthDirectedAction= ruleBackForthDirectedAction EOF
            {
             markComposite(elementTypeProvider.getBackForthDirectedActionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackForthDirectedAction=ruleBackForthDirectedAction();

            state._fsp--;

             current =iv_ruleBackForthDirectedAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackForthDirectedAction"


    // $ANTLR start "ruleBackForthDirectedAction"
    // PsiInternalRoc.g:615:1: ruleBackForthDirectedAction returns [Boolean current=false] : ( (lv_head_0_0= 'head' ) ) ;
    public final Boolean ruleBackForthDirectedAction() throws RecognitionException {
        Boolean current = false;

        Token lv_head_0_0=null;

        try {
            // PsiInternalRoc.g:616:1: ( ( (lv_head_0_0= 'head' ) ) )
            // PsiInternalRoc.g:617:2: ( (lv_head_0_0= 'head' ) )
            {
            // PsiInternalRoc.g:617:2: ( (lv_head_0_0= 'head' ) )
            // PsiInternalRoc.g:618:3: (lv_head_0_0= 'head' )
            {
            // PsiInternalRoc.g:618:3: (lv_head_0_0= 'head' )
            // PsiInternalRoc.g:619:4: lv_head_0_0= 'head'
            {

            				markLeaf(elementTypeProvider.getBackForthDirectedAction_HeadHeadKeyword_0ElementType());
            			
            lv_head_0_0=(Token)match(input,20,FOLLOW_2); 

            				doneLeaf(lv_head_0_0);
            			

            				if (!current) {
            					associateWithSemanticElement();
            					current = true;
            				}
            			

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackForthDirectedAction"


    // $ANTLR start "entryRuleBackForthDirection"
    // PsiInternalRoc.g:637:1: entryRuleBackForthDirection returns [Boolean current=false] : iv_ruleBackForthDirection= ruleBackForthDirection EOF ;
    public final Boolean entryRuleBackForthDirection() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleBackForthDirection = null;


        try {
            // PsiInternalRoc.g:637:60: (iv_ruleBackForthDirection= ruleBackForthDirection EOF )
            // PsiInternalRoc.g:638:2: iv_ruleBackForthDirection= ruleBackForthDirection EOF
            {
             markComposite(elementTypeProvider.getBackForthDirectionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleBackForthDirection=ruleBackForthDirection();

            state._fsp--;

             current =iv_ruleBackForthDirection; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBackForthDirection"


    // $ANTLR start "ruleBackForthDirection"
    // PsiInternalRoc.g:644:1: ruleBackForthDirection returns [Boolean current=false] : ( ( (lv_back_0_0= 'back' ) ) | ( (lv_forth_1_0= 'forth' ) ) ) ;
    public final Boolean ruleBackForthDirection() throws RecognitionException {
        Boolean current = false;

        Token lv_back_0_0=null;
        Token lv_forth_1_0=null;

        try {
            // PsiInternalRoc.g:645:1: ( ( ( (lv_back_0_0= 'back' ) ) | ( (lv_forth_1_0= 'forth' ) ) ) )
            // PsiInternalRoc.g:646:2: ( ( (lv_back_0_0= 'back' ) ) | ( (lv_forth_1_0= 'forth' ) ) )
            {
            // PsiInternalRoc.g:646:2: ( ( (lv_back_0_0= 'back' ) ) | ( (lv_forth_1_0= 'forth' ) ) )
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
                    // PsiInternalRoc.g:647:3: ( (lv_back_0_0= 'back' ) )
                    {
                    // PsiInternalRoc.g:647:3: ( (lv_back_0_0= 'back' ) )
                    // PsiInternalRoc.g:648:4: (lv_back_0_0= 'back' )
                    {
                    // PsiInternalRoc.g:648:4: (lv_back_0_0= 'back' )
                    // PsiInternalRoc.g:649:5: lv_back_0_0= 'back'
                    {

                    					markLeaf(elementTypeProvider.getBackForthDirection_BackBackKeyword_0_0ElementType());
                    				
                    lv_back_0_0=(Token)match(input,23,FOLLOW_2); 

                    					doneLeaf(lv_back_0_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalRoc.g:665:3: ( (lv_forth_1_0= 'forth' ) )
                    {
                    // PsiInternalRoc.g:665:3: ( (lv_forth_1_0= 'forth' ) )
                    // PsiInternalRoc.g:666:4: (lv_forth_1_0= 'forth' )
                    {
                    // PsiInternalRoc.g:666:4: (lv_forth_1_0= 'forth' )
                    // PsiInternalRoc.g:667:5: lv_forth_1_0= 'forth'
                    {

                    					markLeaf(elementTypeProvider.getBackForthDirection_ForthForthKeyword_1_0ElementType());
                    				
                    lv_forth_1_0=(Token)match(input,24,FOLLOW_2); 

                    					doneLeaf(lv_forth_1_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBackForthDirection"


    // $ANTLR start "entryRuleFullDirectedAction"
    // PsiInternalRoc.g:686:1: entryRuleFullDirectedAction returns [Boolean current=false] : iv_ruleFullDirectedAction= ruleFullDirectedAction EOF ;
    public final Boolean entryRuleFullDirectedAction() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleFullDirectedAction = null;


        try {
            // PsiInternalRoc.g:686:60: (iv_ruleFullDirectedAction= ruleFullDirectedAction EOF )
            // PsiInternalRoc.g:687:2: iv_ruleFullDirectedAction= ruleFullDirectedAction EOF
            {
             markComposite(elementTypeProvider.getFullDirectedActionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleFullDirectedAction=ruleFullDirectedAction();

            state._fsp--;

             current =iv_ruleFullDirectedAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFullDirectedAction"


    // $ANTLR start "ruleFullDirectedAction"
    // PsiInternalRoc.g:693:1: ruleFullDirectedAction returns [Boolean current=false] : ( ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' ) | ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' ) ) ;
    public final Boolean ruleFullDirectedAction() throws RecognitionException {
        Boolean current = false;

        Token lv_turnHead_0_0=null;
        Token otherlv_1=null;
        Token lv_turnEyes_2_0=null;
        Token otherlv_3=null;

        try {
            // PsiInternalRoc.g:694:1: ( ( ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' ) | ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' ) ) )
            // PsiInternalRoc.g:695:2: ( ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' ) | ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' ) )
            {
            // PsiInternalRoc.g:695:2: ( ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' ) | ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==25) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==20) ) {
                    alt10=1;
                }
                else if ( (LA10_1==26) ) {
                    alt10=2;
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
                    // PsiInternalRoc.g:696:3: ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' )
                    {
                    // PsiInternalRoc.g:696:3: ( ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head' )
                    // PsiInternalRoc.g:697:4: ( (lv_turnHead_0_0= 'turn' ) ) otherlv_1= 'head'
                    {
                    // PsiInternalRoc.g:697:4: ( (lv_turnHead_0_0= 'turn' ) )
                    // PsiInternalRoc.g:698:5: (lv_turnHead_0_0= 'turn' )
                    {
                    // PsiInternalRoc.g:698:5: (lv_turnHead_0_0= 'turn' )
                    // PsiInternalRoc.g:699:6: lv_turnHead_0_0= 'turn'
                    {

                    						markLeaf(elementTypeProvider.getFullDirectedAction_TurnHeadTurnKeyword_0_0_0ElementType());
                    					
                    lv_turnHead_0_0=(Token)match(input,25,FOLLOW_15); 

                    						doneLeaf(lv_turnHead_0_0);
                    					

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getFullDirectedAction_HeadKeyword_0_1ElementType());
                    			
                    otherlv_1=(Token)match(input,20,FOLLOW_2); 

                    				doneLeaf(otherlv_1);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalRoc.g:723:3: ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' )
                    {
                    // PsiInternalRoc.g:723:3: ( ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes' )
                    // PsiInternalRoc.g:724:4: ( (lv_turnEyes_2_0= 'turn' ) ) otherlv_3= 'eyes'
                    {
                    // PsiInternalRoc.g:724:4: ( (lv_turnEyes_2_0= 'turn' ) )
                    // PsiInternalRoc.g:725:5: (lv_turnEyes_2_0= 'turn' )
                    {
                    // PsiInternalRoc.g:725:5: (lv_turnEyes_2_0= 'turn' )
                    // PsiInternalRoc.g:726:6: lv_turnEyes_2_0= 'turn'
                    {

                    						markLeaf(elementTypeProvider.getFullDirectedAction_TurnEyesTurnKeyword_1_0_0ElementType());
                    					
                    lv_turnEyes_2_0=(Token)match(input,25,FOLLOW_16); 

                    						doneLeaf(lv_turnEyes_2_0);
                    					

                    						if (!current) {
                    							associateWithSemanticElement();
                    							current = true;
                    						}
                    					

                    }


                    }


                    				markLeaf(elementTypeProvider.getFullDirectedAction_EyesKeyword_1_1ElementType());
                    			
                    otherlv_3=(Token)match(input,26,FOLLOW_2); 

                    				doneLeaf(otherlv_3);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFullDirectedAction"


    // $ANTLR start "entryRuleDirection"
    // PsiInternalRoc.g:753:1: entryRuleDirection returns [Boolean current=false] : iv_ruleDirection= ruleDirection EOF ;
    public final Boolean entryRuleDirection() throws RecognitionException {
        Boolean current = false;

        Boolean iv_ruleDirection = null;


        try {
            // PsiInternalRoc.g:753:51: (iv_ruleDirection= ruleDirection EOF )
            // PsiInternalRoc.g:754:2: iv_ruleDirection= ruleDirection EOF
            {
             markComposite(elementTypeProvider.getDirectionElementType()); 
            pushFollow(FOLLOW_1);
            iv_ruleDirection=ruleDirection();

            state._fsp--;

             current =iv_ruleDirection; 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDirection"


    // $ANTLR start "ruleDirection"
    // PsiInternalRoc.g:760:1: ruleDirection returns [Boolean current=false] : ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) ) ;
    public final Boolean ruleDirection() throws RecognitionException {
        Boolean current = false;

        Token lv_UP_0_0=null;
        Token lv_DOWN_1_0=null;
        Token lv_LEFT_2_0=null;
        Token lv_RIGHT_3_0=null;

        try {
            // PsiInternalRoc.g:761:1: ( ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) ) )
            // PsiInternalRoc.g:762:2: ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) )
            {
            // PsiInternalRoc.g:762:2: ( ( (lv_UP_0_0= 'up' ) ) | ( (lv_DOWN_1_0= 'down' ) ) | ( (lv_LEFT_2_0= 'left' ) ) | ( (lv_RIGHT_3_0= 'right' ) ) )
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
                    // PsiInternalRoc.g:763:3: ( (lv_UP_0_0= 'up' ) )
                    {
                    // PsiInternalRoc.g:763:3: ( (lv_UP_0_0= 'up' ) )
                    // PsiInternalRoc.g:764:4: (lv_UP_0_0= 'up' )
                    {
                    // PsiInternalRoc.g:764:4: (lv_UP_0_0= 'up' )
                    // PsiInternalRoc.g:765:5: lv_UP_0_0= 'up'
                    {

                    					markLeaf(elementTypeProvider.getDirection_UPUpKeyword_0_0ElementType());
                    				
                    lv_UP_0_0=(Token)match(input,27,FOLLOW_2); 

                    					doneLeaf(lv_UP_0_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // PsiInternalRoc.g:781:3: ( (lv_DOWN_1_0= 'down' ) )
                    {
                    // PsiInternalRoc.g:781:3: ( (lv_DOWN_1_0= 'down' ) )
                    // PsiInternalRoc.g:782:4: (lv_DOWN_1_0= 'down' )
                    {
                    // PsiInternalRoc.g:782:4: (lv_DOWN_1_0= 'down' )
                    // PsiInternalRoc.g:783:5: lv_DOWN_1_0= 'down'
                    {

                    					markLeaf(elementTypeProvider.getDirection_DOWNDownKeyword_1_0ElementType());
                    				
                    lv_DOWN_1_0=(Token)match(input,28,FOLLOW_2); 

                    					doneLeaf(lv_DOWN_1_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // PsiInternalRoc.g:799:3: ( (lv_LEFT_2_0= 'left' ) )
                    {
                    // PsiInternalRoc.g:799:3: ( (lv_LEFT_2_0= 'left' ) )
                    // PsiInternalRoc.g:800:4: (lv_LEFT_2_0= 'left' )
                    {
                    // PsiInternalRoc.g:800:4: (lv_LEFT_2_0= 'left' )
                    // PsiInternalRoc.g:801:5: lv_LEFT_2_0= 'left'
                    {

                    					markLeaf(elementTypeProvider.getDirection_LEFTLeftKeyword_2_0ElementType());
                    				
                    lv_LEFT_2_0=(Token)match(input,21,FOLLOW_2); 

                    					doneLeaf(lv_LEFT_2_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // PsiInternalRoc.g:817:3: ( (lv_RIGHT_3_0= 'right' ) )
                    {
                    // PsiInternalRoc.g:817:3: ( (lv_RIGHT_3_0= 'right' ) )
                    // PsiInternalRoc.g:818:4: (lv_RIGHT_3_0= 'right' )
                    {
                    // PsiInternalRoc.g:818:4: (lv_RIGHT_3_0= 'right' )
                    // PsiInternalRoc.g:819:5: lv_RIGHT_3_0= 'right'
                    {

                    					markLeaf(elementTypeProvider.getDirection_RIGHTRightKeyword_3_0ElementType());
                    				
                    lv_RIGHT_3_0=(Token)match(input,22,FOLLOW_2); 

                    					doneLeaf(lv_RIGHT_3_0);
                    				

                    					if (!current) {
                    						associateWithSemanticElement();
                    						current = true;
                    					}
                    				

                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleIntensity"
    // PsiInternalRoc.g:838:1: ruleIntensity returns [Boolean current=false] : ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) ) ;
    public final Boolean ruleIntensity() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

        try {
            // PsiInternalRoc.g:839:1: ( ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) ) )
            // PsiInternalRoc.g:840:2: ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) )
            {
            // PsiInternalRoc.g:840:2: ( (enumLiteral_0= 'pronounced' ) | (enumLiteral_1= 'trace of' ) | (enumLiteral_2= 'slightly' ) | (enumLiteral_3= 'severe' ) | (enumLiteral_4= 'maximum' ) )
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
                    // PsiInternalRoc.g:841:3: (enumLiteral_0= 'pronounced' )
                    {
                    // PsiInternalRoc.g:841:3: (enumLiteral_0= 'pronounced' )
                    // PsiInternalRoc.g:842:4: enumLiteral_0= 'pronounced'
                    {

                    				markLeaf(elementTypeProvider.getIntensity_CEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,29,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalRoc.g:851:3: (enumLiteral_1= 'trace of' )
                    {
                    // PsiInternalRoc.g:851:3: (enumLiteral_1= 'trace of' )
                    // PsiInternalRoc.g:852:4: enumLiteral_1= 'trace of'
                    {

                    				markLeaf(elementTypeProvider.getIntensity_AEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,30,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalRoc.g:861:3: (enumLiteral_2= 'slightly' )
                    {
                    // PsiInternalRoc.g:861:3: (enumLiteral_2= 'slightly' )
                    // PsiInternalRoc.g:862:4: enumLiteral_2= 'slightly'
                    {

                    				markLeaf(elementTypeProvider.getIntensity_BEnumLiteralDeclaration_2ElementType());
                    			
                    enumLiteral_2=(Token)match(input,31,FOLLOW_2); 

                    				doneLeaf(enumLiteral_2);
                    			

                    }


                    }
                    break;
                case 4 :
                    // PsiInternalRoc.g:871:3: (enumLiteral_3= 'severe' )
                    {
                    // PsiInternalRoc.g:871:3: (enumLiteral_3= 'severe' )
                    // PsiInternalRoc.g:872:4: enumLiteral_3= 'severe'
                    {

                    				markLeaf(elementTypeProvider.getIntensity_DEnumLiteralDeclaration_3ElementType());
                    			
                    enumLiteral_3=(Token)match(input,32,FOLLOW_2); 

                    				doneLeaf(enumLiteral_3);
                    			

                    }


                    }
                    break;
                case 5 :
                    // PsiInternalRoc.g:881:3: (enumLiteral_4= 'maximum' )
                    {
                    // PsiInternalRoc.g:881:3: (enumLiteral_4= 'maximum' )
                    // PsiInternalRoc.g:882:4: enumLiteral_4= 'maximum'
                    {

                    				markLeaf(elementTypeProvider.getIntensity_EEnumLiteralDeclaration_4ElementType());
                    			
                    enumLiteral_4=(Token)match(input,33,FOLLOW_2); 

                    				doneLeaf(enumLiteral_4);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntensity"


    // $ANTLR start "ruleDurationUnit"
    // PsiInternalRoc.g:894:1: ruleDurationUnit returns [Boolean current=false] : ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) ;
    public final Boolean ruleDurationUnit() throws RecognitionException {
        Boolean current = false;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

        try {
            // PsiInternalRoc.g:895:1: ( ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) ) )
            // PsiInternalRoc.g:896:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
            {
            // PsiInternalRoc.g:896:2: ( (enumLiteral_0= 'milliseconds' ) | (enumLiteral_1= 'seconds' ) | (enumLiteral_2= 'minutes' ) )
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
                    // PsiInternalRoc.g:897:3: (enumLiteral_0= 'milliseconds' )
                    {
                    // PsiInternalRoc.g:897:3: (enumLiteral_0= 'milliseconds' )
                    // PsiInternalRoc.g:898:4: enumLiteral_0= 'milliseconds'
                    {

                    				markLeaf(elementTypeProvider.getDurationUnit_MILLISECONDSEnumLiteralDeclaration_0ElementType());
                    			
                    enumLiteral_0=(Token)match(input,34,FOLLOW_2); 

                    				doneLeaf(enumLiteral_0);
                    			

                    }


                    }
                    break;
                case 2 :
                    // PsiInternalRoc.g:907:3: (enumLiteral_1= 'seconds' )
                    {
                    // PsiInternalRoc.g:907:3: (enumLiteral_1= 'seconds' )
                    // PsiInternalRoc.g:908:4: enumLiteral_1= 'seconds'
                    {

                    				markLeaf(elementTypeProvider.getDurationUnit_SECONDSEnumLiteralDeclaration_1ElementType());
                    			
                    enumLiteral_1=(Token)match(input,35,FOLLOW_2); 

                    				doneLeaf(enumLiteral_1);
                    			

                    }


                    }
                    break;
                case 3 :
                    // PsiInternalRoc.g:917:3: (enumLiteral_2= 'minutes' )
                    {
                    // PsiInternalRoc.g:917:3: (enumLiteral_2= 'minutes' )
                    // PsiInternalRoc.g:918:4: enumLiteral_2= 'minutes'
                    {

                    				markLeaf(elementTypeProvider.getDurationUnit_MINUTESEnumLiteralDeclaration_2ElementType());
                    			
                    enumLiteral_2=(Token)match(input,36,FOLLOW_2); 

                    				doneLeaf(enumLiteral_2);
                    			

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
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