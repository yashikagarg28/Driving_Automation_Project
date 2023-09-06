package com.qa.testrailmanager;

import com.gurock.testrail.APIClient;
import com.gurock.testrail.APIException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.*;
public class TestRailManager {
//Here we will integrate Testng, selenium with TestRail
	public static String TEST_RUN_ID ="1";
	public static String TEST_RAIL_USERNAME ="yashika.garg@netsmartz.net";
	public static String TEST_RAIL_PASSWORD = "Yashu@28";
	
	public static String TEST_RAIL_ENGINE_URL ="https://danubenet.testrail.io/";
	//static properties for status of testcase
	public static int TEST_CASE_PASS_STATUS = 1;
	public static int TEST_CASE_FAIL_STATUS = 5;
	
	public static void addResultsforTestCase(String TestcaseId, int status, String error)
	{
		//authenticating API credentials ..
		String testRunID = TEST_RUN_ID;
		APIClient client = new APIClient(TEST_RAIL_ENGINE_URL);
		client.setUser(TEST_RAIL_USERNAME);
		client.setPassword(TEST_RAIL_PASSWORD);
		
		Map<String, Object> data = new HashMap<String, Object>();
		data.put("status_id",status);
		data.put("comment","This test is executed via Test Automation" +error);
		
		try {
			client.sendPost("add_result_for_case/"+testRunID+"/"+TestcaseId, data);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (APIException e) {
			e.printStackTrace();
		}
	}
}
