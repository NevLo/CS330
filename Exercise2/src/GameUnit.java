
public abstract class GameUnit {
	AttackBehavior attackbehavior;
	MoveBehavior movebehavior;
	
	
	public void attack() {
		attackbehavior.attack();
	}
	public void move() {
		movebehavior.move();
	}
	
	
	public void SetAttackBehavior(AttackBehavior AB) {
		this.attackbehavior = AB;
	}

	public void SetMoveBehavior(MoveBehavior MB) {
		this.movebehavior = MB;
	}
	
	public void swapWeapon() {}
}
