package q;

public class april {
    public static void main(String[] args) {
        for (;;){
            System.out.println("Hello World");
            break;
        }
        for ( int i = 1; i <= 5 ; i++){
            for ( int j = 1; j <= 5 ; j++){
                System.out.println("*");
            }

            System.out.println();
        }
        for (int a =200; a <= 300; a++){
            if (a % 11 == 0){
                continue;
            }
            System.out.println(a+"");
        }
    }
}
