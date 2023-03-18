package org.example;

public class Main {
    public static void main(String[] args) {

        Game game1 = new Game(1,"Cs",190);
        Game game2 = new Game(2,"Dota",140);
        Game game3 = new Game(3,"Fifa",1110);


        Player player1 = new Player(1,"Yunus Emre","Bilen","yunusemre@gmail.com",
                "asdvgg","11111111","17/04/1997");
        Player player2 = new Player(2,"Mehmet", "Yılmaz","mehmetyılm@gmail.com",
                "sdfgfmnng", "22222222","12/03/1992");


        PlayerManager manager1 = new PlayerManager();
        manager1.addPlayer(player1);
        manager1.deletePlayer(player1);
        manager1.addPlayer(player2);
        manager1.updatePlayer(player2);
        manager1.addPlayer(player1);





        Campaign campaign1 = new Campaign(1, player1,game2,20);
        Campaign campaign2 = new Campaign(2, player2,game3,40);


        Sale sale1 = new Sale();
        Sale sale2 = new Sale(campaign1);
        Sale sale3 = new Sale(campaign2);
        sale1.sell(player1,game1);
        sale2.sell(campaign1);
        sale3.sell(campaign2);




    }
}