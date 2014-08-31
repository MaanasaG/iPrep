

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class LLPbm {

	public static void main(String[] args) {
		Scanner input;
		String accept;
		int i=0;
		ArrayList<String> data = new ArrayList<String>();				
		do{
			input = new Scanner(System.in);
			System.out.println("Give your data and Please hit enter to exit");
			accept = input.nextLine();
			int c=0;
			
			for(int l=0, m =0;l<accept.length();l++){
				if(accept.charAt(l)==','){
					if(m>0)
						c++;
					else
						m=0;
					System.out.println(c);
				}				  
				m++;
			}
		    if (accept.length() > 0) { 
		   	   if(c==3){
		   		   data.add(accept);      
		   		   System.out.println("Added to list"); 
		   	   }
		   	   else{
		    	  System.out.println("Please enter valid input"); 
		   	     }
	        } 
		     else{
		    	break;
		    }
		    
		}while(true);
		readData(data);
	}
	public static boolean readData(ArrayList<String> input) {
		boolean b=false;
		if(input.equals(null)){	
			String s= "";
			OutputStream os = null;
			try {
				os.write(s.getBytes());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Null input is not valid...");
			return false;
		}
		java.util.Iterator<String> itr = input.iterator();		
		HashMap<String,TreeSet<String>> storeOutputMap = new HashMap<String,TreeSet<String>>();	
		//Hashmap can have multiple values for one key so I chose that
		
		//Objects are stored in sorted, ascending order in a tree set so I chose that.
		TreeSet<String> tempList; 
		TreeSet<String> setOfValues; 
		while(itr.hasNext()){			
			String readRow = itr.next().trim();
			if(readRow==null){
				return false;
			}
				String[] tokens = readRow.split(","); 
				if(tokens.equals(null)||tokens.length<4||tokens[0]==""||tokens[1]==""||tokens[2]==""||tokens[3]==""){
					return false;
				}
				String keyCityState = new String(tokens[2].trim()+","+tokens[3].trim());
				String valuesName = tokens[1].trim()+" "+tokens[0].trim();
				setOfValues = new TreeSet<String>();
				setOfValues.add(valuesName);
				if(storeOutputMap.containsKey(keyCityState)){
					tempList = new TreeSet<String>();
					tempList = storeOutputMap.get(keyCityState);
					tempList.add(valuesName);
					storeOutputMap.put(keyCityState, tempList);
				}else{
					storeOutputMap.put(keyCityState, setOfValues);
					b= true;
				}
		}
		printOutput(storeOutputMap);
		return b;
	}

	public static void printOutput(HashMap<String,TreeSet<String>> map){
		Object[] keysFromMap = map.keySet().toArray();	
		OutputStream os;
		Arrays.sort(keysFromMap);
		for(Object key : keysFromMap) {		
				TreeSet<String> listMapValues= map.get(key);
				
				//System.os.println(key);				
				Iterator<String> hashsetItr= listMapValues.iterator();
				while(hashsetItr.hasNext()){
					System.out.println(" "+hashsetItr.next());		
			}
		}	
	}
}
