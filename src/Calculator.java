import java.util.Scanner;

public class Calculator {
  public static int calculate (int a, int b, char c){
    int result = 0;
    switch (c){
      case '+': result = a + b; break;
      case '-': result = a - b; break;
      case '*': result = a * b; break;
      case '/': result = a / b; break;
      default:throw  new IllegalArgumentException("Ошибка в знаке операции");
      }
return result;
    }
  }





