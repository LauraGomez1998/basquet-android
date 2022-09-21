package net.veritran.basquetapp.domain;

public class Player {

    private Double height;
    private Double triples;
    private Double smartLevel;
    private Double talentLevel;
    private boolean isDirty;

    public Player(Double height, Double triples, Double smartLevel, Double talentLevel, boolean isDirty) {
        this.height = height;
        this.triples = triples;
        this.smartLevel = smartLevel;
        this.talentLevel = talentLevel;
        this.isDirty = isDirty;
    }

    public Double computeAbility() {
        return 0.0;
    }
}
