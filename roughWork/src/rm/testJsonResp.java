package rm;

import org.json.JSONArray;
import org.json.JSONObject;

public class testJsonResp {

	public static void main(String[] args) {
		JSONObject apiResponseJSON = new JSONObject("{\n" +
                "  \"approvalRequestInstances\": [\n" +
                "    {\n" +
                "      \"instanceId\": \"ParentPortal_1233_002cfe26-df03-47f9-8726-2f97194d123e\",\n" +
                "      \"createdTimeInUTC\": \"2021-07-02T07:07:51.4514761Z\",\n" +
                "      \"lastUpdatedTimeInUTC\": \"2021-07-02T07:07:52.1822261Z\",\n" +
                "      \"inputInJsonString\": \"{\\\"SourceModule\\\":\\\"ParentPortal\\\",\\\"TargetModule\\\":\\\"Integris\\\",\\\"EstablishmentId\\\":\\\"1233\\\",\\\"Metadata\\\":\\\"{\\\\\\\"Type\\\\\\\":\\\\\\\"MobilePhone\\\\\\\",\\\\\\\"OldValue\\\\\\\":\\\\\\\"12345\\\\\\\",\\\\\\\"NewValue\\\\\\\":\\\\\\\"9887\\\\\\\",\\\\\\\"Email\\\\\\\":\\\\\\\"jojacob@in.rm.com\\\\\\\"}\\\",\\\"RequestedBy\\\":\\\"John\\\"}\",\n" +
                "      \"status\": \"In Progress\",\n" +
                "      \"approvalHistory\": null\n" +
                "    },\n" +
                "    {\n" +
                "      \"instanceId\": \"ParentPortal_1233_eec94c0e-b8f8-40c0-9109-3e08cc7182ff\",\n" +
                "      \"createdTimeInUTC\": \"2021-07-02T07:08:13.2188417Z\",\n" +
                "      \"lastUpdatedTimeInUTC\": \"2021-07-02T07:08:13.314974Z\",\n" +
                "      \"inputInJsonString\": \"{\\\"SourceModule\\\":\\\"ParentPortal\\\",\\\"TargetModule\\\":\\\"Integris\\\",\\\"EstablishmentId\\\":\\\"1233\\\",\\\"Metadata\\\":\\\"{\\\\\\\"Type\\\\\\\":\\\\\\\"MobilePhone\\\\\\\",\\\\\\\"OldValue\\\\\\\":\\\\\\\"12345\\\\\\\",\\\\\\\"NewValue\\\\\\\":\\\\\\\"9887\\\\\\\",\\\\\\\"Email\\\\\\\":\\\\\\\"jojacob@in.rm.com\\\\\\\"}\\\",\\\"RequestedBy\\\":\\\"John\\\"}\",\n" +
                "      \"status\": \"In Progress\",\n" +
                "      \"approvalHistory\": null\n" +
                "    }\n" +
                "  ],\n" +
                "  \"continuationToken\": null\n" +
                "}");
		JSONArray responseArray=apiResponseJSON.getJSONArray("approvalRequestInstances");
		if(responseArray.length()>0) {
			System.out.println("true");
		}

	}

}
