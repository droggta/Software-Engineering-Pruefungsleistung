import java.util.Scanner;

public class Startup {

    public static void main(String... args){

        Camera aCamera = Camera.Camerainit();

        Boolean repeat = true;
        Scanner scanner = new Scanner(System.in);

        while(repeat){
            String input = scanner.nextLine();

            switch (input){
                case "Ende":
                    repeat = false;
                    break;
                case "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25":
                    char[][] ppicture = aCamera.getRawFacePicture(Integer.parseInt(input));
                    int[] pkoordinaten = aCamera.getFaceArea(ppicture);
                    Picture pFace = aCamera.extractFace(Integer.parseInt(input), ppicture, pkoordinaten);
                    if (pFace == null)
                    {
                        System.out.println("Das Bild enthält einen Fehler");
                    }
                default:
                    break;
            }
        }

    }

}
