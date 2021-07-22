public class ArabicToRoman {
    public static String ArabaicToRoman(int Arabic) {
        String s = "";
        while (Arabic >= 100) {
            s += "C";
            Arabic -= 100;
        }
        while (Arabic >= 90) {
            s += "XC";
            Arabic -= 90;
        }
        while (Arabic >= 50) {
            s += "L";
            Arabic -= 50;
        }
        while (Arabic >= 40) {
            s += "XL";
            Arabic -= 40;
        }
        while (Arabic >= 10) {
            s += "X";
            Arabic -= 10;
        }
        while (Arabic >= 9) {
            s += "IX";
            Arabic -= 9;
        }
        while (Arabic >= 5) {
            s += "V";
            Arabic -= 5;
        }
        while (Arabic >= 4) {
            s += "IV";
            Arabic -= 4;
        }
        while (Arabic >= 1) {
            s += "I";
            Arabic -= 1;
        }
        return s;
    }
}
