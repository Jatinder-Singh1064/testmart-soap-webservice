package org.learning.java;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.learning.java.exception.InvalidInputException;

/*
 * Style.DOCUMENT is by-default.
 * It provides a separate XSD Schema for <types> element of the WebService WSDL.
 * 
 * @WebResult(partName = "lookupOutput") = to give meaningful name to output parameter.
 * @WebParam(partName = "lookupInput") = to give meaningful name to input argument.
 */


@WebService
@SOAPBinding(style = Style.RPC)	
public class ShopInfo {

	@WebMethod
	@WebResult(partName = "lookupOutput")
	public String getShopInfo(@WebParam(partName = "lookupInput") String property) throws InvalidInputException {
		//String response = "Invalid property";
		String response = null;
		if ("shopName".equals(property)) {
			response = "Test Mart";
		}
		else if("since".equals(property)) {
			response = "since 2012";
		}
		else {
			throw new InvalidInputException("Invalid Input", property + " is not a valid input");
		}
		return response;
	}
}
