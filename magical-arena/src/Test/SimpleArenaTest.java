package Test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.arena.model.Player;
import com.arena.service.RandomDiceRoller;
import com.arena.service.SimpleArena;

public class SimpleArenaTest {

	@Test
	public void testStartMatch() {
		Player playerA = new Player("Player A", 50, 5, 10);
		Player playerB = new Player("Player B", 100, 10, 5);
		RandomDiceRoller diceRoller = new RandomDiceRoller();
		SimpleArena arena = new SimpleArena(diceRoller);

		arena.startMatch(playerA, playerB);

		assertTrue(playerA.getHealth() <= 0 || playerB.getHealth() <= 0);
	}

}
