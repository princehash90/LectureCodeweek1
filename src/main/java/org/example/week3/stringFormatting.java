package org.example.week3;

public class stringFormatting {
    public static void main(String[] args) {
        String college= "MCTC";
        String className = "Java Programming";
        int classCode= 2545;
        int credit = 6;
        double averageGrade= 84.545345;
        boolean isOnline = true;
        System.out.printf("This class is %d, %s. it is taught at %s. it is %d credits , the average grade is %%%.2f " +
                "and it is online %s ", classCode,className,college,credit,averageGrade,isOnline);
        //%d = for integers, %s for string, %f for double digits, %s can be used for anything other than int and double
    }
}
