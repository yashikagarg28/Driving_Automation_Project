import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
 class Test2_GET
{
	@Test
	void test_2()
	{
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
		.body("data.email[0]", is("michael.lawson@reqres.in")).
		log().all();
	}
}