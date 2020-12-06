import java.io.*;

public class Primenumber {

public static void main(String[] args) throws IOException{

int num=input();

boolean ret=retPrimenumber(num);

output(ret,num);

}

static void output(boolean ret,int num) {

if(ret==false) {

System.out.println(num+"は素数ではありません");

}

if(ret==true) {

System.out.println(num+"は素数です");

}

}

static int input()throws IOException{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

System.out.println("判定したい数値を半角で入力してください");

return Integer.parseInt(br.readLine());

}

static boolean retPrimenumber(int num) {

if(num<2) return false;

int i=num-1;

while (i>1) {

if (num%i==0) return false;

i--;

}return true;

}

}

