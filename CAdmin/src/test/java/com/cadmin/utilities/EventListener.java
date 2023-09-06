package com.cadmin.utilities;


import org.testng.ITestContext;
import org.testng.ITestListener ;
import org.testng.ITestResult;



public class EventListener implements ITestListener{
	
	@Override		
	
    public void onFinish(ITestContext Result) {					
        // TODO Auto-generated method stub	
		System.out.println("On Finish method invoked");
		
        		
    }		

    @Override		
    public void onStart(ITestContext Result) {					
        // TODO Auto-generated method stub				
    	System.out.println("On Start method invoked"); 		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailure(ITestResult Result) {					
        // TODO Auto-generated method stub				
    	System.out.println("Name of test failed " +Result.getName());	
    	
    }		

    @Override	
    public void onTestSkipped(ITestResult Result) {					
        // TODO Auto-generated method stub				
    	System.out.println("Name of test skipped " +Result.getName());		
    }		

    @Override		
    public void onTestStart(ITestResult Result) {					
        // TODO Auto-generated method stub				
    	System.out.println("Name of test started " +Result.getName());			
    }		

    @Override		
    public void onTestSuccess(ITestResult Result) {					
        // TODO Auto-generated method stub	
    	
        System.out.println("Name of test executed successfully" +Result.getName());		
    }		
}
