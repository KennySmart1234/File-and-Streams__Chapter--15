import json.CustomJsonEncoder;
import json.JsonSerialiazationException;
import json.Product;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class CustomJsonEncoderTest {

    @Test
    public void testCanSerializeToJson() {
        try {
            Product product = new Product();
            product.setName("Iphone 20");
            product.setDescription("a london-used very, very new iphone 20");
            product.setPrice(new BigDecimal(2_000_000));
            product.setQuantity(100);
            String json = CustomJsonEncoder.serializeToJson(product);
            String expected = "{\"name\":\"Iphone 20\",\"description\":\"a london-used very, very new iphone 20\",\"price\":2000000,\"quantity\":100}";            assertEquals(expected, json);
        }catch (JsonSerialiazationException exception) {
            exception.printStackTrace();
        }
    }



    @Test
    public void testCanDeserializeFromJson() {
        try {
            String json = "{\"name\":\"KennySmart\",\"description\":\"a london-used very, very new KennySmart 20\",\"price\":2000000,\"quantity\":100}";
            Product product = CustomJsonEncoder.deserializeToJson(json);
            System.out.println(product);
            assertNotNull(product);
            assertEquals("KennySmart", product.getName());
            assertEquals("a london-used very, very new KennySmart 20", product.getDescription());
            assertEquals(new BigDecimal(2000000), product.getPrice());
            assertEquals(100, product.getQuantity());
        }catch(JsonSerialiazationException exception){
            exception.printStackTrace();
        }

    }

}
