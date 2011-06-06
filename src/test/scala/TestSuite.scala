import org.scalatest.junit.JUnitSuite
import org.junit.Test
import org.junit.Assert._

class TestSuite extends JUnitSuite {
  @Test
  def trueShouldBeTrue() {
    assertTrue(true)
  }

  @Test
  def greeterShouldSayHello() {
    val greeter = new Greeter
    assertEquals("Hello World!", greeter.say)
  }
}
