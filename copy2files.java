import java.io.*;
public class copy2files
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream file1 = new FileInputStream ("f1.txt");
		FileInputStream file2 = new FileInputStream ("f2.txt");
		String content ="";
		while(file1.available()!=0) 
		{
			content+= (char)file1.read();
		}
		file1.close();
		while(file2.available()!=0)
		{
			content+=  (char)file2.read();
		}
		file2.close();

		FileOutputStream file3 = new FileOutputStream ("f3.txt");
		for(int i=0; i<content.length();i++)
		{
			file3.write(content.charAt(i));
		}
		file3.close(); 
	}
}