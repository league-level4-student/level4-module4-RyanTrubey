package _01_introduction_to_encapsulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncapsulateTheDataTest {
	EncapsulateTheData e = new EncapsulateTheData();
	
	@Test
	void testDegreesTurned() {
		e.setDegreesTurned(-5);
		assertEquals(0, e.getDegreesTurned());
		e.setDegreesTurned(3460);
		assertEquals(360, e.getDegreesTurned());
		e.setDegreesTurned(60);
		assertEquals(60, e.getDegreesTurned());
	}
	
	@Test
	void testItemsRecieved() {
		e.setItemsRecieved(-234);
		assertEquals(0, e.getItemsRecieved());
		e.setItemsRecieved(324);
		assertEquals(324, e.getItemsRecieved());
	}
	
	@Test
	void testNomenclature() {
		e.setNomenclature("");
		assertEquals(" ", e.getNomenclature());
		e.setNomenclature("asdf");
		assertEquals("asdf", e.getNomenclature());
	}
	
	@Test
	void testMemberObj() {
		Object o = new Object();
		e.setMemberObj(o);
		assertEquals(o, e.getMemberObj());
		String s = "";
		e.setMemberObj(s);
		assertEquals(o.getClass(), e.getMemberObj().getClass());
	}
}
