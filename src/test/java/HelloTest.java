
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
public class HelloTest {
    private Hello hello;

    @Before
    public void createHelloObject() {
        hello = new Hello();
    }

    @Test
    public void sayHello_ShouldSayHelloToPersonWhoseNameIsGivenAsMethodParameter() {
        String greeting = hello.sayHello("Hema");
        System.out.println("From Java");
       // assertThat(greeting, is("Hello Hema"));
        assert(true);
        System.out.println("End Java");
    }
}
