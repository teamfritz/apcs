package projects;

public class fraction {
	private int numer, denom;
	
	public fraction (int top, int bottom) {
		numer = top;
		denom = bottom;
	}
	
	public int getNumerator() {
		return numer;
	}
	
	public int getDenominator() {
		return denom;
	}
	
	public String toString() {
		return numer + "\n--\n" + denom;
	}
	
	public String toStringOneLine() {
		return numer + " / " + denom;
	}
	
	public fraction addTo(fraction temp) {
		int top, bottom;
		bottom = denom*temp.getDenominator();
		top = numer*temp.getDenominator() + temp.getNumerator()*denom;
		fraction result = new fraction(top, bottom);
		return result;
	}
	
	public fraction subtractFrom(fraction temp) {
		int top, bottom;
		bottom = denom*temp.getDenominator();
		top = -numer*temp.getDenominator() + temp.getNumerator()*denom;
		fraction result = new fraction(top, bottom);
		return result;
	}
	
	public fraction multiplyBy(fraction temp) {
		int top, bottom;
		bottom = denom*temp.getDenominator();
		top = numer*temp.getNumerator();
		fraction result = new fraction(top, bottom);
		return result;
	}
	
	public fraction divideBy(fraction temp) {
		int top, bottom;
		bottom = denom*temp.getNumerator();
		top = numer*temp.getDenominator();
		fraction result = new fraction(top, bottom);
		return result;
	}

}
