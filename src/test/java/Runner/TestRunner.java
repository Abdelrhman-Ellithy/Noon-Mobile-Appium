package Runner;
import Ellithium.core.base.BDDSetup;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        glue = {"stepDefinitions","Base"}, 
        features="src/main/resources/features"
)    // All the methods, packages used I created in the framework that is used
public class TestRunner extends BDDSetup {
}