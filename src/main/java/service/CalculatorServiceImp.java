package service;

import model.Calculator;

public class CalculatorServiceImp implements CalculatorService {

    Calculator a = new Calculator();
    @Override
    public Integer quotient(Calculator a) {
        if(a.getSecond() == 0 ){
            throw new NullPointerException();
        }
        return a.getFirst()/a.getSecond();
    }

    @Override
    public Integer product(Calculator a) {
        return a.getFirst()*a.getSecond();
    }

    @Override
    public Integer sum(Calculator a) {
        return a.getFirst()+a.getSecond();
    }

    @Override
    public Integer difference(Calculator a) {
        return a.getFirst()-a.getSecond();
    }

    @Override
    public void update(Calculator b){
        a.setFirst(b.getFirst());
        a.setSecond(b.getSecond());
    }
}