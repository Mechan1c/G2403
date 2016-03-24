package hellowo;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class filex
{

	public static void main(String[] args)
	{
		fifi();

	}
public static void fifi() {

			//System.out.println(txt.getText());
		String rr =JOptionPane.showInputDialog("Input file name");
		
		
		tryWrite(rr);
		
		
		
	}
	 
	
	        
	private static void tryWrite(String rr)
	{
		try
		{
			
			PrintWriter out = new PrintWriter("C:///Users//Mechanic//Documents//Javalearnin//"+rr+".txt");
			out.print("jopas");
			out.close();
		
		} catch (IOException e1)
		{
			
			File faylik = new File("C:///Users//Mechanic//Documents//Javalearnin//"+rr+".txt");
			tryWrite(rr);
		}
		
	}

}

