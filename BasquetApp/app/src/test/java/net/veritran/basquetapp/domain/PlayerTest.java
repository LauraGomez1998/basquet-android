package net.veritran.basquetapp.domain;

import net.veritran.basquetapp.domain.model.Pasador;
import net.veritran.basquetapp.domain.model.Player;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlayerTest {

    @Test
    public void computeAbility() {
        Player player = new Player(new Pasador(), 180.0, 60.0, 30.0, 60.0, false);

        Double ability = player.computeAbility();

        Double expectedValue = 127.5;
        assertEquals(expectedValue, ability);
    }
}
