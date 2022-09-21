package net.veritran.basquetapp.domain;

import org.junit.Test;

public class PlayerTest {

    @Test
    public void computeAbility() {
        Player player = new Player(180.0, 60.0, 30.0, 60.0, false);

        Double ability = player.computeAbility();

        assert (0.0 == ability);
    }
}
