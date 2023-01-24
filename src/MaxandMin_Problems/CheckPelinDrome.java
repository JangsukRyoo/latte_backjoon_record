package MaxandMin_Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPelinDrome {

    public static void main(String args[]) throws IOException {
        //#10988 팰린드롬인지 찾기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder(str);
        if (str.equals(sb.reverse().toString())) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}




























