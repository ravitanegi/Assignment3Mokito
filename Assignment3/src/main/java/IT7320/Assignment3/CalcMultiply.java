package IT7320.Assignment3;

public class CalcMultiply {
	CalcInterface calcMul;
	public void setCalcMul(CalcInterface calcMul) {
		this.calcMul = calcMul;
	}
	public int multiplyTwoNums(int c, int d)
	{
		return calcMul.multiply(c, d);
	}

}
