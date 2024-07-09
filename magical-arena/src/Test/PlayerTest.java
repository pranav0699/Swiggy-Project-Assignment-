package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.arena.model.Player;

public class PlayerTest {

	@Test
	public void testPlayerInitialization() {
		Player player = new Player("Player A", 100, 10, 20);
		assertEquals("Player A", player.getName());
		assertEquals(100, player.getHealth());
		assertEquals(10, player.getStrength());
		assertEquals(20, player.getAttack());
	}

	@Test
	public void testPlayerHealthReduction() {
		Player player = new Player("Player A", 100, 10, 20);
		player.setHealth(80);
		assertEquals(80, player.getHealth());
	}

	@Test
	public void testPlayerIsAlive() {
		Player player = new Player("Player A", 100, 10, 20);
		assertTrue(player.isAlive());
		player.setHealth(0);
		assertFalse(player.isAlive());
	}
}
