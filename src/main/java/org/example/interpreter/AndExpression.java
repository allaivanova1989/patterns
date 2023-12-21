package org.example.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AndExpression implements Expression {
    private Expression expression1;
    private Expression expression2;

    @Override
    public boolean interpret(String context) {
        return expression1.interpret(context) && expression2.interpret(context);
    }
}
