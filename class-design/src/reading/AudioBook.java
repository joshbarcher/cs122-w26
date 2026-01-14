package reading;

public class AudioBook extends EBook {
    private int recordingLength;
    private String narrator;

    public AudioBook(int recordingLength, String narrator, String format,
                     String author, int pages, boolean hasCover, String title) {
        super();
        //super(format, author, pages, hasCover, title);

        this.recordingLength = recordingLength;
        this.narrator = narrator;
    }

    public int getRecordingLength() {
        return recordingLength;
    }

    public String getNarrator() {
        return narrator;
    }
}
