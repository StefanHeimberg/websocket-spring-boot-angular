package ch.stefanheimberg.example.service.greeting;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Greeting {

    @NonNull
    private final String content;

}
