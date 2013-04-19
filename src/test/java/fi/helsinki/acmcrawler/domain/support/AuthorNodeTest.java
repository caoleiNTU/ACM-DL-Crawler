package fi.helsinki.acmcrawler.domain.support;

import fi.helsinki.acmcrawler.storage.support.CollaborationSQLiteDB;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author rodionefremov
 */
public class AuthorNodeTest {

    private static AuthorNode root;
    private static final String DB_FILE = ":memory:";

    @BeforeClass
    public static void setUpClass() {
        root = new AuthorNode("81100552573");

        try {
            root.setDb(new CollaborationSQLiteDB(DB_FILE));
        } catch(Exception e) {
            System.err.println("Could not open DB at file " + DB_FILE);
            fail("DB did not open.");
        }
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of iterator method, of class AuthorNode.
     */
    //@Test
    public void testIterator() {
        System.out.println("iterator():");
        int neighbors = 0;

        for (AuthorNode u : root) {
            System.out.println(u);
            neighbors++;
        }

        assertTrue(neighbors > 0);
    }
}
