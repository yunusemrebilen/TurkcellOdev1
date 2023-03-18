package org.example;

public class Campaign {
    private int id;
    private Player player;
    private Game game;
    private double discount;

    public Campaign() {
    }

    public Campaign(int id, Player player, Game game, double discount) {
        this.id = id;
        this.player = player;
        this.game = game;
        this.game.setPriceAfterDiscount(game.getPrice()*(100-discount)/100);
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Player getUser() {
        return player;
    }

    public void setUser(Player player) {
        this.player = player;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", user=" + player +
                ", game=" + game +
                ", discount=" + discount +
                '}';
    }
}
