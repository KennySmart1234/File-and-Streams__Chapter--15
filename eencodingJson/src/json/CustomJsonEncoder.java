package json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomJsonEncoder {
    public static String serializeToJson(Product product) throws JsonSerialiazationException {

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(product);
        } catch (JsonProcessingException exception) {
            exception.printStackTrace();
            throw new JsonSerialiazationException(
                    String.format("failed to encode product to json\nreason: %s",
                            exception.getMessage())
            );

        }
    }

    public static Product deserializeToJson(String json) throws JsonSerialiazationException {
        try {

            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json, Product.class);
        }catch(JsonProcessingException exception){
            exception.printStackTrace();
            throw new JsonSerialiazationException(exception.getMessage());
        }
    }
}
