package org.bs5lnd.webservice.endpoints;

public class TemperatureConverter {

	  public float celsiusToFarenheit ( float celsius )
	  {
	    return (celsius * 9 / 5) + 32;
	  }

	  public float farenheitToCelsius ( float farenheit )
	  {
	    return (farenheit - 32) * 5 / 9;
	  }
}
