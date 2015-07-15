package org.kpkurian.gof_design_patterns.creational.singleton;

public final/*should not subclass*/ class GofSingleton {
	
	private final static GofSingleton gofSingleton = new GofSingleton();
	
	public static GofSingleton getInstance(){
		return gofSingleton;
	}
	
	//should not use new to create new instance
	private GofSingleton(){
		
	}	
	
	//shared resource/data
	private String greetings = "Hello";

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((greetings == null) ? 0 : greetings.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GofSingleton other = (GofSingleton) obj;
		if (greetings == null) {
			if (other.greetings != null)
				return false;
		} else if (!greetings.equals(other.greetings))
			return false;
		return true;
	}

}
