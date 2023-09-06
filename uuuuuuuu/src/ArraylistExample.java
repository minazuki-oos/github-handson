import java.util.ArrayList;
        import java.util.List;

public class ArraylistExample {
    public static void main(String[] args) {
        // ① String型のListを作成
        List<String> stringList = new ArrayList<>();

        // ② Listに複数の要素を追加
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("こんにちは");
        stringList.add("GPT-3.5");
        stringList.add("ChatGPT");

        // Listの内容を表示
        System.out.println(stringList);
    }
}
