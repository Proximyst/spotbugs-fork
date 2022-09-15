package edu.umd.cs.findbugs.nullness;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyIterable;

import edu.umd.cs.findbugs.AbstractIntegrationTest;
import org.junit.Test;

public class Issue2179Test extends AbstractIntegrationTest {

  @Test
  public void test() {
    performAnalysis("ghIssues/IssueX.class");
    assertThat(getBugCollection(), emptyIterable());
  }
}
