package class1;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class p2 {
	@Test
	public void CreateJsonObjectOfp1() throws JsonProcessingException {
		p1 obj = new p1();
		// without geteer &setter we cant acess private

		obj.setFirstName("shubham");
		obj.setLasttName("nilamwar");
		obj.setAge(27);
		obj.setGender("m");
		obj.setSalary(100000);

		// obj convert into json object (serialise) to string
		ObjectMapper objM = new ObjectMapper();
		String empjson = objM.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
		System.out.println(empjson);
		//if we want send as request body empjson to particular req we can do that
		
		RequestSpecification reqs =RestAssured.given();
		reqs.contentType("http://httpbin.org/post");
		reqs.body(ContentType.JSON);
		Response response = reqs.post();
		
		Assert.assertEquals(response.statusCode(), 200 ,"check status");
		//deserialisation
		p1 obj2=objM.readValue(empjson, p1.class);
		System.out.println(obj2.getFirstName());
		System.out.println(obj2.getLasttName());
		System.out.println(obj2.getAge());
		System.out.println(obj2.getGender());
		System.out.println(obj2.getSalary());
	}
}
