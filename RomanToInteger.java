public class RomanToInteger {
    public static void main(String args[]) {
        String roman = "MMMXLV";
        romanToInt(roman);
    }

    public static int romanToInt(String s) {
        int integer = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'M':
                    integer += 1000;
                    break;
                case 'D':
                    integer += 500;
                    break;
                case 'C':
                    if (i != (s.length() - 1) && i >= 0) {
                        if (s.charAt(i + 1) == 'M' || s.charAt(i + 1) == 'D') {
                            if (s.charAt(i + 1) == 'M')
                                integer += 900;
                            if (s.charAt(i + 1) == 'D')
                                integer += 400;
                            i++;
                        } else
                            integer += 100;
                    } else
                        integer += 100;
                    break;
                case 'L':
                    integer += 50;
                    break;
                case 'X':
                    if (i != (s.length() - 1) && i >= 0) {
                        if (s.charAt(i + 1) == 'C' || s.charAt(i + 1) == 'L') {
                            if (s.charAt(i + 1) == 'C')
                                integer += 90;
                            if (s.charAt(i + 1) == 'L')
                                integer += 40;
                            i++;
                        } else
                            integer += 10;
                    } else
                        integer += 10;
                    break;
                case 'V':
                    integer += 5;
                    break;
                case 'I':
                    if (i != (s.length() - 1) && i >= 0) {
                        if (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                            if (s.charAt(i + 1) == 'V')
                                integer += 4;
                            if (s.charAt(i + 1) == 'X')
                                integer += 9;
                            i++;
                        } else
                            integer += 1;
                    } else
                        integer += 1;
                    break;
            }
        }
        System.out.println(integer);
        return integer;
    }
}