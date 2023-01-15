package service;

import model.Calculator;

public interface CalculatorService {
    //https://localhost:8080/results

    Integer quotient(Calculator a);
    Integer product(Calculator a);
    Integer sum(Calculator a);
    Integer difference(Calculator a);

    void update(Calculator a);
}
