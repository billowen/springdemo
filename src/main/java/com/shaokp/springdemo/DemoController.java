package com.shaokp.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DemoController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/getData")
    public @ResponseBody
    List<Lot> getLotData(@RequestParam(value = "page" , required = false) Integer page) {
        List<Lot> list = new ArrayList<>();
        if (page == null) {
            list.add(new Lot("lot1", 1000, 900, 0.9));
            list.add(new Lot("lot2", 2000, 1900, 0.95));
        }
        else {
            list.add(new Lot("lot3", 100, 95, 0.95));
            list.add(new Lot("lot4", 100, 85, 0.85));
        }

        return list;
    }
}
