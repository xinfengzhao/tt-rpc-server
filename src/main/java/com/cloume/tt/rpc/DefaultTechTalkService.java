package com.cloume.tt.rpc;

import org.springframework.stereotype.Service;

import com.cloume.tt.rpc.service.TechTalkService;
import com.googlecode.jsonrpc4j.spring.AutoJsonRpcServiceImpl;

@AutoJsonRpcServiceImpl
@Service
public class DefaultTechTalkService implements TechTalkService {

	@Override
	public String sayHelloTo(String name) {
		String helloTo = String.format("hello! %s", name);
		System.out.println(helloTo);
		return helloTo;
	}
	
}
