package Homework.HW7.calculator;

import Homework.HW7.complex.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}