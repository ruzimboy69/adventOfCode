package year_2022;

import java.io.*;

public class sixth_day_2022 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\hp\\Downloads\\test.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String str = "";
        String str1="";
        int a =0;
        while(str!=null){
            str = reader.readLine();
            if(str!=null){
                for (int i = 0; i <str.length()-3 ; i++) {
                    String substring = str.substring(i, i + 14);
                    for (int j = 0; j <substring.length()-1 ; j++) {
                        for (int k = j+1; k <substring.length() ; k++) {
                            if(substring.charAt(j)!=substring.charAt(k)){
                                a++;

                            }
                        }
                    }
                    if(a==91){
                        a = i+14;break;
                    }
                    a=0;
                }
            }
        }
        System.out.println(a);
    }
}
