package com.pinde.sci.enums.edc;

import com.pinde.core.commom.GeneralEnum;
import com.pinde.core.util.EnumUtil;

public enum EdcBlindTypeEnum implements GeneralEnum<String> {
	
	Blind("Y","ä��"),
	NotBlind("N","��ä��"),
	;

	private final String id;
	private final String name;
	
	EdcBlindTypeEnum(String id,String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public String getName() {
		return name;
	}

	public static String getNameById(String id) {
		return EnumUtil.getById(id, EdcBlindTypeEnum.class).getName();
	}
}
