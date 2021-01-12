
public class Functions {

    public String message;

    public String operation(int firstNumber, int secondNumber, String operation){
     switch (operation){
        case "sum":
            return firstNumber+"+"+secondNumber+"="+sum(firstNumber,secondNumber);

            case "minus":
             return firstNumber+"-"+secondNumber+"="+minus(firstNumber,secondNumber);

             case "multiply":
            return firstNumber+"*"+secondNumber+"="+multiply(firstNumber,secondNumber);

            case "devide":
             return firstNumber+"/"+secondNumber+"="+devide(firstNumber,secondNumber);

             default:
                 return message = "Please enter anything";
    }


}
    private int sum(int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }
    private int minus(int firstNumber, int secondNumber){
        return firstNumber-secondNumber;
    }
    private int multiply(int firstNumber, int secondNumber){
        return firstNumber*secondNumber;
    }
    private int devide(int firstNumber, int secondNumber){
        return firstNumber/secondNumber;
    }
}
