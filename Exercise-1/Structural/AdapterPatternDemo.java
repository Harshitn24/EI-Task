// Target interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee class
class VideoPlayer {
    public void playVideo(String fileName) {
        System.out.println("Playing video: " + fileName);
    }
}

// Adapter class
class MediaAdapter implements MediaPlayer {
    private VideoPlayer videoPlayer;

    public MediaAdapter(VideoPlayer videoPlayer) {
        this.videoPlayer = videoPlayer;
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        }
    }
}

// Concrete MediaPlayer class
class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("audio")) {
            System.out.println("Playing audio: " + fileName);
        } else if (audioType.equalsIgnoreCase("video")) {
            mediaAdapter = new MediaAdapter(new VideoPlayer());
            mediaAdapter.play(audioType, fileName);
        }
    }
}

// Demo
public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.play("audio", "song.mp3");
        audioPlayer.play("video", "movie.mp4");
    }
}
