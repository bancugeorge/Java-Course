import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) throws IOException {
        String myFolder = "C:\\Users\\george\\Desktop\\curs java\\homework\\src\\main\\java\\week12\\files";

        Path myPath = Paths.get(myFolder);



                    /*        if(Files.exists(myPath)){
                            System.out.println("exista");
    3                       }
                        else System.out.println("nu exista");
                    }*/

                  //  File file = new File(myFolder);
                 /*   if (file.canRead()) {
                        System.out.println("can read");
    4                         }
                    if (file.canWrite()) {
                        System.out.println("can write");
                    }*/
                    /*  if(file.isDirectory()){
                        System.out.println("file is directory");
    5                          }else
                        System.out.println("file is file");
                        */
                        //String myFile1 = "C:\\Users\\george\\Desktop\\curs java\\homework\\src\\main\\java\\week12\\files\\textlol.txt";
                        //String myFile2 = "C:\\Users\\george\\Desktop\\curs java\\homework\\src\\main\\java\\week12\\files\\textlol2.txt";
                                        //boolean rezultat=compareFiles(myFile1,myFile2);
                                        /*private static boolean compareFiles(String path1, String path2){
                                            File fisier1=new File(path1);
                                            File fisier2=new File(path2);
    6                                String numerFisier1=fisier1.getAbsolutePath();
                                            String numeFisier2=fisier2.getAbsolutePath();
                                            return numerFisier1.compareTo(numeFisier2)<0;
                                        }
                                        if(rezultat){
                            System.out.println("mai mare");
                        }else System.out.println("mai mic sau egal");

                     */

                     /*   try {
                            System.out.println(Files.getLastModifiedTime(myPath));
                        } catch (IOException e) {
    7                          e.printStackTrace();
                        }
                     */

                            /*Scanner console = new Scanner(System.in);
    8                       int n = console.nextInt();
                            console.close();*/



               /*          File myFile3 =new File("C:\\Users\\george\\Desktop\\curs java\\homework\\src\\main\\java\\week12\\files\\fisier.mkv");
                                System.out.println("bytes " +myFile3.length());
      9                    System.out.println("kb " +(myFile3.length())/1024);
                            System.out.println("mb " +(myFile3.length())/1048576);
                */

              /* File myByteFile=new File("C:\\\\Users\\\\george\\\\Desktop\\\\curs java\\\\homework\\\\src\\\\main\\\\java\\\\week12\\\\files\\\\textlol.txt");
     10 but not done           byte[] fileContent=Files.readAllBytes(Paths.get(String.valueOf(myPath)));
                System.out.println(Arrays.toString(fileContent));*/




                        /*File file=new File( "C:\\Users\\george\\Desktop\\curs java\\homework\\src\\main\\java\\week12\\files\\textlol.txt");
                        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                            String line;
    11                       while ((line = br.readLine()) != null) {
                                System.out.println(line);
                            }
                        }*/




    }
}