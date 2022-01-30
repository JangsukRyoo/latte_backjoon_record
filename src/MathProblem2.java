import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MathProblem2 {
    public static boolean prime[];
    public static void main(String args[]) throws IOException {

        Scanner sc = new Scanner(System.in);

//        #1978
//
//        int n = sc.nextInt();
//        int ct = 0;
//
//        for(int i =0; i<n; i++){
//
//            boolean isPrime = true;
//            int num = sc.nextInt();
//
//            if(num == 1){
//                continue;
//            }
//
//            for(int j = 2; j <=Math.sqrt(num); j++){
//                if(num % j == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//            if(isPrime){
//                ct ++;
//            }
//        }
//        System.out.println(ct);

//        #2581
//
//        int M = sc.nextInt();
//        int N = sc.nextInt();
//
//        prime = new boolean[N + 1];
//        get_prime();
//
//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//        for(int i = M; i <= N; i++) {
//            if(prime[i] == false) {
//                sum += i;
//                if(min == Integer.MAX_VALUE) {
//                    min = i;
//                }
//            }
//        }
//
//        if(sum == 0) {
//            System.out.println(-1);
//        }
//        else {
//            System.out.println(sum);
//            System.out.println(min);
//        }
//    }
//
//    public static void get_prime() {
//        prime[0] = true;
//        prime[1] = true;
//
//        for(int i = 2; i <= Math.sqrt(prime.length); i++) {
//            for(int j = i * i; j < prime.length; j += i) {
//                prime[j] = true;
//            }
//        }

//      #9020
        // 2보다  큰 짝수가 주어질 때 소수의 합을 구한다.
        // 소수의 합이 여러개일 경우 두 소수의 차이가 작은 것을 출력한다
        // 두 개으 소수를 출력 할 때 작은 소수 부터 출력한다.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        get_prime();
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0){
            int n = Integer.parseInt(br.readLine());
            int first = n/2;
            int second = n/2;
            if (!prime[first] && !prime[second]) {
                System.out.println(first + " " + second);
                break;
            }
            first--;
            second++;
        }
    }
    public static void get_prime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i])
                continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
    }

    public static boolean[] prim = new boolean[10001];
}
