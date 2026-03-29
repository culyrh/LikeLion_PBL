import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count;
        while (true) {
            System.out.print("\uD83E\uDD81 저장할 아기사자 수를 5 이상 입력해주세요.\n");
            count = Integer.parseInt(br.readLine());
            if (count >= 5) {
                break;
            }
            System.out.println("❗ [오류] 5 이상 입력해주세요.\n");
        }

        String[] names = new String[count];

        System.out.print("✏\uFE0F 아기사자 이름을 입력해주세요.\n");
        for (int i = 0; i < count; i++) {
            names[i] = br.readLine();
        }

        System.out.println("\n\uD83D\uDDD2\uFE0F 아기사자 명단을 최종적으로 출력합니다.");
        for (int i = 0; i < names.length; i++) {
            System.out.println("\uD83E\uDD81 " + (i + 1) + ". " + names[i]);
        }
    }
}
