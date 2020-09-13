package io.reflectoring.argumentresolver;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class UserConverter implements Converter<UserVO, User> {
    @Override
    public User convert(UserVO source) {
        return new User(source.getName(), source.getAge());
    }
}
