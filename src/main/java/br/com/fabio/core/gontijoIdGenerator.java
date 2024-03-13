package br.com.fabio.core;

import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.UUID;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class gontijoIdGenerator {

	public static String generateId() {
		return UUID.randomUUID().toString();
	}

	public static String generatedSlowId() {
		return RandomStringUtils.random(14, true, true);
	}

}
