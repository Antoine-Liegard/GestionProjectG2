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
      String liste2[] = null;
      
      for (int i = 0;i< array.length;i++) {
          liste2[i] = array[0];
          array = Arrays.copyOfRange(array,1,array.length);
      }
      
      return output; 
   }
   public void gotOper(char opThis, int prec1) {
      while (!theStack.isEmpty()) {
         char opTop = theStack.pop();
         if (opTop == '(') {
            theStack.push(opTop);
            break;
         }
         else {
            int prec2;
            if (opTop == '+' || opTop == '-')
            prec2 = 1;
            else
            prec2 = 2;
            if (prec2 < prec1) { 
               theStack.push(opTop);
               break;
            }
		    else
            output = output + opTop;
         }
      }
      theStack.push(opThis);
   }
   public void gotParen(char ch){ 
      while (!theStack.isEmpty()) {
         char chx = theStack.pop();
         if (chx == '(') 
         break; 
         else
         output = output + chx; 
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
