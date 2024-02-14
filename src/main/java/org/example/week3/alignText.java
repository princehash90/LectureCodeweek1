package org.example.week3;

public class alignText {
    public static void main(String[] args) {
        int [] classCode = {2545,2505,2560};
        String[] className = {"Java","C#","Web"};
        double []averageClassSizes= {22.34233, 17.42323,14.234234};

        String templateString = "%s%11s%10s\n"; // a better way to do it by assigning to a variable
        //helps so you do not have to code it all over again and again
        System.out.printf(templateString,"Code","Name", "Average");

        String templateTableString= "%d%10s%10.2f \n";

        for (int x=0;x<classCode.length;x++){
            int code =classCode[x];
            String name = className[x];
            double averageClassSize = averageClassSizes[x];
            //System.out.println("This class code " +classCode[x] + " is for class name "+className[x]);
            System.out.printf(templateTableString,code,name,averageClassSize);// putting a number in btn the specifier (%) and the d
            // makes the item to move 10 spaces
        }

    }
}
