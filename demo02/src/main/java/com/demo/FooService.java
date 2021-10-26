package com.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class FooService {

	private static Logger logger = LogManager.getLogger(FooService.class);

		    public static void main(String[] args)
		    {
		        logger.info("This is info");
		        logger.warn("This is Warning");
		    }
		}
