package aop.jikexueyuan.spring.aop.cglib;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


public class CGLibProxyFactory implements MethodInterceptor{
	private Object object;
	
	public Object createStudent(Object object){
		this.object = object;
		System.out.println(((StudentBean) object).getName());
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(object.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		StudentBean stu = (StudentBean) object;
		Object result = null;
		if (stu.getName()!=null) {
			result = methodProxy.invoke(object, args);  
		}else {
			System.out.println("该方法已被拦截");
		}
		
		return result;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
