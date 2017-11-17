
package serg;

import java.util.Scanner;

public class DanceSequence {
    
    public int[] sequence(){
        System.out.println("Enter sequence of numbers(use space between numbers)");
        String line = getWrittenString();
        String num[] = line.split(" ");
        
        if(num[0].equals("") || num.length==1 || num.length>50){
            System.out.println("Incorrect size/format of sequence");
            System.out.println("Steps = 0");
            return null;
        }
        
        int numbers[] = new int[num.length];
        for(int i=0; i<num.length; i++){
            numbers[i] = Integer.valueOf(num[i]);
        }
        return numbers;
    }
    
    private String getWrittenString(){
        String word = null;
        Scanner in = new Scanner(System.in);    
        word = in.nextLine();
        return word;
    }
}
