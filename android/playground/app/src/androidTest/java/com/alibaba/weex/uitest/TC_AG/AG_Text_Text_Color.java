package com.alibaba.weex.uitest.TC_AG;
import com.alibaba.weex.WXPageActivity;
import com.alibaba.weex.util.TestFlow;
import java.util.HashMap;
import org.junit.Before;
import org.junit.Test;

public class AG_Text_Text_Color extends TestFlow {
	public AG_Text_Text_Color() {
		super(WXPageActivity.class);
	}

	@Before
	public void setUp() throws InterruptedException {
		super.setUp();
		HashMap testMap = new <String, Object> HashMap();
		testMap.put("testComponet", "AG_Text");
		testMap.put("testChildCaseInit", "AG_Text_Text_Color");
		testMap.put("step1",new HashMap(){
			{
				put("click", "#FF0000");
				put("screenshot", "AG_Text_Text_Color_01_#FF0000");
			}
		});
		testMap.put("step2",new HashMap(){
			{
				put("click", "#FF00FF");
				put("screenshot", "AG_Text_Text_Color_02_#FF00FF");
			}
		});
		super.setTestMap(testMap);
	}

	@Test
	public void doTest(){
		super.testByTestMap();
	}

}
