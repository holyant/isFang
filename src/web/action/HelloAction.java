package web.action;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class HelloAction extends ActionSupport {
	// 负责管理FreeMarker模板的Configuration实例
	private Configuration cfg = null;
	public void hello() throws IOException{
		// 创建一个FreeMarker实例
		cfg = new Configuration();
		// 指定FreeMarker模板文件的位置
		cfg.setServletContextForTemplateLoading(ActionContext.getContext(),
				"/WEB-INF/templates");
		// 建立数据模型
		Map root = new HashMap();
		root.put("message", "hello world");
		root.put("name", "尼玛");
		// root.put("personList", list);

		// 获取模板文件
		Template t = cfg.getTemplate("test.ftl");

		// 开始准备生成输出
		// - 使用模板文件的Charset作为本页面的charset
		// - 使用text/html MIME-type
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setContentType("text/html; charset=" + t.getEncoding());
		Writer out = response.getWriter();
		// 合并数据模型和模板，并将结果输出到out中
		try {
			t.process(root, out); // 往模板里写数据
		} catch (TemplateException e) {
			e.printStackTrace();
		}
	}
}
