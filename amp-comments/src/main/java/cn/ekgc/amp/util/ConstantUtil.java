package cn.ekgc.amp.util;
/**
 * 常量工具类
 * @author Perryle
 * @since 2019-05-08
 */

import java.io.IOException;
import java.util.Properties;

public class ConstantUtil {
	private static Properties properties = new Properties();
	static {
		//加载properties文件
		try {
			properties.load(ConstantUtil.class.getClassLoader().getResourceAsStream("constant.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//起始页码
	public static final Integer PAGE_NUM = Integer.parseInt(properties.getProperty("pageNum"));
	//每页显示数量
	public static final Integer PAGE_SIZE = Integer.parseInt(properties.getProperty("pageSize"));
}
