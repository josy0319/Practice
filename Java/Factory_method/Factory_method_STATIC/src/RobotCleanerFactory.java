
public class RobotCleanerFactory {
	public static RobotCleaner getRobotCleaner(Brand brand) {
		RobotCleaner robot = null;
		switch (brand) {
		case HANSUNG: robot = new HansungRobotCleaner(); break;
		case SAMSUNG: robot = new SamsungRobotCleaner(); break;
		}
		
		return robot;
	}
}
