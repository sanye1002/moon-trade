package cn.moon.trade.common.util.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

/**
 * @Author zhaoxiang
 * @Date 2019/01/14
 * @Desc Integer转换为Bool
 */
public class Integer2BoolSerializer extends JsonSerializer<Integer> {

    @Override
    public void serialize(Integer integer, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
    }
}
