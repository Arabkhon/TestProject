import java.util.Scanner;


public class Main1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����� ����� ���������:");
        String input = sc.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws Exception {
        String result;
        String[] operands = input.split(" ");
        if (operands.length >= 4) {
            throw new Exception("������ �������������� �������� �� ������������� ������� - ��� �������� � ���� �������� (+, -, /, *)");
        } else if (operands.length <= 2) {
            throw new Exception("������ �� �������� �������������� ���������");
        } else {
            int number1 = Integer.parseInt(operands[0]);
            int number2 = Integer.parseInt(operands[2]);
            if ((number1 >= 1 && number1 <= 10) && (number2 >= 1 && number2 <= 10)) {
                switch (operands[1]) {
                    case "+" -> {
                        int number = number1 + number2;
                        result = String.valueOf(number);
                        return result;
                    }
                    case "-" -> {
                        int number = number1 - number2;
                        result = String.valueOf(number);
                        return result;
                    }
                    case "*" -> {
                        int number = number1 * number2;
                        result = String.valueOf(number);
                        return result;
                    }
                    case "/" -> {
                        int number = number1 / number2;
                        result = String.valueOf(number);
                        return result;
                    }
                    default -> throw new Exception("����������� ��������� ������ (+, -, /, *)");
                }
            } else
                throw new Exception("����������� ��������� �� 1 �� 10");
        }
    }
}
