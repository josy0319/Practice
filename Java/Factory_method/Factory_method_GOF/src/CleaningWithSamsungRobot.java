
public class CleaningWithSamsungRobot extends CleaningWithRobot {

	@Override
	protected RobotCleaner getRobotCleaner() {
		// TODO Auto-generated method stub
		return new SamsungRobotCleaner();
	}

}
