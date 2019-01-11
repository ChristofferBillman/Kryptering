import java.util.Arrays;

public class CMDInput {
    public static void main(String[] args) {
        if (args.length == 0) System.out.println("Programmet vet inte vad det ska göra! Avbryter...");
        if (args.length == 1) System.out.println("Så du säger" + args[0]);
        if (args.length == 2) System.out.println(args[0] + args[1]);
        if (args.length == 3) System.out.println(Arrays.toString(reverseArray(args)));
        if (args.length == 4) {
            System.out.println("Jag orkar inte, jag stänger ner");
            System.exit(0);
        }

    }
    public static String[] reverseArray(String[] array) {

        String[] reversedArray = new String[array.length];

        for(int i = 0; array.length > i; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }
}