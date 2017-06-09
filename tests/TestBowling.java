import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		//fail("Not yet implemented");
		Frame fr = new Frame(1,4);
		assertEquals(5,fr.score());
		
		
	}

}
