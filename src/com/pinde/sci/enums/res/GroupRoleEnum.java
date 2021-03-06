package com.pinde.sci.enums.res;

import com.pinde.core.commom.GeneralEnum;
import com.pinde.core.util.EnumUtil;

public enum GroupRoleEnum implements GeneralEnum<String> {
	Leader("Leader","�鳤")
	;

	private final String id;
	private final String name;
	
	GroupRoleEnum(String id,String name) {
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
		return EnumUtil.getById(id, GroupRoleEnum.class).getName();
	}
}
