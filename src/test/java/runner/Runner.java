package runner;


import cucumber.api.CucumberOptions;

@CucumberOptions(
features = {"src/test/java/stories/Login.feature"},
glue = {"steps"},
dryRun = false,
monochrome = true,
snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:Reports"}
		)


public class Runner extends  AbstractTestNGTests {

}
