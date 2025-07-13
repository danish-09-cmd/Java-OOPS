package inheritance;

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Taking a photo with the smartphone camera.");
    }

    public void playMusic() {
        System.out.println("Playing music on the smartphone.");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.takePhoto();
        sp.playMusic();
    }
}
