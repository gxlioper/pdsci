package com.pinde.sci.enums.gcp;

import com.pinde.core.commom.GeneralEnum;
import com.pinde.core.util.EnumUtil;

public enum GcpContractTypeEnum implements GeneralEnum<String> {
	
	TwoSides ("TwoSides" , "双方合同"),
	Tripartite("Tripartite" , "三方合同")
	;

	private final String id;
	private final String name;
	
	GcpContractTypeEnum(String id,String name) {
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
		return EnumUtil.getById(id, GcpContractTypeEnum.class).getName();
	}
}
