package com.ontariotechu.sofe3980U;

import org.springframework.web.bind.annotation.*;

@RestController
public class BinaryAPIController {

    @GetMapping("/add")
    public String add(@RequestParam String operand1, @RequestParam String operand2) {
        Binary a = new Binary(operand1);
        Binary b = new Binary(operand2);
        return Binary.add(a, b).getValue();
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam String operand1, @RequestParam String operand2) {
        Binary a = new Binary(operand1);
        Binary b = new Binary(operand2);
        return Binary.multiply(a, b).getValue();
    }

    @GetMapping("/and")
    public String and(@RequestParam String operand1, @RequestParam String operand2) {
        Binary a = new Binary(operand1);
        Binary b = new Binary(operand2);
        return Binary.and(a, b).getValue();
    }

    @GetMapping("/or")
    public String or(@RequestParam String operand1, @RequestParam String operand2) {
        Binary a = new Binary(operand1);
        Binary b = new Binary(operand2);
        return Binary.or(a, b).getValue();
    }
}
