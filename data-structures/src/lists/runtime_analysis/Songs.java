package lists.runtime_analysis;

import java.util.ArrayList;

public class Songs {
    public static void main() {
        ArrayList<String> songs = new ArrayList<>();

        songs.add("Bohemian Rhapsody");
        songs.add("Hotel California");
        songs.add("Stairway to Heaven");
        songs.add("Imagine");
        songs.add("Sweet Child O' Mine");
        songs.add("Smells Like Teen Spirit");
        songs.add("Billie Jean");
        songs.add("Like a Rolling Stone");
        songs.add("Hey Jude");
        songs.add("Wonderwall");

        for (int i = 1; i <= 1000000; i++) {
            songs.add("Somebody I Used To Know");
        }

        //System.out.println(songs);

//        for (int i = songs.size() - 1; i >= 0; i--) {
//            songs.remove(i);
//        }

//        int size = songs.size();
//        for (int i = 0; i < size; i++) {
//            songs.remove(0);
//        }

        songs.clear();

        System.out.println(songs);
    }
}
