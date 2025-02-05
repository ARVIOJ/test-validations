package com.trainibit.test_validations.mapper;

import com.trainibit.test_validations.entity.UserData;
import com.trainibit.test_validations.request.UserDataRequestKafka;

public interface UserDataMapper {
    UserData requestToEntity(UserDataRequestKafka userDataRequestKafka);
}
