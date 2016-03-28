package szoftProj;

public class Abyss extends Field {

	public Abyss() {
	}

	@Override
	public void doo(Player player) {
		player.step(this);
		player.kill();
	}

	@Override
	public void doo(Bullet bullet) {
		bullet.step(this);
	}

	@Override
	public Field getNeighbourInDirection(Direction dir) {
		// TODO Auto-generated method stub
		return super.getNeighbourInDirection(dir);
	}

	@Override
	public boolean addUnit(Unit unit) {
		// TODO Auto-generated method stub
		return super.addUnit(unit);
	}

	@Override
	public void removeUnit() {
		// TODO Auto-generated method stub
		super.removeUnit();
	}

	@Override
	public void addNeighbour(Direction direction, Field neighbour) {
		// TODO Auto-generated method stub
		super.addNeighbour(direction, neighbour);
	}

}