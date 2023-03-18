package org.example;

public class PlayerManager {
    private int subCount = 0;
    public void addPlayer(Player player) {
        System.out.println(player.getFirstName() + " oyuncusu sisteme eklendi.");
        subCount++;
        System.out.println("Kayıtlı oyuncu sayısı: " + subCount);
        System.out.println("-------------");
    }
    public void deletePlayer(Player player) {
        System.out.println(player.getFirstName() + " oyuncusu sistemden silindi.");
        subCount--;
        System.out.println("Kayıtlı oyuncu sayısı: " + subCount);
        System.out.println("-------------");
    }
    public void updatePlayer(Player player) {
        System.out.println(player.getFirstName() + " oyuncusunun bilgileri güncellendi.");
        System.out.println("-------------");
    }
}
