//13020220145,Adri Linrung, Kamis 29 Feb 2024
public class n16 {
    public static void main(String[] args) {
        // Deklarasi variabel
        boolean Bool1, Bool2, TF;
        int i, j, hsl;
        float x, y, res;

        // Pengoperasian variabel
        Bool1 = true;
        Bool2 = false;

        // Operasi logika
        TF = Bool1 && Bool2; // Boolean AND
        TF = Bool1 || Bool2; // Boolean OR
        TF = !Bool1; // NOT
        TF = Bool1 ^ Bool2; // XOR

        // Operasi numerik
        i = 5;
        j = 2;
        hsl = i + j;
        hsl = i - j;
        hsl = i / j;
        hsl = i * j;
        hsl = i / j; // pembagian bulat
        hsl = i % j; // sisa modulo

        // Operasi numerik
        x = 5;
        y = 5;
        res = x + y;
        res = x - y;
        res = x / y;
        res = x * y;

        // Operasi relasional numerik
        TF = (i == j);
        TF = (i != j);
        TF = (i < j);
        TF = (i > j);
        TF = (i <= j);
        TF = (i >= j);

        // Operasi relasional numerik
        TF = (x != y);
        TF = (x < y);
        TF = (x > y);
        TF = (x <= y);
        TF = (x >= y);
    }
}
