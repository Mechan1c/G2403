package hellowo;

import javax.swing.*;

public class useSwitch {

	public static void main (String [] args) {
		int num;
		String text, str;
		text = JOptionPane.showInputDialog("Inp num");
		num = Integer.parseInt(text);
		switch (num) {
		case 0:  str = "zero"; 
				break;
		case 1 : str = "one";
		case 2 :
		case 3 :
		case 5 :
		case 7 : 
			str = "simpl";
			break;
		case 4:
		case 6:
		case 8:
		case 10:
			str = "//2 num";
			break;
		default:
		str = "num 9 or out";
		
		}
		JOptionPane.showMessageDialog(null, str);
	}
}
