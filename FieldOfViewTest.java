package game;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * The class <code>FieldOfViewTest</code> contains tests for the class <code>{@link FieldOfView}</code>.
 *
 * @generatedBy CodePro at 5/18/18 6:20 PM
 * @author Collin
 * @version $Revision: 1.0 $
 */
public class FieldOfViewTest {
	/**
	 * Run the FieldOfView(World) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testFieldOfView_1()
		throws Exception {
		World world = new World(new Tile[][][] {});

		FieldOfView result = new FieldOfView(world);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the FieldOfView(World) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testFieldOfView_2()
		throws Exception {
		World world = new World(new Tile[][][] {});

		FieldOfView result = new FieldOfView(world);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the FieldOfView(World) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testFieldOfView_3()
		throws Exception {
		World world = new World(new Tile[][][] {});

		FieldOfView result = new FieldOfView(world);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the FieldOfView(World) constructor test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testFieldOfView_4()
		throws Exception {
		World world = new World(new Tile[][][] {});

		FieldOfView result = new FieldOfView(world);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testIsVisible_1()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testIsVisible_2()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testIsVisible_3()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = -1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testIsVisible_4()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = -1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testIsVisible_5()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testIsVisible_6()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the boolean isVisible(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testIsVisible_7()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		boolean result = fixture.isVisible(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertTrue(result);
	}

	/**
	 * Run the Tile tile(int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testTile_1()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int x = 1;
		int y = 1;
		int z = 1;

		Tile result = fixture.tile(x, y, z);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
		assertNotNull(result);
	}

	/**
	 * Run the void update(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdate_1()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;

		fixture.update(wx, wy, wz, r);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void updateForOne(int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateForOne_1()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int x = 1;
		int wy = 1;
		int r = 1;
		int wz = 1;

		fixture.updateForOne(wx, x, wy, r, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@253a1776
	}

	/**
	 * Run the void updateForOne(int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateForOne_2()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int x = 1;
		int wy = 1;
		int r = 1;
		int wz = 1;

		fixture.updateForOne(wx, x, wy, r, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@2c7f583c
	}

	/**
	 * Run the void updateForOne(int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateForOne_3()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int x = 1;
		int wy = 1;
		int r = 1;
		int wz = 1;

		fixture.updateForOne(wx, x, wy, r, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6bf49621
	}

	/**
	 * Run the void updateForOne(int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateForOne_4()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int x = 1;
		int wy = 1;
		int r = 1;
		int wz = 1;

		fixture.updateForOne(wx, x, wy, r, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6356fad5
	}

	/**
	 * Run the void updateForOne(int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateForOne_5()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int x = 1;
		int wy = 1;
		int r = 1;
		int wz = 1;

		fixture.updateForOne(wx, x, wy, r, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@c612778
	}

	/**
	 * Run the void updateForOne(int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateForOne_6()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int x = 1;
		int wy = 1;
		int r = 1;
		int wz = 1;

		fixture.updateForOne(wx, x, wy, r, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@6d8ea12c
	}

	/**
	 * Run the void updateForOne(int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateForOne_7()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int x = 1;
		int wy = 1;
		int r = 1;
		int wz = 1;

		fixture.updateForOne(wx, x, wy, r, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5c28243d
	}

	/**
	 * Run the void updateForTwo(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateForTwo_1()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int r = 1;
		int wz = 1;

		fixture.updateForTwo(wx, wy, r, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@5d924451
	}

	/**
	 * Run the void updateForTwo(int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateForTwo_2()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int r = 1;
		int wz = 1;

		fixture.updateForTwo(wx, wy, r, wz);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: java.lang.ClassCastException@53431083
	}

	/**
	 * Run the void updateLoop(int,int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateLoop_1()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;
		int x = 1;
		int y = 1;

		fixture.updateLoop(wx, wy, wz, r, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void updateLoop(int,int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateLoop_2()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;
		int x = 1;
		int y = 1;

		fixture.updateLoop(wx, wy, wz, r, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Run the void updateLoop(int,int,int,int,int,int) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	@Test
	public void testUpdateLoop_3()
		throws Exception {
		FieldOfView fixture = new FieldOfView(new World(new Tile[][][] {}));
		fixture.update(1, 1, 1, 1);
		int wx = 1;
		int wy = 1;
		int wz = 1;
		int r = 1;
		int x = 1;
		int y = 1;

		fixture.updateLoop(wx, wy, wz, r, x, y);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.IllegalArgumentException: argument type mismatch
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 5/18/18 6:20 PM
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
	 * @generatedBy CodePro at 5/18/18 6:20 PM
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
	 * @generatedBy CodePro at 5/18/18 6:20 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(FieldOfViewTest.class);
	}
}