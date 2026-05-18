public class MathApp{


public static int add(int num1, int num2, String plus){
int addition = 0;
if(plus.equals("+")){

addition = (num1 + num2);
}

return addition;
}

public static int multiply(int num1, int num2, String product){
int multiply = 0;
if(product.equals("*")){

multiply = (num1 * num2);
}

return multiply;
}

}
