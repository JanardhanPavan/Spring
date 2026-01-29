package Demo2;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	private int eid;
	private String ename;
	
	public void start() {
		System.out.println("engine Started");
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Engine(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	public Engine() {
		super();
	}

	@Override
	public String toString() {
		return "Engine [eid=" + eid + ", ename=" + ename + "]";
	}
	
}
