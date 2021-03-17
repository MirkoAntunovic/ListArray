package listArrayProject;



public class dataBase { 
	
	   String drzava;
	
	 public dataBase(String drzava) {
		this.drzava=drzava;
		
		
	}
	 
	 
	 String getDrzava() {
		 return this.drzava=drzava;
	 }
	
	void setDrzava(String drzava) {
		this.drzava=drzava;
	}


	@Override
	public String toString() {
		return "dataBase [drzava=" + drzava + "]";
	}


	
	
	

}