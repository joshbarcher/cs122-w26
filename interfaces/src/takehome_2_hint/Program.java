import takehome_2_hint.Console;

private static final int MAX_SONGS = 4;
private static String[] songs;

void main() {
    Console.println("Welcome to my song program");

    songs = new String[MAX_SONGS];
    int currentIndex = 0;

    for (int i = 1; i <= 2; i++) {
        //ask a user for their song and save it
        String song = Console.getString("Enter a song");
        songs[currentIndex] = song;
        currentIndex++; //move up one index to the next empty spot!
    }

    //print out all the songs
    for (String song : songs) {
        System.out.println("Song: " + song);
    }
}