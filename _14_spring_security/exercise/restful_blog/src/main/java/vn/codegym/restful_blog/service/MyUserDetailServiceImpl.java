package vn.codegym.restful_blog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import vn.codegym.restful_blog.model.MyUserDetail;
import vn.codegym.restful_blog.model.User;
import vn.codegym.restful_blog.repository.IUserRepository;

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
