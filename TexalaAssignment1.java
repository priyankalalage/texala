package texalaAssignment1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;

public class TexalaAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		URL webpage = null;
		URLConnection conn=null;
		try {
		webpage = new URL("http://www.google.com");
		conn =webpage.openConnection();
		InputStreamReader reader =new InputStreamReader(conn.getInputStream(),"UTF8");
		BufferedReader buffer =new BufferedReader(reader);
		String line ="";
		while(true)
		{
			line=buffer.readLine();
			if(line!=null)
			{
				System.out.println(line);
			}
			else
			{
				break;
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

