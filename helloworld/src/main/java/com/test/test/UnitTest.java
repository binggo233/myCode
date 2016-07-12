package com.test.test;

import java.io.File;
import java.util.Hashtable;

import org.junit.Test;

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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Test
	public static void main(String[] args) throws Exception {
		String text = "http://www.wehenzhuanye.com";
		int width = 300;
		int height = 300;
		// ��ά���ͼƬ��ʽ
		String format = "gif";
		Hashtable hints = new Hashtable();
		// ������ʹ�ñ���
		hints.put(EncodeHintType.CHARACTER_SET, "utf-8");
		BitMatrix bitMatrix = new MultiFormatWriter().encode(text,
				BarcodeFormat.QR_CODE, width, height, hints);
		// ���ɶ�ά��
		File outputFile = new File("d:" + File.separator + "new.gif");
		MatrixToImageWriter.writeToFile(bitMatrix, format, outputFile);
	}
}