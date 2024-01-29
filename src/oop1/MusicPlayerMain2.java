package oop1;

import oop1.MusicPlayerData;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
        data.volume++;
        System.out.println("음악플레이어 볼륨 업:" + data.volume);
        data.volume--;
        System.out.println("음악플레이어 볼륨 다운:" + data.volume);

        System.out.println("음악플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악볼륨 On " + data.isOn);
        } else {
            System.out.println("음악볼륨 Off");
        }

        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");

    }
}
