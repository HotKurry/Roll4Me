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
		if(fID==0) {
			return "Gain a white die into your Devs";
		}else if(fID==1) {
			return "Gain a white die into your Fans";
		}else if(fID==2) {
			return "Gain a red die in your Devs";
		}else if(fID==3) {
			return "Gain a red die int your Fans";
		}else if(fID==4) {
			return "Gain a purple die in your Devs";
		}else if(fID==5) {
			return "Gain a purple die in your Fans";
		}else if(fID==6) {
			return "Gain a cyan die in your Devs";
		}else if(fID==7) {
			return "Gain a cyan die in your Fans";
		}else if(fID==8) {
			return "Gain a brown die in your Devs";
		}else if(fID==9) {
			return "Gain a brown die in your Fans";
		}else if(fID==10) {
			return "Gain a green die in your Devs";
		}else if(fID==11) {
			return "Gain a green die in your Fans";
		}else if(fID==12) {
			return "Gain a yellow die in your Devs";
		}else if(fID==13) {
			return "Gain a yellow die in your Fans";
		}else if(fID==14) {
			return "Gain a red good on this world.";
		}else if(fID==15) {
			return "Gain a cyan good on this world.";
		}else if(fID==16) {
			return "Gain a brown good on this world.";
		}else if(fID==17) {
			return "Gain a green good on this world.";
		}else if(fID==18) {
			return "Gain a yellow good on this world.";
		}else if(fID==19) {
			return "+1$";
		}else if(fID==20) {
			return "Set Starting $ to 8";
		}else if(fID==21) {
			return "remove any color dice";
		}
		return "notfound";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
