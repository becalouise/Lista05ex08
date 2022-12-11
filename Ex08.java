package Lista05ex08;
import java.util.Scanner;
public class Ex08{
        public static void main(String[] args) throws Exception {
            Scanner sc = new Scanner(System.in);
            System.out.println("Insira um número: ");
            String numero=sc.nextLine();
            System.out.println("Quantidade de dígitos: "+numero.length());
            sc.close();
        }
    }
    
