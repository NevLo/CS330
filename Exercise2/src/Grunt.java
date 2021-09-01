
public class Grunt extends GameUnit{

	public Grunt() {
		attackbehavior = new AttackBehavior_Axe();
		movebehavior = new MoveBehavior_Walking();
		System.out.println("New Grunt!");
	}
	public void swapWeapon() {
		if(attackbehavior.getClass() == AttackBehavior_Axe.class) {
			this.SetAttackBehavior(new AttackBehavior_Pistol());
		}else {
			this.SetAttackBehavior(new AttackBehavior_Axe());
		}
	}
	
	
}
