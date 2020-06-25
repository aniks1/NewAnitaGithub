package com.cx.test;

import com.tcs.cx.servicepanel.api.CxTest;

public class FlikartBuyProduct extends CxTest {

	public FlikartBuyProduct() {
		super(TYPE.WEB);
	}

	@Override
	public void test() {	
		find().url().open("https://www.google.com");
		find().id("lst-ib").describe("").withError("").type("selenium");
		find().xpath("//*[@id=\"tsf\"]/div[2]/div[3]/center/input[1]").click();
	}

}
