package reading;

public class AudioBook extends EBook {
    private int recordingLength;
    private String narrator;

    public AudioBook(int recordingLength, String narrator) {
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
