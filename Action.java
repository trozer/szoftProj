package szoftProj;

import java.awt.Color;
import java.util.ArrayList;

public class Action {
	private Color color;
	private ActionType type;
	private Direction direction;
	
	public Action(ActionType type, Direction direction, Color color){
		ArrayList<Object> parameters = new ArrayList<Object>();
		parameters.add(type);
		parameters.add(direction);
		parameters.add(color);
		parameters.add(Skeleton.getEmpty());
		Skeleton.callMethod("Konstruktor", this, parameters);
		
		this.color = color;
		this.type = type;
		this.direction = direction;
		
		Skeleton.returnMethod("Konstruktor", this, parameters);
	}
	
	public ActionType getType(){
		ArrayList<Object> parameters = new ArrayList<Object>();
		parameters.add(type);
		Skeleton.callMethod("getType", this, parameters);
		Skeleton.returnMethod("getType", this, parameters);
		return type;
	}
	
	public Color getColor(){
		ArrayList<Object> parameters = new ArrayList<Object>();
		parameters.add(color);
		Skeleton.callMethod("getColor", this, parameters);
		Skeleton.returnMethod("getColor", this, parameters);
		return color;
	}
	
	public Direction getDirection(){
		ArrayList<Object> parameters = new ArrayList<Object>();
		parameters.add(direction);
		Skeleton.callMethod("getDirection", this, parameters);
		Skeleton.returnMethod("getDirection", this, parameters);
		return direction;
	}
}
