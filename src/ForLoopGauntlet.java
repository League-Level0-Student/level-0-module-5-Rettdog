
public class ForLoopGauntlet {
public static void main(String[] args) {
for(int i =0;i<3;i++) {
	
	for(int j = 0;j<3;j++) {
		System.out.print(i);
		System.out.println(j);
	}
	
	}
for (int k = 1; k < 8; k=k+3) {
	int m = k;
	for (int l = k; l < k+3; l++) {
		System.out.print(l);
	}
	System.out.println("");
	
}
for (int h = 1; h < 99; h=h+10) {
	
	for (int y = h; y < h+10; y++) {
		System.out.print(y+"\t");
	}
	System.out.println("");
}
for (int i = 0; i < 8; i++) {
	for (int j = 0; j < i; j++) {
		System.out.print("*\t");
	}
	System.out.println("");
}
for (int i = 0; i < 100; i++) {
	System.out.println(100-i);
}
}
}
