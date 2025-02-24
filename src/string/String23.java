
package string;
public class String23 {
    public static void main(String[] args) {
        String expression = "4+7-2-8";
        int result = 0;
        int num = 0;
        char operator = '+';
        for (int i = 0; i < expression.length(); i++) {
            char ch = expression.charAt(i);
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }
            if (ch == '+' || ch == '-' || i == expression.length() - 1) {
                if (operator == '+') {
                    result += num;
                } else {
                    result -= num;
                }
                operator = ch;
                num = 0;
            }
        }
        System.out.println(result);
    }
}
