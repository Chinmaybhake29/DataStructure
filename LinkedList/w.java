package LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryToDecimalUsingQueue {

    // Method to convert binary string to decimal using a queue
    public static int binaryToDecimal(String binary) {
        Queue<Character> queue = new LinkedList<>();
        
        // Enqueue each character (bit) of the binary string
        for (char bit : binary.toCharArray()) {
            queue.add(bit);
        }

        int decimalValue = 0;
        int base = 1; // Represents the power of 2
        
        // Process the queue from the back to the front
        while (!queue.isEmpty()) {
            char bit = queue.poll(); // Dequeue the bit
            // Only process if the bit is '1'
            if (bit == '1') {
                decimalValue += base; // Add to decimal value
            }
            base *= 2; // Increase base for next bit
        }
        
        return decimalValue;
    }

    public static void main(String[] args) {
        String binaryData = "1101"; // Example binary number
        int decimalValue = binaryToDecimal(binaryData);
        System.out.println("The decimal value of binary " + binaryData + " is: " + decimalValue);
    }
}
