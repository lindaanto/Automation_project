package testpkg;

import org.testng.annotations.Test;

import basepkg.Basecls;
import pagepkg.Pagecls;
import utilspkg.Excelcls;

public class Testcls extends Basecls {
	@Test
	public void verifyLoginWithValidCred()throws Exception
	{
		Pagecls p1=new Pagecls(driver);
		p1.smileyclick();
        p1.signupclick();
        p1.loginclick();
        
        
     // Reading the data from excel file by the specified path

        String xl = "C:\\Users\\PRINCE\\Documents\\benefits.xlsx";

        String Sheet = "Sheet1";

        int rowCount = Excelcls.getRowCount(xl, Sheet);

        for (int i=1;i<=rowCount;i++)

        {
 
                    String UserName=Excelcls.getCellValue(xl, Sheet, i, 0);
                    System.out.println("username---"+UserName);
                    String Pwd=Excelcls.getCellValue(xl, Sheet, i, 1);
                    System.out.println("password---"+Pwd);
                    //Passing Username and password as parameters
                    p1.setvalues(UserName, Pwd);
                    //Submitting the data by clicking on login button                   
                     p1.signinclick();
                    
              
                    String expectedurl="https://www.benefitcosmetics.com/en-us";
      			    String actualurl= driver.getCurrentUrl();
      			  
      			     if(actualurl.equals(expectedurl))
      			     {
      			    	
      			    	System.out.println("pass");
      			    	
      			     }
      			     else
      			     {
      			    	
      			    	p1.emailclearclick();
      			    	p1.pswdclearclick();
      			    	
      			    	
      			     }
        }
            p1.signout();
            p1.searching();    
            p1.headings();
            p1.filter();
            p1.sorting();
            p1.cart();
            p1.task();
            p1.backtohome();
            
        } 
        
        
       	}
        

	

