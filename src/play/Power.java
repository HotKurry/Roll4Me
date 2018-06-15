package play;

public class Power {
	private String info;
	private int id;
	
	public Power(int id) {
		this.id = id;
		info = getString(id);
		
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private String getString(int fID) {
		return Messages.getString("Power."+fID);

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
