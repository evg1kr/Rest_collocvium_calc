package controller;

import model.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.CalculatorService;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping(value = "/results/quotient")
    public ResponseEntity<?> quotient(@RequestBody Calculator calculator) {
        calculatorService.quotient(calculator);
        final Integer b = calculatorService.quotient(calculator);
        return new ResponseEntity<>(b,HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/results/product")
    public ResponseEntity<?> product(@RequestBody Calculator calculator) {
        calculatorService.product(calculator);
        final Integer b = calculatorService.product(calculator);
        return new ResponseEntity<>(b,HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/results/sum")
    public ResponseEntity<?> sum(@RequestBody Calculator calculator) {
        calculatorService.sum(calculator);
        final Integer b = calculatorService.sum(calculator);
        return new ResponseEntity<>(b,HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/results/difference")
    public ResponseEntity<?> difference(@RequestBody Calculator calculator) {
        calculatorService.difference(calculator);
        final Integer b = calculatorService.difference(calculator);
        return new ResponseEntity<>(b,HttpStatus.ACCEPTED);
    }

    @PostMapping(value = "/results")
    public ResponseEntity<?> create(@RequestBody Calculator calculator) {
        calculatorService.update(calculator);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
