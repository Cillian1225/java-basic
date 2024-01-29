package oop1;

public class MusicPlayerMain3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        on(data);
        System.out.println("Start the music player.");
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
        System.out.println("Turn off the music player.");

    }
    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("Turn on the music player");
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
        System.out.println("Turn off the music player");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("Volume up:" + data.volume);
    }

    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("Volume down:" + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        System.out.println("Check status of the music player");
        if(data.isOn){
            System.out.println("Music player's volume is :" + data.volume);
        }else{
            System.out.println("Music player's volume is off now");
        }

    }
}
