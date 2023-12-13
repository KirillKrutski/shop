import java.util.Scanner;
public class Main {
    Scanner in = new Scanner(System.in);
    public void buy(){
        return;
    }

    public int choose(){
        menu();
        int value = in.nextInt();
        switch (value){
            case 0:
                return -1;
            case 1:
                buy();
            case 2:
                admin();
        }
        return 0;
    }

    public void menu(){
        System.out.println("1 - buy LEGO\n2 - Enter in to admin account\n0 - exit\n");
    }

    public void admin() {
        // add password for admin
    }

    public static void main(String[] args) {

        String[] nameItems = {"Star Wars" , "City"};
        int[] costItems = {300, 400};
        System.out.print("Welcome to the LEGO shop\n");
        while (true){
            if (choose() == -1){
                break;
            }
        }
    }
}