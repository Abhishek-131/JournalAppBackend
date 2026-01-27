package net.engineeringdigest.journalApp.service;


import net.engineeringdigest.journalApp.entity.User;
import net.engineeringdigest.journalApp.repository.UserRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserRepository userRepository;

    //Get All the Data
    public List<User> getAll(){
        return userRepository.findAll();
    }

    //Post the Data
    public void saveEntry(User user){
            userRepository.save(user);
    }

    // Get Data By id
    public Optional<User> findById(ObjectId id){
            return userRepository.findById(id);
    }

    // Delete By id
    public void deleteById(ObjectId id){
        userRepository.deleteById(id);
    }

    // Update By id
    public User findByUserName(String userName){
        return userRepository.findByUserName(userName);
    }
}
