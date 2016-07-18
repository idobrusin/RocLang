package robot.control.conversion;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import robot.control.roc.BackForthDirectedAction;
import robot.control.roc.BackForthDirection;
import robot.control.roc.CompleteAction;
import robot.control.roc.DirectedAction;
import robot.control.roc.Direction;
import robot.control.roc.FullDirectedAction;
import robot.control.roc.LeftRightDirectedAction;
import robot.control.roc.LeftRightDirection;
import robot.control.roc.Motion;
import robot.control.roc.Movement;
import robot.control.roc.SingleAction;

public class MovementConverter {

	
	public static String convertMovements(EList<Movement> movements) throws JSONException {
		JSONObject result = new JSONObject();
		JSONArray movementList = new JSONArray();
		for (Movement movement : movements) {
			movementList.put(convertMotions(movement));
		}
		result.put("movements", movementList);
		
		return result.toString(2);
	}
	
	private static JSONObject convertMotions(Movement movement) throws JSONException {
		JSONObject motions = new JSONObject();
		JSONArray motionArray = new JSONArray();
		for (Motion motion : movement.getMotions()) {
			motionArray.put(convertSingleMotion(motion));
		}
		motions.put("motions", motionArray);
		
		return motions;
	}

	private static JSONObject convertSingleMotion(Motion motion) throws JSONException {
		JSONObject resultMotion = new JSONObject();
		resultMotion.put("action_unit", getActionUnit(motion));
		resultMotion.put("intensity", getIntensity(motion));
		resultMotion.put("duration", Integer.parseInt(motion.getDuration()));
		resultMotion.put("duration_unit", motion.getDurationUnit());
		return resultMotion;
	}

	private static String getIntensity(Motion motion) {
		if (motion.getAction().getActionHolder() instanceof CompleteAction) {
			return "C";
		}
		
		return motion.getAction().getIntensity().getName();
	}

	private static String getActionUnit(Motion motion) {
		EObject action = motion.getAction().getActionHolder();
		if (action instanceof SingleAction) {
			return getSingeActionUnit((SingleAction) action);
		} else if (action instanceof CompleteAction) {
			return getCompleteActionUnit((CompleteAction) action);
		} else if (action instanceof DirectedAction) {
			return getDirectedAction((DirectedAction) action);
		}
		return null;
	}

	private static String getDirectedAction(DirectedAction action) {
		EObject actionName = action.getActionName();
		if (actionName instanceof FullDirectedAction) {
			Direction direction = (Direction) action.getDirection();
			if (((FullDirectedAction) actionName).getTurnEyes() != null) {
				if (direction.getUP() != null) {
					return "63";
				} else if (direction.getDOWN() != null) {
					return "64";
				} else if (direction.getLEFT() != null) {
					return "61";
				} else if (direction.getRIGHT() != null) {
					return "62";
				}
			} else if (((FullDirectedAction) actionName).getTurnHead() != null) {
				if (direction.getUP() != null) {
					return "53";
				} else if (direction.getDOWN() != null) {
					return "54";
				} else if (direction.getLEFT() != null) {
					return "51";
				} else if (direction.getRIGHT() != null) {
					return "52";
				}
			}

		} else if (actionName instanceof LeftRightDirectedAction) {
			if (((LeftRightDirectedAction) actionName).getTiltHead() != null) {
				LeftRightDirection direction = (LeftRightDirection) action.getDirection();
				if (direction.getLeft() != null) {
					return "55";
				} else if (direction.getRight() != null) {
					return "56";
				}
			}
		} else if (actionName instanceof BackForthDirectedAction) {
			if (((BackForthDirectedAction) actionName).getHead() != null) {
				BackForthDirection direction = (BackForthDirection) action.getDirection();
				if (direction.getForth() != null) {
					return "";
				} else if (direction.getBack() != null) {
					return "";
				}
			}
		}
		return "Directed";
	}

	private static String getCompleteActionUnit(CompleteAction action) {
		if (action.getActionName().equals("neutral face")) {
			return "0";
		}
		return "Complete";
	}

	private static String getSingeActionUnit(SingleAction action) {
		System.out.println(action.getActionName());
		System.out.println("drop jaw");
		if (action.getActionName().equals("drop jaw")) {
			return "26";
		} else if (action.getActionName().equals("nod head")) {
			return "999";
		};
		return "Single";
	}
}
