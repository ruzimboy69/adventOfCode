package year_2022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class fourth_day_2022 {
    public static void main(String[] args) throws IOException {
        File file =new File("C:\\Users\\User\\Desktop\\hangout.txt");
        BufferedReader bufferedReader =new BufferedReader(new FileReader(file));
        String str="";
        int k=0;
        String[] newArr = new String[4000];
        List intList = new ArrayList<>();
        while(str!=null){
            str = bufferedReader.readLine();
            if(str!=null){
                String[] strings = str.split("-");
                for (int i = 0; i < strings.length ; i++) {
                    newArr = strings[i].split(",");
                    for (int j = 0; j < newArr.length; j++) {
                        int a = Integer.parseInt(newArr[j]);
                        intList.add(a);
                    }
                }
            }

        }
        for (int i = 0; i <intList.size() ; i+=4) {
            int x = (int)intList.get(i);
            int y = (int)intList.get(i+1);
            int z = (int)intList.get(i+2);
            int m = (int)intList.get(i+3);

            if((x<=z && y>=z) || (z<=x && m>=x)){
                k++;
            }
        }
        System.out.println(k);

    }
}
