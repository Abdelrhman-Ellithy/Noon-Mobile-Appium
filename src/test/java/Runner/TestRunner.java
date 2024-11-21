package Runner;
import Ellithium.core.base.BDDSetup;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        glue = {"stepDefinitions","Base"}, // path to your stepDefinitions package, note you should use . instead of /
        features="src/main/resources/features" // path to your features folder
)
public class TestRunner extends BDDSetup {
}