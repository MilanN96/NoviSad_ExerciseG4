import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() throws BowlingException{
		//fail("Not yet implemented");
		Frame fr = new Frame(1,4);
		assertEquals(5,fr.score());
		
		
	}
	@Test 
	public void TestSpare() throws BowlingException {
		Frame fr = new Frame(6,4);
		assertEquals(true,fr.isSpare());
	}
	@Test 
	public void TestSpare2() throws BowlingException {
		Frame fr = new Frame(6,3);
		assertEquals(false,fr.isSpare());
	}
	

}
