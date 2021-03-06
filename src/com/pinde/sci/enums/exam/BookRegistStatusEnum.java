package com.pinde.sci.enums.exam;

import com.pinde.core.commom.GeneralEnum;
import com.pinde.core.util.EnumUtil;

public enum BookRegistStatusEnum implements GeneralEnum<String> {
	
	Scan("Scan","ɨ��"),
	Recognize("Recognize","ʶ��"),
	Compos("Compos","�Ű�"),
	;

	private final String id;
	private final String name;
	
	BookRegistStatusEnum(String id,String name) {
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
		return EnumUtil.getById(id, BookImpStatusEnum.class).getName();
	}
}
