package Homework.HW7.calculator;

import Homework.HW7.complex.Complex;;

public interface Calculable {
    Calculable sum(Complex arg);
    Calculable multi(Complex arg);
    Calculable div(Complex arg);
    Calculable minus(Complex arg);
    Complex getResult();
}