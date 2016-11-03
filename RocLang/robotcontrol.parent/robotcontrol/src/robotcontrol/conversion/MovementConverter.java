package robotcontrol.conversion;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import robotcontrol.roc.CompleteAction;
import robotcontrol.roc.DirectedAction;
import robotcontrol.roc.Direction;
import robotcontrol.roc.DurationUnit;
import robotcontrol.roc.FullDirectedAction;
import robotcontrol.roc.LeftRightDirectedAction;
import robotcontrol.roc.LeftRightDirection;
import robotcontrol.roc.Motion;
import robotcontrol.roc.Movement;
import robotcontrol.roc.SingleAction;
import robotcontrol.roc.Speed;

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
		if (motion.getDuration() != null) {
			resultMotion.put("duration", getDurationFromUnit(Integer.parseInt(motion.getDuration()), motion.getDurationUnit()));
		} 
		else if (motion.getSpeed() != null) {
			resultMotion.put("duration", getSpeed(motion.getSpeed()));
		} else {
			resultMotion.put("duration", getDefaultSpeed());
		}
		return resultMotion;
	}
	
	private static int getDefaultSpeed() {
		return 700;
	}
	
	private static int getSpeed(Speed speed) {
		if (speed.getSLOWEST() != null) {
			return 1000;
		} else if (speed.getSLOW() != null) {
			return 800;
		} else if (speed.getNORMAL() != null) {
			return 700;
		} else if (speed.getFAST() != null) {
			return 500;
		} else if (speed.getFULL() != null) {
			return 400;
		}
		return 1000;
	}

	private static int getDurationFromUnit(int duration, DurationUnit unit) {
		if (unit.equals(DurationUnit.SECONDS)) {
			return duration * 1000;
		} else if (unit.equals(DurationUnit.MINUTES)) {
			return duration * 1000 * 60;
		}
		return duration;

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
