package IT7320.Assignment3;

import static org.mockito.Mockito.*;


import junit.framework.TestCase;

public class CalcDivisionTest extends TestCase {
    CalcDivision obj3;
    int e,f;
    
	protected void setUp() throws Exception {
		obj3 = new CalcDivision();
		e = 3;
		f = 2;
		
		CalcInterface mockObj3 = mock(CalcInterface.class);
		when(mockObj3.division(e,f)).thenReturn((double)e/f);
		obj3.setCalcDiv(mockObj3);
		
	}

	

	public void testDivisionTwoNums() {
		assertEquals(1.5,obj3.divisionTwoNums(e,f));
	}
	
protected void tearDown() throws Exception {
		
	obj3 = null;
	e = 0;
	f = 0;
	}

}
