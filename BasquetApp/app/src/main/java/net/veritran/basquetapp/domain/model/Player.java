package net.veritran.basquetapp.domain.model;

public class Player {

    private Double height;
    private Double triples;
    private Double smartLevel;
    private Double talentLevel;
    private Boolean isDirty;
    private Ability ability;

    public Player(Ability ability, Double height, Double triples, Double smartLevel, Double talentLevel, boolean isDirty) {
        this.ability = ability;
        this.height = height;
        this.triples = triples;
        this.smartLevel = smartLevel;
        this.talentLevel = talentLevel;
        this.isDirty = isDirty;
    }

    public Double computeAbility() {
        return ability.computeAbility(this);
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getTriples() {
        return triples;
    }

    public void setTriples(Double triples) {
        this.triples = triples;
    }

    public Double getSmartLevel() {
        return smartLevel;
    }

    public void setSmartLevel(Double smartLevel) {
        this.smartLevel = smartLevel;
    }

    public Double getTalentLevel() {
        return talentLevel;
    }

    public void setTalentLevel(Double talentLevel) {
        this.talentLevel = talentLevel;
    }

    public Boolean getDirty() {
        return isDirty;
    }

    public void setDirty(Boolean dirty) {
        isDirty = dirty;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }
}
