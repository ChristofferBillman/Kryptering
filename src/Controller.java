import java.io.*;

public class Controller {
    public static void binaryCopy(String inPath, String pathOut) {
        try {
            DataInputStream input = new DataInputStream (new BufferedInputStream(new FileInputStream(inPath)));
            input.readByte();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            DataOutputStream output = new DataOutputStream (new BufferedOutputStream(new FileOutputStream(inPath)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void textCopy(String filename,String path) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter utFil = new PrintWriter(bw);
        FileReader fr = null;
        try {
            fr = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader inFil = new BufferedReader(fr);
    }

}