
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class Cities {

	public static void main(String[] args) {
		final String input =
		         "SMITH, JOHN, SAN JOSE, CA\n" +
		         "SMITH, LESLIE, SAN JOSE, CA\n" +
		         "JONES, KATE, OAKLAND, CA\n" +
		         "BLACK, KATE, OAKLAND, CA\n\n";
		                  
		      final String expected =
		            "OAKLAND, CA\n" +
		            " KATE BLACK\n" +
		            " KATE JONES\n" +
		            "SAN JOSE, CA\n" +
		            " JOHN SMITH\n" +
		            " LESLIE SMITH\n";

		      try {
				testProcess(input, expected);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	private static void testProcess(String input, String expected) throws Exception {
	      final ByteArrayOutputStream baos = new ByteArrayOutputStream();
	      final ByteArrayInputStream bais = new ByteArrayInputStream(input.getBytes("UTF-8"));

	      new Cities().process(bais, baos);
	      
	      final String result = baos.toString();
	      System.out.println(result);
	}

	   
	   public void process(InputStream is, OutputStream os) throws IOException { 
	      BufferedReader input =null;
	      StringBuilder sBuilder;
	      ArrayList<String> data = new ArrayList<String>();	
	      if(is.toString()!=""){
	      input = new BufferedReader(new InputStreamReader(is, "UTF-8"));     
	      sBuilder = new StringBuilder();    
	      String accept= input.readLine(); 
	      
	      data.add(accept);
	      System.out.println(accept);	      
	      while(accept.isEmpty()){
	    	  accept= input.readLine();  
	    	if(accept!=null& !accept.isEmpty()){
	     	  data.add(accept);
	     	 System.out.println(accept);
	    	}
	        } 
	      readData(data,os);
	      }
	      else{
	    	  String s= "";
				try {
					os.write(s.getBytes());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print("Null input is not valid...");
	      }
	}
	   public static boolean readData(ArrayList<String> input,OutputStream os ) {
			boolean b=false;
			
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
					String keyCityState = new String(tokens[2].trim()+","+tokens[3]);
					String valuesName = tokens[1].trim()+" "+tokens[0];
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
			printOutput(storeOutputMap,os);
			return b;
		}
	   public static void printOutput(HashMap<String,TreeSet<String>> map, OutputStream os){
			Object[] keysFromMap = map.keySet().toArray();	
			String ln= "\n";
			Arrays.sort(keysFromMap);
			for(Object key : keysFromMap) {		
					TreeSet<String> listMapValues= map.get(key);	
					byte[] b = key.toString().getBytes();
					try {
						os.write(b);
						os.write(ln.getBytes());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					//System.out.println(key);				
					Iterator<String> hashsetItr= listMapValues.iterator();
					while(hashsetItr.hasNext()){
						byte[] values = hashsetItr.next().getBytes();
						String space=" ";
						try {
							os.write(space.getBytes());
							os.write(values);
							os.write(ln.getBytes());
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						//System.out.println(" "+hashsetItr.next());		
				}
			}	
		}
}
