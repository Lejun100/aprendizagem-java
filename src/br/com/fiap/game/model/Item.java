package br.com.fiap.game.model;

public class Item {

        private String nameIten;
        private String descriptionIten;
        private boolean rare;
        private int level;

        public Item(String nameIten, String descriptionIten,boolean rare, int level ){
            this.nameIten = nameIten;
            this.descriptionIten = descriptionIten;
            this.rare = rare;
            this.level = level;
        }

    public String getNameIten() {
        return nameIten;
    }

    public void setNameIten(String nameIten) {
        this.nameIten = nameIten;
    }

    public String getDescriptionIten() {
        return descriptionIten;
    }

    public void setDescriptionIten(String descriptionIten) {
        this.descriptionIten = descriptionIten;
    }

    public boolean isRare() {
        return rare;
    }

    public void setRare(boolean rare) {
        this.rare = rare;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
