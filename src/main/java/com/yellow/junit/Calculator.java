package com.yellow.junit;

/**
 * @ClassName: Calculator.java
 * @Description: 计算器
 * @author FrankWong
 * @version V1.0
 * @Date 2013-5-19 上午9:45:06
 */
public class Calculator {

	private static int result; // Static variable where the result is stored

	/** 
	 * @Description:  加法
	 * @param:        @param n    
	 * @return:       void    
	 */
	public void add(int n) {
		result = result + n;
	}

	/** 
	 * @Description:  减法
	 * @param:        @param  n   
	 * @return:       void    
	 */
	public void substract(int n) {
		result = result - n; // Bug : should be result = result - n
	}

	/** 
	 * @Description:  乘法
	 * @param:        @param n    
	 * @return:       void    
	 */
	public void multiply(int n) {
	} // Not implemented yet

	/** 
	 * @Description:  除法
	 * @param:        @param n    
	 * @return:       void    
	 */
	public void divide(int n) {
		result = result / n;
	}

	/** 
	 * @Description:  平方
	 * @param:        @param n    
	 * @return:       void    
	 */
	public void square(int n) {
		result = n * n;
	}

	/** 
	 * @Description:  平方根
	 * @param:        @param n    
	 * @return:       void    
	 */
	public void squareRoot(int n) {
		for (;;)
			; // Bug : loops indefinitely
	}

	/** 
	 * @Description:  复位操作
	 * @param:            
	 * @return:       void    
	 */
	public void clear() { // Cleans the result
		result = 0;
	}

	/** 
	 * @Description:  获取结果
	 * @param:        @return    
	 * @return:       int    
	 */
	public int getResult() {
		return result;
	}
}
