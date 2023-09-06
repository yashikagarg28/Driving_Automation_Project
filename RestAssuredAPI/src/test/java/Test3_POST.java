import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
//import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONObject;
public class Test3_POST{
	
	@Test
	void test_3()
	{
	//Map<String,Object> map = new HashMap<String, Object>();
	//map.put("name", "Yashika");
   // map.put("job", "Software Tester");
    //System.out.println(map);
    
    JSONObject request = new JSONObject();
    request.put("name", "Yashika");
    request.put("job" , "software tester");
    
    System.out.println(request);
    
    given().header("Content-type", "application/JSON").
    body(request.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);
	}
}