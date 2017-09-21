package IT7320.Assignment3;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalcMultiplyTest extends TestCase {
	CalcMultiply obj2;
	int c,d;

	protected void setUp() throws Exception {
		obj2 = new CalcMultiply();
		c = 3;
		d = 4;
		CalcInterface mockObj2 = mock(CalcInterface.class);
		when(mockObj2.multiply(c,d)).thenReturn(c*d);
		obj2.setCalcMul(mockObj2);
	}

	

	public void testMultiplyTwoNums() {
		assertEquals(12,obj2.multiplyTwoNums(c, d));
	}
	
    protected void tearDown() throws Exception {
    	obj2 = null;
    	c = 0;
    	d = 0;
		
	}

}
