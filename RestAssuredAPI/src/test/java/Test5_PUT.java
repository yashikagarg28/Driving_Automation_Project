import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
public class Test5_PUT{
	
	@Test
	void test_05()
	{
		JSONObject request = new JSONObject();
		request.put("name", "Yashika");
		request.put("job", "Software Engineer");
		
		given().header("Content-type", "application/JSON").
	    body(request.toJSONString()).when().post("https://reqres.in/api/users/2").then().statusCode(201).log().all();
	}
}