package com.rmg.ProjectTest;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SampleProjectTest {
	
	@Test
	public void getAllProjectTest() 
	{
		Response resp = RestAssured.get("http://localhost:8084/projects");
		System.out.println(resp);
		resp.prettyPrint();
		resp.then().log().all();
	}
	
	

}
