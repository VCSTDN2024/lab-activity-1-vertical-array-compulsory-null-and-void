/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraygrpactivity;
import javax.swing.JOptionPane;
import java.util.Arrays;
/**
 *
 * @author lab_services_student
 */
public class ArrayGrpActivity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // Prompt the user
        int size = Integer.parseInt(JOptionPane.showInputDialog("What's the array size?"));
        
        // Declare an array to store size & integers.
        int[] number = new int[size];
        
        // Variable to store the sum/total.
        int sum = 0;
        
        // Prompt the user for the values.
        for (int i = 0; i < size; i++) {
            
            number[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter value " + (i + 1) + ":"));
            
            // calculate the sum
            sum += number[i]; 
        }
        
        // Display the array elements in vertical order
        StringBuilder verticalDisplay = new StringBuilder("Array Elements (Vertical Order):\n");
        
        for (int num : number) {
            
            verticalDisplay.append(num).append("\n");
        }
        JOptionPane.showMessageDialog(null, verticalDisplay.toString());
        
        // Sort the array in ascending order
        Arrays.sort(number);
        
        // Display the array elements in ascending order
        JOptionPane.showMessageDialog(null, "Elements in ascending order: " + Arrays.toString(number));
        
        // Calculate the average
        double average = (double) sum / size;
        
        // Find minimum and maximum
        int min = number[0]; 
        int max = number[number.length - 1];  
        
        // Display the sum, average, minimum, and maximum
        JOptionPane.showMessageDialog(null, "The sum: " + sum + "\nThe average: " + average + 
            "\nThe minimum value: " + min + "\nThe maximum value: " + max);
        
        // Display all elements greater than the average
        StringBuilder greaterThanAvg = new StringBuilder("Elements greater than the average"
                + " (" + average + "):\n");

        for (int num : number) {
           if (num > average) {
              greaterThanAvg.append(num).append("\n");
        }
    }
        // If no elements were added, append "None"
        if (greaterThanAvg.toString().equals("Elements greater than the average "
                + "(" + average + "):\n")) {
            greaterThanAvg.append("None");
    }   
        
        JOptionPane.showMessageDialog(null, greaterThanAvg.toString());
        }
    }   
