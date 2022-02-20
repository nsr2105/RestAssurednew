package restAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Welcome {

	@Test
	public void testmew() {

		String s1 = "Selva";
		String s2 = s1.concat("raj").concat("Narayanasamy");
		System.out.println(s2);

	}

}
