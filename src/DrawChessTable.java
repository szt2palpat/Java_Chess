import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
      int szam=0;
        Scanner n=new Scanner(System.in);
        System.out.println("Addj meg egy számot:");
        szam=n.nextInt();
        for (int i=0;i<szam;i++){
          System.out.println("% % % %");
      }

    }
}