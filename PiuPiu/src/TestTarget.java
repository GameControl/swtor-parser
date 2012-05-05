
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestTarget {

	Target target1;
	Target target2;
	Incident incident1;
	@Before
	public void setUp() throws Exception {
		target1 = new Target("Project Sav-Rak {2819585900281856}");
		target2 = new Target("@Illwrath");
	}

	@Test
	public void testName1() {
		String expected = "Project Sav-Rak";
		String actual = target1.getName();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testName2() {
		String expected = "Illwrath";
		String actual = target2.getName();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testId1() {
		String expected = "2819585900281856";
		String actual = target1.getId();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testId2() {
		String expected = "Illwrath";
		String actual = target2.getId();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testPlayer1() {
		boolean expected = false;
		boolean actual = target1.isPlayer();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testPlayer2() {
		boolean expected = true;
		boolean actual = target2.isPlayer();
		Assert.assertEquals(expected, actual);
	}

}
