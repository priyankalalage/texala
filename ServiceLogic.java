package serviceLogic;
import java.io.*;

public class ServiceLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fstream=new FileInputStream("web-content.txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String strLine;
			while((strLine=br.readLine())!=null)
			{
				System.out.println(strLine);
				
			}
			in.close();
			
		}catch(Exception e)
		{
			System.err.println("Error:"+e.getMessage());
			
		}

	}

}
