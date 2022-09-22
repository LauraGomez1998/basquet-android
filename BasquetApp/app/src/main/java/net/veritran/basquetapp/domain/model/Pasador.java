package net.veritran.basquetapp.domain.model;

public class Pasador implements Ability {

    @Override
    public Double computeAbility(Player player) {
        // pasador: ( eficacia de triple * 2 + ( nivel de inteligencia + talento ) / 2 + altura / 2 ) / 2
        return (player.getTriples() * 2 + (player.getSmartLevel() + player.getTalentLevel()) / 2 + player.getHeight() / 2) / 2;
    }
}
