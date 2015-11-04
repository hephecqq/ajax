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
		user.setName("����");
		
		List<UserBean> users=new ArrayList<UserBean>();
		users.add(new UserBean("��ɢ","����"));
		users.add(new UserBean("��ɢ","����"));
		//����jar��
		ObjectMapper mapper=new ObjectMapper();
		//����mapper��writeValueAsString(Object)������һ��������߷���ת��Ϊ�ַ���
		String json=mapper.writeValueAsString(user);
		//jacksonʹ��getter����������JSON���������
		System.out.println(json);
		//ͨ�����ע��@JsonIgnore����ĳ��getter���������
		String json2=mapper.writeValueAsString(users);
		System.out.println(json2);
	}
}
