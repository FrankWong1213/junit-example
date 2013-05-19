package com.yellow.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @ClassName: AllCalculatorTests.java
 * @Description: TODO
 * @author FrankWong
 * @version V1.0
 * @Date 2013-5-19 上午10:33:18
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ CalculatorTest.class, SquareTest.class })
public class AllCalculatorTests {

}
