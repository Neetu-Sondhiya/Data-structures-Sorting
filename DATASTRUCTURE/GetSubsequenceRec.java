import java.util.ArrayList;

public class GetSubsequenceRec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mohit";
		// bruteForce
		for(int i = 0 ;i<str.length();i++)
		{
			for(int j = i+1;j<=str.length();j++)
				System.out.println(str.substring(i,j));
		}
		System.out.println(getSS(str));

	}
	//MyRecursion function
	public static ArrayList<String> getSS(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> base = new ArrayList<String>();
			base.add(" ");
			return base;
		}
		char cc = str.charAt(0);
		String Ros = str.substring(1);
		ArrayList<String> Myres = new ArrayList<String>();
		ArrayList<String> Recres = getSS(Ros);
		for(int i = 0 ; i < Recres.size();i++)
		{
			Myres.add(Recres.get(i));
			Myres.add(cc+Recres.get(i));
		}
		return Myres;
	}

}
