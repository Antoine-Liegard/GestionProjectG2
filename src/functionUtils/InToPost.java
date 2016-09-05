/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionUtils;

import java.util.*;
import java.io.IOException;
import java.io.*;
import java.util.Arrays;

/**
 *
 * @author Kevin
 */
public class InToPost {

    private Stack theStack;
    private String input;
    String output = "";

    public InToPost(String in) {
        input = in;
        int stackSize = input.length();
        theStack = new Stack(stackSize);
    }

    public String doTrans() {
        for (int j = 0; j < input.length(); j++) {
            char ch = input.charAt(j);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    theStack.push(ch);
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }
        while (!theStack.isEmpty()) {
            output = output + theStack.pop();
        }
        
        String array[] = output.split("");
        
        ArrayList<String> maListe = new ArrayList<String>();
        
        for (int j = 0;j<array.length;j++) {
            maListe.add(array[j]);
            System.out.println(array[j]);
        }
        
        ArrayList<String> maListe2 = new ArrayList<String>();
        
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            maListe2.add(j,maListe.get(0));
            maListe.remove(0);
            j++;
            if (maListe2.size() == 3) {
                j = 0;
                int resultat = 0;
                int operateurGauche = Integer.valueOf(maListe2.get(0));
                System.out.println(operateurGauche);
                maListe2.remove(0);
                int operateurDroite = Integer.valueOf(maListe2.get(0));
                System.out.println(operateurDroite);
                maListe2.remove(0);
                String operande = maListe2.get(0);
                System.out.println(operande);
                maListe2.remove(0);

                if (operande.equals("*")) {
                    resultat = operateurGauche * operateurDroite;
                } else if (operande.equals("+")) {
                    resultat = operateurGauche + operateurDroite;
                } else if (operande.equals("/")) {
                    resultat = operateurGauche / operateurDroite;
                } else if (operande.equals("-")) {
                    resultat = operateurGauche - operateurDroite;
                }
                
                maListe2.add(String.valueOf(resultat));
            }
        }

        return output;//maListe2.get(0);
    }

    public void gotOper(char opThis, int prec1) {
        while (!theStack.isEmpty()) {
            char opTop = theStack.pop();
            if (opTop == '(') {
                theStack.push(opTop);
                break;
            } else {
                int prec2;
                if (opTop == '+' || opTop == '-') {
                    prec2 = 1;
                } else {
                    prec2 = 2;
                }
                if (prec2 < prec1) {
                    theStack.push(opTop);
                    break;
                } else {
                    output = output + opTop;
                }
            }
        }
        theStack.push(opThis);
    }

    public void gotParen(char ch) {
        while (!theStack.isEmpty()) {
            char chx = theStack.pop();
            if (chx == '(') {
                break;
            } else {
                output = output + chx;
            }
        }
    }

    class Stack {

        private int maxSize;
        private char[] stackArray;
        private int top;

        public Stack(int max) {
            maxSize = max;
            stackArray = new char[maxSize];
            top = -1;
        }

        private Stack() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public void push(char j) {
            stackArray[++top] = j;
        }

        public char pop() {
            return stackArray[top--];
        }

        public char peek() {
            return stackArray[top];
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        private void push(String lol) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private int size() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
