public class Compulsory {

    public static void main(String[] args) {
        System.out.println("hi!");
        String[] languages = new String[]{"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1000000.0D);
        n *= 3;
        String number = "10101";
        n += Integer.parseInt(number, 2);
        number = "FF";
        n += Integer.parseInt(number, 16);

        int k;
        for (n *= 6; n >= 10; n = k) {
            for (k = 0; n != 0; n /= 10) {
                k += n % 10;
            }
        }

        System.out.println("Willy-nilly, this semester I will learn " + languages[n]);
    }
}


