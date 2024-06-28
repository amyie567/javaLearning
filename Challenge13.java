public class Challenge13 {

        public static String getSmallestAndLargest(String s, int k) {
            // Initialize smallest and largest substrings to the first substring of length k
            String smallest = s.substring(0, k);
            String largest = s.substring(0, k);

            // Iterate through all possible substrings of length k
            for (int i = 1; i <= s.length() - k; i++) {
                // Extract the substring starting at index i of length k
                String substring = s.substring(i, i + k);

                // Update smallest and largest if necessary
                if (substring.compareTo(smallest) < 0) {
                    smallest = substring;
                }
                if (substring.compareTo(largest) > 0) {
                    largest = substring;
                }
            }

            // Return the result in the specified format
            return smallest + "\n" + largest;
        }

        public static void main(String[] args) {
            String s = "welcometojava";
            int k = 3;

            // Call the function and print the result
            String result = getSmallestAndLargest(s, k);
            System.out.println(result);
        }
    }


