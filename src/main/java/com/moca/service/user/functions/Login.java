package com.moca.service.user.functions;

import com.moca.common.base.Function;
import com.moca.service.user.dto.BaseUser;
import com.moca.service.user.req.LoginReq;
import org.springframework.stereotype.Component;

@Component(value = "login")
public class Login implements Function<LoginReq, BaseUser> {
    @Override
    public BaseUser handle(LoginReq param) {

        return null;
    }
}
