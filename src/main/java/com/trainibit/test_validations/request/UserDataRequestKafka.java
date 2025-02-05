package com.trainibit.test_validations.request;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserDataRequestKafka {
    private String Token;
    private UUID templateUuid;
    private UUID uuid;
    private String email;
}
