package com.stylefeng.guns.rest.changan.request;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.XmlFriendlyNameCoder;

public class XMLUtil {
	private static String XML_TAG = "<?xml version='1.0' encoding='GBK'?>";
	/***
	 * xml转为map集合*
	 * 
	 * @param request
	 * @return
	 * @throws IOException
	 * @throws DocumentException
	 */
	@SuppressWarnings("unchecked")
	public static Map<String, String> xmlToMap(HttpServletRequest request) throws IOException, DocumentException {

		// System.out.println("进xmlToMap");

		Map<String, String> map = new HashMap<String, String>();

		// dom4j saxReader解析xml
		SAXReader reader = new SAXReader();

		// 从request中获取输入流
		InputStream ins = request.getInputStream();

		// 解析xml文档
		Document doc = reader.read(ins);

		// 获得根节点
		Element root = doc.getRootElement();

		// List存储 遍历
		List<Element> list = root.elements();

		for (Element e : list) {
			map.put(e.getName(), e.getText());
		}
		ins.close();
		return map;
	}

	// xtream jar包 -> XStrem类提供对象转xml
	public static String messageToXml(Object message) {
		/**
		 * new StaxDriver()这个很重要 没有这个就错了 XStream xstream=new XStream(new StaxDriver());
		 *  忽略
		    @XStreamOmitField
		 */
		String ENCODING = "UTF-8";
		XmlFriendlyNameCoder nameCoder = new XmlFriendlyNameCoder("-_", "_");
		XStream xstream = new XStream(new DomDriver(ENCODING, nameCoder));
		xstream.autodetectAnnotations(true);
		// 剔除所有tab、制表符、换行符.replaceAll("\\s+", " ")
		return XML_TAG+"\n"+xstream.toXML(message);
	}
}
