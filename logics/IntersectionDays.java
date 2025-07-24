package logics;

public class IntersectionDays {
    public static void main(String[] args) {
        String[] days1 = {"Monday", "Tuesday", "Wednesday", "Friday"};
        String[] days2 = {"Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Common days: ");
        for (int i = 0; i < days1.length; i++) {
            for (int j = 0; j < days2.length; j++) {
                if (days1[i].equals(days2[j])) {
                    System.out.print(days1[i] + " ");
                    break; // Prevent duplicates
                }
            }
        }
    }
}

