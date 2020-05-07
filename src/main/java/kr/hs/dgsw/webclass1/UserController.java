package kr.hs.dgsw.webclass1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/user")
    @ResponseBody
    public List<User> list(){
        //유저 리스트
        return userService.list();
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public User view(@PathVariable String id){
        //유저
        return userService.view(id);
    }

    @PostMapping("/user")
    @ResponseBody
    public Boolean add(@RequestBody User user){
        //유저 추가
        return userService.add(user);
    }

    @PutMapping("/user")
    @ResponseBody
    public User update(@RequestBody User user){
        //유저 갱신
        return userService.update(user);
    }

    @DeleteMapping("/user/{id}")
    @ResponseBody
    public Boolean delete(@PathVariable String id){
        //유저 제거
        return userService.delete(id);
    }
    
}
// CRLD Create Read   Update Delete
// SQL  insert select update delete
// HTTP POST   GET    PUT    DELETE