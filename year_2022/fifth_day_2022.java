package year_2022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class fifth_day_2022 {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\hp\\Downloads\\test.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        Stack<String> stack =new Stack<String>();
        List stackFirst = new ArrayList<>();
        stackFirst.add("B");
        stackFirst.add("Q");
        stackFirst.add("C");

        Stack<String> stack1 =new Stack<String>();
        List stackSecond = new ArrayList<>();
        stackSecond.add("R");
        stackSecond.add("Q");
        stackSecond.add("W");
        stackSecond.add("Z");
        Stack<String> stack2 =new Stack<String>();
        List stackThird = new ArrayList();
        stackThird.add("B");
        stackThird.add("M");
        stackThird.add("R");
        stackThird.add("L");
        stackThird.add("V");
        Stack<String> stack3 =new Stack<String>();
        List stackFourth = new ArrayList();
        stackFourth.add("C");
        stackFourth.add("Z");
        stackFourth.add("H");
        stackFourth.add("V");
        stackFourth.add("T");
        stackFourth.add("W");
        Stack<String> stack4 =new Stack<String>();
        List stackFifth = new ArrayList<>();
        stackFifth.add("D");
        stackFifth.add("Z");
        stackFifth.add("H");
        stackFifth.add("B");
        stackFifth.add("N");
        stackFifth.add("V");
        stackFifth.add("G");
        Stack<String> stack5 =new Stack<String>();
        List stacksixth = new ArrayList<>();
        stacksixth.add("H");
        stacksixth.add("N");
        stacksixth.add("P");
        stacksixth.add("C");
        stacksixth.add("J");
        stacksixth.add("F");
        stacksixth.add("V");
        stacksixth.add("Q");
        Stack<String> stack6 =new Stack<String>();
        List stackseventh = new ArrayList<>();
        stackseventh.add("D");
        stackseventh.add("G");
        stackseventh.add("T");
        stackseventh.add("R");
        stackseventh.add("W");
        stackseventh.add("Z");
        stackseventh.add("S");
        Stack<String> stack7 =new Stack<String>();
        List stackeighth = new ArrayList<>();
        stackeighth.add("C");
        stackeighth.add("G");
        stackeighth.add("M");
        stackeighth.add("N");
        stackeighth.add("B");
        stackeighth.add("W");
        stackeighth.add("Z");
        stackeighth.add("P");
        Stack<String> stack8 =new Stack<String>();
        List stacknineth = new ArrayList<>();
        stacknineth.add("N");
        stacknineth.add("J");
        stacknineth.add("B");
        stacknineth.add("M");
        stacknineth.add("W");
        stacknineth.add("Q");
        stacknineth.add("F");
        stacknineth.add("P");
        List stackList = new ArrayList<>();
        stackList.add(stackFirst);
        stackList.add(stackSecond);
        stackList.add(stackThird);
        stackList.add(stackFourth);
        stackList.add(stackFifth);
        stackList.add(stacksixth);
        stackList.add(stackseventh);
        stackList.add(stackeighth);
        stackList.add(stacknineth);
        String str = "";
        List list = new ArrayList<>();
        while(str!=null){
            str = reader.readLine();
            if(str!=null){
                if(str.startsWith("move")){
                    String  arr[] =  str.split(" ");
                    for (int i = 0; i < arr.length ; i++) {
                        if(!arr[i].equals("move") && !arr[i].equals("from") && !arr[i].equals("to")){
                            list.add(arr[i]);
                        }
                    }
                }
            }
        }

        for (int i = 0; i < list.size(); i+=3) {
            int a = Integer.parseInt((String) list.get(i));
            int b = Integer.parseInt((String) list.get(i+1));
            int c = Integer.parseInt((String) list.get(i+2));
            List listRemoved = (List) stackList.get(b - 1);
            List listAdded = (List) stackList.get(c-1);
            int check = listRemoved.size()-a;
            for (int j = 0; j < a ; j++) {
                listAdded.add(listRemoved.remove(check));
            }

        }
        for (int i = 0; i < stackList.size() ; i++) {
            System.out.println(stackList.get(i));
        }





    }
}
