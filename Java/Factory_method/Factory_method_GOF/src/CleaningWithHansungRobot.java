
public class CleaningWithHansungRobot extends CleaningWithRobot {

	@Override
	protected RobotCleaner getRobotCleaner() {
		// TODO Auto-generated method stub
		return new HansungRobotCleaner();
	}

}
