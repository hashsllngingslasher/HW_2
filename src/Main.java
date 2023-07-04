public class Main {
    public static void main(String[] args) {
        String parameter_1 = walk(generateRandomAge(), 30);
        String parameter_2 = walk(generateRandomAge(), 0);
        String parameter_3 = walk(generateRandomAge(), -12);
        String parameter_4 = walk(generateRandomAge(), 32);
        String parameter_5 = walk(generateRandomAge(), 17);

        System.out.println("Recommendation 1: " + parameter_1 + "\n"
                + "Recommendation 2: " + parameter_2 + "\n"
                + "Recommendation 3: " + parameter_3 + "\n"
                + "Recommendation 4: " + parameter_4 + "\n"
                + "Recommendation 5: " + parameter_5);
    }

    public static String walk(int age, int temperature) {

        String rightDecision = "You can go walking";

        if ((age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return rightDecision;
        } else if (age < 20 && (temperature >= 0 && temperature <= 28)) {
            return rightDecision;
        } else if (age > 45 && (temperature >= -10 && temperature <= 25)) {
            return rightDecision;
        } else {
            return "Stay at home";
        }
    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 90 + 1);
    }


}