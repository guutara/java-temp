import java.util.*;

public class pyza {
    public static void main(String[] args) {
        // 自分の得意な言語でScanner
        Scanner sc = new Scanner(System.in);
        Integer alfabetamount = sc.nextInt();
        ArrayList<String> alfabetlist = new ArrayList<String>();
        int mojiretuamount = 0;
        String taishou = null;
        for (int i = 0; i < alfabetamount; i++) {
            String alfabet = sc.next();
            alfabetlist.add(alfabet);
        }

        mojiretuamount = sc.nextInt();

        for (int i = 0; i < alfabetamount; i++) {
            taishou = alfabetlist.get(i);
            for (int m = 0; m < mojiretuamount; m++) {
                System.out.println("m=" + m);
                String mojiretu = sc.next();
                if (mojiretu.contains(taishou)) {
                    System.out.println("YES");
                } else {
                    System.out.println("no");
                }
            }
        }
        sc.close();
    }
}
