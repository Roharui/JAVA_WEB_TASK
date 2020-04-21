package kr.hs.dgsw.webclass1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/calc")
    public String greeting(@RequestParam final String one, 
                            @RequestParam final String two,
                            @RequestParam final String operator)
    {
        int x = Integer.parseInt(one);
        int y = Integer.parseInt(two);

        return Integer.toString(operator(x, y, operator));
    }

    @GetMapping("/calc1/{one}/{two}/{oper}")
    public String greeting1(@PathVariable final String one,
                             @PathVariable final String two,
                             @PathVariable final String oper)
    {
        int x = Integer.parseInt(one);
        int y = Integer.parseInt(two);

        return Integer.toString(operator(x, y, oper));
    }

    private int operator(int one, int two, String oper)
    {

        if(oper == "p"){
            return one + two;
        }
        else if(oper == "m"){
            return one - two;
        }else if(oper == "t"){
            return one * two;
        }else if(oper == "d"){
            return one / two;
        }else{
            return one + two;
        }
    }
}