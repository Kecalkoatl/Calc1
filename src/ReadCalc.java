import java.util.Scanner;

public class ReadCalc {
    Integer[] arabic = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    String[] roman = {"X", "IX", "VIII", "VII", "VI", "V", "IV", "III", "II", "I"};
    int num1;
    int num2;
    String operation;
    char operation1;
    boolean flag;

    public void ReadCalc() {
        System.out.println("Введите выражение: ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] blocks = text.split(" ");
        if (blocks.length < 0 || blocks.length > 3 ) {
            throw new IllegalArgumentException("Выражение введено неверно!");
        }
        operation = blocks[1];
        this.operation1 = operation.charAt(0);
        this. flag = false;
        for (int i = 0; i < roman.length; i++){
            if (roman[i].equals(blocks[0]) || roman[i].equals(blocks[2])) {
                flag = true;
            }
        }
        //Да, тут циклу достаточно оператора or. И это работает благодаря конвертеру.
        try {
            if (flag) {
                num1 = RomanToArabic.RomanToArabic(blocks[0]);
                num2 = RomanToArabic.RomanToArabic(blocks[2]);
            } else {
                num1 = Integer.parseInt(blocks[0]);
                num2 = Integer.parseInt(blocks[2]);
            }
            if ((num1 > 10 || num1 < 1) || (num2 > 10 || num2 < 1)) {
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Неподходящие числа!");
        }
    }
        public int a () {
            return num1;
        }
        public int b () {
            return num2;
        }
        public char c () {
            return operation1;
        }
}