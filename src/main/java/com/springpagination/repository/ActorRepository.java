/***********************************************************************
 *********************************CONFIDENTIAL**************************
 ***********************************************************************/

package com.springpagination.repository;

import com.springpagination.domain.Actor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends PagingAndSortingRepository<Actor, Integer> {
}
