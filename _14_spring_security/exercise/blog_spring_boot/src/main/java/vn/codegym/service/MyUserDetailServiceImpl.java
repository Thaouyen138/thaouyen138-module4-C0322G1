package vn.codegym.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.codegym.model.MyUserDetail;
import vn.codegym.model.User;
import vn.codegym.repository.IUserRepository;

@Service
public class MyUserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private IUserRepository iUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = iUserRepository.findByName(username);
        if (user == null) {
            throw new UsernameNotFoundException("user name :" + username + "not found");
        }
        return new MyUserDetail(user);
    }
}
