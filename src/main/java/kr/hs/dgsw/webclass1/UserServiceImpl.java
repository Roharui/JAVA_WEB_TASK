

package kr.hs.dgsw.webclass1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    List<User> lst;
    public UserServiceImpl(){
        lst  = new ArrayList<User>();
        lst.add(new User("user1","우효림","test@example"));
    }

    @Override
    public List<User> list() {
        //리스트를 리턴하는 메소드
        return this.lst;
    }

    @Override
    public User view(String id) {
        //특정 유저를 찾는 메소드
        for(User item : this.lst){
            if(item.getId().equals(id)){
                return item;
            }
        }

        return null;
    }

    @Override
    public boolean add(User user) {
        //유저를 추가하는 메소드
        this.lst.add(user);
        return true;
    }

    @Override
    public User update(User user) {
        //유저를 갱신하는 메소드
        User u = this.view(user.getId());
        if(u != null){
            u.setName(user.getName());
            u.setEmail(user.getEmail());
        }
        return u;
    }

    @Override
    public boolean delete(String id) {
        //유저를 제거하는 메소드
        User u = this.view(id);
        return this.lst.remove(u);
    }
    
}