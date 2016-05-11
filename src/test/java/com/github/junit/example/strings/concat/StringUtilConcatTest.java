package com.github.junit.example.strings.concat;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by vlad on 01.05.16.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "html:target/html/"},
        features = "src/test/java/com/github/junit/example/strings/concat/"
)
public class StringUtilConcatTest {
}
