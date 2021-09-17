import java.util.Scanner;

public class dairedilimialani{
    public static void main(String[] args) {
     
    // değişkenleri tanımlayalım
    double 𝛼, 𝜋 = 3.14, r, alan;

    // import sınıfını tanımlayalım
    Scanner input = new Scanner(System.in);

    // kullanıcıdan input alalım
    System.out.println("Yarıçapı giriniz");
    r = input.nextDouble();
    System.out.println("açıyı giriniz");
    𝛼 = input.nextDouble();

    // sonucu verelim
    alan = (𝜋 * (r*r) * 𝛼) / 360;
    System.out.println("Dairenin alanı " + alan);
    }
}