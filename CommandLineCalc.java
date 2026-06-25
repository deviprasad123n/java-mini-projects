public class CommandLineCalc{
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("ERROR: Provide exactly three inputs.");
            return;//To avoid the crashes early
        }
        int num1=Integer.parseInt(args[0]); // here i am used Integer.parseInt for to convert String arguments to Integers.
        int num2=Integer.parseInt(args[1]); //same as above
        String operations = args[2];
        if (operations.equals("add")){
            System.out.println("Addition of two numbers"+ (num1 + num2));
        }
    }
}