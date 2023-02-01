package vinnsla;

public class Reiknivel {

    public int reikna(String op, int firstNumber, int secondNumber) {
        int a;
        int b;
        //a = Integer.parseInt(calc.substring(0, 1));
        // b = Integer.parseInt(calc.substring(2, 3));
        // String op = calc.substring(1, 2);
        // a = Integer.parseInt(fylki[0]);
        //op = fylki[1];
        // b = Integer.parseInt(fylki[2]);


        int sum = 0;
        switch (op) {
            case "+":
                sum = firstNumber + secondNumber;
                break;
            case "-":
                sum = firstNumber - secondNumber;
                break;
            case "*":
                sum = firstNumber * secondNumber;
                break;
            case "/":
                sum = firstNumber / secondNumber;
            default:
                System.out.print("villa");
        }
        return sum;
    }

    public static void main(String[] args) {

    }
}
