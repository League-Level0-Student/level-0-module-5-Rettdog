
public class Counter {

	public int countSheeps(Boolean[] array1) {

		int trueCounter = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] != null) {
				if (array1[i]) {
					trueCounter++;
				}

			}
		}
		return trueCounter;
	}

}
