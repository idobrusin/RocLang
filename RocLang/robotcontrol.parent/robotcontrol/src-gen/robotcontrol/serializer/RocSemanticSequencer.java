/*
 * generated by Xtext 2.10.0
 */
package robotcontrol.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import robotcontrol.roc.CompleteAction;
import robotcontrol.roc.DirectedAction;
import robotcontrol.roc.Direction;
import robotcontrol.roc.FullDirectedAction;
import robotcontrol.roc.LeftRightDirectedAction;
import robotcontrol.roc.LeftRightDirection;
import robotcontrol.roc.Motion;
import robotcontrol.roc.Movement;
import robotcontrol.roc.Program;
import robotcontrol.roc.RocPackage;
import robotcontrol.roc.SingleAction;
import robotcontrol.roc.Speed;
import robotcontrol.services.RocGrammarAccess;

@SuppressWarnings("all")
public class RocSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private RocGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == RocPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case RocPackage.ACTION:
				sequence_Action(context, (robotcontrol.roc.Action) semanticObject); 
				return; 
			case RocPackage.COMPLETE_ACTION:
				sequence_CompleteAction(context, (CompleteAction) semanticObject); 
				return; 
			case RocPackage.DIRECTED_ACTION:
				sequence_DirectedAction(context, (DirectedAction) semanticObject); 
				return; 
			case RocPackage.DIRECTION:
				sequence_Direction(context, (Direction) semanticObject); 
				return; 
			case RocPackage.FULL_DIRECTED_ACTION:
				sequence_FullDirectedAction(context, (FullDirectedAction) semanticObject); 
				return; 
			case RocPackage.LEFT_RIGHT_DIRECTED_ACTION:
				sequence_LeftRightDirectedAction(context, (LeftRightDirectedAction) semanticObject); 
				return; 
			case RocPackage.LEFT_RIGHT_DIRECTION:
				sequence_LeftRightDirection(context, (LeftRightDirection) semanticObject); 
				return; 
			case RocPackage.MOTION:
				sequence_Motion(context, (Motion) semanticObject); 
				return; 
			case RocPackage.MOVEMENT:
				sequence_Movement(context, (Movement) semanticObject); 
				return; 
			case RocPackage.PROGRAM:
				sequence_Program(context, (Program) semanticObject); 
				return; 
			case RocPackage.SINGLE_ACTION:
				sequence_SingleAction(context, (SingleAction) semanticObject); 
				return; 
			case RocPackage.SPEED:
				sequence_Speed(context, (Speed) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Action returns Action
	 *
	 * Constraint:
	 *     (actionHolder=CompleteAction | (intensity=Intensity? actionHolder=SingleAction) | (intensity=Intensity? actionHolder=DirectedAction))
	 */
	protected void sequence_Action(ISerializationContext context, robotcontrol.roc.Action semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     CompleteAction returns CompleteAction
	 *
	 * Constraint:
	 *     actionName='neutral face'
	 */
	protected void sequence_CompleteAction(ISerializationContext context, CompleteAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RocPackage.Literals.COMPLETE_ACTION__ACTION_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RocPackage.Literals.COMPLETE_ACTION__ACTION_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCompleteActionAccess().getActionNameNeutralFaceKeyword_0(), semanticObject.getActionName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DirectedAction returns DirectedAction
	 *
	 * Constraint:
	 *     ((actionName=LeftRightDirectedAction direction=LeftRightDirection) | (actionName=FullDirectedAction direction=Direction))
	 */
	protected void sequence_DirectedAction(ISerializationContext context, DirectedAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Direction returns Direction
	 *
	 * Constraint:
	 *     (UP='up' | DOWN='down' | LEFT='left' | RIGHT='right')
	 */
	protected void sequence_Direction(ISerializationContext context, Direction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FullDirectedAction returns FullDirectedAction
	 *
	 * Constraint:
	 *     (turnHead='turn head' | turnEyes='turn eyes')
	 */
	protected void sequence_FullDirectedAction(ISerializationContext context, FullDirectedAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     LeftRightDirectedAction returns LeftRightDirectedAction
	 *
	 * Constraint:
	 *     tiltHead='tilt head'
	 */
	protected void sequence_LeftRightDirectedAction(ISerializationContext context, LeftRightDirectedAction semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, RocPackage.Literals.LEFT_RIGHT_DIRECTED_ACTION__TILT_HEAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, RocPackage.Literals.LEFT_RIGHT_DIRECTED_ACTION__TILT_HEAD));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLeftRightDirectedActionAccess().getTiltHeadTiltHeadKeyword_0(), semanticObject.getTiltHead());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     LeftRightDirection returns LeftRightDirection
	 *
	 * Constraint:
	 *     (left='left' | right='right')
	 */
	protected void sequence_LeftRightDirection(ISerializationContext context, LeftRightDirection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Motion returns Motion
	 *
	 * Constraint:
	 *     ((action=Action duration=DURATION durationUnit=DurationUnit) | (action=Action speed=Speed) | action=Action)
	 */
	protected void sequence_Motion(ISerializationContext context, Motion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Movement returns Movement
	 *
	 * Constraint:
	 *     (motions+=Motion motions+=Motion*)
	 */
	protected void sequence_Movement(ISerializationContext context, Movement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Program returns Program
	 *
	 * Constraint:
	 *     movements+=Movement+
	 */
	protected void sequence_Program(ISerializationContext context, Program semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SingleAction returns SingleAction
	 *
	 * Constraint:
	 *     (actionName='drop jaw' | actionName='nod head')
	 */
	protected void sequence_SingleAction(ISerializationContext context, SingleAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Speed returns Speed
	 *
	 * Constraint:
	 *     (SLOWEST='slowest' | SLOW='slow' | NORMAL='normal' | FAST='fast' | FULL='full')
	 */
	protected void sequence_Speed(ISerializationContext context, Speed semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
