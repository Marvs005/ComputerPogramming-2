
public class Deduction {
	double sss;
	double pag_ibig;
	double philhealth;
	double tax;
	
	
	public Deduction(double sss, double pag_ibig, double philheath, double tax) {
		this.sss = sss;
		this.pag_ibig = pag_ibig;
		this.philhealth = philheath;
		this.tax = tax;
		
	}
	
	public double getsss() {
		return sss;
		
		
	}
	
	public double getpag_ibig() {
		return pag_ibig;

	}
	
	public double getphilhealth() {
		return philhealth;
	
	}
	
	
	public double gettax() {
		return tax;
		
	}

}
