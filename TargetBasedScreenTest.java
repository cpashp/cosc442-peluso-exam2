package ui;

import java.awt.Color;
import java.awt.Component;
import game.Effect;
import game.Creature;
import asciiPanel.AsciiPanel;
import game.Spell;
import game.World;
import java.awt.event.KeyEvent;
import game.Tile;
import game.AppletMain;
import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>TargetBasedScreenTest</code> contains tests for the class <code>{@link TargetBasedScreen}</code>.
 *
 * @generatedBy CodePro at 5/18/18 6:25 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class TargetBasedScreenTest {
	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testDisplayOutput_1()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testDisplayOutput_2()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testDisplayOutput_3()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testDisplayOutput_4()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testDisplayOutput_5()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void displayOutput(AsciiPanel) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testDisplayOutput_6()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		AsciiPanel terminal = new AsciiPanel();

		fixture.displayOutput(terminal);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void enterWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testEnterWorldCoordinate_1()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.enterWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4368b72e
	}

	/**
	 * Run the boolean isAcceptable(int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testIsAcceptable_1()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int x = 1;
		int y = 1;

		boolean result = fixture.isAcceptable(x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3c7311ae
		assertTrue(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_1()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_2()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_3()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_4()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_5()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_6()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_7()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_8()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_9()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_10()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_11()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@79ad4c08
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_12()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@3395383b
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_13()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4a0fde3f
		assertNotNull(result);
	}

	/**
	 * Run the Screen respondToUserInput(KeyEvent) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testRespondToUserInput_14()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		Creature creature = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		creature.y = 1;
		creature.x = 1;
		fixture.player = creature;
		KeyEvent key = new KeyEvent(new AppletMain(), 1, 1L, 1, 1);

		Screen result = fixture.respondToUserInput(key);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@4dccf9df
		assertNotNull(result);
	}

	/**
	 * Run the void selectWorldCoordinate(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Test
	public void testSelectWorldCoordinate_1()
		throws Exception {
		CastSpellScreen fixture = new CastSpellScreen(new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1), "", 1, 1, new Spell("", 1, new Effect(1)));
		fixture.caption = "";
		fixture.player = new Creature(new World(new Tile[][][] {}), '', new Color(1), "", 1, 1, 1);
		int x = 1;
		int y = 1;
		int screenX = 1;
		int screenY = 1;

		fixture.selectWorldCoordinate(x, y, screenX, screenY);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5be44827
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 5/18/18 6:25 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(TargetBasedScreenTest.class);
	}
}