package com.afkghouri;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public class myMain {

	@WebMethod
	public String sayHello(String msg){
		return "Hello "+msg;
	}
	
	public static void main(String[] args){
		System.out.println("started");
		Endpoint.publish("http://localhost:8888/testWS", new myMain());
	}
}