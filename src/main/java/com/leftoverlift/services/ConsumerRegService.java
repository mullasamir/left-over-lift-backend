package com.leftoverlift.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leftoverlift.dao.ConsumerRegDao;
import com.leftoverlift.dto.ConsumerRegRequest;
import com.leftoverlift.dto.ConsumerRegResponse;
import com.leftoverlift.entity.Consumers;

@Component
public class ConsumerRegService {

	@Autowired
	ConsumerRegDao consumerDao;

	public ConsumerRegResponse ConsumerReg(ConsumerRegRequest consumerbody) throws Exception {

		Consumers consumer = new Consumers();
		consumer.setFullName(consumerbody.getFullName());
		consumer.setEmail(consumerbody.getEmail());
		consumer.setPassword(consumerbody.getPassword());

		Consumers insertConsumers = consumerDao.save(consumer);

		ConsumerRegResponse response = new ConsumerRegResponse();
		response.setConsumerId(insertConsumers.getConsumerId());
		response.setErrCode("0000");
		response.setMessage("Consumer Registered Sucessfully...");
		response.setRequest(consumerbody);

		return response;
	}

}
