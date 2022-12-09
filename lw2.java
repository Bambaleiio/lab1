import java.util.Scanner;

class FirstProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strDate;
        System.out.print("Date: ");
        strDate = sc.next();

        String strPattern = "((31/(0[13578]|1[02])|30/(0[13-9]|1[0-2])|(0[1-9]|[1-2]\\d)/(0[1-9]|1[0-2]))/(19\\d{2}|[2-9]\\d{3}))";
        String strPatternOtherSeparator = "((31.(0[13578]|1[02])|30.(0[13-9]|1[0-2])|(0[1-9]|[1-2]\\d).(0[1-9]|1[0-2])).(19\\d{2}|[2-9]\\d{3}))";
        if (strDate.matches(strPattern))
            System.out.println("String is a valid date");
        else if (strDate.matches(strPatternOtherSeparator))
            System.out.println("String is invalid date");
        else
            System.out.println("String is not a date");
    }
}

class SecondProblem {
    public static boolean checkPassword(String password) {
        if (password.length() < 8) return false;
        return password.matches(".*[0-9].*") &&
                password.matches(".*[a-z].*") &&
                password.matches(".*[A-Z].*");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password;
        System.out.print("Password: ");
        password = sc.next();

        if (checkPassword(password)) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }
}
