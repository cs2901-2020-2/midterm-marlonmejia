
import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
@Test
public class HomeTheaterFacadetest {

    @Test
    public void test() throws Exception {
        HomeTheaterFacade newmovie= new HomeTheaterFacade();
        newmovie.PlayMovie("GOT");
        newmovie.EndMovie();
        assertEquals(Boolean.FALSE,newmovie.lights.get());

    }
}
