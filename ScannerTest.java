import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {

        // 乱数の桁数 桁数*10を指定する。
        // 10桁以上はintに入らない為Longを指定
        // 末尾にlをつけるとLong型となる
        long asLonglen = 10000000000l;
        int ansNumber = (int) (Math.random() * asLonglen);

        Scanner sc = new Scanner(System.in);
        String rtnLine = sc.nextLine();

        // 改行コードじゃなければ再入力をさせる
        while (!rtnLine.equals("")) {

            System.out.println("Please Enter Key");
            rtnLine = sc.nextLine();
        }

        // 課題の表示
        // 10桁を表示するために"0000000000"表示のフォーマット
        System.out.println(String.format("%10d", ansNumber));

        while (sc.hasNext()) {
            //桁数溢れや文字列が入った時の為にtry-catch
            try {
                int asInt = sc.nextInt();
                System.out.println(asInt);

                // 答えがあっていたらループを抜ける
                if (ansNumber == asInt) {
                    sc.close();
                    System.out.println("d(^ ^) Done!");
                    break;
                }else{
                    System.out.println("(T_T) miss!");
                }

            } catch (Exception e) {
                System.out.println("Ignore : <" +  sc.nextLine() + "> Retry");
            }
            
            // 課題の表示
            // 10桁を表示するために"0000000000"表示のフォーマット
            System.out.println(String.format("%10d", ansNumber));

        }

        sc.close();
    }
}
