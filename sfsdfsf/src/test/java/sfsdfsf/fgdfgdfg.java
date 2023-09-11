package sfsdfsf;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class fgdfgdfg {
		
	@Test
	public void ewwerdsf() {
		RestAssured.baseURI = "https://bookstore.toolsqa.com/";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.get("/BookStore/v1/Books");
		System.out.println(response.asPrettyString());
		
	}
}
