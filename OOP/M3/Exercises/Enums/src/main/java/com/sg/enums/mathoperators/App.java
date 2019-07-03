/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.enums.mathoperators;

/**
 *
 * @author Qube
 */
public class App {

    public static void main(String[] args) {
        System.out.println(calculate(MathOperator.PLUS, 1, 2));
        System.out.println(calculate(MathOperator.MINUS, 11, 1));
        System.out.println(calculate(MathOperator.MULTIPLY, 1337, 1));
        System.out.println(calculate(MathOperator.DIVIDE, 2, 2));
    }

    public static int calculate(MathOperator operator, int operand1, int operand2) {
        switch (operator) {
            case PLUS:
                return operand1 + operand2;
            case MINUS:
                return operand1 - operand2;
            case MULTIPLY:
                return operand1 * operand2;
            case DIVIDE:
                return operand1 / operand2;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
