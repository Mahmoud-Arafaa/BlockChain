import java.lang.reflect.Array;
import java.text.*;
import java.util.*;
import java.util.ArrayList;																			
import java.util.List;
public class blockchain {
    public static void main(String[] args) {
        List<block> blockChainList =  new ArrayList<>();
       
        
        block first = new block("lian", 0);														
        blockChainList.add(first);																	
                
        System.out.println(first.getPreviousHash());
        System.out.println(first.getHash());														
        																						
        
        block second = new block("tom",blockChainList.get(blockChainList.size()-1).getHash()); 
        blockChainList.add(second);	
        
        System.out.println(second.getPreviousHash());
        System.out.println(second.getHash());																					
		 																				
        
        block third = new block("mohsen",blockChainList.get(blockChainList.size()-1).getHash()); 
        blockChainList.add(third);
        				
        System.out.println(third.getPreviousHash());
        System.out.println(third.getHash());
        
        System.out.println("There Is NO Changes in The Blocks");
        System.out.println("Check validation :(True OR False ) >> " + validate(blockChainList));                       
        																					
        
         
       /* Replacing in one of the blocks */
       block replaced = new block ("viggo mortensen",second.getHash());
       int index = blockChainList.indexOf(second);
       blockChainList.remove(index);
       blockChainList.add(index, replaced);
       System.out.println("There Is A Changes in Some Block ");
       System.out.println("Check validation :(True OR False ) >> " + validate(blockChainList));
       
    }
    
    
    
    private static boolean validate(List<block> table) {
        boolean result = true;
        block lastBlock = null;
        for(int i = table.size() -1; i >= 0; i--) {
            if(lastBlock == null) {
                lastBlock = table.get(i);
            }
            else {
            	block current = table.get(i);
                if(lastBlock.getPreviousHash() != current.getHash()) {
                    result = false;
                    break;
                }
                lastBlock = current;
            }
        }
        return result;
    }
    
    
    private String pow (block b) {
		return null;
    }
    
    
    
    
    
    
    
}