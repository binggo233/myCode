package com.test.test;

import java.io.File;
import java.util.Hashtable;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

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
	
	@SuppressWarnings({ "unused", "rawtypes" })
	@Test
	public void testRedis(){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("classpath*:spring-context.xml");
		RedisTemplate redisTemplate = (RedisTemplate)ac.getBean("redisTemplate");
		JedisConnectionFactory cf=(JedisConnectionFactory) ac.getBean("connectionFactory");
		RedisConnection c=cf.getConnection();
		c.append((2+"").getBytes(), "binggo".getBytes());
		System.out.println("--------------------");
		//redisTemplate.
	}
	
}