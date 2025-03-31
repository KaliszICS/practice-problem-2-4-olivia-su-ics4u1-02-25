public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void selectionSortName(String[] names, int[] ages){
		int n = names.length;

		for (int i = 0; i < n - 1; i++){
			int min = i;

			for (int j = i + 1; j < n; j++) {
				if (names[j].toLowerCase().compareTo(names[min].toLowerCase()) < 0){
					min = j;
				}
			}
			String tempNames = names[i];
			names[i] = names[min];
			names[min] = tempNames;

			int tempNum = ages[i];
			ages[i] = ages[min];
			ages[min] = tempNum;
		}
	}

	public static void selectionSortAge(String[] names, int[] ages){
		int n = ages.length;

		for (int i = 0; i < n - 1; i++){
			int min = i;

			for (int j = i + 1; j < n; j++) {
				if (ages[j] < ages[min]){
					min = j;
				}
			}
			String tempNames = names[i];
			names[i] = names[min];
			names[min] = tempNames;

			int tempNum = ages[i];
			ages[i] = ages[min];
			ages[min] = tempNum;
		}
	}

}
