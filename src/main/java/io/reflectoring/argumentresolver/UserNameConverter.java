package io.reflectoring.argumentresolver;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserNameConverter implements Converter<String, User> {
    @Override
    public User convert(String source) {
        return new User(source, 32);
    }
}
