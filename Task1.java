import java.util.Arrays;

public class Task1 {
    // Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”
    public static void main(String[] args) {
        System.out.println(shuffle("cba", new int[]{3, 2, 1}));
    }

    public static String shuffle(final String s, final int[] index){

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
        {
            res.append(s.split("")[index[i] - 1]);
        }
        return res.toString();
    }
}