package com.yellow.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @ClassName: CalculatorTest.java
 * @Description: TODO
 * @author FrankWong
 * @version V1.0
 * @Date 2013-5-19 上午9:57:06 注意事项如下：
 * @Test标注，以表明这是一个测试方法。
 * @Ignore标注，某些方法尚未完成，暂不参与此次测试 
 *                             对于方法的声明也有如下要求：名字可以随便取，没有任何限制，但是返回值必须为void，而且不能有任何参数
 */
public class CalculatorTest {

	private static Calculator calculator;

	/**
	 * @Description: 开始单元测试前执行，只会运行一次，比如进行文件操作前进行打开一个大文件并读入文件内容
	 * @param: @throws java.lang.Exception
	 * @return: void
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		calculator = new Calculator();// 类初始化
	}

	/**
	 * @Description: 结束单元测试后执行，只会运行一次，比如进行文件操作结束之后关闭IO
	 * @param: @throws java.lang.Exception
	 * @return: void
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		calculator = null;// 类释放
	}

	/**
	 * @Description: 在任何一个测试执行之前必须执行的代码
	 * @param: @throws java.lang.Exception
	 * @return: void
	 */
	@Before
	public void setUp() throws Exception {
		testClear();
	}

	/**
	 * @Description: 在任何一个测试执行之后必须执行的代码
	 * @param: @throws java.lang.Exception
	 * @return: void
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.yellow.junit.Calculator#add(int)}.
	 */
	@Test
	public final void testAdd() {
		calculator.add(1);
		calculator.add(6);
		assertEquals(7, calculator.getResult());
	}

	/**
	 * Test method for {@link com.yellow.junit.Calculator#substract(int)}.
	 */
	@Test
	public final void testSubstract() {
		calculator.add(10);
		calculator.substract(2);
		assertEquals(8, calculator.getResult());
	}

	/**
	 * Test method for {@link com.yellow.junit.Calculator#multiply(int)}.
	 */
	@Ignore("Multiply() Not yet implemented")
	@Test
	public final void testMultiply() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link com.yellow.junit.Calculator#divide(int)}.
	 */
	@Test
	public final void testDivide() {
		calculator.add(8);
		calculator.divide(2);
		assertEquals(4, calculator.getResult());
	}

	@Test(expected = ArithmeticException.class)
	public void divideByZero() {
		calculator.divide(0);
	}

	/**
	 * Test method for {@link com.yellow.junit.Calculator#square(int)}.
	 */
	@Test
	public final void testSquare() {
		calculator.square(4);
		assertEquals(16, calculator.getResult());
	}

	/**
	 * Test method for {@link com.yellow.junit.Calculator#squareRoot(int)}.
	 */
	@Ignore("SquareRoot() Not yet implemented")
	// 此方法忽略测试
	@Test(timeout = 1000)
	// 设定一个执行时间，超过了这个时间，他们就会被系统强行终止，并且系统还会向你汇报该函数结束的原因是因为超时
	public final void testSquareRoot() {
		calculator.squareRoot(4);
		assertEquals(2, calculator.getResult());
	}

	/**
	 * Test method for {@link com.yellow.junit.Calculator#clear()}.
	 */
	@Test
	public final void testClear() {
		calculator.clear();
	}

	/**
	 * Test method for {@link com.yellow.junit.Calculator#getResult()}.
	 */
	@Test
	public final void testGetResult() {
		calculator.getResult();
	}

}
