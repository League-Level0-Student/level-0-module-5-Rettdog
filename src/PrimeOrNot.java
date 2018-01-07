import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Give me a number");
	int num = Integer.parseInt(number);
int prime = 1;
	for(int i=num-1;i>1;i--) {
		prime = 1;
		if(num%i==0) {
		prime = 0;
					i = 0;
		}
	}
	if(prime==0) {
		JOptionPane.showMessageDialog(null, num +" is composite.");
	}else if(num<0){
		JOptionPane.showMessageDialog(null, "I don't know");
	}else if(num==0||num==1){
		JOptionPane.showMessageDialog(null, num +" is not prime nor composite.");
	}else {
		JOptionPane.showMessageDialog(null, num +" is prime.");
	}
}
}
