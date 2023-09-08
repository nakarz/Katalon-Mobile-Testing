package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object application_id
     
    /**
     * <p></p>
     */
    public static Object name
     
    /**
     * <p></p>
     */
    public static Object validEmail
     
    /**
     * <p></p>
     */
    public static Object invalidEmail
     
    /**
     * <p></p>
     */
    public static Object phoneNumber
     
    /**
     * <p></p>
     */
    public static Object address
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            application_id = selectedVariables['application_id']
            name = selectedVariables['name']
            validEmail = selectedVariables['validEmail']
            invalidEmail = selectedVariables['invalidEmail']
            phoneNumber = selectedVariables['phoneNumber']
            address = selectedVariables['address']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
