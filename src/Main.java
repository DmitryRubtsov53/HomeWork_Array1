public class Main {
    public static void main(String[] args) {

        System.out.println("Домашне задание Массивы часть 1 ****************************************");

        System.out.println(" ");
        System.out.println("Задача 1-2 - Создать 3 массива и распечатать элементы");

        int[] celie = new int[3]; celie [0] = 1; celie [1] = 2; celie [2] = 3;
        double[] drobn = { 1.57, 7.654, 8.986 };
        char[] simvol = {'Q', 'W', 'W', 'E', 'R', 'T', 'Y'};

        System.out.print( celie[0] + ", " + celie[1] + ", " + celie[2] );
        System.out.print( "  " + drobn[0] + ", " + drobn[1] + ", " + drobn[2] + "  " );
        System.out.print( simvol[0] + ", " + simvol[1] + ", " + simvol[2] + ", " + simvol[3] + ", " + simvol[4] + ", " + simvol[5] + ", " + simvol[6]) ;

        System.out.println(" ");
        System.out.println("Задача 3 - Распечатать элементы наоборот");
        int i = 2, k = 2, j = 6;
        while (i >= 1) { System.out.print( celie[i] + ", " ); i--; }
        System.out.println( celie[0] );
        while (k >= 1) { System.out.print( drobn[k] + ", " ); k--; }
        System.out.println( drobn[0] );
        while (j >= 1) { System.out.print( simvol[j] + ", " ); j--; }
        System.out.print( simvol[0] );

        System.out.println(" ");
        System.out.println("Задача 4 - Перевести нечетные числа в четные 1-го массива");

        int x = 0 ;

        while (x <= celie.length - 1) {
            if (celie[x] % 2 != 0) {
                System.out.print( (celie[x] + 1) + "  " ); }
                else System.out.print( celie[x] + "  " ); x++; }
    }
}