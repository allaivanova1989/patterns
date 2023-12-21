package org.example.interpreter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TerminalExpression implements Expression {
    private String data;

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
