import java.io.*;
public class file 
{
	public static void main(String[] args) throws Exception
    	{	
			FileInputStream instream = new FileInputStream("myprog1.txt");
			FileOutputStream outstream = new FileOutputStream("myprog2.txt");
			while(instream.available()>0)
			{
				outstream.write((char)instream.read()+2);
			}
			instream.close();
			outstream.close();
    	}
}