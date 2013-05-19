package com.yellow.junit;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * @ClassName: SquareTest.java
 * @Description: 参数化测试
 * @author FrankWong
 * @version V1.0
 * @Date 2013-5-19 上午10:25:37
 */
@RunWith(Parameterized.class)//为这个类指定了一个ParameterizedRunner
public class SquareTest {

	private static Calculator calculator = new Calculator();
	private int param;//参数
	private int result;//结果

	@Parameters
    public   static  List<Object[]> Collectiondata()  {
        return  Arrays.asList( new  Object[][] {
                { 2 ,  4 } ,
                { 0 ,  0 } ,
                {-3 ,  9 } ,
       } );

   }	// 构造函数，对变量进行初始化

	public SquareTest(int param, int result) {
		this.param = param;
		this.result = result;
	}

	@Test
	public void square() {
		calculator.square(param);
		assertEquals(result, calculator.getResult());
	}

}
