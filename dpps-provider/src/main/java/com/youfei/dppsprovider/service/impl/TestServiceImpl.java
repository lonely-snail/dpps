package com.youfei.dppsprovider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.youfei.dppsprovider.service.TestService;

/**
 * @author songjinping
 * @param
 */
@Service
public class TestServiceImpl implements TestService {

  @Override
  public String sayHello(String name){

    return "Hello "+name;
  }
}
