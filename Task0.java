public class Task0 {
    // Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
    public static void main(String[] args) {
        String jewels = "aB";
        String stones = "aaaAbbbB";
        System.out.println(findJewelsInStones(jewels, stones));

    }

    public static String findJewelsInStones(String jewels, String stones) {
        StringBuilder res = new StringBuilder();

        for(char jewel: jewels.toCharArray())
        {
            int count = 0;
            for(char stone: stones.toCharArray())
            {
                if (stone == jewel)
                    count++;
            }
            if (count!=0)
                res.append(jewel).append(count);
        }

        return res.toString();
    }
}