
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class babelfish {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> words = new HashMap<>();
        String line = sc.nextLine();
        while (!line.isEmpty()) {
            String[] word = line.split(" ");
            String english = word[0];
            String foreign = word[1];
            words.put(foreign,english);
            line = sc.nextLine();
        }
        ArrayList<String> foreignDictionary = new ArrayList<>();
        int i = 0;
        while (sc.hasNext()) {
            line = sc.nextLine();
            foreignDictionary.add(line);
            System.out.println(words.getOrDefault(foreignDictionary.get(i), "eh"));
            i++;
        }
    }
}
