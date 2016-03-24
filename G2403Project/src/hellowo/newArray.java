package hellowo;
import javax.swing.*;
//import java.Ma
public class newArray {

	public static void main(String[] args) {
		int n,m;
		String text = "2x Arr";
		n=Integer.parseInt(JOptionPane.showInputDialog("rows:"));
		m=Integer.parseInt(JOptionPane.showInputDialog("columns:"));
	int[][] nums = new int [n][m];
	for (int i:nums[n-1]) {
		text+="\n";
		for(int k=0;k<m;k++) {
			nums[i][k]=(int)(100*Math.random());
			text+=nums[i][k]+" ";
		}
	}
	JOptionPane.showMessageDialog(null,text);
	}
	

}
