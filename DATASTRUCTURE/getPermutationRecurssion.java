
import java.util.ArrayList;

public class getPermutationRecurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "abc";
       ArrayList<String> result = getperm(str);
       System.out.println(result);
          
	}
    public static ArrayList<String> getperm(String str)
    {
  
    	if(str.length()==0)
    	{
    	  	ArrayList<String> base = new ArrayList();
    	  	base.add("");
    	  	return base;
    	}
    	char cc = str.charAt(0);
    	String Ros = str.substring(1);
    	
    	ArrayList<String> recRes = getperm(Ros);
    	ArrayList<String> myAns = new ArrayList();
    	for(String val:recRes)
    	{
    		for(int i = 0 ; i<=val.length();i++)
    		{
    			String temp = val.substring(0,i)+cc+val.substring(i);
//    			System.out.println(temp);
    			myAns.add(temp);
    		}
    	}
    	return myAns;
    }
}
