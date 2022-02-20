package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class getCallBDDFramework {

	@Test
	public void test_noofcircuits() {

		String endpoint = "http://ergast.com/api/f1/drivers.json";
		
		Response resp = get(endpoint);
		
		//TEsting
		
		
		int statuscode = resp.statusCode();
		
		System.out.println(statuscode);

//		given().when().get(endpoint).then().log().body().assertThat().statusCode(200).and()
//				.body("MRData.DriverTable.Drivers.driverId[0]", equalTo("abate"));

	}

}
