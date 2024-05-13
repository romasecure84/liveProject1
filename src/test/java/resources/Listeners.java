package resources;

import base.BasePage;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BasePage implements ITestListener {

    public Listeners() throws IOException {
        super();
    }

    public void onTestFailure(ITestResult result) {
        try {
            takeSnapShot(result.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


