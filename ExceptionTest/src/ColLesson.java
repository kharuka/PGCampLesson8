import java.util.ArrayList;
import java.util.Scanner;

public class ColLesson {
    public static void main(String[] args) {
        int NUMBER = 5;

        // ArrayList
        ArrayList<Word> arrayList = new ArrayList<Word>();

        // コマンドラインから入力
        System.out.println("わからない単語とその意味をスペースで区切って入力して下さい。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // ここから記述してください
        // 例えば、「Dukeくん Javaのマスコットキャラクター」と入力されたときはtmp[0]に"Dukeくん"、tmp[1]に"Javaのマスコットキャラクター"が入る
        String[] tmp = input.split(" ", 0);
        Word words = new Word(tmp[0], tmp[1]);
        arrayList.add(words);

        int COUNT = 1;
        do {
            try {
                int i = COUNT;

                System.out.println("次の単語と意味を入力して下さい。\"e\"で終了します。");
                input = sc.nextLine();

                if ("e".equals(input)) {
                    break;
                }
                tmp = input.split(" ", 0);
                words = new Word(tmp[0], tmp[1]);
                arrayList.add(words);
                COUNT = ++i;
            } catch (ArrayIndexOutOfBoundsException e) {
                throwException();
            }
        } while (COUNT <= NUMBER - 1);
        sc.close();


        if (COUNT == NUMBER) {
            System.out.println("登録制限を超えました。登録済みのデータは以下になります。");
        }

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).toString());
        }
        System.out.println(COUNT + "件、登録しました。");

    }

    public static void throwException() throws ArrayIndexOutOfBoundsException {
        System.out.println("半角スペースを使用して下さい。");
    }
}
