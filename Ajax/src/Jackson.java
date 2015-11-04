import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Jackson {
	
	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException {
		
		UserBean user=new UserBean();
		user.setAge("21");
		user.setName("何鹏");
		
		List<UserBean> users=new ArrayList<UserBean>();
		users.add(new UserBean("离散","哈哈"));
		users.add(new UserBean("离散","哈哈"));
		//导入jar包
		ObjectMapper mapper=new ObjectMapper();
		//调用mapper的writeValueAsString(Object)方法将一个对象或者方法转换为字符串
		String json=mapper.writeValueAsString(user);
		//jackson使用getter方法来定义JSON对象的属性
		System.out.println(json);
		//通过添加注解@JsonIgnore忽略某个getter定义的属性
		String json2=mapper.writeValueAsString(users);
		System.out.println(json2);
	}
}
