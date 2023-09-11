package sfsdfsf;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Headers;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class fgdfgdfg {
		
	@Test
	public void ewwerdsf() {
		RestAssured.baseURI = "https://bookstore.toolsqa.com/";
		RequestSpecification httprequest = RestAssured.given();
		Response response = httprequest.get("/BookStore/v1/Books");
		int statuscode =  response.getStatusCode(); 
		response.prettyPrint();
		Headers headers = response.getHeaders();
		System.out.println(headers.asList().size());
		System.out.println(headers);
		
		
	}
}
