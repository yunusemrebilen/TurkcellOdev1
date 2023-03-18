package org.example;

public class Sale {
    private Player player;
    private Game game;
    private Campaign campaign;

    public Sale() {
    }

    public Sale(Player player, Game game) {
        this.player = player;
        this.game = game;
    }

    public Sale(Campaign campaign) {
        this.campaign = campaign;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void sell(Player player, Game game) {
        System.out.println("-------------");
        System.out.println(player.getFirstName() + " oyuncusu "
                + game.getName() + " oyununu "
                + game.getPrice() + "  satın aldı." );
        System.out.println("-------------");
    }

    public void sell(Campaign campaign) {
        System.out.println("-------------");
        System.out.println(campaign.getUser().getFirstName() + " oyuncusu "
                + getCampaign().getGame().getName() + " oyununu "
                + getCampaign().getGame().getPriceAfterDiscount() + " indirimli  satın aldı.");
        System.out.println("-------------");
    }



}