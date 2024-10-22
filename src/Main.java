public class Main {
    public static void main(String[] args) {
        double celsius1 = 25.0;
        double fahrenheit1 = (celsius1 * 9 / 5) + 32;
        System.out.println("ცელსიუსები ფარენჰაიტებში: " + fahrenheit1);
        double fahrenheit2 = 77.0;
        double celsius2 = (fahrenheit2 - 32) * 5 / 9;
        System.out.println("ფარენჰაიტები ცელსიუსებში: " + celsius2);
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " ნაკიანია.");
        } else {
            System.out.println(year + " არაა ნაკიანი.");
        }
        double x = -5.0;
        double y = 7.0;
        if (x > 0 && y > 0) {
            System.out.println("წერტილი პირველ მეოთხედშია.");
        } else if (x < 0 && y > 0) {
            System.out.println("წერტილი მეორე მეოთხედშია.");
        } else if (x < 0 && y < 0) {
            System.out.println("წერტილი მესამე მეოთხედშია.");
        } else if (x > 0 && y < 0) {
            System.out.println("წერტილი მეოთხე მეოთხედშია.");
        } else if (x == 0 && y == 0) {
            System.out.println("წერტილი სათავეა.");
        } else if (x ==0 ) {
            System.out.println("წერტილი იგრეკ ღერძზეა");
        } else {
            System.out.println("წერტილი იქს ღერძზეა.");
        }
        char operator = '*';
        double num1 = 10.0;
        double num2 = 5.0;

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: 0-ზე გაყოფა არ შეიძლება.");
                }
                break;
            default:
                System.out.println("არასწორი ოპერატორი.");
        }
    }
}

