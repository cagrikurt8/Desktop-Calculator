package calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    
    private JLabel equationLabel;
    private JLabel resultLabel;
    private JButton solve;
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton ten;
    private JButton add;
    private JButton subtract;
    private JButton divide;
    private JButton multiply;
    private JButton del;
    private JButton clear;
    private JButton dot;
    private JButton parentheses;
    private JButton squareRoot;
    private JButton powerTwo;
    private JButton powerY;
    private JButton plusMinus;
    private JButton ce;

    public Calculator() {
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");


        equationLabel = new JLabel();
        equationLabel.setName("EquationLabel");
        equationLabel.setBounds(230, 80, 300,25);
        equationLabel.setForeground(new Color(50,205,50));
        equationLabel.setVisible(true);

        resultLabel = new JLabel();
        resultLabel.setName("ResultLabel");
        resultLabel.setBounds(230, 30,300,30);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 40));
        resultLabel.setText("0");
        resultLabel.setVisible(true);

        solve = new JButton();
        solve.setName("Equals");
        solve.setBounds(220, 320, 60, 30);
        solve.setText("=");
        solve.setVisible(true);

        zero = new JButton();
        zero.setName("Zero");
        zero.setBounds(80,320,60,30);
        zero.setText("0");
        zero.setVisible(true);

        one = new JButton();
        one.setName("One");
        one.setBounds(10,280,60,30);
        one.setText("1");
        one.setVisible(true);

        two = new JButton();
        two.setName("Two");
        two.setBounds(80,280,60,30);
        two.setText("2");
        two.setVisible(true);

        three = new JButton();
        three.setName("Three");
        three.setBounds(150,280,60,30);
        three.setText("3");
        three.setVisible(true);

        four = new JButton();
        four.setName("Four");
        four.setBounds(10,240,60,30);
        four.setText("4");
        four.setVisible(true);

        five = new JButton();
        five.setName("Five");
        five.setBounds(80,240,60,30);
        five.setText("5");
        five.setVisible(true);

        six = new JButton();
        six.setName("Six");
        six.setBounds(150,240,60,30);
        six.setText("6");
        six.setVisible(true);

        seven = new JButton();
        seven.setName("Seven");
        seven.setBounds(10,200,60,30);
        seven.setText("7");
        seven.setVisible(true);

        eight = new JButton();
        eight.setName("Eight");
        eight.setBounds(80,200,60,30);
        eight.setText("8");
        eight.setVisible(true);

        nine = new JButton();
        nine.setName("Nine");
        nine.setBounds(150,200,60,30);
        nine.setText("9");
        nine.setVisible(true);

        divide = new JButton();
        divide.setName("Divide");
        divide.setBounds(220, 160, 60, 30);
        divide.setText("\u00F7");
        divide.setVisible(true);

        multiply = new JButton();
        multiply.setName("Multiply");
        multiply.setBounds(220,200,60,30);
        multiply.setText("\u00D7");
        multiply.setVisible(true);

        add = new JButton();
        add.setName("Add");
        add.setBounds(220,240,60,30);
        add.setText("\u002B");
        add.setVisible(true);

        subtract = new JButton();
        subtract.setName("Subtract");
        subtract.setBounds(220,280,60,30);
        subtract.setText("\u2212");
        subtract.setVisible(true);

        clear = new JButton();
        clear.setName("Clear");
        clear.setBounds(150,120,60,30);
        clear.setText("C");
        clear.setVisible(true);

        del = new JButton();
        del.setName("Delete");
        del.setBounds(220,120,60,30);
        del.setText("Del");
        del.setVisible(true);

        dot = new JButton();
        dot.setName("Dot");
        dot.setBounds(150,320,60,30);
        dot.setText(".");
        dot.setVisible(true);

        parentheses = new JButton();
        parentheses.setName("Parentheses");
        parentheses.setBounds(10, 120, 60, 30);
        parentheses.setText("( )");
        parentheses.setFont(new Font("Arial", Font.PLAIN, 18));
        parentheses.setVisible(true);

        powerTwo = new JButton();
        powerTwo.setName("PowerTwo");
        powerTwo.setBounds(10, 160, 60, 30);
        powerTwo.setText("X²");
        powerTwo.setVisible(true);

        powerY = new JButton();
        powerY.setName("PowerY");
        powerY.setBounds(80, 160, 60, 30);
        powerY.setText("Xʸ");
        powerY.setVisible(true);

        squareRoot = new JButton();
        squareRoot.setName("SquareRoot");
        squareRoot.setBounds(150, 160, 60, 30);
        squareRoot.setText("\u221A");
        squareRoot.setVisible(true);

        plusMinus = new JButton();
        plusMinus.setName("PlusMinus");
        plusMinus.setBounds(10, 320, 60, 30);
        plusMinus.setText("\u00B1");
        plusMinus.setVisible(true);

        ce = new JButton();
        ce.setName("CE");
        ce.setBounds(80, 120, 60, 30);
        ce.setText("CE");
        ce.setVisible(true);

        add(equationLabel);
        add(resultLabel);
        add(solve);
        add(zero);
        add(one);
        add(two);
        add(three);
        add(four);
        add(five);
        add(six);
        add(seven);
        add(eight);
        add(nine);
        add(divide);
        add(multiply);
        add(add);
        add(subtract);
        add(clear);
        add(del);
        add(dot);
        add(parentheses);
        add(powerTwo);
        add(powerY);
        add(squareRoot);
        add(plusMinus);
        add(ce);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        setSize(310, 400);
        setTitle("Calculator");
        setLayout(null);
        setVisible(true);

        solve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operators = "×÷-+";
                String equation = equationLabel.getText();
                String finalChar = String.valueOf(equation.charAt(equation.length() - 1));

                if (equation.contains("-\u221A")) {
                    equationLabel.setForeground(Color.RED.darker());
                } else {
                    if (equation.contains("^")) {
                        int idx = equation.indexOf("^");
                        String pow1 = "";
                        String pow2 = "";

                        for (int i = idx - 1; i >= 0; i--) {
                            if (!operators.contains(String.valueOf(equation.charAt(i)))) {
                                pow1 = equation.charAt(i) + pow1;
                            } else {
                                break;
                            }
                        }

                        idx += 2;
                        while (!String.valueOf(equation.charAt(idx)).equals(")")) {
                            pow2 = pow2 + equation.charAt(idx);
                            idx += 1;
                        }

                        equation = equation.replace(pow1 + "^(" + pow2 + ")", "Math.pow(" + pow1 + ", " + pow2 + ")");
                    }

                    if (equation.contains("\u221A")) {
                        equation = equation.replace("\u221A", "Math.sqrt");
                    }

                    if (operators.contains(finalChar)) {
                        if (equation.length() == 3 && equation.contains(".")) {
                            if (equation.charAt(0) == '.') {
                                equationLabel.setText("0".concat(equation));
                                equationLabel.setForeground(Color.RED.darker());
                            } else if (equation.charAt(1) == '.') {
                                equationLabel.setText(equation.substring(0, 2) + "0" + equation.substring(2, equation.length()));
                                equationLabel.setForeground(Color.RED.darker());
                            }
                        }
                        equationLabel.setForeground(Color.RED.darker());
                    } else if (equation.contains("\u00F7" + "0")) {
                        equationLabel.setForeground(Color.RED.darker());
                    } else {
                        equation = equation.replace("\u00D7", "*");
                        equation = equation.replace("\u00F7", "/");
                        try {
                            Object result = engine.eval(equation);
                            if (result.toString().contains(".0")) {
                                result = result.toString().replace(".0", "");
                            }
                            resultLabel.setText(result.toString());
                        } catch (ScriptException scriptException) {
                            equationLabel.setForeground(Color.RED.darker());
                        }
                    }
                }
            }
        });

        zero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() == 1 && equationLabel.getText().charAt(0) == '.') {
                    equationLabel.setText("0" + equationLabel.getText() + "0");
                } else {
                    equationLabel.setText(equationLabel.getText() + "0");
                }
            }
        });

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() == 1 && equationLabel.getText().charAt(0) == '.') {
                    equationLabel.setText("0" + equationLabel.getText() + "1");
                } else {
                    equationLabel.setText(equationLabel.getText() + "1");
                }
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() == 1 && equationLabel.getText().charAt(0) == '.') {
                    equationLabel.setText("0" + equationLabel.getText() + "2");
                } else {
                    equationLabel.setText(equationLabel.getText() + "2");
                }
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() == 1 && equationLabel.getText().charAt(0) == '.') {
                    equationLabel.setText("0" + equationLabel.getText() + "3");
                } else {
                    equationLabel.setText(equationLabel.getText() + "3");
                }
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() == 1 && equationLabel.getText().charAt(0) == '.') {
                    equationLabel.setText("0" + equationLabel.getText() + "4");
                } else {
                    equationLabel.setText(equationLabel.getText() + "4");
                }
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() == 1 && equationLabel.getText().charAt(0) == '.') {
                    equationLabel.setText("0" + equationLabel.getText() + "5");
                } else {
                    equationLabel.setText(equationLabel.getText() + "5");
                }
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() == 1 && equationLabel.getText().charAt(0) == '.') {
                    equationLabel.setText("0" + equationLabel.getText() + "6");
                } else {
                    equationLabel.setText(equationLabel.getText() + "6");
                }
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() == 1 && equationLabel.getText().charAt(0) == '.') {
                    equationLabel.setText("0" + equationLabel.getText() + "7");
                } else {
                    equationLabel.setText(equationLabel.getText() + "7");
                }
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() == 1 && equationLabel.getText().charAt(0) == '.') {
                    equationLabel.setText("0" + equationLabel.getText() + "8");
                } else {
                    equationLabel.setText(equationLabel.getText() + "8");
                }
            }
        });

        nine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().length() == 1 && equationLabel.getText().charAt(0) == '.') {
                    equationLabel.setText("0" + equationLabel.getText() + "9");
                } else {
                    equationLabel.setText(equationLabel.getText() + "9");
                }
            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().charAt(equationLabel.getText().length() - 1) == '.') {
                    equationLabel.setText(equationLabel.getText() + "0");
                }

                if (equationLabel.getText().length() > 0) {
                    String operators = "×÷-+";
                    String finalChar = String.valueOf(equationLabel.getText().charAt(equationLabel.getText().length() - 1));

                    if (operators.contains(finalChar)) {
                        String equation = equationLabel.getText().substring(0, equationLabel.getText().length() - 1);
                        equationLabel.setText(equation + "+");
                    } else {
                        equationLabel.setText(equationLabel.getText() + "+");
                    }
                }
            }
        });

        subtract.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().charAt(equationLabel.getText().length() - 1) == '.') {
                    equationLabel.setText(equationLabel.getText() + "0");
                }

                if (equationLabel.getText().length() > 0) {
                    String operators = "×÷-+";
                    String finalChar = String.valueOf(equationLabel.getText().charAt(equationLabel.getText().length() - 1));

                    if (operators.contains(finalChar)) {
                        String equation = equationLabel.getText().substring(0, equationLabel.getText().length() - 1);
                        equationLabel.setText(equation + "-");
                    } else {
                        equationLabel.setText(equationLabel.getText() + "-");
                    }
                }
            }
        });

        divide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().charAt(equationLabel.getText().length() - 1) == '.') {
                    equationLabel.setText(equationLabel.getText() + "0");
                }

                if (equationLabel.getText().length() > 0) {
                    String operators = "×÷-+";
                    String finalChar = String.valueOf(equationLabel.getText().charAt(equationLabel.getText().length() - 1));

                    if (operators.contains(finalChar)) {
                        String equation = equationLabel.getText().substring(0, equationLabel.getText().length() - 1);
                        equationLabel.setText(equation + "\u00F7");
                    } else {
                        equationLabel.setText(equationLabel.getText() + "\u00F7");
                    }
                }
            }
        });

        multiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (equationLabel.getText().charAt(equationLabel.getText().length() - 1) == '.') {
                    equationLabel.setText(equationLabel.getText() + "0");
                }

                if (equationLabel.getText().length() > 0) {
                    String operators = "×÷-+";
                    String finalChar = String.valueOf(equationLabel.getText().charAt(equationLabel.getText().length() - 1));

                    if (operators.contains(finalChar)) {
                        String equation = equationLabel.getText().substring(0, equationLabel.getText().length() - 1);
                        equationLabel.setText(equation + "\u00D7");
                    } else {
                        equationLabel.setText(equationLabel.getText() + "\u00D7");
                    }
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { equationLabel.setText(""); equationLabel.setForeground(new Color(50,205,50));}
        });

        del.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = equationLabel.getText().length();
                equationLabel.setText(equationLabel.getText().substring(0, length - 1));
            }
        });

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { equationLabel.setText(equationLabel.getText() + "."); }
        });

        parentheses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String operators = "×÷-+\u221A";
                String equation = equationLabel.getText();
                if (equation.length() == 0) {
                    equationLabel.setText("(");
                } else {
                    String finalChar = String.valueOf(equation.charAt(equation.length() - 1));
                    boolean condition = (equation.chars().filter(ch -> ch == '(').count() == equation.chars().filter(ch -> ch == ')').count()) || (equation.charAt(equation.length() - 1) == '(') || (operators.contains(finalChar));

                    if (condition) {
                        equationLabel.setText(equation + "(");
                    } else {
                        equationLabel.setText(equation + ")");
                    }
                }
            }
        });

        squareRoot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { equationLabel.setText(equationLabel.getText() + "\u221A" + "("); }
        });

        powerTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { equationLabel.setText(equationLabel.getText() + "^(2)"); }
        });

        powerY.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { equationLabel.setText(equationLabel.getText() + "^("); }
        });

        plusMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String equation = equationLabel.getText();

                if (equationLabel.getText().length() == 0) {
                    equationLabel.setText("(-");
                } else if (equation.length() >= 2 && equation.contains("(-")) {
                    equation = equation.replace("(-", "");
                    equationLabel.setText(equation);
                } else {
                    equationLabel.setText("(-" + equationLabel.getText());
                }
            }
        });
    }
}
