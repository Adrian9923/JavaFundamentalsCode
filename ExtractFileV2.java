package TextProcessing;

import java.util.Scanner;

public class ExtractFileV2 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        String line = scr.nextLine();
        String[] arr = line.split("\\\\");
        String file = arr[arr.length - 1];

        String fileName = file.substring(0, file.lastIndexOf('.'));
        String fileExtension  = file.substring(file.lastIndexOf('.') + 1);

        System.out.println(String.format("File name: %s\nFile extension: %s", fileName, fileExtension));

    }
}
