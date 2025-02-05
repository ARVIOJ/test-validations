package com.trainibit.test_validations.mapper.impl;

import com.trainibit.test_validations.entity.UserData;
import com.trainibit.test_validations.mapper.UserDataMapper;
import com.trainibit.test_validations.request.UserDataRequestKafka;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserDataMapperImpl implements UserDataMapper {
    @Override
    public UserData requestToEntity(UserDataRequestKafka userDataRequestKafka) {
        UserData userData = new UserData();
        userData.setEmail(userDataRequestKafka.getEmail());
        userData.setUuid(userDataRequestKafka.getUuid());
        userData.setTemplateUuid(userDataRequestKafka.getTemplateUuid());
        userData.setToken(userDataRequestKafka.getToken());
        return userData;
    }
}
