public class JavaHW{

    // 1. Unique words
    public static void uniqueWords(String input) {
        String[] words = input.toLowerCase().split(" ");
        System.out.print("Unique words: ");
        for (int i = 0; i < words.length; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    unique = false;
                    break;
                }
            }
            if (unique) {
                System.out.print(words[i] + " ");
            }
        }
        System.out.println();
    }

    // 2. Longest word
    public static void longestWord(String input) {
        String[] words = input.split(" ");
        String longest = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println("Longest word: " + longest);
    }

    // 3. Count vowels and consonants
    public static void countVowelsAndConsonants(String input) {
        int vowels = 0, consonants = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= 'a' && c <= 'z') {
                if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u') vowels++;
                else consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    // 4. Palindrome check
    public static void isPalindrome(String input) {
        input = input.toLowerCase().replace(" ", "");
        int i = 0, j = input.length()-1;
        boolean ok = true;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                ok = false;
                break;
            }
            i++; j--;
        }
        System.out.println("Palindrome? " + ok);
    }

    // 5. Substring search
    public static void substringSearch(String text, String pattern) {
        int index = -1;
        for (int i = 0; i <= text.length()-pattern.length(); i++) {
            int j = 0;
            while (j < pattern.length() && text.charAt(i+j) == pattern.charAt(j)) {
                j++;
            }
            if (j == pattern.length()) {
                index = i;
                break;
            }
        }
        System.out.println("Substring index: " + index);
    }

    // 6. Bubble sort
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.print("Sorted: ");
        for (int n : arr) System.out.print(n+" ");
        System.out.println();
    }

    // 7. Sum numbers in string
    public static void sumNumbers(String s) {
        int sum = 0, num = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                num = num*10 + (c-'0');
            } else {
                sum += num;
                num = 0;
            }
        }
        sum += num;
        System.out.println("Sum numbers: " + sum);
    }

    // 8. Find duplicates
    public static void printDuplicates(int[] arr) {
        System.out.print("Duplicates: ");
        for (int i = 0; i < arr.length; i++) {
            boolean seenBefore = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) seenBefore = true;
            }
            if (seenBefore) System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // 9. Anagram check
    public static void isAnagram(String s1, String s2) {
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();
        boolean result = true;
        if (s1.length() != s2.length()) result = false;
        else {
            char[] a = s1.toCharArray();
            char[] b = s2.toCharArray();

            for (int i = 0; i < a.length-1; i++) {
                for (int j = 0; j < a.length-1-i; j++) {
                    if (a[j] > a[j+1]) {
                        char t = a[j]; a[j] = a[j+1]; a[j+1] = t;
                    }
                }
            }
            for (int i = 0; i < b.length-1; i++) {
                for (int j = 0; j < b.length-1-i; j++) {
                    if (b[j] > b[j+1]) {
                        char t = b[j]; b[j] = b[j+1]; b[j+1] = t;
                    }
                }
            }
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) result = false;
            }
        }
        System.out.println("Anagram? " + result);
    }

    // 10. Remove spaces
    public static void removeSpaces(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c!=' ' && c!='\t' && c!='\n') result += c;
        }
        System.out.println("No spaces: " + result);
    }

    // 11. Char frequency
    public static void charFrequency(String s) {
        System.out.println("Char frequency:");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean already = false;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) already = true;
            }
            if (!already) {
                int count = 0;
                for (int k = 0; k < s.length(); k++) {
                    if (s.charAt(k) == c) count++;
                }
                System.out.println(c + ": " + count);
            }
        }
    }

    // 12. Fibonacci with array
    public static void fibonacciArray(int n) {
        if (n <= 0) {
            System.out.println("Нет чисел для вывода");
            return;
        }
        int[] fib = new int[n];
        fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i-1] + fib[i-2];
        }
        System.out.println("Fibonacci:");
        for (int i = 0; i < n; i++) {
            System.out.println(fib[i]);
        }
    }

    // 13. Primes
    public static void printPrimes(int n) {
        System.out.print("Primes: ");
        for (int i = 2; i <= n; i++) {
            boolean prime = true;
            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) prime = false;
            }
            if (prime) System.out.print(i + " ");
        }
        System.out.println();
    }

    // 14. Sum at even indices
    public static void sumEvenIndices(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i+=2) sum += arr[i];
        System.out.println("Sum even indices: " + sum);
    }

    // 15. Swap min and max
    public static void swapMinMax(int[] arr) {
        int minI = 0, maxI = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minI]) minI = i;
            if (arr[i] > arr[maxI]) maxI = i;
        }
        int t = arr[minI]; arr[minI] = arr[maxI]; arr[maxI] = t;
        System.out.print("Swap min/max: ");
        for (int n : arr) System.out.print(n+" ");
        System.out.println();
    }

    // 16. Reverse string
    public static void reverseString(String s) {
        char[] a = s.toCharArray();
        int i = 0, j = a.length-1;
        while (i < j) {
            char t = a[i]; a[i] = a[j]; a[j] = t;
            i++; j--;
        }
        System.out.println("Reversed: " + new String(a));
    }

    // 17. Remove duplicates
    public static void removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean seen = false;
            for (int j = 0; j < size; j++) {
                if (arr[i] == temp[j]) seen = true;
            }
            if (!seen) temp[size++] = arr[i];
        }
        System.out.print("Removed duplicates: ");
        for (int i = 0; i < size; i++) System.out.print(temp[i] + " ");
        System.out.println();
    }

    // 18. Second largest
    public static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max; max = arr[i];
            } else if (arr[i] > second && arr[i] != max) {
                second = arr[i];
            }
        }
        System.out.println("Second largest: " + second);
    }

    // 19. Merge arrays
    public static void mergeUnique(int[] a, int[] b) {
        int[] temp = new int[a.length+b.length];
        int size = 0;
        for (int i = 0; i < a.length; i++) {
            boolean seen = false;
            for (int j = 0; j < size; j++) if (a[i]==temp[j]) seen = true;
            if (!seen) temp[size++] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            boolean seen = false;
            for (int j = 0; j < size; j++) if (b[i]==temp[j]) seen = true;
            if (!seen) temp[size++] = b[i];
        }
        System.out.print("Merged: ");
        for (int i = 0; i < size; i++) System.out.print(temp[i] + " ");
        System.out.println();
    }

    // 20. Split string manually
    public static void splitByChar(String s, char d) {
        System.out.print("Split: ");
        String current = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == d) {
                System.out.print(current + " ");
                current = "";
            } else {
                current += s.charAt(i);
            }
        }
        System.out.println(current);
    }

    public static void main(String[] args) {
        uniqueWords("Java is great and Java is powerful");
        longestWord("Java is great and Java is powerful");
        countVowelsAndConsonants("Hello World");
        isPalindrome("A man a plan a canal Panama");
        substringSearch("hello world", "world");
        bubbleSort(new int[]{5, 3, 8, 3, 9, 1});
        sumNumbers("a12bc34d5");
        printDuplicates(new int[]{1,2,3,2,4,5,1});
        isAnagram("listen", "silent");
        removeSpaces(" a b \t c \n d ");
        charFrequency("abcaabbc");
        fibonacciArray(10);
        printPrimes(20);
        sumEvenIndices(new int[]{1,2,3,4,5});
        swapMinMax(new int[]{3,1,7,5});
        reverseString("hello");
        removeDuplicates(new int[]{1,2,2,3,1,4});
        secondLargest(new int[]{10,20,4,20,5});
        mergeUnique(new int[]{1,2,3}, new int[]{3,4,5});
        splitByChar("a,b,c,d", ',');
    }
}
