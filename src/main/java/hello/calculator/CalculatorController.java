package hello.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import util.Calculator;

@RestController
public class CalculatorController {
    @GetMapping("/sum")
    public Integer sum(int a, int b) {
        return Calculator.Companion.sum(a, b);
    }
}
