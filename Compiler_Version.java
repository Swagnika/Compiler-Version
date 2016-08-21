
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Compiler_version {
	public static void main(String args[] ) throws IOException {
		List<String> ll= new ArrayList<String>() ; 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String line,result,output;
		
		while((line=br.readLine())!=null && line.length()!=0){
			output="";
			String[] str= line.split("//", 2);
			if(str.length==1){
				result=line.replaceAll("->", ".");
				output=result;
			}
			else{
				if(str[0].length()==0){
						output+="//"+str[1];
				}
				else{
				result=str[0].replaceAll("->", ".");
				output+=result+"//"+str[1];
				}
				
			}
			ll.add(output);
		}
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
	}
}
