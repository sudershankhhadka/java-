package Arrays;

public class ArrayEx2 {
    public static void main(String[] args) {
        String[] subject = {"Nepali", "Math", "English", "Social", "Computer"};
        int[] marks = {90, 80, 70, 60, 50};
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        int percent = total / 5;
        System.out.println("The subjects and the amrks are ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(subject[i] + " " + marks[i]);
            System.out.println();
        }
        System.out.println("Total Marks:" + total);
        System.out.println("Percentage: " + percent);

    }

}
