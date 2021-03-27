import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {

    private static Cat cat;

    @BeforeAll
    public static void setUp() {
        cat = new Cat("GoodBoy");
    }

    @Test
    public void shouldGreeting() {

        String greeting = cat.greeting();
        assertEquals("Miau mIAU", greeting);
    }

    @Test
    public void shouldSayName() {

        String name = cat.sayName();
        assertEquals("Miau mIAU, my name is GoodBoy", name);
    }

    @Test
    public void shouldGetBreed() {

        String breed = cat.getBreed();
        assertEquals("This animal is a Cat", breed);
    }

    @Test
    public void shouldRoll(){
        boolean roll = cat.roll();
        assertFalse(roll);
    }

    @Test
    public void shouldLoveMyMaster(){
        String masterLove = cat.sayLoveYourMaster("Cristian");
        assertEquals("I love my master Cristian, but I don't like it when he touches me", masterLove);
    }

    @Test
    public void shouldEat(){
        boolean eat = cat.eat();
        assertTrue(eat);
    }

}
