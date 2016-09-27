package com.axatrikx.test;

import org.junit.BeforeClass;
import org.junit.Test;

import com.axatrikx.controller.RestExecutor;

public class TestScript {

	private static final String URL = "http://172.23.61.13:8080";

	private static RestExecutor executor;

	@BeforeClass
	public static void setUp() {
		/*
		 * Initialize RestExecutor object using the end point URL
		 */
		executor = new RestExecutor(URL);
	}

	@Test
	public void testGETMethod() {
		/*
		 * Performs GET operation on http://localhost:3000/posts.
		 * Note that we give only the path in the get method as we use
		 * the domain part while initializing the RestExecutor object
		 */
		executor.get("/ideas")
			.expectCode(200)			// Expected code of 200
			.expectMessage("OK")		// Expected Message of 'OK'
			.expectHeader("Content-Type", "application/json;charset=UTF-8") // Content-Type header value
			.expectInBody("Add auth for this project");	// Content inside the response body
//			.expectInBody("webdriver framework") 	// Another Content inside the response body
//			.expectInBody("axatrikx");				// Yet Another Content inside the response body
		
		/*
		 * GET for a specific item
		 */
//		executor.get("/posts/1")
//			.expectCode(200)
//			.expectMessage("OK")
//			.expectHeader("Content-Type", "application/json; charset=utf-8")
//			.expectInBody("rest testing framework")
//			.expectInBody("axatrikx");

		/*
		 * GET for a seach query
		 */
//		executor.get("/posts?title=rest%20testing%20framework&author=axatrikx")
//			.expectCode(200)
//			.expectMessage("OK")
//			.expectHeader("Content-Type", "application/json; charset=utf-8")
//			.expectInBody("rest testing framework")
//			.expectInBody("axatrikx");
	}



//	@Test
//	public void testPOSTMethod() {
//		/*
//		 * POST operation for insertion providing the path, xml content and content type.
//		 */
//		executor.post("/ideas", "{ \"title\": \"new test\", \"author\": \"axatrikx\" }", "application/json")
//			.expectCode(200)
//			.expectMessage("Created")
//			.expectHeader("Content-Type", "application/json;charset=UTF-8")
//			.expectInBody("\"title\": \"new test\"")
//			.expectInBody("Greetings from Idea Box!");
//	}
}
