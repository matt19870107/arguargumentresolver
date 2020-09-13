package io.reflectoring.argumentresolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.web.bind.annotation.*;

import static org.assertj.core.api.Assertions.assertThat;

@RestController
public class UserConverterTestController {

    @Autowired
    ConversionService conversionService;

    @PostMapping("/User")
    String postUser(@RequestBody UserVO uservo) {
        assertThat(uservo).isNotNull();
        User user = conversionService.convert(uservo, User.class);
        return "User";
    }

    @GetMapping("/User")
    String getUser(@RequestParam("name") User user) {
        assertThat(user).isNotNull();
        return "User";
    }
}
