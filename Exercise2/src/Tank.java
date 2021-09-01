
public class Tank extends GameUnit{
	
	public Tank() {
		attackbehavior = new AttackBehavior_Cannon();
		movebehavior = new MoveBehavior_Driving();
		
		System.out.println("New Tank!");
	}
	public void swapWeapon() {
		if(attackbehavior.getClass() == AttackBehavior_Cannon.class) {
			this.SetAttackBehavior(new AttackBehavior_Rocket());
		}else {
			this.SetAttackBehavior(new AttackBehavior_Cannon());
		}
	}
	
	public void changeMovementType() {
		if(movebehavior.getClass() == MoveBehavior_Driving.class) {
			this.SetMoveBehavior(new MoveBehavior_Flying());
		}else {
			this.SetMoveBehavior(new MoveBehavior_Driving());
		}
	}
	
}
