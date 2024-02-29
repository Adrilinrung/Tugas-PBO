public class n9 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int x = 1;
        int y = 2;
        float fx;
        float fy;

        // Menampilkan hasil pembagian integer
        System.out.print("x/y (format integer) = " + x / y);
        System.out.print("\nx/y (format float) = " + (float)x / y);

        // Supaya hasilnya tidak nol
        fx = x;
        fy = y;
        System.out.print("\nx/y (format integer) = " + (int)(fx / fy));
        System.out.print("\nx/y (format float) = " + fx / fy);

        // Casting
        System.out.print("\nfloat(x)/float(y) (format integer) = " + (int)((float)x / (float)y));
        System.out.print("\nfloat(x)/float(y) (format float) = " + (float)x / (float)y);

        // Update nilai x dan y
        x = 10;
        y = 3;
        System.out.print("\nx/y (format integer) = " + x / y);
        System.out.print("\nx/y (format float) = " + (float)x / y);
    }
}
