package com.sdfteam.d3armory.functionaltest;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.junit.Before;
import org.junit.Test;

import com.google.gson.Gson;
import com.sdfteam.d3armory.config.TestConfig;
import com.sdfteam.d3armory.domain.equip.ItemDetail;
import com.sdfteam.d3armory.service.configuration.Configuration;
import com.sdfteam.d3armory.service.remote.RemoteService;
import com.sdfteam.d3armory.service.remote.ServiceFactory;

public class ItemDetailTest {

	private Configuration configuration;

	@Before
	public void setUp() {
		configuration = new Configuration();
		configuration.setBattleTag(TestConfig.TAG_NAME);
		configuration.setBattleTagCode(TestConfig.TAG_CODE);
		configuration.setHost(TestConfig.SERVER_HOST);
		configuration.setItemData("Cl4IzcGwYRIHCAQVq8e63x0eF1qjHYYCY-odPSsOiB11sezwHY-8lrcdgbU-jDAJONsBQABQEmD9AWokCgwIABCGhJKXhICAwA0SFAjozew4EgcIBBW1XbZ6MAk4AEABGKnhqYQEUAZYAKABqeGphAQ");
	}

	@Test
	public void testGsonFromWeb() throws IllegalAccessException, IOException,
			InvocationTargetException, NoSuchMethodException {
		ServiceFactory serviceFactory = new ServiceFactory();
		RemoteService<ItemDetail> itemDetailService = serviceFactory
				.getService(ItemDetail.class);
		ItemDetail itemDetail = itemDetailService.receiveEntity(configuration);
		System.out.println(new Gson().toJson(itemDetail));
	}

}
