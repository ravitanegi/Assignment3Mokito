package IT7320.Assignment3;

public class CalcDivision {
	CalcInterface calcDiv;
	public void setCalcDiv(CalcInterface calcDiv) {
		this.calcDiv = calcDiv;
	}
	public double divisionTwoNums(int e, int f)
	{
		return calcDiv.division(e, f);
	}

}
