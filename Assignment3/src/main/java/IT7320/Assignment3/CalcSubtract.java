package IT7320.Assignment3;

public class CalcSubtract {
	CalcInterface calcsub;
	public void setCalcsub(CalcInterface calcsub) {
		this.calcsub = calcsub;
	}
	public int subTwoNums(int x, int y)
	{
		return calcsub.subtract(x,y);
	}
	

}
