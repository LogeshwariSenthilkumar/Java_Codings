class MultimediaPlayer{
    interface Player{
        void play();
        void pause();
    }
    void players(Player play){
        play.play();
        play.pause();

    }
}
class AudioPlayer implements MultimediaPlayer.Player{
    public void play(){
        System.out.println("Audio Player is Playing...");
    }
    public void pause(){
        System.out.println("Audio Player is Paused...");
    }
}
class VideoPlayer implements MultimediaPlayer.Player{
    public void play(){
          System.out.println("Video Player is Playing...");
    }
    public void pause(){
        System.out.println("Video Player is paused...");
    }
}
class Main{
    public static void main(String[] args){
        MultimediaPlayer m1=new MultimediaPlayer();
        AudioPlayer a1=new AudioPlayer();
        m1.players(a1);
        System.out.println();
        VideoPlayer v1=new VideoPlayer();
        m1.players(v1);
    }
}