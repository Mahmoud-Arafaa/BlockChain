import java.util.Arrays;
public class block {
	
    private String data;
    private int previousHash;
    private int hash;
    
    public block(String data, int previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.hash  = Arrays.hashCode(new Integer[]{data.hashCode(), previousHash});										 
													
        														
}
	public int getPreviousHash() {
		return previousHash;
	}
	
	public String getData() {
		return data;
	}
	
	public int getHash() {
		return hash;
	}
	
	
	
	
    
}
