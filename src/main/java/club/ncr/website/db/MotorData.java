package club.ncr.website.db;

import club.ncr.website.db.auto._MotorData;
import util.json.JsonObject;
import util.json.JsonValue;

public class MotorData extends _MotorData {

	public JsonValue toJsonValue() {
		
		JsonObject json= new JsonObject();
		
		json.set("tc-info-url", getInfoUrl());
		json.set("tc-data-url", getDataUrl());
		
		json.set("format", getFormat().getName());
		// json.set("file-extension", getFormat().getFileExtension());
		
		json.set("source", getSource());
		json.set("tc-id", getTcFileID());
		
		return json;
		
	}

}
