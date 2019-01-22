/***********************************************************************
 *********************************CONFIDENTIAL**************************
 ***********************************************************************/

package com.springpagination.controller;

import com.springpagination.adapter.PageWrapper;
import com.springpagination.domain.Actor;
import com.springpagination.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@Controller
public class ActorController {

    private static final int BUTTONS_TO_SHOW = 5;
    private static final int INITIAL_PAGE = 0;
    private static final int INITIAL_PAGE_SIZE = 5;
    private static final int[] PAGE_SIZES = {5, 10, 20};


    @Autowired
    private ActorService actorService;

    @GetMapping("/")
    public String allActors(Model model, @RequestParam(defaultValue = "0") int page){
        model.addAttribute("actors" , actorService
                .listAllActorsPageable(PageRequest.of(page, 10, Sort.Direction.ASC, "lastUpdate")));
        return "index";
    }
}
