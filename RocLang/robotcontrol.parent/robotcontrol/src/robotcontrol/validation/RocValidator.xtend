/*
 * generated by Xtext 2.10.0
 */
package robotcontrol.validation

import org.eclipse.xtext.validation.Check
import robotcontrol.roc.Movement
import robotcontrol.roc.Motion
import robotcontrol.roc.CompleteAction
import robotcontrol.roc.SingleAction
import robotcontrol.roc.RocPackage
import robotcontrol.roc.DurationUnit
import java.util.HashMap
import robotcontrol.roc.Program
import org.eclipse.emf.ecore.EStructuralFeature
import robotcontrol.roc.DirectedAction
import robotcontrol.roc.LeftRightDirectedAction
import robotcontrol.roc.FullDirectedAction
import robotcontrol.roc.Direction
import java.awt.image.DirectColorModel

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
class RocValidator extends AbstractRocValidator {
	
	
	public static val INVALID_NAME = 'invalidName'
	
	/**
	 * Checks a movement for physical constraint violations.
	 * A possible violations could be moving the same head feature in different direction in a single motion.
	 */
	@Check
	def checkMovementContraints(Movement movement) {
		
		// Map which stores whether an action is already used in given motion.
		val actionMap = new HashMap<String, Boolean>; 
		
		// Special map for FullDirectedActions, since each direction can be used twice (l/r and u/d)
		val directedActionMap = new HashMap<Pair<String, String>, Boolean>
		
		// Iterate over all motion for given movement.
		for (Motion motion : movement.motions) {
			val actionHolder = motion.action.actionHolder;
  			if (actionHolder instanceof CompleteAction) {
  				val ac = actionHolder as CompleteAction;
  				checkActionMapForAction(ac.actionName, actionMap)
  			} else if (motion.action.actionHolder instanceof SingleAction) {
  				val ac = actionHolder as SingleAction;
  				checkActionMapForAction(ac.actionName, actionMap)
  			} else if (motion.action.actionHolder instanceof DirectedAction) {
  				val ac = actionHolder as DirectedAction;
  				if (ac.actionName instanceof LeftRightDirectedAction) {
  					val directedAction = ac.actionName as LeftRightDirectedAction;
  					if (directedAction.tiltHead != null) {
  						checkActionMapForAction(directedAction.tiltHead, actionMap)
  					}
  				} else if (ac.actionName instanceof FullDirectedAction) {
  					val directedAction = ac.actionName as FullDirectedAction;
  					val fullDirection = ac.direction as Direction
  					if (directedAction.turnEyes != null) {
  						checkFullDirectedActionMapForAction(directedAction.turnEyes, fullDirection, directedActionMap)
  					} else if (directedAction.turnHead != null) {
  						// check whether left / right or up down is used simultaneously.
  						checkFullDirectedActionMapForAction(directedAction.turnEyes, fullDirection, directedActionMap)						
  					}
  				}
  			}
		}
	}
	
	def checkFullDirectedActionMapForAction(String actionName, Direction direction, HashMap directedActionMap) {
		if (directedActionMap.containsKey(new Pair(actionName, direction))) {
 			errorMultipleCommands(RocPackage.Literals.MOVEMENT__MOTIONS)
  		} else {
 			directedActionMap.put(new Pair(actionName, direction), true)
  		}
	}
	
	def checkActionMapForAction(String actionName, HashMap actionMap) {
		if (actionMap.containsKey(actionName)) {
 			errorMultipleCommands(RocPackage.Literals.MOVEMENT__MOTIONS)
  		} else {
 			actionMap.put(actionName, true)
  		}
	}
	
	def errorMultipleCommands(EStructuralFeature feature) {
		error('Multiple commands for same head feature. Remove duplicate motion', feature)
	}
	
	/**
	 * Checks a movement for physical constraint violations.
	 * A possible violations could be moving the same head feature in different direction in a single motion.
	 */
	@Check
	def checkDurationToLow(Motion motion) {
		
		if (motion.duration != null && Integer.parseInt(motion.duration) < 100 && motion.durationUnit.equals(DurationUnit.MILLISECONDS)) {
			warning('The duration of an Action should not be below 100 milliseconds', 
					RocPackage.Literals.MOTION__DURATION)
		}
	}
}
