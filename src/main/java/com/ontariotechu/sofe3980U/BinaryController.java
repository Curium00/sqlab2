package com.ontariotechu.sofe3980U;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BinaryController {

    @GetMapping("/")
    public String getCalculator(@RequestParam(name = "operand1", required = false) String operand1, Model model) {
        model.addAttribute("operand1", operand1);
        model.addAttribute("operand1Focused", operand1 != null);
        return "calculator";
    }

    @PostMapping("/")
    public String getResult(@RequestParam String operand1, 
                            @RequestParam String operator, 
                            @RequestParam String operand2, 
                            Model model) {
        Binary result;
        try {
            Binary a = new Binary(operand1);
            Binary b = new Binary(operand2);
            
            switch (operator) {
                case "+":
                    result = Binary.add(a, b);
                    break;
                case "*":
                    result = Binary.multiply(a, b);
                    break;
                case "&":
                    result = Binary.and(a, b);
                    break;
                case "|":
                    result = Binary.or(a, b);
                    break;
                default:
                    return "error";  // If invalid operator
            }

            model.addAttribute("operand1", operand1);
            model.addAttribute("operator", operator);
            model.addAttribute("operand2", operand2);
            model.addAttribute("result", result.getValue());
            return "result";
            
        } catch (Exception e) {
            return "error";
        }
    }
}
