package es.bne.webapp.service;

import org.springframework.stereotype.Service;

import es.bne.webapp.persist.entity.User;
import es.bne.webapp.service.dto.UserDto;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, UserDto, Long> implements UserService {


}
