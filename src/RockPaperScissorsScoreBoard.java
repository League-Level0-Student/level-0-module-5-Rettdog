import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class RockPaperScissorsScoreBoard {
	public static void main(String[] args) throws IOException {
		// inside of main
		Scanner scn = new Scanner(System.in);
		
		Scanner scan = new Scanner(new File("score.txt"));
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		JOptionPane.showMessageDialog(null, "Welcome to score board");
		// JOptionPane.showMessageDialog(null, "To use this program type in someone's
		// \nname to give them a point");
		// JOptionPane.showMessageDialog(null,"If a person wins in the finals, \nput the
		// word \"win\"+space in front of their \nname to give them 2 points");
		// JOptionPane.showMessageDialog(null, "Type \"stop\" to stop the program");
		int j = 0;
		int start = 0;
		int add =  0;
		
		if(scan.hasNextLine()) {
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			
			for (j = 0; j < line.length(); j++) {
				if (line.charAt(j) == ' ') {
					break;
				}

			}
			start = j;
			System.out.println(line);
			add = Integer.parseInt(line.substring(0, start));
			
			scores.put(line.substring(start+1) ,add);
			
		}
		}
		while (0 == 0) {
			String nextLine = scn.nextLine();
			if (nextLine.equals("stop")) {
				break;
			}
			int i = 0;
			for (i = 0; i < nextLine.length(); i++) {
				if (nextLine.charAt(i) == ' ') {
					break;
				}

			}
			start = i;
			add = Integer.parseInt(nextLine.substring(0, start));

			if (scores.containsKey(nextLine.substring(start + 1))) {
				scores.put(nextLine.substring(start + 1), scores.get(nextLine.substring(start + 1)) + add);

			} else {

				scores.put(nextLine.substring(start + 1), add);
			}

			// if (scn.hasNextLine()) {
			/*
			 * if (nextLine.substring(0, 4).equals("win ")) { if
			 * (scores.containsKey(nextLine.substring(4, nextLine.length()))) {
			 * scores.replace(nextLine.substring(4, nextLine.length()),
			 * scores.get(nextLine.substring(4, nextLine.length())),
			 * scores.get(nextLine.substring(4, nextLine.length()) + 2)); //
			 * (nextLine.substring(4, nextLine.length()), scores.get(nextLine.substring(4,
			 * // nextLine.length()) + 2));
			 * 
			 * } else { scores.put(nextLine.substring(4, nextLine.length()), 2); } } else if
			 * (scores.containsKey(nextLine)) { scores.replace(nextLine,
			 * scores.get(nextLine) + 1);
			 * 
			 * } else { scores.put(nextLine, 1); }
			 */
			// }

		}
		PrintWriter flw = new PrintWriter(new FileWriter("score.txt"));
		System.out.println(scores);
		
		for (String name : scores.keySet()) {
			flw.println(scores.get(name) + " " + name);

		}
flw.close();
		// inside of main
	}
	// outside of main

	// outside of main
}
