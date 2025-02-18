
package Prelim;

public class Lab_Act1_Arithmetics {

    public static void main(String[] org) {

        int numb1 = 10;
        int numb2 = 6;
        int numb3 = 4;
        int numb4 = 3;

        int firstnum1 = numb1 * numb3 + numb2;
        int saguing1 = numb1 - numb3;
        int firstnum2 = saguing1 % numb2;
        int saguing2 = numb1 + numb3 + numb2;
        int firstnum3 = saguing2 / numb4;
        int saguing3 = numb3 * numb3;
        int firstnum4 = numb1 * numb2 - saguing3;

        System.out.println("10 * 4 + 6 =" + firstnum1);
        System.out.println("(10-4) % 6 = " + firstnum2);
        System.out.println("(10 + 4 + 6)/3 = " + firstnum3);
        System.out.println("10 * 6 -(4 * 4 ) = " + firstnum4);

    }
}
