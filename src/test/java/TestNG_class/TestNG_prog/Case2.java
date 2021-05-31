package TestNG_class.TestNG_prog;

import static io.restassured.RestAssured.given;

import java.io.FileInputStream;
import java.io.IOException;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.internal.util.IOUtils;
public class Case2 {
	
	@Test 
	public void soapexample() throws IOException {
		RestAssured.baseURI = "http://www.dneonline.com";

		FileInputStream fis = new FileInputStream(".\\Payload\\SOAPRequest.xml");

		given()
			.headers("content-type","text/xml")
			.body(IOUtils.toString(fis, "UTF-8")).
		when()
			.post("/calculator.asmx").
		then()
			.log().all();
	}



}
