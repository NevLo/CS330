
public class Main {

	public static void main(String[] args) {
		GameUnit grunt = new Grunt();
		GameUnit tank = new Tank();
		grunt.move();
		tank.move();
		grunt.attack();
		tank.attack();
		tank.swapWeapon();
		tank.attack();
		tank.swapWeapon();
		tank.attack();
	}


}
