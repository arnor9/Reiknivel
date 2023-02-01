package vidmot.reiknivel;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ReiknivelController {

    String op = "";
    String daemi = "";

    @FXML
    private TextField txt_result;

    @FXML
    private TextField savedNumbers;

    private String firstNumber = "";

    private String currentNumber = "";

    // private String calculationType;

    public void Operation(String op) {
        this.op = op;
        firstNumber = currentNumber;
        currentNumber = "";
        //savedNumbers.setText(firstNumber + " " + op);
    }

    public void Number(ActionEvent e) {
        daemi = (((Button) e.getSource()).getText());
        currentNumber += daemi;
        txt_result.setText(currentNumber);
        // no = Integer.parseInt(((Button) e.getSource()).getText());
        //txt_result.setText(txt_result.getText() + no);

    }

    public void Operation(ActionEvent e) {
        txt_result.setText("");
        firstNumber = currentNumber;
        currentNumber = "";
        op = ((Button) e.getSource()).getText();
        txt_result.setText(firstNumber + " " + op + " ");
        // savedNumbers.setText(firstNumber + " " + op);
        //txt_result.setText(txt_result.getText() + op);
        //daemi += ((Button) e.getSource()).getText();
    }

    public void Calculate(ActionEvent e) {
        int firstNumberInt = Integer.parseInt(firstNumber);
        int secondNumberInt = Integer.parseInt(currentNumber);

        int sum;
        switch (op) {
            case "+":
                sum = firstNumberInt + secondNumberInt;
                // savedNumbers.setText(firstNumberInt + " + " + secondNumberInt + " = " + sum);
                txt_result.setText(String.valueOf(sum));
                break;
            case "-":
                sum = firstNumberInt - secondNumberInt;
                // savedNumbers.setText(firstNumberInt + " - " + secondNumberInt + " = " + sum);
                txt_result.setText(String.valueOf(sum));
                break;
            case "*":
                sum = firstNumberInt * secondNumberInt;
                //savedNumbers.setText(firstNumberInt + " * " + secondNumberInt + " = " + sum);
                txt_result.setText(String.valueOf(sum));
                break;
            case "/":
                sum = firstNumberInt / secondNumberInt;
                // savedNumbers.setText(firstNumberInt + " / " + secondNumberInt + " = " + sum);
                txt_result.setText(String.valueOf(sum));
            default:
                System.out.print("villa");
        }
    }

    public void Clear(ActionEvent e) {
        txt_result.setText("");
        firstNumber = "";
        currentNumber = "";
    }
}
