public class MainCalc {

    public static void main(String[] args) {
            ReadCalc readcalc = new ReadCalc();
            while (true) {
                readcalc.ReadCalc();
                int result = Calculator.calculate(readcalc.a(), readcalc.b(), readcalc.c());
                if (readcalc.flag) {
                    System.out.println(ArabicToRoman.ArabaicToRoman(result));
                } else {
                    System.out.println(result);
                }
            }
        }
    }
