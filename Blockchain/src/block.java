import java.util.Arrays;
public class block {
	
    private String data;
    private int previousHash;
    private int hash;
    
    public block(String data, int previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.hash  = Arrays.hashCode(new Integer[]{data.hashCode(), previousHash});										 
        /*function to mix the pre_hash with the hash of the cur block "data" ;	
         but i have "data" as String so using INTEGER to convert from String to integer and get Arrays.hash to both data-hash and previous hash */													
        														
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