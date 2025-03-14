package medium;
public class PassExam {
    public static String passExam(String studentsScore, String passingScore) {
        return Integer.parseInt(studentsScore.substring(0, studentsScore.length() - 1)) >= Integer
                .parseInt(passingScore.substring(0, passingScore.length() - 1)) ? "pass" : "fail";
    }
public static void main(String[] args) {
    System.out.println(PassExam.passExam("80%", "70%"));
}
}
