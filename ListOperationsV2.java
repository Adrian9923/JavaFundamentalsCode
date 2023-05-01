package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperationsV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String strInput="";
        while(!(strInput=scanner.nextLine().toLowerCase()).equals("end")){
            String[] strInputArr=strInput.split(" ");
            switch (strInputArr[0]){
                case "add":
                    int number=Integer.parseInt(strInputArr[1]);
                    intList.add(number);
                    break;
                case "insert":
                    int indexToInsert=Integer.parseInt(strInputArr[2]);
                    if (indexToInsert>=0 && indexToInsert<intList.size()){
                        int numberToInsert=Integer.parseInt(strInputArr[1]);
                        intList.add(indexToInsert,numberToInsert);
                    }else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "remove":
                    int indexToRemove = Integer.parseInt(strInputArr[1]);
                    if (indexToRemove>=0 && indexToRemove<intList.size()){
                        intList.remove(indexToRemove);
                    }
                    else{
                        System.out.println("Invalid index");
                    }
                    break;
                case "shift":
                    String direction=strInputArr[1];
                    int count=Integer.parseInt(strInputArr[2]);
                    if (direction.equals("left")){
                        ShiftLeft(intList,count);
                    }else{
                        ShiftRight(intList,count);
                    }
                    break;
            }
        }

        for (int i=0;i<intList.size();i++){
            System.out.printf("%d ",intList.get(i));
        }

    }

    static void ShiftLeft(List<Integer> l,int count){
        for (int shiftStep=0;shiftStep<count;shiftStep++){
            int temp=l.get(0);
            for (int i=0;i<l.size()-1;i++){
                l.set(i,l.get(i+1));
            }
            l.set(l.size()-1,temp);
        }
    }

    static void  ShiftRight(List<Integer> l,int count){

        for (int shiftStep=0;shiftStep<count;shiftStep++){
            int temp=l.get(l.size()-1);
            for (int i=l.size()-1;i>0;i--){
                l.set(i,l.get(i-1));
            }
            l.set(0,temp);
        }
    }
}
