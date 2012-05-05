import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class IncidentTest {
	Incident incident1,incident2,incident3;
	
	@Before
	public void setUp() throws Exception {
		incident1 = new Incident("[17:15:39.956] [@Illwrath] [@Illwrath] [Recharge and Reload {814287144615936}] [ApplyEffect {836045448945477}: Recharge and Reload {814287144615936}] ()");
		incident2 = new Incident("[16:55:07.574] [@Illwrath] [Project Sav-Rak {2819585900281856}] [] [ApplyEffect {836045448945477}: Damage {836045448945501}] (142* energy {836045448940874}) <214>");
		incident3 = new Incident("[16:55:08.869] [Project Sav-Rak {2819585900281856}] [@Illwrath] [Swipe {2861736709324800}] [ApplyEffect {836045448945477}: Damage {836045448945501}] (1771 kinetic {836045448940873}) <1771>");
	}
	@Test
	public void testTime1() {
		String expected = "17:15:39.956";
		String actual = incident1.getTime();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testSrcName1() {
		String expected = "Illwrath";
		String actual = incident1.getSourceName();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testSrcId1() {
		String expected = "Illwrath";
		String actual = incident1.getSourceId();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testIsSrcPlayer1() {
		boolean expected = true;
		boolean actual = incident1.isSourcePlayer();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testDestName1() {
		String expected = "Illwrath";
		String actual = incident1.getDestName();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testDestId1() {
		String expected = "Illwrath";
		String actual = incident1.getDestId();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testIsDestPlayer1(){
		boolean expected = true;
		boolean actual = incident1.isDestPlayer();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testincidentName1() {
		String expected = "Recharge and Reload";
		String actual = incident1.getName();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testNameId1() {
		String expected = "814287144615936";
		String actual = incident1.getName_id();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testincidentType1() {
		String expected = "ApplyEffect";
		String actual = incident1.getIncident_type();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testTypeId1() {
		String expected = "836045448945477";
		String actual = incident1.getIncident_id();
		Assert.assertEquals(expected, actual);
	}	
	@Test
	public void testEffect1() {
		String expected = "Recharge and Reload";
		String actual = incident1.getEffect();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testEffectId1() {
		String expected = "814287144615936";
		String actual = incident1.getEffect_id();
		Assert.assertEquals(expected, actual);
	}
//	()

	
	
	/////////////////////////////////	
	@Test
	public void testTime2() {
		String expected = "16:55:07.574";
		String actual = incident2.getTime();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testSrcName2() {
		String expected = "Illwrath";
		String actual = incident2.getSourceName();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testSrcId2() {
		String expected = "Illwrath";
		String actual = incident2.getSourceId();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testIsSrcPlayer2() {
		boolean expected = true;
		boolean actual = incident2.isSourcePlayer();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testDestName2() {
		String expected = "Project Sav-Rak";
		String actual = incident2.getDestName();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testDestId2() {
		String expected = "2819585900281856";
		String actual = incident2.getDestId();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testIsDestPlayer2() {
		boolean expected = false;
		boolean actual = incident2.isDestPlayer();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testincidentName2() {
		String expected = "";
		String actual = incident2.getName();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testNameId2() {
		String expected = "";
		String actual = incident2.getName_id();
		Assert.assertEquals(expected, actual);

	}
	@Test
	public void testincidentType2() {
		String expected = "ApplyEffect";
		String actual = incident2.getIncident_type();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testTypeId2() {
		String expected = "836045448945477";
		String actual = incident2.getIncident_id();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testEffect2() {
		String expected = "Damage";
		String actual = incident2.getEffect();
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void testEffectId2() {
		String expected = "836045448945501";
		String actual = incident2.getEffect_id();
		Assert.assertEquals(expected, actual);
	}
//	(142* energy {836045448940874}) <214>
}