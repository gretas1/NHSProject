public class Project1 {
    public static void main(String[] args) {
        String[] days = {"monday", "tuesday", "wednesday", "thirsday", "friday", "saturday", "sunday"};
        String reverse = "";
        String str = "monday";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);


        }
        System.out.println(reverse);


        for (String day : days) {
            String reverse1 = "";
            for (int i = day.length() - 1; i >= 0; i--) {
                reverse1 = reverse1 + day.charAt(i);

            }
            System.out.println(reverse1);

        }


    }
}

