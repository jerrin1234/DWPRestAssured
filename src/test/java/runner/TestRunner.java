package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import tests.GetAction;

@RunWith(Suite.class)
@Suite.SuiteClasses({

		GetAction.class })
public class TestRunner {
}