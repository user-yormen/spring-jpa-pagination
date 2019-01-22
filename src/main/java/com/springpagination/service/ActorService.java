/***********************************************************************
 *********************************CONFIDENTIAL**************************
 ***********************************************************************/

package com.springpagination.service;

import com.springpagination.domain.Actor;
import com.springpagination.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {
    @Autowired
    ActorRepository actorRepository;

    public Page<Actor> listAllActorsPageable(Pageable pageable){
        return actorRepository.findAll(pageable);
    }
}
