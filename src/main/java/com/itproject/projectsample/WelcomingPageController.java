package com.itproject.projectsample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomingPageController {

    private final CalculatorService calculatorService;


    public WelcomingPageController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcomingText() {
        return calculatorService.welcomingText();
    }

    @GetMapping("/calculator")
    public String welcoming() {

        return calculatorService.welcoming();
    }

    @GetMapping("/calculator/plus")
    public String sum(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.sum(number1, number2);
    }

    @GetMapping("/calculator/minus")
    public String deduction(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.deduction(number1, number2);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.multiply(number1, number2);
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculatorService.divide(number1, number2);


    }
}
