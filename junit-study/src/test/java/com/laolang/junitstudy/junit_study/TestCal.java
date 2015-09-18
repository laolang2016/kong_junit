package com.laolang.junitstudy.junit_study;

//使用静态导入，将Assert中的所有static方法导入类中，可以兼容junit3
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class TestCal.
 */
public class TestCal {

	/** The cal. */
	Cal cal = null;

	/**
	 * 挂靠 任意一个方法之前都会调用这个方法.
	 */
	@Before
	public void setUp() {
		cal = new Cal();
	}

	/**
	 * Test add.
	 */
	@Test
	public void testAdd() {
		System.out.println("测试加法");
		int rel = cal.add(2, 4);
		/**
		 * 一个简单的测试 <br />
		 * 第一个参数：出错时的提示信息 <br />
		 * 第二个参数：方法执行之后预期的值 <br />
		 * 第三个参数：实际的值
		 */
		assertEquals("加法有问题", rel, 6);
	}

	/**
	 * Test minus.
	 */
	public void testMinus() {
		int rel = cal.minus(1, 3);
		assertEquals("减法有问题", rel, -2);
	}

	/**
	 * Test mul.
	 */
	public void testMul() {
		int rel = cal.mul(3, 4);
		assertEquals("乘法有问题", rel, 12);
	}

	/**
	 * Test divided.
	 */
	public void testDivided() {
		int rel = cal.divided(8, 2);
		assertEquals("除法有问题", rel, 4);
	}
}
