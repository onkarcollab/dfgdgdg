package sfsdfsf;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class fgdfgdfg {
		
	@Test
	public void ewwerdsf() {
		RestAssured.baseURI = "";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.get();
		System.out.println(response.asPrettyString());
	}
}
