import java.util.Scanner;

public class Startup {

    public static void main(String... args){
        FLF aFLF;
        aFLF = FLF.init();
        aFLF.setaBuilder(null);

        Boolean repeat = true;
        Scanner scanner = new Scanner(System.in);

        while(repeat){
            String input = scanner.nextLine();

            switch (input){
                case "Ende":
                    repeat = false;
                    break;
                default:
                    break;
            }
        }

    }

}
