import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class GradeCalculator {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java GradeCalculator <grade> [<grade> ...]");
            System.exit(1);
        }

        List<BigDecimal> grades = new ArrayList<>();
        for (String argument : args) {
            if (!argument.matches("[+-]?(?:[0-9]+(?:\\.[0-9]*)?|\\.[0-9]+)")) {
                System.err.println("Invalid grade: " + argument + ". Enter a number from 0 to 100.");
                System.exit(1);
            }

            BigDecimal grade = new BigDecimal(argument);
            if (grade.signum() < 0 || grade.compareTo(BigDecimal.valueOf(100)) > 0) {
                System.err.println("Grade out of range: " + argument + ". Use 0 to 100.");
                System.exit(1);
            }
            grades.add(grade);
        }

        printSummary(grades);
    }

    private static void printSummary(List<BigDecimal> grades) {
        BigDecimal total = BigDecimal.ZERO;
        BigDecimal highest = grades.get(0);
        BigDecimal lowest = grades.get(0);

        for (BigDecimal grade : grades) {
            total = total.add(grade);

            if (grade.compareTo(highest) > 0) {
                highest = grade;
            }

            if (grade.compareTo(lowest) < 0) {
                lowest = grade;
            }
        }

        BigDecimal count = BigDecimal.valueOf(grades.size());
        BigDecimal average = total.divide(count, 2, RoundingMode.HALF_UP);

        String letterGrade;

        if (total.compareTo(count.multiply(BigDecimal.valueOf(90))) >= 0) {
            letterGrade = "A";
        } else if (total.compareTo(count.multiply(BigDecimal.valueOf(80))) >= 0) {
            letterGrade = "B";
        } else if (total.compareTo(count.multiply(BigDecimal.valueOf(70))) >= 0) {
            letterGrade = "C";
        } else if (total.compareTo(count.multiply(BigDecimal.valueOf(60))) >= 0) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }

       
System.out.println("Average: " + average.toPlainString()
        + "\nLetter Grade: " + letterGrade
        + "\nHighest Grade: " + highest.setScale(2, RoundingMode.HALF_UP).toPlainString()
        + "\nLowest Grade: " + lowest.setScale(2, RoundingMode.HALF_UP).toPlainString());

    }
}
