package poly.edu;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestAllRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestSuites.class);

		if (result.getFailureCount() > 0) {
			System.out.println("Test thất bại");
			// Failure: List các testcase thất bại
			// In ra các testcase thất bại
			for (Failure failure : result.getFailures()) {
				System.out.println(failure.toString());
			}
		} else {
			System.out.println("Test thành công");
		}
	}

}
