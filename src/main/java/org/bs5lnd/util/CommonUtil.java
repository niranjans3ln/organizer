package org.bs5lnd.util;

import java.util.Random;

public class CommonUtil {
	private static CommonUtil instance;
	
	private CommonUtil(){
		super();
    }

    public static CommonUtil getInstance(){
      if (instance == null)
          instance = new CommonUtil();
      return instance;
    }

	public String randomNo() {
		int min = 11111;
		int max = 99999;
	    // Usually this should be a field rather than a method variable so
	    // that it is not re-seeded every call.
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return Integer.toString(randomNum);
	}
}
