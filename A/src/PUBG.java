public class PUBG {
	String name;
	private String type;
    private int result;
	
	public PUBG(String name) {
		this.name=name;
	}
	
        @Override
	public String toString(){
		return "Game Name: "+name+"\nGame Type: "+getType();
	}

    public int getType(){
        return this.result;
    }
}
