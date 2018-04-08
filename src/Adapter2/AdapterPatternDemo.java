package Adapter2;

public class AdapterPatternDemo {
   public static void main(String[] args) {
      MediaPlayer audioPlayer = new MediaPlayer();

      audioPlayer.play("mp3", "beyond the horizon.mp3");
      audioPlayer.play("mp4", "alone.mp4");
      audioPlayer.play("vlc", "far far away.vlc");
      audioPlayer.play("avi", "mind me.avi");
   }
}