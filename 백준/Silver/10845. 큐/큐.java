import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");

            switch (split[0]) {
                case "pop":
                    System.out.println(queue.isEmpty() ? -1 : queue.pollFirst());
                    break;

                case "front":
                    System.out.println(queue.isEmpty() ? -1 : queue.peekFirst());
                    break;

                case "back":
                    System.out.println(queue.isEmpty() ? -1 : queue.peekLast());
                    break;

                case "size":
                    System.out.println(queue.size());
                    break;

                case "empty":
                    System.out.println(queue.isEmpty() ? 1 : 0);
                    break;

                default: // push X
                    queue.offerLast(Integer.parseInt(split[1]));
                    break;
            }
        }
    }
}