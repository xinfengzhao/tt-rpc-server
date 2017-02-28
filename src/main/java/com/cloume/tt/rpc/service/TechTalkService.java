package com.cloume.tt.rpc.service;

import com.googlecode.jsonrpc4j.JsonRpcService;

@JsonRpcService("/techTalkService.json")
public interface TechTalkService {
	String sayHelloTo(String name);
}
