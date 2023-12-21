package org.example.interpreter;

/**
 * Клиентский класс
 */
public class InterpreterRunner {
    public static void main(String[] args) {
        Expression isJava = getJavaExpression();
        Expression isJavaEEDeveloper = getJavaEEExpression();
        System.out.println("Does developer knows java core: " + isJava.interpret("java core"));
        System.out.println("Does developer knows javaEE: " + isJavaEEDeveloper.interpret("java spring"));
    }

    public static Expression getJavaExpression() {
        Expression java = new TerminalExpression("java");
        Expression javaCore = new TerminalExpression("java core");
        return new OrExpression(java, javaCore);
    }

    public static Expression getJavaEEExpression() {
        Expression java = new TerminalExpression("java");
        Expression spring = new TerminalExpression("spring");
        return new AndExpression(java, spring);
    }
}
