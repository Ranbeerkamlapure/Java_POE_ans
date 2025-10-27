class InvalidGradeException extends RuntimeException {
    InvalidGradeException(String msg) {
        super(msg);
    }
}

class ReportCard {
    void setGrade(String grade) {
        if (!grade.matches("[ABCDF]")) {
            throw new InvalidGradeException("Invalid grade: " + grade);
        }
        System.out.println("Grade set to: " + grade);
    }
}

public class Set16_Q2_ReportCard {
    public static void main(String[] args) {
        ReportCard rc = new ReportCard();
        try {
            rc.setGrade("E");
        } catch (InvalidGradeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
