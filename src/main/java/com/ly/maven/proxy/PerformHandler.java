package com.ly.maven.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.eclipse.jdt.internal.compiler.ast.SynchronizedStatement;

import com.sun.tracing.dtrace.ArgsAttributes;

public class PerformHandler implements InvocationHandler {
	private Object target;

	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	

	public PerformHandler(Object target) {
		super();
		this.target = target;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("方法被触发");
		Object invoke = method.invoke(target,args);
		System.out.println("执行完毕了");
		return invoke;
	}

}
