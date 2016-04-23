package szoftProj;

public class ZPM extends Unit{

    public ZPM(Field currentField) {
        this.currentField = currentField;
    }

    public void accept(Field launcher, Player target) {
        switch (target.getAction().getType()) {
            case GRAB:
                target.addZPM(this);
                launcher.removeUnit();
                break;
            case MOVE:
                target.addZPM(this);
                launcher.removeUnit();
                break;
            default:
                break;
        }
    }
    
    public String toString(){
    	return "ZPM";
    }
}