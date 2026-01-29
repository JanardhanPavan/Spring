package Demo;

public class IdCard {
	private int idno;
	private String sname;
	private int std;
	public int getIdno() {
		return idno;
	}
	public void setIdno(int idno) {
		this.idno = idno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getStd() {
		return std;
	}
	public void setStd(int std) {
		this.std = std;
	}
	public IdCard(int idno, String sname, int std) {
		super();
		this.idno = idno;
		this.sname = sname;
		this.std = std;
	}
	public IdCard() {
		super();
	}
	@Override
	public String toString() {
		return "IdCard [idno=" + idno + ", sname=" + sname + ", std=" + std + "]";
	}
	
	
}
