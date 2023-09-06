import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test4_DELETE
{
	@Test
	void test_04()
	{
		when().delete("https://reqres.in/api/users/2").then().statusCode(204);
				
	}
}