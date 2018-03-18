import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class RockPaperScissorsScoreBoard {
	public static void main(String[] args) throws IOException {
		// inside of main
		Scanner scn = new Scanner(System.in);
		FileWriter flw = new FileWriter("score.txt");
		FileReader flr = new FileReader("score.txt");
		HashMap<String, Integer> scores = new HashMap<String, Integer>();
		JOptionPane.showMessageDialog(null, "Welcome to score board");
		// JOptionPane.showMessageDialog(null, "To use this program type in someone's
		// \nname to give them a point");
		// JOptionPane.showMessageDialog(null,"If a person wins in the finals, \nput the
		// word \"win\"+space in front of their \nname to give them 2 points");
		// JOptionPane.showMessageDialog(null, "Type \"stop\" to stop the program");

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
			int start = i;
			int add = Integer.parseInt(nextLine.substring(0, start));

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

		System.out.println(scores);
		for (String name : scores.keySet()) {
			flw.write(scores.get(name) + " " + name);

		}

		// inside of main
	}
	// outside of main

	// outside of main
}
