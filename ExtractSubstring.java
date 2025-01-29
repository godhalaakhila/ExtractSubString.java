 public class ExtractSubstring {
    public static void main(String[] args) {
        // Define the string directly
        String input = "Hello, World!";
        
        // Define the starting and ending index for the substring
        int startIndex = 7;  // Starting index (inclusive)
        int endIndex = 12;   // Ending index (exclusive)
        
        // Extract the substring
        String substring = input.substring(startIndex, endIndex);
        
        // Display the original string and the extracted substring
        System.out.println("Original string: " + input);
        System.out.println("Extracted substring: " + substring);
    }
}
 
    

