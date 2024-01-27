package org.example.Week1;

import static input.InputUtils.stringInput;

public class DepartmentCode {
    public static void main(String[] args) {
        String departmentCode = stringInput("Enter a Department Code" );
        if (departmentCode.length()==4){
            System.out.println("The code is Valid");
            departmentCode= departmentCode.toUpperCase();
            System.out.println("The code is " +departmentCode);
        }else{
            System.out.println("The code is not valid");
        }
    }
}
