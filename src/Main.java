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
    // повторение символа в слове
    public static String repeat (String s, int n){
        String result ="";
        for(char b : s.toCharArray()){ // делаем массив из слова
            for(int p=0; p<n; p++){
                result+=b;
            }
        }
        return result;
    }
    // разность max и min значений
    public static int differenceMaxMin(int[] arr){
        int max = arr[0]; //объявляем массив наибольшего числа
        int min = arr[0]; // массив с наименьшим числом
        for(int lit : arr){ // распределяем числа по массивам
            if(lit > max)max = lit;
            if(lit < min)min = lit;
        }
        return max - min; // выводим разность
    }
    //является ли среднее значение целым числом или нет
    public static boolean isAvgWhole(int[] arr){
        int sum = 0;
        for(int chs : arr){
            sum += chs; // суммируем все числа в массиве
        }
        double a = (double)sum/arr.length; // делим сумму на количество чисел в массиве
        return a == (int)a;
    }
    // сумма цифр до n включая
    public static int[] cumulativeSum(int[] arr){
        int[] new_arr = new int[arr.length]; // создаем массив
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i]; // суммиуем число с предыдущими числами
            new_arr[i] = sum; // записываем сумму в массив
        }
        return new_arr;
    }
    // количество знаков после .
    public static int getDecimalPlaces(String st){
        int des = st.indexOf('.');
        if (des == -1)return 0; // проверяем наличие чисел после .
        return st.length() - des - 1; // выводим количество знаков после .
    }
    // число фибоначчи
    public static int Fibonacci(int n){
        int a = 1;
        int b = 1;
        while (n > 0){
            b = a + b; // рассматриваем сумму двух предыдущих чисел до n
            a = b - a;
            n--;
        }
        return a;
    }
    // почтовый индекс из 5 цифр
    public static boolean isValid(String fil){
        if(fil.length() != 5) return false; // проверяем чтобы количество знаков было = 5
        return fil.chars().allMatch(Character :: isDigit); // проверяем, чтобы в строке были только числа
    }
    // странная пара (1 буква 1 стр = последней букве 2 строки и наоборот)
    public static boolean isStrangePair(String first, String second){
        if(first.length() == 0 && second.length() == 0)return true;
        // сравниваем буквы по условию
        return (first.charAt(0) == second.charAt(second.length() - 1)) && (second.charAt(0) == first.charAt(first.length() - 1));
    }
    // начинается слово с префикса
    public static boolean isPrefix(String word, String subword){
        for(int i = 0; i < (subword.length() - 1); i++){
            if(subword.charAt(i) != word.charAt(i))return false; // проверяем на схожесть префикса
        }
        return true;
    }
    // заканчивается суффиксом
    public static boolean isSuffix(String word, String subword){
        int d = word.length() - subword.length() + 1;
        for(int i = d; i < word.length(); i++){
            if(word.charAt(i) != subword.charAt(i - d + 1))return false;
        }
        return true;
    } // принимает шаг и возвращает количесво полей
    public static int boxSeq(int step){
        int r = 0;
        for(int i = 0; i < step; i++){
            if(i % 2 == 0) r += 3;
            else r -= 1;
        }
        return r;
    }

}