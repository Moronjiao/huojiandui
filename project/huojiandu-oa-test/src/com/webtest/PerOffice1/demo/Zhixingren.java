package com.webtest.PerOffice1.demo;

import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Zhixingren extends BaseTest{
	Action action =null;
	@BeforeClass
	public void startUp() {
		System.out.println("setup");
		this.action=new Action(webtest);
	}
	@Test//22
	public void zhixingren() throws IOException {
		action.login("admin","123456");
	    action.zhixingren("yuangong1", "123456");
	    assertTrue(webtest.ifContains("����"));
	}

}
