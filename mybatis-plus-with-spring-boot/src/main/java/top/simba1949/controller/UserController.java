package top.simba1949.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.simba1949.domain.UserEntity;
import top.simba1949.service.UserService;

import java.util.List;

/**
 * @author anthony
 * @date 2023/3/29
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public int insert(@RequestBody UserEntity userEntity){
        return userService.insert(userEntity);
    }

    @PutMapping
    public int update(@RequestBody UserEntity userEntity){
        return userService.update(userEntity);
    }

    @DeleteMapping("{id}")
    public int delete(@PathVariable("id") long id){
        return userService.delete(id);
    }

    @GetMapping("{id}")
    public UserEntity get(@PathVariable("id") long id){
        return userService.get(id);
    }

    @GetMapping("list")
    public List<UserEntity> list(){
        return userService.list();
    }
}
