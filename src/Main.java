import java.util.Arrays;
public class Main{
    public static void main(String[] args) {
        System.out.println("Задача 1");
        System.out.println("repeat(mice, 5) -> " + repeat("mice", 5) );
        System.out.println("repeat(hello, 3) -> " + repeat("hello", 3) );
        System.out.println("repeat(stop, 1) -> " + repeat("stop", 1) );
        System.out.println("Задача 2");
        System.out.println("differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) -> " + differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println("differenceMaxMin([44, 32, 86, 19]) -> " + differenceMaxMin(new int[]{44, 32, 86, 19}));
        System.out.println("Задача 3");
        System.out.println("isAvgWhole([1, 3]) -> " + isAvgWhole(new int[]{1, 3}));
        System.out.println("isAvgWhole([1, 2, 3, 4]) -> " + isAvgWhole(new int[]{1, 2, 3, 4}));
        System.out.println("isAvgWhole([1, 5, 6]) -> " + isAvgWhole(new int[]{1, 5, 6}));
        System.out.println("isAvgWhole([1, 1, 1]) -> " + isAvgWhole(new int[]{1, 1, 1}));
        System.out.println("isAvgWhole([9, 2, 2, 5]) -> " + isAvgWhole(new int[]{9, 2, 2, 5}));
        System.out.println("Задача 4");
        System.out.println("cumulativeSum([1, 2, 3]) -> " + Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
        System.out.println("cumulativeSum([1, -2, 3]) -> " + Arrays.toString(cumulativeSum(new int[]{1, -2, 3})));
        System.out.println("cumulativeSum([3, 3, -2, 408, 3, 3]) -> " + Arrays.toString(cumulativeSum(new int[]{3, 3, -2, 408, 3, 3})));
        System.out.println("Задача 5");
        System.out.println("getDecimalPlaces(\"43.20\") -> " + getDecimalPlaces("43.20"));
        System.out.println("getDecimalPlaces(\"400\") -> " + getDecimalPlaces("400"));
        System.out.println("Задача 6");
        System.out.println("Fibonacci(3) -> " + Fibonacci(3));
        System.out.println("Fibonacci(7) -> " + Fibonacci(7));
        System.out.println("Fibonacci(12) -> " + Fibonacci(12));
        System.out.println("Задача 7");
        System.out.println("isValid(\"59001\") -> " + isValid("59001"));
        System.out.println("isValid(\"853a7\") -> " + isValid("853a7"));
        System.out.println("isValid(\"732 32\") -> " + isValid("732 32"));
        System.out.println("isValid(\"393939\") -> " + isValid("393939"));
        System.out.println("Задача 8");
        System.out.println("isStrangePair(\"ratio\", \"orator\") -> " + isStrangePair("ratio", "orator"));
        System.out.println("isStrangePair(\"sparkling\", \"groups\") -> " + isStrangePair("sparkling", "groups"));
        System.out.println("isStrangePair(\"bush\", \"hubris\") -> " + isStrangePair("bush", "hubris"));
        System.out.println("isStrangePair(\"\", \"\") -> " + isStrangePair("", ""));
        System.out.println("Задача 9");
        System.out.println("isPrefix(\"automation\", \"auto-\") -> " + isPrefix("automation", "auto-"));
        System.out.println("isPrefix(\"retrospect\", \"sub-\") -> " + isPrefix("retrospect", "sub-"));
        System.out.println("isPrefix(\"vocation\", \"pre-\") -> " + isPrefix("vocation", "pre-"));
        System.out.println("isSuffix(\"arachnophobia\", \"-phobia\") -> " + isSuffix("arachnophobia", "-phobia"));
        System.out.println("isSuffix(\"rhinoplasty\", \"-plasty\") -> " + isSuffix("rhinoplasty", "-plasty"));
        System.out.println("isSuffix(\"movement\", \"-ment\") -> " + isSuffix("movement", "-ment"));
        System.out.println("Задача 10");
        System.out.println("boxSeq(0) -> " + boxSeq(0));
        System.out.println("boxSeq(1) -> " + boxSeq(1));
        System.out.println("boxSeq(2) -> " + boxSeq(2));
    }
    public static String repeat (String s, int n){
        String out ="";
        for(char lit : s.toCharArray()){
            for(int p=0; p<n; p++){
                out+=lit;
            }
        }
        return out;
    }
    public static int differenceMaxMin(int[] arr){
        int max = arr[0];
        int min = arr[0];
        for(int digit : arr){
            if(digit > max)max = digit;
            if(digit < min)min = digit;
        }
        return max - min;
    }
    public static boolean isAvgWhole(int[] arr){
        int sum = 0;
        for(int digit : arr){
            sum += digit;
        }
        double a = (double)sum/arr.length;
        return a == (int)a;
    }
    public static int[] cumulativeSum(int[] arr){
        int[] new_arr = new int[arr.length];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            new_arr[i] = sum;
        }
        return new_arr;
    }
    public static int getDecimalPlaces(String digit){
        int dotindex = digit.indexOf('.');
        if (dotindex == -1)return 0;
        return digit.length() - dotindex - 1;
    }
    public static int Fibonacci(int n){
        int left = 1;
        int right = 1;
        while (n > 0){
            right = left + right;
            left = right - left;
            n--;
        }
        return left;
    }
    public static boolean isValid(String zip){
        if(zip.length() != 5) return false;
        return zip.chars().allMatch(Character :: isDigit);
    }

    public static boolean isStrangePair(String first, String second){
        if(first.length() == 0 && second.length() == 0)return true;
        return (first.charAt(0) == second.charAt(second.length() - 1)) && (second.charAt(0) == first.charAt(first.length() - 1));
    }

    public static boolean isPrefix(String word, String subword){
        for(int i = 0; i < (subword.length() - 1); i++){
            if(subword.charAt(i) != word.charAt(i))return false;
        }
        return true;
    }

    public static boolean isSuffix(String word, String subword){
        int baseIdx = word.length() - subword.length() + 1;
        for(int i = baseIdx; i < word.length(); i++){
            if(word.charAt(i) != subword.charAt(i - baseIdx + 1))return false;
        }
        return true;
    }
    public static int boxSeq(int step){
        int res = 0;
        for(int i = 0; i < step; i++){
            if(i % 2 == 0)res += 3;
            else res -= 1;
        }
        return res;
    }

}