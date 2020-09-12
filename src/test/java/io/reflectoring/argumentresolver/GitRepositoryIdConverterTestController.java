package io.reflectoring.argumentresolver;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.web.bind.annotation.*;

@RestController
class GitRepositoryIdConverterTestController {

  @GetMapping("/repositories/{repositoryId}")
  String getRepository(@PathVariable("repositoryId") GitRepositoryId gitRepositoryId) {
    assertThat(gitRepositoryId).isNotNull();
    return "test";
  }

  @PostMapping("/repositories/{repositoryId}")
  String postRepository(@PathVariable("repositoryId") GitRepositoryId gitRepositoryId) {
    assertThat(gitRepositoryId).isNotNull();
    return "Post";
  }

}
