import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro numero");
        int num1 = scanner.nextInt();

        System.out.println("Insira o segundo numero");
        int num2 = scanner.nextInt();

        try {
            count(num1, num2);
        }catch (InvalidParametersException exception){
            System.out.println(exception.getMessage());
        }
    }

    public static void count(int num1, int num2) throws InvalidParametersException{
        if(num1 > num2){
            throw new InvalidParametersException("O segundo parametro deve ser maior que o primeiro");
        }

        int numsToCount = num2 - num1;

        for(int i = 1; i <= numsToCount; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }


    public static class InvalidParametersException extends Exception{
        public InvalidParametersException(String message){
            super(message);
        }
    }
}
