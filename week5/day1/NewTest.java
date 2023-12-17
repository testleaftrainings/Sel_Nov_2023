package testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void test3() {
	  System.out.println("Learning Annotation hirerachy -3");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass from new Test");
  }
  
}
