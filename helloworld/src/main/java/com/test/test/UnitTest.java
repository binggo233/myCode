package com.test.test;

import java.io.File;
import java.util.Hashtable;

import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import strman.Strman;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.test.util.MatrixToImageWriter;

public class UnitTest {
	/**
	 * @param args
	 * @throws Exception
	 */
	/*@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public static void main(String[] args) throws Exception {
		String text = "http://www.wehenzhuanye.com";
		int width = 300;
		int height = 300;
		// 二维码的图片格式
		String format = "gif";
		Hashtable hints = new Hashtable();
		// 内容所使用编码
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = new MultiFormatWriter().encode(text,
				BarcodeFormat.QR_CODE, width, height, hints);
		// 生成二维码
		File outputFile = new File("d:" + File.separator + "new.gif");
		MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
	}*/ 
	
	public static void main(String[] args) {
		//ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:spring-servlet.xml,spring-context.xml");
		//JedisConnectionFactory jedisConnectionFactory = (JedisConnectionFactory)ac.getBean("jedisConnectionFactory");
		//System.out.println("--------------------");
		String str=Strman.first("stre", 0);
		System.out.println(str);
	}
	
	@Test
	public void testStrman(){
		String str=Strman.first("stre", 0);
		System.out.println(str);
	}
	
}