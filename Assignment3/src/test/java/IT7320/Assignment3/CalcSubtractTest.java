package IT7320.Assignment3;
import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class CalcSubtractTest extends TestCase {
	CalcSubtract obj1;
	int x,y;

	protected void setUp() throws Exception {
		obj1 = new CalcSubtract();
		x = 8;
		y = 3;
		CalcInterface mockObj1 = mock(CalcInterface.class);
		when(mockObj1.subtract(x,y)).thenReturn(x-y);
		obj1.setCalcsub(mockObj1);
		
	}

	

	public void testSubTwoNums() {
		assertEquals(5,obj1.subTwoNums(x, y));
		
		
	}

protected void tearDown() throws Exception {
	obj1 = null;
	x = 0;
	y = 0;
		
	}
}
