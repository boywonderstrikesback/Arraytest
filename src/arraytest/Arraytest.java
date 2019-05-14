/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraytest;
import java.util.Arrays;
/**
 *
 * @author mikeross
 */
public class Arraytest {

    public static void main(String[] args) {
        int[] myArray = new int[] { 3, 4, 6, 8, 2, 1, 9};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
