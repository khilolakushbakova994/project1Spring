package com.itproject.projectsample;

import org.springframework.stereotype.Service;

@Service

public class CalculatorServiceImpl implements CalculatorService {

    public String welcomingText() {
        return "<b> Калькулятор </b>";
    }


    public String welcoming() {

        return "<b> “Добро пожаловать в калькулятор\". </b>";
    }

    public String sum(int number1, int number2) {
        return number1 + " + " + number2 + " = " + (number1 + number2);
    }

    public String deduction(int number1, int number2) {
        return number1 + " - " + number2 + " = " + (number1 - number2);
    }

    public String multiply(int number1, int number2) {
        return number1 + " * " + number2 + " = " + (number1 * number2);
    }

    public String divide(int number1, int number2) {
        if (number2 == 0) {
            return " На ноль делить НЕЛЬЗЯ! ";
        } else {
            return number1 + " : " + number2 + " = " + (number1 / number2);
        }
    }

    public String errorText(int number1, int number2) {
        if (number1 = null || number2 = null) {
            return " Ошибка!!! Вы забыли добавить еще одно число ";

        }
        return null;
    }
}

